package com.umeng.analytics.pro;

import android.text.TextUtils;
import com.umeng.ccg.ActionInfo;
import com.umeng.ccg.CcgAgent;
import com.umeng.commonsdk.debug.UMRTLog;
import com.umeng.commonsdk.service.UMGlobalContext;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class z implements ag {

    /* renamed from: a, reason: collision with root package name */
    private String f12771a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<aa> f12772b;

    /* renamed from: c, reason: collision with root package name */
    private String f12773c;

    /* renamed from: d, reason: collision with root package name */
    private String f12774d;

    /* renamed from: e, reason: collision with root package name */
    private String f12775e;

    /* renamed from: f, reason: collision with root package name */
    private String f12776f;

    public z(String str, ArrayList<aa> arrayList) {
        this.f12771a = null;
        new ArrayList();
        this.f12773c = "";
        this.f12774d = "";
        this.f12775e = "";
        this.f12776f = "";
        this.f12771a = str;
        this.f12772b = arrayList;
    }

    public String a() {
        return this.f12771a;
    }

    public String b() {
        return this.f12773c;
    }

    public String c() {
        return this.f12774d;
    }

    private String c(String str) {
        String[] split = str.split(",");
        String str2 = "";
        if (split.length <= 0) {
            return "";
        }
        ArrayList<String> forbidSdkArray = CcgAgent.getForbidSdkArray(this.f12771a);
        if (forbidSdkArray != null && forbidSdkArray.size() > 0) {
            this.f12776f = forbidSdkArray.toString();
            for (String str3 : split) {
                if (CcgAgent.getActionInfo(str3) != null && !forbidSdkArray.contains(str3)) {
                    return str3;
                }
            }
            return "";
        }
        for (String str4 : split) {
            ActionInfo actionInfo = CcgAgent.getActionInfo(str4);
            if (actionInfo != null) {
                String[] supportAction = actionInfo.getSupportAction(UMGlobalContext.getAppContext());
                if (supportAction.length > 0) {
                    int i5 = 0;
                    while (true) {
                        if (i5 >= supportAction.length) {
                            break;
                        }
                        if (this.f12771a.equals(supportAction[i5])) {
                            str2 = str4;
                            break;
                        }
                        i5++;
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        return str2;
                    }
                } else {
                    continue;
                }
            }
        }
        return str2;
    }

    public void a(String str) {
        this.f12773c = str;
    }

    public void b(String str) {
        this.f12774d = str;
    }

    @Override // com.umeng.analytics.pro.ag
    public JSONObject a(String str, JSONObject jSONObject) {
        try {
            int size = this.f12772b.size();
            if (size == 0) {
                return null;
            }
            for (int i5 = 0; i5 < size; i5++) {
                if (this.f12772b.get(i5).b()) {
                    return null;
                }
            }
            if (CcgAgent.hasRegistedActionInfo() && !TextUtils.isEmpty(this.f12774d)) {
                String c5 = c(this.f12774d);
                this.f12775e = c5;
                if (TextUtils.isEmpty(c5)) {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "采集项：" + this.f12771a + "; 未选中可用Module ; sdk: " + this.f12774d);
                } else {
                    UMRTLog.i(UMRTLog.RTLOG_TAG, "采集项：" + this.f12771a + "; 选中Module: " + this.f12775e + "; sdk: " + this.f12774d);
                }
            }
            aa aaVar = this.f12772b.get(size - 1);
            if (aaVar == null || !(aaVar instanceof ac)) {
                return null;
            }
            long c6 = aaVar.c();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("actionName", this.f12771a);
                jSONObject2.put(com.umeng.ccg.a.f12839r, this.f12774d);
                jSONObject2.put(com.umeng.ccg.a.f12836o, this.f12773c);
                jSONObject2.put("delay", c6);
                jSONObject2.put(com.umeng.ccg.a.f12837p, this.f12775e);
                jSONObject2.put(com.umeng.ccg.a.f12838q, this.f12776f);
            } catch (Throwable unused) {
            }
            return jSONObject2;
        } catch (Throwable unused2) {
            return null;
        }
    }
}
