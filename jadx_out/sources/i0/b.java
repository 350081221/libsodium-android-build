package i0;

import a1.c;
import a1.e;
import a1.n;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.SharedLibraryInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import i0.a;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class b {
    public static final String A = "SSLDenied";
    public static final String A0 = "out_trade_no";
    public static final String B = "H5PayDataAnalysisError";
    public static final String B0 = "trade_no";
    public static final String C = "H5AuthDataAnalysisError";
    public static final String C0 = "biz_content";
    public static final String D = "PublicKeyUnmatch";
    public static final String D0 = "app_id";
    public static final String E = "ClientBindFailed";
    public static final String F = "TriDesEncryptError";
    public static final String G = "TriDesDecryptError";
    public static final String H = "ClientBindException";
    public static final String I = "SaveTradeTokenError";
    public static final String J = "ClientBindServiceFailed";
    public static final String K = "TryStartServiceEx";
    public static final String L = "BindWaitTimeoutEx";
    public static final String M = "CheckClientExistEx";
    public static final String N = "CheckClientSignEx";
    public static final String O = "GetInstalledAppEx";
    public static final String P = "ParserTidClientKeyEx";
    public static final String Q = "PgApiInvoke";
    public static final String R = "PgBindStarting";
    public static final String S = "PgBinded";
    public static final String T = "PgBindEnd";
    public static final String U = "PgBindPay";
    public static final String V = "PgReturn";
    public static final String W = "PgReturnV";
    public static final String X = "PgWltVer";
    public static final String Y = "PgOpenStarting";
    public static final String Z = "ErrIntentEx";

    /* renamed from: a0, reason: collision with root package name */
    public static final String f16145a0 = "ErrActNull";

    /* renamed from: b0, reason: collision with root package name */
    public static final String f16146b0 = "ErrActEx";

    /* renamed from: c0, reason: collision with root package name */
    public static final String f16147c0 = "ErrActNull2";

    /* renamed from: d0, reason: collision with root package name */
    public static final String f16148d0 = "ErrActEx2";

    /* renamed from: e0, reason: collision with root package name */
    public static final String f16149e0 = "ErrActNotCreated";

    /* renamed from: f0, reason: collision with root package name */
    public static final String f16150f0 = "GetInstalledAppEx";

    /* renamed from: g0, reason: collision with root package name */
    public static final String f16151g0 = "StartLaunchAppTransEx";

    /* renamed from: h0, reason: collision with root package name */
    public static final String f16152h0 = "CheckLaunchAppExistEx";

    /* renamed from: i0, reason: collision with root package name */
    public static final String f16153i0 = "LogBindCalledH5";

    /* renamed from: j0, reason: collision with root package name */
    public static final String f16154j0 = "LogCalledH5";

    /* renamed from: k, reason: collision with root package name */
    public static final String f16155k = "net";

    /* renamed from: k0, reason: collision with root package name */
    public static final String f16156k0 = "LogHkLoginByIntent";

    /* renamed from: l, reason: collision with root package name */
    public static final String f16157l = "biz";

    /* renamed from: l0, reason: collision with root package name */
    public static final String f16158l0 = "SchemePayWrongHashEx";

    /* renamed from: m, reason: collision with root package name */
    public static final String f16159m = "cp";

    /* renamed from: m0, reason: collision with root package name */
    public static final String f16160m0 = "LogAppFetchConfigTimeout";

    /* renamed from: n, reason: collision with root package name */
    public static final String f16161n = "auth";

    /* renamed from: n0, reason: collision with root package name */
    public static final String f16162n0 = "H5CbUrlEmpty";

    /* renamed from: o, reason: collision with root package name */
    public static final String f16163o = "third";

    /* renamed from: o0, reason: collision with root package name */
    public static final String f16164o0 = "H5CbEx";

    /* renamed from: p, reason: collision with root package name */
    public static final String f16165p = "wlt";

    /* renamed from: p0, reason: collision with root package name */
    public static final String f16166p0 = "StartActivityEx";

    /* renamed from: q, reason: collision with root package name */
    public static final String f16167q = "FormatResultEx";

    /* renamed from: q0, reason: collision with root package name */
    public static final String f16168q0 = "JSONEx";

    /* renamed from: r, reason: collision with root package name */
    public static final String f16169r = "GetApdidEx";

    /* renamed from: r0, reason: collision with root package name */
    public static final String f16170r0 = "ParseBundleSerializableError";

    /* renamed from: s, reason: collision with root package name */
    public static final String f16171s = "GetApdidNull";

    /* renamed from: s0, reason: collision with root package name */
    public static final String f16172s0 = "ParseSchemeQueryError";

    /* renamed from: t, reason: collision with root package name */
    public static final String f16173t = "GetApdidTimeout";

    /* renamed from: t0, reason: collision with root package name */
    public static final String f16174t0 = "TbChk";

    /* renamed from: u, reason: collision with root package name */
    public static final String f16175u = "GetUtdidEx";

    /* renamed from: u0, reason: collision with root package name */
    public static final String f16176u0 = "TbStart";

    /* renamed from: v, reason: collision with root package name */
    public static final String f16177v = "GetPackageInfoEx";

    /* renamed from: v0, reason: collision with root package name */
    public static final String f16178v0 = "TbCancel";

    /* renamed from: w, reason: collision with root package name */
    public static final String f16179w = "NotIncludeSignatures";

    /* renamed from: w0, reason: collision with root package name */
    public static final String f16180w0 = "TbUnknown";

    /* renamed from: x, reason: collision with root package name */
    public static final String f16181x = "GetPublicKeyFromSignEx";

    /* renamed from: x0, reason: collision with root package name */
    public static final String f16182x0 = "TbOk";

    /* renamed from: y, reason: collision with root package name */
    public static final String f16183y = "webError";

    /* renamed from: y0, reason: collision with root package name */
    public static final String f16184y0 = "TbActFail";

    /* renamed from: z, reason: collision with root package name */
    public static final String f16185z = "SSLError";

    /* renamed from: z0, reason: collision with root package name */
    public static final String f16186z0 = "partner";

    /* renamed from: a, reason: collision with root package name */
    public String f16187a;

    /* renamed from: b, reason: collision with root package name */
    public String f16188b;

    /* renamed from: c, reason: collision with root package name */
    public String f16189c;

    /* renamed from: d, reason: collision with root package name */
    public String f16190d;

    /* renamed from: e, reason: collision with root package name */
    public String f16191e;

    /* renamed from: f, reason: collision with root package name */
    public String f16192f;

    /* renamed from: g, reason: collision with root package name */
    public String f16193g;

    /* renamed from: h, reason: collision with root package name */
    public String f16194h = "";

    /* renamed from: i, reason: collision with root package name */
    public String f16195i = "";

    /* renamed from: j, reason: collision with root package name */
    public String f16196j;

    public b(Context context, boolean z4) {
        long a5;
        context = context != null ? context.getApplicationContext() : context;
        this.f16187a = k();
        this.f16189c = c(context);
        if (z4) {
            a5 = 0;
        } else {
            a5 = a.e.a(context);
        }
        this.f16190d = b(a5);
        this.f16191e = a();
        this.f16192f = l(context);
        this.f16193g = "-";
        this.f16196j = "-";
    }

    public static String a() {
        return String.format("%s,%s,-,-,-", p(z0.a.a(y0.b.e().c()).i()), p(y0.b.e().d()));
    }

    public static String b(long j5) {
        return String.format("android,3,%s,%s,com.alipay.mcpay,5.0,-,%s,-", p("15.8.17"), p("h.a.3.8.17"), "~" + j5);
    }

    public static String c(Context context) {
        String packageName;
        String str = "-";
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                packageName = applicationContext.getPackageName();
                try {
                    PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 64);
                    str = packageInfo.versionName + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + d(packageInfo);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
            }
            return String.format("%s,%s,-,-,-", p(packageName), p(str));
        }
        packageName = "-";
        return String.format("%s,%s,-,-,-", p(packageName), p(str));
    }

    public static String d(PackageInfo packageInfo) {
        Signature[] signatureArr;
        String str;
        String q5;
        if (packageInfo != null && (signatureArr = packageInfo.signatures) != null && signatureArr.length != 0) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(packageInfo.signatures.length);
                for (Signature signature : packageInfo.signatures) {
                    try {
                        q5 = n.q(null, signature.toByteArray());
                    } catch (Throwable unused) {
                    }
                    if (TextUtils.isEmpty(q5)) {
                        str = "?";
                        sb.append("-");
                        sb.append(str);
                    } else {
                        str = n.b0(q5).substring(0, 8);
                        sb.append("-");
                        sb.append(str);
                    }
                }
                return sb.toString();
            } catch (Throwable unused2) {
                return "?";
            }
        }
        return "0";
    }

    public static String f(Throwable th) {
        if (th == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th.getClass().getName());
            stringBuffer.append(":");
            stringBuffer.append(th.getMessage());
            stringBuffer.append(" 》 ");
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                int i5 = 0;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString());
                    stringBuffer.append(" 》 ");
                    i5++;
                    if (i5 > 5) {
                        break;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    @SuppressLint({"SimpleDateFormat"})
    public static String k() {
        return String.format("%s,%s", u(), new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date()));
    }

    public static String l(Context context) {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,-", p(c.f(context)), SharedLibraryInfo.PLATFORM_PACKAGE_NAME, p(Build.VERSION.RELEASE), p(Build.MODEL), "-", "0", p(c.g(context).b()), "gw", p(c1.b.c(null, context)));
    }

    public static String m(String str) {
        String str2;
        String str3;
        if (str == null) {
            str = "";
        }
        String[] split = str.split("&");
        String str4 = null;
        if (split != null) {
            str2 = null;
            str3 = null;
            for (String str5 : split) {
                String[] split2 = str5.split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (split2 != null && split2.length == 2) {
                    if (split2[0].equalsIgnoreCase(f16186z0)) {
                        str4 = split2[1].replace("\"", "");
                    } else if (split2[0].equalsIgnoreCase(A0)) {
                        str2 = split2[1].replace("\"", "");
                    } else if (split2[0].equalsIgnoreCase(B0)) {
                        str3 = split2[1].replace("\"", "");
                    } else if (split2[0].equalsIgnoreCase(C0)) {
                        try {
                            JSONObject jSONObject = new JSONObject(n.V(y0.a.w(), split2[1]));
                            if (TextUtils.isEmpty(str2)) {
                                str2 = jSONObject.getString(A0);
                            }
                        } catch (Throwable unused) {
                        }
                    } else if (split2[0].equalsIgnoreCase("app_id") && TextUtils.isEmpty(str4)) {
                        str4 = split2[1];
                    }
                }
            }
        } else {
            str2 = null;
            str3 = null;
        }
        return String.format("%s,%s,-,%s,-,-,-", p(str3), p(str2), p(str4));
    }

    public static String o() {
        return new SimpleDateFormat("HH:mm:ss:SSS", Locale.getDefault()).format(new Date());
    }

    public static String p(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.replace("[", "【").replace("]", "】").replace("(", "（").replace(")", "）").replace(",", "，").replace("^", "~").replace("#", "＃");
    }

    private synchronized void q(String str, String str2, String str3) {
        String p5;
        e.i(k0.a.A, String.format("event %s %s %s", str, str2, str3));
        String str4 = "";
        if (!TextUtils.isEmpty(this.f16194h)) {
            str4 = "^";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        Object[] objArr = new Object[4];
        if (TextUtils.isEmpty(str)) {
            p5 = "-";
        } else {
            p5 = p(str);
        }
        objArr[0] = p5;
        objArr[1] = p(str2);
        objArr[2] = p(str3);
        objArr[3] = p(o());
        sb.append(String.format("%s,%s,%s,-,-,-,-,-,-,-,-,-,-,%s", objArr));
        this.f16194h += sb.toString();
    }

    public static String r(String str) {
        return TextUtils.isEmpty(str) ? "-" : str;
    }

    private synchronized void s(String str, String str2, String str3) {
        String p5;
        e.h(k0.a.A, String.format("err %s %s %s", str, str2, str3));
        String str4 = "";
        if (!TextUtils.isEmpty(this.f16195i)) {
            str4 = "^";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str4);
        Object[] objArr = new Object[4];
        objArr[0] = str;
        objArr[1] = str2;
        if (TextUtils.isEmpty(str3)) {
            p5 = "-";
        } else {
            p5 = p(str3);
        }
        objArr[2] = p5;
        objArr[3] = p(o());
        sb.append(String.format("%s,%s,%s,%s", objArr));
        this.f16195i += sb.toString();
    }

    private boolean t() {
        return TextUtils.isEmpty(this.f16195i);
    }

    public static String u() {
        try {
            return UUID.randomUUID().toString();
        } catch (Throwable unused) {
            return "12345678uuid";
        }
    }

    public String e(String str) {
        String m5 = m(str);
        this.f16188b = m5;
        return String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", this.f16187a, m5, this.f16189c, this.f16190d, this.f16191e, this.f16192f, this.f16193g, r(this.f16194h), r(this.f16195i), this.f16196j);
    }

    public void g(String str, String str2) {
        q("", str, str2);
    }

    public void h(String str, String str2, String str3) {
        q("", str, str2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str3);
    }

    public void i(String str, String str2, Throwable th) {
        s(str, str2, f(th));
    }

    public void j(String str, String str2, Throwable th, String str3) {
        s(str, str2, str3 + ": " + f(th));
    }

    public void n(String str, String str2, String str3) {
        s(str, str2, str3);
    }
}
