package com.android.dx.cf.code;

import com.android.dx.util.FixedSizeList;

/* loaded from: classes2.dex */
public final class LineNumberList extends FixedSizeList {
    public static final LineNumberList EMPTY = new LineNumberList(0);

    /* loaded from: classes2.dex */
    public static class Item {
        private final int lineNumber;
        private final int startPc;

        public Item(int i5, int i6) {
            if (i5 >= 0) {
                if (i6 >= 0) {
                    this.startPc = i5;
                    this.lineNumber = i6;
                    return;
                }
                throw new IllegalArgumentException("lineNumber < 0");
            }
            throw new IllegalArgumentException("startPc < 0");
        }

        public int getLineNumber() {
            return this.lineNumber;
        }

        public int getStartPc() {
            return this.startPc;
        }
    }

    public LineNumberList(int i5) {
        super(i5);
    }

    public static LineNumberList concat(LineNumberList lineNumberList, LineNumberList lineNumberList2) {
        if (lineNumberList == EMPTY) {
            return lineNumberList2;
        }
        int size = lineNumberList.size();
        int size2 = lineNumberList2.size();
        LineNumberList lineNumberList3 = new LineNumberList(size + size2);
        for (int i5 = 0; i5 < size; i5++) {
            lineNumberList3.set(i5, lineNumberList.get(i5));
        }
        for (int i6 = 0; i6 < size2; i6++) {
            lineNumberList3.set(size + i6, lineNumberList2.get(i6));
        }
        return lineNumberList3;
    }

    public Item get(int i5) {
        return (Item) get0(i5);
    }

    public int pcToLine(int i5) {
        int size = size();
        int i6 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < size; i8++) {
            Item item = get(i8);
            int startPc = item.getStartPc();
            if (startPc <= i5 && startPc > i6) {
                i7 = item.getLineNumber();
                if (startPc == i5) {
                    break;
                }
                i6 = startPc;
            }
        }
        return i7;
    }

    public void set(int i5, Item item) {
        if (item != null) {
            set0(i5, item);
            return;
        }
        throw new NullPointerException("item == null");
    }

    public void set(int i5, int i6, int i7) {
        set0(i5, new Item(i6, i7));
    }
}
