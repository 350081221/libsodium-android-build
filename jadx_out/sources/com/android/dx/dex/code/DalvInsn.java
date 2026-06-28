package com.android.dx.dex.code;

import com.android.dx.rop.code.RegisterSpec;
import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.SourcePosition;
import com.android.dx.ssa.RegisterMapper;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import com.android.dx.util.TwoColumnOutput;
import java.util.BitSet;

/* loaded from: classes2.dex */
public abstract class DalvInsn {
    private int address;
    private final Dop opcode;
    private final SourcePosition position;
    private final RegisterSpecList registers;

    public DalvInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList) {
        if (dop != null) {
            if (sourcePosition != null) {
                if (registerSpecList != null) {
                    this.address = -1;
                    this.opcode = dop;
                    this.position = sourcePosition;
                    this.registers = registerSpecList;
                    return;
                }
                throw new NullPointerException("registers == null");
            }
            throw new NullPointerException("position == null");
        }
        throw new NullPointerException("opcode == null");
    }

    public static SimpleInsn makeMove(SourcePosition sourcePosition, RegisterSpec registerSpec, RegisterSpec registerSpec2) {
        Dop dop;
        boolean z4 = true;
        if (registerSpec.getCategory() != 1) {
            z4 = false;
        }
        boolean isReference = registerSpec.getType().isReference();
        int reg = registerSpec.getReg();
        if ((registerSpec2.getReg() | reg) < 16) {
            if (isReference) {
                dop = Dops.MOVE_OBJECT;
            } else if (z4) {
                dop = Dops.MOVE;
            } else {
                dop = Dops.MOVE_WIDE;
            }
        } else if (reg < 256) {
            if (isReference) {
                dop = Dops.MOVE_OBJECT_FROM16;
            } else if (z4) {
                dop = Dops.MOVE_FROM16;
            } else {
                dop = Dops.MOVE_WIDE_FROM16;
            }
        } else if (isReference) {
            dop = Dops.MOVE_OBJECT_16;
        } else if (z4) {
            dop = Dops.MOVE_16;
        } else {
            dop = Dops.MOVE_WIDE_16;
        }
        return new SimpleInsn(dop, sourcePosition, RegisterSpecList.make(registerSpec, registerSpec2));
    }

    protected abstract String argString();

    public abstract int codeSize();

    public String cstComment() {
        throw new UnsupportedOperationException("Not supported.");
    }

    public String cstString() {
        throw new UnsupportedOperationException("Not supported.");
    }

    public DalvInsn expandedPrefix(BitSet bitSet) {
        RegisterSpecList registerSpecList = this.registers;
        boolean z4 = bitSet.get(0);
        if (hasResult()) {
            bitSet.set(0);
        }
        RegisterSpecList subset = registerSpecList.subset(bitSet);
        if (hasResult()) {
            bitSet.set(0, z4);
        }
        if (subset.size() == 0) {
            return null;
        }
        return new HighRegisterPrefix(this.position, subset);
    }

    public DalvInsn expandedSuffix(BitSet bitSet) {
        if (hasResult() && !bitSet.get(0)) {
            RegisterSpec registerSpec = this.registers.get(0);
            return makeMove(this.position, registerSpec, registerSpec.withReg(0));
        }
        return null;
    }

    public DalvInsn expandedVersion(BitSet bitSet) {
        return withRegisters(this.registers.withExpandedRegisters(0, hasResult(), bitSet));
    }

    public final int getAddress() {
        int i5 = this.address;
        if (i5 >= 0) {
            return i5;
        }
        throw new RuntimeException("address not yet known");
    }

    public DalvInsn getLowRegVersion() {
        return withRegisters(this.registers.withExpandedRegisters(0, hasResult(), null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.android.dx.rop.code.RegisterSpecList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.util.BitSet] */
    public final int getMinimumRegisterRequirement(BitSet bitSet) {
        int i5;
        ?? hasResult = hasResult();
        int size = this.registers.size();
        int i6 = 0;
        if (hasResult != 0 && !bitSet.get(0)) {
            i5 = this.registers.get(0).getCategory();
        } else {
            i5 = 0;
        }
        while (hasResult < size) {
            if (!bitSet.get(hasResult)) {
                i6 += this.registers.get(hasResult).getCategory();
            }
            hasResult++;
        }
        return Math.max(i6, i5);
    }

    public final int getNextAddress() {
        return getAddress() + codeSize();
    }

    public final Dop getOpcode() {
        return this.opcode;
    }

    public final SourcePosition getPosition() {
        return this.position;
    }

    public final RegisterSpecList getRegisters() {
        return this.registers;
    }

    public final boolean hasAddress() {
        return this.address >= 0;
    }

    public final boolean hasResult() {
        return this.opcode.hasResult();
    }

    public final String identifierString() {
        int i5 = this.address;
        if (i5 != -1) {
            return String.format("%04x", Integer.valueOf(i5));
        }
        return Hex.u4(System.identityHashCode(this));
    }

    public final String listingString(String str, int i5, boolean z4) {
        int i6;
        String listingString0 = listingString0(z4);
        if (listingString0 == null) {
            return null;
        }
        String str2 = str + identifierString() + ": ";
        int length = str2.length();
        if (i5 == 0) {
            i6 = listingString0.length();
        } else {
            i6 = i5 - length;
        }
        return TwoColumnOutput.toString(str2, length, "", listingString0, i6);
    }

    protected abstract String listingString0(boolean z4);

    public final void setAddress(int i5) {
        if (i5 >= 0) {
            this.address = i5;
            return;
        }
        throw new IllegalArgumentException("address < 0");
    }

    public final String toString() {
        boolean z4;
        StringBuilder sb = new StringBuilder(100);
        sb.append(identifierString());
        sb.append(' ');
        sb.append(this.position);
        sb.append(": ");
        sb.append(this.opcode.getName());
        if (this.registers.size() != 0) {
            sb.append(this.registers.toHuman(" ", ", ", null));
            z4 = true;
        } else {
            z4 = false;
        }
        String argString = argString();
        if (argString != null) {
            if (z4) {
                sb.append(',');
            }
            sb.append(' ');
            sb.append(argString);
        }
        return sb.toString();
    }

    public DalvInsn withMapper(RegisterMapper registerMapper) {
        return withRegisters(registerMapper.map(getRegisters()));
    }

    public abstract DalvInsn withOpcode(Dop dop);

    public abstract DalvInsn withRegisterOffset(int i5);

    public abstract DalvInsn withRegisters(RegisterSpecList registerSpecList);

    public abstract void writeTo(AnnotatedOutput annotatedOutput);
}
