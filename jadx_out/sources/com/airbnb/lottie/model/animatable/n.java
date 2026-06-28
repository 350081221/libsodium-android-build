package com.airbnb.lottie.model.animatable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
abstract class n<V, O> implements m<V, O> {

    /* renamed from: a, reason: collision with root package name */
    final List<com.airbnb.lottie.value.a<V>> f1382a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(V v4) {
        this(Collections.singletonList(new com.airbnb.lottie.value.a(v4)));
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public List<com.airbnb.lottie.value.a<V>> b() {
        return this.f1382a;
    }

    @Override // com.airbnb.lottie.model.animatable.m
    public boolean c() {
        if (this.f1382a.isEmpty()) {
            return true;
        }
        return this.f1382a.size() == 1 && this.f1382a.get(0).i();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f1382a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f1382a.toArray()));
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(List<com.airbnb.lottie.value.a<V>> list) {
        this.f1382a = list;
    }
}
