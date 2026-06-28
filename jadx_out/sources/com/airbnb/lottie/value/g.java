package com.airbnb.lottie.value;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class g extends j<Float> {
    public g() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Float e(b<Float> bVar) {
        T t5 = this.f1811c;
        if (t5 != 0) {
            return (Float) t5;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // com.airbnb.lottie.value.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float a(b<Float> bVar) {
        return Float.valueOf(com.airbnb.lottie.utils.k.k(bVar.g().floatValue(), bVar.b().floatValue(), bVar.c()) + e(bVar).floatValue());
    }

    public g(@NonNull Float f5) {
        super(f5);
    }
}
