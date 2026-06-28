package com.uyumao;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.cx;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import com.uyumao.o;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class q implements Runnable {

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f13698a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f13699b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f13700c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13701d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f13702e;

        public a(q qVar, Context context, int i5, int i6, String str, long j5) {
            this.f13698a = context;
            this.f13699b = i5;
            this.f13700c = i6;
            this.f13701d = str;
            this.f13702e = j5;
        }

        @Override // java.lang.Runnable
        public void run() {
            TreeSet treeSet;
            ByteArrayOutputStream byteArrayOutputStream;
            ByteArrayOutputStream byteArrayOutputStream2 = null;
            try {
                treeSet = new TreeSet();
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
            }
            try {
                int i5 = 0;
                byte[] bArr = {18, -119, 31, 22, 8, 45, 8, 26, 5, 10, 98, 78, -51, 47, -125, 34, 17, 108, -112, -104, 95, 34, 120, kotlin.io.encoding.a.f19277h, -52, -77, 8, 107, -4, 56, 82, -49, -119, -18, -111, -20, 110, -108, -32, -28, 88, -5, 69, -26, 120, -36, 5, -77, -46, 29, 24, -115, -118, -9, -108, -86, -17, 34, 115, -123, 93, 53, 118, 64, 48, -101, -83, -59, -99, 36, 69, -104, 51, -126, 8, -18, 79, -115, -16, 84, -49, 72, 66, 49, 93, -22, -127, -47, -59, -86, cx.f12476l, -12, -100, -12, 53, 85, 37, -75, -30, 31, 44, -83, 99, -108, -92, -127, -32, 87, -61, -83, -90, 123, -98, -32, -60, 77, 113, -60, 101, 81, 57, -72, -86, 28, -74, 88, 35, -118, -22, -74, -29, -103, -86, -25, 19, -78, 62, 28, -100, -68, 1, 35, -68, 58, -100, 29, 5, -10, -95, 20, 98, 124, -40, 99, -100, 8, -126, -10, 79, -31, -42, -114, 12, 27, -102, 114, -107, -35, 82, 21, 97, -9, 39, -20, 123, -37, -68, -78, -89, cx.f12475k, 3, 21, 21, 12, 40, cx.f12476l, 29};
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 179, 187);
                byte[] copyOf = Arrays.copyOf(bArr, 179);
                e.a(copyOf, copyOfRange);
                e.a(copyOf, byteArrayOutputStream);
                JSONObject jSONObject = new JSONObject(byteArrayOutputStream.toString());
                Object a5 = t.a(jSONObject.optString("c"), jSONObject.optString(bi.aA), null, this.f13698a, null);
                if (1 == this.f13699b) {
                    Object a6 = t.a(jSONObject.optString("m"), jSONObject.optString("q"), new Class[]{t.a(jSONObject.optString("i")), Integer.TYPE}, a5, new Object[]{t.a(jSONObject.optString("i"), new Class[]{String.class}, new Object[]{jSONObject.optString(bi.ay)}), 0});
                    if (a6 instanceof List) {
                        Field a7 = t.a(jSONObject.optString("r"), jSONObject.optString(bi.aE));
                        Field a8 = t.a(jSONObject.optString(bi.aL), jSONObject.optString("n"));
                        Iterator it = ((List) a6).iterator();
                        while (it.hasNext()) {
                            Object a9 = t.a(a8, t.a(a7, it.next()));
                            if (a9 != null) {
                                treeSet.add((String) a9);
                            }
                        }
                    }
                } else {
                    Object a10 = t.a(jSONObject.optString("m"), jSONObject.optString(bi.aK), new Class[]{Integer.TYPE}, a5, new Object[]{0});
                    if (a10 instanceof List) {
                        Field a11 = t.a(jSONObject.optString("v"), jSONObject.optString("n"));
                        Iterator it2 = ((List) a10).iterator();
                        while (it2.hasNext()) {
                            Object a12 = t.a(a11, it2.next());
                            if (a12 != null) {
                                treeSet.add((String) a12);
                            }
                        }
                    }
                }
                if (treeSet.isEmpty()) {
                    n.a(byteArrayOutputStream);
                    return;
                }
                if (a5 == null) {
                    n.a(byteArrayOutputStream);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = new JSONArray();
                Iterator it3 = treeSet.iterator();
                int i6 = 0;
                while (it3.hasNext()) {
                    Object a13 = n.a(a5, (String) it3.next(), 0);
                    if (a13 != null) {
                        p pVar = new p(a5, a13);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(bi.ay, pVar.f13693b);
                        jSONObject2.put(bi.aA, pVar.f13692a);
                        jSONObject2.put("v", pVar.f13694c);
                        jSONObject2.put(bi.aL, pVar.f13697f);
                        jSONObject2.put("i", pVar.f13695d);
                        jSONObject2.put(bi.aK, pVar.f13696e);
                        jSONArray.put(jSONObject2);
                        i6++;
                        if (jSONArray.length() == this.f13700c) {
                            arrayList.add(jSONArray);
                            jSONArray = new JSONArray();
                        }
                    }
                }
                if (jSONArray.length() > 0) {
                    arrayList.add(jSONArray);
                }
                if (arrayList.isEmpty()) {
                    n.a(byteArrayOutputStream);
                    return;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(bi.al, UMUtils.getZid(this.f13698a));
                jSONObject3.put("appkey", this.f13701d);
                jSONObject3.put(bi.f12261g, UMUtils.getUMId(this.f13698a));
                jSONObject3.put("v", "2.0");
                jSONObject3.put("sdk_v", "1.1.2");
                jSONObject3.put("os_v", Build.VERSION.RELEASE);
                jSONObject3.put("brand", n.b());
                jSONObject3.put("model", n.c());
                jSONObject3.put("smart_id", this.f13702e);
                jSONObject3.put("src", "risk");
                jSONObject3.put("imei", DeviceConfig.getImeiNew(this.f13698a));
                try {
                    jSONObject3.put("oaid", DeviceConfig.getOaid(this.f13698a));
                } catch (Throwable unused) {
                }
                try {
                    jSONObject3.put("idfa", DeviceConfig.getIdfa(this.f13698a));
                } catch (Throwable unused2) {
                }
                jSONObject3.put("android_id", DeviceConfig.getAndroidId(this.f13698a));
                jSONObject3.put("pkg", this.f13698a.getPackageName());
                jSONObject3.put("app_v", UMUtils.getAppVersionName(this.f13698a));
                jSONObject3.put("board", n.a());
                try {
                    Locale locale = UMUtils.getLocale(this.f13698a);
                    if (locale != null) {
                        jSONObject3.put("os_lang", locale.getLanguage());
                    }
                } catch (Throwable unused3) {
                }
                jSONObject3.put("c_ts", System.currentTimeMillis());
                jSONObject3.put("total", i6);
                try {
                    jSONObject3.put("os_i", Build.VERSION.SDK_INT);
                    jSONObject3.put("os_t", this.f13698a.getApplicationInfo().targetSdkVersion);
                    jSONObject3.put("grant", n.a(this.f13698a) ? 1 : 0);
                } catch (Throwable unused4) {
                }
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    JSONArray jSONArray2 = (JSONArray) it4.next();
                    i5++;
                    jSONObject3.put(com.umeng.ccg.a.f12840s, i5);
                    jSONObject3.put("data", jSONArray2);
                    try {
                        e.a(jSONObject3, "https://sss.umeng.com/api/v2/al", this.f13701d);
                    } catch (Exception e5) {
                        throw e5;
                    }
                }
                n.a(byteArrayOutputStream);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream2 = byteArrayOutputStream;
                try {
                    th.getMessage();
                } finally {
                    n.a(byteArrayOutputStream2);
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i5;
        JSONObject jSONObject;
        Context context = e.f13663a;
        if (o.f13688a == null) {
            synchronized (o.class) {
                if (o.f13688a == null) {
                    o.f13688a = new o(context);
                }
            }
        }
        o oVar = o.f13688a;
        if (n.c(oVar.f13689b)) {
            oVar.f13690c.b("smart_lc", oVar.a() + 1);
        }
        String str = oVar.f13690c.f13691a + "smart_lt";
        String valueOf = String.valueOf(0);
        try {
            if (n.c(e.f13663a)) {
                valueOf = m.a().f13683b.getString(str, valueOf);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            i5 = Integer.parseInt(valueOf);
        } catch (Exception unused) {
            i5 = 0;
        }
        if (oVar.a() < i5 || !oVar.a("smart_")) {
            return;
        }
        try {
            Context context2 = e.f13663a;
            String appkey = UMUtils.getAppkey(context2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(bi.al, UMUtils.getZid(context2));
            try {
                jSONObject2.put("imei", DeviceConfig.getImeiNew(context2));
                jSONObject2.put("oaid", DeviceConfig.getOaid(context2));
            } catch (Throwable unused2) {
            }
            try {
                jSONObject2.put("idfa", DeviceConfig.getIdfa(context2));
            } catch (Throwable unused3) {
            }
            jSONObject2.put(bi.f12261g, UMUtils.getUMId(context2));
            jSONObject2.put("android_id", DeviceConfig.getAndroidId(context2));
            jSONObject2.put("sdk_v", "1.1.2");
            jSONObject2.put("os_v", Build.VERSION.RELEASE);
            jSONObject2.put("lvl", Build.VERSION.SDK_INT);
            String[] networkAccessMode = UMUtils.getNetworkAccessMode(context2);
            if (TextUtils.isEmpty(networkAccessMode[0])) {
                networkAccessMode[0] = "Unknown";
            }
            jSONObject2.put(i0.b.f16155k, networkAccessMode[0]);
            jSONObject2.put("brand", n.b());
            long a5 = oVar.f13690c.a("smart_ts", 0L);
            if (a5 > 0) {
                jSONObject2.put("last", a5);
            }
            try {
                jSONObject = e.a(jSONObject2, "https://ccs.umeng.com/ra", appkey, false);
            } catch (Exception unused4) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                oVar.a(7200L);
                return;
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("data");
            if (optJSONObject == null) {
                oVar.a(7200L);
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("aa");
            if (optJSONObject2 == null) {
                optJSONObject2 = new JSONObject();
            }
            int optInt = optJSONObject2.optInt("launch", 5);
            o.a aVar = oVar.f13690c;
            aVar.a(aVar.f13691a + "smart_lt", String.valueOf(optInt));
            if (oVar.a() < optInt) {
                return;
            }
            oVar.a(optJSONObject.optLong("ttl", 86400L));
            long optLong = optJSONObject.optLong("id", -1L);
            if (optLong <= 0) {
                return;
            }
            int max = Math.max(optJSONObject2.optInt(com.umeng.ccg.a.f12840s, 300), 100);
            int optInt2 = optJSONObject2.optInt("action", 1);
            int optInt3 = optJSONObject2.optInt("delay");
            if (optInt2 != 1 && optInt2 != 2) {
                return;
            }
            s.a(new a(this, context2, optInt2, max, appkey, optLong), optInt3, TimeUnit.SECONDS);
        } catch (Throwable unused5) {
        }
    }
}
