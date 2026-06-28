package com.android.dx.cf.code;

import com.android.dx.util.Hex;
import com.android.dx.util.LabeledItem;
import com.android.dx.util.LabeledList;

/* loaded from: classes2.dex */
public final class ByteBlockList extends LabeledList {
    public ByteBlockList(int i5) {
        super(i5);
    }

    public ByteBlock get(int i5) {
        return (ByteBlock) get0(i5);
    }

    public ByteBlock labelToBlock(int i5) {
        int indexOfLabel = indexOfLabel(i5);
        if (indexOfLabel >= 0) {
            return get(indexOfLabel);
        }
        throw new IllegalArgumentException("no such label: " + Hex.u2(i5));
    }

    public void set(int i5, ByteBlock byteBlock) {
        super.set(i5, (LabeledItem) byteBlock);
    }
}
