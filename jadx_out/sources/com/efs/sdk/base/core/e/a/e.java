package com.efs.sdk.base.core.e.a;

import com.efs.sdk.base.core.f.f;
import com.efs.sdk.base.http.HttpResponse;

/* loaded from: classes2.dex */
public final class e extends a {
    @Override // com.efs.sdk.base.core.e.a.a
    public final void a(com.efs.sdk.base.core.d.b bVar) {
        HttpResponse a5;
        if (!bVar.f6592b.f6595a) {
            b(bVar);
            return;
        }
        com.efs.sdk.base.core.c.d a6 = com.efs.sdk.base.core.c.d.a();
        if (bVar.f6592b.f6596b && !com.efs.sdk.base.core.c.b.a().a(bVar.f6591a.f6584a, bVar.a())) {
            a5 = new HttpResponse();
            a5.data = "flow_limit";
        } else {
            f.a.a().f6620c.b();
            f.a.a().f6620c.c();
            a5 = a6.f6518b.a(bVar, false);
        }
        bVar.f6592b.f6597c = a5;
        b(bVar);
    }
}
