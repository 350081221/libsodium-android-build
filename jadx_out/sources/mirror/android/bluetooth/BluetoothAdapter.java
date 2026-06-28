package mirror.android.bluetooth;

import android.bluetooth.IBluetoothManagerCallback;
import android.os.IInterface;
import mirror.RefClass;
import mirror.RefMethod;
import mirror.RefObject;
import mirror.RefStaticObject;

/* loaded from: classes4.dex */
public class BluetoothAdapter {
    public static Class<?> TYPE = RefClass.load((Class<?>) BluetoothAdapter.class, "android.bluetooth.BluetoothAdapter");
    public static RefObject<Object> mAttributionSource;
    public static RefObject<IInterface> mService;
    public static RefMethod<Void> registerOrUnregisterAdapterLocked;
    public static RefStaticObject<IBluetoothManagerCallback> sManagerCallback;
    public static RefStaticObject<android.bluetooth.IBluetooth> sService;
}
