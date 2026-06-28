package com.lody.virtual.client.hook.proxies.device;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import mirror.android.os.IDeviceIdleController;

/* loaded from: classes3.dex */
public class DeviceIdleControllerStub extends BinderInvocationProxy {
    public DeviceIdleControllerStub() {
        super(IDeviceIdleController.Stub.asInterface, "deviceidle");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceCallingPkgMethodProxy("addPowerSaveWhitelistApp"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("removePowerSaveWhitelistApp"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("removeSystemPowerWhitelistApp"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("restoreSystemPowerWhitelistApp"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isPowerSaveWhitelistExceptIdleApp"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isPowerSaveWhitelistApp"));
    }
}
