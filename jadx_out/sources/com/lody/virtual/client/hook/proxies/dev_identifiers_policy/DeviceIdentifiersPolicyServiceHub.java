package com.lody.virtual.client.hook.proxies.dev_identifiers_policy;

import android.annotation.TargetApi;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import mirror.android.os.IDeviceIdentifiersPolicyService;

@TargetApi(29)
/* loaded from: classes3.dex */
public class DeviceIdentifiersPolicyServiceHub extends BinderInvocationProxy {
    public DeviceIdentifiersPolicyServiceHub() {
        super(IDeviceIdentifiersPolicyService.Stub.asInterface, "device_identifiers");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ResultStaticMethodProxy("getSerialForPackage", "0123456789ABCDEF"));
    }
}
