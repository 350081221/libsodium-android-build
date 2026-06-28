package com.android.dx.cf.code;

import com.android.dx.cf.code.BytecodeArray;
import com.android.dx.cf.code.LocalVariableList;
import com.android.dx.dex.DexOptions;
import com.android.dx.rop.code.LocalItem;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstFieldRef;
import com.android.dx.rop.cst.CstInteger;
import com.android.dx.rop.cst.CstInterfaceMethodRef;
import com.android.dx.rop.cst.CstInvokeDynamic;
import com.android.dx.rop.cst.CstMethodHandle;
import com.android.dx.rop.cst.CstMethodRef;
import com.android.dx.rop.cst.CstProtoRef;
import com.android.dx.rop.cst.CstType;
import com.android.dx.rop.type.Prototype;
import com.android.dx.rop.type.Type;
import com.android.dx.util.Hex;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class Simulator {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String LOCAL_MISMATCH_ERROR = "This is symptomatic of .class transformation tools that ignore local variable information.";
    private final BytecodeArray code;
    private final DexOptions dexOptions;
    private final LocalVariableList localVariables;
    private final Machine machine;
    private ConcreteMethod method;
    private final SimVisitor visitor;

    /* loaded from: classes2.dex */
    private class SimVisitor implements BytecodeArray.Visitor {
        private Frame frame = null;
        private final Machine machine;
        private int previousOffset;

        public SimVisitor() {
            this.machine = Simulator.this.machine;
        }

        private void checkReturnType(Type type) {
            Type returnType = this.machine.getPrototype().getReturnType();
            if (!Merger.isPossiblyAssignableFrom(returnType, type)) {
                Simulator.this.fail("return type mismatch: prototype indicates " + returnType.toHuman() + ", but encountered type " + type.toHuman());
            }
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public int getPreviousOffset() {
            return this.previousOffset;
        }

        public void setFrame(Frame frame) {
            if (frame != null) {
                this.frame = frame;
                return;
            }
            throw new NullPointerException("frame == null");
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void setPreviousOffset(int i5) {
            this.previousOffset = i5;
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:1:0x0000. Please report as an issue. */
        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitBranch(int i5, int i6, int i7, int i8) {
            switch (i5) {
                case 153:
                case 154:
                case 155:
                case 156:
                case 157:
                case 158:
                    this.machine.popArgs(this.frame, Type.INT);
                    this.machine.auxTargetArg(i8);
                    this.machine.run(this.frame, i6, i5);
                    return;
                case 159:
                case 160:
                case 161:
                case 162:
                case 163:
                case 164:
                    Machine machine = this.machine;
                    Frame frame = this.frame;
                    Type type = Type.INT;
                    machine.popArgs(frame, type, type);
                    this.machine.auxTargetArg(i8);
                    this.machine.run(this.frame, i6, i5);
                    return;
                case 165:
                case 166:
                    Machine machine2 = this.machine;
                    Frame frame2 = this.frame;
                    Type type2 = Type.OBJECT;
                    machine2.popArgs(frame2, type2, type2);
                    this.machine.auxTargetArg(i8);
                    this.machine.run(this.frame, i6, i5);
                    return;
                default:
                    switch (i5) {
                        case 198:
                        case 199:
                            this.machine.popArgs(this.frame, Type.OBJECT);
                            break;
                        case 200:
                        case 201:
                            break;
                        default:
                            visitInvalid(i5, i6, i7);
                            return;
                    }
                    this.machine.auxTargetArg(i8);
                    this.machine.run(this.frame, i6, i5);
                    return;
                case 167:
                case 168:
                    this.machine.clearArgs();
                    this.machine.auxTargetArg(i8);
                    this.machine.run(this.frame, i6, i5);
                    return;
            }
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitConstant(int i5, int i6, int i7, Constant constant, int i8) {
            Constant constant2;
            boolean z4;
            if (i5 != 18 && i5 != 19) {
                if (i5 != 189) {
                    if (i5 != 197) {
                        if (i5 != 192 && i5 != 193) {
                            switch (i5) {
                                case 179:
                                    this.machine.popArgs(this.frame, ((CstFieldRef) constant).getType());
                                    constant2 = constant;
                                    break;
                                case 180:
                                    break;
                                case 181:
                                    this.machine.popArgs(this.frame, Type.OBJECT, ((CstFieldRef) constant).getType());
                                    constant2 = constant;
                                    break;
                                case 182:
                                case 183:
                                case 184:
                                case 185:
                                    boolean z5 = constant instanceof CstInterfaceMethodRef;
                                    Constant constant3 = constant;
                                    if (z5) {
                                        CstMethodRef methodRef = ((CstInterfaceMethodRef) constant).toMethodRef();
                                        Simulator.this.checkInvokeInterfaceSupported(i5, methodRef);
                                        constant3 = methodRef;
                                    }
                                    if ((constant3 instanceof CstMethodRef) && ((CstMethodRef) constant3).isSignaturePolymorphic()) {
                                        Simulator.this.checkInvokeSignaturePolymorphic(i5);
                                    }
                                    if (i5 == 184) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    this.machine.popArgs(this.frame, ((CstMethodRef) constant3).getPrototype(z4));
                                    constant2 = constant3;
                                    break;
                                case 186:
                                    Simulator.this.checkInvokeDynamicSupported(i5);
                                    CstInvokeDynamic cstInvokeDynamic = (CstInvokeDynamic) constant;
                                    this.machine.popArgs(this.frame, cstInvokeDynamic.getPrototype());
                                    constant2 = cstInvokeDynamic.addReference();
                                    break;
                                default:
                                    this.machine.clearArgs();
                                    constant2 = constant;
                                    break;
                            }
                        }
                        this.machine.popArgs(this.frame, Type.OBJECT);
                        constant2 = constant;
                    } else {
                        this.machine.popArgs(this.frame, Prototype.internInts(Type.VOID, i8));
                        constant2 = constant;
                    }
                } else {
                    this.machine.popArgs(this.frame, Type.INT);
                    constant2 = constant;
                }
            } else {
                if ((constant instanceof CstMethodHandle) || (constant instanceof CstProtoRef)) {
                    Simulator.this.checkConstMethodHandleSupported(constant);
                }
                this.machine.clearArgs();
                constant2 = constant;
            }
            this.machine.auxIntArg(i8);
            this.machine.auxCstArg(constant2);
            this.machine.run(this.frame, i6, i5);
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitInvalid(int i5, int i6, int i7) {
            throw new SimException("invalid opcode " + Hex.u1(i5));
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitLocal(int i5, int i6, int i7, int i8, Type type, int i9) {
            int i10;
            Type type2;
            boolean z4;
            if (i5 == 54) {
                i10 = i6 + i7;
            } else {
                i10 = i6;
            }
            LocalVariableList.Item pcAndIndexToLocal = Simulator.this.localVariables.pcAndIndexToLocal(i10, i8);
            LocalItem localItem = null;
            if (pcAndIndexToLocal != null) {
                type2 = pcAndIndexToLocal.getType();
                if (type2.getBasicFrameType() != type.getBasicFrameType()) {
                    type2 = type;
                    pcAndIndexToLocal = null;
                }
            } else {
                type2 = type;
            }
            if (i5 != 21) {
                if (i5 != 54) {
                    if (i5 != 132) {
                        if (i5 != 169) {
                            visitInvalid(i5, i6, i7);
                            return;
                        }
                    } else {
                        if (pcAndIndexToLocal != null) {
                            localItem = pcAndIndexToLocal.getLocalItem();
                        }
                        this.machine.localArg(this.frame, i8);
                        this.machine.localTarget(i8, type2, localItem);
                        this.machine.auxType(type);
                        this.machine.auxIntArg(i9);
                        this.machine.auxCstArg(CstInteger.make(i9));
                    }
                } else {
                    if (pcAndIndexToLocal != null) {
                        localItem = pcAndIndexToLocal.getLocalItem();
                    }
                    this.machine.popArgs(this.frame, type);
                    this.machine.auxType(type);
                    this.machine.localTarget(i8, type2, localItem);
                }
                this.machine.run(this.frame, i6, i5);
            }
            this.machine.localArg(this.frame, i8);
            Machine machine = this.machine;
            if (pcAndIndexToLocal != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            machine.localInfo(z4);
            this.machine.auxType(type);
            this.machine.run(this.frame, i6, i5);
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitNewarray(int i5, int i6, CstType cstType, ArrayList<Constant> arrayList) {
            this.machine.popArgs(this.frame, Type.INT);
            this.machine.auxInitValues(arrayList);
            this.machine.auxCstArg(cstType);
            this.machine.run(this.frame, i5, 188);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:11:0x0016. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:118:0x02b8  */
        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void visitNoArgs(int r9, int r10, int r11, com.android.dx.rop.type.Type r12) {
            /*
                Method dump skipped, instructions count: 1000
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.dx.cf.code.Simulator.SimVisitor.visitNoArgs(int, int, int, com.android.dx.rop.type.Type):void");
        }

        @Override // com.android.dx.cf.code.BytecodeArray.Visitor
        public void visitSwitch(int i5, int i6, int i7, SwitchList switchList, int i8) {
            this.machine.popArgs(this.frame, Type.INT);
            this.machine.auxIntArg(i8);
            this.machine.auxSwitchArg(switchList);
            this.machine.run(this.frame, i6, i5);
        }
    }

    public Simulator(Machine machine, ConcreteMethod concreteMethod, DexOptions dexOptions) {
        if (machine != null) {
            if (concreteMethod != null) {
                if (dexOptions != null) {
                    this.machine = machine;
                    this.code = concreteMethod.getCode();
                    this.method = concreteMethod;
                    this.localVariables = concreteMethod.getLocalVariables();
                    this.visitor = new SimVisitor();
                    this.dexOptions = dexOptions;
                    if (concreteMethod.isDefaultOrStaticInterfaceMethod()) {
                        checkInterfaceMethodDeclaration(concreteMethod);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("dexOptions == null");
            }
            throw new NullPointerException("method == null");
        }
        throw new NullPointerException("machine == null");
    }

    static /* synthetic */ SimException access$100() {
        return illegalTos();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkConstMethodHandleSupported(Constant constant) throws SimException {
        if (!this.dexOptions.apiIsSupported(28)) {
            fail(String.format("invalid constant type %s requires --min-sdk-version >= %d (currently %d)", constant.typeName(), 28, Integer.valueOf(this.dexOptions.minSdkVersion)));
        }
    }

    private void checkInterfaceMethodDeclaration(ConcreteMethod concreteMethod) {
        String str;
        if (!this.dexOptions.apiIsSupported(24)) {
            Object[] objArr = new Object[5];
            if (concreteMethod.isStaticMethod()) {
                str = "static";
            } else {
                str = "default";
            }
            objArr[0] = str;
            objArr[1] = 24;
            objArr[2] = Integer.valueOf(this.dexOptions.minSdkVersion);
            objArr[3] = concreteMethod.getDefiningClass().toHuman();
            objArr[4] = concreteMethod.getNat().toHuman();
            warn(String.format("defining a %s interface method requires --min-sdk-version >= %d (currently %d) for interface methods: %s.%s", objArr));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkInvokeDynamicSupported(int i5) throws SimException {
        if (!this.dexOptions.apiIsSupported(26)) {
            fail(String.format("invalid opcode %02x - invokedynamic requires --min-sdk-version >= %d (currently %d)", Integer.valueOf(i5), 26, Integer.valueOf(this.dexOptions.minSdkVersion)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkInvokeInterfaceSupported(int i5, CstMethodRef cstMethodRef) {
        String str;
        if (i5 == 185 || this.dexOptions.apiIsSupported(24)) {
            return;
        }
        DexOptions dexOptions = this.dexOptions;
        boolean z4 = dexOptions.allowAllInterfaceMethodInvokes;
        if (i5 == 184) {
            z4 &= dexOptions.apiIsSupported(21);
        }
        if (i5 == 184) {
            str = "static";
        } else {
            str = "default";
        }
        if (z4) {
            warn(String.format("invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (experimental at current API level %d)", str, cstMethodRef.getDefiningClass().toHuman(), cstMethodRef.getNat().toHuman(), 24, Integer.valueOf(this.dexOptions.minSdkVersion)));
        } else {
            fail(String.format("invoking a %s interface method %s.%s strictly requires --min-sdk-version >= %d (blocked at current API level %d)", str, cstMethodRef.getDefiningClass().toHuman(), cstMethodRef.getNat().toHuman(), 24, Integer.valueOf(this.dexOptions.minSdkVersion)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkInvokeSignaturePolymorphic(int i5) {
        if (!this.dexOptions.apiIsSupported(26)) {
            fail(String.format("invoking a signature-polymorphic requires --min-sdk-version >= %d (currently %d)", 26, Integer.valueOf(this.dexOptions.minSdkVersion)));
            return;
        }
        if (i5 != 182) {
            fail("Unsupported signature polymorphic invocation (" + ByteOps.opName(i5) + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fail(String str) {
        throw new SimException(String.format("ERROR in %s.%s: %s", this.method.getDefiningClass().toHuman(), this.method.getNat().toHuman(), str));
    }

    private static SimException illegalTos() {
        return new SimException("stack mismatch: illegal top-of-stack for opcode");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Type requiredArrayTypeFor(Type type, Type type2) {
        Type type3;
        Type type4 = Type.KNOWN_NULL;
        if (type2 == type4) {
            if (!type.isReference()) {
                return type.getArrayType();
            }
            return type4;
        }
        if (type == Type.OBJECT && type2.isArray() && type2.getComponentType().isReference()) {
            return type2;
        }
        if (type == Type.BYTE && type2 == (type3 = Type.BOOLEAN_ARRAY)) {
            return type3;
        }
        return type.getArrayType();
    }

    private void warn(String str) {
        this.dexOptions.err.println(String.format("WARNING in %s.%s: %s", this.method.getDefiningClass().toHuman(), this.method.getNat().toHuman(), str));
    }

    public void simulate(ByteBlock byteBlock, Frame frame) {
        int end = byteBlock.getEnd();
        this.visitor.setFrame(frame);
        try {
            int start = byteBlock.getStart();
            while (start < end) {
                int parseInstruction = this.code.parseInstruction(start, this.visitor);
                this.visitor.setPreviousOffset(start);
                start += parseInstruction;
            }
        } catch (SimException e5) {
            frame.annotate(e5);
            throw e5;
        }
    }

    public int simulate(int i5, Frame frame) {
        this.visitor.setFrame(frame);
        return this.code.parseInstruction(i5, this.visitor);
    }
}
