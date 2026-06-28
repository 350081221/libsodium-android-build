package com.huawei.hms.analytics.framework.c;

import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.storage.Event;
import com.huawei.hms.analytics.core.storage.IStorageHandler;
import com.huawei.hms.analytics.core.transport.net.HttpTransportHandler;
import com.huawei.hms.analytics.framework.config.ICallback;
import com.huawei.hms.analytics.framework.config.ICollectorConfig;
import com.huawei.hms.analytics.framework.config.IMandatoryParameters;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.client.methods.HttpPost;

/* loaded from: classes3.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    ICallback f8261a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f8262b;

    /* renamed from: c, reason: collision with root package name */
    private List<Event> f8263c;

    /* renamed from: d, reason: collision with root package name */
    private com.huawei.hms.analytics.framework.c.a.a f8264d;

    public i(byte[] bArr, com.huawei.hms.analytics.framework.c.a.a aVar, List<Event> list) {
        this.f8262b = bArr != null ? (byte[]) bArr.clone() : null;
        this.f8263c = list;
        this.f8264d = aVar;
    }

    private String[] a() {
        ICollectorConfig a5 = com.huawei.hms.analytics.framework.b.b.a().a(this.f8264d.f8224a);
        com.huawei.hms.analytics.framework.c.a.a aVar = this.f8264d;
        String[] collectUrls = a5.getCollectUrls(aVar.f8225b, aVar.f8226c);
        for (int i5 = 0; i5 < collectUrls.length; i5++) {
            if (!"oper".equals(this.f8264d.f8225b)) {
                if ("maint".equals(this.f8264d.f8225b)) {
                    collectUrls[i5] = "{url}/common/hmshimaintqrt".replace("{url}", collectUrls[i5]);
                } else if ("diffprivacy".equals(this.f8264d.f8225b)) {
                    collectUrls[i5] = "{url}/common/common2".replace("{url}", collectUrls[i5]);
                } else if ("preins".equals(this.f8264d.f8225b)) {
                    collectUrls[i5] = "{url}/common/hmshioperbatch".replace("{url}", collectUrls[i5]);
                }
            }
            collectUrls[i5] = "{url}/common/hmshioperqrt".replace("{url}", collectUrls[i5]);
        }
        return collectUrls;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IStorageHandler a5;
        List<Event> list;
        HiLog.d("SendMission", "send data running");
        long currentTimeMillis = System.currentTimeMillis();
        HttpTransportHandler httpTransportHandler = new HttpTransportHandler();
        IMandatoryParameters iMandatoryParameters = com.huawei.hms.analytics.framework.b.b.a().f8206a;
        httpTransportHandler.setUrls(a());
        httpTransportHandler.setRequestMethod(HttpPost.METHOD_NAME);
        httpTransportHandler.setReportData(this.f8262b);
        ICollectorConfig a6 = com.huawei.hms.analytics.framework.b.b.a().a(this.f8264d.f8224a);
        String str = this.f8264d.f8227d;
        ICollectorConfig a7 = com.huawei.hms.analytics.framework.b.b.a().a(this.f8264d.f8224a);
        String appVer = com.huawei.hms.analytics.framework.b.b.a().f8206a.getAppVer();
        String model = com.huawei.hms.analytics.framework.b.b.a().f8206a.getModel();
        HashMap hashMap = new HashMap();
        hashMap.put("App-Id", a7.getAppId());
        hashMap.put("App-Ver", appVer);
        hashMap.put("Sdk-Name", "hianalytics");
        hashMap.put("Sdk-Ver", "6.7.0.300");
        hashMap.put("Device-Type", model);
        hashMap.put("servicetag", this.f8264d.f8224a);
        HiLog.i("SendMission", "sendData RequestId : ".concat(String.valueOf(str)));
        hashMap.put("Request-Id", str);
        Map<String, String> httpHeader = a6.getHttpHeader(this.f8264d.f8225b);
        if (httpHeader != null) {
            hashMap.putAll(httpHeader);
        }
        httpTransportHandler.setHttpHeaders(hashMap);
        httpTransportHandler.setContext(iMandatoryParameters.getContext());
        int httpCode = httpTransportHandler.execute().getHttpCode();
        if (httpCode == 200) {
            try {
                com.huawei.hms.analytics.framework.c.a.a aVar = this.f8264d;
                if (!aVar.f8228e && !aVar.f8229f && (a5 = com.huawei.hms.analytics.framework.a.a.a(aVar.f8224a)) != null && (list = this.f8263c) != null && list.size() > 0) {
                    HiLog.i("SendMission", "storageHandler deleteEvents");
                    a5.deleteEvents(this.f8263c);
                }
            } catch (Throwable th) {
                ICallback iCallback = this.f8261a;
                if (iCallback != null) {
                    iCallback.onResult(httpCode, currentTimeMillis, this.f8264d.f8229f ? -2 : 0, this.f8263c);
                }
                String str2 = "events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:" + this.f8264d.f8227d;
                com.huawei.hms.analytics.framework.c.a.a aVar2 = this.f8264d;
                HiLog.i("SendMission", str2, aVar2.f8225b, aVar2.f8224a, Integer.valueOf(httpCode));
                throw th;
            }
        }
        ICallback iCallback2 = this.f8261a;
        if (iCallback2 != null) {
            iCallback2.onResult(httpCode, currentTimeMillis, this.f8264d.f8229f ? -2 : 0, this.f8263c);
        }
        String str3 = "events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:" + this.f8264d.f8227d;
        com.huawei.hms.analytics.framework.c.a.a aVar3 = this.f8264d;
        HiLog.i("SendMission", str3, aVar3.f8225b, aVar3.f8224a, Integer.valueOf(httpCode));
    }
}
