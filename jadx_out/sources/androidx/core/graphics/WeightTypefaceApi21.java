package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.LongSparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(21)
@SuppressLint({"SoonBlockedPrivateApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
final class WeightTypefaceApi21 {
    private static final String NATIVE_CREATE_FROM_TYPEFACE_METHOD = "nativeCreateFromTypeface";
    private static final String NATIVE_CREATE_WEIGHT_ALIAS_METHOD = "nativeCreateWeightAlias";
    private static final String NATIVE_INSTANCE_FIELD = "native_instance";
    private static final String TAG = "WeightTypeface";
    private static final Constructor<Typeface> sConstructor;
    private static final Method sNativeCreateFromTypeface;
    private static final Method sNativeCreateWeightAlias;
    private static final Field sNativeInstance;
    private static final Object sWeightCacheLock;

    @GuardedBy("sWeightCacheLock")
    private static final LongSparseArray<SparseArray<Typeface>> sWeightTypefaceCache;

    static {
        Field field;
        Constructor<Typeface> constructor;
        Method method;
        Method method2;
        try {
            field = Typeface.class.getDeclaredField(NATIVE_INSTANCE_FIELD);
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            method = Typeface.class.getDeclaredMethod(NATIVE_CREATE_FROM_TYPEFACE_METHOD, cls, cls2);
            method.setAccessible(true);
            method2 = Typeface.class.getDeclaredMethod(NATIVE_CREATE_WEIGHT_ALIAS_METHOD, cls, cls2);
            method2.setAccessible(true);
            constructor = Typeface.class.getDeclaredConstructor(cls);
            constructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException e5) {
            Log.e(TAG, e5.getClass().getName(), e5);
            field = null;
            constructor = null;
            method = null;
            method2 = null;
        }
        sNativeInstance = field;
        sNativeCreateFromTypeface = method;
        sNativeCreateWeightAlias = method2;
        sConstructor = constructor;
        sWeightTypefaceCache = new LongSparseArray<>(3);
        sWeightCacheLock = new Object();
    }

    private WeightTypefaceApi21() {
    }

    @Nullable
    private static Typeface create(long j5) {
        try {
            return sConstructor.newInstance(Long.valueOf(j5));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static Typeface createWeightStyle(@NonNull Typeface typeface, int i5, boolean z4) {
        Typeface create;
        if (!isPrivateApiAvailable()) {
            return null;
        }
        int i6 = (i5 << 1) | (z4 ? 1 : 0);
        synchronized (sWeightCacheLock) {
            long nativeInstance = getNativeInstance(typeface);
            LongSparseArray<SparseArray<Typeface>> longSparseArray = sWeightTypefaceCache;
            SparseArray<Typeface> sparseArray = longSparseArray.get(nativeInstance);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>(4);
                longSparseArray.put(nativeInstance, sparseArray);
            } else {
                Typeface typeface2 = sparseArray.get(i6);
                if (typeface2 != null) {
                    return typeface2;
                }
            }
            if (z4 == typeface.isItalic()) {
                create = create(nativeCreateWeightAlias(nativeInstance, i5));
            } else {
                create = create(nativeCreateFromTypefaceWithExactStyle(nativeInstance, i5, z4));
            }
            sparseArray.put(i6, create);
            return create;
        }
    }

    private static long getNativeInstance(@NonNull Typeface typeface) {
        try {
            return sNativeInstance.getLong(typeface);
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        }
    }

    private static boolean isPrivateApiAvailable() {
        return sNativeInstance != null;
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static long nativeCreateFromTypefaceWithExactStyle(long j5, int i5, boolean z4) {
        int i6;
        if (z4) {
            i6 = 2;
        } else {
            i6 = 0;
        }
        try {
            return ((Long) sNativeCreateWeightAlias.invoke(null, Long.valueOf(((Long) sNativeCreateFromTypeface.invoke(null, Long.valueOf(j5), Integer.valueOf(i6))).longValue()), Integer.valueOf(i5))).longValue();
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    private static long nativeCreateWeightAlias(long j5, int i5) {
        try {
            return ((Long) sNativeCreateWeightAlias.invoke(null, Long.valueOf(j5), Integer.valueOf(i5))).longValue();
        } catch (IllegalAccessException e5) {
            throw new RuntimeException(e5);
        } catch (InvocationTargetException e6) {
            throw new RuntimeException(e6);
        }
    }
}
