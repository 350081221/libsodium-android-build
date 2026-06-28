package com.android.dx.dex.code;

import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.SourcePosition;
import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstLiteral32;
import com.android.dx.rop.cst.CstLiteral64;
import com.android.dx.rop.cst.CstType;
import com.android.dx.util.AnnotatedOutput;
import com.android.dx.util.Hex;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ArrayData extends VariableSizeInsn {
    private final Constant arrayType;
    private final int elemWidth;
    private final int initLength;
    private final CodeAddress user;
    private final ArrayList<Constant> values;

    public ArrayData(SourcePosition sourcePosition, CodeAddress codeAddress, ArrayList<Constant> arrayList, Constant constant) {
        super(sourcePosition, RegisterSpecList.EMPTY);
        if (codeAddress != null) {
            if (arrayList != null) {
                if (arrayList.size() > 0) {
                    this.arrayType = constant;
                    if (constant != CstType.BYTE_ARRAY && constant != CstType.BOOLEAN_ARRAY) {
                        if (constant != CstType.SHORT_ARRAY && constant != CstType.CHAR_ARRAY) {
                            if (constant != CstType.INT_ARRAY && constant != CstType.FLOAT_ARRAY) {
                                if (constant != CstType.LONG_ARRAY && constant != CstType.DOUBLE_ARRAY) {
                                    throw new IllegalArgumentException("Unexpected constant type");
                                }
                                this.elemWidth = 8;
                            } else {
                                this.elemWidth = 4;
                            }
                        } else {
                            this.elemWidth = 2;
                        }
                    } else {
                        this.elemWidth = 1;
                    }
                    this.user = codeAddress;
                    this.values = arrayList;
                    this.initLength = arrayList.size();
                    return;
                }
                throw new IllegalArgumentException("Illegal number of init values");
            }
            throw new NullPointerException("values == null");
        }
        throw new NullPointerException("user == null");
    }

    @Override // com.android.dx.dex.code.DalvInsn
    protected String argString() {
        StringBuilder sb = new StringBuilder(100);
        int size = this.values.size();
        for (int i5 = 0; i5 < size; i5++) {
            sb.append("\n    ");
            sb.append(i5);
            sb.append(": ");
            sb.append(this.values.get(i5).toHuman());
        }
        return sb.toString();
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public int codeSize() {
        return (((this.initLength * this.elemWidth) + 1) / 2) + 4;
    }

    @Override // com.android.dx.dex.code.DalvInsn
    protected String listingString0(boolean z4) {
        int address = this.user.getAddress();
        StringBuilder sb = new StringBuilder(100);
        int size = this.values.size();
        sb.append("fill-array-data-payload // for fill-array-data @ ");
        sb.append(Hex.u2(address));
        for (int i5 = 0; i5 < size; i5++) {
            sb.append("\n  ");
            sb.append(i5);
            sb.append(": ");
            sb.append(this.values.get(i5).toHuman());
        }
        return sb.toString();
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new ArrayData(getPosition(), this.user, this.values, this.arrayType);
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public void writeTo(AnnotatedOutput annotatedOutput) {
        int size = this.values.size();
        annotatedOutput.writeShort(768);
        annotatedOutput.writeShort(this.elemWidth);
        annotatedOutput.writeInt(this.initLength);
        int i5 = this.elemWidth;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 4) {
                    if (i5 == 8) {
                        for (int i6 = 0; i6 < size; i6++) {
                            annotatedOutput.writeLong(((CstLiteral64) this.values.get(i6)).getLongBits());
                        }
                    }
                } else {
                    for (int i7 = 0; i7 < size; i7++) {
                        annotatedOutput.writeInt(((CstLiteral32) this.values.get(i7)).getIntBits());
                    }
                }
            } else {
                for (int i8 = 0; i8 < size; i8++) {
                    annotatedOutput.writeShort((short) ((CstLiteral32) this.values.get(i8)).getIntBits());
                }
            }
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                annotatedOutput.writeByte((byte) ((CstLiteral32) this.values.get(i9)).getIntBits());
            }
        }
        if (this.elemWidth == 1 && size % 2 != 0) {
            annotatedOutput.writeByte(0);
        }
    }
}
