package mirror.android.app;

import android.content.Context;
import android.content.pm.PackageManager;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefMethod;
import mirror.RefObject;

/* loaded from: classes4.dex */
public class ContextImpl {
    public static Class<?> TYPE = RefClass.load((Class<?>) ContextImpl.class, "android.app.ContextImpl");
    public static RefMethod<Object> getAttributionSource;
    public static RefMethod<Context> getReceiverRestrictedContext;
    public static RefObject<Object> mAttributionSource;

    @MethodParams({Context.class})
    public static RefObject<String> mBasePackageName;
    public static RefObject<Object> mPackageInfo;
    public static RefObject<PackageManager> mPackageManager;

    @MethodParams({Context.class})
    public static RefMethod<Void> setOuterContext;

    public static Object getAttributionSource(Object obj) {
        RefMethod<Object> refMethod = getAttributionSource;
        if (refMethod != null) {
            return refMethod.call(obj, new Object[0]);
        }
        return null;
    }

    public static Object mAttributionSource(Object obj) {
        RefObject<Object> refObject = mAttributionSource;
        if (refObject != null) {
            return refObject.get(obj);
        }
        return null;
    }

    public static void mAttributionSource(Object obj, Object obj2) {
        RefObject<Object> refObject = mAttributionSource;
        if (refObject != null) {
            refObject.set(obj, obj2);
        }
    }
}
