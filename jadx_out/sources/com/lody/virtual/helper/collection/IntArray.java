package com.lody.virtual.helper.collection;

import java.util.Arrays;

/* loaded from: classes3.dex */
public class IntArray {
    private static final int[] EMPTY_ARRAY = new int[0];
    private int[] mData;
    private int mSize;

    private IntArray() {
    }

    private void ensureCapacity() {
        int i5 = this.mSize;
        int[] iArr = this.mData;
        if (i5 <= iArr.length) {
            return;
        }
        int length = iArr.length;
        while (this.mSize > length) {
            length = ((length * 3) / 2) + 1;
        }
        this.mData = Arrays.copyOf(this.mData, length);
    }

    public static IntArray of(int... iArr) {
        IntArray intArray = new IntArray();
        intArray.mData = Arrays.copyOf(iArr, iArr.length);
        intArray.mSize = iArr.length;
        return intArray;
    }

    public void add(int i5) {
        this.mSize++;
        ensureCapacity();
        this.mData[this.mSize - 1] = i5;
    }

    public void addAll(int[] iArr) {
        int i5 = this.mSize;
        this.mSize = iArr.length + i5;
        ensureCapacity();
        System.arraycopy(iArr, 0, this.mData, i5, iArr.length);
    }

    public void clear() {
        this.mSize = 0;
    }

    public boolean contains(int i5) {
        for (int i6 = 0; i6 < this.mSize; i6++) {
            if (this.mData[i6] == i5) {
                return true;
            }
        }
        return false;
    }

    public int get(int i5) {
        return this.mData[i5];
    }

    public int[] getAll() {
        int i5 = this.mSize;
        return i5 > 0 ? Arrays.copyOf(this.mData, i5) : EMPTY_ARRAY;
    }

    public int[] getRange(int i5, int i6) {
        return Arrays.copyOfRange(this.mData, i5, i6);
    }

    public void optimize() {
        int i5 = this.mSize;
        int[] iArr = this.mData;
        if (i5 > iArr.length) {
            this.mData = Arrays.copyOf(iArr, i5);
        }
    }

    public void remove(int i5) {
        remove(i5, 1);
    }

    public void set(int i5, int i6) {
        if (i5 < this.mSize) {
            this.mData[i5] = i6;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i5 + " is greater than the list size " + this.mSize);
    }

    public int size() {
        return this.mSize;
    }

    public IntArray(int i5) {
        this.mData = new int[i5];
    }

    public void remove(int i5, int i6) {
        int[] iArr = this.mData;
        System.arraycopy(iArr, i5 + i6, iArr, i5, (this.mSize - i5) - i6);
        this.mSize -= i6;
    }
}
