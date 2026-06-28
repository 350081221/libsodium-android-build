package androidx.collection;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0015\u001a\u0012\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\n\u001a7\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\r\u001aG\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0002\u0010\u0010\u001aW\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0002\u0010\u0013\u001ag\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0001\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0002\u0010\u0016\u001a\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u0005\u001a'\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u0019\u001a7\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t¢\u0006\u0002\u0010\u001a\u001aG\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0002\u0010\u001b\u001aW\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0002\u0010\u001c\u001ag\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0007\u001a\u0002H\u00052\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u0002H\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u0002H\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0011\u001a\u0002H\u00052\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0014\u001a\u0002H\u00052\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0002\u0010\u001d\"\u0016\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"EmptyObjectFloatMap", "Landroidx/collection/MutableObjectFloatMap;", "", "emptyObjectFloatMap", "Landroidx/collection/ObjectFloatMap;", "K", "mutableObjectFloatMapOf", "key1", "value1", "", "(Ljava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key2", "value2", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key3", "value3", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key4", "value4", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "key5", "value5", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/MutableObjectFloatMap;", "objectFloatMap", "objectFloatMapOf", "(Ljava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "(Ljava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;FLjava/lang/Object;F)Landroidx/collection/ObjectFloatMap;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ObjectFloatMapKt {

    @l
    private static final MutableObjectFloatMap<Object> EmptyObjectFloatMap = new MutableObjectFloatMap<>(0);

    @l
    public static final <K> ObjectFloatMap<K> emptyObjectFloatMap() {
        MutableObjectFloatMap<Object> mutableObjectFloatMap = EmptyObjectFloatMap;
        l0.n(mutableObjectFloatMap, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.emptyObjectFloatMap>");
        return mutableObjectFloatMap;
    }

    @l
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf() {
        return new MutableObjectFloatMap<>(0, 1, null);
    }

    @l
    public static final <K> ObjectFloatMap<K> objectFloatMap() {
        MutableObjectFloatMap<Object> mutableObjectFloatMap = EmptyObjectFloatMap;
        l0.n(mutableObjectFloatMap, "null cannot be cast to non-null type androidx.collection.ObjectFloatMap<K of androidx.collection.ObjectFloatMapKt.objectFloatMap>");
        return mutableObjectFloatMap;
    }

    @l
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k5, float f5) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k5, f5);
        return mutableObjectFloatMap;
    }

    @l
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k5, float f5) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k5, f5);
        return mutableObjectFloatMap;
    }

    @l
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k5, float f5, K k6, float f6) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k5, f5);
        mutableObjectFloatMap.set(k6, f6);
        return mutableObjectFloatMap;
    }

    @l
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k5, float f5, K k6, float f6) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k5, f5);
        mutableObjectFloatMap.set(k6, f6);
        return mutableObjectFloatMap;
    }

    @l
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k5, float f5, K k6, float f6, K k7, float f7) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k5, f5);
        mutableObjectFloatMap.set(k6, f6);
        mutableObjectFloatMap.set(k7, f7);
        return mutableObjectFloatMap;
    }

    @l
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k5, float f5, K k6, float f6, K k7, float f7) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k5, f5);
        mutableObjectFloatMap.set(k6, f6);
        mutableObjectFloatMap.set(k7, f7);
        return mutableObjectFloatMap;
    }

    @l
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k5, float f5, K k6, float f6, K k7, float f7, K k8, float f8) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k5, f5);
        mutableObjectFloatMap.set(k6, f6);
        mutableObjectFloatMap.set(k7, f7);
        mutableObjectFloatMap.set(k8, f8);
        return mutableObjectFloatMap;
    }

    @l
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k5, float f5, K k6, float f6, K k7, float f7, K k8, float f8) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k5, f5);
        mutableObjectFloatMap.set(k6, f6);
        mutableObjectFloatMap.set(k7, f7);
        mutableObjectFloatMap.set(k8, f8);
        return mutableObjectFloatMap;
    }

    @l
    public static final <K> ObjectFloatMap<K> objectFloatMapOf(K k5, float f5, K k6, float f6, K k7, float f7, K k8, float f8, K k9, float f9) {
        MutableObjectFloatMap mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
        mutableObjectFloatMap.set(k5, f5);
        mutableObjectFloatMap.set(k6, f6);
        mutableObjectFloatMap.set(k7, f7);
        mutableObjectFloatMap.set(k8, f8);
        mutableObjectFloatMap.set(k9, f9);
        return mutableObjectFloatMap;
    }

    @l
    public static final <K> MutableObjectFloatMap<K> mutableObjectFloatMapOf(K k5, float f5, K k6, float f6, K k7, float f7, K k8, float f8, K k9, float f9) {
        MutableObjectFloatMap<K> mutableObjectFloatMap = new MutableObjectFloatMap<>(0, 1, null);
        mutableObjectFloatMap.set(k5, f5);
        mutableObjectFloatMap.set(k6, f6);
        mutableObjectFloatMap.set(k7, f7);
        mutableObjectFloatMap.set(k8, f8);
        mutableObjectFloatMap.set(k9, f9);
        return mutableObjectFloatMap;
    }
}
