package com.huawei.hms.analytics;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.i;

/* loaded from: classes3.dex */
public final class ab extends ad {
    /* JADX INFO: Access modifiers changed from: protected */
    public ab(Context context, i.lmn lmnVar) {
        super(context, lmnVar, new v(context, lmnVar));
    }

    private String ijk() {
        int columnIndex;
        Cursor cursor = null;
        try {
            try {
                cursor = this.klm.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"oaid"}, null);
            } catch (Exception unused) {
                HiLog.w("MeizHelper", "contentResolver query exception");
                if (cursor == null) {
                    return "";
                }
            }
            if (cursor != null && cursor.moveToFirst() && (columnIndex = cursor.getColumnIndex(t0.b.f22420d)) >= 0) {
                String string = cursor.getString(columnIndex);
                cursor.close();
                return string;
            }
            if (cursor == null) {
                return "";
            }
            cursor.close();
            return "";
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @Override // com.huawei.hms.analytics.ad
    public final boolean klm() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // com.huawei.hms.analytics.ad
    public final void lmn() {
        String ijk = ijk();
        if (TextUtils.isEmpty(ijk)) {
            lmn("meiz oid is empty, begin get gaid");
        } else {
            this.lmn.lmn(ijk, "", "oaid");
        }
    }
}
