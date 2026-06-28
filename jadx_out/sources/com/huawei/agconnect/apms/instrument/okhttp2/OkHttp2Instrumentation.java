package com.huawei.agconnect.apms.instrument.okhttp2;

import android.text.TextUtils;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.a;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.cba;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.fed;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.q;
import com.huawei.agconnect.apms.q1;
import com.huawei.agconnect.apms.w;
import com.huawei.agconnect.apms.x;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.OkUrlFactory;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes3.dex */
public class OkHttp2Instrumentation {
    public static final String CACHED_RESPONSE_CLASS = "com.squareup.okhttp.Cache$CacheResponseBody";
    public static final AgentLog LOG = AgentLogManager.getAgentLog();

    public static void addNuwaHeaderId(Request.Builder builder, String str) {
        if (TextUtils.isEmpty(builder.build().header(HeaderType.X_TRACE_ID))) {
            builder.addHeader(HeaderType.X_TRACE_ID, str);
        }
        if (TextUtils.isEmpty(builder.build().header(HeaderType.X_MICROSERVICE_NAME))) {
            builder.addHeader(HeaderType.X_MICROSERVICE_NAME, "APMS");
        }
    }

    public static ResponseBody body(Response response) {
        ResponseBody body = response.body();
        if (body != null && !Agent.isDisabled()) {
            try {
                if (body instanceof w) {
                    w wVar = (w) body;
                    if (CACHED_RESPONSE_CLASS.equalsIgnoreCase(wVar.bcd.getClass().getName())) {
                        return wVar.bcd;
                    }
                }
            } catch (Throwable th) {
                abc.bcd(th, abc.abc("skipping APMS OkHttp2 proxy: "), LOG);
            }
        }
        return body;
    }

    public static Request build(Request.Builder builder) {
        if (Agent.isDisabled()) {
            return builder.build();
        }
        try {
            addNuwaHeaderId(builder, q1.abc());
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("skipping APMS OkHttp2 proxy: "), LOG);
        }
        return builder.build();
    }

    public static String getValueFromHeader(Request request, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String header = request.header(str);
        if (TextUtils.isEmpty(header)) {
            return "";
        }
        return header;
    }

    public static Response.Builder newBuilder(Response.Builder builder) {
        if (Agent.isDisabled()) {
            return builder;
        }
        try {
            return new x(builder);
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("skipping APMS OkHttp2 proxy: "), LOG);
            return builder;
        }
    }

    public static Call newCall(OkHttpClient okHttpClient, Request request) {
        if (Agent.isDisabled()) {
            return okHttpClient.newCall(request);
        }
        try {
            fed fedVar = new fed();
            fedVar.ghi = 1;
            fedVar.cde(System.currentTimeMillis());
            fedVar.jih = getValueFromHeader(request, HeaderType.X_TRACE_ID);
            return new q(okHttpClient, request, fedVar);
        } catch (Throwable th) {
            AgentLog agentLog = LOG;
            StringBuilder abc = abc.abc("skipping APMS OkHttp2 proxy: ");
            abc.append(th.getMessage());
            agentLog.warn(abc.toString());
            return okHttpClient.newCall(request);
        }
    }

    public static HttpURLConnection open(OkUrlFactory okUrlFactory, URL url) {
        HttpURLConnection open = okUrlFactory.open(url);
        if (Agent.isDisabled()) {
            return open;
        }
        try {
            if ("https".equals(url.getProtocol()) && (open instanceof HttpsURLConnection)) {
                return new a((HttpsURLConnection) open);
            }
            return new cba(open);
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("skipping APMS OkHttp2 proxy: "), LOG);
            return open;
        }
    }

    public static Response.Builder body(Response.Builder builder, ResponseBody responseBody) {
        if (Agent.isDisabled()) {
            return builder.body(responseBody);
        }
        try {
            return new x(builder).abc.body(responseBody);
        } catch (Throwable th) {
            AgentLog agentLog = LOG;
            StringBuilder abc = abc.abc("skipping APMS OkHttp2 proxy: ");
            abc.append(th.getMessage());
            agentLog.warn(abc.toString());
            return builder.body(responseBody);
        }
    }
}
