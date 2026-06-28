package com.android.dx.dex.code;

import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.SourcePosition;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import com.android.dx.util.IntList;

/* loaded from: classes2.dex */
public final class SwitchData extends VariableSizeInsn {
    private final IntList cases;
    private final boolean packed;
    private final CodeAddress[] targets;
    private final CodeAddress user;

    public SwitchData(SourcePosition sourcePosition, CodeAddress codeAddress, IntList intList, CodeAddress[] codeAddressArr) {
        super(sourcePosition, RegisterSpecList.EMPTY);
        if (codeAddress != null) {
            if (intList != null) {
                if (codeAddressArr != null) {
                    int size = intList.size();
                    if (size == codeAddressArr.length) {
                        if (size <= 65535) {
                            this.user = codeAddress;
                            this.cases = intList;
                            this.targets = codeAddressArr;
                            this.packed = shouldPack(intList);
                            return;
                        }
                        throw new IllegalArgumentException("too many cases");
                    }
                    throw new IllegalArgumentException("cases / targets mismatch");
                }
                throw new NullPointerException("targets == null");
            }
            throw new NullPointerException("cases == null");
        }
        throw new NullPointerException("user == null");
    }

    private static long packedCodeSize(IntList intList) {
        int size = intList.size();
        long j5 = (((intList.get(size - 1) - intList.get(0)) + 1) * 2) + 4;
        if (j5 > 2147483647L) {
            return -1L;
        }
        return j5;
    }

    private static boolean shouldPack(IntList intList) {
        if (intList.size() < 2) {
            return true;
        }
        long packedCodeSize = packedCodeSize(intList);
        long sparseCodeSize = sparseCodeSize(intList);
        if (packedCodeSize >= 0 && packedCodeSize <= (sparseCodeSize * 5) / 4) {
            return true;
        }
        return false;
    }

    private static long sparseCodeSize(IntList intList) {
        return (intList.size() * 4) + 2;
    }

    @Override // com.android.dx.dex.code.DalvInsn
    protected String argString() {
        StringBuilder sb = new StringBuilder(100);
        int length = this.targets.length;
        for (int i5 = 0; i5 < length; i5++) {
            sb.append("\n    ");
            sb.append(this.cases.get(i5));
            sb.append(": ");
            sb.append(this.targets[i5]);
        }
        return sb.toString();
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public int codeSize() {
        long sparseCodeSize;
        if (this.packed) {
            sparseCodeSize = packedCodeSize(this.cases);
        } else {
            sparseCodeSize = sparseCodeSize(this.cases);
        }
        return (int) sparseCodeSize;
    }

    public boolean isPacked() {
        return this.packed;
    }

    @Override // com.android.dx.dex.code.DalvInsn
    protected String listingString0(boolean z4) {
        String str;
        int address = this.user.getAddress();
        StringBuilder sb = new StringBuilder(100);
        int length = this.targets.length;
        if (this.packed) {
            str = "packed";
        } else {
            str = "sparse";
        }
        sb.append(str);
        sb.append("-switch-payload // for switch @ ");
        sb.append(Hex.u2(address));
        for (int i5 = 0; i5 < length; i5++) {
            int address2 = this.targets[i5].getAddress();
            sb.append("\n  ");
            sb.append(this.cases.get(i5));
            sb.append(": ");
            sb.append(Hex.u4(address2));
            sb.append(" // ");
            sb.append(Hex.s4(address2 - address));
        }
        return sb.toString();
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new SwitchData(getPosition(), this.user, this.cases, this.targets);
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public void writeTo(AnnotatedOutput annotatedOutput) {
        int i5;
        int i6;
        int address;
        int address2 = this.user.getAddress();
        int codeSize = Dops.PACKED_SWITCH.getFormat().codeSize();
        int length = this.targets.length;
        int i7 = 0;
        if (this.packed) {
            if (length == 0) {
                i5 = 0;
            } else {
                i5 = this.cases.get(0);
            }
            if (length == 0) {
                i6 = 0;
            } else {
                i6 = this.cases.get(length - 1);
            }
            int i8 = (i6 - i5) + 1;
            annotatedOutput.writeShort(256);
            annotatedOutput.writeShort(i8);
            annotatedOutput.writeInt(i5);
            int i9 = 0;
            while (i7 < i8) {
                if (this.cases.get(i9) > i5 + i7) {
                    address = codeSize;
                } else {
                    address = this.targets[i9].getAddress() - address2;
                    i9++;
                }
                annotatedOutput.writeInt(address);
                i7++;
            }
            return;
        }
        annotatedOutput.writeShort(512);
        annotatedOutput.writeShort(length);
        for (int i10 = 0; i10 < length; i10++) {
            annotatedOutput.writeInt(this.cases.get(i10));
        }
        while (i7 < length) {
            annotatedOutput.writeInt(this.targets[i7].getAddress() - address2);
            i7++;
        }
    }
}
