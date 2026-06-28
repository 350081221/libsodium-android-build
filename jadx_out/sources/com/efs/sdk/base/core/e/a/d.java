package com.efs.sdk.base.core.e.a;

import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.processor.action.ILogEncryptAction;

/* loaded from: classes2.dex */
public final class d extends a {

    /* renamed from: b, reason: collision with root package name */
    private ILogEncryptAction f6600b;

    public d() {
        if (ControllerCenter.getGlobalEnvStruct().getLogEncryptAction() == null) {
            this.f6600b = new com.efs.sdk.base.core.e.b();
        } else {
            this.f6600b = ControllerCenter.getGlobalEnvStruct().getLogEncryptAction();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        if (r5.f6592b.f6595a == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (1 == r0.f6586c) goto L17;
     */
    @Override // com.efs.sdk.base.core.e.a.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.efs.sdk.base.core.d.b r5) {
        /*
            r4 = this;
            com.efs.sdk.base.core.d.a r0 = r5.f6591a
            int r1 = r0.f6588e
            r2 = 0
            r3 = 1
            if (r3 == r1) goto La
            r1 = r3
            goto Lb
        La:
            r1 = r2
        Lb:
            if (r1 != 0) goto L34
            java.lang.String r1 = "wa"
            java.lang.String r0 = r0.f6584a
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L34
            com.efs.sdk.base.core.d.a r0 = r5.f6591a
            java.lang.String r0 = r0.f6584a
            java.lang.String r1 = "startperf"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L34
            com.efs.sdk.base.core.d.a r0 = r5.f6591a
            byte r1 = r0.f6585b
            if (r3 != r1) goto L30
            com.efs.sdk.base.core.d.c r1 = r5.f6592b
            boolean r1 = r1.f6595a
            if (r1 == 0) goto L34
        L30:
            int r0 = r0.f6586c
            if (r3 != r0) goto L35
        L34:
            r2 = r3
        L35:
            if (r2 == 0) goto L3b
            r4.b(r5)
            return
        L3b:
            com.efs.sdk.base.processor.action.ILogEncryptAction r0 = r4.f6600b
            com.efs.sdk.base.core.config.GlobalEnvStruct r1 = com.efs.sdk.base.core.controller.ControllerCenter.getGlobalEnvStruct()
            java.lang.String r1 = r1.getSecret()
            byte[] r2 = r5.f6593c
            byte[] r0 = r0.encrypt(r1, r2)
            if (r0 == 0) goto L59
            r5.a(r0)
            com.efs.sdk.base.processor.action.ILogEncryptAction r0 = r4.f6600b
            int r0 = r0.getDeVal()
            r5.a(r0)
        L59:
            r4.b(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.efs.sdk.base.core.e.a.d.a(com.efs.sdk.base.core.d.b):void");
    }
}
