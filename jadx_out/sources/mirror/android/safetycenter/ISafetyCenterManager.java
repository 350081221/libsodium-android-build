package mirror.android.safetycenter;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;
import mirror.android.permission.IPermissionChecker;

/* loaded from: classes4.dex */
public class ISafetyCenterManager {
    public static Class<?> TYPE = RefClass.load((Class<?>) IPermissionChecker.class, "android.safetycenter.ISafetyCenterManager");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.safetycenter.ISafetyCenterManager$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
