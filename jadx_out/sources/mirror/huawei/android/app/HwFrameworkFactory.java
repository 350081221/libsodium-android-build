package mirror.huawei.android.app;

import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class HwFrameworkFactory {
    public static Class<?> TYPE = RefClass.load((Class<?>) HwFrameworkFactory.class, "android.common.HwFrameworkFactory");
    public static RefStaticMethod<Object> getHwApiCacheManagerEx;

    public static Object getHwApiCacheManagerEx() {
        RefStaticMethod<Object> refStaticMethod = getHwApiCacheManagerEx;
        if (refStaticMethod != null) {
            return refStaticMethod.call(new Object[0]);
        }
        return null;
    }
}
