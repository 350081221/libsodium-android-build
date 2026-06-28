package mirror.com.android.internal.os;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IVibratorManagerService {
    public static Class<?> TYPE = RefClass.load((Class<?>) IVibratorManagerService.class, "android.os.IVibratorManagerService");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.os.IVibratorManagerService$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
