package com.umeng.ccg;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.umeng.analytics.pro.aa;
import com.umeng.analytics.pro.ab;
import com.umeng.analytics.pro.ac;
import com.umeng.analytics.pro.ad;
import com.umeng.analytics.pro.ae;
import com.umeng.analytics.pro.af;
import com.umeng.analytics.pro.ah;
import com.umeng.analytics.pro.aj;
import com.umeng.analytics.pro.ap;
import com.umeng.analytics.pro.ar;
import com.umeng.analytics.pro.at;
import com.umeng.analytics.pro.au;
import com.umeng.analytics.pro.z;
import com.umeng.ccg.c;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d implements c.a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12868a = "iucc";

    /* renamed from: b, reason: collision with root package name */
    private static final String f12869b = au.b().b(au.C);

    /* renamed from: c, reason: collision with root package name */
    private static JSONObject f12870c = null;

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f12871d = {com.umeng.ccg.a.f12827f, com.umeng.ccg.a.f12828g, com.umeng.ccg.a.f12829h};

    /* renamed from: e, reason: collision with root package name */
    private static ArrayList<aa> f12872e = null;

    /* renamed from: f, reason: collision with root package name */
    private static ArrayList<aa> f12873f = null;

    /* renamed from: g, reason: collision with root package name */
    private static ArrayList<aa> f12874g = null;

    /* renamed from: j, reason: collision with root package name */
    private static c f12875j = new c();

    /* renamed from: h, reason: collision with root package name */
    private volatile String f12876h = "";

    /* renamed from: i, reason: collision with root package name */
    private Map<String, a> f12877i = new HashMap();

    /* loaded from: classes3.dex */
    public class a {

        /* renamed from: b, reason: collision with root package name */
        private JSONArray f12880b;

        /* renamed from: c, reason: collision with root package name */
        private String f12881c;

        public a(JSONArray jSONArray, String str) {
            this.f12880b = jSONArray;
            this.f12881c = str;
        }

        public JSONArray a() {
            return this.f12880b;
        }

        public String b() {
            return this.f12881c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final d f12882a = new d();

        private b() {
        }
    }

    /* loaded from: classes3.dex */
    public static class c extends BroadcastReceiver {
        public long a(ArrayList<aa> arrayList) {
            if (arrayList != null && arrayList.size() > 0) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    aa aaVar = arrayList.get(i5);
                    if (aaVar instanceof ac) {
                        return ((ac) aaVar).c();
                    }
                }
            }
            return 0L;
        }

        public boolean b(ArrayList<aa> arrayList) {
            if (arrayList == null || arrayList.size() <= 0) {
                return false;
            }
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                if (arrayList.get(i5).b()) {
                    return false;
                }
            }
            return true;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            try {
                String action = intent.getAction();
                if (TextUtils.isEmpty(action)) {
                    return;
                }
                if (action.equals("android.intent.action.SCREEN_ON")) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv intent : ACTION_SCREEN_ON");
                    if (b(d.f12872e)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "report screen_on event.");
                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 301, d.a(), null, a(d.f12872e) * 1000);
                    } else {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "don't report screen_on event.");
                    }
                }
                if (action.equals("android.intent.action.SCREEN_OFF")) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv intent : ACTION_SCREEN_OFF");
                    if (b(d.f12873f)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "report screen_off event.");
                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 302, d.a(), null, a(d.f12873f) * 1000);
                    } else {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "don't report screen_off event.");
                    }
                }
                if (action.equals("android.intent.action.USER_PRESENT")) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "recv intent : ACTION_USER_PRESENT");
                    if (b(d.f12874g)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "report screen_unlock event.");
                        com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 303, d.a(), null, a(d.f12874g) * 1000);
                        return;
                    }
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "don't report screen_unlock event.");
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(Context context, String str) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(str);
        context.registerReceiver(f12875j, intentFilter);
    }

    private String e(Context context) {
        try {
            SharedPreferences a5 = ar.a(context);
            return a5 != null ? a5.getString(ar.f12185e, "") : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    private void f() {
        try {
            SharedPreferences a5 = ar.a(UMGlobalContext.getAppContext());
            if (a5 != null) {
                a5.edit().putString(ar.f12186f, new JSONObject(ap.a()).toString()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    private boolean g() {
        try {
            SharedPreferences a5 = ar.a(UMGlobalContext.getAppContext());
            if (a5 == null) {
                return false;
            }
            if (TextUtils.isEmpty(a5.getString(ar.f12187g, ""))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private long b(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.has("ts")) {
            try {
                return jSONObject.optLong("ts");
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }

    private void c(Context context) {
        ImprintHandler.getImprintService(context).registImprintCallback(f12868a, new UMImprintChangeCallback() { // from class: com.umeng.ccg.d.1
            @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
            public void onImprintValueChanged(String str, String str2) {
                com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 107, d.a(), str2);
            }
        });
    }

    private Long d(Context context) {
        try {
            SharedPreferences a5 = ar.a(context);
            if (a5 == null) {
                return 0L;
            }
            return Long.valueOf(a5.getLong(ar.f12184d, 0L));
        } catch (Throwable unused) {
            return 0L;
        }
    }

    private void c(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(com.umeng.ccg.a.f12822a)) {
            return;
        }
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(com.umeng.ccg.a.f12822a);
            z a5 = optJSONObject.has(com.umeng.ccg.a.f12823b) ? a(com.umeng.ccg.a.f12823b, optJSONObject.optJSONObject(com.umeng.ccg.a.f12823b)) : null;
            z a6 = optJSONObject.has(com.umeng.ccg.a.f12824c) ? a(com.umeng.ccg.a.f12824c, optJSONObject.optJSONObject(com.umeng.ccg.a.f12824c)) : null;
            z a7 = optJSONObject.has(com.umeng.ccg.a.f12825d) ? a(com.umeng.ccg.a.f12825d, optJSONObject.optJSONObject(com.umeng.ccg.a.f12825d)) : null;
            z a8 = optJSONObject.has(com.umeng.ccg.a.f12826e) ? a(com.umeng.ccg.a.f12826e, optJSONObject.optJSONObject(com.umeng.ccg.a.f12826e)) : null;
            z a9 = optJSONObject.has(com.umeng.ccg.a.f12827f) ? a(com.umeng.ccg.a.f12827f, optJSONObject.optJSONObject(com.umeng.ccg.a.f12827f)) : null;
            z a10 = optJSONObject.has(com.umeng.ccg.a.f12828g) ? a(com.umeng.ccg.a.f12828g, optJSONObject.optJSONObject(com.umeng.ccg.a.f12828g)) : null;
            z a11 = optJSONObject.has(com.umeng.ccg.a.f12829h) ? a(com.umeng.ccg.a.f12829h, optJSONObject.optJSONObject(com.umeng.ccg.a.f12829h)) : null;
            ArrayList arrayList = new ArrayList();
            if (a5 != null) {
                arrayList.add(a5);
            }
            if (a6 != null) {
                arrayList.add(a6);
            }
            if (a7 != null) {
                arrayList.add(a7);
            }
            if (a8 != null) {
                arrayList.add(a8);
            }
            if (a9 != null) {
                arrayList.add(a9);
            }
            if (a10 != null) {
                arrayList.add(a10);
            }
            if (a11 != null) {
                arrayList.add(a11);
            }
            com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 202, a(), arrayList);
        } catch (Throwable unused) {
        }
    }

    private boolean e() {
        SharedPreferences a5 = ar.a(UMGlobalContext.getAppContext());
        if (a5 != null) {
            String string = a5.getString(ar.f12186f, "");
            if (TextUtils.isEmpty(string)) {
                f();
                return false;
            }
            try {
                if (!ap.a().keySet().equals(ap.a(new JSONObject(string)).keySet())) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static d a() {
        return b.f12882a;
    }

    private JSONObject b(Context context) {
        FileInputStream fileInputStream;
        try {
            File filesDir = context.getFilesDir();
            String str = f12869b;
            if (!new File(filesDir, str).exists()) {
                return null;
            }
            try {
                fileInputStream = context.openFileInput(str);
            } catch (Throwable unused) {
                fileInputStream = null;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(at.a(HelperUtils.readStreamToByteArray(fileInputStream), UMConfigure.sAppkey.getBytes())));
                try {
                    ap.a(fileInputStream);
                } catch (Throwable unused2) {
                }
                return jSONObject;
            } catch (Throwable unused3) {
                ap.a(fileInputStream);
                return null;
            }
        } catch (Throwable unused4) {
            return null;
        }
    }

    public void a(Context context) {
        com.umeng.ccg.c.a(context, 105, a(), null);
    }

    private boolean a(JSONObject jSONObject) {
        if (jSONObject == null || !jSONObject.has(PluginConstants.KEY_ERROR_CODE)) {
            return false;
        }
        try {
            if (200 == Integer.valueOf(jSONObject.optInt(PluginConstants.KEY_ERROR_CODE)).intValue() && jSONObject.has(com.umeng.ccg.a.f12822a)) {
                return jSONObject.has("ts");
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private void a(Context context, JSONObject jSONObject, String str) {
        try {
            long b5 = b(jSONObject);
            byte[] a5 = at.a(jSONObject.toString().getBytes(), UMConfigure.sAppkey.getBytes());
            if (a5 != null && a5.length > 1) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(context.getFilesDir(), f12869b));
                try {
                    fileOutputStream.write(a5);
                    fileOutputStream.flush();
                    ap.a(fileOutputStream);
                    a(context, str, b5);
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "saveConfigFile success.");
                } catch (Throwable th) {
                    ap.a(fileOutputStream);
                    throw th;
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void b(String str) {
        String str2 = ar.f12182b + str;
        SharedPreferences a5 = ar.a(UMGlobalContext.getAppContext());
        if (a5 != null) {
            a5.edit().putLong(str2, System.currentTimeMillis()).commit();
        }
    }

    private void a(String str, aa aaVar) {
        if (com.umeng.ccg.a.f12827f.equalsIgnoreCase(str)) {
            if (f12872e == null) {
                f12872e = new ArrayList<>();
            }
            f12872e.add(aaVar);
        }
        if (com.umeng.ccg.a.f12828g.equalsIgnoreCase(str)) {
            if (f12873f == null) {
                f12873f = new ArrayList<>();
            }
            f12873f.add(aaVar);
        }
        if (com.umeng.ccg.a.f12829h.equalsIgnoreCase(str)) {
            if (f12874g == null) {
                f12874g = new ArrayList<>();
            }
            f12874g.add(aaVar);
        }
    }

    private z a(String str, JSONObject jSONObject) {
        JSONArray optJSONArray;
        String str2;
        String str3;
        z zVar;
        JSONArray optJSONArray2;
        if (jSONObject != null) {
            try {
                if (jSONObject.has(com.umeng.ccg.a.f12830i) && (optJSONArray = jSONObject.optJSONArray(com.umeng.ccg.a.f12830i)) != null && optJSONArray.length() > 0) {
                    JSONObject jSONObject2 = (JSONObject) optJSONArray.get(0);
                    boolean has = jSONObject2.has(com.umeng.ccg.a.f12831j);
                    boolean has2 = jSONObject2.has(com.umeng.ccg.a.f12834m);
                    boolean has3 = jSONObject2.has(com.umeng.ccg.a.f12835n);
                    if (!has || !has2 || !has3) {
                        return null;
                    }
                    try {
                        int optInt = jSONObject2.optInt(com.umeng.ccg.a.f12831j);
                        long optLong = jSONObject2.optLong(com.umeng.ccg.a.f12834m);
                        long optLong2 = jSONObject2.optLong(com.umeng.ccg.a.f12835n);
                        String optString = jSONObject2.optString(com.umeng.ccg.a.f12836o);
                        ArrayList arrayList = new ArrayList();
                        if (jSONObject2.has(com.umeng.ccg.a.f12832k)) {
                            JSONArray optJSONArray3 = jSONObject2.optJSONArray(com.umeng.ccg.a.f12832k);
                            str2 = "action";
                            HashSet hashSet = new HashSet();
                            if (optJSONArray3 != null) {
                                str3 = com.umeng.ccg.a.f12839r;
                                int i5 = 0;
                                for (int length = optJSONArray3.length(); i5 < length; length = length) {
                                    hashSet.add(Integer.valueOf(optJSONArray3.getInt(i5)));
                                    i5++;
                                }
                            } else {
                                str3 = com.umeng.ccg.a.f12839r;
                            }
                            if (hashSet.size() > 0) {
                                aj ajVar = new aj(hashSet);
                                if (Arrays.asList(f12871d).contains(str)) {
                                    a(str, ajVar);
                                } else {
                                    arrayList.add(ajVar);
                                }
                            }
                        } else {
                            str2 = "action";
                            str3 = com.umeng.ccg.a.f12839r;
                        }
                        if (jSONObject2.has(com.umeng.ccg.a.f12833l)) {
                            String optString2 = jSONObject2.optString(com.umeng.ccg.a.f12833l);
                            if (!TextUtils.isEmpty(optString2)) {
                                ah ahVar = new ah(optString2);
                                HashSet hashSet2 = new HashSet();
                                for (int i6 = 1; i6 <= 24; i6++) {
                                    if (ahVar.a(i6)) {
                                        hashSet2.add(Integer.valueOf(i6));
                                    }
                                }
                                if (hashSet2.size() > 0) {
                                    ad adVar = new ad(hashSet2);
                                    if (Arrays.asList(f12871d).contains(str)) {
                                        a(str, adVar);
                                    } else {
                                        arrayList.add(adVar);
                                    }
                                }
                            }
                        }
                        arrayList.add(new af(optInt));
                        ae aeVar = new ae(str, optLong);
                        String[] strArr = f12871d;
                        if (Arrays.asList(strArr).contains(str)) {
                            a(str, aeVar);
                        } else {
                            arrayList.add(aeVar);
                        }
                        ac acVar = new ac(optLong2);
                        if (Arrays.asList(strArr).contains(str)) {
                            a(str, acVar);
                            arrayList.add(acVar);
                        } else {
                            arrayList.add(acVar);
                        }
                        if (com.umeng.ccg.a.f12826e.equals(str)) {
                            zVar = new ab(str, arrayList);
                        } else {
                            zVar = new z(str, arrayList);
                        }
                        try {
                            zVar.a(optString);
                            String str4 = "";
                            String str5 = str3;
                            if (jSONObject.has(str5) && (optJSONArray2 = jSONObject.optJSONArray(str5)) != null) {
                                Map<String, a> map = this.f12877i;
                                if (map != null && !map.containsKey(str)) {
                                    this.f12877i.put(str, new a(new JSONArray(optJSONArray2.toString()), optString));
                                }
                                int length2 = optJSONArray2.length();
                                for (int i7 = 0; i7 < optJSONArray2.length(); i7++) {
                                    str4 = str4 + optJSONArray2.getString(i7);
                                    if (i7 < length2 - 1) {
                                        str4 = str4 + ",";
                                    }
                                }
                            }
                            zVar.b(str4);
                            if (com.umeng.ccg.a.f12826e.equals(str) && (zVar instanceof ab)) {
                                String str6 = str2;
                                if (jSONObject2.has(str6)) {
                                    ((ab) zVar).d(jSONObject2.optString(str6));
                                }
                                if (jSONObject2.has(com.umeng.ccg.a.f12840s)) {
                                    ((ab) zVar).c(jSONObject2.optString(com.umeng.ccg.a.f12840s));
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        return zVar;
                    } catch (Throwable unused2) {
                        return null;
                    }
                }
            } catch (Throwable unused3) {
            }
        }
        return null;
    }

    private void a(Context context, String str, long j5) {
        SharedPreferences a5;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] split = str.split("@");
            if (split.length != 4 || (a5 = ar.a(context)) == null) {
                return;
            }
            long parseLong = Long.parseLong(split[0]);
            String str2 = split[1];
            SharedPreferences.Editor edit = a5.edit();
            edit.putLong(ar.f12183c, j5);
            edit.putLong(ar.f12184d, parseLong);
            edit.putString(ar.f12185e, str2).commit();
            UMRTLog.i(UMRTLog.RTLOG_TAG, "updateTsS1S2 : ts = " + j5 + "; s1 = " + parseLong + "; s2 = " + str2);
        } catch (Throwable unused) {
        }
    }

    private void a(String str) {
        try {
            String[] split = str.split("@");
            if (split.length != 4) {
                return;
            }
            long parseLong = Long.parseLong(split[0]);
            String str2 = split[1];
            if (!TextUtils.isEmpty(this.f12876h)) {
                String[] split2 = this.f12876h.split("@");
                if (split2.length == 2) {
                    long parseLong2 = Long.parseLong(split2[0]);
                    String str3 = split2[1];
                    if (parseLong2 == parseLong && str3.equalsIgnoreCase(str2)) {
                        UMRTLog.i(UMRTLog.RTLOG_TAG, "重复的iucc S1 and S2, 忽略本次更新，不发起fetch。");
                        return;
                    }
                }
            }
            SharedPreferences a5 = ar.a(UMGlobalContext.getAppContext());
            if (a5 != null) {
                if (a5.getLong(ar.f12183c, 0L) != parseLong) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "local config ts != iuccS1, send FETCH_NEW_CONFIG msg.");
                    this.f12876h = String.valueOf(parseLong) + "@" + str2;
                    com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 101, a(), str);
                    return;
                }
                d(UMGlobalContext.getAppContext());
                if (e(UMGlobalContext.getAppContext()).equalsIgnoreCase(str2)) {
                    return;
                }
                UMRTLog.i(UMRTLog.RTLOG_TAG, "local S2 != iuccS2, send FETCH_NEW_CONFIG msg.");
                this.f12876h = String.valueOf(parseLong) + "@" + str2;
                com.umeng.ccg.c.a(UMGlobalContext.getAppContext(), 101, a(), str);
            }
        } catch (Throwable unused) {
        }
    }

    private void a(boolean z4) {
        try {
            SharedPreferences a5 = ar.a(UMGlobalContext.getAppContext());
            if (a5 != null) {
                SharedPreferences.Editor edit = a5.edit();
                if (z4) {
                    edit.putString(ar.f12187g, "1").commit();
                } else {
                    edit.putString(ar.f12187g, "").commit();
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x03bf, code lost:
    
        if (r8 != null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x03cc, code lost:
    
        r3.put("config", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x03ca, code lost:
    
        if (0 == 0) goto L129;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v15, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v19, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r3v58 */
    @Override // com.umeng.ccg.c.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r20, int r21) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.ccg.d.a(java.lang.Object, int):void");
    }
}
