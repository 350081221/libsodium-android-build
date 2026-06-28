package org.osmdroid.tileprovider.modules;

import android.util.Log;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.a;
import org.osmdroid.tileprovider.IRegisterReceiver;
import org.osmdroid.tileprovider.modules.MapTileModuleProviderBase;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.util.MapTileIndex;
import org.osmdroid.util.TileSystem;

/* loaded from: classes4.dex */
public class MapTileFileArchiveProvider extends MapTileFileStorageProviderBase {
    private final boolean ignoreTileSource;
    private final ArrayList<IArchiveFile> mArchiveFiles;
    private final boolean mSpecificArchivesProvided;
    private final AtomicReference<e> mTileSource;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public class TileLoader extends MapTileModuleProviderBase.TileLoader {
        protected TileLoader() {
            super();
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0075, code lost:
        
            return r2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        
            if (r3 == null) goto L24;
         */
        @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase.TileLoader
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.graphics.drawable.Drawable loadTile(long r7) {
            /*
                r6 = this;
                java.lang.String r0 = "OsmDroid"
                org.osmdroid.tileprovider.modules.MapTileFileArchiveProvider r1 = org.osmdroid.tileprovider.modules.MapTileFileArchiveProvider.this
                java.util.concurrent.atomic.AtomicReference r1 = org.osmdroid.tileprovider.modules.MapTileFileArchiveProvider.access$000(r1)
                java.lang.Object r1 = r1.get()
                org.osmdroid.tileprovider.tilesource.e r1 = (org.osmdroid.tileprovider.tilesource.e) r1
                r2 = 0
                if (r1 != 0) goto L12
                return r2
            L12:
                org.osmdroid.config.c r3 = org.osmdroid.config.a.a()     // Catch: java.lang.Throwable -> L6b
                boolean r3 = r3.M()     // Catch: java.lang.Throwable -> L6b
                if (r3 == 0) goto L34
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
                r3.<init>()     // Catch: java.lang.Throwable -> L6b
                java.lang.String r4 = "Archives - Tile doesn't exist: "
                r3.append(r4)     // Catch: java.lang.Throwable -> L6b
                java.lang.String r4 = org.osmdroid.util.MapTileIndex.toString(r7)     // Catch: java.lang.Throwable -> L6b
                r3.append(r4)     // Catch: java.lang.Throwable -> L6b
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L6b
                android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L6b
            L34:
                org.osmdroid.tileprovider.modules.MapTileFileArchiveProvider r3 = org.osmdroid.tileprovider.modules.MapTileFileArchiveProvider.this     // Catch: java.lang.Throwable -> L6b
                java.io.InputStream r3 = org.osmdroid.tileprovider.modules.MapTileFileArchiveProvider.access$100(r3, r7, r1)     // Catch: java.lang.Throwable -> L6b
                if (r3 == 0) goto L65
                org.osmdroid.config.c r4 = org.osmdroid.config.a.a()     // Catch: java.lang.Throwable -> L63
                boolean r4 = r4.M()     // Catch: java.lang.Throwable -> L63
                if (r4 == 0) goto L5e
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
                r4.<init>()     // Catch: java.lang.Throwable -> L63
                java.lang.String r5 = "Use tile from archive: "
                r4.append(r5)     // Catch: java.lang.Throwable -> L63
                java.lang.String r7 = org.osmdroid.util.MapTileIndex.toString(r7)     // Catch: java.lang.Throwable -> L63
                r4.append(r7)     // Catch: java.lang.Throwable -> L63
                java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L63
                android.util.Log.d(r0, r7)     // Catch: java.lang.Throwable -> L63
            L5e:
                android.graphics.drawable.Drawable r2 = r1.getDrawable(r3)     // Catch: java.lang.Throwable -> L63
                goto L65
            L63:
                r7 = move-exception
                goto L6d
            L65:
                if (r3 == 0) goto L75
            L67:
                org.osmdroid.tileprovider.util.StreamUtils.closeStream(r3)
                goto L75
            L6b:
                r7 = move-exception
                r3 = r2
            L6d:
                java.lang.String r8 = "Error loading tile"
                android.util.Log.e(r0, r8, r7)     // Catch: java.lang.Throwable -> L76
                if (r3 == 0) goto L75
                goto L67
            L75:
                return r2
            L76:
                r7 = move-exception
                if (r3 == 0) goto L7c
                org.osmdroid.tileprovider.util.StreamUtils.closeStream(r3)
            L7c:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.tileprovider.modules.MapTileFileArchiveProvider.TileLoader.loadTile(long):android.graphics.drawable.Drawable");
        }
    }

    public MapTileFileArchiveProvider(IRegisterReceiver iRegisterReceiver, e eVar, IArchiveFile[] iArchiveFileArr) {
        this(iRegisterReceiver, eVar, iArchiveFileArr, false);
    }

    private void clearArcives() {
        while (!this.mArchiveFiles.isEmpty()) {
            IArchiveFile iArchiveFile = this.mArchiveFiles.get(0);
            if (iArchiveFile != null) {
                iArchiveFile.close();
            }
            this.mArchiveFiles.remove(0);
        }
    }

    private void findArchiveFiles() {
        File[] listFiles;
        clearArcives();
        File u4 = a.a().u();
        if (u4 != null && (listFiles = u4.listFiles()) != null) {
            for (File file : listFiles) {
                IArchiveFile archiveFile = ArchiveFileFactory.getArchiveFile(file);
                if (archiveFile != null) {
                    archiveFile.setIgnoreTileSource(this.ignoreTileSource);
                    this.mArchiveFiles.add(archiveFile);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized InputStream getInputStream(long j5, e eVar) {
        InputStream inputStream;
        Iterator<IArchiveFile> it = this.mArchiveFiles.iterator();
        while (it.hasNext()) {
            IArchiveFile next = it.next();
            if (next != null && (inputStream = next.getInputStream(eVar, j5)) != null) {
                if (a.a().M()) {
                    Log.d(IMapView.LOGTAG, "Found tile " + MapTileIndex.toString(j5) + " in " + next);
                }
                return inputStream;
            }
        }
        return null;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase, org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void detach() {
        clearArcives();
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
        return "File Archive Provider";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    protected String getThreadGroupName() {
        return "filearchive";
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public boolean getUsesDataConnection() {
        return false;
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase
    protected void onMediaMounted() {
        if (!this.mSpecificArchivesProvided) {
            findArchiveFiles();
        }
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileFileStorageProviderBase
    protected void onMediaUnmounted() {
        if (!this.mSpecificArchivesProvided) {
            findArchiveFiles();
        }
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public void setTileSource(e eVar) {
        this.mTileSource.set(eVar);
    }

    public MapTileFileArchiveProvider(IRegisterReceiver iRegisterReceiver, e eVar, IArchiveFile[] iArchiveFileArr, boolean z4) {
        super(iRegisterReceiver, a.a().h0(), a.a().e());
        this.mArchiveFiles = new ArrayList<>();
        this.mTileSource = new AtomicReference<>();
        this.ignoreTileSource = z4;
        setTileSource(eVar);
        if (iArchiveFileArr == null) {
            this.mSpecificArchivesProvided = false;
            findArchiveFiles();
            return;
        }
        this.mSpecificArchivesProvided = true;
        for (int length = iArchiveFileArr.length - 1; length >= 0; length--) {
            this.mArchiveFiles.add(iArchiveFileArr[length]);
        }
    }

    @Override // org.osmdroid.tileprovider.modules.MapTileModuleProviderBase
    public TileLoader getTileLoader() {
        return new TileLoader();
    }

    public MapTileFileArchiveProvider(IRegisterReceiver iRegisterReceiver, e eVar) {
        this(iRegisterReceiver, eVar, null);
    }
}
