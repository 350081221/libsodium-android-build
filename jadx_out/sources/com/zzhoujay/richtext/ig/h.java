package com.zzhoujay.richtext.ig;

import java.util.concurrent.Future;

/* loaded from: classes3.dex */
class h implements e {

    /* renamed from: a, reason: collision with root package name */
    private Future f15829a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Future future) {
        this.f15829a = future;
    }

    @Override // com.zzhoujay.richtext.ig.e
    public void cancel() {
        Future future = this.f15829a;
        if (future != null && !future.isDone() && !this.f15829a.isCancelled()) {
            this.f15829a.cancel(true);
            this.f15829a = null;
        }
    }
}
