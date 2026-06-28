package com.android.dx.util;

import a1.i;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class FixedSizeList extends MutabilityControl implements ToHuman {
    private Object[] arr;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FixedSizeList(int r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            r1.<init>(r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.NegativeArraySizeException -> Ld
            r1.arr = r2     // Catch: java.lang.NegativeArraySizeException -> Ld
            return
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size < 0"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.dx.util.FixedSizeList.<init>(int):void");
    }

    private Object throwIndex(int i5) {
        if (i5 < 0) {
            throw new IndexOutOfBoundsException("n < 0");
        }
        throw new IndexOutOfBoundsException("n >= size()");
    }

    private String toString0(String str, String str2, String str3, boolean z4) {
        int length = this.arr.length;
        StringBuilder sb = new StringBuilder((length * 10) + 10);
        if (str != null) {
            sb.append(str);
        }
        for (int i5 = 0; i5 < length; i5++) {
            if (i5 != 0 && str2 != null) {
                sb.append(str2);
            }
            if (z4) {
                sb.append(((ToHuman) this.arr[i5]).toHuman());
            } else {
                sb.append(this.arr[i5]);
            }
        }
        if (str3 != null) {
            sb.append(str3);
        }
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Arrays.equals(this.arr, ((FixedSizeList) obj).arr);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object get0(int i5) {
        try {
            Object obj = this.arr[i5];
            if (obj != null) {
                return obj;
            }
            throw new NullPointerException("unset: " + i5);
        } catch (ArrayIndexOutOfBoundsException unused) {
            return throwIndex(i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Object getOrNull0(int i5) {
        return this.arr[i5];
    }

    public int hashCode() {
        return Arrays.hashCode(this.arr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void set0(int i5, Object obj) {
        throwIfImmutable();
        try {
            this.arr[i5] = obj;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throwIndex(i5);
        }
    }

    public void shrinkToFit() {
        int length = this.arr.length;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            if (this.arr[i6] != null) {
                i5++;
            }
        }
        if (length == i5) {
            return;
        }
        throwIfImmutable();
        Object[] objArr = new Object[i5];
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            Object obj = this.arr[i8];
            if (obj != null) {
                objArr[i7] = obj;
                i7++;
            }
        }
        this.arr = objArr;
        if (i5 == 0) {
            setImmutable();
        }
    }

    public final int size() {
        return this.arr.length;
    }

    public String toHuman() {
        String name = getClass().getName();
        return toString0(name.substring(name.lastIndexOf(46) + 1) + '{', ", ", i.f138d, true);
    }

    public String toString() {
        String name = getClass().getName();
        return toString0(name.substring(name.lastIndexOf(46) + 1) + '{', ", ", i.f138d, false);
    }

    public String toHuman(String str, String str2, String str3) {
        return toString0(str, str2, str3, true);
    }

    public String toString(String str, String str2, String str3) {
        return toString0(str, str2, str3, false);
    }
}
