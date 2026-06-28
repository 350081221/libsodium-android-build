package s;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes2.dex */
public class e implements q.b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22331a = "content://cn.nubia.provider.deviceid.dataid/oaid";

    @Override // q.b
    public String a(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        Cursor query = context.getContentResolver().query(Uri.parse(f22331a), null, null, null, null);
        if (query != null) {
            if (query.moveToNext()) {
                str = query.getString(query.getColumnIndex("device_ids_grndid"));
            }
            query.close();
        }
        return str;
    }
}
