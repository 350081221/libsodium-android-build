package mirror.android.os.storage;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IStorageManager {
    public static Class<?> Class = RefClass.load((Class<?>) IStorageManager.class, "android.os.storage.IStorageManager");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> Class = RefClass.load((Class<?>) Stub.class, "android.os.storage.IStorageManager$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
