package com.android.dx.rop.cst;

import com.android.dex.util.ExceptionWithContext;
import com.android.dx.util.Hex;
import com.android.dx.util.MutabilityControl;

/* loaded from: classes2.dex */
public final class StdConstantPool extends MutabilityControl implements ConstantPool {
    private final Constant[] entries;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public StdConstantPool(int r3) {
        /*
            r2 = this;
            r0 = 1
            if (r3 <= r0) goto L5
            r1 = r0
            goto L6
        L5:
            r1 = 0
        L6:
            r2.<init>(r1)
            if (r3 < r0) goto L10
            com.android.dx.rop.cst.Constant[] r3 = new com.android.dx.rop.cst.Constant[r3]
            r2.entries = r3
            return
        L10:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size < 1"
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.dx.rop.cst.StdConstantPool.<init>(int):void");
    }

    private static Constant throwInvalid(int i5) {
        throw new ExceptionWithContext("invalid constant pool index " + Hex.u2(i5));
    }

    @Override // com.android.dx.rop.cst.ConstantPool
    public Constant get(int i5) {
        try {
            Constant constant = this.entries[i5];
            if (constant == null) {
                throwInvalid(i5);
            }
            return constant;
        } catch (IndexOutOfBoundsException unused) {
            return throwInvalid(i5);
        }
    }

    @Override // com.android.dx.rop.cst.ConstantPool
    public Constant get0Ok(int i5) {
        if (i5 == 0) {
            return null;
        }
        return get(i5);
    }

    @Override // com.android.dx.rop.cst.ConstantPool
    public Constant[] getEntries() {
        return this.entries;
    }

    @Override // com.android.dx.rop.cst.ConstantPool
    public Constant getOrNull(int i5) {
        try {
            return this.entries[i5];
        } catch (IndexOutOfBoundsException unused) {
            return throwInvalid(i5);
        }
    }

    public void set(int i5, Constant constant) {
        boolean z4;
        int i6;
        Constant constant2;
        throwIfImmutable();
        if (constant != null && constant.isCategory2()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i5 >= 1) {
            if (z4) {
                Constant[] constantArr = this.entries;
                if (i5 != constantArr.length - 1) {
                    constantArr[i5 + 1] = null;
                } else {
                    throw new IllegalArgumentException("(n == size - 1) && cst.isCategory2()");
                }
            }
            if (constant != null) {
                Constant[] constantArr2 = this.entries;
                if (constantArr2[i5] == null && (constant2 = constantArr2[i5 - 1]) != null && constant2.isCategory2()) {
                    this.entries[i6] = null;
                }
            }
            this.entries[i5] = constant;
            return;
        }
        throw new IllegalArgumentException("n < 1");
    }

    @Override // com.android.dx.rop.cst.ConstantPool
    public int size() {
        return this.entries.length;
    }
}
