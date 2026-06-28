package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;

/* loaded from: classes3.dex */
public class b0 extends edc {
    public static final AgentLog cde = AgentLogManager.getAgentLog();

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void abc(com.huawei.agconnect.apms.fed r10, okhttp3.Request r11) {
        /*
            if (r11 == 0) goto L61
            okhttp3.HttpUrl r0 = r11.url()
            if (r0 != 0) goto L9
            goto L61
        L9:
            okhttp3.HttpUrl r0 = r11.url()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r11.method()
            okhttp3.RequestBody r2 = r11.body()
            r3 = -1
            if (r2 == 0) goto L32
            okhttp3.RequestBody r2 = r11.body()     // Catch: java.lang.Throwable -> L26
            long r5 = r2.contentLength()     // Catch: java.lang.Throwable -> L26
            goto L33
        L26:
            r2 = move-exception
            com.huawei.agconnect.apms.log.AgentLog r5 = com.huawei.agconnect.apms.b0.cde
            java.lang.String r6 = "failed to get request content length: "
            java.lang.StringBuilder r6 = com.huawei.agconnect.apms.abc.abc(r6)
            com.huawei.agconnect.apms.abc.bcd(r2, r6, r5)
        L32:
            r5 = r3
        L33:
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L58
            java.lang.String r2 = "Content-length"
            java.lang.String r11 = r11.header(r2)
            if (r11 == 0) goto L58
            int r2 = r11.length()
            if (r2 <= 0) goto L58
            long r5 = java.lang.Long.parseLong(r11)     // Catch: java.lang.Throwable -> L4c
            goto L58
        L4c:
            r11 = move-exception
            com.huawei.agconnect.apms.log.AgentLog r2 = com.huawei.agconnect.apms.b0.cde
            java.lang.String r9 = "failed to parse content length: "
            java.lang.StringBuilder r9 = com.huawei.agconnect.apms.abc.abc(r9)
            com.huawei.agconnect.apms.abc.bcd(r11, r9, r2)
        L58:
            int r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r11 != 0) goto L5d
            goto L5e
        L5d:
            r7 = r5
        L5e:
            com.huawei.agconnect.apms.edc.abc(r10, r0, r1, r7)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.apms.b0.abc(com.huawei.agconnect.apms.fed, okhttp3.Request):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x002b, code lost:
    
        if (android.text.TextUtils.isEmpty(r4) != false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static okhttp3.Response abc(com.huawei.agconnect.apms.fed r13, okhttp3.Response r14) {
        /*
            r0 = 0
            java.lang.String r2 = ""
            if (r14 != 0) goto Lc
            r3 = 500(0x1f4, float:7.0E-43)
            r8 = r2
            r6 = r3
            goto L88
        Lc:
            int r3 = r14.code()
            com.huawei.agconnect.apms.efg r4 = com.huawei.agconnect.apms.Agent.getAgentConfiguration()
            java.lang.String r4 = r4.def
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L1d
            r4 = r2
        L1d:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L2d
            java.lang.String r4 = r14.header(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L2e
        L2d:
            r4 = r2
        L2e:
            okhttp3.ResponseBody r5 = r14.body()     // Catch: java.lang.Throwable -> L7a
            r6 = -1
            if (r5 == 0) goto L3f
            okhttp3.ResponseBody r5 = r14.body()     // Catch: java.lang.Throwable -> L7a
            long r8 = r5.contentLength()     // Catch: java.lang.Throwable -> L7a
            goto L40
        L3f:
            r8 = r6
        L40:
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 >= 0) goto L72
            java.lang.String r5 = "Content-length"
            java.lang.String r5 = r14.header(r5)     // Catch: java.lang.Throwable -> L7a
            if (r5 == 0) goto L72
            int r10 = r5.length()     // Catch: java.lang.Throwable -> L7a
            if (r10 <= 0) goto L72
            long r8 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Throwable -> L57
            goto L72
        L57:
            r5 = move-exception
            com.huawei.agconnect.apms.log.AgentLog r10 = com.huawei.agconnect.apms.b0.cde     // Catch: java.lang.Throwable -> L7a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7a
            r11.<init>()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r12 = "failed to parse content length: "
            r11.append(r12)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L7a
            r11.append(r5)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r5 = r11.toString()     // Catch: java.lang.Throwable -> L7a
            r10.warn(r5)     // Catch: java.lang.Throwable -> L7a
        L72:
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r6 = r3
            if (r5 != 0) goto L78
            goto L87
        L78:
            r0 = r8
            goto L87
        L7a:
            r5 = move-exception
            com.huawei.agconnect.apms.log.AgentLog r6 = com.huawei.agconnect.apms.b0.cde
            java.lang.String r7 = "failed to get response content length: "
            java.lang.StringBuilder r7 = com.huawei.agconnect.apms.abc.abc(r7)
            com.huawei.agconnect.apms.abc.bcd(r5, r7, r6)
            r6 = r3
        L87:
            r8 = r4
        L88:
            int r0 = (int) r0
            long r4 = (long) r0
            if (r14 == 0) goto Laa
            okhttp3.ResponseBody r0 = r14.body()
            if (r0 != 0) goto L93
            goto Laa
        L93:
            okhttp3.ResponseBody r0 = r14.body()
            okhttp3.MediaType r0 = r0.contentType()
            if (r0 != 0) goto L9e
            goto Laa
        L9e:
            java.lang.String r0 = r0.toString()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Laa
            r7 = r0
            goto Lab
        Laa:
            r7 = r2
        Lab:
            r3 = r13
            com.huawei.agconnect.apms.edc.abc(r3, r4, r6, r7, r8)
            r13.opq()
            boolean r0 = r13.jkl()
            if (r0 == 0) goto Lbe
            java.lang.String r0 = com.huawei.agconnect.apms.x1.abc()
            r13.qpo = r0
        Lbe:
            com.huawei.agconnect.apms.t0 r0 = new com.huawei.agconnect.apms.t0
            r0.<init>(r13)
            com.huawei.agconnect.apms.instrument.TraceManager.notifyToAddNetworkInfoToTrace(r0)
            com.huawei.agconnect.apms.dcb.abc(r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.apms.b0.abc(com.huawei.agconnect.apms.fed, okhttp3.Response):okhttp3.Response");
    }
}
