package y0;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static b f22674b;

    /* renamed from: a, reason: collision with root package name */
    public Context f22675a;

    public static b e() {
        if (f22674b == null) {
            f22674b = new b();
        }
        return f22674b;
    }

    public static boolean f() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i5 = 0; i5 < 10; i5++) {
            if (new File(strArr[i5]).exists()) {
                return true;
            }
        }
        return false;
    }

    public m0.b a() {
        return m0.b.f();
    }

    public void b(Context context) {
        m0.b.f();
        this.f22675a = context.getApplicationContext();
    }

    public Context c() {
        return this.f22675a;
    }

    public String d() {
        return c1.b.d(null, this.f22675a);
    }
}
