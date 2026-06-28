package com.android.dx.cf.code;

import com.android.dx.cf.iface.Method;
import com.android.dx.cf.iface.MethodList;
import com.android.dx.rop.code.AccessFlags;
import com.android.dx.rop.code.Insn;
import com.android.dx.rop.code.InvokePolymorphicInsn;
import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.Rop;
import com.android.dx.rop.code.SourcePosition;
import com.android.dx.rop.code.TranslationAdvice;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstMethodRef;
import com.android.dx.rop.cst.CstNat;
import com.android.dx.rop.cst.CstString;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.type.Type;
import com.android.dx.rop.type.TypeList;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class RopperMachine extends ValueAwareMachine {
    private static final CstType ARRAY_REFLECT_TYPE;
    private static final CstMethodRef MULTIANEWARRAY_METHOD;
    private final TranslationAdvice advice;
    private boolean blockCanThrow;
    private TypeList catches;
    private boolean catchesUsed;
    private int extraBlockCount;
    private boolean hasJsr;
    private final ArrayList<Insn> insns;
    private final int maxLocals;
    private final ConcreteMethod method;
    private final MethodList methods;
    private int primarySuccessorIndex;
    private ReturnAddress returnAddress;
    private Rop returnOp;
    private SourcePosition returnPosition;
    private boolean returns;
    private final Ropper ropper;

    static {
        CstType cstType = new CstType(Type.internClassName("java/lang/reflect/Array"));
        ARRAY_REFLECT_TYPE = cstType;
        MULTIANEWARRAY_METHOD = new CstMethodRef(cstType, new CstNat(new CstString("newInstance"), new CstString("(Ljava/lang/Class;[I)Ljava/lang/Object;")));
    }

    public RopperMachine(Ropper ropper, ConcreteMethod concreteMethod, TranslationAdvice translationAdvice, MethodList methodList) {
        super(concreteMethod.getEffectiveDescriptor());
        if (methodList != null) {
            if (ropper != null) {
                if (translationAdvice != null) {
                    this.ropper = ropper;
                    this.method = concreteMethod;
                    this.methods = methodList;
                    this.advice = translationAdvice;
                    this.maxLocals = concreteMethod.getMaxLocals();
                    this.insns = new ArrayList<>(25);
                    this.catches = null;
                    this.catchesUsed = false;
                    this.returns = false;
                    this.primarySuccessorIndex = -1;
                    this.extraBlockCount = 0;
                    this.blockCanThrow = false;
                    this.returnOp = null;
                    this.returnPosition = null;
                    return;
                }
                throw new NullPointerException("advice == null");
            }
            throw new NullPointerException("ropper == null");
        }
        throw new NullPointerException("methods == null");
    }

    private RegisterSpecList getSources(int i5, int i6) {
        RegisterSpecList registerSpecList;
        int argCount = argCount();
        if (argCount == 0) {
            return RegisterSpecList.EMPTY;
        }
        int localIndex = getLocalIndex();
        if (localIndex >= 0) {
            registerSpecList = new RegisterSpecList(1);
            registerSpecList.set(0, RegisterSpec.make(localIndex, arg(0)));
        } else {
            RegisterSpecList registerSpecList2 = new RegisterSpecList(argCount);
            for (int i7 = 0; i7 < argCount; i7++) {
                RegisterSpec make = RegisterSpec.make(i6, arg(i7));
                registerSpecList2.set(i7, make);
                i6 += make.getCategory();
            }
            if (i5 != 79) {
                if (i5 == 181) {
                    if (argCount == 2) {
                        RegisterSpec registerSpec = registerSpecList2.get(0);
                        registerSpecList2.set(0, registerSpecList2.get(1));
                        registerSpecList2.set(1, registerSpec);
                    } else {
                        throw new RuntimeException("shouldn't happen");
                    }
                }
            } else if (argCount == 3) {
                RegisterSpec registerSpec2 = registerSpecList2.get(0);
                RegisterSpec registerSpec3 = registerSpecList2.get(1);
                registerSpecList2.set(0, registerSpecList2.get(2));
                registerSpecList2.set(1, registerSpec2);
                registerSpecList2.set(2, registerSpec3);
            } else {
                throw new RuntimeException("shouldn't happen");
            }
            registerSpecList = registerSpecList2;
        }
        registerSpecList.setImmutable();
        return registerSpecList;
    }

    private int jopToRopOpcode(int i5, Constant constant) {
        if (i5 != 0) {
            if (i5 != 20) {
                if (i5 != 21) {
                    if (i5 != 171) {
                        if (i5 != 172) {
                            if (i5 != 198) {
                                if (i5 == 199) {
                                    return 8;
                                }
                                switch (i5) {
                                    case 0:
                                        return 1;
                                    case 18:
                                        return 5;
                                    case 46:
                                        return 38;
                                    case 54:
                                        return 2;
                                    case 79:
                                        return 39;
                                    case 96:
                                        return 14;
                                    case 100:
                                        return 15;
                                    case 104:
                                        return 16;
                                    case 108:
                                        return 17;
                                    case 112:
                                        return 18;
                                    case 116:
                                        return 19;
                                    case 120:
                                        return 23;
                                    case 122:
                                        return 24;
                                    case 124:
                                        return 25;
                                    case 126:
                                        return 20;
                                    case 128:
                                        return 21;
                                    case 130:
                                        return 22;
                                    default:
                                        switch (i5) {
                                            case 132:
                                                return 14;
                                            case 133:
                                            case 134:
                                            case 135:
                                            case 136:
                                            case 137:
                                            case 138:
                                            case 139:
                                            case 140:
                                            case 141:
                                            case 142:
                                            case 143:
                                            case 144:
                                                return 29;
                                            case 145:
                                                return 30;
                                            case 146:
                                                return 31;
                                            case 147:
                                                return 32;
                                            case 148:
                                            case 149:
                                            case 151:
                                                return 27;
                                            case 150:
                                            case 152:
                                                return 28;
                                            case 153:
                                            case 159:
                                            case 165:
                                                return 7;
                                            case 154:
                                            case 160:
                                            case 166:
                                                return 8;
                                            case 155:
                                            case 161:
                                                return 9;
                                            case 156:
                                            case 162:
                                                return 10;
                                            case 157:
                                            case 163:
                                                return 12;
                                            case 158:
                                            case 164:
                                                return 11;
                                            case 167:
                                                return 6;
                                            default:
                                                switch (i5) {
                                                    case 177:
                                                        return 33;
                                                    case 178:
                                                        return 46;
                                                    case 179:
                                                        return 48;
                                                    case 180:
                                                        return 45;
                                                    case 181:
                                                        return 47;
                                                    case 182:
                                                        CstMethodRef cstMethodRef = (CstMethodRef) constant;
                                                        if (cstMethodRef.getDefiningClass().equals(this.method.getDefiningClass())) {
                                                            for (int i6 = 0; i6 < this.methods.size(); i6++) {
                                                                Method method = this.methods.get(i6);
                                                                if (AccessFlags.isPrivate(method.getAccessFlags()) && cstMethodRef.getNat().equals(method.getNat())) {
                                                                    return 52;
                                                                }
                                                            }
                                                        }
                                                        if (cstMethodRef.isSignaturePolymorphic()) {
                                                            return 58;
                                                        }
                                                        return 50;
                                                    case 183:
                                                        CstMethodRef cstMethodRef2 = (CstMethodRef) constant;
                                                        if (cstMethodRef2.isInstanceInit() || cstMethodRef2.getDefiningClass().equals(this.method.getDefiningClass())) {
                                                            return 52;
                                                        }
                                                        return 51;
                                                    case 184:
                                                        return 49;
                                                    case 185:
                                                        return 53;
                                                    case 186:
                                                        return 59;
                                                    case 187:
                                                        return 40;
                                                    case 188:
                                                    case 189:
                                                        return 41;
                                                    case 190:
                                                        return 34;
                                                    case 191:
                                                        return 35;
                                                    case 192:
                                                        return 43;
                                                    case 193:
                                                        return 44;
                                                    case 194:
                                                        return 36;
                                                    case 195:
                                                        return 37;
                                                    default:
                                                        throw new RuntimeException("shouldn't happen");
                                                }
                                        }
                                }
                            }
                            return 7;
                        }
                        return 33;
                    }
                    return 13;
                }
                return 2;
            }
            return 5;
        }
        return 1;
    }

    private Insn makeInvokePolymorphicInsn(Rop rop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, TypeList typeList, Constant constant) {
        return new InvokePolymorphicInsn(rop, sourcePosition, registerSpecList, typeList, (CstMethodRef) constant);
    }

    private void updateReturnOp(Rop rop, SourcePosition sourcePosition) {
        if (rop != null) {
            if (sourcePosition != null) {
                Rop rop2 = this.returnOp;
                if (rop2 == null) {
                    this.returnOp = rop;
                    this.returnPosition = sourcePosition;
                    return;
                } else if (rop2 == rop) {
                    if (sourcePosition.getLine() > this.returnPosition.getLine()) {
                        this.returnPosition = sourcePosition;
                        return;
                    }
                    return;
                } else {
                    throw new SimException("return op mismatch: " + rop + ", " + this.returnOp);
                }
            }
            throw new NullPointerException("pos == null");
        }
        throw new NullPointerException("op == null");
    }

    public boolean canThrow() {
        return this.blockCanThrow;
    }

    public int getExtraBlockCount() {
        return this.extraBlockCount;
    }

    public ArrayList<Insn> getInsns() {
        return this.insns;
    }

    public int getPrimarySuccessorIndex() {
        return this.primarySuccessorIndex;
    }

    public ReturnAddress getReturnAddress() {
        return this.returnAddress;
    }

    public Rop getReturnOp() {
        return this.returnOp;
    }

    public SourcePosition getReturnPosition() {
        return this.returnPosition;
    }

    public boolean hasJsr() {
        return this.hasJsr;
    }

    public boolean hasRet() {
        return this.returnAddress != null;
    }

    public boolean returns() {
        return this.returns;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01da  */
    /* JADX WARN: Type inference failed for: r2v10, types: [com.android.dx.rop.type.TypeBearer] */
    /* JADX WARN: Type inference failed for: r3v13, types: [com.android.dx.rop.type.TypeBearer] */
    /* JADX WARN: Type inference failed for: r8v18, types: [int] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    @Override // com.android.dx.cf.code.ValueAwareMachine, com.android.dx.cf.code.Machine
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run(com.android.dx.cf.code.Frame r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.dx.cf.code.RopperMachine.run(com.android.dx.cf.code.Frame, int, int):void");
    }

    public void startBlock(TypeList typeList) {
        this.catches = typeList;
        this.insns.clear();
        this.catchesUsed = false;
        this.returns = false;
        this.primarySuccessorIndex = 0;
        this.extraBlockCount = 0;
        this.blockCanThrow = false;
        this.hasJsr = false;
        this.returnAddress = null;
    }

    public boolean wereCatchesUsed() {
        return this.catchesUsed;
    }
}
