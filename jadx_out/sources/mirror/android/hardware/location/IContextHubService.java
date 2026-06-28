package mirror.android.hardware.location;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IContextHubService {
    public static Class<?> TYPE = RefClass.load((Class<?>) IContextHubService.class, "android.hardware.location.IContextHubService");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.hardware.location.IContextHubService$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
