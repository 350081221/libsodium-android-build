package mirror.huawei.android.app;

import android.content.pm.PackageManager;
import mirror.RefClass;
import mirror.RefMethod;
import mirror.RefObject;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class HwApiCacheManagerEx {
    public static Class<?> TYPE = RefClass.load((Class<?>) HwApiCacheManagerEx.class, "huawei.android.app.HwApiCacheMangerEx");
    public static RefMethod<Object> disableCache;
    public static RefStaticMethod<Object> getDefault;
    public static RefObject<PackageManager> mPkg;

    public static void disableCache(Object obj) {
        RefMethod<Object> refMethod = disableCache;
        if (refMethod != null) {
            refMethod.call(obj, new Object[0]);
        }
    }
}
