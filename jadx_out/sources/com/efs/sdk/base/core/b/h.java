package com.efs.sdk.base.core.b;

import com.efs.sdk.base.core.b.a;
import java.io.File;

/* loaded from: classes2.dex */
public final class h implements f {
    @Override // com.efs.sdk.base.core.b.f
    public final boolean a(File file) {
        a unused;
        com.efs.sdk.base.core.d.b b5 = com.efs.sdk.base.core.util.b.b(file.getName());
        if (b5 == null) {
            unused = a.b.f6500a;
            a.b(file);
            return true;
        }
        if (!"wa".equals(b5.f6591a.f6584a) && !com.efs.sdk.base.core.c.b.a().a(b5.f6591a.f6584a, file.length())) {
            return true;
        }
        return false;
    }
}
