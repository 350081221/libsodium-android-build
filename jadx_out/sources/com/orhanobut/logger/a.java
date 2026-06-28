package com.orhanobut.logger;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public class a implements g {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final f f9331a;

    public a() {
        this.f9331a = l.k().a();
    }

    @Override // com.orhanobut.logger.g
    public void a(int i5, @Nullable String str, @NonNull String str2) {
        this.f9331a.a(i5, str, str2);
    }

    @Override // com.orhanobut.logger.g
    public boolean b(int i5, @Nullable String str) {
        return true;
    }

    public a(@NonNull f fVar) {
        this.f9331a = (f) o.a(fVar);
    }
}
