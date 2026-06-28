package com.lody.virtual.client.hook.proxies.bluetooth;

import android.bluetooth.IBluetooth;
import android.text.TextUtils;
import com.lody.virtual.client.hook.base.FixAttributionSourceMethodProxy;
import com.lody.virtual.client.hook.base.MethodInvocationProxy;
import com.lody.virtual.client.hook.base.MethodInvocationStub;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import com.lody.virtual.helper.compat.BuildCompat;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class RegisterAdapterStub extends MethodInvocationProxy<MethodInvocationStub<IBluetooth>> {

    /* loaded from: classes3.dex */
    public static class getAddress extends ReplaceLastPkgMethodProxy {
        public getAddress() {
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
            return super.call(obj, method, objArr);
        }
    }

    public RegisterAdapterStub(IBluetooth iBluetooth) {
        super(new MethodInvocationStub(iBluetooth));
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
        List<Method> attributionSourceMethod;
        super.onBindMethods();
        addMethodProxy(new getAddress());
        if (BuildCompat.isS() && (attributionSourceMethod = MethodParameterUtils.getAttributionSourceMethod(IBluetooth.class)) != null) {
            Iterator<Method> it = attributionSourceMethod.iterator();
            while (it.hasNext()) {
                addMethodProxy(new FixAttributionSourceMethodProxy(it.next().getName()));
            }
        }
    }
}
