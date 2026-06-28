package mirror.android.service.persistentdata;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IPersistentDataBlockService {
    public static Class<?> TYPE = RefClass.load((Class<?>) IPersistentDataBlockService.class, "android.service.persistentdata.IPersistentDataBlockService");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.service.persistentdata.IPersistentDataBlockService$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
