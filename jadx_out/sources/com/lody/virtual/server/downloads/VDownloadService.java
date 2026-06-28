package com.lody.virtual.server.downloads;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.utils.VLog;
import com.umeng.analytics.pro.bm;

/* loaded from: classes3.dex */
public class VDownloadService {
    private ContentResolver mResolver = VirtualCore.get().getContext().getContentResolver();

    private void trimDownloadRequests() {
        Cursor query = this.mResolver.query(Uri.parse("content://downloads/my_downloads"), new String[]{bm.f12336d}, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                VLog.e("DownloadManager", "download id: " + query.getLong(0));
            }
            query.close();
        }
    }
}
