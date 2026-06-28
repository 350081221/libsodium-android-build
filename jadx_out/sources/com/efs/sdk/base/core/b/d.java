package com.efs.sdk.base.core.b;

import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.f.f;
import java.io.File;

/* loaded from: classes2.dex */
public final class d implements e {
    @Override // com.efs.sdk.base.core.b.e
    public final void a(File file) {
        com.efs.sdk.base.core.util.b.a(file, com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid()));
    }

    @Override // com.efs.sdk.base.core.b.e
    public final void a(String str) {
    }

    @Override // com.efs.sdk.base.core.b.e
    public final boolean a(File file, com.efs.sdk.base.core.d.b bVar) {
        if (!file.exists()) {
            return false;
        }
        bVar.f6594d = file;
        bVar.c();
        bVar.b(1);
        return true;
    }

    @Override // com.efs.sdk.base.core.b.e
    public final void a(com.efs.sdk.base.core.d.b bVar) {
        com.efs.sdk.base.core.f.f fVar;
        com.efs.sdk.base.core.f.f fVar2;
        if (bVar.f6593c == null) {
            return;
        }
        com.efs.sdk.base.core.util.b.a(new File(com.efs.sdk.base.core.util.a.f(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid()), com.efs.sdk.base.core.util.b.a(bVar)), bVar.f6593c);
        fVar = f.a.f6622a;
        fVar.f6620c.b();
        fVar2 = f.a.f6622a;
        fVar2.f6620c.c();
    }
}
