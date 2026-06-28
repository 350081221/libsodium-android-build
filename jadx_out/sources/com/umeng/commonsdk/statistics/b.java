package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.ca;
import com.umeng.analytics.pro.d;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.e;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static String f13247a = null;

    /* renamed from: b, reason: collision with root package name */
    public static String f13248b = "";

    /* renamed from: c, reason: collision with root package name */
    private static final String f13249c = "EnvelopeManager";

    /* renamed from: d, reason: collision with root package name */
    private static final String f13250d = "debug.umeng.umTaskId";

    /* renamed from: e, reason: collision with root package name */
    private static final String f13251e = "debug.umeng.umCaseId";

    /* renamed from: f, reason: collision with root package name */
    private static final String f13252f = "empty";

    /* renamed from: g, reason: collision with root package name */
    private static String f13253g = "";

    /* renamed from: h, reason: collision with root package name */
    private static String f13254h = "";

    /* renamed from: i, reason: collision with root package name */
    private static String f13255i;

    /* renamed from: j, reason: collision with root package name */
    private static Map<String, String> f13256j;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f13257l;

    /* renamed from: k, reason: collision with root package name */
    private int f13258k = 0;

    static {
        HashMap hashMap = new HashMap();
        f13256j = hashMap;
        hashMap.put("header", "#h");
        f13256j.put("sdk_type", "#sdt");
        f13256j.put(bi.Q, "#ac");
        f13256j.put("device_model", "#dm");
        f13256j.put(bi.f12261g, "#umid");
        f13256j.put(bi.f12278x, bi.f12278x);
        f13256j.put(bi.N, "#lang");
        f13256j.put(bi.ai, "#dt");
        f13256j.put("resolution", "#rl");
        f13256j.put(bi.H, "#dmf");
        f13256j.put(bi.J, "#dn");
        f13256j.put("platform_version", "#pv");
        f13256j.put("font_size_setting", "#fss");
        f13256j.put(bi.f12279y, "#ov");
        f13256j.put(bi.I, "#did");
        f13256j.put("platform_sdk_version", "#psv");
        f13256j.put(bi.F, "#db");
        f13256j.put("appkey", "#ak");
        f13256j.put(bi.Y, "#itr");
        f13256j.put("id_type", "#it");
        f13256j.put("uuid", "#ud");
        f13256j.put("device_id", "#dd");
        f13256j.put(bi.X, "#imp");
        f13256j.put("sdk_version", "#sv");
        f13256j.put("st", "#st");
        f13256j.put("analytics", "#a");
        f13256j.put(bi.f12269o, "#pkg");
        f13256j.put(bi.f12270p, "#sig");
        f13256j.put(bi.f12271q, "#sis1");
        f13256j.put(bi.f12272r, "#sis");
        f13256j.put("app_version", "#av");
        f13256j.put("version_code", "#vc");
        f13256j.put(bi.f12276v, "#imd");
        f13256j.put(bi.B, "#mnc");
        f13256j.put(bi.E, "#boa");
        f13256j.put(bi.G, "#mant");
        f13256j.put(bi.M, "#tz");
        f13256j.put(bi.O, "#ct");
        f13256j.put(bi.P, "#car");
        f13256j.put(bi.f12273s, "#disn");
        f13256j.put(bi.T, "#nt");
        f13256j.put(bi.f12256b, "#cv");
        f13256j.put(bi.f12258d, "#mv");
        f13256j.put(bi.f12257c, "#cot");
        f13256j.put(bi.f12259e, "#mod");
        f13256j.put(bi.aj, "#al");
        f13256j.put("session_id", "#sid");
        f13256j.put(bi.S, "#ip");
        f13256j.put(bi.U, "#sre");
        f13256j.put(bi.V, "#fre");
        f13256j.put(bi.W, "#ret");
        f13256j.put("channel", "#chn");
        f13256j.put("wrapper_type", "#wt");
        f13256j.put("wrapper_version", "#wv");
        f13256j.put(bi.aY, "#tsv");
        f13256j.put(bi.aZ, "#rps");
        f13256j.put(bi.bc, "#mov");
        f13256j.put(d.f12487i, "#vt");
        f13256j.put("secret", "#sec");
        f13256j.put(d.an, "#prv");
        f13256j.put(d.f12490l, "#$prv");
        f13256j.put(d.f12491m, "#uda");
        f13256j.put(bi.f12255a, "#tok");
        f13256j.put(bi.aQ, "#iv");
        f13256j.put(bi.R, "#ast");
        f13256j.put("backstate", "#bst");
        f13256j.put("zdata_ver", "#zv");
        f13256j.put("zdata_req_ts", "#zrt");
        f13256j.put("app_b_v", "#bv");
        f13256j.put("zdata", "#zta");
        f13256j.put(bi.ap, "#mt");
        f13256j.put(bi.am, "#zsv");
        f13256j.put("others_OS", "#oos");
    }

    public static String a(String str) {
        return f13256j.containsKey(str) ? f13256j.get(str) : str;
    }

    private static boolean b() {
        f13253g = UMUtils.getSystemProperty(f13250d, "");
        f13254h = UMUtils.getSystemProperty(f13251e, "");
        return (!TextUtils.isEmpty(f13253g) && !f13252f.equals(f13253g)) && (!TextUtils.isEmpty(f13254h) && !f13252f.equals(f13254h));
    }

    public static void a() {
        if (f13255i != null) {
            f13255i = null;
            e.a();
        }
    }

    public JSONObject b(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Envelope envelope;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(a("header"), new JSONObject());
            try {
                if (b()) {
                    jSONObject.put("umTaskId", f13253g);
                    jSONObject.put("umCaseId", f13254h);
                }
            } catch (Throwable unused) {
            }
            if (jSONObject != null) {
                jSONObject3 = a(jSONObject3, jSONObject);
            }
            if (jSONObject3 != null && jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && (next instanceof String)) {
                        String str2 = next;
                        if (jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
            if (jSONObject3 != null && DataHelper.largeThanMaxSize(jSONObject3.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                }
                return a(113, jSONObject3);
            }
            if (jSONObject3 != null) {
                envelope = a(context, jSONObject3.toString().getBytes());
                if (envelope == null) {
                    return a(111, jSONObject3);
                }
            } else {
                envelope = null;
            }
            Envelope envelope2 = envelope;
            if (envelope2 != null && DataHelper.largeThanMaxSize(envelope2.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return a(114, jSONObject3);
            }
            int a5 = a(context, envelope2, "z==1.2.0", DeviceConfig.getAppVersionName(context), str);
            if (a5 != 0) {
                return a(a5, jSONObject3);
            }
            if (ULog.DEBUG) {
                Log.i(f13249c, "constructHeader size is " + jSONObject3.toString().getBytes().length);
            }
            return jSONObject3;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return a(110, new JSONObject());
        }
    }

    public static long a(Context context) {
        long j5 = DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX - DataHelper.ENVELOPE_EXTRA_LENGTH;
        if (ULog.DEBUG) {
            Log.i(f13249c, "free size is " + j5);
        }
        return j5;
    }

    private JSONObject a(int i5, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("exception", i5);
            } catch (Exception unused) {
            }
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("exception", i5);
        } catch (Exception unused2) {
        }
        return jSONObject2;
    }

    public JSONObject a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        String str4;
        boolean z4;
        String str5;
        Envelope envelope;
        JSONObject optJSONObject;
        if (ULog.DEBUG && jSONObject != null && jSONObject2 != null) {
            Log.i(f13249c, "headerJSONObject size is " + jSONObject.toString().getBytes().length);
            Log.i(f13249c, "bodyJSONObject size is " + jSONObject2.toString().getBytes().length);
        }
        if (context != null && jSONObject2 != null) {
            try {
                if (jSONObject2.has("analytics") && (optJSONObject = jSONObject2.optJSONObject("analytics")) != null && optJSONObject.has(d.f12492n)) {
                    str4 = str2;
                    z4 = true;
                } else {
                    str4 = str2;
                    z4 = false;
                }
                JSONObject a5 = a(context, str4, z4);
                if (a5 != null && jSONObject != null) {
                    a5 = a(a5, jSONObject);
                }
                JSONObject jSONObject5 = a5;
                if (jSONObject5 != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (next != null && (next instanceof String)) {
                            String str6 = next;
                            if (jSONObject2.opt(str6) != null) {
                                try {
                                    jSONObject5.put(a(str6), jSONObject2.opt(str6));
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                }
                if (TextUtils.isEmpty(str2)) {
                    str4 = bi.aK;
                }
                String str7 = TextUtils.isEmpty(str3) ? "1.0.0" : str3;
                if (jSONObject5 != null) {
                    String str8 = str4 + "==" + str7 + "&=";
                    if (TextUtils.isEmpty(str8)) {
                        return a(101, jSONObject5);
                    }
                    if (str8.endsWith("&=")) {
                        str8 = str8.substring(0, str8.length() - 2);
                    }
                    str5 = str8;
                } else {
                    str5 = null;
                }
                if (jSONObject5 != null) {
                    try {
                        e a6 = e.a(context);
                        if (a6 != null) {
                            a6.b();
                            String encodeToString = Base64.encodeToString(new ca().a(a6.c()), 0);
                            if (!TextUtils.isEmpty(encodeToString)) {
                                JSONObject jSONObject6 = jSONObject5.getJSONObject(a("header"));
                                jSONObject6.put(a(bi.Y), encodeToString);
                                jSONObject5.put(a("header"), jSONObject6);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (jSONObject5 != null && DataHelper.largeThanMaxSize(jSONObject5.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                    SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                    }
                    return a(113, jSONObject5);
                }
                if (jSONObject5 != null) {
                    Envelope a7 = a(context, jSONObject5.toString().getBytes());
                    if (a7 == null) {
                        return a(111, jSONObject5);
                    }
                    envelope = a7;
                } else {
                    envelope = null;
                }
                if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                    return a(114, jSONObject5);
                }
                int a8 = a(context, envelope, str5, jSONObject5 != null ? jSONObject5.optJSONObject(a("header")).optString(a("app_version")) : null, str);
                if (a8 != 0) {
                    return a(a8, jSONObject5);
                }
                if (ULog.DEBUG) {
                    Log.i(f13249c, "constructHeader size is " + jSONObject5.toString().getBytes().length);
                }
                if (!str5.startsWith(bi.aG) && !str5.startsWith("i") && !str5.startsWith(bi.aL) && !str5.startsWith(bi.ay) && !com.umeng.commonsdk.stateless.b.a()) {
                    new com.umeng.commonsdk.stateless.b(context);
                    com.umeng.commonsdk.stateless.b.b();
                }
                return jSONObject5;
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
                if (jSONObject != null) {
                    try {
                        jSONObject4 = new JSONObject();
                    } catch (Exception e5) {
                        e = e5;
                        jSONObject3 = null;
                    }
                    try {
                        jSONObject4.put("header", jSONObject);
                    } catch (JSONException unused3) {
                    } catch (Exception e6) {
                        e = e6;
                        jSONObject3 = jSONObject4;
                        UMCrashManager.reportCrash(context, e);
                        return a(110, jSONObject3);
                    }
                    jSONObject3 = jSONObject4;
                } else {
                    jSONObject3 = null;
                }
                if (jSONObject3 == null) {
                    try {
                        jSONObject3 = new JSONObject();
                    } catch (Exception e7) {
                        e = e7;
                        UMCrashManager.reportCrash(context, e);
                        return a(110, jSONObject3);
                    }
                }
                Iterator<String> keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (next2 != null && (next2 instanceof String)) {
                        String str9 = next2;
                        if (jSONObject2.opt(str9) != null) {
                            try {
                                jSONObject3.put(str9, jSONObject2.opt(str9));
                            } catch (Exception unused4) {
                            }
                        }
                    }
                }
                return a(110, jSONObject3);
            }
        }
        return a(110, (JSONObject) null);
    }

    private static int[] b(Context context) {
        int[] iArr = new int[3];
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(com.umeng.commonsdk.internal.c.f13149a, 0);
            if (sharedPreferences != null) {
                iArr[0] = sharedPreferences.getInt(com.umeng.commonsdk.internal.c.f13150b, 0);
                iArr[1] = sharedPreferences.getInt(com.umeng.commonsdk.internal.c.f13151c, 0);
                iArr[2] = sharedPreferences.getInt("policyGrantResult", 0);
            }
        } catch (Throwable unused) {
        }
        return iArr;
    }

    public JSONObject a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Envelope envelope;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(a("header"), new JSONObject());
            if (jSONObject != null) {
                jSONObject3 = a(jSONObject3, jSONObject);
            }
            if (jSONObject3 != null && jSONObject2 != null) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next != null && (next instanceof String)) {
                        String str2 = next;
                        if (jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            if (jSONObject3 != null && DataHelper.largeThanMaxSize(jSONObject3.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                }
                return a(113, jSONObject3);
            }
            if (jSONObject3 != null) {
                envelope = a(context, jSONObject3.toString().getBytes());
                if (envelope == null) {
                    return a(111, jSONObject3);
                }
            } else {
                envelope = null;
            }
            Envelope envelope2 = envelope;
            if (envelope2 != null && DataHelper.largeThanMaxSize(envelope2.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return a(114, jSONObject3);
            }
            int a5 = a(context, envelope2, "h==1.2.0", "", str);
            if (a5 != 0) {
                return a(a5, jSONObject3);
            }
            if (ULog.DEBUG) {
                Log.i(f13249c, "constructHeader size is " + jSONObject3.toString().getBytes().length);
            }
            return jSONObject3;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            return a(110, new JSONObject());
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:94:0x03f2
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    private static org.json.JSONObject a(android.content.Context r16, java.lang.String r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 1529
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.b.a(android.content.Context, java.lang.String, boolean):org.json.JSONObject");
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject.opt(a("header")) != null && (jSONObject.opt(a("header")) instanceof JSONObject)) {
            JSONObject jSONObject3 = (JSONObject) jSONObject.opt(a("header"));
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && (next instanceof String)) {
                    String str = next;
                    if (jSONObject2.opt(str) != null) {
                        try {
                            jSONObject3.put(str, jSONObject2.opt(str));
                            if (str.equals(a(d.f12487i)) && (jSONObject2.opt(str) instanceof Integer)) {
                                this.f13258k = ((Integer) jSONObject2.opt(str)).intValue();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    private Envelope a(Context context, byte[] bArr) {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, "codex", null);
        int i5 = -1;
        try {
            if (!TextUtils.isEmpty(imprintProperty)) {
                i5 = Integer.valueOf(imprintProperty).intValue();
            }
        } catch (NumberFormatException e5) {
            UMCrashManager.reportCrash(context, e5);
        }
        if (i5 == 0) {
            return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (i5 == 1) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (f13257l) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
    }

    private int a(Context context, Envelope envelope, String str, String str2, String str3) {
        if (context == null || envelope == null || TextUtils.isEmpty(str)) {
            return 101;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = DeviceConfig.getAppVersionName(context);
        }
        String b5 = com.umeng.commonsdk.stateless.d.b(str3);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("&&");
        sb.append(str2);
        sb.append("_");
        sb.append(System.currentTimeMillis());
        sb.append("_");
        sb.append(b5);
        sb.append(".log");
        byte[] binary = envelope.toBinary();
        if (com.umeng.commonsdk.utils.c.a()) {
            if (str.startsWith(bi.aJ)) {
                return UMFrUtils.saveEnvelopeFile(context, sb.toString(), binary);
            }
            return 122;
        }
        if (str.startsWith(bi.aJ)) {
            return 122;
        }
        if (!str.startsWith(bi.aG) && !str.startsWith("i") && !str.startsWith(bi.ay) && !str.startsWith(bi.aL)) {
            return com.umeng.commonsdk.stateless.d.a(context, com.umeng.commonsdk.stateless.a.f13219f, sb.toString(), binary);
        }
        return UMFrUtils.saveEnvelopeFile(context, sb.toString(), binary);
    }

    public static void a(boolean z4) {
        f13257l = z4;
    }
}
