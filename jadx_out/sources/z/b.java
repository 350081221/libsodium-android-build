package z;

import com.alipay.tscenter.biz.rpc.report.general.model.DataReportRequest;
import com.alipay.tscenter.biz.rpc.report.general.model.DataReportResult;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class b {
    public static DataReportRequest a(d dVar) {
        DataReportRequest dataReportRequest = new DataReportRequest();
        if (dVar == null) {
            return null;
        }
        dataReportRequest.os = dVar.f22699a;
        dataReportRequest.rpcVersion = dVar.f22708j;
        dataReportRequest.bizType = "1";
        HashMap hashMap = new HashMap();
        dataReportRequest.bizData = hashMap;
        hashMap.put("apdid", dVar.f22700b);
        dataReportRequest.bizData.put("apdidToken", dVar.f22701c);
        dataReportRequest.bizData.put("umidToken", dVar.f22702d);
        dataReportRequest.bizData.put("dynamicKey", dVar.f22703e);
        dataReportRequest.deviceData = dVar.f22704f;
        return dataReportRequest;
    }

    public static c b(DataReportResult dataReportResult) {
        c cVar = new c();
        if (dataReportResult == null) {
            return null;
        }
        cVar.f22683a = dataReportResult.success;
        cVar.f22684b = dataReportResult.resultCode;
        Map<String, String> map = dataReportResult.resultData;
        if (map != null) {
            cVar.f22690c = map.get("apdid");
            cVar.f22691d = map.get("apdidToken");
            cVar.f22694g = map.get("dynamicKey");
            cVar.f22695h = map.get("timeInterval");
            cVar.f22696i = map.get("webrtcUrl");
            cVar.f22697j = "";
            String str = map.get("drmSwitch");
            if (f1.a.f(str)) {
                if (str.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str.charAt(0));
                    cVar.f22692e = sb.toString();
                }
                if (str.length() >= 3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str.charAt(2));
                    cVar.f22693f = sb2.toString();
                }
            }
            if (map.containsKey("apse_degrade")) {
                cVar.f22698k = map.get("apse_degrade");
            }
        }
        return cVar;
    }
}
