package mirror.android.app;

import mirror.MethodReflectParams;
import mirror.RefClass;
import mirror.RefMethod;

/* loaded from: classes4.dex */
public class IApplicationThreadJBMR1 {
    public static Class<?> TYPE = RefClass.load((Class<?>) IApplicationThreadJBMR1.class, "android.app.IApplicationThread");

    @MethodReflectParams({"android.content.Intent", "android.content.pm.ActivityInfo", "android.content.res.CompatibilityInfo", com.swift.sandhook.annotation.MethodReflectParams.INT, "java.lang.String", "android.os.Bundle", "boolean", com.swift.sandhook.annotation.MethodReflectParams.INT})
    public static RefMethod<Void> scheduleReceiver;
}
