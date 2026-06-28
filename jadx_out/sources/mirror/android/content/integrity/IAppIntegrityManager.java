package mirror.android.content.integrity;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IAppIntegrityManager {
    public static Class<?> TYPE = RefClass.load((Class<?>) IAppIntegrityManager.class, "android.content.integrity.IAppIntegrityManager");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.content.integrity.IAppIntegrityManager$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
