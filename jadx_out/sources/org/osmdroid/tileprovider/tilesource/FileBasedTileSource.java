package org.osmdroid.tileprovider.tilesource;

import com.huawei.agconnect.credential.Server;

/* loaded from: classes4.dex */
public class FileBasedTileSource extends XYTileSource {
    public FileBasedTileSource(String str, int i5, int i6, int i7, String str2, String[] strArr) {
        super(str, i5, i6, i7, str2, strArr);
    }

    public static e getSource(String str) {
        if (str.contains(".")) {
            str = str.substring(0, str.indexOf("."));
        }
        return new FileBasedTileSource(str, 0, 18, 256, ".png", new String[]{Server.GW});
    }
}
