package com.bykv.vk.openvk.api.proto;

import java.util.Set;

/* loaded from: classes2.dex */
public interface ValueSet {

    /* loaded from: classes2.dex */
    public interface ValueGetter<T> {
        T get();
    }

    <T> T[] arrayValue(int i5, Class<T> cls);

    boolean booleanValue(int i5);

    boolean booleanValue(int i5, boolean z4);

    boolean containsKey(int i5);

    double doubleValue(int i5);

    float floatValue(int i5);

    float floatValue(int i5, float f5);

    int intValue(int i5);

    int intValue(int i5, int i6);

    boolean isEmpty();

    Set<Integer> keys();

    long longValue(int i5);

    long longValue(int i5, long j5);

    <T> T objectValue(int i5, Class<T> cls);

    int size();

    String stringValue(int i5);

    String stringValue(int i5, String str);
}
