package com.huawei.secure.android.common.util;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import androidx.core.content.PermissionChecker;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9062a = "PermissionUtil";

    public static boolean a(Context context, String str, String str2) throws g2.a {
        if (Binder.getCallingPid() == Process.myPid()) {
            return false;
        }
        return b(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static boolean b(Context context, String str, int i5, int i6, String str2) throws g2.a {
        try {
            if (PermissionChecker.checkPermission(context, str, i5, i6, str2) == 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e(f9062a, "checkPermission: " + th.getMessage() + " , you should implementation support library or androidx library");
            throw new g2.a("you should implementation support library or androidx library");
        }
    }

    public static boolean c(Context context, String str) throws g2.a {
        return b(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
