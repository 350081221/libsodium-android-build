package org.osmdroid.tileprovider.tilesource;

import android.graphics.drawable.Drawable;
import java.io.InputStream;
import org.osmdroid.tileprovider.tilesource.a;

/* loaded from: classes4.dex */
public interface e {
    String getCopyrightNotice();

    Drawable getDrawable(InputStream inputStream) throws a.C0650a;

    Drawable getDrawable(String str) throws a.C0650a;

    int getMaximumZoomLevel();

    int getMinimumZoomLevel();

    String getTileRelativeFilenameString(long j5);

    int getTileSizePixels();

    String name();

    @Deprecated
    int ordinal();
}
