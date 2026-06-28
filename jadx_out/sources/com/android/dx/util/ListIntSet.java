package com.android.dx.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class ListIntSet implements IntSet {
    final IntList ints;

    public ListIntSet() {
        IntList intList = new IntList();
        this.ints = intList;
        intList.sort();
    }

    @Override // com.android.dx.util.IntSet
    public void add(int i5) {
        int binarysearch = this.ints.binarysearch(i5);
        if (binarysearch < 0) {
            this.ints.insert(-(binarysearch + 1), i5);
        }
    }

    @Override // com.android.dx.util.IntSet
    public int elements() {
        return this.ints.size();
    }

    @Override // com.android.dx.util.IntSet
    public boolean has(int i5) {
        return this.ints.indexOf(i5) >= 0;
    }

    @Override // com.android.dx.util.IntSet
    public IntIterator iterator() {
        return new IntIterator() { // from class: com.android.dx.util.ListIntSet.1
            private int idx = 0;

            @Override // com.android.dx.util.IntIterator
            public boolean hasNext() {
                return this.idx < ListIntSet.this.ints.size();
            }

            @Override // com.android.dx.util.IntIterator
            public int next() {
                if (hasNext()) {
                    IntList intList = ListIntSet.this.ints;
                    int i5 = this.idx;
                    this.idx = i5 + 1;
                    return intList.get(i5);
                }
                throw new NoSuchElementException();
            }
        };
    }

    @Override // com.android.dx.util.IntSet
    public void merge(IntSet intSet) {
        int i5 = 0;
        if (intSet instanceof ListIntSet) {
            ListIntSet listIntSet = (ListIntSet) intSet;
            int size = this.ints.size();
            int size2 = listIntSet.ints.size();
            int i6 = 0;
            while (i5 < size2 && i6 < size) {
                while (i5 < size2 && listIntSet.ints.get(i5) < this.ints.get(i6)) {
                    add(listIntSet.ints.get(i5));
                    i5++;
                }
                if (i5 == size2) {
                    break;
                }
                while (i6 < size && listIntSet.ints.get(i5) >= this.ints.get(i6)) {
                    i6++;
                }
            }
            while (i5 < size2) {
                add(listIntSet.ints.get(i5));
                i5++;
            }
            this.ints.sort();
            return;
        }
        if (intSet instanceof BitIntSet) {
            BitIntSet bitIntSet = (BitIntSet) intSet;
            while (i5 >= 0) {
                this.ints.add(i5);
                i5 = Bits.findFirst(bitIntSet.bits, i5 + 1);
            }
            this.ints.sort();
            return;
        }
        IntIterator it = intSet.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    @Override // com.android.dx.util.IntSet
    public void remove(int i5) {
        int indexOf = this.ints.indexOf(i5);
        if (indexOf >= 0) {
            this.ints.removeIndex(indexOf);
        }
    }

    public String toString() {
        return this.ints.toString();
    }
}
