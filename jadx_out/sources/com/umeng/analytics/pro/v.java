package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.analytics.pro.i;
import com.umeng.analytics.vshelper.PageNameMonitor;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class v {

    /* renamed from: c, reason: collision with root package name */
    private static final int f12759c = 5;

    /* renamed from: d, reason: collision with root package name */
    private static JSONArray f12760d = new JSONArray();

    /* renamed from: e, reason: collision with root package name */
    private static Object f12761e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, Long> f12764f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    Stack<String> f12762a = new Stack<>();

    /* renamed from: b, reason: collision with root package name */
    com.umeng.analytics.vshelper.a f12763b = PageNameMonitor.getInstance();

    public static void a(Context context) {
        String jSONArray;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f12761e) {
                    jSONArray = f12760d.toString();
                    f12760d = new JSONArray();
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("__a", new JSONArray(jSONArray));
                    if (jSONObject.length() > 0) {
                        i.a(context).a(u.a().c(), jSONObject, i.a.PAGE);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    protected int a() {
        return 2;
    }

    public void b(String str) {
        Long l5;
        Context appContext;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f12764f.containsKey(str)) {
            synchronized (this.f12764f) {
                l5 = this.f12764f.get(str);
                this.f12764f.remove(str);
            }
            if (l5 == null) {
                return;
            }
            if (UMConfigure.isDebugLog() && this.f12762a.size() > 0 && str.equals(this.f12762a.peek())) {
                this.f12762a.pop();
            }
            long currentTimeMillis = System.currentTimeMillis() - l5.longValue();
            synchronized (f12761e) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(d.f12500v, str);
                    jSONObject.put("duration", currentTimeMillis);
                    jSONObject.put(d.f12502x, l5);
                    jSONObject.put("type", a());
                    f12760d.put(jSONObject);
                    if (f12760d.length() >= 5 && (appContext = UMGlobalContext.getAppContext(null)) != null) {
                        UMWorkDispatch.sendEvent(appContext, 4099, CoreProtocol.getInstance(appContext), null);
                    }
                } catch (Throwable unused) {
                }
            }
            if (!UMConfigure.isDebugLog() || this.f12762a.size() == 0) {
                return;
            }
            UMLog.aq(j.E, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
            return;
        }
        if (UMConfigure.isDebugLog() && this.f12762a.size() == 0) {
            UMLog.aq(j.G, 0, "\\|", new String[]{"@"}, new String[]{str}, null, null);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (UMConfigure.isDebugLog() && this.f12762a.size() != 0) {
            UMLog.aq(j.F, 0, "\\|", new String[]{"@"}, new String[]{this.f12762a.peek()}, null, null);
        }
        this.f12763b.customPageBegin(str);
        synchronized (this.f12764f) {
            this.f12764f.put(str, Long.valueOf(System.currentTimeMillis()));
            if (UMConfigure.isDebugLog()) {
                this.f12762a.push(str);
            }
        }
    }

    public void b() {
        String str;
        synchronized (this.f12764f) {
            str = null;
            long j5 = 0;
            for (Map.Entry<String, Long> entry : this.f12764f.entrySet()) {
                if (entry.getValue().longValue() > j5) {
                    long longValue = entry.getValue().longValue();
                    str = entry.getKey();
                    j5 = longValue;
                }
            }
        }
        if (str != null) {
            b(str);
        }
    }
}
