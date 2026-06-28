package org.osmdroid.util;

/* loaded from: classes4.dex */
public class IntegerAccepter {
    private int mIndex;
    private final int[] mValues;

    public IntegerAccepter(int i5) {
        this.mValues = new int[i5];
    }

    public void add(int i5) {
        int[] iArr = this.mValues;
        int i6 = this.mIndex;
        this.mIndex = i6 + 1;
        iArr[i6] = i5;
    }

    public void end() {
    }

    public void flush() {
        this.mIndex = 0;
    }

    public int getValue(int i5) {
        return this.mValues[i5];
    }

    public void init() {
        this.mIndex = 0;
    }
}
