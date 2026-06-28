package com.lody.virtual.client.hook.proxies.biometrics;

import android.os.IInterface;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgAndFirstUidMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastCallingPkgAndLastUserIdMethodProxy;
import com.lody.virtual.helper.utils.VLog;
import mirror.RefStaticMethod;
import mirror.com.android.server.biometrics.IAuthService;

/* loaded from: classes3.dex */
public class AuthServiceStub extends BinderInvocationProxy {
    private static final String SERVER_NAME = "auth";
    private static final RefStaticMethod<IInterface> asInterface = IAuthService.Stub.asInterface;

    public AuthServiceStub() {
        super(asInterface, "auth");
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        super.inject();
        VLog.d(VLog.TAG_DEFAULT, "AuthServiceStub.inject", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceFirstPkgAndFirstUidMethodProxy("authenticate"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("cancelAuthentication"));
        addMethodProxy(new ReplaceFirstPkgAndFirstUidMethodProxy("canAuthenticate"));
        addMethodProxy(new ReplaceFirstPkgAndFirstUidMethodProxy("hasEnrolledBiometrics"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("invalidateAuthenticatorIds"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("getAuthenticatorIds"));
        addMethodProxy(new ReplaceLastCallingPkgAndLastUserIdMethodProxy("resetLockoutTimeBound"));
        addMethodProxy(new ReplaceFirstUserIdMethodProxy("resetLockout"));
        addMethodProxy(new ReplaceFirstPkgAndFirstUidMethodProxy("getButtonLabel"));
        addMethodProxy(new ReplaceFirstPkgAndFirstUidMethodProxy("getPromptMessage"));
        addMethodProxy(new ReplaceFirstPkgAndFirstUidMethodProxy("getSettingName"));
    }
}
