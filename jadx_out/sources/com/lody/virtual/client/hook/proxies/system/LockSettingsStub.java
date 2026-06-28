package com.lody.virtual.client.hook.proxies.system;

import android.app.PendingIntent;
import android.security.keystore.recovery.KeyChainSnapshot;
import com.android.internal.widget.ILockSettings;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mirror.android.os.ServiceManager;

/* loaded from: classes3.dex */
public class LockSettingsStub extends BinderInvocationProxy {
    private static final String SERVICE_NAME = "lock_settings";

    /* loaded from: classes3.dex */
    static class EmptyLockSettings extends ILockSettings.Stub {
        EmptyLockSettings() {
        }

        @Override // com.android.internal.widget.ILockSettings
        public String generateKey(String str) {
            return null;
        }

        @Override // com.android.internal.widget.ILockSettings
        public String generateKeyWithMetadata(String str, byte[] bArr) {
            return null;
        }

        @Override // com.android.internal.widget.ILockSettings
        public List<String> getAliases() {
            return Collections.emptyList();
        }

        @Override // com.android.internal.widget.ILockSettings
        public KeyChainSnapshot getKeyChainSnapshot() {
            return null;
        }

        @Override // com.android.internal.widget.ILockSettings
        public int[] getRecoverySecretTypes() {
            return new int[0];
        }

        @Override // com.android.internal.widget.ILockSettings
        public Map getRecoveryStatus() {
            return new HashMap();
        }

        @Override // com.android.internal.widget.ILockSettings
        public void initRecoveryServiceWithSigFile(String str, byte[] bArr, byte[] bArr2) {
        }

        @Override // com.android.internal.widget.ILockSettings
        public void setRecoverySecretTypes(int[] iArr) {
        }

        @Override // com.android.internal.widget.ILockSettings
        public void setServerParams(byte[] bArr) {
        }

        @Override // com.android.internal.widget.ILockSettings
        public void setSnapshotCreatedPendingIntent(PendingIntent pendingIntent) {
        }
    }

    public LockSettingsStub() {
        super(new EmptyLockSettings(), SERVICE_NAME);
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        if (ServiceManager.checkService.call(SERVICE_NAME) != null) {
            super.inject();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ResultStaticMethodProxy("getRecoveryStatus", Collections.emptyMap()));
    }
}
