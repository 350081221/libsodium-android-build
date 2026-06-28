package com.lody.virtual.client.hook.proxies.fingerprint;

import android.annotation.TargetApi;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import mirror.android.hardware.fingerprint.IFingerprintService;

@TargetApi(23)
/* loaded from: classes3.dex */
public class FingerprintManagerStub extends BinderInvocationProxy {
    public FingerprintManagerStub() {
        super(IFingerprintService.Stub.asInterface, "fingerprint");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        addMethodProxy(new ReplaceLastPkgMethodProxy("isHardwareDetected"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("hasEnrolledFingerprints"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("authenticate"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("cancelAuthentication"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getEnrolledFingerprints"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getAuthenticatorId"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("getSensorPropertiesInternal"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("getSensorProperties"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("authenticate"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("detectFingerprint"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("prepareForAuthentication"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("cancelFingerprintDetect"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("cancelAuthenticationFromService"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("enroll"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("remove"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("removeAll"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("getEnrolledFingerprints"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("isHardwareDetectedDeprecated"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("generateChallenge"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("revokeChallenge"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("hasEnrolledFingerprintsDeprecated"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("resetLockout"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("addLockoutResetCallback"));
    }
}
