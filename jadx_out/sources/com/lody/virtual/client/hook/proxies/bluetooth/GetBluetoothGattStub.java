package com.lody.virtual.client.hook.proxies.bluetooth;

import android.os.IInterface;
import com.lody.virtual.client.hook.base.FixAttributionSourceMethodProxy;
import com.lody.virtual.client.hook.base.MethodInvocationProxy;
import com.lody.virtual.client.hook.base.MethodInvocationStub;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import com.lody.virtual.helper.compat.BuildCompat;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import mirror.android.bluetooth.IBluetooth;

/* loaded from: classes3.dex */
public class GetBluetoothGattStub extends MethodInvocationProxy<MethodInvocationStub<IInterface>> {
    public GetBluetoothGattStub(IInterface iInterface) {
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
        if (!BuildCompat.isS()) {
            addMethodProxy(new ReplaceLastPkgMethodProxy("startScan"));
            addMethodProxy(new ReplaceLastPkgMethodProxy("startScanForIntent"));
            addMethodProxy(new ReplaceLastPkgMethodProxy("stopScanForIntent"));
        } else {
            List<Method> attributionSourceMethod = MethodParameterUtils.getAttributionSourceMethod(IBluetooth.TYPE);
            if (attributionSourceMethod != null) {
                Iterator<Method> it = attributionSourceMethod.iterator();
                while (it.hasNext()) {
                    addMethodProxy(new FixAttributionSourceMethodProxy(it.next().getName()));
                }
            }
        }
    }
}
