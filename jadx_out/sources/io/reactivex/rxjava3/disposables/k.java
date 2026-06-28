package io.reactivex.rxjava3.disposables;

import org.reactivestreams.q;

/* loaded from: classes3.dex */
final class k extends h<q> {
    private static final long serialVersionUID = -707001650852963139L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(q qVar) {
        super(qVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.reactivex.rxjava3.disposables.h
    public void onDisposed(@l3.f q qVar) {
        qVar.cancel();
    }
}
