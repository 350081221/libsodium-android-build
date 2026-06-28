package io.reactivex.rxjava3.internal.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes3.dex */
public final class w<T> implements m3.o<List<T>, List<T>> {

    /* renamed from: a, reason: collision with root package name */
    final Comparator<? super T> f18704a;

    public w(Comparator<? super T> comparator) {
        this.f18704a = comparator;
    }

    @Override // m3.o
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<T> apply(List<T> list) {
        Collections.sort(list, this.f18704a);
        return list;
    }
}
