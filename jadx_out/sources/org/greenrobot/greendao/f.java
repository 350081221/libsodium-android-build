package org.greenrobot.greendao;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class f {
    public static int a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        int i5 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i5;
            }
            outputStream.write(bArr, 0, read);
            i5 += read;
        }
    }

    public static int b(Context context, org.greenrobot.greendao.database.a aVar, String str) throws IOException {
        return c(context, aVar, str, true);
    }

    public static int c(Context context, org.greenrobot.greendao.database.a aVar, String str, boolean z4) throws IOException {
        int d5;
        String[] split = new String(h(context, str), "UTF-8").split(";(\\s)*[\n\r]");
        if (z4) {
            d5 = e(aVar, split);
        } else {
            d5 = d(aVar, split);
        }
        e.f("Executed " + d5 + " statements from SQL script '" + str + "'");
        return d5;
    }

    public static int d(org.greenrobot.greendao.database.a aVar, String[] strArr) {
        int i5 = 0;
        for (String str : strArr) {
            String trim = str.trim();
            if (trim.length() > 0) {
                aVar.execSQL(trim);
                i5++;
            }
        }
        return i5;
    }

    public static int e(org.greenrobot.greendao.database.a aVar, String[] strArr) {
        aVar.beginTransaction();
        try {
            int d5 = d(aVar, strArr);
            aVar.setTransactionSuccessful();
            return d5;
        } finally {
            aVar.endTransaction();
        }
    }

    public static void f(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor query = sQLiteDatabase.query(str, null, null, null, null, null, null);
        try {
            e.a(DatabaseUtils.dumpCursorToString(query));
        } finally {
            query.close();
        }
    }

    public static byte[] g(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        a(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] h(Context context, String str) throws IOException {
        InputStream open = context.getResources().getAssets().open(str);
        try {
            return g(open);
        } finally {
            open.close();
        }
    }

    public static void i(org.greenrobot.greendao.database.a aVar) {
        aVar.execSQL("VACUUM");
    }
}
