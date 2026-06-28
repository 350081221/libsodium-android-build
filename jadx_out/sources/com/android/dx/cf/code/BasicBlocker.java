package com.android.dx.cf.code;

import com.android.dx.cf.code.ByteCatchList;
import com.android.dx.cf.code.BytecodeArray;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstInvokeDynamic;
import com.android.dx.rop.cst.CstMemberRef;
import com.android.dx.rop.cst.CstMethodHandle;
import com.android.dx.rop.cst.CstProtoRef;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.type.Type;
import com.android.dx.util.Bits;
import com.android.dx.util.IntList;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class BasicBlocker implements BytecodeArray.Visitor {
    private final int[] blockSet;
    private final ByteCatchList[] catchLists;
    private final int[] liveSet;
    private final ConcreteMethod method;
    private int previousOffset;
    private final IntList[] targetLists;
    private final int[] workSet;

    private BasicBlocker(ConcreteMethod concreteMethod) {
        if (concreteMethod != null) {
            this.method = concreteMethod;
            int size = concreteMethod.getCode().size() + 1;
            this.workSet = Bits.makeBitSet(size);
            this.liveSet = Bits.makeBitSet(size);
            this.blockSet = Bits.makeBitSet(size);
            this.targetLists = new IntList[size];
            this.catchLists = new ByteCatchList[size];
            this.previousOffset = -1;
            return;
        }
        throw new NullPointerException("method == null");
    }

    private void addWorkIfNecessary(int i5, boolean z4) {
        if (!Bits.get(this.liveSet, i5)) {
            Bits.set(this.workSet, i5);
        }
        if (z4) {
            Bits.set(this.blockSet, i5);
        }
    }

    private void doit() {
        BytecodeArray code = this.method.getCode();
        ByteCatchList catches = this.method.getCatches();
        int size = catches.size();
        Bits.set(this.workSet, 0);
        Bits.set(this.blockSet, 0);
        while (!Bits.isEmpty(this.workSet)) {
            try {
                code.processWorkSet(this.workSet, this);
                for (int i5 = 0; i5 < size; i5++) {
                    ByteCatchList.Item item = catches.get(i5);
                    int startPc = item.getStartPc();
                    int endPc = item.getEndPc();
                    if (Bits.anyInRange(this.liveSet, startPc, endPc)) {
                        Bits.set(this.blockSet, startPc);
                        Bits.set(this.blockSet, endPc);
                        addWorkIfNecessary(item.getHandlerPc(), true);
                    }
                }
            } catch (IllegalArgumentException e5) {
                throw new SimException("flow of control falls off end of method", e5);
            }
        }
    }

    private ByteBlockList getBlockList() {
        ByteCatchList byteCatchList;
        IntList intList;
        ByteBlock[] byteBlockArr = new ByteBlock[this.method.getCode().size()];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int findFirst = Bits.findFirst(this.blockSet, i5 + 1);
            if (findFirst < 0) {
                break;
            }
            if (Bits.get(this.liveSet, i5)) {
                int i7 = findFirst - 1;
                IntList intList2 = null;
                while (true) {
                    if (i7 >= i5) {
                        intList2 = this.targetLists[i7];
                        if (intList2 != null) {
                            break;
                        }
                        i7--;
                    } else {
                        i7 = -1;
                        break;
                    }
                }
                if (intList2 == null) {
                    intList = IntList.makeImmutable(findFirst);
                    byteCatchList = ByteCatchList.EMPTY;
                } else {
                    ByteCatchList byteCatchList2 = this.catchLists[i7];
                    if (byteCatchList2 == null) {
                        byteCatchList2 = ByteCatchList.EMPTY;
                    }
                    byteCatchList = byteCatchList2;
                    intList = intList2;
                }
                byteBlockArr[i6] = new ByteBlock(i5, i5, findFirst, intList, byteCatchList);
                i6++;
            }
            i5 = findFirst;
        }
        ByteBlockList byteBlockList = new ByteBlockList(i6);
        for (int i8 = 0; i8 < i6; i8++) {
            byteBlockList.set(i8, byteBlockArr[i8]);
        }
        return byteBlockList;
    }

    public static ByteBlockList identifyBlocks(ConcreteMethod concreteMethod) {
        BasicBlocker basicBlocker = new BasicBlocker(concreteMethod);
        basicBlocker.doit();
        return basicBlocker.getBlockList();
    }

    private void visitCommon(int i5, int i6, boolean z4) {
        Bits.set(this.liveSet, i5);
        if (z4) {
            addWorkIfNecessary(i5 + i6, false);
        } else {
            Bits.set(this.blockSet, i5 + i6);
        }
    }

    private void visitThrowing(int i5, int i6, boolean z4) {
        int i7 = i6 + i5;
        if (z4) {
            addWorkIfNecessary(i7, true);
        }
        ByteCatchList listFor = this.method.getCatches().listFor(i5);
        this.catchLists[i5] = listFor;
        IntList[] intListArr = this.targetLists;
        if (!z4) {
            i7 = -1;
        }
        intListArr[i5] = listFor.toTargetList(i7);
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public int getPreviousOffset() {
        return this.previousOffset;
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void setPreviousOffset(int i5) {
        this.previousOffset = i5;
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitBranch(int i5, int i6, int i7, int i8) {
        if (i5 != 167) {
            if (i5 == 168) {
                addWorkIfNecessary(i6, true);
            }
            int i9 = i6 + i7;
            visitCommon(i6, i7, true);
            addWorkIfNecessary(i9, true);
            this.targetLists[i6] = IntList.makeImmutable(i9, i8);
        } else {
            visitCommon(i6, i7, false);
            this.targetLists[i6] = IntList.makeImmutable(i8);
        }
        addWorkIfNecessary(i8, true);
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitConstant(int i5, int i6, int i7, Constant constant, int i8) {
        visitCommon(i6, i7, true);
        if ((constant instanceof CstMemberRef) || (constant instanceof CstType) || (constant instanceof CstString) || (constant instanceof CstInvokeDynamic) || (constant instanceof CstMethodHandle) || (constant instanceof CstProtoRef)) {
            visitThrowing(i6, i7, true);
        }
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitInvalid(int i5, int i6, int i7) {
        visitCommon(i6, i7, true);
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitLocal(int i5, int i6, int i7, int i8, Type type, int i9) {
        if (i5 == 169) {
            visitCommon(i6, i7, false);
            this.targetLists[i6] = IntList.EMPTY;
        } else {
            visitCommon(i6, i7, true);
        }
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitNewarray(int i5, int i6, CstType cstType, ArrayList<Constant> arrayList) {
        visitCommon(i5, i6, true);
        visitThrowing(i5, i6, true);
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitNoArgs(int i5, int i6, int i7, Type type) {
        if (i5 != 108 && i5 != 112) {
            if (i5 != 172 && i5 != 177) {
                if (i5 != 190) {
                    if (i5 != 191) {
                        if (i5 != 194 && i5 != 195) {
                            switch (i5) {
                                case 46:
                                case 47:
                                case 48:
                                case 49:
                                case 50:
                                case 51:
                                case 52:
                                case 53:
                                    break;
                                default:
                                    switch (i5) {
                                        case 79:
                                        case 80:
                                        case 81:
                                        case 82:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                            break;
                                        default:
                                            visitCommon(i6, i7, true);
                                            return;
                                    }
                            }
                        }
                    } else {
                        visitCommon(i6, i7, false);
                        visitThrowing(i6, i7, false);
                        return;
                    }
                }
                visitCommon(i6, i7, true);
                visitThrowing(i6, i7, true);
                return;
            }
            visitCommon(i6, i7, false);
            this.targetLists[i6] = IntList.EMPTY;
            return;
        }
        visitCommon(i6, i7, true);
        if (type == Type.INT || type == Type.LONG) {
            visitThrowing(i6, i7, true);
        }
    }

    @Override // com.android.dx.cf.code.BytecodeArray.Visitor
    public void visitSwitch(int i5, int i6, int i7, SwitchList switchList, int i8) {
        visitCommon(i6, i7, false);
        addWorkIfNecessary(switchList.getDefaultTarget(), true);
        int size = switchList.size();
        for (int i9 = 0; i9 < size; i9++) {
            addWorkIfNecessary(switchList.getTarget(i9), true);
        }
        this.targetLists[i6] = switchList.getTargets();
    }
}
