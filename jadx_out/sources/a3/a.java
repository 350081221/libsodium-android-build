package a3;

import android.content.Context;
import android.os.Build;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f173a = "ShortcutPermission";

    /* renamed from: b, reason: collision with root package name */
    public static final int f174b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f175c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f176d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f177e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final String f178f = Build.MANUFACTURER.toLowerCase();

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: a3.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public @interface InterfaceC0000a {
    }

    public static int a(Context context) {
        String str = f178f;
        if (str.contains("huawei")) {
            return b.a(context);
        }
        if (str.contains("xiaomi")) {
            return b.b(context);
        }
        if (str.contains("oppo")) {
            return b.c(context);
        }
        if (str.contains("vivo")) {
            return b.d(context);
        }
        if (!str.contains("samsung") && !str.contains("meizu")) {
            return 2;
        }
        return 0;
    }
}
