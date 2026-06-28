package mirror.oem.vivo;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class ISuperResolutionManager {
    public static Class<?> TYPE = RefClass.load((Class<?>) ISuperResolutionManager.class, "vivo.app.superresolution.ISuperResolutionManager");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "vivo.app.superresolution.ISuperResolutionManager$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
