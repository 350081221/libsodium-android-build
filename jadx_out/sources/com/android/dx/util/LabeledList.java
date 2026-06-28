package com.android.dx.util;

import java.util.Arrays;

/* loaded from: classes2.dex */
public class LabeledList extends FixedSizeList {
    private final IntList labelToIndex;

    public LabeledList(int i5) {
        super(i5);
        this.labelToIndex = new IntList(i5);
    }

    private void addLabelIndex(int i5, int i6) {
        int size = this.labelToIndex.size();
        for (int i7 = 0; i7 <= i5 - size; i7++) {
            this.labelToIndex.add(-1);
        }
        this.labelToIndex.set(i5, i6);
    }

    private void rebuildLabelToIndex() {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            LabeledItem labeledItem = (LabeledItem) get0(i5);
            if (labeledItem != null) {
                this.labelToIndex.set(labeledItem.getLabel(), i5);
            }
        }
    }

    private void removeLabel(int i5) {
        this.labelToIndex.set(i5, -1);
    }

    public final int[] getLabelsInOrder() {
        int size = size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            LabeledItem labeledItem = (LabeledItem) get0(i5);
            if (labeledItem != null) {
                iArr[i5] = labeledItem.getLabel();
            } else {
                throw new NullPointerException("null at index " + i5);
            }
        }
        Arrays.sort(iArr);
        return iArr;
    }

    public final int getMaxLabel() {
        int size = this.labelToIndex.size() - 1;
        while (size >= 0 && this.labelToIndex.get(size) < 0) {
            size--;
        }
        int i5 = size + 1;
        this.labelToIndex.shrink(i5);
        return i5;
    }

    public final int indexOfLabel(int i5) {
        if (i5 >= this.labelToIndex.size()) {
            return -1;
        }
        return this.labelToIndex.get(i5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void set(int i5, LabeledItem labeledItem) {
        LabeledItem labeledItem2 = (LabeledItem) getOrNull0(i5);
        set0(i5, labeledItem);
        if (labeledItem2 != null) {
            removeLabel(labeledItem2.getLabel());
        }
        if (labeledItem != null) {
            addLabelIndex(labeledItem.getLabel(), i5);
        }
    }

    @Override // com.android.dx.util.FixedSizeList
    public void shrinkToFit() {
        super.shrinkToFit();
        rebuildLabelToIndex();
    }

    public LabeledList(LabeledList labeledList) {
        super(labeledList.size());
        this.labelToIndex = labeledList.labelToIndex.mutableCopy();
        int size = labeledList.size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = labeledList.get0(i5);
            if (obj != null) {
                set0(i5, obj);
            }
        }
    }
}
