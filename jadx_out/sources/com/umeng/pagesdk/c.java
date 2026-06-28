package com.umeng.pagesdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.Choreographer;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    float f13553a;

    /* renamed from: b, reason: collision with root package name */
    long f13554b;

    /* renamed from: c, reason: collision with root package name */
    int f13555c;

    /* renamed from: d, reason: collision with root package name */
    int f13556d;

    /* renamed from: e, reason: collision with root package name */
    int f13557e;

    /* renamed from: g, reason: collision with root package name */
    boolean f13559g;

    /* renamed from: h, reason: collision with root package name */
    long f13560h;

    /* renamed from: i, reason: collision with root package name */
    long f13561i;

    /* renamed from: j, reason: collision with root package name */
    String f13562j;

    /* renamed from: k, reason: collision with root package name */
    private Context f13563k;

    /* renamed from: f, reason: collision with root package name */
    Map<String, Double> f13558f = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    private Choreographer.FrameCallback f13564l = new Choreographer.FrameCallback() { // from class: com.umeng.pagesdk.c.1
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j5) {
            boolean z4 = PageManger.isDebug;
            c cVar = c.this;
            if (cVar.f13559g) {
                if (cVar.f13560h == 0) {
                    cVar.f13560h = System.currentTimeMillis();
                }
                long currentTimeMillis = System.currentTimeMillis();
                c cVar2 = c.this;
                if (currentTimeMillis - cVar2.f13560h > cVar2.f13561i) {
                    cVar2.b();
                    return;
                }
                if (cVar2.f13554b == 0) {
                    cVar2.f13554b = j5;
                }
                float f5 = ((float) (j5 - cVar2.f13554b)) / 1000000.0f;
                if (f5 > cVar2.f13553a) {
                    double d5 = (cVar2.f13555c * 1000) / f5;
                    cVar2.f13555c = 0;
                    cVar2.f13554b = 0L;
                    if (PageManger.isDebug) {
                        Log.i("PageManger-PageFPSImpl", "doFrame: " + d5 + ", map size is " + c.this.f13558f.size() + ", page is " + c.this.f13562j);
                    }
                    Map<String, Double> map = c.this.f13558f;
                    StringBuilder sb = new StringBuilder();
                    sb.append(System.currentTimeMillis());
                    map.put(sb.toString(), Double.valueOf(d5));
                    c cVar3 = c.this;
                    int i5 = cVar3.f13556d + 1;
                    cVar3.f13556d = i5;
                    if (i5 >= cVar3.f13557e) {
                        cVar3.c();
                        c cVar4 = c.this;
                        cVar4.f13556d = 0;
                        Map<String, Double> map2 = cVar4.f13558f;
                        if (map2 != null) {
                            map2.clear();
                        }
                    }
                } else {
                    cVar2.f13555c++;
                }
                Choreographer.getInstance().postFrameCallback(this);
            }
        }
    };

    public c(Context context) {
        SharedPreferences sharedPreferences;
        this.f13553a = 1000.0f;
        this.f13557e = 6;
        this.f13561i = 300000L;
        this.f13563k = context;
        if (context == null || (sharedPreferences = context.getSharedPreferences("efs_page", 0)) == null) {
            return;
        }
        this.f13553a = sharedPreferences.getFloat(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL, 1000.0f);
        this.f13557e = sharedPreferences.getInt(PageConfigManger.APM_FPSPERF_COLLECT_INTERVAL_TOGETHER, 6);
        this.f13561i = sharedPreferences.getLong(PageConfigManger.APM_FPSPERF_COLLECT_MAX_PERIOD_SEC, 300000L);
        if (PageManger.isDebug) {
            Log.i("PageManger-PageFPSImpl", "init fps. diff is " + this.f13553a + ", count diff is " + this.f13557e + ", dlealt time is " + this.f13561i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        a a5;
        Iterator<Map.Entry<String, Double>> it = this.f13558f.entrySet().iterator();
        if (it != null) {
            JSONArray jSONArray = null;
            boolean z4 = false;
            while (it.hasNext()) {
                Map.Entry<String, Double> next = it.next();
                if (next != null) {
                    if (jSONArray == null) {
                        jSONArray = new JSONArray();
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (PageManger.getRefreshRate() > 0.0f && next.getValue().doubleValue() < PageManger.getRefreshRate() * 1.1d) {
                            jSONObject.put(next.getKey(), next.getValue());
                            if (next.getValue().doubleValue() < 40.0d) {
                                z4 = true;
                            }
                        }
                    } catch (JSONException e5) {
                        e5.printStackTrace();
                    }
                    jSONArray.put(jSONObject);
                }
            }
            if (jSONArray != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("pN", this.f13562j);
                    jSONObject2.put("pF", jSONArray);
                    if (z4 && (a5 = b.a(this.f13563k).a()) != null) {
                        jSONObject2.put("te", a5.f13543c);
                        jSONObject2.put("le", a5.f13541a);
                    }
                    EfsJSONLog efsJSONLog = new EfsJSONLog("fpsperf");
                    efsJSONLog.put("fps", jSONObject2);
                    EfsReporter reporter = PageManger.getReporter();
                    if (reporter != null) {
                        reporter.send(efsJSONLog);
                    }
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
            }
        }
    }

    public final void a() {
        if (this.f13559g) {
            if (PageManger.isDebug) {
                Log.i("PageManger-PageFPSImpl", "state is start!");
                return;
            }
            return;
        }
        this.f13559g = true;
        if (PageManger.isDebug) {
            Log.i("PageManger-PageFPSImpl", "start, page is " + this.f13562j);
        }
        Choreographer.getInstance().removeFrameCallback(this.f13564l);
        Choreographer.getInstance().postFrameCallback(this.f13564l);
    }

    public final void b() {
        if (PageManger.isDebug) {
            Log.i("PageManger-PageFPSImpl", "stop, page is " + this.f13562j);
        }
        c();
        this.f13559g = false;
        this.f13560h = 0L;
        this.f13554b = 0L;
        this.f13555c = 0;
        Map<String, Double> map = this.f13558f;
        if (map != null) {
            map.clear();
        }
        this.f13556d = 0;
    }
}
