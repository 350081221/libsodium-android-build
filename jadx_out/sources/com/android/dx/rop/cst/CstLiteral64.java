package com.android.dx.rop.cst;

/* loaded from: classes2.dex */
public abstract class CstLiteral64 extends CstLiteralBits {
    private final long bits;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CstLiteral64(long j5) {
        this.bits = j5;
    }

    @Override // com.android.dx.rop.cst.Constant
    protected int compareTo0(Constant constant) {
        long j5 = ((CstLiteral64) constant).bits;
        long j6 = this.bits;
        if (j6 < j5) {
            return -1;
        }
        if (j6 > j5) {
            return 1;
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        return obj != null && getClass() == obj.getClass() && this.bits == ((CstLiteral64) obj).bits;
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public final boolean fitsInInt() {
        long j5 = this.bits;
        return ((long) ((int) j5)) == j5;
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public final int getIntBits() {
        return (int) this.bits;
    }

    @Override // com.android.dx.rop.cst.CstLiteralBits
    public final long getLongBits() {
        return this.bits;
    }

    public final int hashCode() {
        long j5 = this.bits;
        return ((int) (j5 >> 32)) ^ ((int) j5);
    }

    @Override // com.android.dx.rop.cst.Constant
    public final boolean isCategory2() {
        return true;
    }
}
