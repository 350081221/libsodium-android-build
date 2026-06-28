package io.reactivex.rxjava3.internal.util;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public enum b implements m3.s<List<Object>>, m3.o<Object, List<Object>> {
    INSTANCE;

    public static <T, O> m3.o<O, List<T>> asFunction() {
        return INSTANCE;
    }

    public static <T> m3.s<List<T>> asSupplier() {
        return INSTANCE;
    }

    @Override // m3.o
    public List<Object> apply(Object obj) {
        return new ArrayList();
    }

    @Override // m3.s
    public List<Object> get() {
        return new ArrayList();
    }
}
