package com.lody.virtual.helper.compat;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import com.lody.virtual.helper.utils.VLog;

/* loaded from: classes3.dex */
public class ContentProviderCompat {
    private static ContentProviderClient acquireContentProviderClient(Context context, Uri uri) {
        try {
            return context.getContentResolver().acquireUnstableContentProviderClient(uri);
        } catch (SecurityException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static ContentProviderClient acquireContentProviderClientRetry(Context context, Uri uri, int i5) {
        ContentProviderClient acquireContentProviderClient = acquireContentProviderClient(context, uri);
        if (acquireContentProviderClient == null) {
            int i6 = 0;
            while (i6 < i5 && acquireContentProviderClient == null) {
                SystemClock.sleep(100L);
                i6++;
                acquireContentProviderClient = acquireContentProviderClient(context, uri);
            }
        }
        return acquireContentProviderClient;
    }

    public static Bundle call(Context context, Uri uri, String str, String str2, Bundle bundle, int i5) throws IllegalAccessException {
        ContentProviderClient acquireContentProviderClientRetry = acquireContentProviderClientRetry(context, uri, i5);
        try {
            try {
                if (acquireContentProviderClientRetry != null) {
                    return acquireContentProviderClientRetry.call(str, str2, bundle);
                }
                VLog.e(VLog.TAG_DEFAULT, "ContentProviderCompat.call: client is null, uri=" + uri.toString());
                throw new IllegalAccessException();
            } catch (RemoteException e5) {
                throw new IllegalAccessException(e5.getMessage());
            }
        } finally {
            releaseQuietly(acquireContentProviderClientRetry);
        }
    }

    private static void releaseQuietly(ContentProviderClient contentProviderClient) {
        if (contentProviderClient != null) {
            try {
                contentProviderClient.close();
            } catch (Exception unused) {
            }
        }
    }

    private static ContentProviderClient acquireContentProviderClient(Context context, String str) {
        return context.getContentResolver().acquireUnstableContentProviderClient(str);
    }

    public static ContentProviderClient acquireContentProviderClientRetry(Context context, String str, int i5) {
        ContentProviderClient acquireContentProviderClient = acquireContentProviderClient(context, str);
        if (acquireContentProviderClient == null) {
            int i6 = 0;
            while (i6 < i5 && acquireContentProviderClient == null) {
                SystemClock.sleep(100L);
                i6++;
                acquireContentProviderClient = acquireContentProviderClient(context, str);
            }
        }
        return acquireContentProviderClient;
    }
}
