package com.android.dx.cf.code;

import com.android.dx.util.Hex;
import com.android.dx.util.IntList;
import com.android.dx.util.LabeledItem;

/* loaded from: classes2.dex */
public final class ByteBlock implements LabeledItem {
    private final ByteCatchList catches;
    private final int end;
    private final int label;
    private final int start;
    private final IntList successors;

    public ByteBlock(int i5, int i6, int i7, IntList intList, ByteCatchList byteCatchList) {
        if (i5 >= 0) {
            if (i6 >= 0) {
                if (i7 > i6) {
                    if (intList != null) {
                        int size = intList.size();
                        for (int i8 = 0; i8 < size; i8++) {
                            if (intList.get(i8) < 0) {
                                throw new IllegalArgumentException("successors[" + i8 + "] == " + intList.get(i8));
                            }
                        }
                        if (byteCatchList != null) {
                            this.label = i5;
                            this.start = i6;
                            this.end = i7;
                            this.successors = intList;
                            this.catches = byteCatchList;
                            return;
                        }
                        throw new NullPointerException("catches == null");
                    }
                    throw new NullPointerException("targets == null");
                }
                throw new IllegalArgumentException("end <= start");
            }
            throw new IllegalArgumentException("start < 0");
        }
        throw new IllegalArgumentException("label < 0");
    }

    public ByteCatchList getCatches() {
        return this.catches;
    }

    public int getEnd() {
        return this.end;
    }

    @Override // com.android.dx.util.LabeledItem
    public int getLabel() {
        return this.label;
    }

    public int getStart() {
        return this.start;
    }

    public IntList getSuccessors() {
        return this.successors;
    }

    public String toString() {
        return '{' + Hex.u2(this.label) + ": " + Hex.u2(this.start) + ".." + Hex.u2(this.end) + '}';
    }
}
