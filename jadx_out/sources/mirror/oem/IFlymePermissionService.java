package mirror.oem;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IFlymePermissionService {
    public static Class<?> TYPE = RefClass.load((Class<?>) IFlymePermissionService.class, "meizu.security.IFlymePermissionService");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "meizu.security.IFlymePermissionService$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
