package org.osmdroid.util;

/* loaded from: classes4.dex */
public class MapTileList implements MapTileContainer {
    private int mSize;
    private long[] mTileIndices;

    public void clear() {
        this.mSize = 0;
    }

    @Override // org.osmdroid.util.MapTileContainer
    public boolean contains(long j5) {
        if (this.mTileIndices == null) {
            return false;
        }
        for (int i5 = 0; i5 < this.mSize; i5++) {
            if (this.mTileIndices[i5] == j5) {
                return true;
            }
        }
        return false;
    }

    public void ensureCapacity(int i5) {
        if (i5 == 0) {
            return;
        }
        long[] jArr = this.mTileIndices;
        if (jArr != null && jArr.length >= i5) {
            return;
        }
        synchronized (this) {
            long[] jArr2 = new long[i5];
            long[] jArr3 = this.mTileIndices;
            if (jArr3 != null) {
                System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
            }
            this.mTileIndices = jArr2;
        }
    }

    public long get(int i5) {
        return this.mTileIndices[i5];
    }

    public int getSize() {
        return this.mSize;
    }

    public void put(long j5) {
        ensureCapacity(this.mSize + 1);
        long[] jArr = this.mTileIndices;
        int i5 = this.mSize;
        this.mSize = i5 + 1;
        jArr[i5] = j5;
    }

    public long[] toArray() {
        int i5 = this.mSize;
        long[] jArr = new long[i5];
        long[] jArr2 = this.mTileIndices;
        if (jArr2 != null) {
            System.arraycopy(jArr2, 0, jArr, 0, i5);
        }
        return jArr;
    }

    public void put(int i5, int i6, int i7, int i8, int i9) {
        int i10 = 1 << i5;
        int i11 = (i8 - i6) + 1 + (i8 < i6 ? i10 : 0);
        int i12 = (i9 - i7) + 1 + (i9 < i7 ? i10 : 0);
        ensureCapacity(getSize() + (i11 * i12));
        for (int i13 = 0; i13 < i11; i13++) {
            for (int i14 = 0; i14 < i12; i14++) {
                put(MapTileIndex.getTileIndex(i5, (i6 + i13) % i10, (i7 + i14) % i10));
            }
        }
    }

    public void put(int i5) {
        int i6 = (1 << i5) - 1;
        put(i5, 0, 0, i6, i6);
    }
}
