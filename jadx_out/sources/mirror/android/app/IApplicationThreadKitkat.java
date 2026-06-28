package mirror.android.app;

import android.content.Intent;
import android.content.pm.ServiceInfo;
import android.os.IBinder;
import mirror.MethodParams;
import mirror.MethodReflectParams;
import mirror.RefClass;
import mirror.RefMethod;
import mirror.android.content.res.CompatibilityInfo;

/* loaded from: classes4.dex */
public class IApplicationThreadKitkat {
    public static Class<?> TYPE = RefClass.load((Class<?>) IApplicationThreadKitkat.class, "android.app.IApplicationThread");

    @MethodParams({IBinder.class, Intent.class, boolean.class, int.class})
    public static RefMethod<Void> scheduleBindService;

    @MethodParams({IBinder.class, ServiceInfo.class, CompatibilityInfo.class, int.class})
    public static RefMethod<Void> scheduleCreateService;

    @MethodReflectParams({"android.content.Intent", "android.content.pm.ActivityInfo", "android.content.res.CompatibilityInfo", com.swift.sandhook.annotation.MethodReflectParams.INT, "java.lang.String", "android.os.Bundle", "boolean", com.swift.sandhook.annotation.MethodReflectParams.INT, com.swift.sandhook.annotation.MethodReflectParams.INT})
    public static RefMethod<Void> scheduleReceiver;
}
