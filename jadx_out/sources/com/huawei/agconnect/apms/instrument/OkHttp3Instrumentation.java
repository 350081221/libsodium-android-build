package com.huawei.agconnect.apms.instrument;

import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.a;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.cba;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes3.dex */
public class OkHttp3Instrumentation {
    public static final AgentLog LOG = AgentLogManager.getAgentLog();

    public static HttpURLConnection getHttpURLConnection(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null && !Agent.isDisabled()) {
            try {
                if (httpURLConnection instanceof HttpsURLConnection) {
                    return new a((HttpsURLConnection) httpURLConnection);
                }
                return new cba(httpURLConnection);
            } catch (Throwable th) {
                abc.bcd(th, abc.abc("skipping APMS OkHttp3 proxy: "), LOG);
            }
        }
        return httpURLConnection;
    }

    public static HttpURLConnection open(HttpURLConnection httpURLConnection) {
        return getHttpURLConnection(httpURLConnection);
    }

    public static HttpURLConnection openWithProxy(HttpURLConnection httpURLConnection) {
        return getHttpURLConnection(httpURLConnection);
    }

    public static HttpURLConnection urlFactoryOpen(HttpURLConnection httpURLConnection) {
        return getHttpURLConnection(httpURLConnection);
    }
}
