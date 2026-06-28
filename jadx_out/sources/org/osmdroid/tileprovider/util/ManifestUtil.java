package org.osmdroid.tileprovider.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import org.osmdroid.api.IMapView;

/* loaded from: classes4.dex */
public class ManifestUtil {
    public static String retrieveKey(Context context, String str) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                Log.i(IMapView.LOGTAG, "Key %s not found in manifest" + str);
                return "";
            }
            String string = bundle.getString(str);
            if (string == null) {
                Log.i(IMapView.LOGTAG, "Key %s not found in manifest" + str);
                return "";
            }
            return string.trim();
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i(IMapView.LOGTAG, "Key %s not found in manifest" + str);
            return "";
        }
    }
}
