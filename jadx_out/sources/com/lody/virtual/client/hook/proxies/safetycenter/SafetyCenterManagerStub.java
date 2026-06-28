package com.lody.virtual.client.hook.proxies.safetycenter;

import android.os.IInterface;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import com.lody.virtual.helper.utils.VLog;
import mirror.android.safetycenter.ISafetyCenterManager;
import mirror.android.safetycenter.SafetyCenterManager;

/* loaded from: classes3.dex */
public class SafetyCenterManagerStub extends BinderInvocationProxy {
    public SafetyCenterManagerStub() {
        super(ISafetyCenterManager.Stub.asInterface, "safety_center");
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        super.inject();
        try {
            if (SafetyCenterManager.TYPE != null) {
                IInterface proxyInterface = getInvocationStub().getProxyInterface();
                Object systemService = getContext().getSystemService(SafetyCenterManager.TYPE);
                if (systemService != null) {
                    SafetyCenterManager.mService.set(systemService, proxyInterface);
                }
            }
        } catch (Throwable th) {
            VLog.e(VLog.TAG_DEFAULT, "SafetyCenterManagerStub inject error.", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ResultStaticMethodProxy("isSafetyCenterEnabled", Boolean.TRUE));
        addMethodProxy(new ResultStaticMethodProxy("setSafetySourceData", null));
        addMethodProxy(new ResultStaticMethodProxy("getSafetySourceData", null));
        addMethodProxy(new ResultStaticMethodProxy("reportSafetySourceError", null));
        addMethodProxy(new ResultStaticMethodProxy("refreshSafetySources", null));
        addMethodProxy(new ResultStaticMethodProxy("refreshSpecificSafetySources", null));
        addMethodProxy(new ResultStaticMethodProxy("getSafetyCenterData", null));
        addMethodProxy(new ResultStaticMethodProxy("addOnSafetyCenterDataChangedListener", null));
        addMethodProxy(new ResultStaticMethodProxy("removeOnSafetyCenterDataChangedListener", null));
        addMethodProxy(new ResultStaticMethodProxy("dismissSafetyCenterIssue", null));
        addMethodProxy(new ResultStaticMethodProxy("executeSafetyCenterIssueAction", null));
    }
}
