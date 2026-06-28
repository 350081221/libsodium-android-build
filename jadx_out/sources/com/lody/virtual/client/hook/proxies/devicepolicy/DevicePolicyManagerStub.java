package com.lody.virtual.client.hook.proxies.devicepolicy;

import android.content.ComponentName;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgAndLastUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgMethodProxy;
import java.lang.reflect.Method;
import mirror.android.app.admin.IDevicePolicyManager;

/* loaded from: classes3.dex */
public class DevicePolicyManagerStub extends BinderInvocationProxy {

    /* loaded from: classes3.dex */
    private static class GetDeviceOwnerComponent extends MethodProxy {
        private GetDeviceOwnerComponent() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return new ComponentName(MethodProxy.getAppPkg(), "");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getDeviceOwnerComponent";
        }
    }

    /* loaded from: classes3.dex */
    private static class GetDeviceOwnerName extends MethodProxy {
        private GetDeviceOwnerName() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return null;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getDeviceOwnerName";
        }
    }

    /* loaded from: classes3.dex */
    private static class GetFactoryResetProtectionPolicy extends MethodProxy {
        private GetFactoryResetProtectionPolicy() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return null;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getFactoryResetProtectionPolicy";
        }
    }

    /* loaded from: classes3.dex */
    private static class GetProfileOwnerName extends MethodProxy {
        private GetProfileOwnerName() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return null;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getProfileOwnerName";
        }
    }

    /* loaded from: classes3.dex */
    private static class GetStorageEncryptionStatus extends MethodProxy {
        private GetStorageEncryptionStatus() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            objArr[0] = VirtualCore.get().getHostPkg();
            MethodProxy.replaceLastUserId(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getStorageEncryptionStatus";
        }
    }

    /* loaded from: classes3.dex */
    private static class IsDeviceProvisioned extends MethodProxy {
        private IsDeviceProvisioned() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return Boolean.TRUE;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "isDeviceProvisioned";
        }
    }

    /* loaded from: classes3.dex */
    private static class NotifyPendingSystemUpdate extends MethodProxy {
        private NotifyPendingSystemUpdate() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "notifyPendingSystemUpdate";
        }
    }

    /* loaded from: classes3.dex */
    private static class SetPasswordQuality extends MethodProxy {
        private SetPasswordQuality() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            return null;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "setPasswordQuality";
        }
    }

    public DevicePolicyManagerStub() {
        super(IDevicePolicyManager.Stub.asInterface, "device_policy");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new GetStorageEncryptionStatus());
        addMethodProxy(new GetDeviceOwnerComponent());
        addMethodProxy(new NotifyPendingSystemUpdate());
        addMethodProxy(new GetDeviceOwnerName());
        addMethodProxy(new GetProfileOwnerName());
        addMethodProxy(new SetPasswordQuality());
        addMethodProxy(new GetFactoryResetProtectionPolicy());
        addMethodProxy(new IsDeviceProvisioned());
        addMethodProxy(new ReplaceFirstPkgMethodProxy("isUsbDataSignalingEnabled"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("getAccountTypesWithManagementDisabled"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("getAccountTypesWithManagementDisabledAsUser"));
    }
}
