package com.airbnb.lottie.value;

/* loaded from: classes2.dex */
public class h extends j<Integer> {
    /* JADX WARN: Multi-variable type inference failed */
    public Integer e(b<Integer> bVar) {
        T t5 = this.f1811c;
        if (t5 != 0) {
            return (Integer) t5;
        }
        throw new IllegalArgumentException("You must provide a static value in the constructor , call setValue, or override getValue.");
    }

    @Override // com.airbnb.lottie.value.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer a(b<Integer> bVar) {
        return Integer.valueOf(com.airbnb.lottie.utils.k.l(bVar.g().intValue(), bVar.b().intValue(), bVar.c()) + e(bVar).intValue());
    }
}
