package mirror.android.content;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Log;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefMethod;
import mirror.RefObject;

/* loaded from: classes4.dex */
public class AttributionSource {
    private static final String TAG = "AttributionSource";
    public static Class<?> TYPE = RefClass.load((Class<?>) AttributionSource.class, "android.content.AttributionSource");
    public static Class<?> TYPE_COMP = RefClass.load((Class<?>) AttributionSource.class, "android.content.AttributionSource$cg");

    @MethodParams({Object.class})
    public static RefMethod<Boolean> equals;
    public static RefMethod<String> getAttributionTag;
    public static RefMethod<Object> getNext;
    public static RefMethod<String> getPackageName;
    public static RefMethod<IBinder> getToken;
    public static RefObject<Object> mAttributionSourceState;

    @MethodParams({Binder.class})
    public static RefMethod<Parcelable> withToken;

    public static boolean equals(Object obj, Object obj2) {
        RefMethod<Boolean> refMethod = equals;
        if (refMethod == null) {
            return false;
        }
        return refMethod.call(refMethod, obj2).booleanValue();
    }

    public static String getAttributionTag(Object obj) {
        RefMethod<String> refMethod = getAttributionTag;
        if (refMethod != null) {
            return refMethod.call(obj, new Object[0]);
        }
        return null;
    }

    public static String getPackageName(Object obj) {
        RefMethod<String> refMethod = getPackageName;
        if (refMethod != null) {
            return refMethod.call(obj, new Object[0]);
        }
        return null;
    }

    public static IBinder getToken(Object obj) {
        RefMethod<IBinder> refMethod = getToken;
        if (refMethod != null) {
            return refMethod.call(obj, new Object[0]);
        }
        return null;
    }

    public static void mAttributionSourceState(Object obj, Object obj2) {
        RefObject<Object> refObject = mAttributionSourceState;
        if (refObject != null) {
            refObject.set(obj, obj2);
        }
    }

    public static Parcelable newInstance(Object obj) {
        Parcelable withToken2;
        Object mAttributionSourceState2;
        if (obj != null && (withToken2 = withToken(obj, null)) != null && (mAttributionSourceState2 = mAttributionSourceState(withToken2)) != null) {
            AttributionSourceState.token(mAttributionSourceState2, getToken(obj));
            Object mAttributionSourceState3 = mAttributionSourceState(obj);
            if (mAttributionSourceState3 != null) {
                AttributionSourceState.next(mAttributionSourceState2, AttributionSourceState.next(mAttributionSourceState3));
            }
            return withToken2;
        }
        Log.w(TAG, "newInstance amphiable failed,return null");
        return null;
    }

    public static Parcelable withToken(Object obj, Binder binder) {
        RefMethod<Parcelable> refMethod = withToken;
        if (refMethod == null) {
            return null;
        }
        return refMethod.call(obj, binder);
    }

    public static Object mAttributionSourceState(Object obj) {
        RefObject<Object> refObject = mAttributionSourceState;
        if (refObject != null) {
            return refObject.get(obj);
        }
        return null;
    }
}
