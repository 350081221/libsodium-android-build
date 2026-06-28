package k1;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class f {
    public static int a() {
        return h.f19061a.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0023 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.List<java.lang.String> b(android.content.Context r4) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.f.b(android.content.Context):java.util.List");
    }

    public static boolean c(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (MediationConstant.ADN_UNITY.equals(str)) {
            return true;
        }
        int i5 = context.getApplicationInfo().targetSdkVersion;
        List<String> b5 = b(context);
        if (b5 == null || !b5.contains(str)) {
            return false;
        }
        return true;
    }

    public static boolean d(Context context, Map<String, j1.d> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        int i5 = context.getApplicationInfo().targetSdkVersion;
        List<String> b5 = b(context);
        if (b5 != null) {
            for (String str : map.keySet()) {
                if (!e(str) && !MediationConstant.ADN_UNITY.equals(str) && !b5.contains(str)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    public static boolean e(String str) {
        return a.c(str);
    }

    public static boolean f(Map<String, j1.d> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!k(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static j1.a g(String str) {
        return a.e(str);
    }

    private static String h() {
        try {
            Object invoke = Class.forName("com.bytedance.sdk.openadsdk.TTAdSdk").getMethod("getAdManager", new Class[0]).invoke(null, new Object[0]);
            if (invoke == null) {
                return null;
            }
            return (String) invoke.getClass().getMethod("getSDKVersion", new Class[0]).invoke(invoke, new Object[0]);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static boolean i(Map<String, j1.d> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!m(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static String j() {
        try {
            return (String) Class.forName("com.unity3d.ads.UnityAds").getMethod("getVersion", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static boolean k(String str) {
        if (MediationConstant.ADN_PANGLE.equals(str)) {
            return true;
        }
        if (e(str)) {
            if (g(str) == null) {
                return false;
            }
            return !TextUtils.isEmpty(r4.b());
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String s5 = s(str);
        if (!TextUtils.isEmpty(s5) && b.a(s5) && a.g(str, q(str))) {
            return true;
        }
        return false;
    }

    private static String l() {
        try {
            return (String) Class.forName("com.baidu.mobads.sdk.api.AdSettings").getMethod("getSDKVersion", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static boolean m(String str) {
        if (e(str)) {
            if (g(str) == null) {
                return false;
            }
            return !TextUtils.isEmpty(r4.a());
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String u4 = u(str);
        if (!TextUtils.isEmpty(u4) && b.a(u4) && a.d(str, o(str))) {
            return true;
        }
        return false;
    }

    private static String n() {
        try {
            return (String) Class.forName("com.google.android.gms.ads.MobileAds").getMethod("getVersionString", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static String o(String str) {
        if (MediationConstant.ADN_PANGLE.equals(str)) {
            return h();
        }
        if (MediationConstant.ADN_UNITY.equals(str)) {
            return j();
        }
        if (MediationConstant.ADN_BAIDU.equals(str)) {
            return l();
        }
        if (MediationConstant.ADN_ADMOB.equals(str)) {
            return n();
        }
        if (MediationConstant.ADN_GDT.equals(str)) {
            return p();
        }
        if (MediationConstant.ADN_KS.equals(str)) {
            return r();
        }
        if (MediationConstant.ADN_SIGMOB.equals(str)) {
            return t();
        }
        if (MediationConstant.ADN_MINTEGRAL.equals(str)) {
            return v();
        }
        if (MediationConstant.ADN_KLEVIN.equals(str)) {
            return w();
        }
        return null;
    }

    private static String p() {
        try {
            return (String) Class.forName("com.qq.e.comm.managers.status.SDKStatus").getMethod("getIntegrationSDKVersion", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public static String q(String str) {
        j1.a g5 = g(str);
        if (g5 == null) {
            return "";
        }
        return g5.b();
    }

    private static String r() {
        try {
            return (String) Class.forName("com.kwad.sdk.api.KsAdSDK").getMethod("getSDKVersion", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private static String s(String str) {
        if (MediationConstant.ADN_PANGLE.equals(str)) {
            return MediationConstant.PANGLE_ADN_CLASS_NAME;
        }
        if (MediationConstant.ADN_UNITY.equals(str)) {
            return MediationConstant.UNITY_ADN_CLASS_NAME;
        }
        if (MediationConstant.ADN_BAIDU.equals(str)) {
            return MediationConstant.BAIDU_ADN_CLASS_NAME;
        }
        if (MediationConstant.ADN_ADMOB.equals(str)) {
            return MediationConstant.ADMOB_ADN_CLASS_NAME;
        }
        if (MediationConstant.ADN_GDT.equals(str)) {
            return MediationConstant.GDT_ADN_CLASS_NAME;
        }
        if (MediationConstant.ADN_KS.equals(str)) {
            return MediationConstant.KS_ADN_CLASS_NAME;
        }
        if (MediationConstant.ADN_SIGMOB.equals(str)) {
            return MediationConstant.SIGMOB_ADN_CLASS_NAME;
        }
        if (MediationConstant.ADN_MINTEGRAL.equals(str)) {
            return MediationConstant.MINTEGRAL_ADN_CLASS_NAME;
        }
        if (MediationConstant.ADN_KLEVIN.equals(str)) {
            return MediationConstant.KLEVIN_ADN_CLASS_NAME;
        }
        return "";
    }

    private static String t() {
        try {
            return (String) Class.forName("com.sigmob.windad.WindAds").getMethod("getVersion", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private static String u(String str) {
        if (MediationConstant.ADN_PANGLE.equals(str)) {
            return "com.bytedance.sdk.openadsdk.TTAdSdk";
        }
        if (MediationConstant.ADN_UNITY.equals(str)) {
            return "com.unity3d.ads.UnityAds";
        }
        if (MediationConstant.ADN_BAIDU.equals(str)) {
            return "com.baidu.mobads.sdk.api.AdSettings";
        }
        if (MediationConstant.ADN_ADMOB.equals(str)) {
            return "com.google.android.gms.ads.MobileAds";
        }
        if (MediationConstant.ADN_GDT.equals(str)) {
            return "com.qq.e.comm.managers.status.SDKStatus";
        }
        if (MediationConstant.ADN_KS.equals(str)) {
            return "com.kwad.sdk.api.KsAdSDK";
        }
        if (MediationConstant.ADN_SIGMOB.equals(str)) {
            return "com.sigmob.windad.WindAds";
        }
        if (MediationConstant.ADN_MINTEGRAL.equals(str)) {
            return "com.mbridge.msdk.out.MBConfiguration";
        }
        if (MediationConstant.ADN_KLEVIN.equals(str)) {
            return "com.tencent.klevin.KlevinManager";
        }
        return "";
    }

    private static String v() {
        try {
            return (String) Class.forName("com.mbridge.msdk.out.MBConfiguration").getDeclaredField("SDK_VERSION").get(null);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }

    private static String w() {
        try {
            return (String) Class.forName("com.tencent.klevin.KlevinManager").getMethod("getVersion", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        }
    }
}
