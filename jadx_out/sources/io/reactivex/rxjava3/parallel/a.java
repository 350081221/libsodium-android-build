package io.reactivex.rxjava3.parallel;

/* loaded from: classes3.dex */
public enum a implements m3.c<Long, Throwable, a> {
    STOP,
    ERROR,
    SKIP,
    RETRY;

    @Override // m3.c
    public a apply(Long l5, Throwable th) {
        return this;
    }
}
