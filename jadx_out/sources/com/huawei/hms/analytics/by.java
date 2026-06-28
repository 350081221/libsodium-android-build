package com.huawei.hms.analytics;

import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.transport.net.Response;
import org.apache.http.client.methods.HttpGet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class by extends cb {
    public by(String str) {
        super(cd.lmn("GetOaidSwitch#execute"), HttpGet.METHOD_NAME, "/analytics/api/config?config_key=oaid_flag", str);
    }

    private static boolean ijk() {
        at atVar = ar.lmn().lmn;
        String klm = dl.klm(atVar.ghi, "global_v2", "oid_switch_info", "");
        if (TextUtils.isEmpty(klm)) {
            return true;
        }
        try {
            JSONObject jSONObject = new JSONArray(klm).getJSONObject(0);
            if (System.currentTimeMillis() - jSONObject.getLong("timestamp") > 86400000) {
                return true;
            }
            if (jSONObject.getString("config_value").equals("true")) {
                atVar.f8151m = true;
            }
            return false;
        } catch (JSONException unused) {
            dl.lmn(atVar.ghi, "global_v2", "oid_switch_info");
            return true;
        }
    }

    @Override // com.huawei.hms.analytics.cb
    public final void klm() {
        if (ijk()) {
            super.klm();
        } else {
            HiLog.d("RequestBas", "no need sync oaid switch");
        }
    }

    @Override // com.huawei.hms.analytics.core.transport.CallbackListener
    public final void onFailure(int i5) {
        HiLog.e("RequestBas", "GET oaid flag exception,errorCode: ".concat(String.valueOf(i5)));
        lmn(i5);
    }

    @Override // com.huawei.hms.analytics.core.transport.CallbackListener
    public final void onSuccess(Response response) {
        this.ikl.lmn = "0";
        lmn(response.getHttpCode());
        at atVar = ar.lmn().lmn;
        if (response.getHttpCode() == 200) {
            HiLog.i("RequestBas", "get oaid_flag result code : " + response.getHttpCode());
            try {
                JSONArray jSONArray = new JSONObject(response.getContent()).getJSONArray("configList");
                if (jSONArray.length() > 0) {
                    JSONObject jSONObject = jSONArray.getJSONObject(0);
                    atVar.f8151m = jSONObject.getString("config_value").equals("true");
                    jSONObject.put("timestamp", System.currentTimeMillis());
                    dl.lmn(atVar.ghi, "global_v2", "oid_switch_info", jSONArray.toString());
                }
            } catch (JSONException unused) {
                atVar.f8151m = false;
            }
        }
    }
}
