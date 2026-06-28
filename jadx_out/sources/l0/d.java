package l0;

import android.content.Context;
import android.text.TextUtils;
import java.util.Random;

/* loaded from: classes2.dex */
public class d {
    public static String a() {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nanoTime = (int) System.nanoTime();
        int nextInt = new Random().nextInt();
        int nextInt2 = new Random().nextInt();
        byte[] a5 = c.a(currentTimeMillis);
        byte[] a6 = c.a(nanoTime);
        byte[] a7 = c.a(nextInt);
        byte[] a8 = c.a(nextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(a5, 0, bArr, 0, 4);
        System.arraycopy(a6, 0, bArr, 4, 4);
        System.arraycopy(a7, 0, bArr, 8, 4);
        System.arraycopy(a8, 0, bArr, 12, 4);
        return b.e(bArr, 2);
    }

    public static String b(Context context) {
        String str = null;
        if (f.b(null)) {
            str = c();
        }
        if (f.b(str)) {
            return a();
        }
        return str;
    }

    public static String c() {
        String a5 = g.a("ro.aliyun.clouduuid", "");
        if (TextUtils.isEmpty(a5)) {
            a5 = g.a("ro.sys.aliyun.clouduuid", "");
        }
        if (TextUtils.isEmpty(a5)) {
            return e();
        }
        return a5;
    }

    public static String d(Context context) {
        return "";
    }

    public static String e() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return "";
        }
    }
}
