package mirror.android.bluetooth;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IBluetoothManager {
    public static Class<?> TYPE = RefClass.load((Class<?>) IBluetoothManager.class, "android.bluetooth.IBluetoothManager");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.bluetooth.IBluetoothManager$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
