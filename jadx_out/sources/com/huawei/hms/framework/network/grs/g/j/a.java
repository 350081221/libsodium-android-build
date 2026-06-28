package com.huawei.hms.framework.network.grs.g.j;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.g.k.d;
import com.huawei.hms.framework.network.grs.h.c;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f8496a = "a";

    /* renamed from: b, reason: collision with root package name */
    private static d f8497b;

    public static synchronized d a(Context context) {
        synchronized (a.class) {
            d dVar = f8497b;
            if (dVar != null) {
                return dVar;
            }
            String a5 = c.a(GrsApp.getInstance().getBrand("/") + "grs_sdk_server_config.json", context);
            ArrayList arrayList = null;
            if (TextUtils.isEmpty(a5)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(a5).getJSONObject("grs_server");
                JSONArray jSONArray = jSONObject.getJSONArray("grs_base_url");
                if (jSONArray != null && jSONArray.length() > 0) {
                    arrayList = new ArrayList();
                    for (int i5 = 0; i5 < jSONArray.length(); i5++) {
                        arrayList.add(jSONArray.get(i5).toString());
                    }
                }
                d dVar2 = new d();
                f8497b = dVar2;
                dVar2.a(arrayList);
                f8497b.b(jSONObject.getString("grs_query_endpoint_1.0"));
                f8497b.a(jSONObject.getString("grs_query_endpoint_2.0"));
                f8497b.a(jSONObject.getInt("grs_query_timeout"));
            } catch (JSONException e5) {
                Logger.w(f8496a, "getGrsServerBean catch JSONException: %s", StringUtils.anonymizeMessage(e5.getMessage()));
            }
            return f8497b;
        }
    }
}
