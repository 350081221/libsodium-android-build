package com.huawei.agconnect.apms;

import android.os.Looper;
import android.text.TextUtils;
import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public class edc {
    public static final AgentLog abc = AgentLogManager.getAgentLog();
    public static final ConcurrentHashMap<String, String> bcd = new ConcurrentHashMap<>();

    public static void abc(fed fedVar, String str, String str2, long j5) {
        fedVar.def(str);
        if (!fedVar.mno()) {
            fedVar.def = str2;
        }
        fedVar.bcd(j5);
    }

    public static boolean abc(int i5) {
        return i5 >= 8;
    }

    public static void bcd(fed fedVar, HttpURLConnection httpURLConnection) {
        int i5;
        String str;
        int i6;
        String str2;
        int contentLength = httpURLConnection.getContentLength();
        String str3 = "";
        try {
            i5 = httpURLConnection.getResponseCode();
            try {
                str2 = Agent.getAgentConfiguration().def;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            i5 = 0;
        }
        if (!TextUtils.isEmpty(str2)) {
            String headerField = httpURLConnection.getHeaderField(str2);
            try {
            } catch (Throwable unused3) {
                str3 = headerField;
                abc.warn("failed to get response info");
                str = str3;
                i6 = i5;
                abc(fedVar, contentLength, i6, httpURLConnection.getContentType(), str);
            }
            if (!TextUtils.isEmpty(headerField)) {
                i6 = i5;
                str = headerField;
                abc(fedVar, contentLength, i6, httpURLConnection.getContentType(), str);
            }
        }
        str = str3;
        i6 = i5;
        abc(fedVar, contentLength, i6, httpURLConnection.getContentType(), str);
    }

    public static void abc(fed fedVar, HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null || httpURLConnection.getURL() == null) {
            return;
        }
        String url = httpURLConnection.getURL().toString();
        String requestMethod = httpURLConnection.getRequestMethod();
        fedVar.def(url);
        if (fedVar.mno()) {
            return;
        }
        fedVar.def = requestMethod;
    }

    public static void abc(fed fedVar, long j5, int i5, String str, String str2) {
        if (j5 >= 0) {
            fedVar.def(j5);
        }
        if (!fedVar.ijk()) {
            fedVar.jkl = i5;
        }
        fedVar.efg = str;
        fedVar.cde = str2;
    }

    public static void abc(fed fedVar, Exception exc) {
        fedVar.abc(exc.toString());
    }

    public static void abc(String str, fed fedVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            InetAddress[] allByName = InetAddress.getAllByName(str);
            int currentTimeMillis2 = (int) (System.currentTimeMillis() - currentTimeMillis);
            if (abc(currentTimeMillis2)) {
                o oVar = new o(str, 0);
                fedVar.abc(oVar);
                fedVar.hij();
                oVar.cde = currentTimeMillis2;
                oVar.def = Arrays.asList(allByName).toString();
                oVar.efg = true;
            }
        } catch (Throwable th) {
            abc.abc(th, abc.abc("attempt to resolve dns failed: "), abc);
        }
    }

    public static int abc(fed fedVar) {
        long currentTimeMillis = System.currentTimeMillis() - fedVar.xyz;
        if (currentTimeMillis <= 0 || currentTimeMillis >= 2147483647L) {
            return -1;
        }
        return (int) currentTimeMillis;
    }
}
