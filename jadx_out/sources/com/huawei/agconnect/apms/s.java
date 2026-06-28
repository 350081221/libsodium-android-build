package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.squareup.okhttp.Dns;
import com.squareup.okhttp.OkHttpClient;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* loaded from: classes3.dex */
public class s implements Dns {
    public static final AgentLog cde = AgentLogManager.getAgentLog();
    public Dns abc;
    public fed bcd;

    public s(Dns dns, fed fedVar) {
        this.abc = dns;
        this.bcd = fedVar;
    }

    public static void abc(OkHttpClient okHttpClient, fed fedVar) {
        if (okHttpClient == null) {
            return;
        }
        try {
            if (okHttpClient.getDns() == null) {
                okHttpClient.setDns(Dns.SYSTEM);
            }
            if (okHttpClient.getDns() != null) {
                if (okHttpClient.getDns() instanceof s) {
                    ((s) okHttpClient.getDns()).bcd = fedVar;
                } else {
                    cde.debug("set custom dns success.");
                    okHttpClient.setDns(new s(okHttpClient.getDns(), fedVar));
                }
            }
        } catch (Throwable th) {
            abc.abc(th, abc.abc("set custom dns class failed: "), cde);
        }
    }

    public List<InetAddress> lookup(String str) throws UnknownHostException {
        fed fedVar = this.bcd;
        o oVar = new o(str, 0);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            List<InetAddress> lookup = this.abc.lookup(str);
            int currentTimeMillis2 = (int) (System.currentTimeMillis() - currentTimeMillis);
            String str2 = fedVar.bcd;
            if (str2 != null && str2.contains(str) && edc.abc(currentTimeMillis2)) {
                oVar.cde = currentTimeMillis2;
                oVar.efg = true;
                if (lookup != null) {
                    oVar.def = lookup.toString();
                }
                fedVar.abc(oVar);
                fedVar.hij();
            }
            return lookup;
        } catch (UnknownHostException e5) {
            if (!fedVar.ijk()) {
                fedVar.yxw++;
            }
            oVar.efg = false;
            throw e5;
        }
    }
}
