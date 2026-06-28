package org.osmdroid.util;

import android.graphics.Rect;

/* loaded from: classes4.dex */
public abstract class TileLooper {
    private boolean horizontalWrapEnabled;
    protected int mTileZoomLevel;
    protected final Rect mTiles;
    private boolean verticalWrapEnabled;

    public TileLooper() {
        this(false, false);
    }

    public void finaliseLoop() {
    }

    public abstract void handleTile(long j5, int i5, int i6);

    public void initialiseLoop() {
    }

    public boolean isHorizontalWrapEnabled() {
        return this.horizontalWrapEnabled;
    }

    public boolean isVerticalWrapEnabled() {
        return this.verticalWrapEnabled;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void loop(double d5, RectL rectL) {
        TileSystem.getTileFromMercator(rectL, TileSystem.getTileSize(d5), this.mTiles);
        this.mTileZoomLevel = TileSystem.getInputTileZoomLevel(d5);
        initialiseLoop();
        int i5 = 1 << this.mTileZoomLevel;
        int i6 = this.mTiles.left;
        while (true) {
            Rect rect = this.mTiles;
            if (i6 <= rect.right) {
                for (int i7 = rect.top; i7 <= this.mTiles.bottom; i7++) {
                    if ((this.horizontalWrapEnabled || (i6 >= 0 && i6 < i5)) && (this.verticalWrapEnabled || (i7 >= 0 && i7 < i5))) {
                        handleTile(MapTileIndex.getTileIndex(this.mTileZoomLevel, MyMath.mod(i6, i5), MyMath.mod(i7, i5)), i6, i7);
                    }
                }
                i6++;
            } else {
                finaliseLoop();
                return;
            }
        }
    }

    public void setHorizontalWrapEnabled(boolean z4) {
        this.horizontalWrapEnabled = z4;
    }

    public void setVerticalWrapEnabled(boolean z4) {
        this.verticalWrapEnabled = z4;
    }

    public TileLooper(boolean z4, boolean z5) {
        this.mTiles = new Rect();
        this.horizontalWrapEnabled = z4;
        this.verticalWrapEnabled = z5;
    }
}
