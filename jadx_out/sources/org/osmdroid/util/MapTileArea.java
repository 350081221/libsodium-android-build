package org.osmdroid.util;

import android.graphics.Rect;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class MapTileArea implements MapTileContainer, IterableWithSize<Long> {
    private int mHeight;
    private int mLeft;
    private int mMapTileUpperBound;
    private int mTop;
    private int mWidth;
    private int mZoom;

    private int cleanValue(int i5) {
        while (i5 < 0) {
            i5 += this.mMapTileUpperBound;
        }
        while (true) {
            int i6 = this.mMapTileUpperBound;
            if (i5 >= i6) {
                i5 -= i6;
            } else {
                return i5;
            }
        }
    }

    private int computeSize(int i5, int i6) {
        while (i5 > i6) {
            i6 += this.mMapTileUpperBound;
        }
        return Math.min(this.mMapTileUpperBound, (i6 - i5) + 1);
    }

    @Override // org.osmdroid.util.MapTileContainer
    public boolean contains(long j5) {
        if (MapTileIndex.getZoom(j5) == this.mZoom && contains(MapTileIndex.getX(j5), this.mLeft, this.mWidth)) {
            return contains(MapTileIndex.getY(j5), this.mTop, this.mHeight);
        }
        return false;
    }

    public int getBottom() {
        return (this.mTop + this.mHeight) % this.mMapTileUpperBound;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getLeft() {
        return this.mLeft;
    }

    public int getRight() {
        return (this.mLeft + this.mWidth) % this.mMapTileUpperBound;
    }

    public int getTop() {
        return this.mTop;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int getZoom() {
        return this.mZoom;
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return new Iterator<Long>() { // from class: org.osmdroid.util.MapTileArea.1
            private int mIndex;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.mIndex < MapTileArea.this.size();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public Long next() {
                if (!hasNext()) {
                    return null;
                }
                int i5 = MapTileArea.this.mLeft + (this.mIndex % MapTileArea.this.mWidth);
                int i6 = MapTileArea.this.mTop + (this.mIndex / MapTileArea.this.mWidth);
                this.mIndex++;
                while (i5 >= MapTileArea.this.mMapTileUpperBound) {
                    i5 -= MapTileArea.this.mMapTileUpperBound;
                }
                while (i6 >= MapTileArea.this.mMapTileUpperBound) {
                    i6 -= MapTileArea.this.mMapTileUpperBound;
                }
                return Long.valueOf(MapTileIndex.getTileIndex(MapTileArea.this.mZoom, i5, i6));
            }
        };
    }

    public MapTileArea reset() {
        this.mWidth = 0;
        return this;
    }

    public MapTileArea set(int i5, int i6, int i7, int i8, int i9) {
        this.mZoom = i5;
        this.mMapTileUpperBound = 1 << i5;
        this.mWidth = computeSize(i6, i8);
        this.mHeight = computeSize(i7, i9);
        this.mLeft = cleanValue(i6);
        this.mTop = cleanValue(i7);
        return this;
    }

    @Override // org.osmdroid.util.IterableWithSize
    public int size() {
        return this.mWidth * this.mHeight;
    }

    public String toString() {
        if (this.mWidth == 0) {
            return "MapTileArea:empty";
        }
        return "MapTileArea:zoom=" + this.mZoom + ",left=" + this.mLeft + ",top=" + this.mTop + ",width=" + this.mWidth + ",height=" + this.mHeight;
    }

    private boolean contains(int i5, int i6, int i7) {
        while (i5 < i6) {
            i5 += this.mMapTileUpperBound;
        }
        return i5 < i6 + i7;
    }

    public MapTileArea set(int i5, Rect rect) {
        return set(i5, rect.left, rect.top, rect.right, rect.bottom);
    }

    public MapTileArea set(MapTileArea mapTileArea) {
        if (mapTileArea.size() == 0) {
            return reset();
        }
        return set(mapTileArea.mZoom, mapTileArea.mLeft, mapTileArea.mTop, mapTileArea.getRight(), mapTileArea.getBottom());
    }
}
