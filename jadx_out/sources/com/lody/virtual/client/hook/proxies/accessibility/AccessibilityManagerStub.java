package com.lody.virtual.client.hook.proxies.accessibility;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastCallingPkgAndLastUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import mirror.android.view.accessibility.IAccessibilityManager;

/* loaded from: classes3.dex */
public class AccessibilityManagerStub extends BinderInvocationProxy {
    public AccessibilityManagerStub() {
        super(IAccessibilityManager.Stub.TYPE, "accessibility");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceLastUserIdMethodProxy("interrupt"));
        addMethodProxy(new ReplaceLastUserIdMethodProxy("sendAccessibilityEvent"));
        addMethodProxy(new ReplaceLastUserIdMethodProxy("addClient"));
        addMethodProxy(new ReplaceLastUserIdMethodProxy("removeClient"));
        addMethodProxy(new ReplaceLastUserIdMethodProxy("getInstalledAccessibilityServiceList"));
        addMethodProxy(new ReplaceLastUserIdMethodProxy("getEnabledAccessibilityServiceList"));
        addMethodProxy(new ReplaceLastUserIdMethodProxy("getWindowToken"));
        addMethodProxy(new ReplaceLastCallingPkgAndLastUserIdMethodProxy("addAccessibilityInteractionConnection"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("registerUiTestAutomationService"));
        addMethodProxy(new ReplaceLastUserIdMethodProxy("getWindowToken"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("setSystemAudioCaptioningEnabled"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("isSystemAudioCaptioningUiEnabled"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("setSystemAudioCaptioningUiEnabled"));
        addMethodProxy(new ReplaceLastUserIdMethodProxy("setAccessibilityWindowAttributes"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("startFlashNotificationSequence"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("stopFlashNotificationSequence"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("startFlashNotificationEvent"));
        addMethodProxy(new ResultStaticMethodProxy("isAccessibilityTargetAllowed", Boolean.FALSE));
        addMethodProxy(new ResultStaticMethodProxy("sendRestrictedDialogIntent", Boolean.TRUE));
    }
}
