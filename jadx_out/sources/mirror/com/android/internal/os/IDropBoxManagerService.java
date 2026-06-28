package mirror.com.android.internal.os;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IDropBoxManagerService {
    public static Class<?> TYPE = RefClass.load((Class<?>) IDropBoxManagerService.class, "com.android.internal.os.IDropBoxManagerService");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "com.android.internal.os.IDropBoxManagerService$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
