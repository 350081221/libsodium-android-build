package com.efs.sdk.base.core.e.a;

/* loaded from: classes2.dex */
public final class f extends a {
    @Override // com.efs.sdk.base.core.e.a.a
    public final void a(com.efs.sdk.base.core.d.b bVar) {
        double d5;
        boolean z4;
        Double d6;
        com.efs.sdk.base.core.config.a.c a5 = com.efs.sdk.base.core.config.a.c.a();
        String str = bVar.f6591a.f6584a;
        com.efs.sdk.base.core.config.a.b bVar2 = a5.f6564d;
        if (bVar2.f6557f.containsKey(str) && (d6 = bVar2.f6557f.get(str)) != null) {
            d5 = d6.doubleValue();
        } else {
            d5 = 100.0d;
        }
        if (com.efs.sdk.base.core.config.a.c.f6561a.nextDouble() * 100.0d <= d5) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return;
        }
        b(bVar);
    }
}
