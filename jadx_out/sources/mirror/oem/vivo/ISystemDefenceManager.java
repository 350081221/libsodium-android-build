package mirror.oem.vivo;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class ISystemDefenceManager {
    public static Class<?> TYPE = RefClass.load((Class<?>) ISystemDefenceManager.class, "vivo.app.systemdefence.ISystemDefenceManager");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "vivo.app.systemdefence.ISystemDefenceManager$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
