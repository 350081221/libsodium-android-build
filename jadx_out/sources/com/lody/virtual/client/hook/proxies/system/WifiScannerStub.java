package com.lody.virtual.client.hook.proxies.system;

import android.net.wifi.IWifiScanner;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import java.util.ArrayList;
import mirror.android.net.wifi.WifiScanner;
import mirror.android.os.ServiceManager;

/* loaded from: classes3.dex */
public class WifiScannerStub extends BinderInvocationProxy {
    private static final String SERVICE_NAME = "wifiscanner";

    /* loaded from: classes3.dex */
    static class EmptyWifiScannerImpl extends IWifiScanner.Stub {
        private final Handler mHandler = new Handler(Looper.getMainLooper());

        EmptyWifiScannerImpl() {
        }

        @Override // android.net.wifi.IWifiScanner
        public Bundle getAvailableChannels(int i5) {
            Bundle bundle = new Bundle();
            bundle.putIntegerArrayList(WifiScanner.GET_AVAILABLE_CHANNELS_EXTRA.get(), new ArrayList<>(0));
            return bundle;
        }

        @Override // android.net.wifi.IWifiScanner
        public Messenger getMessenger() {
            return new Messenger(this.mHandler);
        }
    }

    public WifiScannerStub() {
        super(new EmptyWifiScannerImpl(), SERVICE_NAME);
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        if (ServiceManager.checkService.call(SERVICE_NAME) == null) {
            super.inject();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ResultStaticMethodProxy("startScan", null));
        addMethodProxy(new ResultStaticMethodProxy("startPnoScan", null));
        addMethodProxy(new ResultStaticMethodProxy("stopScan", null));
        addMethodProxy(new ResultStaticMethodProxy("stopPnoScan", null));
        addMethodProxy(new ResultStaticMethodProxy("registerScanListener", null));
        addMethodProxy(new ResultStaticMethodProxy("unregisterScanListener", null));
        addMethodProxy(new ResultStaticMethodProxy("startBackgroundScan", null));
        addMethodProxy(new ResultStaticMethodProxy("stopBackgroundScan", null));
        Boolean bool = Boolean.FALSE;
        addMethodProxy(new ResultStaticMethodProxy("getScanResults", bool));
        addMethodProxy(new ResultStaticMethodProxy("getSingleScanResults", new ArrayList()));
        addMethodProxy(new ResultStaticMethodProxy("isScanning", bool));
    }
}
