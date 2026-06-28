package io.reactivex.rxjava3.internal.operators.parallel;

/* loaded from: classes3.dex */
public final class h<T> extends io.reactivex.rxjava3.parallel.b<T> {

    /* renamed from: a, reason: collision with root package name */
    final org.reactivestreams.o<T>[] f18252a;

    public h(org.reactivestreams.o<T>[] oVarArr) {
        this.f18252a = oVarArr;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public int M() {
        return this.f18252a.length;
    }

    @Override // io.reactivex.rxjava3.parallel.b
    public void X(org.reactivestreams.p<? super T>[] pVarArr) {
        if (!b0(pVarArr)) {
            return;
        }
        int length = pVarArr.length;
        for (int i5 = 0; i5 < length; i5++) {
            this.f18252a[i5].subscribe(pVarArr[i5]);
        }
    }
}
