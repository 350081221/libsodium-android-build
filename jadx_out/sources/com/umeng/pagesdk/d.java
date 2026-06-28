package com.umeng.pagesdk;

import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.umeng.pagesdk.b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static Map<String, Map> f13566a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static c f13567b;

    private static void a(String str) {
        Map map;
        if (TextUtils.isEmpty(str) || (map = f13566a.get(str)) == null || (r0 = map.entrySet().iterator()) == null) {
            return;
        }
        JSONArray jSONArray = null;
        for (Map.Entry entry : map.entrySet()) {
            if (entry != null) {
                String str2 = (String) entry.getKey();
                Long[] lArr = (Long[]) entry.getValue();
                if (!TextUtils.isEmpty(str2) && lArr != null && lArr.length >= 2) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("mN", str2);
                        jSONObject.put("mBT", lArr[0]);
                        jSONObject.put("mET", lArr[1]);
                        if (jSONArray == null) {
                            jSONArray = new JSONArray();
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e5) {
                        e5.printStackTrace();
                    }
                }
            }
        }
        if (jSONArray != null) {
            final JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("pN", str);
                jSONObject2.put("pL", jSONArray);
                b.a(PageManger.getApplicationContext()).a(new b.InterfaceC0253b() { // from class: com.umeng.pagesdk.d.1
                    @Override // com.umeng.pagesdk.b.InterfaceC0253b
                    public final void a(a aVar) {
                        try {
                            jSONObject2.put("te", aVar.f13543c);
                            jSONObject2.put("le", aVar.f13541a);
                            EfsJSONLog efsJSONLog = new EfsJSONLog("pageperf");
                            efsJSONLog.put("page", jSONObject2);
                            EfsReporter reporter = PageManger.getReporter();
                            if (reporter != null) {
                                reporter.send(efsJSONLog);
                            }
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                    }
                });
            } catch (JSONException e6) {
                e6.printStackTrace();
            }
        }
    }

    public static void a(String str, String str2, boolean z4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageBegin. parameter null!");
                return;
            }
            return;
        }
        if (!PageManger.isInit()) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageBegin. not init!");
                return;
            }
            return;
        }
        PageConfigManger pageConfigManger = PageManger.getPageConfigManger();
        if (pageConfigManger == null || !pageConfigManger.enableTracer()) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageBegin. not rate!");
                return;
            }
            return;
        }
        if (z4) {
            str2 = "UM_".concat(String.valueOf(str2));
        }
        if (!f13566a.containsKey(str)) {
            if (str2.equals("UM_onCreate")) {
                if (PageManger.isDebug) {
                    Log.i("PageManger-PageTrace", "tracePageBegin. begin add onCreate. " + str2 + " - " + str);
                }
                Long[] lArr = new Long[2];
                lArr[0] = Long.valueOf(System.currentTimeMillis());
                HashMap hashMap = new HashMap();
                hashMap.put(str2, lArr);
                f13566a.put(str, hashMap);
                c cVar = f13567b;
                if (cVar != null) {
                    cVar.b();
                    c cVar2 = f13567b;
                    cVar2.f13562j = str;
                    cVar2.a();
                    return;
                }
                c cVar3 = new c(PageManger.getApplicationContext());
                f13567b = cVar3;
                cVar3.f13562j = str;
                cVar3.a();
                return;
            }
            return;
        }
        Map map = f13566a.get(str);
        if (map == null) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageBegin. methodMap null!");
                return;
            }
            return;
        }
        if (map.containsKey(str2)) {
            return;
        }
        if (PageManger.isDebug) {
            Log.i("PageManger-PageTrace", "tracePageBegin. begin add method. " + str2 + " - " + str);
        }
        if (z4 || map.size() <= 6) {
            Long[] lArr2 = new Long[2];
            lArr2[0] = Long.valueOf(System.currentTimeMillis());
            map.put(str2, lArr2);
        } else if (PageManger.isDebug) {
            Log.e("PageManger-PageTrace", "tracePageBegin. user trace number of transfinite. " + str2 + "-" + str);
        }
    }

    public static void b(String str, String str2, boolean z4) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageEnd. parameter null!");
                return;
            }
            return;
        }
        if (!PageManger.isInit()) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageEnd. not init!");
                return;
            }
            return;
        }
        PageConfigManger pageConfigManger = PageManger.getPageConfigManger();
        if (pageConfigManger == null || !pageConfigManger.enableTracer()) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageEnd. not rate!");
                return;
            }
            return;
        }
        if (z4) {
            str2 = "UM_".concat(String.valueOf(str2));
        }
        if (!f13566a.containsKey(str)) {
            if (str2.equals("UM_onPause")) {
                if (PageManger.isDebug) {
                    Log.i("PageManger-PageTrace", "tracePageEnd. onPause stop fps. ".concat(String.valueOf(str)));
                }
                c cVar = f13567b;
                if (cVar != null) {
                    cVar.b();
                    return;
                }
                return;
            }
            return;
        }
        Map map = f13566a.get(str);
        if (map == null) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageEnd. " + str + " is null in pageMap!");
                return;
            }
            return;
        }
        if (!map.containsKey(str2)) {
            if (PageManger.isDebug) {
                Log.e("PageManger-PageTrace", "tracePageEnd. " + str2 + " non-exist in " + str + " map!");
                return;
            }
            return;
        }
        Long[] lArr = (Long[]) map.get(str2);
        if (lArr.length >= 2) {
            lArr[1] = Long.valueOf(System.currentTimeMillis());
        }
        if (str2.equals("UM_onResume")) {
            if (PageManger.isDebug) {
                Log.i("PageManger-PageTrace", "tracePageEnd. onResume save data. ".concat(String.valueOf(str)));
            }
            a(str);
            if (TextUtils.isEmpty(str) || !f13566a.containsKey(str)) {
                return;
            }
            f13566a.remove(str);
            return;
        }
        if (str2.equals("UM_onPause")) {
            if (PageManger.isDebug) {
                Log.i("PageManger-PageTrace", "tracePageEnd. onPause stop fps. ".concat(String.valueOf(str)));
            }
            c cVar2 = f13567b;
            if (cVar2 != null) {
                cVar2.b();
                f13567b = null;
            }
        }
    }
}
