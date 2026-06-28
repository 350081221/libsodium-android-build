package org.osmdroid.tileprovider.modules;

import java.io.File;
import java.io.InputStream;
import java.util.Set;
import org.osmdroid.tileprovider.tilesource.e;

/* loaded from: classes4.dex */
public interface IArchiveFile {
    void close();

    InputStream getInputStream(e eVar, long j5);

    Set<String> getTileSources();

    void init(File file) throws Exception;

    void setIgnoreTileSource(boolean z4);
}
