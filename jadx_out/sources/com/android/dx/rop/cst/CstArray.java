package com.android.dx.rop.cst;

import a1.i;
import com.android.dx.util.FixedSizeList;

/* loaded from: classes2.dex */
public class CstArray extends Constant {
    private final List list;

    /* loaded from: classes2.dex */
    public static final class List extends FixedSizeList implements Comparable<List> {
        public List(int i5) {
            super(i5);
        }

        public Constant get(int i5) {
            return (Constant) get0(i5);
        }

        public void set(int i5, Constant constant) {
            set0(i5, constant);
        }

        @Override // java.lang.Comparable
        public int compareTo(List list) {
            int size = size();
            int size2 = list.size();
            int i5 = size < size2 ? size : size2;
            for (int i6 = 0; i6 < i5; i6++) {
                int compareTo = ((Constant) get0(i6)).compareTo((Constant) list.get0(i6));
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

    public CstArray(List list) {
        if (list != null) {
            list.throwIfMutable();
            this.list = list;
            return;
        }
        throw new NullPointerException("list == null");
    }

    @Override // com.android.dx.rop.cst.Constant
    protected int compareTo0(Constant constant) {
        return this.list.compareTo(((CstArray) constant).list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CstArray)) {
            return false;
        }
        return this.list.equals(((CstArray) obj).list);
    }

    public List getList() {
        return this.list;
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    @Override // com.android.dx.rop.cst.Constant
    public boolean isCategory2() {
        return false;
    }

    @Override // com.android.dx.util.ToHuman
    public String toHuman() {
        return this.list.toHuman("{", ", ", i.f138d);
    }

    public String toString() {
        return this.list.toString("array{", ", ", i.f138d);
    }

    @Override // com.android.dx.rop.cst.Constant
    public String typeName() {
        return "array";
    }
}
