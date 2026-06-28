package mirror.com.android.server.biometrics;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IAuthService {
    public static Class<?> TYPE = RefClass.load((Class<?>) IAuthService.class, "android.hardware.biometrics.IAuthService");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.hardware.biometrics.IAuthService$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
