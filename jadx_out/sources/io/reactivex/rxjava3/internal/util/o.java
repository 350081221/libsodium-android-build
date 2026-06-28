package io.reactivex.rxjava3.internal.util;

import java.util.List;

/* loaded from: classes3.dex */
public enum o implements m3.c<List, Object, List> {
    INSTANCE;

    public static <T> m3.c<List<T>, T, List<T>> instance() {
        return INSTANCE;
    }

    @Override // m3.c
    public List apply(List list, Object obj) {
        list.add(obj);
        return list;
    }
}
