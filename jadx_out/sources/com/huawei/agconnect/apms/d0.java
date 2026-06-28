package com.huawei.agconnect.apms;

import com.huawei.agconnect.apms.collect.model.event.network.HttpEvent;
import java.io.IOException;

/* loaded from: classes3.dex */
public class d0 extends okio.x {
    public long abc;
    public boolean bcd;
    public boolean cde;
    public final /* synthetic */ e0 def;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, okio.n1 n1Var) {
        super(n1Var);
        this.def = e0Var;
        this.bcd = false;
        this.cde = false;
    }

    public final int abc(fed fedVar) {
        long currentTimeMillis = System.currentTimeMillis() - fedVar.xyz;
        if (currentTimeMillis <= 0 || currentTimeMillis >= 2147483647L) {
            return -1;
        }
        return (int) currentTimeMillis;
    }

    @Override // okio.x, okio.n1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        abc("");
        super.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
    
        if (((okio.BufferedSource) delegate()).e0() == false) goto L23;
     */
    @Override // okio.x, okio.n1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(okio.l r7, long r8) throws java.io.IOException {
        /*
            r6 = this;
            boolean r0 = r6.cde
            r1 = 1
            if (r0 != 0) goto L11
            com.huawei.agconnect.apms.e0 r0 = r6.def
            com.huawei.agconnect.apms.fed r0 = r0.abc
            int r2 = r6.abc(r0)
            r0.tuv = r2
            r6.cde = r1
        L11:
            long r7 = super.read(r7, r8)     // Catch: java.io.IOException -> L6d
            long r2 = r6.abc
            r4 = -1
            int r9 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r9 == 0) goto L1f
            r4 = r7
            goto L21
        L1f:
            r4 = 0
        L21:
            long r2 = r2 + r4
            r6.abc = r2
            boolean r0 = r6.bcd
            if (r0 != 0) goto L33
            com.huawei.agconnect.apms.e0 r0 = r6.def
            com.huawei.agconnect.apms.fed r0 = r0.abc
            if (r0 == 0) goto L33
            com.huawei.agconnect.apms.dcb.abc(r0)
            r6.bcd = r1
        L33:
            if (r9 == 0) goto L4d
            long r0 = r6.abc     // Catch: java.io.IOException -> L59
            com.huawei.agconnect.apms.e0 r9 = r6.def     // Catch: java.io.IOException -> L59
            long r2 = r9.contentLength()     // Catch: java.io.IOException -> L59
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 == 0) goto L4d
            okio.n1 r9 = r6.delegate()     // Catch: java.io.IOException -> L59
            okio.BufferedSource r9 = (okio.BufferedSource) r9     // Catch: java.io.IOException -> L59
            boolean r9 = r9.e0()     // Catch: java.io.IOException -> L59
            if (r9 == 0) goto L58
        L4d:
            com.huawei.agconnect.apms.e0 r9 = r6.def     // Catch: java.io.IOException -> L59
            com.huawei.agconnect.apms.fed r9 = r9.abc     // Catch: java.io.IOException -> L59
            if (r9 == 0) goto L58
            java.lang.String r9 = ""
            r6.abc(r9)     // Catch: java.io.IOException -> L59
        L58:
            return r7
        L59:
            r7 = move-exception
            com.huawei.agconnect.apms.e0 r8 = r6.def
            com.huawei.agconnect.apms.fed r8 = r8.abc
            java.lang.String r9 = r7.getMessage()
            r8.abc(r9)
            java.lang.String r8 = com.huawei.agconnect.apms.x1.abc()
            r6.abc(r8)
            throw r7
        L6d:
            r7 = move-exception
            com.huawei.agconnect.apms.e0 r8 = r6.def
            com.huawei.agconnect.apms.fed r8 = r8.abc
            long r0 = r6.abc
            r8.abc(r0)
            com.huawei.agconnect.apms.e0 r8 = r6.def
            com.huawei.agconnect.apms.fed r8 = r8.abc
            java.lang.String r9 = r7.getMessage()
            r8.abc(r9)
            java.lang.String r8 = com.huawei.agconnect.apms.x1.abc()
            r6.abc(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.agconnect.apms.d0.read(okio.l, long):long");
    }

    public final void abc(String str) {
        fed fedVar = this.def.abc;
        if (fedVar == null || fedVar.fgh()) {
            return;
        }
        fed fedVar2 = this.def.abc;
        fedVar2.abc(this.abc);
        fedVar2.uvw = abc(fedVar2);
        fedVar2.abc(abc(fedVar2));
        gfe bcd = fedVar2.bcd();
        if (bcd != null) {
            this.def.abc.abc(true);
            yza.abc(new HttpEvent(bcd, str));
        }
    }
}
