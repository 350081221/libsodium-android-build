package com.lody.virtual.client.hook.proxies.bluetooth;

import a1.c;
import android.bluetooth.BluetoothManager;
import android.bluetooth.IBluetooth;
import android.bluetooth.IBluetoothManagerCallback;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.text.TextUtils;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.fixer.ContextFixer;
import com.lody.virtual.client.hook.annotations.LogInvocation;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.BinderInvocationStub;
import com.lody.virtual.client.hook.base.FixAttributionSourceMethodProxy;
import com.lody.virtual.client.hook.base.MethodInvocationProxy;
import com.lody.virtual.client.hook.base.MethodInvocationStub;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import com.lody.virtual.helper.compat.BuildCompat;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import mirror.RefStaticMethod;
import mirror.android.bluetooth.BluetoothAdapter;
import mirror.android.bluetooth.IBluetoothHeadset;
import mirror.android.bluetooth.IBluetoothManager;

@LogInvocation
/* loaded from: classes3.dex */
public class BluetoothStub extends BinderInvocationProxy {
    private static final String SERVER_NAME = "bluetooth_manager";
    private static final RefStaticMethod<IInterface> asInterface = IBluetoothManager.Stub.asInterface;

    /* loaded from: classes3.dex */
    private static class GetAddress extends ReplaceLastPkgMethodProxy {
        public GetAddress() {
            super("getAddress");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (MethodProxy.getDeviceConfig().enable) {
                String str = MethodProxy.getDeviceConfig().bluetoothMac;
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
            if (BuildCompat.isS()) {
                MethodParameterUtils.fixAttributionSource(objArr);
            }
            try {
                return super.call(obj, method, objArr);
            } catch (Throwable unused) {
                return c.f92a;
            }
        }
    }

    /* loaded from: classes3.dex */
    private static class IBluetoothHeadsetStub extends BinderInvocationStub {
        public IBluetoothHeadsetStub(IInterface iInterface) {
            super(iInterface);
            List<Method> attributionSourceMethod = MethodParameterUtils.getAttributionSourceMethod(IBluetooth.class);
            if (attributionSourceMethod != null) {
                Iterator<Method> it = attributionSourceMethod.iterator();
                while (it.hasNext()) {
                    addMethodProxy(new FixAttributionSourceMethodProxy(it.next().getName()));
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    private static class IBluetoothProfileServiceConnectionStub extends MethodInvocationProxy<MethodInvocationStub<IInterface>> {
        public IBluetoothProfileServiceConnectionStub(IInterface iInterface) {
            super(new MethodInvocationStub(iInterface));
        }

        @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
        public void inject() {
        }

        @Override // com.lody.virtual.client.interfaces.IInjector
        public boolean isEnvBad() {
            return getInvocationStub().getProxyInterface() != null;
        }

        @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
        public void onBindMethods() {
            super.onBindMethods();
            addMethodProxy(new StaticMethodProxy("onServiceConnected") { // from class: com.lody.virtual.client.hook.proxies.bluetooth.BluetoothStub.IBluetoothProfileServiceConnectionStub.1
                @Override // com.lody.virtual.client.hook.base.MethodProxy
                public boolean beforeCall(Object obj, Method method, Object... objArr) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof IBinder) {
                        objArr[1] = new IBluetoothHeadsetStub(IBluetoothHeadset.Stub.asInterface.call((IBinder) obj2));
                    }
                    return super.beforeCall(obj, method, objArr);
                }
            });
        }
    }

    public BluetoothStub() {
        super(asInterface, SERVER_NAME);
    }

    private void hookBluetoothAdapter() {
        try {
            IBluetooth iBluetooth = BluetoothAdapter.sService.get();
            if (iBluetooth != null) {
                BluetoothAdapter.sService.set(new RegisterAdapterStub(iBluetooth).getInvocationStub().getProxyInterface());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        try {
            final IBluetoothManagerCallback iBluetoothManagerCallback = BluetoothAdapter.sManagerCallback.get();
            if (iBluetoothManagerCallback != null) {
                BluetoothAdapter.sManagerCallback.set(new IBluetoothManagerCallback.Stub() { // from class: com.lody.virtual.client.hook.proxies.bluetooth.BluetoothStub.4
                    @Override // android.bluetooth.IBluetoothManagerCallback
                    public void onBluetoothServiceDown() throws RemoteException {
                        iBluetoothManagerCallback.onBluetoothServiceDown();
                    }

                    @Override // android.bluetooth.IBluetoothManagerCallback
                    public void onBluetoothServiceUp(IBluetooth iBluetooth2) throws RemoteException {
                        if (iBluetooth2 != null) {
                            iBluetooth2 = new RegisterAdapterStub(iBluetooth2).getInvocationStub().getProxyInterface();
                        }
                        iBluetoothManagerCallback.onBluetoothServiceUp(iBluetooth2);
                    }

                    @Override // android.bluetooth.IBluetoothManagerCallback
                    public void onBrEdrDown() throws RemoteException {
                        iBluetoothManagerCallback.onBrEdrDown();
                    }
                });
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        List<Method> attributionSourceMethod;
        super.onBindMethods();
        addMethodProxy(new GetAddress());
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getSystemConfigEnabledProfilesForPackage"));
        if (BuildCompat.isS() && (attributionSourceMethod = MethodParameterUtils.getAttributionSourceMethod(IBluetooth.class)) != null) {
            Iterator<Method> it = attributionSourceMethod.iterator();
            while (it.hasNext()) {
                addMethodProxy(new FixAttributionSourceMethodProxy(it.next().getName()));
            }
        }
        if (BuildCompat.isS() && BluetoothAdapter.sService != null) {
            hookBluetoothAdapter();
            try {
                android.bluetooth.BluetoothAdapter adapter = ((BluetoothManager) VirtualCore.get().getContext().getSystemService("bluetooth")).getAdapter();
                if (adapter != null) {
                    ContextFixer.fixAttributionSource(BluetoothAdapter.mAttributionSource.get(adapter), VirtualCore.get().myUid());
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        addMethodProxy(new StaticMethodProxy("registerAdapter") { // from class: com.lody.virtual.client.hook.proxies.bluetooth.BluetoothStub.1
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                IBluetooth iBluetooth = (IBluetooth) super.call(obj, method, objArr);
                if (iBluetooth != null) {
                    return new RegisterAdapterStub(iBluetooth).getInvocationStub().getProxyInterface();
                }
                return null;
            }
        });
        addMethodProxy(new StaticMethodProxy("getBluetoothGatt") { // from class: com.lody.virtual.client.hook.proxies.bluetooth.BluetoothStub.2
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                IInterface iInterface = (IInterface) super.call(obj, method, objArr);
                if (iInterface != null) {
                    return new GetBluetoothGattStub(iInterface).getInvocationStub().getProxyInterface();
                }
                return null;
            }
        });
        addMethodProxy(new StaticMethodProxy("bindBluetoothProfileService") { // from class: com.lody.virtual.client.hook.proxies.bluetooth.BluetoothStub.3
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public boolean beforeCall(Object obj, Method method, Object... objArr) {
                Object obj2 = objArr[0];
                if ((obj2 instanceof Integer) && ((Integer) obj2).intValue() == 1) {
                    Object obj3 = objArr[1];
                    if (obj3 instanceof IInterface) {
                        objArr[1] = new IBluetoothProfileServiceConnectionStub((IInterface) obj3).getInvocationStub().getProxyInterface();
                    }
                }
                return super.beforeCall(obj, method, objArr);
            }
        });
        addMethodProxy(new ReplaceLastPkgMethodProxy("updateBleAppCount"));
    }
}
