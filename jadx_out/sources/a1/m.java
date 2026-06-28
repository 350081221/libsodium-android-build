package a1;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static final String f149a = "content://com.alipay.android.app.settings.data.ServerProvider/current_server";

    public static String a(Context context) {
        Cursor query = context.getContentResolver().query(Uri.parse(f149a), null, null, null, null);
        String str = null;
        if (query != null && query.getCount() > 0) {
            if (query.moveToFirst()) {
                str = query.getString(query.getColumnIndex("url"));
            }
            query.close();
        }
        return str;
    }

    public static String b(Context context) {
        if (com.alipay.sdk.app.a.c()) {
            return k0.a.f18995b;
        }
        if (com.alipay.sdk.app.a.b()) {
            return k0.a.f18996c;
        }
        if (context == null) {
            return k0.a.f18994a;
        }
        String str = k0.a.f18994a;
        if (TextUtils.isEmpty(str)) {
            return k0.a.f18994a;
        }
        return str;
    }
}
