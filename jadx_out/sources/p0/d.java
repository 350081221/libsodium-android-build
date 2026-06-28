package p0;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.Random;
import java.util.regex.Pattern;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: j, reason: collision with root package name */
    public static d f22267j;

    /* renamed from: a, reason: collision with root package name */
    public Context f22269a;

    /* renamed from: c, reason: collision with root package name */
    public e f22271c;

    /* renamed from: d, reason: collision with root package name */
    public String f22272d;

    /* renamed from: e, reason: collision with root package name */
    public String f22273e;

    /* renamed from: f, reason: collision with root package name */
    public n0.a f22274f;

    /* renamed from: g, reason: collision with root package name */
    public n0.a f22275g;

    /* renamed from: i, reason: collision with root package name */
    public static final Object f22266i = new Object();

    /* renamed from: k, reason: collision with root package name */
    public static final String f22268k = ".UTSystemConfig" + File.separator + "Global";

    /* renamed from: b, reason: collision with root package name */
    public String f22270b = null;

    /* renamed from: h, reason: collision with root package name */
    public Pattern f22276h = Pattern.compile("[^0-9a-zA-Z=/+]+");

    public d(Context context) {
        this.f22269a = null;
        this.f22271c = null;
        this.f22272d = "xx_utdid_key";
        this.f22273e = "xx_utdid_domain";
        this.f22274f = null;
        this.f22275g = null;
        this.f22269a = context;
        this.f22275g = new n0.a(context, f22268k, "Alvin2", false, true);
        this.f22274f = new n0.a(context, ".DataStorage", "ContextData", false, true);
        this.f22271c = new e();
        this.f22272d = String.format("K_%d", Integer.valueOf(l0.f.a(this.f22272d)));
        this.f22273e = String.format("D_%d", Integer.valueOf(l0.f.a(this.f22273e)));
    }

    public static String b(byte[] bArr) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(l0.e.b(new byte[]{69, 114, 116, -33, 125, -54, -31, 86, -11, 11, -78, -96, -17, -99, 64, 23, -95, -126, -82, -64, 113, 116, -16, -103, 49, -30, 9, -39, 33, -80, -68, -78, -117, 53, 30, -122, 64, -104, 74, -49, 106, 85, -38, -93}), mac.getAlgorithm()));
        return l0.b.e(mac.doFinal(bArr), 2);
    }

    public static d c(Context context) {
        if (context != null && f22267j == null) {
            synchronized (f22266i) {
                if (f22267j == null) {
                    d dVar = new d(context);
                    f22267j = dVar;
                    dVar.i();
                }
            }
        }
        return f22267j;
    }

    private boolean d(String str) {
        if (str != null) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (24 == str.length() && !this.f22276h.matcher(str).find()) {
                return true;
            }
        }
        return false;
    }

    private void f(String str) {
        n0.a aVar;
        if (d(str)) {
            if (str.endsWith("\n")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.length() == 24 && (aVar = this.f22275g) != null) {
                aVar.b("UTDID2", str);
                this.f22275g.c();
            }
        }
    }

    private void h(String str) {
        n0.a aVar;
        if (str != null && (aVar = this.f22274f) != null && !str.equals(aVar.a(this.f22272d))) {
            this.f22274f.b(this.f22272d, str);
            this.f22274f.c();
        }
    }

    private void i() {
        boolean z4;
        n0.a aVar = this.f22275g;
        if (aVar != null) {
            if (l0.f.b(aVar.a("UTDID2"))) {
                String a5 = this.f22275g.a("UTDID");
                if (!l0.f.b(a5)) {
                    f(a5);
                }
            }
            boolean z5 = true;
            if (!l0.f.b(this.f22275g.a("DID"))) {
                this.f22275g.e("DID");
                z4 = true;
            } else {
                z4 = false;
            }
            if (!l0.f.b(this.f22275g.a("EI"))) {
                this.f22275g.e("EI");
                z4 = true;
            }
            if (!l0.f.b(this.f22275g.a("SI"))) {
                this.f22275g.e("SI");
            } else {
                z5 = z4;
            }
            if (z5) {
                this.f22275g.c();
            }
        }
    }

    private byte[] j() throws Exception {
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nextInt = new Random().nextInt();
        byte[] a5 = l0.c.a(currentTimeMillis);
        byte[] a6 = l0.c.a(nextInt);
        byteArrayOutputStream.write(a5, 0, 4);
        byteArrayOutputStream.write(a6, 0, 4);
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(0);
        try {
            str = l0.d.b(this.f22269a);
        } catch (Exception unused) {
            str = "" + new Random().nextInt();
        }
        byteArrayOutputStream.write(l0.c.a(l0.f.a(str)), 0, 4);
        byteArrayOutputStream.write(l0.c.a(l0.f.a(b(byteArrayOutputStream.toByteArray()))));
        return byteArrayOutputStream.toByteArray();
    }

    private String k() {
        n0.a aVar = this.f22275g;
        if (aVar != null) {
            String a5 = aVar.a("UTDID2");
            if (!l0.f.b(a5) && this.f22271c.a(a5) != null) {
                return a5;
            }
            return null;
        }
        return null;
    }

    public synchronized String a() {
        String g5 = g();
        this.f22270b = g5;
        if (!TextUtils.isEmpty(g5)) {
            return this.f22270b;
        }
        try {
            byte[] j5 = j();
            if (j5 != null) {
                String e5 = l0.b.e(j5, 2);
                this.f22270b = e5;
                f(e5);
                String b5 = this.f22271c.b(j5);
                if (b5 != null) {
                    h(b5);
                }
                return this.f22270b;
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        return null;
    }

    public synchronized String e() {
        String str = this.f22270b;
        if (str != null) {
            return str;
        }
        return a();
    }

    public synchronized String g() {
        String k5 = k();
        if (d(k5)) {
            h(this.f22271c.a(k5));
            this.f22270b = k5;
            return k5;
        }
        String a5 = this.f22274f.a(this.f22272d);
        if (!l0.f.b(a5)) {
            String a6 = new f().a(a5);
            if (!d(a6)) {
                a6 = this.f22271c.c(a5);
            }
            if (d(a6) && !l0.f.b(a6)) {
                this.f22270b = a6;
                f(a6);
                return this.f22270b;
            }
        }
        return null;
    }
}
