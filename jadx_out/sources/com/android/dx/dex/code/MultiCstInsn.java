package com.android.dx.dex.code;

import com.android.dx.rop.code.RegisterSpecList;
import com.android.dx.rop.code.SourcePosition;
import com.android.dx.rop.cst.Constant;
import com.android.dx.util.Hex;

/* loaded from: classes2.dex */
public final class MultiCstInsn extends FixedSizeInsn {
    private static final int NOT_SET = -1;
    private int classIndex;
    private final Constant[] constants;
    private final int[] index;

    public MultiCstInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, Constant[] constantArr) {
        super(dop, sourcePosition, registerSpecList);
        if (constantArr != null) {
            this.constants = constantArr;
            this.index = new int[constantArr.length];
            int i5 = 0;
            while (true) {
                int[] iArr = this.index;
                if (i5 < iArr.length) {
                    if (constantArr[i5] != null) {
                        iArr[i5] = -1;
                        i5++;
                    } else {
                        throw new NullPointerException("constants[i] == null");
                    }
                } else {
                    this.classIndex = -1;
                    return;
                }
            }
        } else {
            throw new NullPointerException("constants == null");
        }
    }

    @Override // com.android.dx.dex.code.DalvInsn
    protected String argString() {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < this.constants.length; i5++) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(this.constants[i5].toHuman());
        }
        return sb.toString();
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String cstComment() {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < this.constants.length; i5++) {
            if (!hasIndex(i5)) {
                return "";
            }
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(getConstant(i5).typeName());
            sb.append('@');
            int index = getIndex(i5);
            if (index < 65536) {
                sb.append(Hex.u2(index));
            } else {
                sb.append(Hex.u4(index));
            }
        }
        return sb.toString();
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public String cstString() {
        return argString();
    }

    public int getClassIndex() {
        if (hasClassIndex()) {
            return this.classIndex;
        }
        throw new IllegalStateException("class index not yet set");
    }

    public Constant getConstant(int i5) {
        return this.constants[i5];
    }

    public int getIndex(int i5) {
        if (hasIndex(i5)) {
            return this.index[i5];
        }
        throw new IllegalStateException("index not yet set for constant " + i5 + " value = " + this.constants[i5]);
    }

    public int getNumberOfConstants() {
        return this.constants.length;
    }

    public boolean hasClassIndex() {
        return this.classIndex != -1;
    }

    public boolean hasIndex(int i5) {
        return this.index[i5] != -1;
    }

    public void setClassIndex(int i5) {
        if (i5 >= 0) {
            if (!hasClassIndex()) {
                this.classIndex = i5;
                return;
            }
            throw new IllegalStateException("class index already set");
        }
        throw new IllegalArgumentException("index < 0");
    }

    public void setIndex(int i5, int i6) {
        if (i6 >= 0) {
            if (!hasIndex(i5)) {
                this.index[i5] = i6;
                return;
            }
            throw new IllegalStateException("index already set");
        }
        throw new IllegalArgumentException("index < 0");
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withOpcode(Dop dop) {
        return new MultiCstInsn(dop, getPosition(), getRegisters(), this.constants, this.index, this.classIndex);
    }

    @Override // com.android.dx.dex.code.DalvInsn
    public DalvInsn withRegisters(RegisterSpecList registerSpecList) {
        return new MultiCstInsn(getOpcode(), getPosition(), registerSpecList, this.constants, this.index, this.classIndex);
    }

    private MultiCstInsn(Dop dop, SourcePosition sourcePosition, RegisterSpecList registerSpecList, Constant[] constantArr, int[] iArr, int i5) {
        super(dop, sourcePosition, registerSpecList);
        this.constants = constantArr;
        this.index = iArr;
        this.classIndex = i5;
    }
}
