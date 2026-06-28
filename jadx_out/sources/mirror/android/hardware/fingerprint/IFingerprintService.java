package mirror.android.hardware.fingerprint;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IFingerprintService {
    public static Class<?> TYPE = RefClass.load((Class<?>) IFingerprintService.class, "android.hardware.fingerprint.IFingerprintService");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.hardware.fingerprint.IFingerprintService$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
