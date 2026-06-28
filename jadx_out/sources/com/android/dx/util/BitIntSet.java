package com.android.dx.util;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class BitIntSet implements IntSet {
    int[] bits;

    public BitIntSet(int i5) {
        this.bits = Bits.makeBitSet(i5);
    }

    private void ensureCapacity(int i5) {
        if (i5 >= Bits.getMax(this.bits)) {
            int[] makeBitSet = Bits.makeBitSet(Math.max(i5 + 1, Bits.getMax(this.bits) * 2));
            int[] iArr = this.bits;
            System.arraycopy(iArr, 0, makeBitSet, 0, iArr.length);
            this.bits = makeBitSet;
        }
    }

    @Override // com.android.dx.util.IntSet
    public void add(int i5) {
        ensureCapacity(i5);
        Bits.set(this.bits, i5, true);
    }

    @Override // com.android.dx.util.IntSet
    public int elements() {
        return Bits.bitCount(this.bits);
    }

    @Override // com.android.dx.util.IntSet
    public boolean has(int i5) {
        return i5 < Bits.getMax(this.bits) && Bits.get(this.bits, i5);
    }

    @Override // com.android.dx.util.IntSet
    public IntIterator iterator() {
        return new IntIterator() { // from class: com.android.dx.util.BitIntSet.1
            private int idx;

            {
                this.idx = Bits.findFirst(BitIntSet.this.bits, 0);
            }

            @Override // com.android.dx.util.IntIterator
            public boolean hasNext() {
                return this.idx >= 0;
            }

            @Override // com.android.dx.util.IntIterator
            public int next() {
                if (hasNext()) {
                    int i5 = this.idx;
                    this.idx = Bits.findFirst(BitIntSet.this.bits, i5 + 1);
                    return i5;
                }
                throw new NoSuchElementException();
            }
        };
    }

    @Override // com.android.dx.util.IntSet
    public void merge(IntSet intSet) {
        if (intSet instanceof BitIntSet) {
            BitIntSet bitIntSet = (BitIntSet) intSet;
            ensureCapacity(Bits.getMax(bitIntSet.bits) + 1);
            Bits.or(this.bits, bitIntSet.bits);
        } else {
            if (intSet instanceof ListIntSet) {
                ListIntSet listIntSet = (ListIntSet) intSet;
                int size = listIntSet.ints.size();
                if (size > 0) {
                    ensureCapacity(listIntSet.ints.get(size - 1));
                }
                for (int i5 = 0; i5 < listIntSet.ints.size(); i5++) {
                    Bits.set(this.bits, listIntSet.ints.get(i5), true);
                }
                return;
            }
            IntIterator it = intSet.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
        }
    }

    @Override // com.android.dx.util.IntSet
    public void remove(int i5) {
        if (i5 < Bits.getMax(this.bits)) {
            Bits.set(this.bits, i5, false);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int findFirst = Bits.findFirst(this.bits, 0);
        boolean z4 = true;
        while (findFirst >= 0) {
            if (!z4) {
                sb.append(", ");
            }
            sb.append(findFirst);
            findFirst = Bits.findFirst(this.bits, findFirst + 1);
            z4 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
