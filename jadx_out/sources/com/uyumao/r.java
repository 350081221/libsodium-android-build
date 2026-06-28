package com.uyumao;

import android.content.Context;
import android.os.Build;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.cx;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f13703a;

    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f13704a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f13705b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f13706c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f13707d;

        public a(Context context, int i5, int i6, String str) {
            this.f13704a = context;
            this.f13705b = i5;
            this.f13706c = i6;
            this.f13707d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ByteArrayOutputStream byteArrayOutputStream = null;
            try {
                TreeSet treeSet = new TreeSet();
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    int i5 = 0;
                    byte[] bArr = {18, -119, 31, 22, 8, 45, 8, 26, 5, 10, 98, 78, -51, 47, -125, 34, 17, 108, -112, -104, 95, 34, 120, kotlin.io.encoding.a.f19277h, -52, -77, 8, 107, -4, 56, 82, -49, -119, -18, -111, -20, 110, -108, -32, -28, 88, -5, 69, -26, 120, -36, 5, -77, -46, 29, 24, -115, -118, -9, -108, -86, -17, 34, 115, -123, 93, 53, 118, 64, 48, -101, -83, -59, -99, 36, 69, -104, 51, -126, 8, -18, 79, -115, -16, 84, -49, 72, 66, 49, 93, -22, -127, -47, -59, -86, cx.f12476l, -12, -100, -12, 53, 85, 37, -75, -30, 31, 44, -83, 99, -108, -92, -127, -32, 87, -61, -83, -90, 123, -98, -32, -60, 77, 113, -60, 101, 81, 57, -72, -86, 28, -74, 88, 35, -118, -22, -74, -29, -103, -86, -25, 19, -78, 62, 28, -100, -68, 1, 35, -68, 58, -100, 29, 5, -10, -95, 20, 98, 124, -40, 99, -100, 8, -126, -10, 79, -31, -42, -114, 12, 27, -102, 114, -107, -35, 82, 21, 97, -9, 39, -20, 123, -37, -68, -78, -89, cx.f12475k, 3, 21, 21, 12, 40, cx.f12476l, 29};
                    byte[] copyOfRange = Arrays.copyOfRange(bArr, 179, 187);
                    byte[] copyOf = Arrays.copyOf(bArr, 179);
                    e.a(copyOf, copyOfRange);
                    e.a(copyOf, byteArrayOutputStream2);
                    JSONObject jSONObject = new JSONObject(byteArrayOutputStream2.toString());
                    Object a5 = t.a(jSONObject.optString("c"), jSONObject.optString(bi.aA), null, this.f13704a, null);
                    if (1 == this.f13705b) {
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
                        n.a(byteArrayOutputStream2);
                        return;
                    }
                    if (a5 == null) {
                        n.a(byteArrayOutputStream2);
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
                            if (jSONArray.length() == this.f13706c) {
                                arrayList.add(jSONArray);
                                jSONArray = new JSONArray();
                            }
                        }
                    }
                    if (jSONArray.length() > 0) {
                        arrayList.add(jSONArray);
                    }
                    if (arrayList.isEmpty()) {
                        n.a(byteArrayOutputStream2);
                        return;
                    }
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(bi.al, UMUtils.getZid(this.f13704a));
                    jSONObject3.put("appkey", this.f13707d);
                    jSONObject3.put(bi.f12261g, UMUtils.getUMId(this.f13704a));
                    jSONObject3.put("v", "3.0");
                    jSONObject3.put("sdk_v", "1.1.2");
                    jSONObject3.put("os_v", Build.VERSION.RELEASE);
                    jSONObject3.put("brand", n.b());
                    jSONObject3.put("model", n.c());
                    Object uuid = UUID.randomUUID().toString();
                    jSONObject3.put("uuid", uuid);
                    jSONObject3.put("smart_id", uuid);
                    jSONObject3.put("src", "risk");
                    jSONObject3.put("imei", DeviceConfig.getImeiNew(this.f13704a));
                    try {
                        jSONObject3.put("oaid", DeviceConfig.getOaid(this.f13704a));
                    } catch (Throwable unused) {
                    }
                    try {
                        jSONObject3.put("idfa", DeviceConfig.getIdfa(this.f13704a));
                    } catch (Throwable unused2) {
                    }
                    jSONObject3.put("android_id", DeviceConfig.getAndroidId(this.f13704a));
                    jSONObject3.put("pkg", this.f13704a.getPackageName());
                    jSONObject3.put("app_v", UMUtils.getAppVersionName(this.f13704a));
                    jSONObject3.put("board", n.a());
                    try {
                        Locale locale = UMUtils.getLocale(this.f13704a);
                        if (locale != null) {
                            jSONObject3.put("os_lang", locale.getLanguage());
                        }
                    } catch (Throwable unused3) {
                    }
                    jSONObject3.put("c_ts", System.currentTimeMillis());
                    jSONObject3.put("total", i6);
                    try {
                        jSONObject3.put("os_i", Build.VERSION.SDK_INT);
                        jSONObject3.put("os_t", this.f13704a.getApplicationInfo().targetSdkVersion);
                        jSONObject3.put("grant", n.a(this.f13704a) ? 1 : 0);
                    } catch (Throwable unused4) {
                    }
                    try {
                        jSONObject3.put(bi.f12278x, "Android");
                        Object[] networkAccessMode = DeviceConfig.getNetworkAccessMode(this.f13704a);
                        if ("Wi-Fi".equals(networkAccessMode[0])) {
                            jSONObject3.put(bi.Q, NetworkUtil.NETWORK_TYPE_WIFI);
                        } else if ("2G/3G".equals(networkAccessMode[0])) {
                            jSONObject3.put(bi.Q, "2G/3G");
                        } else {
                            jSONObject3.put(bi.Q, "unknown");
                        }
                        if (!"".equals(networkAccessMode[1])) {
                            jSONObject3.put("sub_access", networkAccessMode[1]);
                        }
                        jSONObject3.put(bi.f12273s, DeviceConfig.getAppName(this.f13704a));
                    } catch (Throwable unused5) {
                    }
                    try {
                        String[] split = r.this.f13703a.optString(com.umeng.ccg.a.f12839r).split(",");
                        JSONArray jSONArray2 = new JSONArray();
                        for (String str : split) {
                            jSONArray2.put(str);
                        }
                        jSONObject3.put(com.umeng.ccg.a.f12839r, jSONArray2);
                        jSONObject3.put(com.umeng.ccg.a.f12836o, r.this.f13703a.optString(com.umeng.ccg.a.f12836o));
                        jSONObject3.put(com.umeng.ccg.a.f12837p, r.this.f13703a.optString(com.umeng.ccg.a.f12837p));
                        String optString = r.this.f13703a.optString("actionName");
                        JSONArray jSONArray3 = new JSONArray(r.this.f13703a.optString(com.umeng.ccg.a.f12838q));
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put(optString, jSONArray3);
                        jSONObject3.put(com.umeng.ccg.a.f12838q, jSONObject4);
                    } catch (Throwable unused6) {
                    }
                    int size = arrayList.size();
                    Iterator it4 = arrayList.iterator();
                    while (it4.hasNext()) {
                        JSONArray jSONArray4 = (JSONArray) it4.next();
                        i5++;
                        jSONObject3.put(com.umeng.ccg.a.f12840s, i5);
                        jSONObject3.put("batch_num", size);
                        jSONObject3.put("batch_pkg_num", jSONArray4.length());
                        jSONObject3.put("apl", jSONArray4);
                        try {
                            e.a(jSONObject3, "https://yumao.puata.info/cc_info", this.f13707d);
                        } catch (Exception e5) {
                            throw e5;
                        }
                    }
                    n.a(byteArrayOutputStream2);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    try {
                        th.getMessage();
                    } finally {
                        n.a(byteArrayOutputStream);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public r(JSONObject jSONObject) {
        this.f13703a = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f13703a == null) {
            return;
        }
        try {
            Context context = e.f13663a;
            String appkey = UMUtils.getAppkey(context);
            int max = Math.max(this.f13703a.optInt(com.umeng.ccg.a.f12840s, 300), 100);
            int optInt = this.f13703a.optInt("action", 1);
            if (optInt != 1 && optInt != 2) {
                return;
            }
            s.a(new a(context, optInt, max, appkey), 0L, TimeUnit.SECONDS);
        } catch (Throwable unused) {
        }
    }
}
