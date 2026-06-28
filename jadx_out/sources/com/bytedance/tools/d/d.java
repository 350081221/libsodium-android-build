package com.bytedance.tools.d;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.umeng.analytics.pro.bm;

/* loaded from: classes2.dex */
public class d {
    public static synchronized int a(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        synchronized (d.class) {
            if (contentValues != null) {
                if (!TextUtils.isEmpty(str)) {
                    try {
                        ContentResolver e5 = e(context);
                        if (e5 != null) {
                            return e5.update(Uri.parse(c(context.getPackageName()) + str), contentValues, str2, strArr);
                        }
                    } catch (Throwable unused) {
                    }
                    return 0;
                }
            }
            return 0;
        }
    }

    public static synchronized Cursor b(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        synchronized (d.class) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                ContentResolver e5 = e(context);
                if (e5 != null) {
                    return e5.query(Uri.parse(c(context.getPackageName()) + str), strArr, str2, strArr2, str5);
                }
            } catch (Throwable unused) {
            }
            return null;
        }
    }

    private static String c(String str) {
        return "content://" + str + ".TTMultiProvider/t_db/ttopensdk.db/";
    }

    public static boolean d(Context context) {
        Cursor cursor = null;
        try {
            cursor = b(context, "setting_base_info", new String[]{bm.f12336d}, null, null, null, null, null);
            if (cursor != null) {
                if (cursor.moveToNext()) {
                    cursor.close();
                    return true;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Exception unused) {
            if (cursor != null) {
                cursor.close();
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    private static ContentResolver e(Context context) {
        try {
            return context.getContentResolver();
        } catch (Throwable unused) {
            return null;
        }
    }
}
