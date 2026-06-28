package com.android.dx.util;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class IntList extends MutabilityControl {
    public static final IntList EMPTY;
    private int size;
    private boolean sorted;
    private int[] values;

    static {
        IntList intList = new IntList(0);
        EMPTY = intList;
        intList.setImmutable();
    }

    public IntList() {
        this(4);
    }

    private void growIfNeeded() {
        int i5 = this.size;
        int[] iArr = this.values;
        if (i5 == iArr.length) {
            int[] iArr2 = new int[((i5 * 3) / 2) + 10];
            System.arraycopy(iArr, 0, iArr2, 0, i5);
            this.values = iArr2;
        }
    }

    public static IntList makeImmutable(int i5) {
        IntList intList = new IntList(1);
        intList.add(i5);
        intList.setImmutable();
        return intList;
    }

    public void add(int i5) {
        throwIfImmutable();
        growIfNeeded();
        int[] iArr = this.values;
        int i6 = this.size;
        int i7 = i6 + 1;
        this.size = i7;
        iArr[i6] = i5;
        if (this.sorted) {
            boolean z4 = true;
            if (i7 > 1) {
                if (i5 < iArr[i7 - 2]) {
                    z4 = false;
                }
                this.sorted = z4;
            }
        }
    }

    public int binarysearch(int i5) {
        int i6 = this.size;
        if (!this.sorted) {
            for (int i7 = 0; i7 < i6; i7++) {
                if (this.values[i7] == i5) {
                    return i7;
                }
            }
            return -i6;
        }
        int i8 = -1;
        int i9 = i6;
        while (i9 > i8 + 1) {
            int i10 = ((i9 - i8) >> 1) + i8;
            if (i5 <= this.values[i10]) {
                i9 = i10;
            } else {
                i8 = i10;
            }
        }
        if (i9 != i6) {
            if (i5 != this.values[i9]) {
                return (-i9) - 1;
            }
            return i9;
        }
        return (-i6) - 1;
    }

    public boolean contains(int i5) {
        return indexOf(i5) >= 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof IntList)) {
            return false;
        }
        IntList intList = (IntList) obj;
        if (this.sorted != intList.sorted || this.size != intList.size) {
            return false;
        }
        for (int i5 = 0; i5 < this.size; i5++) {
            if (this.values[i5] != intList.values[i5]) {
                return false;
            }
        }
        return true;
    }

    public int get(int i5) {
        if (i5 < this.size) {
            try {
                return this.values[i5];
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IndexOutOfBoundsException("n < 0");
            }
        }
        throw new IndexOutOfBoundsException("n >= size()");
    }

    public int hashCode() {
        int i5 = 0;
        for (int i6 = 0; i6 < this.size; i6++) {
            i5 = (i5 * 31) + this.values[i6];
        }
        return i5;
    }

    public int indexOf(int i5) {
        int binarysearch = binarysearch(i5);
        if (binarysearch >= 0) {
            return binarysearch;
        }
        return -1;
    }

    public void insert(int i5, int i6) {
        if (i5 <= this.size) {
            growIfNeeded();
            int[] iArr = this.values;
            int i7 = i5 + 1;
            System.arraycopy(iArr, i5, iArr, i7, this.size - i5);
            int[] iArr2 = this.values;
            iArr2[i5] = i6;
            boolean z4 = true;
            int i8 = this.size + 1;
            this.size = i8;
            if (!this.sorted || ((i5 != 0 && i6 <= iArr2[i5 - 1]) || (i5 != i8 - 1 && i6 >= iArr2[i7]))) {
                z4 = false;
            }
            this.sorted = z4;
            return;
        }
        throw new IndexOutOfBoundsException("n > size()");
    }

    public IntList mutableCopy() {
        int i5 = this.size;
        IntList intList = new IntList(i5);
        for (int i6 = 0; i6 < i5; i6++) {
            intList.add(this.values[i6]);
        }
        return intList;
    }

    public int pop() {
        throwIfImmutable();
        this.size--;
        return get(this.size - 1);
    }

    public void removeIndex(int i5) {
        if (i5 < this.size) {
            int[] iArr = this.values;
            System.arraycopy(iArr, i5 + 1, iArr, i5, (r0 - i5) - 1);
            this.size--;
            return;
        }
        throw new IndexOutOfBoundsException("n >= size()");
    }

    public void set(int i5, int i6) {
        throwIfImmutable();
        if (i5 < this.size) {
            try {
                this.values[i5] = i6;
                this.sorted = false;
                return;
            } catch (ArrayIndexOutOfBoundsException unused) {
                if (i5 >= 0) {
                    return;
                } else {
                    throw new IllegalArgumentException("n < 0");
                }
            }
        }
        throw new IndexOutOfBoundsException("n >= size()");
    }

    public void shrink(int i5) {
        if (i5 >= 0) {
            if (i5 <= this.size) {
                throwIfImmutable();
                this.size = i5;
                return;
            }
            throw new IllegalArgumentException("newSize > size");
        }
        throw new IllegalArgumentException("newSize < 0");
    }

    public int size() {
        return this.size;
    }

    public void sort() {
        throwIfImmutable();
        if (!this.sorted) {
            Arrays.sort(this.values, 0, this.size);
            this.sorted = true;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.size * 5) + 10);
        sb.append('{');
        for (int i5 = 0; i5 < this.size; i5++) {
            if (i5 != 0) {
                sb.append(", ");
            }
            sb.append(this.values[i5]);
        }
        sb.append('}');
        return sb.toString();
    }

    public int top() {
        return get(this.size - 1);
    }

    public IntList(int i5) {
        super(true);
        try {
            this.values = new int[i5];
            this.size = 0;
            this.sorted = true;
        } catch (NegativeArraySizeException unused) {
            throw new IllegalArgumentException("size < 0");
        }
    }

    public static IntList makeImmutable(int i5, int i6) {
        IntList intList = new IntList(2);
        intList.add(i5);
        intList.add(i6);
        intList.setImmutable();
        return intList;
    }

    public void pop(int i5) {
        throwIfImmutable();
        this.size -= i5;
    }
}
