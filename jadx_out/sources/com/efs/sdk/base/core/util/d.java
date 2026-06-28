package com.efs.sdk.base.core.util;

import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.util.UUID;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static volatile String f6650a = "";

    public static String a(Context context) {
        if (TextUtils.isEmpty(f6650a)) {
            synchronized (d.class) {
                if (TextUtils.isEmpty(f6650a)) {
                    String b5 = b(context);
                    f6650a = b5;
                    if (TextUtils.isEmpty(b5)) {
                        f6650a = c(context);
                    }
                }
            }
        }
        return f6650a;
    }

    private static String b(Context context) {
        try {
            File file = new File(a.a(context), "efsid");
            if (!file.exists()) {
                return null;
            }
            return b.a(file);
        } catch (Exception e5) {
            Log.e("efs.base", "get uuid error", e5);
            return null;
        }
    }

    private static String c(Context context) {
        String str = "";
        for (int i5 = 0; i5 < 3; i5++) {
            try {
                str = UUID.randomUUID().toString();
            } catch (Throwable unused) {
            }
            if (TextUtils.isEmpty(str)) {
            }
        }
        try {
            File a5 = a.a(context);
            File file = new File(a5, "efsid" + Process.myPid());
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            b.a(file, str);
            if (file.renameTo(new File(a5, "efsid"))) {
                file.delete();
            }
        } catch (Exception e5) {
            Log.e("efs.base", "save uuid '" + str + "' error", e5);
        }
        return str;
    }
}
