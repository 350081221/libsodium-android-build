package com.umeng.analytics.pro;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes3.dex */
class bc implements av {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12249a = "content://cn.nubia.provider.deviceid.dataid/oaid";

    @Override // com.umeng.analytics.pro.av
    public String a(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        Cursor query = context.getContentResolver().query(Uri.parse("content://cn.nubia.provider.deviceid.dataid/oaid"), null, null, null, null);
        if (query != null) {
            if (query.moveToNext()) {
                str = query.getString(query.getColumnIndex("device_ids_grndid"));
            }
            query.close();
        }
        return str;
    }
}
