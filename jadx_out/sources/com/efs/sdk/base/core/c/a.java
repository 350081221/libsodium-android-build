package com.efs.sdk.base.core.c;

import androidx.annotation.NonNull;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpResponse;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class a implements c {
    @Override // com.efs.sdk.base.core.c.c
    @NonNull
    public final HttpResponse a(com.efs.sdk.base.core.d.b bVar, boolean z4) {
        HttpResponse httpResponse;
        com.efs.sdk.base.core.a.c a5 = com.efs.sdk.base.core.a.c.a();
        com.efs.sdk.base.core.d.a aVar = bVar.f6591a;
        a5.f6485d = aVar.f6587d;
        a5.f6486e = aVar.f6588e;
        a5.f6488g = aVar.f6585b;
        a5.f6489h = aVar.f6584a;
        a5.f6494m = bVar.a();
        String a6 = com.efs.sdk.base.core.config.a.c.a().a(false);
        int i5 = bVar.f6591a.f6586c;
        if (i5 == 0) {
            com.efs.sdk.base.core.a.a a7 = com.efs.sdk.base.core.a.a.a();
            byte[] bArr = bVar.f6593c;
            boolean z5 = bVar.f6592b.f6596b;
            String b5 = a5.b();
            String a8 = com.efs.sdk.base.core.a.a.a(a6, a5);
            if (a7.f6479a) {
                Log.i("efs.px.api", "upload buffer file, url is ".concat(String.valueOf(a8)));
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put("wpk-header", b5);
            com.efs.sdk.base.core.util.a.d a9 = new com.efs.sdk.base.core.util.a.d(a8).a(hashMap);
            com.efs.sdk.base.core.util.a.b bVar2 = a9.f6642a;
            bVar2.f6636c = bArr;
            bVar2.f6640g = true;
            com.efs.sdk.base.core.util.a.d a10 = a9.a("type", a5.f6489h);
            StringBuilder sb = new StringBuilder();
            sb.append(a5.f6494m);
            httpResponse = a10.a("size", sb.toString()).a("flow_limit", Boolean.toString(z5)).a(com.efs.sdk.base.core.a.d.a()).a().b();
        } else if (1 == i5) {
            httpResponse = com.efs.sdk.base.core.a.a.a().a(a6, a5, bVar.f6594d, bVar.f6592b.f6596b);
        } else {
            httpResponse = new HttpResponse();
        }
        if (httpResponse.succ && z4) {
            com.efs.sdk.base.core.util.b.b(bVar.f6594d);
        }
        return httpResponse;
    }
}
