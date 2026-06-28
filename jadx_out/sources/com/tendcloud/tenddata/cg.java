package com.tendcloud.tenddata;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;

/* loaded from: classes3.dex */
public class cg {
    public static boolean a(Context context) {
        try {
            return bx.l();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void reflectNUBIA(Context context) {
        String string;
        try {
            ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
            if (acquireContentProviderClient != null) {
                Bundle call = acquireContentProviderClient.call("getOAID", null, null);
                acquireContentProviderClient.close();
                if (call != null && call.getInt(PluginConstants.KEY_ERROR_CODE, -1) == 0 && (string = call.getString("id")) != null) {
                    df.a().setOAID(string);
                }
            }
        } catch (Throwable unused) {
        }
    }
}
