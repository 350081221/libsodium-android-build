package o2;

import android.os.Build;
import android.text.TextUtils;
import com.ss.android.download.api.constant.BaseConstants;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.text.f0;
import p4.l;
import socket.g;
import u3.m;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u0007R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lo2/f;", "", "", g.f22386a, "", "propName", bi.aJ, "", "b", "d", "c", bi.ay, "e", "f", "Ljava/lang/String;", "TAG", "<init>", "()V", "easyfloat_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public static final f f20845a = new f();

    /* renamed from: b, reason: collision with root package name */
    @l
    private static final String f20846b = "RomUtils--->";

    private f() {
    }

    @m
    public static final double g() {
        int p32;
        try {
            String h5 = h(s.a.f22319a);
            l0.m(h5);
            p32 = f0.p3(h5, "_", 0, false, 6, null);
            int i5 = p32 + 1;
            if (h5 != null) {
                String substring = h5.substring(i5);
                l0.o(substring, "(this as java.lang.String).substring(startIndex)");
                return Double.parseDouble(substring);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception e5) {
            e5.printStackTrace();
            return 4.0d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @p4.m
    @u3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String h(@p4.l java.lang.String r6) {
        /*
            java.lang.String r0 = "Exception while closing InputStream"
            java.lang.String r1 = "RomUtils--->"
            java.lang.String r2 = "propName"
            kotlin.jvm.internal.l0.p(r6, r2)
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.lang.String r4 = "getprop "
            java.lang.String r4 = kotlin.jvm.internal.l0.C(r4, r6)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.lang.Process r3 = r3.exec(r4)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            r3 = 1024(0x400, float:1.435E-42)
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L3f java.lang.Exception -> L41
            java.lang.String r3 = r4.readLine()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L57
            java.lang.String r5 = "input.readLine()"
            kotlin.jvm.internal.l0.o(r3, r5)     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L57
            r4.close()     // Catch: java.lang.Exception -> L3d java.lang.Throwable -> L57
            r4.close()     // Catch: java.io.IOException -> L38
            goto L3c
        L38:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L3c:
            return r3
        L3d:
            r3 = move-exception
            goto L43
        L3f:
            r6 = move-exception
            goto L59
        L41:
            r3 = move-exception
            r4 = r2
        L43:
            java.lang.String r5 = "Unable to read sysprop "
            java.lang.String r6 = kotlin.jvm.internal.l0.C(r5, r6)     // Catch: java.lang.Throwable -> L57
            android.util.Log.e(r1, r6, r3)     // Catch: java.lang.Throwable -> L57
            if (r4 == 0) goto L56
            r4.close()     // Catch: java.io.IOException -> L52
            goto L56
        L52:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L56:
            return r2
        L57:
            r6 = move-exception
            r2 = r4
        L59:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L5f:
            r2 = move-exception
            android.util.Log.e(r1, r0, r2)
        L63:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.f.h(java.lang.String):java.lang.String");
    }

    public final boolean a() {
        boolean T2;
        boolean T22;
        String MANUFACTURER = Build.MANUFACTURER;
        l0.o(MANUFACTURER, "MANUFACTURER");
        T2 = f0.T2(MANUFACTURER, "QiKU", false, 2, null);
        if (!T2) {
            l0.o(MANUFACTURER, "MANUFACTURER");
            T22 = f0.T2(MANUFACTURER, "360", false, 2, null);
            if (!T22) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        boolean T2;
        String MANUFACTURER = Build.MANUFACTURER;
        l0.o(MANUFACTURER, "MANUFACTURER");
        T2 = f0.T2(MANUFACTURER, "HUAWEI", false, 2, null);
        return T2;
    }

    public final boolean c() {
        boolean T2;
        boolean T22;
        String h5 = h("ro.build.display.id");
        if (TextUtils.isEmpty(h5)) {
            return false;
        }
        l0.m(h5);
        T2 = f0.T2(h5, "flyme", false, 2, null);
        if (!T2) {
            String lowerCase = h5.toLowerCase();
            l0.o(lowerCase, "(this as java.lang.String).toLowerCase()");
            T22 = f0.T2(lowerCase, "flyme", false, 2, null);
            if (!T22) {
                return false;
            }
        }
        return true;
    }

    public final boolean d() {
        return !TextUtils.isEmpty(h("ro.miui.ui.version.name"));
    }

    public final boolean e() {
        boolean T2;
        boolean T22;
        String MANUFACTURER = Build.MANUFACTURER;
        l0.o(MANUFACTURER, "MANUFACTURER");
        T2 = f0.T2(MANUFACTURER, BaseConstants.ROM_OPPO_UPPER_CONSTANT, false, 2, null);
        if (!T2) {
            l0.o(MANUFACTURER, "MANUFACTURER");
            T22 = f0.T2(MANUFACTURER, "oppo", false, 2, null);
            if (!T22) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        boolean T2;
        boolean T22;
        String MANUFACTURER = Build.MANUFACTURER;
        l0.o(MANUFACTURER, "MANUFACTURER");
        T2 = f0.T2(MANUFACTURER, "VIVO", false, 2, null);
        if (!T2) {
            l0.o(MANUFACTURER, "MANUFACTURER");
            T22 = f0.T2(MANUFACTURER, "vivo", false, 2, null);
            if (!T22) {
                return false;
            }
        }
        return true;
    }
}
