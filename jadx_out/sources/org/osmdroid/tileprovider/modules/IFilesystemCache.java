package org.osmdroid.tileprovider.modules;

import android.graphics.drawable.Drawable;
import java.io.InputStream;
import org.osmdroid.tileprovider.tilesource.e;

/* loaded from: classes4.dex */
public interface IFilesystemCache {
    boolean exists(e eVar, long j5);

    Long getExpirationTimestamp(e eVar, long j5);

    Drawable loadTile(e eVar, long j5) throws Exception;

    void onDetach();

    boolean remove(e eVar, long j5);

    boolean saveFile(e eVar, long j5, InputStream inputStream, Long l5);
}
