package com.android.dx.dex.code;

import com.android.dx.util.FixedSizeList;

/* loaded from: classes2.dex */
public final class CatchTable extends FixedSizeList implements Comparable<CatchTable> {
    public static final CatchTable EMPTY = new CatchTable(0);

    /* loaded from: classes2.dex */
    public static class Entry implements Comparable<Entry> {
        private final int end;
        private final CatchHandlerList handlers;
        private final int start;

        public Entry(int i5, int i6, CatchHandlerList catchHandlerList) {
            if (i5 >= 0) {
                if (i6 > i5) {
                    if (!catchHandlerList.isMutable()) {
                        this.start = i5;
                        this.end = i6;
                        this.handlers = catchHandlerList;
                        return;
                    }
                    throw new IllegalArgumentException("handlers.isMutable()");
                }
                throw new IllegalArgumentException("end <= start");
            }
            throw new IllegalArgumentException("start < 0");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry) || compareTo((Entry) obj) != 0) {
                return false;
            }
            return true;
        }

        public int getEnd() {
            return this.end;
        }

        public CatchHandlerList getHandlers() {
            return this.handlers;
        }

        public int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (((this.start * 31) + this.end) * 31) + this.handlers.hashCode();
        }

        @Override // java.lang.Comparable
        public int compareTo(Entry entry) {
            int i5 = this.start;
            int i6 = entry.start;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = this.end;
            int i8 = entry.end;
            if (i7 < i8) {
                return -1;
            }
            if (i7 > i8) {
                return 1;
            }
            return this.handlers.compareTo(entry.handlers);
        }
    }

    public CatchTable(int i5) {
        super(i5);
    }

    public Entry get(int i5) {
        return (Entry) get0(i5);
    }

    public void set(int i5, Entry entry) {
        set0(i5, entry);
    }

    @Override // java.lang.Comparable
    public int compareTo(CatchTable catchTable) {
        if (this == catchTable) {
            return 0;
        }
        int size = size();
        int size2 = catchTable.size();
        int min = Math.min(size, size2);
        for (int i5 = 0; i5 < min; i5++) {
            int compareTo = get(i5).compareTo(catchTable.get(i5));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }
}
