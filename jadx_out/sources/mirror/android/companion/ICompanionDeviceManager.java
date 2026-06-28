package mirror.android.companion;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class ICompanionDeviceManager {
    public static Class<?> TYPE = RefClass.load((Class<?>) ICompanionDeviceManager.class, "android.companion.ICompanionDeviceManager");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.companion.ICompanionDeviceManager$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
