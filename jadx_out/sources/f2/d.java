package f2;

import android.annotation.SuppressLint;
import android.os.Build;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private static final String f16080b = "RootKeyUtil";

    /* renamed from: a, reason: collision with root package name */
    private byte[] f16081a = null;

    private d() {
    }

    private void a(String str, String str2, String str3, String str4) {
        b(str, str2, str3, c.c(str4));
    }

    @SuppressLint({"NewApi"})
    private void b(String str, String str2, String str3, byte[] bArr) {
        if (Build.VERSION.SDK_INT < 26) {
            g.e(f16080b, "initRootKey: sha1");
            this.f16081a = a.i(str, str2, str3, bArr, false);
        } else {
            g.e(f16080b, "initRootKey: sha256");
            this.f16081a = a.i(str, str2, str3, bArr, true);
        }
    }

    public static d e(String str, String str2, String str3, String str4) {
        d dVar = new d();
        dVar.a(str, str2, str3, str4);
        return dVar;
    }

    public static d f(String str, String str2, String str3, byte[] bArr) {
        d dVar = new d();
        dVar.b(str, str2, str3, bArr);
        return dVar;
    }

    public byte[] c() {
        return (byte[]) this.f16081a.clone();
    }

    public String d() {
        return c.b(this.f16081a);
    }
}
