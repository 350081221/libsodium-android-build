package com.huawei.hms.analytics;

import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.transport.net.Response;
import com.huawei.hms.analytics.framework.config.EvtHeaderAttributeCollector;
import com.huawei.hms.analytics.framework.config.ICollectorConfig;
import com.huawei.hms.analytics.instance.CallBack;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class al implements Runnable {
    private String ghi;
    private String hij;
    private String ijk;
    private ICollectorConfig ikl;
    private CallBack klm;
    private String lmn;

    /* loaded from: classes3.dex */
    public class lmn extends cb {
        public lmn(cc ccVar, String str, String str2, String str3) {
            super(ccVar, str, str2, str3);
        }

        @Override // com.huawei.hms.analytics.cb
        public final Map<String, String> lmn() {
            Map<String, String> lmn = super.lmn();
            String str = ar.lmn().lmn.klm;
            String str2 = Build.MODEL;
            lmn.put("App-Ver", str);
            lmn.put("Device-Type", str2);
            lmn.put("Sdk-Name", "hianalytics");
            lmn.put("Request-Id", al.this.ijk);
            return lmn;
        }

        @Override // com.huawei.hms.analytics.core.transport.CallbackListener
        public final void onFailure(int i5) {
            HiLog.e("RequestBas", "oaid report error:".concat(String.valueOf(i5)));
            if (al.this.klm != null) {
                al.this.klm.onResult(i5, "");
            }
        }

        @Override // com.huawei.hms.analytics.core.transport.CallbackListener
        public final void onSuccess(Response response) {
            if (al.this.klm != null) {
                HiLog.i("RequestBas", "ReportOaid:" + response.getHttpCode());
                al.this.klm.onResult(response.getHttpCode(), "");
            }
        }
    }

    public al(ICollectorConfig iCollectorConfig, String str, CallBack callBack) {
        this.lmn = str;
        this.klm = callBack;
        this.ikl = iCollectorConfig;
    }

    private byte[] lmn() {
        String str;
        try {
            String appId = this.ikl.getAppId();
            String str2 = this.ijk;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("protocol_version", "1");
            jSONObject.put("compress_mode", "0");
            jSONObject.put("serviceid", "hmshioperqrt");
            jSONObject.put("appid", appId);
            jSONObject.put("chifer", "");
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            jSONObject.put("timestamp", sb.toString());
            jSONObject.put("servicetag", this.lmn);
            jSONObject.put("requestid", str2);
            EvtHeaderAttributeCollector evtCustomHeader = this.ikl.getEvtCustomHeader("oper", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject doCollector = evtCustomHeader.doCollector();
            doCollector.remove("wxappid");
            jSONObject3.put("header", doCollector);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(com.huawei.agconnect.credential.obs.c.f7851a, this.ghi);
            jSONObject4.put("oaid", this.hij);
            jSONObject4.put("oaid_source", ar.lmn().lmn.f8147i);
            jSONObject3.put("events_common", jSONObject4);
            jSONObject2.put(NotificationCompat.CATEGORY_EVENT, jSONObject3);
            return jSONObject2.toString().getBytes("UTF-8");
        } catch (JSONException unused) {
            str = "get body json exception";
            HiLog.e("ReportOaidTask", str);
            return new byte[0];
        } catch (Throwable th) {
            str = "get body error:" + th.getMessage();
            HiLog.e("ReportOaidTask", str);
            return new byte[0];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.al.run():void");
    }
}
