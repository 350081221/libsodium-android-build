package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.LruCache;
import com.airbnb.lottie.k;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class g {

    /* renamed from: b, reason: collision with root package name */
    private static final g f1506b = new g();

    /* renamed from: a, reason: collision with root package name */
    private final LruCache<String, k> f1507a = new LruCache<>(20);

    @VisibleForTesting
    g() {
    }

    public static g c() {
        return f1506b;
    }

    public void a() {
        this.f1507a.evictAll();
    }

    @Nullable
    public k b(@Nullable String str) {
        if (str == null) {
            return null;
        }
        return this.f1507a.get(str);
    }

    public void d(@Nullable String str, k kVar) {
        if (str == null) {
            return;
        }
        this.f1507a.put(str, kVar);
    }

    public void e(int i5) {
        this.f1507a.resize(i5);
    }
}
