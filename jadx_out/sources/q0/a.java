package q0;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.efs.sdk.base.core.util.NetworkUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f22285a = "msp";

    /* renamed from: b, reason: collision with root package name */
    public static final String f22286b = "application/octet-stream;binary/octet-stream";

    /* renamed from: c, reason: collision with root package name */
    public static final CookieManager f22287c = new CookieManager();

    /* renamed from: q0.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0660a {

        /* renamed from: a, reason: collision with root package name */
        public final String f22288a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f22289b;

        /* renamed from: c, reason: collision with root package name */
        public final Map<String, String> f22290c;

        public C0660a(String str, Map<String, String> map, byte[] bArr) {
            this.f22288a = str;
            this.f22289b = bArr;
            this.f22290c = map;
        }

        public String toString() {
            return String.format("<UrlConnectionConfigure url=%s headers=%s>", this.f22288a, this.f22290c);
        }
    }

    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, List<String>> f22291a;

        /* renamed from: b, reason: collision with root package name */
        public final String f22292b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f22293c;

        public b(Map<String, List<String>> map, String str, byte[] bArr) {
            this.f22291a = map;
            this.f22292b = str;
            this.f22293c = bArr;
        }
    }

    public static String a(Context context) {
        try {
            NetworkInfo a5 = c1.b.a(null, context);
            if (a5 != null && a5.isAvailable()) {
                if (a5.getType() == 1) {
                    return NetworkUtil.NETWORK_TYPE_WIFI;
                }
                return a5.getExtraInfo().toLowerCase();
            }
        } catch (Exception unused) {
        }
        return "none";
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static q0.a.b b(android.content.Context r11, q0.a.C0660a r12) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.b(android.content.Context, q0.a$a):q0.a$b");
    }

    public static byte[] c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static Proxy d(Context context) {
        String a5 = a(context);
        if (a5 != null && !a5.contains("wap")) {
            return null;
        }
        try {
            String property = System.getProperty("https.proxyHost");
            String property2 = System.getProperty("https.proxyPort");
            if (TextUtils.isEmpty(property)) {
                return null;
            }
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, Integer.parseInt(property2)));
        } catch (Throwable unused) {
            return null;
        }
    }
}
