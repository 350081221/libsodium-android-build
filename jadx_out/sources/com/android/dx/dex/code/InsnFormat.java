package com.android.dx.dex.code;

import a1.i;
import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.cst.CstInteger;
import com.android.dx.rop.cst.CstKnownNull;
import com.android.dx.rop.cst.CstLiteral64;
import com.android.dx.rop.cst.CstLiteralBits;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import java.util.BitSet;

/* loaded from: classes2.dex */
public abstract class InsnFormat {
    public static final boolean ALLOW_EXTENDED_OPCODES = true;

    protected static int argIndex(DalvInsn dalvInsn) {
        int value = ((CstInteger) ((CstInsn) dalvInsn).getConstant()).getValue();
        if (value >= 0) {
            return value;
        }
        throw new IllegalArgumentException("bogus insn");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String branchComment(DalvInsn dalvInsn) {
        int targetOffset = ((TargetInsn) dalvInsn).getTargetOffset();
        if (targetOffset == ((short) targetOffset)) {
            return Hex.s2(targetOffset);
        }
        return Hex.s4(targetOffset);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String branchString(DalvInsn dalvInsn) {
        int targetAddress = ((TargetInsn) dalvInsn).getTargetAddress();
        if (targetAddress == ((char) targetAddress)) {
            return Hex.u2(targetAddress);
        }
        return Hex.u4(targetAddress);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static short codeUnit(int i5, int i6) {
        if ((i5 & 255) != i5) {
            throw new IllegalArgumentException("low out of range 0..255");
        }
        if ((i6 & 255) == i6) {
            return (short) (i5 | (i6 << 8));
        }
        throw new IllegalArgumentException("high out of range 0..255");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean isRegListSequential(RegisterSpecList registerSpecList) {
        int size = registerSpecList.size();
        if (size < 2) {
            return true;
        }
        int reg = registerSpecList.get(0).getReg();
        for (int i5 = 0; i5 < size; i5++) {
            RegisterSpec registerSpec = registerSpecList.get(i5);
            if (registerSpec.getReg() != reg) {
                return false;
            }
            reg += registerSpec.getCategory();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String literalBitsComment(CstLiteralBits cstLiteralBits, int i5) {
        long intBits;
        StringBuilder sb = new StringBuilder(20);
        sb.append("#");
        if (cstLiteralBits instanceof CstLiteral64) {
            intBits = ((CstLiteral64) cstLiteralBits).getLongBits();
        } else {
            intBits = cstLiteralBits.getIntBits();
        }
        if (i5 != 4) {
            if (i5 != 8) {
                if (i5 != 16) {
                    if (i5 != 32) {
                        if (i5 == 64) {
                            sb.append(Hex.u8(intBits));
                        } else {
                            throw new RuntimeException("shouldn't happen");
                        }
                    } else {
                        sb.append(Hex.u4((int) intBits));
                    }
                } else {
                    sb.append(Hex.u2((int) intBits));
                }
            } else {
                sb.append(Hex.u1((int) intBits));
            }
        } else {
            sb.append(Hex.uNibble((int) intBits));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String literalBitsString(CstLiteralBits cstLiteralBits) {
        StringBuilder sb = new StringBuilder(100);
        sb.append('#');
        if (cstLiteralBits instanceof CstKnownNull) {
            sb.append("null");
        } else {
            sb.append(cstLiteralBits.typeName());
            sb.append(' ');
            sb.append(cstLiteralBits.toHuman());
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int makeByte(int i5, int i6) {
        if ((i5 & 15) == i5) {
            if ((i6 & 15) == i6) {
                return i5 | (i6 << 4);
            }
            throw new IllegalArgumentException("high out of range 0..15");
        }
        throw new IllegalArgumentException("low out of range 0..15");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static short opcodeUnit(DalvInsn dalvInsn, int i5) {
        if ((i5 & 255) == i5) {
            int opcode = dalvInsn.getOpcode().getOpcode();
            if ((opcode & 255) == opcode) {
                return (short) (opcode | (i5 << 8));
            }
            throw new IllegalArgumentException("opcode out of range 0..255");
        }
        throw new IllegalArgumentException("arg out of range 0..255");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String regListString(RegisterSpecList registerSpecList) {
        int size = registerSpecList.size();
        StringBuilder sb = new StringBuilder((size * 5) + 2);
        sb.append('{');
        for (int i5 = 0; i5 < size; i5++) {
            if (i5 != 0) {
                sb.append(", ");
            }
            sb.append(registerSpecList.get(i5).regString());
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static String regRangeString(RegisterSpecList registerSpecList) {
        int size = registerSpecList.size();
        StringBuilder sb = new StringBuilder(30);
        sb.append("{");
        if (size != 0) {
            if (size != 1) {
                RegisterSpec registerSpec = registerSpecList.get(size - 1);
                if (registerSpec.getCategory() == 2) {
                    registerSpec = registerSpec.withOffset(1);
                }
                sb.append(registerSpecList.get(0).regString());
                sb.append("..");
                sb.append(registerSpec.regString());
            } else {
                sb.append(registerSpecList.get(0).regString());
            }
        }
        sb.append(i.f138d);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean signedFitsInByte(int i5) {
        return ((byte) i5) == i5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean signedFitsInNibble(int i5) {
        return i5 >= -8 && i5 <= 7;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean signedFitsInShort(int i5) {
        return ((short) i5) == i5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean unsignedFitsInByte(int i5) {
        return i5 == (i5 & 255);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean unsignedFitsInNibble(int i5) {
        return i5 == (i5 & 15);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean unsignedFitsInShort(int i5) {
        return i5 == (65535 & i5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void write(AnnotatedOutput annotatedOutput, short s5) {
        annotatedOutput.writeShort(s5);
    }

    public boolean branchFits(TargetInsn targetInsn) {
        return false;
    }

    public abstract int codeSize();

    public BitSet compatibleRegs(DalvInsn dalvInsn) {
        return new BitSet();
    }

    public abstract String insnArgString(DalvInsn dalvInsn);

    public abstract String insnCommentString(DalvInsn dalvInsn, boolean z4);

    public abstract boolean isCompatible(DalvInsn dalvInsn);

    public final String listingString(DalvInsn dalvInsn, boolean z4) {
        String name = dalvInsn.getOpcode().getName();
        String insnArgString = insnArgString(dalvInsn);
        String insnCommentString = insnCommentString(dalvInsn, z4);
        StringBuilder sb = new StringBuilder(100);
        sb.append(name);
        if (insnArgString.length() != 0) {
            sb.append(' ');
            sb.append(insnArgString);
        }
        if (insnCommentString.length() != 0) {
            sb.append(" // ");
            sb.append(insnCommentString);
        }
        return sb.toString();
    }

    public abstract void writeTo(AnnotatedOutput annotatedOutput, DalvInsn dalvInsn);

    /* JADX INFO: Access modifiers changed from: protected */
    public static void write(AnnotatedOutput annotatedOutput, short s5, short s6) {
        annotatedOutput.writeShort(s5);
        annotatedOutput.writeShort(s6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static short codeUnit(int i5, int i6, int i7, int i8) {
        if ((i5 & 15) != i5) {
            throw new IllegalArgumentException("n0 out of range 0..15");
        }
        if ((i6 & 15) != i6) {
            throw new IllegalArgumentException("n1 out of range 0..15");
        }
        if ((i7 & 15) != i7) {
            throw new IllegalArgumentException("n2 out of range 0..15");
        }
        if ((i8 & 15) == i8) {
            return (short) (i5 | (i6 << 4) | (i7 << 8) | (i8 << 12));
        }
        throw new IllegalArgumentException("n3 out of range 0..15");
    }

    protected static short opcodeUnit(DalvInsn dalvInsn) {
        int opcode = dalvInsn.getOpcode().getOpcode();
        if (opcode < 256 || opcode > 65535) {
            throw new IllegalArgumentException("opcode out of range 0..65535");
        }
        return (short) opcode;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void write(AnnotatedOutput annotatedOutput, short s5, short s6, short s7) {
        annotatedOutput.writeShort(s5);
        annotatedOutput.writeShort(s6);
        annotatedOutput.writeShort(s7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void write(AnnotatedOutput annotatedOutput, short s5, short s6, short s7, short s8) {
        annotatedOutput.writeShort(s5);
        annotatedOutput.writeShort(s6);
        annotatedOutput.writeShort(s7);
        annotatedOutput.writeShort(s8);
    }

    protected static void write(AnnotatedOutput annotatedOutput, short s5, short s6, short s7, short s8, short s9) {
        annotatedOutput.writeShort(s5);
        annotatedOutput.writeShort(s6);
        annotatedOutput.writeShort(s7);
        annotatedOutput.writeShort(s8);
        annotatedOutput.writeShort(s9);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void write(AnnotatedOutput annotatedOutput, short s5, int i5) {
        write(annotatedOutput, s5, (short) i5, (short) (i5 >> 16));
    }

    protected static void write(AnnotatedOutput annotatedOutput, short s5, int i5, short s6) {
        write(annotatedOutput, s5, (short) i5, (short) (i5 >> 16), s6);
    }

    protected static void write(AnnotatedOutput annotatedOutput, short s5, int i5, short s6, short s7) {
        write(annotatedOutput, s5, (short) i5, (short) (i5 >> 16), s6, s7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void write(AnnotatedOutput annotatedOutput, short s5, long j5) {
        write(annotatedOutput, s5, (short) j5, (short) (j5 >> 16), (short) (j5 >> 32), (short) (j5 >> 48));
    }
}
