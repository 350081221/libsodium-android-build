package com.lody.virtual.client.hook.proxies.companion;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgAndLastUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstCallingPkgAndFirstUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastCallingPkgAndLastUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import mirror.android.companion.ICompanionDeviceManager;

/* loaded from: classes3.dex */
public class CompanionDeviceManagerStub extends BinderInvocationProxy {
    public CompanionDeviceManagerStub() {
        super(ICompanionDeviceManager.Stub.asInterface, "companiondevice");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceLastCallingPkgAndLastUserIdMethodProxy("associate"));
        addMethodProxy(new ReplaceLastCallingPkgAndLastUserIdMethodProxy("getAssociations"));
        addMethodProxy(new ReplaceLastUserIdMethodProxy("getAllAssociationsForUser"));
        addMethodProxy(new ReplaceLastCallingPkgAndLastUserIdMethodProxy("legacyDisassociate"));
        addMethodProxy(new ResultStaticMethodProxy("hasNotificationAccess", Boolean.FALSE));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("isDeviceAssociatedForWifiConnection"));
        addMethodProxy(new ReplaceLastCallingPkgAndLastUserIdMethodProxy("registerDevicePresenceListenerService"));
        addMethodProxy(new ReplaceLastCallingPkgAndLastUserIdMethodProxy("unregisterDevicePresenceListenerService"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("canPairWithoutPrompt"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("createAssociation"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("addOnAssociationsChangedListener"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("removeOnAssociationsChangedListener"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("buildPermissionTransferUserConsentIntent"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("startSystemDataTransfer"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("attachSystemDataTransport"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("detachSystemDataTransport"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("isCompanionApplicationBound"));
        addMethodProxy(new ReplaceFirstCallingPkgAndFirstUserIdMethodProxy("buildAssociationCancellationIntent"));
    }
}
