package com.efs.sdk.base.core.util;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static String f6631a = "efs";

    /* renamed from: b, reason: collision with root package name */
    private static File f6632b;

    public static void a(String str) {
        f6631a = str;
    }

    public static File b(Context context, String str) {
        return new File(g(context, str), "efs_config");
    }

    public static File c(Context context, String str) {
        return new File(g(context, str), "efs_flow");
    }

    public static File d(Context context, String str) {
        File file = new File(g(context, str), "ready");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File e(Context context, String str) {
        File file = new File(d(context, str), String.valueOf(ProcessUtil.myPid()));
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File f(Context context, String str) {
        File file = new File(g(context, str), "upload");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    private static File g(Context context, String str) {
        if (f6632b == null) {
            synchronized (a.class) {
                if (f6632b == null) {
                    f6632b = a(context);
                }
            }
        }
        File file = new File(f6632b, str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File a(Context context) {
        File dir = context.getDir(f6631a, 0);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return dir;
    }

    public static File a(Context context, String str) {
        return new File(g(context, str), "efs_cst");
    }
}
