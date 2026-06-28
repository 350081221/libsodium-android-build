package mirror.android.app.admin;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IDevicePolicyManager {
    public static Class<?> TYPE = RefClass.load((Class<?>) IDevicePolicyManager.class, "android.app.admin.IDevicePolicyManager");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.app.admin.IDevicePolicyManager$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
