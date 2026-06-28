package com.huawei.hms.analytics;

import android.os.Build;
import com.huawei.hms.analytics.bc;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.transport.net.HttpTransportHandler;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.methods.HttpPost;

/* loaded from: classes3.dex */
public final class cq {
    public static final Charset lmn = Charset.forName("UTF-8");
    private boolean ijk;
    private String ikl;
    private cn klm;

    public cq(cn cnVar, String str, boolean z4) {
        this.klm = cnVar;
        this.ikl = str;
        this.ijk = z4;
    }

    private Map<String, String> ijk() {
        at atVar = ar.lmn().lmn;
        HashMap hashMap = new HashMap();
        hashMap.put("App-Id", atVar.f8152n.klm);
        hashMap.put("App-Ver", atVar.klm);
        hashMap.put("x-hasdk-productid", atVar.f8152n.ikl);
        hashMap.put("x-hasdk-resourceid", atVar.f8152n.ijk);
        hashMap.put("x-hasdk-token", atVar.hij);
        hashMap.put("x-hasdk-clientid", atVar.f8152n.fgh);
        hashMap.put("Sdk-Ver", "6.7.0.300");
        hashMap.put("Device-Type", Build.MODEL);
        hashMap.put("Sdk-Name", "hianalytics");
        hashMap.put("servicetag", "_openness_log_tag");
        hashMap.put("x-hasdk-log-region", this.klm.fgh);
        return hashMap;
    }

    private String[] ikl() {
        String[] strArr = (String[]) ar.lmn().lmn.f8152n.lmn.get(this.ikl).clone();
        for (int i5 = 0; i5 < strArr.length; i5++) {
            strArr[i5] = "{url}/common/hmshimaintqrt".replace("{url}", strArr[i5]);
        }
        return strArr;
    }

    private void klm() {
        be.lmn().lmn(this.klm.klm);
        if (this.klm.ikl()) {
            be.lmn().ijk();
            this.klm.hij();
        }
    }

    public final void lmn() {
        HiLog.d("LgEvtSend", "start report");
        String jSONObject = this.klm.klm().toString();
        String str = this.klm.hij;
        HttpTransportHandler httpTransportHandler = new HttpTransportHandler();
        httpTransportHandler.setUrls(ikl());
        httpTransportHandler.setRequestMethod(HttpPost.METHOD_NAME);
        httpTransportHandler.setContext(ar.lmn().lmn.ghi);
        httpTransportHandler.setHttpHeaders(ijk());
        httpTransportHandler.setReportData(dm.lmn(jSONObject.getBytes(lmn)));
        int httpCode = httpTransportHandler.execute().getHttpCode();
        HiLog.i("LgEvtSend", "log evts PostRequest, resultCode: %d ,reqID:".concat(String.valueOf(str)), Integer.valueOf(httpCode));
        if (httpCode == 200 || this.ijk) {
            try {
                klm();
            } catch (bc.lmn unused) {
                HiLog.e("LgEvtSend", "log db init failed");
            }
        }
        this.klm.ijk();
    }
}
