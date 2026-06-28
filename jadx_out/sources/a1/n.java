package a1;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.android.multidex.ClassPathElement;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.tendcloud.tenddata.aa;
import com.umeng.analytics.pro.cx;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m0.a;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f150a = "com.alipay.android.app";

    /* renamed from: b, reason: collision with root package name */
    public static final String f151b = "com.eg.android.AlipayGphone";

    /* renamed from: c, reason: collision with root package name */
    public static final String f152c = "hk.alipay.wallet";

    /* renamed from: d, reason: collision with root package name */
    public static final String f153d = "hk.alipay.walletRC";

    /* renamed from: e, reason: collision with root package name */
    public static final String f154e = "com.eg.android.AlipayGphoneRC";

    /* renamed from: f, reason: collision with root package name */
    public static final int f155f = 99;

    /* renamed from: h, reason: collision with root package name */
    public static final int f157h = 125;

    /* renamed from: i, reason: collision with root package name */
    public static final int f158i = 460;

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f156g = {"10.1.5.1013151", "10.1.5.1013148"};

    /* renamed from: j, reason: collision with root package name */
    public static final char[] f159j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', ClassPathElement.SEPARATOR_CHAR};

    /* loaded from: classes2.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f160a;

        public a(Activity activity) {
            this.f160a = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f160a.finish();
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f161a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConditionVariable f162b;

        public b(Runnable runnable, ConditionVariable conditionVariable) {
            this.f161a = runnable;
            this.f162b = conditionVariable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f161a.run();
            } finally {
                this.f162b.open();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final PackageInfo f163a;

        /* renamed from: b, reason: collision with root package name */
        public final int f164b;

        /* renamed from: c, reason: collision with root package name */
        public final String f165c;

        public c(PackageInfo packageInfo, int i5, String str) {
            this.f163a = packageInfo;
            this.f164b = i5;
            this.f165c = str;
        }

        public boolean a() {
            if (this.f163a.versionCode < this.f164b) {
                return true;
            }
            return false;
        }

        public boolean b(y0.a aVar) {
            Signature[] signatureArr = this.f163a.signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                return false;
            }
            for (Signature signature : signatureArr) {
                String q5 = n.q(aVar, signature.toByteArray());
                if (q5 != null && !TextUtils.equals(q5, this.f165c)) {
                    i0.a.i(aVar, i0.b.f16157l, i0.b.D, String.format("Got %s, expected %s", q5, this.f165c));
                    return true;
                }
            }
            return false;
        }
    }

    public static boolean A(y0.a aVar, String str) {
        try {
            String host = new URL(str).getHost();
            if (!host.endsWith(k0.a.B)) {
                if (host.endsWith(k0.a.C)) {
                    return true;
                }
                return false;
            }
            return true;
        } catch (Throwable th) {
            i0.a.e(aVar, i0.b.f16157l, "ckUrlErr", th);
            return false;
        }
    }

    public static boolean B(y0.a aVar, String str, Activity activity) {
        int parseInt;
        String substring;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (activity == null) {
            return false;
        }
        if (!str.toLowerCase().startsWith(k0.a.f19007n.toLowerCase()) && !str.toLowerCase().startsWith(k0.a.f19008o.toLowerCase())) {
            if (!TextUtils.equals(str, k0.a.f19010q) && !TextUtils.equals(str, k("http", k0.a.f19012s))) {
                if (!str.startsWith(k0.a.f19009p)) {
                    return false;
                }
                try {
                    String substring2 = str.substring(str.indexOf(k0.a.f19009p) + 24);
                    parseInt = Integer.parseInt(substring2.substring(substring2.lastIndexOf(k0.a.f19013t) + 10));
                } catch (Exception unused) {
                    g0.b.c(g0.b.h());
                }
                if (parseInt != g0.c.SUCCEEDED.b() && parseInt != g0.c.PAY_WAITTING.b()) {
                    g0.c b5 = g0.c.b(g0.c.FAILED.b());
                    g0.b.c(g0.b.b(b5.b(), b5.a(), ""));
                    activity.runOnUiThread(new a(activity));
                    return true;
                }
                if (k0.a.f19017x) {
                    StringBuilder sb = new StringBuilder();
                    String decode = URLDecoder.decode(str);
                    String decode2 = URLDecoder.decode(decode);
                    String str2 = decode2.substring(decode2.indexOf(k0.a.f19009p) + 24, decode2.lastIndexOf(k0.a.f19013t)).split(k0.a.f19015v)[0];
                    int indexOf = decode.indexOf(k0.a.f19015v) + 12;
                    sb.append(str2);
                    sb.append(k0.a.f19015v);
                    sb.append(decode.substring(indexOf, decode.indexOf("&", indexOf)));
                    sb.append(decode.substring(decode.indexOf("&", indexOf)));
                    substring = sb.toString();
                } else {
                    String decode3 = URLDecoder.decode(str);
                    substring = decode3.substring(decode3.indexOf(k0.a.f19009p) + 24, decode3.lastIndexOf(k0.a.f19013t));
                }
                g0.c b6 = g0.c.b(parseInt);
                g0.b.c(g0.b.b(b6.b(), b6.a(), substring));
                activity.runOnUiThread(new a(activity));
                return true;
            }
            g0.b.c(g0.b.a());
            activity.finish();
            return true;
        }
        try {
            c f5 = f(aVar, activity, g0.a.f16089d);
            if (f5 != null && !f5.a() && !f5.b(aVar)) {
                if (str.startsWith("intent://platformapi/startapp")) {
                    str = str.replaceFirst("intent://platformapi/startapp\\?", k0.a.f19007n);
                }
                activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
        } catch (Throwable unused2) {
        }
        return true;
    }

    public static int C(int i5) {
        return i5 / 100000;
    }

    public static String D() {
        if (com.alipay.sdk.app.a.d()) {
            if (TextUtils.equals("hk.alipay.wallet", g0.a.f16089d.get(0).f20796a)) {
                return f153d;
            }
            return f154e;
        }
        try {
            return g0.a.f16089d.get(0).f20796a;
        } catch (Throwable unused) {
            return f151b;
        }
    }

    public static String E(Context context) {
        return "-1;-1";
    }

    public static String F(String str, String str2) {
        String string = Settings.Secure.getString(((Application) y0.b.e().c()).getContentResolver(), str);
        if (string != null) {
            return string;
        }
        return str2;
    }

    public static String G(y0.a aVar, Context context) {
        return p(aVar, context, context.getPackageName());
    }

    public static Map<String, String> H(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            int indexOf = str2.indexOf(ContainerUtils.KEY_VALUE_DELIMITER, 1);
            if (-1 != indexOf) {
                hashMap.put(str2.substring(0, indexOf), URLDecoder.decode(str2.substring(indexOf + 1)));
            }
        }
        return hashMap;
    }

    public static Map<String, String> I(y0.a aVar, String str) {
        HashMap hashMap = new HashMap(4);
        int indexOf = str.indexOf(63);
        if (indexOf != -1 && indexOf < str.length() - 1) {
            for (String str2 : str.substring(indexOf + 1).split("&")) {
                int indexOf2 = str2.indexOf(61, 1);
                if (indexOf2 != -1 && indexOf2 < str2.length() - 1) {
                    hashMap.put(str2.substring(0, indexOf2), V(aVar, str2.substring(indexOf2 + 1)));
                }
            }
        }
        return hashMap;
    }

    public static boolean J(y0.a aVar) {
        if (aVar != null && !TextUtils.isEmpty(aVar.f22665g)) {
            return aVar.f22665g.toLowerCase().contains(i0.b.f16161n);
        }
        return false;
    }

    public static int K() {
        try {
            String lowerCase = Build.BRAND.toLowerCase();
            String lowerCase2 = Build.MANUFACTURER.toLowerCase();
            if (x("huawei", lowerCase, lowerCase2)) {
                return 1;
            }
            if (x("oppo", lowerCase, lowerCase2)) {
                return 2;
            }
            if (x("vivo", lowerCase, lowerCase2)) {
                return 4;
            }
            if (x("lenovo", lowerCase, lowerCase2)) {
                return 8;
            }
            if (x("xiaomi", lowerCase, lowerCase2)) {
                return 16;
            }
            if (!x("oneplus", lowerCase, lowerCase2)) {
                return 0;
            }
            return 32;
        } catch (Exception unused) {
            return 61440;
        }
    }

    public static String L(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    public static String M(String str) {
        if (com.alipay.sdk.app.a.d() && TextUtils.equals(str, f154e)) {
            return "com.eg.android.AlipayGphoneRC.IAlixPay";
        }
        return "com.eg.android.AlipayGphone.IAlixPay";
    }

    public static String N(y0.a aVar, String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e5) {
            i0.a.i(aVar, i0.b.f16157l, "rflex", e5.getClass().getSimpleName());
            return null;
        }
    }

    public static int O(String str) {
        for (int i5 = 0; i5 < 64; i5++) {
            if (str.equals(String.valueOf(f159j[i5]))) {
                return i5;
            }
        }
        return 0;
    }

    public static DisplayMetrics P(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static String Q() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                Matcher matcher = Pattern.compile("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(readLine);
                if (!matcher.matches() || matcher.groupCount() < 4) {
                    return "Unavailable";
                }
                return matcher.group(1) + "\n" + matcher.group(2) + " " + matcher.group(3) + "\n" + matcher.group(4);
            } catch (Throwable th) {
                bufferedReader.close();
                throw th;
            }
        } catch (IOException unused) {
            return "Unavailable";
        }
    }

    public static boolean R(y0.a aVar, String str) {
        try {
            int S = S(str);
            i0.a.d(aVar, i0.b.f16157l, "bindExt", "" + S);
            if (!m0.a.J().w() || (S & 2) != 2) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static int S(String str) {
        try {
            String r5 = m0.a.J().r();
            int i5 = 0;
            if (TextUtils.isEmpty(r5)) {
                return 0;
            }
            if (F(r5, "").contains(str)) {
                i5 = 2;
            }
            return i5 | 1;
        } catch (Throwable unused) {
            return 61440;
        }
    }

    public static String T() {
        String Q = Q();
        int indexOf = Q.indexOf("-");
        if (indexOf != -1) {
            Q = Q.substring(0, indexOf);
        }
        int indexOf2 = Q.indexOf("\n");
        if (indexOf2 != -1) {
            Q = Q.substring(0, indexOf2);
        }
        return "Linux " + Q;
    }

    public static String U(Context context) {
        String b5 = m.b(context);
        return b5.substring(0, b5.indexOf(aa.f11324a));
    }

    public static String V(y0.a aVar, String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e5) {
            i0.a.e(aVar, i0.b.f16157l, i0.b.B, e5);
            return "";
        }
    }

    public static String W() {
        return "Android " + Build.VERSION.RELEASE;
    }

    public static String X(Context context) {
        DisplayMetrics P = P(context);
        return P.widthPixels + org.slf4j.d.ANY_MARKER + P.heightPixels;
    }

    public static boolean Y(String str) {
        return Pattern.compile("^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(str).matches();
    }

    public static int Z() {
        try {
            return Process.myUid();
        } catch (Throwable th) {
            e.d(th);
            return -200;
        }
    }

    public static int a() {
        String d5 = y0.b.e().d();
        if (!TextUtils.isEmpty(d5)) {
            String replaceAll = d5.replaceAll(ContainerUtils.KEY_VALUE_DELIMITER, "");
            if (replaceAll.length() >= 5) {
                replaceAll = replaceAll.substring(0, 5);
            }
            int b5 = (int) (b(replaceAll) % 10000);
            if (b5 < 0) {
                return b5 * (-1);
            }
            return b5;
        }
        return -1;
    }

    public static String a0(Context context) {
        return " (" + W() + i.f136b + T() + i.f136b + L(context) + i.f136b + i.f136b + X(context) + ")(sdk android)";
    }

    public static long b(String str) {
        return c(str, 6);
    }

    public static String b0(String str) {
        return m(str, true);
    }

    public static long c(String str, int i5) {
        int pow = (int) Math.pow(2.0d, i5);
        int length = str.length();
        long j5 = 0;
        int i6 = length;
        for (int i7 = 0; i7 < length; i7++) {
            j5 += Integer.parseInt(String.valueOf(O(str.substring(i7, r5)))) * ((long) Math.pow(pow, i6 - 1));
            i6--;
        }
        return j5;
    }

    public static JSONObject c0(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    public static c d(PackageInfo packageInfo, int i5, String str) {
        if (packageInfo == null) {
            return null;
        }
        return new c(packageInfo, i5, str);
    }

    public static boolean d0() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }

    public static c e(y0.a aVar, Context context, String str, int i5, String str2) {
        PackageInfo packageInfo;
        if (com.alipay.sdk.app.a.d()) {
            if (f151b.equals(str)) {
                str = f154e;
            } else if ("hk.alipay.wallet".equals(str)) {
                str = f153d;
            }
        }
        try {
            packageInfo = h(context, str);
        } catch (Throwable th) {
            i0.a.i(aVar, i0.b.f16161n, i0.b.f16177v, th.getMessage());
            packageInfo = null;
        }
        if (!z(aVar, packageInfo)) {
            return null;
        }
        return d(packageInfo, i5, str2);
    }

    public static boolean e0(Context context) {
        try {
            if (context.getPackageManager().getPackageInfo(f150a, 128) == null) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static c f(y0.a aVar, Context context, List<a.b> list) {
        c e5;
        if (list == null) {
            return null;
        }
        for (a.b bVar : list) {
            if (bVar != null && (e5 = e(aVar, context, bVar.f20796a, bVar.f20797b, bVar.f20798c)) != null && !e5.b(aVar) && !e5.a()) {
                return e5;
            }
        }
        return null;
    }

    public static String f0(String str) {
        try {
            Uri parse = Uri.parse(str);
            return String.format("%s%s", parse.getAuthority(), parse.getPath());
        } catch (Throwable th) {
            e.d(th);
            return "-";
        }
    }

    public static ActivityInfo g(Context context) {
        try {
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                    if (TextUtils.equals(activityInfo.name, activity.getClass().getName())) {
                        return activityInfo;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            e.d(th);
            return null;
        }
    }

    public static PackageInfo h(Context context, String str) throws PackageManager.NameNotFoundException {
        return context.getPackageManager().getPackageInfo(str, 192);
    }

    public static <T> T i(WeakReference<T> weakReference) {
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static String j(int i5) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i6 = 0; i6 < i5; i6++) {
            int nextInt = random.nextInt(3);
            if (nextInt != 0) {
                if (nextInt != 1) {
                    if (nextInt == 2) {
                        sb.append(String.valueOf(new Random().nextInt(10)));
                    }
                } else {
                    sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
                }
            } else {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            }
        }
        return sb.toString();
    }

    public static String k(String str, String str2) {
        return str + str2;
    }

    public static String l(String str, String str2, String str3) {
        int i5;
        try {
            int indexOf = str3.indexOf(str) + str.length();
            if (indexOf <= str.length()) {
                return "";
            }
            if (!TextUtils.isEmpty(str2)) {
                i5 = str3.indexOf(str2, indexOf);
            } else {
                i5 = 0;
            }
            if (i5 < 1) {
                return str3.substring(indexOf);
            }
            return str3.substring(indexOf, i5);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String m(String str, boolean z4) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            if (z4 && digest.length > 16) {
                byte[] bArr = new byte[16];
                System.arraycopy(digest, 0, bArr, 0, 16);
                return r(bArr);
            }
            return r(digest);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static String n(y0.a aVar) {
        return N(aVar, "ro.build.fingerprint");
    }

    public static String o(y0.a aVar, Context context) {
        try {
            String b5 = j.b(aVar, context, "alipay_cashier_ap_fi", "");
            if (!TextUtils.isEmpty(b5)) {
                return b5;
            }
            try {
                j.e(aVar, context, "alipay_cashier_ap_fi", c0.a.c("FU", System.currentTimeMillis(), new c0.d(), (short) 0, new c0.f()).a());
                String b6 = j.b(aVar, context, "alipay_cashier_ap_fi", "");
                if (!TextUtils.isEmpty(b6)) {
                    return b6;
                }
                i0.a.i(aVar, i0.b.f16157l, "e_regen_empty", "");
                return "";
            } catch (Exception e5) {
                i0.a.i(aVar, i0.b.f16157l, "e_gen", e5.getClass().getSimpleName());
                return "";
            }
        } catch (Exception e6) {
            i0.a.e(aVar, i0.b.f16157l, "e_gen_err", e6);
            return "";
        }
    }

    public static String p(y0.a aVar, Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 128).versionName;
        } catch (Throwable th) {
            i0.a.e(aVar, i0.b.f16157l, i0.b.f16177v, th);
            return "";
        }
    }

    public static String q(y0.a aVar, byte[] bArr) {
        BigInteger modulus;
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if ((publicKey instanceof RSAPublicKey) && (modulus = ((RSAPublicKey) publicKey).getModulus()) != null) {
                return modulus.toString(16);
            }
            return null;
        } catch (Exception e5) {
            i0.a.e(aVar, i0.b.f16161n, i0.b.f16181x, e5);
            return null;
        }
    }

    public static String r(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b5 : bArr) {
            sb.append(Character.forDigit((b5 & 240) >> 4, 16));
            sb.append(Character.forDigit(b5 & cx.f12477m, 16));
        }
        return sb.toString();
    }

    public static Map<String, String> s(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, jSONObject.optString(next));
            } catch (Throwable th) {
                e.d(th);
            }
        }
        return hashMap;
    }

    public static JSONObject t(Intent intent) {
        JSONObject jSONObject = new JSONObject();
        if (intent == null) {
            return jSONObject;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            for (String str : extras.keySet()) {
                try {
                    jSONObject.put(str, String.valueOf(extras.get(str)));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONObject;
    }

    public static void u(String str, String str2, Context context, y0.a aVar) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || J(aVar) || !m0.a.J().C()) {
            return;
        }
        try {
            Intent intent = new Intent(k0.b.f19031l);
            intent.putExtra("bizType", str);
            intent.putExtra("exName", str2);
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent);
            i0.a.d(aVar, i0.b.f16157l, "AppNotify", str + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2);
        } catch (Exception unused) {
        }
    }

    public static boolean v(long j5, Runnable runnable, String str) {
        if (runnable == null) {
            return false;
        }
        ConditionVariable conditionVariable = new ConditionVariable();
        Thread thread = new Thread(new b(runnable, conditionVariable));
        if (!TextUtils.isEmpty(str)) {
            thread.setName(str);
        }
        thread.start();
        if (j5 <= 0) {
            conditionVariable.block();
            return true;
        }
        return conditionVariable.block(j5);
    }

    public static boolean w(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        try {
            String str = packageInfo.versionName;
            String[] strArr = f156g;
            if (!TextUtils.equals(str, strArr[0])) {
                if (!TextUtils.equals(str, strArr[1])) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean x(Object obj, Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            for (Object obj2 : objArr) {
                if ((obj == null && obj2 == null) || (obj != null && obj.equals(obj2))) {
                    return true;
                }
            }
            return false;
        }
        if (obj == null) {
            return true;
        }
        return false;
    }

    public static boolean y(y0.a aVar, Context context, List<a.b> list, boolean z4) {
        try {
            for (a.b bVar : list) {
                if (bVar != null) {
                    String str = bVar.f20796a;
                    if (com.alipay.sdk.app.a.d()) {
                        if (f151b.equals(str)) {
                            str = f154e;
                        } else if ("hk.alipay.wallet".equals(str)) {
                            str = f153d;
                        }
                    }
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                        if (packageInfo != null) {
                            if (z4) {
                                i0.a.d(aVar, i0.b.f16157l, i0.b.X, packageInfo.packageName + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + packageInfo.versionName);
                                return true;
                            }
                            return true;
                        }
                        continue;
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            i0.a.e(aVar, i0.b.f16157l, i0.b.f16152h0, th);
            return false;
        }
    }

    public static boolean z(y0.a aVar, PackageInfo packageInfo) {
        String str = "";
        boolean z4 = false;
        if (packageInfo == null) {
            str = "info == null";
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                str = "info.signatures == null";
            } else if (signatureArr.length <= 0) {
                str = "info.signatures.length <= 0";
            } else {
                z4 = true;
            }
        }
        if (!z4) {
            i0.a.i(aVar, i0.b.f16161n, i0.b.f16179w, str);
        }
        return z4;
    }
}
