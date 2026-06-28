package com.lody.virtual.helper.collection;

import o0.a;

/* loaded from: classes3.dex */
public class SparseArray<E> implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;

    public SparseArray() {
        this(10);
    }

    private void gc() {
        int i5 = this.mSize;
        int[] iArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            Object obj = objArr[i7];
            if (obj != DELETED) {
                if (i7 != i6) {
                    iArr[i6] = iArr[i7];
                    objArr[i6] = obj;
                    objArr[i7] = null;
                }
                i6++;
            }
        }
        this.mGarbage = false;
        this.mSize = i6;
    }

    public void append(int i5, E e5) {
        int i6 = this.mSize;
        if (i6 != 0 && i5 <= this.mKeys[i6 - 1]) {
            put(i5, e5);
            return;
        }
        if (this.mGarbage && i6 >= this.mKeys.length) {
            gc();
        }
        int i7 = this.mSize;
        if (i7 >= this.mKeys.length) {
            int idealIntArraySize = ContainerHelpers.idealIntArraySize(i7 + 1);
            int[] iArr = new int[idealIntArraySize];
            Object[] objArr = new Object[idealIntArraySize];
            int[] iArr2 = this.mKeys;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.mValues;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.mKeys = iArr;
            this.mValues = objArr;
        }
        this.mKeys[i7] = i5;
        this.mValues[i7] = e5;
        this.mSize = i7 + 1;
    }

    public void clear() {
        int i5 = this.mSize;
        Object[] objArr = this.mValues;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    public void delete(int i5) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i5);
        if (binarySearch >= 0) {
            Object[] objArr = this.mValues;
            Object obj = objArr[binarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[binarySearch] = obj2;
                this.mGarbage = true;
            }
        }
    }

    public E get(int i5) {
        return get(i5, null);
    }

    public int indexOfKey(int i5) {
        if (this.mGarbage) {
            gc();
        }
        return ContainerHelpers.binarySearch(this.mKeys, this.mSize, i5);
    }

    public int indexOfValue(E e5) {
        if (this.mGarbage) {
            gc();
        }
        for (int i5 = 0; i5 < this.mSize; i5++) {
            if (this.mValues[i5] == e5) {
                return i5;
            }
        }
        return -1;
    }

    public int keyAt(int i5) {
        if (this.mGarbage) {
            gc();
        }
        return this.mKeys[i5];
    }

    public void put(int i5, E e5) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i5);
        if (binarySearch >= 0) {
            this.mValues[binarySearch] = e5;
            return;
        }
        int i6 = ~binarySearch;
        int i7 = this.mSize;
        if (i6 < i7) {
            Object[] objArr = this.mValues;
            if (objArr[i6] == DELETED) {
                this.mKeys[i6] = i5;
                objArr[i6] = e5;
                return;
            }
        }
        if (this.mGarbage && i7 >= this.mKeys.length) {
            gc();
            i6 = ~ContainerHelpers.binarySearch(this.mKeys, this.mSize, i5);
        }
        int i8 = this.mSize;
        if (i8 >= this.mKeys.length) {
            int idealIntArraySize = ContainerHelpers.idealIntArraySize(i8 + 1);
            int[] iArr = new int[idealIntArraySize];
            Object[] objArr2 = new Object[idealIntArraySize];
            int[] iArr2 = this.mKeys;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.mValues;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mKeys = iArr;
            this.mValues = objArr2;
        }
        int i9 = this.mSize;
        if (i9 - i6 != 0) {
            int[] iArr3 = this.mKeys;
            int i10 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i10, i9 - i6);
            Object[] objArr4 = this.mValues;
            System.arraycopy(objArr4, i6, objArr4, i10, this.mSize - i6);
        }
        this.mKeys[i6] = i5;
        this.mValues[i6] = e5;
        this.mSize++;
    }

    public void remove(int i5) {
        delete(i5);
    }

    public void removeAt(int i5) {
        Object[] objArr = this.mValues;
        Object obj = objArr[i5];
        Object obj2 = DELETED;
        if (obj != obj2) {
            objArr[i5] = obj2;
            this.mGarbage = true;
        }
    }

    public void removeAtRange(int i5, int i6) {
        int min = Math.min(this.mSize, i6 + i5);
        while (i5 < min) {
            removeAt(i5);
            i5++;
        }
    }

    public E removeReturnOld(int i5) {
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i5);
        if (binarySearch >= 0) {
            Object[] objArr = this.mValues;
            E e5 = (E) objArr[binarySearch];
            Object obj = DELETED;
            if (e5 != obj) {
                objArr[binarySearch] = obj;
                this.mGarbage = true;
                return e5;
            }
            return null;
        }
        return null;
    }

    public void setValueAt(int i5, E e5) {
        if (this.mGarbage) {
            gc();
        }
        this.mValues[i5] = e5;
    }

    public int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.mSize * 28);
        sb.append('{');
        for (int i5 = 0; i5 < this.mSize; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i5));
            sb.append(a.f20835h);
            E valueAt = valueAt(i5);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public E valueAt(int i5) {
        if (this.mGarbage) {
            gc();
        }
        return (E) this.mValues[i5];
    }

    public SparseArray(int i5) {
        this.mGarbage = false;
        if (i5 == 0) {
            this.mKeys = ContainerHelpers.EMPTY_INTS;
            this.mValues = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            int idealIntArraySize = ContainerHelpers.idealIntArraySize(i5);
            this.mKeys = new int[idealIntArraySize];
            this.mValues = new Object[idealIntArraySize];
        }
        this.mSize = 0;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SparseArray<E> m6434clone() {
        SparseArray<E> sparseArray = null;
        try {
            SparseArray<E> sparseArray2 = (SparseArray) super.clone();
            try {
                sparseArray2.mKeys = (int[]) this.mKeys.clone();
                sparseArray2.mValues = (Object[]) this.mValues.clone();
                return sparseArray2;
            } catch (CloneNotSupportedException unused) {
                sparseArray = sparseArray2;
                return sparseArray;
            }
        } catch (CloneNotSupportedException unused2) {
        }
    }

    public E get(int i5, E e5) {
        E e6;
        int binarySearch = ContainerHelpers.binarySearch(this.mKeys, this.mSize, i5);
        return (binarySearch < 0 || (e6 = (E) this.mValues[binarySearch]) == DELETED) ? e5 : e6;
    }
}
