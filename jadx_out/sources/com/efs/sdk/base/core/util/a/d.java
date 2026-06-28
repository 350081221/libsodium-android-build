package com.efs.sdk.base.core.util.a;

import androidx.annotation.NonNull;
import com.efs.sdk.base.http.AbsHttpListener;
import com.efs.sdk.base.http.HttpEnv;
import com.efs.sdk.base.http.HttpResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public b f6642a;

    /* renamed from: b, reason: collision with root package name */
    private List<com.efs.sdk.base.core.util.concurrent.b<HttpResponse>> f6643b;

    public d(@NonNull String str) {
        b bVar = new b();
        this.f6642a = bVar;
        bVar.f6634a = str;
    }

    public final d a(@NonNull Map<String, String> map) {
        this.f6642a.f6635b = map;
        return this;
    }

    public final d a(String str, String str2) {
        b bVar = this.f6642a;
        if (bVar.f6639f == null) {
            bVar.f6639f = new HashMap(5);
        }
        this.f6642a.f6639f.put(str, str2);
        return this;
    }

    public final d a(@NonNull AbsHttpListener absHttpListener) {
        if (this.f6643b == null) {
            this.f6643b = new ArrayList(5);
        }
        this.f6643b.add(absHttpListener);
        return this;
    }

    public final c a() {
        c cVar = new c(this.f6642a);
        List<com.efs.sdk.base.core.util.concurrent.b<HttpResponse>> list = this.f6643b;
        if (list != null && list.size() > 0) {
            cVar.a(this.f6643b);
        }
        List<com.efs.sdk.base.core.util.concurrent.b<HttpResponse>> httpListenerList = HttpEnv.getInstance().getHttpListenerList();
        if (httpListenerList != null && httpListenerList.size() > 0) {
            cVar.a(httpListenerList);
        }
        return cVar;
    }
}
