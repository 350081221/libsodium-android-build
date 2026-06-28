package com.huawei.agconnect.apms;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkInfo;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class m1 {
    public static final AgentLog abc = AgentLogManager.getAgentLog();
    public static final Map<Integer, String> bcd = new abc();

    /* loaded from: classes3.dex */
    public static class abc extends HashMap<Integer, String> {
        public abc() {
            put(1, "GPRS");
            put(2, "EDGE");
            put(3, "UMTS");
            put(4, "CDMA");
            put(5, "EVDO rev 0");
            put(6, "EVDO rev A");
            put(7, "1xRTT");
            put(8, "HSDPA");
            put(9, "HSUPA");
            put(10, "HSPA");
            put(11, "IDEN");
            put(12, "EVDO rev B");
            put(13, "LTE");
            put(14, "HRPD");
            put(15, "HSPAP");
        }
    }

    public static String abc(Context context) {
        NetworkInfo bcd2;
        ConnectivityManager connectivityManager;
        LinkProperties linkProperties;
        StringBuilder sb = new StringBuilder();
        try {
            bcd2 = bcd(context);
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.bcd(th, com.huawei.agconnect.apms.abc.abc("cannot get network dns，ensure permission android.permission.ACCESS_NETWORK_STATE in the manifest: "), abc);
        }
        if (connectivityManager == null || bcd2 == null || connectivityManager.getAllNetworks().length == 0) {
            return "";
        }
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
            if (networkInfo != null && networkInfo.getType() == bcd2.getType() && (linkProperties = connectivityManager.getLinkProperties(network)) != null) {
                for (InetAddress inetAddress : linkProperties.getDnsServers()) {
                    if (inetAddress != null) {
                        sb.append(inetAddress.getHostAddress() + "/");
                    }
                }
            }
        }
        if (sb.length() == 0) {
            return "";
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static NetworkInfo bcd(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                return connectivityManager.getActiveNetworkInfo();
            }
            return null;
        } catch (Throwable th) {
            com.huawei.agconnect.apms.abc.bcd(th, com.huawei.agconnect.apms.abc.abc("cannot get network state, ensure permission android.permission.ACCESS_NETWORK_STATE in the manifest: "), abc);
            return null;
        }
    }

    public static String cde(Context context) {
        boolean z4;
        boolean z5;
        try {
            NetworkInfo bcd2 = bcd(context);
            boolean z6 = true;
            if (bcd2 != null && bcd2.isConnected()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                return "none";
            }
            if (bcd2 != null) {
                int[] iArr = {1, 6, 7, 9};
                for (int i5 = 0; i5 < 4; i5++) {
                    if (iArr[i5] == bcd2.getType()) {
                        z5 = true;
                        break;
                    }
                }
            }
            z5 = false;
            if (z5) {
                return NetworkUtil.NETWORK_TYPE_WIFI;
            }
            if (bcd2 != null) {
                int[] iArr2 = {0, 2, 3, 4, 5};
                for (int i6 = 0; i6 < 5; i6++) {
                    if (iArr2[i6] == bcd2.getType()) {
                        break;
                    }
                }
            }
            z6 = false;
            if (!z6) {
                return "unknown";
            }
            int subtype = bcd2.getSubtype();
            Map<Integer, String> map = bcd;
            if (!map.containsKey(Integer.valueOf(subtype))) {
                return "unknown";
            }
            return map.get(Integer.valueOf(subtype));
        } catch (Throwable unused) {
            return "unknown";
        }
    }
}
