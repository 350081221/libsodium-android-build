package org.osmdroid.tileprovider.modules;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.osmdroid.config.a;
import org.osmdroid.tileprovider.BitmapPool;
import org.osmdroid.tileprovider.ExpirableBitmapDrawable;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.TileSystem;

/* loaded from: classes4.dex */
public class MapTileApproximater extends MapTileModuleProviderBase {
    private final List<MapTileModuleProviderBase> mProviders;
    private int minZoomLevel;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public class TileLoader extends MapTileModuleProviderBase.TileLoader {
        protected TileLoader() {
            super();
        }

        @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader
        public Drawable loadTile(long j5) {
            Bitmap approximateTileFromLowerZoom = MapTileApproximater.this.approximateTileFromLowerZoom(j5);
            if (approximateTileFromLowerZoom != null) {
                BitmapDrawable bitmapDrawable = new BitmapDrawable(approximateTileFromLowerZoom);
                ExpirableBitmapDrawable.setState(bitmapDrawable, -3);
                return bitmapDrawable;
            }
            return null;
        }
    }

    public MapTileApproximater() {
        this(a.a().h0(), a.a().e());
    }

    private void computeZoomLevels() {
        this.minZoomLevel = 0;
        Iterator<MapTileModuleProviderBase> it = this.mProviders.iterator();
        boolean z4 = true;
        while (it.hasNext()) {
            int minimumZoomLevel = it.next().getMinimumZoomLevel();
            if (z4) {
                this.minZoomLevel = minimumZoomLevel;
                z4 = false;
            } else {
                this.minZoomLevel = Math.min(this.minZoomLevel, minimumZoomLevel);
            }
        }
    }

    public static Bitmap getTileBitmap(int i5) {
        Bitmap obtainSizedBitmapFromPool = BitmapPool.getInstance().obtainSizedBitmapFromPool(i5, i5);
        if (obtainSizedBitmapFromPool != null) {
            obtainSizedBitmapFromPool.setHasAlpha(true);
            obtainSizedBitmapFromPool.eraseColor(0);
            return obtainSizedBitmapFromPool;
        }
        return Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
    }

    public void addProvider(MapTileModuleProviderBase mapTileModuleProviderBase) {
        this.mProviders.add(mapTileModuleProviderBase);
        computeZoomLevels();
    }

    public Bitmap approximateTileFromLowerZoom(long j5) {
        for (int i5 = 1; MapTileIndex.getZoom(j5) - i5 >= 0; i5++) {
            Bitmap approximateTileFromLowerZoom = approximateTileFromLowerZoom(j5, i5);
            if (approximateTileFromLowerZoom != null) {
                return approximateTileFromLowerZoom;
            }
        }
        return null;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void detach() {
        super.detach();
        this.mProviders.clear();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMaximumZoomLevel() {
        return TileSystem.getMaximumZoomLevel();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMinimumZoomLevel() {
        return this.minZoomLevel;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    protected String getName() {
        return "Offline Tile Approximation Provider";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    protected String getThreadGroupName() {
        return "approximater";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public boolean getUsesDataConnection() {
        return false;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    @Deprecated
    public void setTileSource(e eVar) {
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public TileLoader getTileLoader() {
        return new TileLoader();
    }

    public Bitmap approximateTileFromLowerZoom(long j5, int i5) {
        Iterator<MapTileModuleProviderBase> it = this.mProviders.iterator();
        while (it.hasNext()) {
            Bitmap approximateTileFromLowerZoom = approximateTileFromLowerZoom(it.next(), j5, i5);
            if (approximateTileFromLowerZoom != null) {
                return approximateTileFromLowerZoom;
            }
        }
        return null;
    }

    public MapTileApproximater(int i5, int i6) {
        super(i5, i6);
        this.mProviders = new CopyOnWriteArrayList();
    }

    public static Bitmap approximateTileFromLowerZoom(MapTileModuleProviderBase mapTileModuleProviderBase, long j5, int i5) {
        int zoom;
        if (i5 <= 0 || (zoom = MapTileIndex.getZoom(j5) - i5) < mapTileModuleProviderBase.getMinimumZoomLevel() || zoom > mapTileModuleProviderBase.getMaximumZoomLevel()) {
            return null;
        }
        try {
            Drawable loadTileIfReachable = mapTileModuleProviderBase.getTileLoader().loadTileIfReachable(MapTileIndex.getTileIndex(zoom, MapTileIndex.getX(j5) >> i5, MapTileIndex.getY(j5) >> i5));
            if (loadTileIfReachable instanceof BitmapDrawable) {
                return approximateTileFromLowerZoom((BitmapDrawable) loadTileIfReachable, j5, i5);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap approximateTileFromLowerZoom(android.graphics.drawable.BitmapDrawable r10, long r11, int r13) {
        /*
            r0 = 0
            if (r13 > 0) goto L4
            return r0
        L4:
            android.graphics.Bitmap r1 = r10.getBitmap()
            int r1 = r1.getWidth()
            android.graphics.Bitmap r2 = getTileBitmap(r1)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            boolean r4 = r10 instanceof org.osmdroid.tileprovider.ReusableBitmapDrawable
            if (r4 == 0) goto L1d
            r5 = r10
            org.osmdroid.tileprovider.ReusableBitmapDrawable r5 = (org.osmdroid.tileprovider.ReusableBitmapDrawable) r5
            goto L1e
        L1d:
            r5 = r0
        L1e:
            if (r4 == 0) goto L23
            r5.beginUsingDrawable()
        L23:
            r6 = 0
            if (r4 == 0) goto L2f
            boolean r7 = r5.isBitmapValid()     // Catch: java.lang.Throwable -> L2d
            if (r7 == 0) goto L58
            goto L2f
        L2d:
            r10 = move-exception
            goto L61
        L2f:
            int r7 = r1 >> r13
            if (r7 != 0) goto L34
            goto L58
        L34:
            int r8 = org.osmdroid.util.MapTileIndex.getX(r11)     // Catch: java.lang.Throwable -> L2d
            r9 = 1
            int r13 = r9 << r13
            int r8 = r8 % r13
            int r8 = r8 * r7
            int r11 = org.osmdroid.util.MapTileIndex.getY(r11)     // Catch: java.lang.Throwable -> L2d
            int r11 = r11 % r13
            int r11 = r11 * r7
            android.graphics.Rect r12 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L2d
            int r13 = r8 + r7
            int r7 = r7 + r11
            r12.<init>(r8, r11, r13, r7)     // Catch: java.lang.Throwable -> L2d
            android.graphics.Rect r11 = new android.graphics.Rect     // Catch: java.lang.Throwable -> L2d
            r11.<init>(r6, r6, r1, r1)     // Catch: java.lang.Throwable -> L2d
            android.graphics.Bitmap r10 = r10.getBitmap()     // Catch: java.lang.Throwable -> L2d
            r3.drawBitmap(r10, r12, r11, r0)     // Catch: java.lang.Throwable -> L2d
            r6 = r9
        L58:
            if (r4 == 0) goto L5d
            r5.finishUsingDrawable()
        L5d:
            if (r6 != 0) goto L60
            return r0
        L60:
            return r2
        L61:
            if (r4 == 0) goto L66
            r5.finishUsingDrawable()
        L66:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.modules.MapTileApproximater.approximateTileFromLowerZoom(android.graphics.drawable.BitmapDrawable, long, int):android.graphics.Bitmap");
    }
}
