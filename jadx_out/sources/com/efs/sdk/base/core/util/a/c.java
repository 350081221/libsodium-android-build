package com.efs.sdk.base.core.util.a;

import androidx.annotation.NonNull;
import com.efs.sdk.base.http.HttpResponse;

/* loaded from: classes2.dex */
public final class c extends com.efs.sdk.base.core.util.concurrent.d<HttpResponse> {

    /* renamed from: a, reason: collision with root package name */
    public b f6641a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(@NonNull b bVar) {
        super(bVar);
        this.f6641a = bVar;
    }

    @NonNull
    public final HttpResponse b() {
        this.f6641a.f6638e = "post";
        return a();
    }
}
