package org.osmdroid.tileprovider.modules;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import org.osmdroid.api.IMapView;
import org.osmdroid.tileprovider.IRegisterReceiver;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.tileprovider.tilesource.a;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.tileprovider.util.Counters;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.TileSystem;

/* loaded from: classes4.dex */
public class MapTileFilesystemProvider extends MapTileFileStorageProviderBase {
    private final AtomicReference<e> mTileSource;
    private final TileWriter mWriter;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public class TileLoader extends MapTileModuleProviderBase.TileLoader {
        protected TileLoader() {
            super();
        }

        @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader
        public Drawable loadTile(long j5) throws CantContinueException {
            e eVar = (e) MapTileFilesystemProvider.this.mTileSource.get();
            if (eVar == null) {
                return null;
            }
            try {
                Drawable loadTile = MapTileFilesystemProvider.this.mWriter.loadTile(eVar, j5);
                if (loadTile == null) {
                    Counters.fileCacheMiss++;
                } else {
                    Counters.fileCacheHit++;
                }
                return loadTile;
            } catch (a.C0650a e5) {
                Log.w(IMapView.LOGTAG, "LowMemoryException downloading MapTile: " + MapTileIndex.toString(j5) + " : " + e5);
                Counters.fileCacheOOM = Counters.fileCacheOOM + 1;
                throw new CantContinueException(e5);
            } catch (Throwable th) {
                Log.e(IMapView.LOGTAG, "Error loading tile", th);
                return null;
            }
        }
    }

    public MapTileFilesystemProvider(IRegisterReceiver iRegisterReceiver) {
        this(iRegisterReceiver, TileSourceFactory.DEFAULT_TILE_SOURCE);
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMaximumZoomLevel() {
        e eVar = this.mTileSource.get();
        if (eVar != null) {
            return eVar.getMaximumZoomLevel();
        }
        return TileSystem.getMaximumZoomLevel();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public int getMinimumZoomLevel() {
        e eVar = this.mTileSource.get();
        if (eVar != null) {
            return eVar.getMinimumZoomLevel();
        }
        return 0;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    protected String getName() {
        return "File System Cache Provider";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    protected String getThreadGroupName() {
        return "filesystem";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public boolean getUsesDataConnection() {
        return false;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void setTileSource(e eVar) {
        this.mTileSource.set(eVar);
    }

    public MapTileFilesystemProvider(IRegisterReceiver iRegisterReceiver, e eVar) {
        this(iRegisterReceiver, eVar, org.osmdroid.config.a.a().g0() + 604800000);
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public TileLoader getTileLoader() {
        return new TileLoader();
    }

    public MapTileFilesystemProvider(IRegisterReceiver iRegisterReceiver, e eVar, long j5) {
        this(iRegisterReceiver, eVar, j5, org.osmdroid.config.a.a().h0(), org.osmdroid.config.a.a().e());
    }

    public MapTileFilesystemProvider(IRegisterReceiver iRegisterReceiver, e eVar, long j5, int i5, int i6) {
        super(iRegisterReceiver, i5, i6);
        TileWriter tileWriter = new TileWriter();
        this.mWriter = tileWriter;
        this.mTileSource = new AtomicReference<>();
        setTileSource(eVar);
        tileWriter.setMaximumCachedFileAge(j5);
    }
}
