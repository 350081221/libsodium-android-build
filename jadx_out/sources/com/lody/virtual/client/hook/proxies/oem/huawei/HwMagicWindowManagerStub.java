package com.lody.virtual.client.hook.proxies.oem.huawei;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import java.util.HashMap;
import mirror.oem.huawei.IHwMagicWindow;

/* loaded from: classes3.dex */
public class HwMagicWindowManagerStub extends BinderInvocationProxy {
    private static final String SERVER_NAME = "HwMagicWindowService";

    public HwMagicWindowManagerStub() {
        super(IHwMagicWindow.Stub.TYPE, SERVER_NAME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        Boolean bool = Boolean.FALSE;
        addMethodProxy(new ResultStaticMethodProxy("getAppEnabledForDevice", bool));
        addMethodProxy(new ResultStaticMethodProxy("getHwMagicWinEnabled", bool));
        addMethodProxy(new ResultStaticMethodProxy("getHwMagicWinEnabledApps", new HashMap()));
        addMethodProxy(new ResultStaticMethodProxy("isSupportMagicWindowSink", bool));
        addMethodProxy(new ResultStaticMethodProxy("isSupportMagicWindowSink", bool));
    }
}
