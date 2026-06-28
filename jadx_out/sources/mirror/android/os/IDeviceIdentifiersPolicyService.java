package mirror.android.os;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IDeviceIdentifiersPolicyService {
    public static Class<?> TYPE = RefClass.load((Class<?>) IDeviceIdentifiersPolicyService.class, "android.os.IDeviceIdentifiersPolicyService");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.os.IDeviceIdentifiersPolicyService$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
