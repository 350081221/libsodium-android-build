package com.orhanobut.logger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class d implements g {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final f f9350a;

    public d() {
        this.f9350a = c.c().a();
    }

    @Override // com.orhanobut.logger.g
    public void a(int i5, @Nullable String str, @NonNull String str2) {
        this.f9350a.a(i5, str, str2);
    }

    @Override // com.orhanobut.logger.g
    public boolean b(int i5, @Nullable String str) {
        return true;
    }

    public d(@NonNull f fVar) {
        this.f9350a = (f) o.a(fVar);
    }
}
