package io.reactivex.rxjava3.internal.util;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public enum m implements m3.s<Map<Object, Object>> {
    INSTANCE;

    public static <K, V> m3.s<Map<K, V>> asSupplier() {
        return INSTANCE;
    }

    @Override // m3.s
    public Map<Object, Object> get() {
        return new HashMap();
    }
}
