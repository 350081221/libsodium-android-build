package com.huawei.agconnect.apms.instrument.apacheclient;

import android.text.TextUtils;
import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.collect.model.HeaderType;
import com.huawei.agconnect.apms.d;
import com.huawei.agconnect.apms.edc;
import com.huawei.agconnect.apms.fed;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.huawei.agconnect.apms.q1;
import java.io.IOException;
import java.net.URL;
import org.apache.http.Header;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

/* loaded from: classes3.dex */
public class ApacheClientInstrumentation {
    public static final AgentLog LOG = AgentLogManager.getAgentLog();

    public static void addNuwaTraceIdToHeaderAndEvent(HttpRequest httpRequest, fed fedVar) {
        String abc = q1.abc();
        if (TextUtils.isEmpty(getInfoFromRequestHeaders(HeaderType.X_TRACE_ID, httpRequest))) {
            httpRequest.addHeader(HeaderType.X_TRACE_ID, abc);
        }
        if (TextUtils.isEmpty(getInfoFromRequestHeaders(HeaderType.X_MICROSERVICE_NAME, httpRequest))) {
            httpRequest.addHeader(HeaderType.X_MICROSERVICE_NAME, "APMS");
        }
        fedVar.jih = abc;
    }

    public static fed buildEventState(HttpRequest httpRequest) {
        fed fedVar = new fed();
        addNuwaTraceIdToHeaderAndEvent(httpRequest, fedVar);
        prepareDnsInfo(httpRequest, fedVar);
        return fedVar;
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        if (Agent.isDisabled()) {
            return (T) httpClient.execute(httpUriRequest, responseHandler);
        }
        fed buildEventState = buildEventState(httpUriRequest);
        try {
            return (T) httpClient.execute(warp(httpUriRequest, buildEventState), warp(responseHandler, buildEventState));
        } catch (IOException e5) {
            d.abc(buildEventState, e5);
            throw e5;
        }
    }

    public static String getInfoFromRequestHeaders(String str, HttpRequest httpRequest) {
        try {
            Header[] headers = httpRequest.getHeaders(str);
            if (headers != null && headers.length > 0 && headers[0].getValue() != null) {
                return headers[0].getValue();
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static void prepareDnsInfo(HttpRequest httpRequest, fed fedVar) {
        String str;
        if (httpRequest != null && httpRequest.getRequestLine() != null) {
            try {
                String uri = httpRequest.getRequestLine().getUri();
                try {
                    str = new URL(uri).getHost();
                } catch (Throwable th) {
                    LOG.warn(uri + " dns resolve failed, detail: " + th.getMessage());
                    str = "";
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                edc.abc(str, fedVar);
            } catch (Throwable th2) {
                abc.abc(th2, abc.abc(" dns resolve failed, detail: "), LOG);
            }
        }
    }

    public static HttpUriRequest warp(HttpUriRequest httpUriRequest, fed fedVar) {
        return d.abc(httpUriRequest, fedVar);
    }

    public static HttpRequest warp(HttpHost httpHost, HttpRequest httpRequest, fed fedVar) {
        return d.abc(httpHost, httpRequest, fedVar);
    }

    public static HttpResponse warp(HttpResponse httpResponse, fed fedVar) {
        return d.abc(httpResponse, fedVar);
    }

    public static <T> ResponseHandler<? extends T> warp(ResponseHandler<? extends T> responseHandler, fed fedVar) {
        return d.abc(responseHandler, fedVar);
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        if (Agent.isDisabled()) {
            return (T) httpClient.execute(httpHost, httpRequest, responseHandler);
        }
        fed buildEventState = buildEventState(httpRequest);
        try {
            return (T) httpClient.execute(httpHost, warp(httpHost, httpRequest, buildEventState), warp(responseHandler, buildEventState));
        } catch (IOException e5) {
            d.abc(buildEventState, e5);
            throw e5;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        if (Agent.isDisabled()) {
            return (T) httpClient.execute(httpUriRequest, responseHandler, httpContext);
        }
        fed buildEventState = buildEventState(httpUriRequest);
        try {
            return (T) httpClient.execute(warp(httpUriRequest, buildEventState), warp(responseHandler, buildEventState), httpContext);
        } catch (IOException e5) {
            d.abc(buildEventState, e5);
            throw e5;
        }
    }

    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        if (Agent.isDisabled()) {
            return (T) httpClient.execute(httpHost, httpRequest, responseHandler, httpContext);
        }
        fed buildEventState = buildEventState(httpRequest);
        try {
            return (T) httpClient.execute(httpHost, warp(httpHost, httpRequest, buildEventState), warp(responseHandler, buildEventState), httpContext);
        } catch (IOException e5) {
            d.abc(buildEventState, e5);
            throw e5;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        if (Agent.isDisabled()) {
            return httpClient.execute(httpUriRequest);
        }
        fed buildEventState = buildEventState(httpUriRequest);
        try {
            return warp(httpClient.execute(warp(httpUriRequest, buildEventState)), buildEventState);
        } catch (IOException e5) {
            d.abc(buildEventState, e5);
            throw e5;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        if (Agent.isDisabled()) {
            return httpClient.execute(httpHost, httpRequest);
        }
        fed buildEventState = buildEventState(httpRequest);
        try {
            return warp(httpClient.execute(httpHost, warp(httpHost, httpRequest, buildEventState)), buildEventState);
        } catch (IOException e5) {
            d.abc(buildEventState, e5);
            throw e5;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        if (Agent.isDisabled()) {
            return httpClient.execute(httpUriRequest, httpContext);
        }
        fed buildEventState = buildEventState(httpUriRequest);
        try {
            return warp(httpClient.execute(warp(httpUriRequest, buildEventState), httpContext), buildEventState);
        } catch (IOException e5) {
            d.abc(buildEventState, e5);
            throw e5;
        }
    }

    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        if (Agent.isDisabled()) {
            return httpClient.execute(httpHost, httpRequest, httpContext);
        }
        fed buildEventState = buildEventState(httpRequest);
        try {
            return warp(httpClient.execute(httpHost, warp(httpHost, httpRequest, buildEventState), httpContext), buildEventState);
        } catch (IOException e5) {
            d.abc(buildEventState, e5);
            throw e5;
        }
    }
}
