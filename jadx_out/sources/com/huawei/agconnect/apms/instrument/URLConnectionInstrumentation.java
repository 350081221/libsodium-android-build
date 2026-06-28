package com.huawei.agconnect.apms.instrument;

import com.huawei.agconnect.apms.Agent;
import com.huawei.agconnect.apms.a;
import com.huawei.agconnect.apms.abc;
import com.huawei.agconnect.apms.cba;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes3.dex */
public class URLConnectionInstrumentation {
    public static final AgentLog LOG = AgentLogManager.getAgentLog();

    public static URLConnection getURLConnection(URLConnection uRLConnection) {
        if (uRLConnection != null && !Agent.isDisabled()) {
            try {
                if (uRLConnection instanceof HttpsURLConnection) {
                    return new a((HttpsURLConnection) uRLConnection);
                }
                if (uRLConnection instanceof HttpURLConnection) {
                    return new cba((HttpURLConnection) uRLConnection);
                }
            } catch (Throwable th) {
                abc.bcd(th, abc.abc("skipping APMS URLConnection proxy: "), LOG);
            }
        }
        return uRLConnection;
    }

    public static URLConnection openConnection(URLConnection uRLConnection) {
        return getURLConnection(uRLConnection);
    }

    public static URLConnection openConnectionWithProxy(URLConnection uRLConnection) {
        return getURLConnection(uRLConnection);
    }
}
