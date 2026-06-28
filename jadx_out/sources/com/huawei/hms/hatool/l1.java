package com.huawei.hms.hatool;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static j1 f8629a;

    public static synchronized j1 a() {
        j1 j1Var;
        synchronized (l1.class) {
            if (f8629a == null) {
                f8629a = o1.c().b();
            }
            j1Var = f8629a;
        }
        return j1Var;
    }

    public static void a(int i5, String str, LinkedHashMap<String, String> linkedHashMap) {
        if (a() == null || !w0.b().a()) {
            return;
        }
        if (i5 == 1 || i5 == 0) {
            f8629a.a(i5, str, linkedHashMap);
            return;
        }
        y.d("hmsSdk", "Data type no longer collects range.type: " + i5);
    }

    @Deprecated
    public static void a(Context context, String str, String str2) {
        if (a() != null) {
            f8629a.a(context, str, str2);
        }
    }

    public static boolean b() {
        return o1.c().a();
    }

    public static void c() {
        if (a() == null || !w0.b().a()) {
            return;
        }
        f8629a.a(-1);
    }
}
