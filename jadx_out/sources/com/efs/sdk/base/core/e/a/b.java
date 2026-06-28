package com.efs.sdk.base.core.e.a;

import com.efs.sdk.base.core.b.a;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.f;

/* loaded from: classes2.dex */
public final class b extends a {
    @Override // com.efs.sdk.base.core.e.a.a
    public final void a(com.efs.sdk.base.core.d.b bVar) {
        com.efs.sdk.base.core.b.e a5;
        byte[] bArr;
        if (bVar.f6592b.f6595a) {
            b(bVar);
            return;
        }
        com.efs.sdk.base.core.b.a a6 = a.b.a();
        if (!"wa".equals(bVar.f6591a.f6584a) && !com.efs.sdk.base.core.b.c.a().f6502a) {
            if (!a6.f6496a) {
                com.efs.sdk.base.core.f.f a7 = f.a.a();
                int i5 = com.efs.sdk.base.core.config.a.c.a().f6564d.f6552a;
                if (a7.f6619b != null || ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                    a7.f6619b.send(a7.a("disk_limit", i5));
                }
            }
            a6.f6496a = true;
            return;
        }
        com.efs.sdk.base.core.d.a aVar = bVar.f6591a;
        if ((aVar.f6586c != 0 || ((bArr = bVar.f6593c) != null && bArr.length != 0)) && (a5 = a6.f6498c.a(aVar.f6585b)) != null) {
            a5.a(bVar);
        }
    }
}
