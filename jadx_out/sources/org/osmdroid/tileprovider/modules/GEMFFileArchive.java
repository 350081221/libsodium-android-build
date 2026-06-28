package org.osmdroid.tileprovider.modules;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;
import org.osmdroid.api.IMapView;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.util.GEMFFile;
import org.osmdroid.util.MapTileIndex;

/* loaded from: classes4.dex */
public class GEMFFileArchive implements IArchiveFile {
    private GEMFFile mFile;

    public GEMFFileArchive() {
    }

    public static GEMFFileArchive getGEMFFileArchive(File file) throws IOException {
        return new GEMFFileArchive(file);
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void close() {
        try {
            this.mFile.close();
        } catch (IOException unused) {
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public InputStream getInputStream(e eVar, long j5) {
        return this.mFile.getInputStream(MapTileIndex.getX(j5), MapTileIndex.getY(j5), MapTileIndex.getZoom(j5));
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public Set<String> getTileSources() {
        HashSet hashSet = new HashSet();
        try {
            hashSet.addAll(this.mFile.getSources().values());
        } catch (Exception e5) {
            Log.w(IMapView.LOGTAG, "Error getting tile sources: ", e5);
        }
        return hashSet;
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void init(File file) throws Exception {
        this.mFile = new GEMFFile(file);
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void setIgnoreTileSource(boolean z4) {
    }

    public String toString() {
        return "GEMFFileArchive [mGEMFFile=" + this.mFile.getName() + "]";
    }

    private GEMFFileArchive(File file) throws IOException {
        this.mFile = new GEMFFile(file);
    }
}
