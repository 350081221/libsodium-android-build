package org.osmdroid.tileprovider.modules;

import android.util.Log;
import com.android.multidex.ClassPathElement;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import org.osmdroid.api.IMapView;
import org.osmdroid.tileprovider.tilesource.e;
import org.osmdroid.util.MapTileIndex;

/* loaded from: classes4.dex */
public class ZipFileArchive implements IArchiveFile {
    private boolean mIgnoreTileSource = false;
    protected ZipFile mZipFile;

    public ZipFileArchive() {
    }

    private String getTileRelativeFilenameString(long j5, String str) {
        return str + ClassPathElement.SEPARATOR_CHAR + MapTileIndex.getZoom(j5) + ClassPathElement.SEPARATOR_CHAR + MapTileIndex.getX(j5) + ClassPathElement.SEPARATOR_CHAR + MapTileIndex.getY(j5) + ".png";
    }

    public static ZipFileArchive getZipFileArchive(File file) throws ZipException, IOException {
        return new ZipFileArchive(new ZipFile(file));
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void close() {
        try {
            this.mZipFile.close();
        } catch (IOException unused) {
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public InputStream getInputStream(e eVar, long j5) {
        try {
            if (!this.mIgnoreTileSource) {
                ZipEntry entry = this.mZipFile.getEntry(eVar.getTileRelativeFilenameString(j5));
                if (entry != null) {
                    return this.mZipFile.getInputStream(entry);
                }
                return null;
            }
            Enumeration<? extends ZipEntry> entries = this.mZipFile.entries();
            while (entries.hasMoreElements()) {
                String name = entries.nextElement().getName();
                if (name.contains("/")) {
                    ZipEntry entry2 = this.mZipFile.getEntry(getTileRelativeFilenameString(j5, name.split("/")[0]));
                    if (entry2 != null) {
                        return this.mZipFile.getInputStream(entry2);
                    }
                }
            }
            return null;
        } catch (IOException e5) {
            Log.w(IMapView.LOGTAG, "Error getting zip stream: " + MapTileIndex.toString(j5), e5);
            return null;
        }
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public Set<String> getTileSources() {
        HashSet hashSet = new HashSet();
        try {
            Enumeration<? extends ZipEntry> entries = this.mZipFile.entries();
            while (entries.hasMoreElements()) {
                String name = entries.nextElement().getName();
                if (name.contains("/")) {
                    hashSet.add(name.split("/")[0]);
                }
            }
        } catch (Exception e5) {
            Log.w(IMapView.LOGTAG, "Error getting tile sources: ", e5);
        }
        return hashSet;
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void init(File file) throws Exception {
        this.mZipFile = new ZipFile(file);
    }

    @Override // org.osmdroid.tileprovider.modules.IArchiveFile
    public void setIgnoreTileSource(boolean z4) {
        this.mIgnoreTileSource = z4;
    }

    public String toString() {
        return "ZipFileArchive [mZipFile=" + this.mZipFile.getName() + "]";
    }

    private ZipFileArchive(ZipFile zipFile) {
        this.mZipFile = zipFile;
    }
}
