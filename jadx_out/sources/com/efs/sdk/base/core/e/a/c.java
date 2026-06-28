package com.efs.sdk.base.core.e.a;

import com.efs.sdk.base.Constants;
import com.efs.sdk.base.core.util.Log;

/* loaded from: classes2.dex */
public final class c extends a {
    private static boolean c(com.efs.sdk.base.core.d.b bVar) {
        if (!bVar.b()) {
            com.efs.sdk.base.core.d.a aVar = bVar.f6591a;
            if ((1 != aVar.f6585b || bVar.f6592b.f6595a) && 1 != aVar.f6586c) {
                return false;
            }
        }
        return true;
    }

    @Override // com.efs.sdk.base.core.e.a.a
    public final void a(com.efs.sdk.base.core.d.b bVar) {
        if (c(bVar)) {
            b(bVar);
            return;
        }
        byte[] a5 = com.efs.sdk.base.core.util.c.a(bVar.f6593c);
        if (a5 == null) {
            Log.w("efs.base", "gzip error");
            b(bVar);
        } else {
            bVar.a(a5);
            bVar.a(Constants.CP_GZIP);
            b(bVar);
        }
    }
}
