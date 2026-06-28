package com.lody.virtual.client.hook.proxies.system;

import android.os.Bundle;
import android.os.ISystemUpdateManager;
import android.os.PersistableBundle;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import mirror.android.os.ServiceManager;

/* loaded from: classes3.dex */
public class SystemUpdateStub extends BinderInvocationProxy {
    private static final String SERVICE_NAME = "system_update";

    /* loaded from: classes3.dex */
    static class EmptySystemUpdateManagerImpl extends ISystemUpdateManager.Stub {
        EmptySystemUpdateManagerImpl() {
        }

        @Override // android.os.ISystemUpdateManager
        public Bundle retrieveSystemUpdateInfo() {
            Bundle bundle = new Bundle();
            bundle.putInt("status", 0);
            return bundle;
        }

        @Override // android.os.ISystemUpdateManager
        public void updateSystemUpdateInfo(PersistableBundle persistableBundle) {
        }
    }

    public SystemUpdateStub() {
        super(new EmptySystemUpdateManagerImpl(), SERVICE_NAME);
    }

    @Override // com.lody.virtual.client.hook.base.BinderInvocationProxy, com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        if (ServiceManager.checkService.call(SERVICE_NAME) == null) {
            super.inject();
        }
    }
}
