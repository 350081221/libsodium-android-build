package com.huawei.hms.analytics;

import android.os.Looper;
import com.huawei.hms.analytics.core.transport.CallbackListener;
import com.huawei.hms.analytics.core.transport.ITransportHandler;
import com.huawei.hms.analytics.core.transport.net.HttpTransportHandler;
import com.huawei.hms.analytics.core.transport.net.Response;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class cb implements CallbackListener {
    private final CallbackListener hij = this;
    protected String ijk;
    protected cc ikl;
    public final String klm;
    private final String lmn;

    public cb(cc ccVar, String str, String str2, String str3) {
        this.ikl = ccVar;
        this.klm = str;
        this.lmn = str2;
        this.ijk = str3;
    }

    public final String[] ikl() {
        String[] strArr = ar.lmn().lmn.f8152n.lmn.get(this.ijk);
        if (strArr == null) {
            return new String[0];
        }
        String[] strArr2 = (String[]) strArr.clone();
        int length = strArr2.length;
        for (int i5 = 0; i5 < length; i5++) {
            strArr2[i5] = strArr2[i5] + this.lmn;
        }
        return strArr2;
    }

    public void klm() {
        HttpTransportHandler httpTransportHandler = new HttpTransportHandler();
        httpTransportHandler.setUrls(ikl());
        httpTransportHandler.setRequestMethod(this.klm);
        httpTransportHandler.setContext(ar.lmn().lmn.ghi);
        httpTransportHandler.setHttpHeaders(lmn());
        lmn(httpTransportHandler);
    }

    public Map<String, String> lmn() {
        at atVar = ar.lmn().lmn;
        HashMap hashMap = new HashMap();
        hashMap.put("App-Id", atVar.f8152n.klm);
        hashMap.put("x-hasdk-productid", atVar.f8152n.ikl);
        hashMap.put("x-hasdk-resourceid", atVar.f8152n.ijk);
        hashMap.put("x-hasdk-token", atVar.hij);
        hashMap.put("x-hasdk-clientid", atVar.f8152n.fgh);
        hashMap.put("Sdk-Ver", "6.7.0.300");
        return hashMap;
    }

    public final void lmn(int i5) {
        this.ikl.klm = String.valueOf(i5);
        cd.lmn(this.ikl);
    }

    public final void lmn(ITransportHandler iTransportHandler) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            iTransportHandler.execute(this.hij);
            return;
        }
        Response execute = iTransportHandler.execute();
        int httpCode = execute.getHttpCode();
        if (200 == httpCode) {
            this.hij.onSuccess(execute);
        } else {
            this.hij.onFailure(httpCode);
        }
    }
}
