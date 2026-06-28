package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.o;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12736a = "fs_lc_tl_uapp";

    /* renamed from: f, reason: collision with root package name */
    private static final String f12737f = "-1";

    /* renamed from: g, reason: collision with root package name */
    private static Context f12738g;

    /* renamed from: b, reason: collision with root package name */
    private final int f12739b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12740c;

    /* renamed from: d, reason: collision with root package name */
    private final int f12741d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12742e;

    /* renamed from: h, reason: collision with root package name */
    private JSONObject f12743h;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final s f12744a = new s();

        private a() {
        }
    }

    public static s a(Context context) {
        if (f12738g == null && context != null) {
            f12738g = context.getApplicationContext();
        }
        return a.f12744a;
    }

    private void b(Context context) {
        try {
            String string = PreferenceWrapper.getDefault(context).getString(f12736a, null);
            if (!TextUtils.isEmpty(string)) {
                this.f12743h = new JSONObject(string);
            }
            a();
        } catch (Exception unused) {
        }
    }

    private void c(Context context) {
        try {
            if (this.f12743h != null) {
                PreferenceWrapper.getDefault(f12738g).edit().putString(f12736a, this.f12743h.toString()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    private s() {
        this.f12739b = 128;
        this.f12740c = 256;
        this.f12741d = 1024;
        this.f12742e = 10;
        this.f12743h = null;
        try {
            b(f12738g);
        } catch (Throwable unused) {
        }
    }

    private boolean c(String str) {
        if (str == null) {
            return true;
        }
        try {
            return str.trim().getBytes().length <= 1024;
        } catch (Exception unused) {
            return false;
        }
    }

    public void a(String str, String str2, long j5, int i5, String str3) {
        String a5;
        try {
            if (a(str) && b(str2)) {
                if (Arrays.asList(d.aM).contains(str)) {
                    MLog.e("key is " + str + ", please check key, illegal");
                    UMLog.aq(j.f12624m, 0, "\\|");
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", currentTimeMillis);
                if (j5 > 0) {
                    jSONObject.put(d.ac, j5);
                }
                jSONObject.put("__t", i.f12592a);
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put(str, str2);
                }
                if (UMUtils.isMainProgress(f12738g)) {
                    a5 = y.a().d(UMGlobalContext.getAppContext(f12738g));
                } else {
                    a5 = y.a().a(UMGlobalContext.getAppContext(f12738g), currentTimeMillis);
                }
                if (TextUtils.isEmpty(a5)) {
                    a5 = f12737f;
                }
                jSONObject.put("__i", a5);
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str3);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(d.aA, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f12738g).getProcessName(f12738g));
                a();
                JSONObject jSONObject3 = this.f12743h;
                if (jSONObject3 != null && jSONObject3.has(str) && !((Boolean) this.f12743h.get(str)).booleanValue()) {
                    jSONObject.put(d.ae, 1);
                    this.f12743h.put(str, true);
                    c(f12738g);
                }
                Context context = f12738g;
                UMWorkDispatch.sendEvent(context, 4097, CoreProtocol.getInstance(context), jSONObject);
                return;
            }
            UMLog.aq(j.f12623l, 0, "\\|");
        } catch (Throwable unused2) {
        }
    }

    private boolean b(String str) {
        if (str == null) {
            return true;
        }
        try {
            if (str.trim().getBytes().length <= 256) {
                return true;
            }
        } catch (Exception unused) {
        }
        MLog.e("value is " + str + ", please check value, illegal");
        return false;
    }

    private boolean b(Map<String, Object> map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (!a(entry.getKey())) {
                            UMLog.aq(j.f12619h, 0, "\\|");
                            return false;
                        }
                        if (entry.getValue() == null) {
                            UMLog.aq(j.f12620i, 0, "\\|");
                            return false;
                        }
                        if (entry.getValue() instanceof String) {
                            if (d.aK.equals(entry.getKey())) {
                                if (!c(entry.getValue().toString())) {
                                    UMLog.aq(j.P, 0, "\\|");
                                    return false;
                                }
                            } else if ("_$!url".equals(entry.getKey())) {
                                if (!c(entry.getValue().toString())) {
                                    UMLog.aq("url参数长度超过限制。|参数url长度不能超过1024字符。", 0, "\\|");
                                    return false;
                                }
                            } else if (!b(entry.getValue().toString())) {
                                UMLog.aq(j.f12621j, 0, "\\|");
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } catch (Exception unused) {
                return true;
            }
        }
        UMLog.aq(j.f12618g, 0, "\\|");
        return false;
    }

    public void a(String str, Map<String, Object> map, long j5, String str2, boolean z4) {
        String a5;
        try {
            if (!a(str)) {
                UMLog.aq(j.f12617f, 0, "\\|");
                return;
            }
            if (b(map)) {
                if (map.size() > 100) {
                    MLog.e("map size is " + map.size() + ", please check");
                    return;
                }
                if (Arrays.asList(d.aM).contains(str)) {
                    MLog.e("key is " + str + ", please check key, illegal");
                    UMLog.aq(j.f12613b, 0, "\\|");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                if (j5 > 0) {
                    jSONObject.put(d.ac, j5);
                }
                jSONObject.put("__t", i.f12592a);
                ULog.i("befort ekv map, event is " + jSONObject.toString());
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    if (!Arrays.asList(d.aM).contains(entry.getKey())) {
                        Object value = entry.getValue();
                        if (!(value instanceof String) && !(value instanceof Integer) && !(value instanceof Long) && !(value instanceof Short) && !(value instanceof Float) && !(value instanceof Double)) {
                            if (value.getClass().isArray()) {
                                if (value instanceof int[]) {
                                    int[] iArr = (int[]) value;
                                    if (iArr.length > 10) {
                                        MLog.e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray = new JSONArray();
                                    for (int i5 : iArr) {
                                        jSONArray.put(i5);
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray);
                                } else if (value instanceof double[]) {
                                    double[] dArr = (double[]) value;
                                    if (dArr.length > 10) {
                                        MLog.e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray2 = new JSONArray();
                                    for (double d5 : dArr) {
                                        jSONArray2.put(d5);
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray2);
                                } else if (value instanceof long[]) {
                                    long[] jArr = (long[]) value;
                                    if (jArr.length > 10) {
                                        MLog.e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray3 = new JSONArray();
                                    for (long j6 : jArr) {
                                        jSONArray3.put(j6);
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray3);
                                } else if (value instanceof float[]) {
                                    float[] fArr = (float[]) value;
                                    if (fArr.length > 10) {
                                        MLog.e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray4 = new JSONArray();
                                    for (float f5 : fArr) {
                                        jSONArray4.put(f5);
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray4);
                                } else if (value instanceof short[]) {
                                    short[] sArr = (short[]) value;
                                    if (sArr.length > 10) {
                                        MLog.e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray5 = new JSONArray();
                                    for (short s5 : sArr) {
                                        jSONArray5.put((int) s5);
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray5);
                                } else if (value instanceof String[]) {
                                    String[] strArr = (String[]) value;
                                    if (strArr.length > 10) {
                                        MLog.e("please check key or value, size overlength!");
                                        return;
                                    }
                                    JSONArray jSONArray6 = new JSONArray();
                                    for (int i6 = 0; i6 < strArr.length; i6++) {
                                        String str3 = strArr[i6];
                                        if (str3 == null) {
                                            MLog.e("please check array, null item!");
                                            return;
                                        } else {
                                            if (!b(str3)) {
                                                return;
                                            }
                                            jSONArray6.put(strArr[i6]);
                                        }
                                    }
                                    jSONObject.put(entry.getKey(), jSONArray6);
                                } else {
                                    MLog.e("please check key or value, illegal type!");
                                    return;
                                }
                            } else {
                                MLog.e("please check key or value, illegal type!");
                                return;
                            }
                        }
                        jSONObject.put(entry.getKey(), value);
                    } else {
                        UMLog.aq(j.f12616e, 0, "\\|");
                        return;
                    }
                }
                if (UMUtils.isMainProgress(f12738g)) {
                    a5 = y.a().d(UMGlobalContext.getAppContext(f12738g));
                } else {
                    a5 = y.a().a(UMGlobalContext.getAppContext(f12738g), jSONObject.getLong("ts"));
                }
                if (TextUtils.isEmpty(a5)) {
                    a5 = f12737f;
                }
                jSONObject.put("__i", a5);
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(d.aA, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f12738g).getProcessName(f12738g));
                a();
                JSONObject jSONObject3 = this.f12743h;
                if (jSONObject3 != null && jSONObject3.has(str) && !((Boolean) this.f12743h.get(str)).booleanValue()) {
                    jSONObject.put(d.ae, 1);
                    this.f12743h.put(str, true);
                    c(f12738g);
                }
                ULog.i("----->>>>>ekv event json is " + jSONObject.toString());
                if (!z4) {
                    Context context = f12738g;
                    UMWorkDispatch.sendEvent(context, 4097, CoreProtocol.getInstance(context), jSONObject);
                } else {
                    Context context2 = f12738g;
                    UMWorkDispatch.sendEvent(context2, o.a.f12704n, CoreProtocol.getInstance(context2), jSONObject);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public void a(String str, Map<String, Object> map, String str2) {
        try {
            if (a(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put(d.ac, 0);
                jSONObject.put("__t", i.f12593b);
                ULog.i("befort gkv map, event is " + jSONObject.toString());
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                for (int i5 = 0; i5 < 10 && it.hasNext(); i5++) {
                    Map.Entry<String, Object> next = it.next();
                    if (!d.ae.equals(next.getKey()) && !d.ac.equals(next.getKey()) && !"id".equals(next.getKey()) && !"ts".equals(next.getKey())) {
                        Object value = next.getValue();
                        if ((value instanceof String) || (value instanceof Integer) || (value instanceof Long)) {
                            jSONObject.put(next.getKey(), value);
                        }
                    }
                }
                String d5 = y.a().d(UMGlobalContext.getAppContext(f12738g));
                if (TextUtils.isEmpty(d5)) {
                    d5 = f12737f;
                }
                jSONObject.put("__i", d5);
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(d.aA, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put("ds", 0);
                jSONObject.put("pn", UMGlobalContext.getInstance(f12738g).getProcessName(f12738g));
                ULog.i("----->>>>>gkv event json is " + jSONObject.toString());
                Context context = f12738g;
                UMWorkDispatch.sendEvent(context, 4098, CoreProtocol.getInstance(context), jSONObject);
            }
        } catch (Throwable unused2) {
        }
    }

    private void a() {
        try {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(f12738g, "track_list", "");
            if (TextUtils.isEmpty(imprintProperty)) {
                return;
            }
            String[] split = imprintProperty.split("!");
            JSONObject jSONObject = new JSONObject();
            int i5 = 0;
            if (this.f12743h != null) {
                for (String str : split) {
                    String subStr = HelperUtils.subStr(str, 128);
                    if (this.f12743h.has(subStr)) {
                        jSONObject.put(subStr, this.f12743h.get(subStr));
                    }
                }
            }
            this.f12743h = new JSONObject();
            if (split.length >= 10) {
                while (i5 < 10) {
                    a(split[i5], jSONObject);
                    i5++;
                }
            } else {
                while (i5 < split.length) {
                    a(split[i5], jSONObject);
                    i5++;
                }
            }
            c(f12738g);
        } catch (Exception unused) {
        }
    }

    private void a(String str, JSONObject jSONObject) throws JSONException {
        String subStr = HelperUtils.subStr(str, 128);
        if (jSONObject.has(subStr)) {
            a(subStr, ((Boolean) jSONObject.get(subStr)).booleanValue());
        } else {
            a(subStr, false);
        }
    }

    private void a(String str, boolean z4) {
        try {
            if (d.ae.equals(str) || d.ac.equals(str) || "id".equals(str) || "ts".equals(str) || this.f12743h.has(str)) {
                return;
            }
            this.f12743h.put(str, z4);
        } catch (Exception unused) {
        }
    }

    public void a(List<String> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    a();
                    JSONObject jSONObject = this.f12743h;
                    if (jSONObject == null) {
                        this.f12743h = new JSONObject();
                        int size = list.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            JSONObject jSONObject2 = this.f12743h;
                            if (jSONObject2 == null) {
                                this.f12743h = new JSONObject();
                            } else if (jSONObject2.length() >= 5) {
                                break;
                            }
                            String str = list.get(i5);
                            if (!TextUtils.isEmpty(str)) {
                                a(HelperUtils.subStr(str, 128), false);
                            }
                        }
                        c(f12738g);
                        return;
                    }
                    if (jSONObject.length() >= 5) {
                        MLog.d("already setFistLaunchEvent, igone.");
                        return;
                    }
                    for (int i6 = 0; i6 < list.size(); i6++) {
                        if (this.f12743h.length() >= 5) {
                            MLog.d(" add setFistLaunchEvent over.");
                            return;
                        }
                        a(HelperUtils.subStr(list.get(i6), 128), false);
                    }
                    c(f12738g);
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        UMLog.aq(j.ak, 0, "\\|");
    }

    private JSONObject a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    String key = entry.getKey();
                    if (key != null) {
                        String subStr = HelperUtils.subStr(key, 128);
                        Object value = entry.getValue();
                        if (value != null) {
                            int i5 = 0;
                            if (value.getClass().isArray()) {
                                if (value instanceof int[]) {
                                    int[] iArr = (int[]) value;
                                    JSONArray jSONArray = new JSONArray();
                                    while (i5 < iArr.length) {
                                        jSONArray.put(iArr[i5]);
                                        i5++;
                                    }
                                    jSONObject.put(subStr, jSONArray);
                                } else if (value instanceof double[]) {
                                    double[] dArr = (double[]) value;
                                    JSONArray jSONArray2 = new JSONArray();
                                    while (i5 < dArr.length) {
                                        jSONArray2.put(dArr[i5]);
                                        i5++;
                                    }
                                    jSONObject.put(subStr, jSONArray2);
                                } else if (value instanceof long[]) {
                                    long[] jArr = (long[]) value;
                                    JSONArray jSONArray3 = new JSONArray();
                                    while (i5 < jArr.length) {
                                        jSONArray3.put(jArr[i5]);
                                        i5++;
                                    }
                                    jSONObject.put(subStr, jSONArray3);
                                } else if (value instanceof float[]) {
                                    float[] fArr = (float[]) value;
                                    JSONArray jSONArray4 = new JSONArray();
                                    while (i5 < fArr.length) {
                                        jSONArray4.put(fArr[i5]);
                                        i5++;
                                    }
                                    jSONObject.put(subStr, jSONArray4);
                                } else if (value instanceof short[]) {
                                    short[] sArr = (short[]) value;
                                    JSONArray jSONArray5 = new JSONArray();
                                    while (i5 < sArr.length) {
                                        jSONArray5.put((int) sArr[i5]);
                                        i5++;
                                    }
                                    jSONObject.put(subStr, jSONArray5);
                                }
                            } else if (value instanceof List) {
                                List list = (List) value;
                                JSONArray jSONArray6 = new JSONArray();
                                while (i5 < list.size()) {
                                    Object obj = list.get(i5);
                                    if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                                        jSONArray6.put(list.get(i5));
                                    }
                                    i5++;
                                }
                                if (jSONArray6.length() > 0) {
                                    jSONObject.put(subStr, jSONArray6);
                                }
                            } else if (value instanceof String) {
                                jSONObject.put(subStr, HelperUtils.subStr(value.toString(), 256));
                            } else {
                                if (!(value instanceof Long) && !(value instanceof Integer) && !(value instanceof Float) && !(value instanceof Double) && !(value instanceof Short)) {
                                    MLog.e("The param has not support type. please check !");
                                }
                                jSONObject.put(subStr, value);
                            }
                        }
                    }
                } catch (Exception e5) {
                    MLog.e(e5);
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    private boolean a(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length > 0 && length <= 128) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        MLog.e("key is " + str + ", please check key, illegal");
        return false;
    }
}
