package mirror.oem.vivo;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IPopupCameraManager {
    public static Class<?> TYPE = RefClass.load((Class<?>) IPopupCameraManager.class, "vivo.app.popupcamera.IPopupCameraManager");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "vivo.app.popupcamera.IPopupCameraManager$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
