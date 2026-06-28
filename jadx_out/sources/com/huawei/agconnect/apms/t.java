package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.log.AgentLog;
import com.huawei.agconnect.apms.log.AgentLogManager;
import com.squareup.okhttp.Request;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class t extends edc {
    public static final AgentLog cde = AgentLogManager.getAgentLog();

    /* loaded from: classes3.dex */
    public static class abc implements Runnable {
        public final /* synthetic */ Request abc;
        public final /* synthetic */ fed bcd;

        public abc(Request request, fed fedVar) {
            this.abc = request;
            this.bcd = fedVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            edc.abc(this.abc.url().getHost(), this.bcd);
            this.bcd.mlk = true;
        }
    }

    /* loaded from: classes3.dex */
    public static class bcd {
        public static final ExecutorService abc;
        public static final int bcd;
        public static final int cde;

        static {
            int availableProcessors = Runtime.getRuntime().availableProcessors();
            bcd = availableProcessors;
            int max = Math.max(availableProcessors, 2);
            cde = max;
            abc = new ThreadPoolExecutor(max, max, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void abc(com.huawei.agconnect.apms.fed r10, com.squareup.okhttp.Request r11) {
        /*
            if (r11 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r11.urlString()
            java.lang.String r1 = r11.method()
            com.squareup.okhttp.RequestBody r2 = r11.body()
            r3 = -1
            if (r2 == 0) goto L28
            com.squareup.okhttp.RequestBody r2 = r11.body()     // Catch: java.lang.Throwable -> L1c
            long r5 = r2.contentLength()     // Catch: java.lang.Throwable -> L1c
            goto L29
        L1c:
            r2 = move-exception
            com.huawei.agconnect.apms.log.AgentLog r5 = com.huawei.agconnect.apms.t.cde
            java.lang.String r6 = "failed to get request content length: "
            java.lang.StringBuilder r6 = com.huawei.agconnect.apms.abc.abc(r6)
            com.huawei.agconnect.apms.abc.bcd(r2, r6, r5)
        L28:
            r5 = r3
        L29:
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L4e
            java.lang.String r2 = "Content-length"
            java.lang.String r11 = r11.header(r2)
            if (r11 == 0) goto L4e
            int r2 = r11.length()
            if (r2 <= 0) goto L4e
            long r5 = java.lang.Long.parseLong(r11)     // Catch: java.lang.Throwable -> L42
            goto L4e
        L42:
            r11 = move-exception
            com.huawei.agconnect.apms.log.AgentLog r2 = com.huawei.agconnect.apms.t.cde
            java.lang.String r9 = "failed to parse content length: "
            java.lang.StringBuilder r9 = com.huawei.agconnect.apms.abc.abc(r9)
            com.huawei.agconnect.apms.abc.bcd(r11, r9, r2)
        L4e:
            int r11 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r11 != 0) goto L53
            goto L54
        L53:
            r7 = r5
        L54:
            com.huawei.agconnect.apms.edc.abc(r10, r0, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.apms.t.abc(com.huawei.agconnect.apms.fed, com.squareup.okhttp.Request):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.squareup.okhttp.Response abc(com.huawei.agconnect.apms.fed r12, com.squareup.okhttp.Response r13) {
        /*
            java.lang.String r0 = ""
            if (r13 != 0) goto L9
            r1 = 500(0x1f4, float:7.0E-43)
        L6:
            r9 = r0
            r7 = r1
            goto L2d
        L9:
            int r1 = r13.code()
            com.huawei.agconnect.apms.efg r2 = com.huawei.agconnect.apms.Agent.getAgentConfiguration()
            java.lang.String r2 = r2.def
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L1a
            r2 = r0
        L1a:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L6
            java.lang.String r2 = r13.header(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L2b
            goto L6
        L2b:
            r7 = r1
            r9 = r2
        L2d:
            r1 = 0
            if (r13 != 0) goto L32
            goto L75
        L32:
            com.squareup.okhttp.ResponseBody r3 = r13.body()
            r4 = -1
            if (r3 == 0) goto L4f
            com.squareup.okhttp.ResponseBody r3 = r13.body()     // Catch: java.lang.Throwable -> L43
            long r10 = r3.contentLength()     // Catch: java.lang.Throwable -> L43
            goto L50
        L43:
            r3 = move-exception
            com.huawei.agconnect.apms.log.AgentLog r6 = com.huawei.agconnect.apms.t.cde
            java.lang.String r8 = "failed to get request content length: "
            java.lang.StringBuilder r8 = com.huawei.agconnect.apms.abc.abc(r8)
            com.huawei.agconnect.apms.abc.bcd(r3, r8, r6)
        L4f:
            r10 = r4
        L50:
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 >= 0) goto L71
            java.lang.String r3 = "Content-length"
            java.lang.String r3 = r13.header(r3)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L71
            long r10 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> L65
            goto L71
        L65:
            r3 = move-exception
            com.huawei.agconnect.apms.log.AgentLog r6 = com.huawei.agconnect.apms.t.cde
            java.lang.String r8 = "failed to parse content length: "
            java.lang.StringBuilder r8 = com.huawei.agconnect.apms.abc.abc(r8)
            com.huawei.agconnect.apms.abc.bcd(r3, r8, r6)
        L71:
            int r3 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r3 != 0) goto L77
        L75:
            r5 = r1
            goto L78
        L77:
            r5 = r10
        L78:
            if (r13 == 0) goto L99
            com.squareup.okhttp.ResponseBody r1 = r13.body()
            if (r1 != 0) goto L81
            goto L99
        L81:
            com.squareup.okhttp.ResponseBody r1 = r13.body()
            com.squareup.okhttp.MediaType r1 = r1.contentType()
            if (r1 != 0) goto L8c
            goto L99
        L8c:
            java.lang.String r1 = r1.toString()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L97
            goto L99
        L97:
            r8 = r1
            goto L9a
        L99:
            r8 = r0
        L9a:
            r4 = r12
            com.huawei.agconnect.apms.edc.abc(r4, r5, r7, r8, r9)
            r12.opq()
            boolean r0 = r12.jkl()
            if (r0 == 0) goto Lad
            java.lang.String r0 = com.huawei.agconnect.apms.x1.abc()
            r12.qpo = r0
        Lad:
            com.huawei.agconnect.apms.dcb.abc(r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.apms.t.abc(com.huawei.agconnect.apms.fed, com.squareup.okhttp.Response):com.squareup.okhttp.Response");
    }

    public static void abc(Request request, fed fedVar) {
        if (request == null || request.url() == null || fedVar == null) {
            return;
        }
        bcd.abc.execute(new abc(request, fedVar));
    }
}
