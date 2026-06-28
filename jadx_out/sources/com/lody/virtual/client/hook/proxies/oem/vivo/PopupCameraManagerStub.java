package com.lody.virtual.client.hook.proxies.oem.vivo;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import mirror.oem.vivo.IPopupCameraManager;

/* loaded from: classes3.dex */
public class PopupCameraManagerStub extends BinderInvocationProxy {
    private static final String SERVER_NAME = "popup_camera_service";

    public PopupCameraManagerStub() {
        super(IPopupCameraManager.Stub.TYPE, SERVER_NAME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceLastPkgMethodProxy("notifyCameraStatus"));
    }
}
