package org.osmdroid.tileprovider.modules;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;
import org.osmdroid.api.IMapView;
import org.osmdroid.tileprovider.IRegisterReceiver;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.tilesource.a;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.tileprovider.util.Counters;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.TileSystem;

/* loaded from: classes4.dex */
public class MapTileSqlCacheProvider extends MapTileFileStorageProviderBase {
    private static final String[] columns = {DatabaseFileArchive.COLUMN_TILE, "expires"};
    private final AtomicReference<e> mTileSource;
    private SqlTileWriter mWriter;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public class TileLoader extends MapTileModuleProviderBase.TileLoader {
        protected TileLoader() {
            super();
        }

        @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader
        public Drawable loadTile(long j5) throws CantContinueException {
            e eVar = (e) MapTileSqlCacheProvider.this.mTileSource.get();
            if (eVar == null) {
                return null;
            }
            if (MapTileSqlCacheProvider.this.mWriter != null) {
                try {
                    Drawable loadTile = MapTileSqlCacheProvider.this.mWriter.loadTile(eVar, j5);
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
            Log.d(IMapView.LOGTAG, "TileLoader failed to load tile due to mWriter being null (map shutdown?)");
            return null;
        }
    }

    @Deprecated
    public MapTileSqlCacheProvider(IRegisterReceiver iRegisterReceiver, e eVar, long j5) {
        this(iRegisterReceiver, eVar);
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase, org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void detach() {
        SqlTileWriter sqlTileWriter = this.mWriter;
        if (sqlTileWriter != null) {
            sqlTileWriter.onDetach();
        }
        this.mWriter = null;
        super.detach();
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
        return "SQL Cache Archive Provider";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    protected String getThreadGroupName() {
        return "sqlcache";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public boolean getUsesDataConnection() {
        return false;
    }

    public boolean hasTile(long j5) {
        e eVar = this.mTileSource.get();
        if (eVar == null || this.mWriter.getExpirationTimestamp(eVar, j5) == null) {
            return false;
        }
        return true;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase
    protected void onMediaMounted() {
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase
    protected void onMediaUnmounted() {
        SqlTileWriter sqlTileWriter = this.mWriter;
        if (sqlTileWriter != null) {
            sqlTileWriter.onDetach();
        }
        this.mWriter = new SqlTileWriter();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void setTileSource(e eVar) {
        this.mTileSource.set(eVar);
    }

    public MapTileSqlCacheProvider(IRegisterReceiver iRegisterReceiver, e eVar) {
        super(iRegisterReceiver, org.osmdroid.config.a.a().h0(), org.osmdroid.config.a.a().e());
        this.mTileSource = new AtomicReference<>();
        setTileSource(eVar);
        this.mWriter = new SqlTileWriter();
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public TileLoader getTileLoader() {
        return new TileLoader();
    }
}
