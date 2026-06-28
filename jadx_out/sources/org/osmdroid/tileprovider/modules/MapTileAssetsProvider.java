package org.osmdroid.tileprovider.modules;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;
import org.osmdroid.tileprovider.IRegisterReceiver;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.tileprovider.tilesource.a;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.util.TileSystem;

/* loaded from: classes4.dex */
public class MapTileAssetsProvider extends MapTileFileStorageProviderBase {
    private final AssetManager mAssets;
    private final AtomicReference<e> mTileSource;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public class TileLoader extends MapTileModuleProviderBase.TileLoader {
        private AssetManager mAssets;

        public TileLoader(AssetManager assetManager) {
            super();
            this.mAssets = assetManager;
        }

        @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader
        public Drawable loadTile(long j5) throws CantContinueException {
            e eVar = (e) MapTileAssetsProvider.this.mTileSource.get();
            if (eVar == null) {
                return null;
            }
            try {
                return eVar.getDrawable(this.mAssets.open(eVar.getTileRelativeFilenameString(j5)));
            } catch (IOException unused) {
                return null;
            } catch (a.C0650a e5) {
                throw new CantContinueException(e5);
            }
        }
    }

    public MapTileAssetsProvider(IRegisterReceiver iRegisterReceiver, AssetManager assetManager) {
        this(iRegisterReceiver, assetManager, TileSourceFactory.DEFAULT_TILE_SOURCE);
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
        return "Assets Cache Provider";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    protected String getThreadGroupName() {
        return "assets";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public boolean getUsesDataConnection() {
        return false;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void setTileSource(e eVar) {
        this.mTileSource.set(eVar);
    }

    public MapTileAssetsProvider(IRegisterReceiver iRegisterReceiver, AssetManager assetManager, e eVar) {
        this(iRegisterReceiver, assetManager, eVar, org.osmdroid.config.a.a().J(), org.osmdroid.config.a.a().c());
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public TileLoader getTileLoader() {
        return new TileLoader(this.mAssets);
    }

    public MapTileAssetsProvider(IRegisterReceiver iRegisterReceiver, AssetManager assetManager, e eVar, int i5, int i6) {
        super(iRegisterReceiver, i5, i6);
        this.mTileSource = new AtomicReference<>();
        setTileSource(eVar);
        this.mAssets = assetManager;
    }
}
