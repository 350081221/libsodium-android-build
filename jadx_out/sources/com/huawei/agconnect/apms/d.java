package com.huawei.agconnect.apms;

import android.text.TextUtils;
import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.RequestLine;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.HttpEntityWrapper;
import org.apache.http.protocol.HTTP;

/* loaded from: classes3.dex */
public class d {
    public static final AgentLog abc = AgentLogManager.getAgentLog();

    public static HttpUriRequest abc(HttpUriRequest httpUriRequest, fed fedVar) {
        try {
            fedVar.def(httpUriRequest.getURI().toString());
            fedVar.bcd(httpUriRequest.getMethod());
            fedVar.cde(System.currentTimeMillis());
            fedVar.ghi = 4;
            abc((HttpRequest) httpUriRequest, fedVar);
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("failed to get request info: "), abc);
        }
        return httpUriRequest;
    }

    public static HttpRequest abc(HttpHost httpHost, HttpRequest httpRequest, fed fedVar) {
        try {
            RequestLine requestLine = httpRequest.getRequestLine();
            if (requestLine != null) {
                fedVar.def(requestLine.getUri());
                fedVar.bcd(requestLine.getMethod());
            } else if (httpHost != null) {
                fedVar.def(httpHost.toURI());
            }
            fedVar.cde(System.currentTimeMillis());
            fedVar.ghi = 4;
            abc(httpRequest, fedVar);
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("failed to get http host info: "), abc);
        }
        return httpRequest;
    }

    public static String abc(String str, HttpResponse httpResponse) {
        try {
            Header[] headers = httpResponse.getHeaders(str);
            if (headers != null && headers.length > 0 && headers[0].getValue() != null) {
                return headers[0].getValue();
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    public static HttpResponse abc(HttpResponse httpResponse, fed fedVar) {
        long j5;
        try {
            String str = Agent.getAgentConfiguration().def;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                fedVar.cde = abc(str, httpResponse);
            }
            if (httpResponse.getStatusLine() != null) {
                fedVar.cde(httpResponse.getStatusLine().getStatusCode());
            }
            fedVar.efg = abc(HTTP.CONTENT_TYPE, httpResponse);
            try {
                j5 = Long.parseLong(abc(HTTP.CONTENT_LEN, httpResponse));
            } catch (Throwable unused) {
                j5 = 0;
            }
            fedVar.def(j5);
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                if (entity instanceof HttpEntityWrapper) {
                    httpResponse.setEntity(new g(httpResponse, fedVar));
                } else {
                    httpResponse.setEntity(new f(httpResponse, fedVar));
                }
                fedVar.opq();
                dcb.abc((Object) fedVar);
            } else {
                fedVar.abc(0L);
                abc(fedVar);
            }
        } catch (Throwable th) {
            abc.bcd(th, abc.abc("failed to get cdn info: "), abc);
        }
        return httpResponse;
    }

    public static <T> ResponseHandler<? extends T> abc(ResponseHandler<? extends T> responseHandler, fed fedVar) {
        return new h(responseHandler, fedVar);
    }

    public static void abc(HttpRequest httpRequest, fed fedVar) {
        if (httpRequest instanceof HttpEntityEnclosingRequest) {
            HttpEntityEnclosingRequest httpEntityEnclosingRequest = (HttpEntityEnclosingRequest) httpRequest;
            if (httpEntityEnclosingRequest.getEntity() != null) {
                httpEntityEnclosingRequest.setEntity(new e(httpEntityEnclosingRequest.getEntity(), fedVar));
            }
        }
    }

    public static void abc(fed fedVar, Exception exc) {
        fedVar.cde(0);
        if (exc != null) {
            fedVar.abc(exc.toString());
        }
        abc(fedVar);
    }

    public static void abc(fed fedVar) {
        gfe bcd;
        if (fedVar == null) {
            return;
        }
        if (fedVar.jkl()) {
            fedVar.qpo = x1.abc();
        }
        if (fedVar.fgh() || (bcd = fedVar.bcd()) == null) {
            return;
        }
        HttpEvent httpEvent = new HttpEvent(bcd, "");
        fedVar.abc(true);
        yza.abc(httpEvent);
    }
}
