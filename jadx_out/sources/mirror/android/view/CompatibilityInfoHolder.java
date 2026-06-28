package mirror.android.view;

import mirror.MethodReflectParams;
import mirror.RefClass;
import mirror.RefMethod;

/* loaded from: classes4.dex */
public class CompatibilityInfoHolder {
    public static Class<?> Class = RefClass.load((Class<?>) CompatibilityInfoHolder.class, "android.view.CompatibilityInfoHolder");

    @MethodReflectParams({"android.content.res.CompatibilityInfo"})
    public static RefMethod<Void> set;
}
