package mirror.com.android.internal.textservice;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class ITextServicesManager {
    public static Class<?> TYPE = RefClass.load((Class<?>) ITextServicesManager.class, "com.android.internal.textservice.ITextServicesManager");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "com.android.internal.textservice.ITextServicesManager$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
