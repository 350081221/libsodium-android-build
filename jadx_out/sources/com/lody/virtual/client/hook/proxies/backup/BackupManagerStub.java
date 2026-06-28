package com.lody.virtual.client.hook.proxies.backup;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import com.lody.virtual.helper.compat.BuildCompat;
import mirror.android.app.backup.IBackupManager;

/* loaded from: classes3.dex */
public class BackupManagerStub extends BinderInvocationProxy {
    public BackupManagerStub() {
        super(IBackupManager.Stub.asInterface, "backup");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ResultStaticMethodProxy("dataChanged", null));
        addMethodProxy(new ResultStaticMethodProxy("clearBackupData", null));
        addMethodProxy(new ResultStaticMethodProxy("agentConnected", null));
        addMethodProxy(new ResultStaticMethodProxy("agentDisconnected", null));
        addMethodProxy(new ResultStaticMethodProxy("restoreAtInstall", null));
        addMethodProxy(new ResultStaticMethodProxy("setBackupEnabled", null));
        addMethodProxy(new ResultStaticMethodProxy("setBackupProvisioned", null));
        addMethodProxy(new ResultStaticMethodProxy("backupNow", null));
        addMethodProxy(new ResultStaticMethodProxy("fullBackup", null));
        addMethodProxy(new ResultStaticMethodProxy("fullTransportBackup", null));
        addMethodProxy(new ResultStaticMethodProxy("fullRestore", null));
        addMethodProxy(new ResultStaticMethodProxy("acknowledgeFullBackupOrRestore", null));
        addMethodProxy(new ResultStaticMethodProxy("getCurrentTransport", null));
        addMethodProxy(new ResultStaticMethodProxy("listAllTransports", new String[0]));
        addMethodProxy(new ResultStaticMethodProxy("selectBackupTransport", null));
        Boolean bool = Boolean.FALSE;
        addMethodProxy(new ResultStaticMethodProxy("isBackupEnabled", bool));
        addMethodProxy(new ResultStaticMethodProxy("setBackupPassword", Boolean.TRUE));
        addMethodProxy(new ResultStaticMethodProxy("hasBackupPassword", bool));
        addMethodProxy(new ResultStaticMethodProxy("beginRestoreSession", null));
        if (BuildCompat.isOreo()) {
            addMethodProxy(new ResultStaticMethodProxy("selectBackupTransportAsync", null));
        }
        if (BuildCompat.isPie()) {
            addMethodProxy(new ResultStaticMethodProxy("updateTransportAttributes", null));
            addMethodProxy(new ResultStaticMethodProxy("isBackupServiceActive", bool));
            addMethodProxy(new ResultStaticMethodProxy("updateTransportAttributesForUser", null));
        }
    }
}
