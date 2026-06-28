package com.android.dx.dex.code;

import com.android.dx.rop.cst.Constant;
import com.android.dx.rop.cst.CstType;
import com.android.dx.util.FixedSizeList;
import com.android.dx.util.Hex;

/* loaded from: classes2.dex */
public final class CatchHandlerList extends FixedSizeList implements Comparable<CatchHandlerList> {
    public static final CatchHandlerList EMPTY = new CatchHandlerList(0);

    /* loaded from: classes2.dex */
    public static class Entry implements Comparable<Entry> {
        private final CstType exceptionType;
        private final int handler;

        public Entry(CstType cstType, int i5) {
            if (i5 >= 0) {
                if (cstType != null) {
                    this.handler = i5;
                    this.exceptionType = cstType;
                    return;
                }
                throw new NullPointerException("exceptionType == null");
            }
            throw new IllegalArgumentException("handler < 0");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Entry) || compareTo((Entry) obj) != 0) {
                return false;
            }
            return true;
        }

        public CstType getExceptionType() {
            return this.exceptionType;
        }

        public int getHandler() {
            return this.handler;
        }

        public int hashCode() {
            return (this.handler * 31) + this.exceptionType.hashCode();
        }

        @Override // java.lang.Comparable
        public int compareTo(Entry entry) {
            int i5 = this.handler;
            int i6 = entry.handler;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            return this.exceptionType.compareTo((Constant) entry.exceptionType);
        }
    }

    public CatchHandlerList(int i5) {
        super(i5);
    }

    public boolean catchesAll() {
        int size = size();
        if (size == 0) {
            return false;
        }
        return get(size - 1).getExceptionType().equals(CstType.OBJECT);
    }

    public Entry get(int i5) {
        return (Entry) get0(i5);
    }

    public void set(int i5, CstType cstType, int i6) {
        set0(i5, new Entry(cstType, i6));
    }

    @Override // com.android.dx.util.FixedSizeList, com.android.dx.util.ToHuman
    public String toHuman() {
        return toHuman("", "");
    }

    @Override // java.lang.Comparable
    public int compareTo(CatchHandlerList catchHandlerList) {
        if (this == catchHandlerList) {
            return 0;
        }
        int size = size();
        int size2 = catchHandlerList.size();
        int min = Math.min(size, size2);
        for (int i5 = 0; i5 < min; i5++) {
            int compareTo = get(i5).compareTo(catchHandlerList.get(i5));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        if (size < size2) {
            return -1;
        }
        return size > size2 ? 1 : 0;
    }

    public void set(int i5, Entry entry) {
        set0(i5, entry);
    }

    public String toHuman(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        int size = size();
        sb.append(str);
        sb.append(str2);
        sb.append("catch ");
        for (int i5 = 0; i5 < size; i5++) {
            Entry entry = get(i5);
            if (i5 != 0) {
                sb.append(",\n");
                sb.append(str);
                sb.append("  ");
            }
            if (i5 == size - 1 && catchesAll()) {
                sb.append("<any>");
            } else {
                sb.append(entry.getExceptionType().toHuman());
            }
            sb.append(" -> ");
            sb.append(Hex.u2or4(entry.getHandler()));
        }
        return sb.toString();
    }
}
