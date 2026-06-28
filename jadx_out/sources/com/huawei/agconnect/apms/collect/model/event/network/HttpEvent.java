package com.huawei.agconnect.apms.collect.model.event.network;

import android.text.TextUtils;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.collect.model.EventType;
import com.huawei.agconnect.apms.collect.model.basic.RuntimeEnvInformation;
import com.huawei.agconnect.apms.collect.model.event.Event;
import com.huawei.agconnect.apms.collect.type.CollectableArray;
import com.huawei.agconnect.apms.gfe;
import com.huawei.agconnect.apms.o;
import com.huawei.agconnect.apms.p;
import com.huawei.agconnect.apms.t1;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class HttpEvent extends Event {
    public long bytesReceived;
    public long bytesSent;
    public String cdnProvider;
    public int connectFailedTimes;
    public int connectTotalTimes;
    public long contentLength;
    public String contentType;
    public int dnsFailedTimes;
    public JSONArray dnsInfos;
    public int dnsTotalTimes;
    public String domain;
    public String errorMessage;
    public int followUpTimes;
    public String httpMethod;
    public int libType;
    public int requestBodyEnd;
    public int requestBodyStart;
    public int requestHeadersEnd;
    public int requestHeadersStart;
    public int responseBodyEnd;
    public int responseBodyStart;
    public int responseHeaderEnd;
    public int responseHeaderStart;
    public String serverIp;
    public JSONArray socketInfos;
    public String stackTrace;
    public int statusCode;
    public long totalTime;
    public String traceId;
    public String url;

    /* loaded from: classes3.dex */
    public static class DnsEvent extends CollectableArray {
        public String addressList;
        public int dnsStart;
        public int dnsStop;
        public String domainName;
        public boolean isSuccess;

        public DnsEvent(o oVar) {
            this.domainName = oVar.abc;
            this.addressList = oVar.def;
            this.dnsStart = oVar.bcd;
            this.dnsStop = oVar.cde;
            this.isSuccess = oVar.abc();
        }

        @Override // com.huawei.agconnect.apms.collect.type.CollectableArray
        public JSONArray asJsonArray() {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(t1.abc(this.domainName));
            String str = this.addressList;
            if (str == null) {
                str = "null";
            }
            jSONArray.put(str);
            abc.abc(this.dnsStart, jSONArray);
            abc.abc(this.dnsStop, jSONArray);
            jSONArray.put(t1.abc(Boolean.valueOf(this.isSuccess)));
            return jSONArray;
        }
    }

    /* loaded from: classes3.dex */
    public static class SocketEvent extends CollectableArray {
        public String cipherSuite;
        public int connectEnd;
        public int connectStart;
        public String errorDesc;
        public String httpVersion;
        public String inetaddress;
        public boolean isHttps;
        public boolean isSuccess;
        public int secConnectEnd;
        public int secConnectStart;
        public String tlsVersion;

        public SocketEvent(p pVar) {
            this.inetaddress = pVar.abc;
            this.connectEnd = pVar.cde;
            this.connectStart = pVar.bcd;
            this.secConnectEnd = pVar.efg;
            this.secConnectStart = pVar.def;
            this.isHttps = pVar.fgh;
            this.httpVersion = pVar.ghi;
            this.tlsVersion = pVar.hij;
            this.cipherSuite = pVar.ijk;
            this.isSuccess = pVar.jkl;
            this.errorDesc = pVar.klm;
        }

        @Override // com.huawei.agconnect.apms.collect.type.CollectableArray
        public JSONArray asJsonArray() {
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(t1.abc(this.inetaddress));
            abc.abc(this.connectStart, jSONArray);
            abc.abc(this.connectEnd, jSONArray);
            abc.abc(this.secConnectStart, jSONArray);
            abc.abc(this.secConnectEnd, jSONArray);
            jSONArray.put(t1.abc(Boolean.valueOf(this.isHttps)));
            String str = this.httpVersion;
            String str2 = "null";
            if (str == null) {
                str = "null";
            }
            jSONArray.put(str);
            String str3 = this.tlsVersion;
            if (str3 == null) {
                str3 = "null";
            }
            jSONArray.put(str3);
            String str4 = this.cipherSuite;
            if (str4 == null) {
                str4 = "null";
            }
            jSONArray.put(str4);
            jSONArray.put(t1.abc(Boolean.valueOf(this.isSuccess)));
            String str5 = this.errorDesc;
            if (str5 != null) {
                str2 = str5;
            }
            jSONArray.put(str2);
            return jSONArray;
        }
    }

    public HttpEvent(gfe gfeVar) {
        this.timestamp = gfeVar.bcd;
        this.eventName = EventType.NATIVE_HTTP;
        this.url = gfeVar.cde;
        this.httpMethod = gfeVar.efg;
        this.totalTime = gfeVar.klm;
        this.statusCode = gfeVar.jkl;
        this.bytesReceived = gfeVar.vwx;
        this.bytesSent = gfeVar.qrs;
        this.contentType = gfeVar.fgh;
        this.contentLength = gfeVar.ghi;
        this.errorMessage = gfeVar.cde();
        RuntimeEnvInformation runtimeEnvInformation = Agent.getRuntimeEnvInformation();
        this.runtimeEnvInformation = runtimeEnvInformation;
        runtimeEnvInformation.setSessionArray(gfeVar.uts);
        this.domain = gfeVar.hij;
        this.followUpTimes = gfeVar.lmn;
        this.serverIp = gfeVar.ijk;
        this.dnsInfos = copyDnsInfoToEventList(gfeVar.yza);
        this.dnsFailedTimes = gfeVar.wxy;
        this.dnsTotalTimes = gfeVar.xyz;
        this.socketInfos = copySocketInfoToEventList(gfeVar.yxw);
        this.connectFailedTimes = gfeVar.zab;
        this.connectTotalTimes = gfeVar.zyx;
        this.requestHeadersStart = gfeVar.mno;
        this.requestHeadersEnd = gfeVar.nop;
        this.requestBodyStart = gfeVar.opq;
        this.requestBodyEnd = gfeVar.pqr;
        this.responseHeaderStart = gfeVar.rst;
        this.responseHeaderEnd = gfeVar.stu;
        this.responseBodyStart = gfeVar.tuv;
        this.responseBodyEnd = gfeVar.uvw;
        this.stackTrace = gfeVar.wvu;
        this.errorMessage = gfeVar.cde();
        this.libType = gfeVar.vut;
        this.cdnProvider = gfeVar.def;
        this.traceId = gfeVar.tsr;
    }

    private JSONArray copyDnsInfoToEventList(List<o> list) {
        if (list == null) {
            return new JSONArray();
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i5 = 0; i5 < size; i5++) {
            jSONArray.put(new DnsEvent(list.get(i5)).asJsonArray());
        }
        return jSONArray;
    }

    private JSONArray copySocketInfoToEventList(List<p> list) {
        if (list == null) {
            return new JSONArray();
        }
        int size = list.size();
        JSONArray jSONArray = new JSONArray();
        for (int i5 = 0; i5 < size; i5++) {
            jSONArray.put(new SocketEvent(list.get(i5)).asJsonArray());
        }
        return jSONArray;
    }

    @Override // com.huawei.agconnect.apms.collect.model.event.Event, com.huawei.agconnect.apms.collect.type.CollectableArray
    public JSONArray asJsonArray() {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(this.runtimeEnvInformation.asJsonArray());
        abc.abc(this.timestamp, jSONArray);
        String str = this.url;
        String str2 = "null";
        if (str == null) {
            str = "null";
        }
        jSONArray.put(str);
        abc.abc(this.libType, jSONArray);
        String str3 = this.domain;
        if (str3 == null) {
            str3 = "null";
        }
        jSONArray.put(str3);
        String str4 = this.cdnProvider;
        if (str4 == null) {
            str4 = "null";
        }
        jSONArray.put(str4);
        String str5 = this.serverIp;
        if (str5 == null) {
            str5 = "null";
        }
        jSONArray.put(str5);
        String str6 = this.httpMethod;
        if (str6 == null) {
            str6 = "null";
        }
        jSONArray.put(str6);
        String str7 = this.contentType;
        if (str7 == null) {
            str7 = "null";
        }
        jSONArray.put(str7);
        abc.abc(this.contentLength, jSONArray);
        abc.abc(this.statusCode, jSONArray);
        abc.abc(this.totalTime, jSONArray);
        abc.abc(this.requestHeadersStart, jSONArray);
        abc.abc(this.requestHeadersEnd, jSONArray);
        abc.abc(this.requestBodyStart, jSONArray);
        abc.abc(this.requestBodyEnd, jSONArray);
        abc.abc(this.bytesSent, jSONArray);
        abc.abc(this.responseHeaderStart, jSONArray);
        abc.abc(this.responseHeaderEnd, jSONArray);
        abc.abc(this.responseBodyStart, jSONArray);
        abc.abc(this.responseBodyEnd, jSONArray);
        abc.abc(this.bytesReceived, jSONArray);
        abc.abc(this.followUpTimes, jSONArray);
        abc.abc(this.dnsFailedTimes, jSONArray);
        abc.abc(this.dnsTotalTimes, jSONArray);
        jSONArray.put(this.dnsInfos);
        abc.abc(this.connectFailedTimes, jSONArray);
        abc.abc(this.connectTotalTimes, jSONArray);
        jSONArray.put(this.socketInfos);
        String str8 = this.errorMessage;
        if (str8 == null) {
            str8 = "null";
        }
        jSONArray.put(str8);
        String str9 = this.stackTrace;
        if (str9 == null) {
            str9 = "null";
        }
        jSONArray.put(str9);
        String str10 = this.traceId;
        if (str10 != null) {
            str2 = str10;
        }
        jSONArray.put(str2);
        return jSONArray;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public HttpEvent(gfe gfeVar, String str) {
        this(gfeVar);
        if (TextUtils.isEmpty(this.stackTrace)) {
            this.stackTrace = str;
        }
    }
}
