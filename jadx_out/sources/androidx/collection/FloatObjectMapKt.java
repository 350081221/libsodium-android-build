package androidx.collection;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0015\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\n\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u0005¢\u0006\u0002\u0010\r\u001aG\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0010\u001aW\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0013\u001ag\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0016\u001a\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0018\u001a7\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u0005¢\u0006\u0002\u0010\u0019\u001aG\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001a\u001aW\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001b\u001ag\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u0002H\u00052\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u0002H\u00052\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u0002H\u00052\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u0002H\u00052\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u0002H\u0005¢\u0006\u0002\u0010\u001c\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"EmptyFloatObjectMap", "Landroidx/collection/MutableFloatObjectMap;", "", "emptyFloatObjectMap", "Landroidx/collection/FloatObjectMap;", "V", "floatObjectMapOf", "key1", "", "value1", "(FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key2", "value2", "(FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key3", "value3", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key4", "value4", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "key5", "value5", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/FloatObjectMap;", "mutableFloatObjectMapOf", "(FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "(FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;)Landroidx/collection/MutableFloatObjectMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatObjectMapKt {

    @l
    private static final MutableFloatObjectMap EmptyFloatObjectMap = new MutableFloatObjectMap(0);

    @l
    public static final <V> FloatObjectMap<V> emptyFloatObjectMap() {
        MutableFloatObjectMap mutableFloatObjectMap = EmptyFloatObjectMap;
        l0.n(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.emptyFloatObjectMap>");
        return mutableFloatObjectMap;
    }

    @l
    public static final <V> FloatObjectMap<V> floatObjectMapOf() {
        MutableFloatObjectMap mutableFloatObjectMap = EmptyFloatObjectMap;
        l0.n(mutableFloatObjectMap, "null cannot be cast to non-null type androidx.collection.FloatObjectMap<V of androidx.collection.FloatObjectMapKt.floatObjectMapOf>");
        return mutableFloatObjectMap;
    }

    @l
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf() {
        return new MutableFloatObjectMap<>(0, 1, null);
    }

    @l
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f5, V v4) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f5, v4);
        return mutableFloatObjectMap;
    }

    @l
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f5, V v4) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f5, v4);
        return mutableFloatObjectMap;
    }

    @l
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f5, V v4, float f6, V v5) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f5, v4);
        mutableFloatObjectMap.set(f6, v5);
        return mutableFloatObjectMap;
    }

    @l
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f5, V v4, float f6, V v5) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f5, v4);
        mutableFloatObjectMap.set(f6, v5);
        return mutableFloatObjectMap;
    }

    @l
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f5, V v4, float f6, V v5, float f7, V v6) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f5, v4);
        mutableFloatObjectMap.set(f6, v5);
        mutableFloatObjectMap.set(f7, v6);
        return mutableFloatObjectMap;
    }

    @l
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f5, V v4, float f6, V v5, float f7, V v6) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f5, v4);
        mutableFloatObjectMap.set(f6, v5);
        mutableFloatObjectMap.set(f7, v6);
        return mutableFloatObjectMap;
    }

    @l
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f5, V v4, float f6, V v5, float f7, V v6, float f8, V v7) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f5, v4);
        mutableFloatObjectMap.set(f6, v5);
        mutableFloatObjectMap.set(f7, v6);
        mutableFloatObjectMap.set(f8, v7);
        return mutableFloatObjectMap;
    }

    @l
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f5, V v4, float f6, V v5, float f7, V v6, float f8, V v7) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f5, v4);
        mutableFloatObjectMap.set(f6, v5);
        mutableFloatObjectMap.set(f7, v6);
        mutableFloatObjectMap.set(f8, v7);
        return mutableFloatObjectMap;
    }

    @l
    public static final <V> FloatObjectMap<V> floatObjectMapOf(float f5, V v4, float f6, V v5, float f7, V v6, float f8, V v7, float f9, V v8) {
        MutableFloatObjectMap mutableFloatObjectMap = new MutableFloatObjectMap(0, 1, null);
        mutableFloatObjectMap.set(f5, v4);
        mutableFloatObjectMap.set(f6, v5);
        mutableFloatObjectMap.set(f7, v6);
        mutableFloatObjectMap.set(f8, v7);
        mutableFloatObjectMap.set(f9, v8);
        return mutableFloatObjectMap;
    }

    @l
    public static final <V> MutableFloatObjectMap<V> mutableFloatObjectMapOf(float f5, V v4, float f6, V v5, float f7, V v6, float f8, V v7, float f9, V v8) {
        MutableFloatObjectMap<V> mutableFloatObjectMap = new MutableFloatObjectMap<>(0, 1, null);
        mutableFloatObjectMap.set(f5, v4);
        mutableFloatObjectMap.set(f6, v5);
        mutableFloatObjectMap.set(f7, v6);
        mutableFloatObjectMap.set(f8, v7);
        mutableFloatObjectMap.set(f9, v8);
        return mutableFloatObjectMap;
    }
}
