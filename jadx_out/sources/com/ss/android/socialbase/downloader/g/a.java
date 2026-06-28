package com.ss.android.socialbase.downloader.g;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.downloader.c;
import com.ss.android.socialbase.downloader.i.h;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final h<Integer, a> f10818a = new h<>(16, 16);

    /* renamed from: b, reason: collision with root package name */
    private static final a f10819b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static JSONObject f10820c;

    /* renamed from: d, reason: collision with root package name */
    private static JSONObject f10821d;

    /* renamed from: e, reason: collision with root package name */
    private static Boolean f10822e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f10823f;

    /* renamed from: g, reason: collision with root package name */
    private static a f10824g;

    /* renamed from: h, reason: collision with root package name */
    private final JSONObject f10825h;

    /* renamed from: i, reason: collision with root package name */
    private final JSONObject f10826i;

    /* renamed from: j, reason: collision with root package name */
    private final Boolean f10827j;

    /* renamed from: k, reason: collision with root package name */
    private int f10828k;

    static {
        a();
    }

    private a(JSONObject jSONObject) {
        Boolean bool;
        this.f10825h = jSONObject;
        JSONObject jSONObject2 = null;
        r0 = null;
        r0 = null;
        Boolean bool2 = null;
        if (jSONObject != null && !f("bugfix")) {
            JSONObject optJSONObject = jSONObject.optJSONObject("bugfix");
            if (optJSONObject != null && optJSONObject.has("default") && !f("default")) {
                bool2 = Boolean.valueOf(optJSONObject.optInt("default", 0) == 1);
            }
            Boolean bool3 = bool2;
            jSONObject2 = optJSONObject;
            bool = bool3;
        } else {
            bool = null;
        }
        this.f10826i = jSONObject2;
        this.f10827j = bool;
    }

    public static void a() {
        Boolean bool;
        JSONObject F = c.F();
        f10823f = F.optInt("disable_task_setting", 0) == 1;
        f10820c = F.optJSONObject("disabled_task_keys");
        JSONObject optJSONObject = F.optJSONObject("bugfix");
        if (optJSONObject == null || !optJSONObject.has("default")) {
            bool = null;
        } else {
            bool = Boolean.valueOf(optJSONObject.optInt("default", 0) == 1);
        }
        f10821d = optJSONObject;
        f10822e = bool;
    }

    @NonNull
    public static JSONObject b() {
        return c.F();
    }

    @NonNull
    public static a c() {
        return f10819b;
    }

    public static boolean f(String str) {
        JSONObject jSONObject = f10820c;
        if (jSONObject == null || jSONObject.optInt(str, 0) != 1) {
            return false;
        }
        return true;
    }

    public JSONObject d(String str) {
        JSONObject jSONObject = this.f10825h;
        if (jSONObject != null && jSONObject.has(str) && !f(str)) {
            return this.f10825h.optJSONObject(str);
        }
        return b().optJSONObject(str);
    }

    public JSONArray e(String str) {
        JSONObject jSONObject = this.f10825h;
        if (jSONObject != null && jSONObject.has(str) && !f(str)) {
            return this.f10825h.optJSONArray(str);
        }
        return b().optJSONArray(str);
    }

    public boolean b(String str, boolean z4) {
        if (this.f10826i != null && !f(str)) {
            if (this.f10826i.has(str)) {
                return this.f10826i.optInt(str, z4 ? 1 : 0) == 1;
            }
            Boolean bool = this.f10827j;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        JSONObject jSONObject = f10821d;
        if (jSONObject != null) {
            if (jSONObject.has(str)) {
                return f10821d.optInt(str, z4 ? 1 : 0) == 1;
            }
            Boolean bool2 = f10822e;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
        }
        return z4;
    }

    public String c(String str) {
        return a(str, "");
    }

    private static a c(int i5) {
        DownloadInfo downloadInfo;
        if (f10823f) {
            return f10819b;
        }
        Context O = c.O();
        if (O != null && (downloadInfo = Downloader.getInstance(O).getDownloadInfo(i5)) != null) {
            return b(downloadInfo);
        }
        return f10819b;
    }

    public static void a(String str, boolean z4) {
        try {
            if (f10821d == null) {
                f10821d = new JSONObject();
            }
            f10821d.put(str, z4 ? 1 : 0);
        } catch (JSONException unused) {
        }
    }

    @NonNull
    public static a a(int i5) {
        return a(i5, (DownloadInfo) null);
    }

    public int b(String str) {
        return a(str, 0);
    }

    @NonNull
    public static a a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return f10819b;
        }
        return a(downloadInfo.getId(), downloadInfo);
    }

    public static void b(int i5) {
        a aVar = f10824g;
        if (aVar != null && aVar.f10828k == i5) {
            f10824g = null;
        }
        h<Integer, a> hVar = f10818a;
        synchronized (hVar) {
            hVar.remove(Integer.valueOf(i5));
        }
    }

    private static a a(int i5, DownloadInfo downloadInfo) {
        a aVar;
        a aVar2 = f10824g;
        if (aVar2 != null && aVar2.f10828k == i5) {
            return aVar2;
        }
        h<Integer, a> hVar = f10818a;
        synchronized (hVar) {
            aVar = hVar.get(Integer.valueOf(i5));
        }
        if (aVar == null) {
            aVar = downloadInfo == null ? c(i5) : b(downloadInfo);
            synchronized (hVar) {
                hVar.put(Integer.valueOf(i5), aVar);
            }
        }
        aVar.f10828k = i5;
        f10824g = aVar;
        return aVar;
    }

    private static a b(DownloadInfo downloadInfo) {
        if (f10823f) {
            return f10819b;
        }
        try {
            String downloadSettingString = downloadInfo.getDownloadSettingString();
            if (!TextUtils.isEmpty(downloadSettingString)) {
                return new a(new JSONObject(downloadSettingString));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return f10819b;
    }

    public boolean a(String str) {
        return b(str, false);
    }

    public int a(String str, int i5) {
        JSONObject jSONObject = this.f10825h;
        if (jSONObject != null && jSONObject.has(str) && !f(str)) {
            return this.f10825h.optInt(str, i5);
        }
        return b().optInt(str, i5);
    }

    public long a(String str, long j5) {
        JSONObject jSONObject = this.f10825h;
        if (jSONObject != null && jSONObject.has(str) && !f(str)) {
            return this.f10825h.optLong(str, j5);
        }
        return b().optLong(str, j5);
    }

    public double a(String str, double d5) {
        JSONObject jSONObject = this.f10825h;
        if (jSONObject != null && jSONObject.has(str) && !f(str)) {
            return this.f10825h.optDouble(str, d5);
        }
        return b().optDouble(str, d5);
    }

    public String a(String str, String str2) {
        JSONObject jSONObject = this.f10825h;
        if (jSONObject != null && jSONObject.has(str) && !f(str)) {
            return this.f10825h.optString(str, str2);
        }
        return b().optString(str, str2);
    }

    @NonNull
    public static a a(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject != b() && !f10823f) {
            a aVar = f10824g;
            if (aVar != null && aVar.f10825h == jSONObject) {
                return aVar;
            }
            h<Integer, a> hVar = f10818a;
            synchronized (hVar) {
                for (a aVar2 : hVar.values()) {
                    if (aVar2.f10825h == jSONObject) {
                        f10824g = aVar2;
                        return aVar2;
                    }
                }
                a aVar3 = new a(jSONObject);
                f10824g = aVar3;
                return aVar3;
            }
        }
        return f10819b;
    }

    public static void a(int i5, JSONObject jSONObject) {
        a aVar;
        if (jSONObject == null || jSONObject == b() || f10823f) {
            return;
        }
        h<Integer, a> hVar = f10818a;
        synchronized (hVar) {
            a aVar2 = f10824g;
            if (aVar2 != null && aVar2.f10825h == jSONObject) {
                aVar2.f10828k = i5;
            } else {
                Iterator<a> it = hVar.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        aVar = null;
                        break;
                    }
                    aVar = it.next();
                    if (aVar.f10825h == jSONObject) {
                        aVar.f10828k = i5;
                        break;
                    }
                }
                if (aVar == null) {
                    aVar2 = new a(jSONObject);
                    aVar2.f10828k = i5;
                } else {
                    aVar2 = aVar;
                }
                f10824g = aVar2;
            }
            f10818a.put(Integer.valueOf(i5), aVar2);
        }
    }
}
