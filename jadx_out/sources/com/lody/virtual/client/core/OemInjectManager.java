package com.lody.virtual.client.core;

import com.lody.virtual.client.hook.proxies.oem.huawei.HwMagicWindowManagerStub;
import com.lody.virtual.client.hook.proxies.oem.vivo.PhysicalFlingManagerStub;
import com.lody.virtual.client.hook.proxies.oem.vivo.PopupCameraManagerStub;
import com.lody.virtual.client.hook.proxies.oem.vivo.SuperResolutionManagerStub;
import com.lody.virtual.client.hook.proxies.oem.vivo.SystemDefenceManagerStub;
import com.lody.virtual.client.hook.proxies.oem.vivo.VivoPermissionServiceStub;
import mirror.oem.huawei.IHwMagicWindow;
import mirror.oem.vivo.IPhysicalFlingManagerStub;
import mirror.oem.vivo.IPopupCameraManager;
import mirror.oem.vivo.ISuperResolutionManager;
import mirror.oem.vivo.ISystemDefenceManager;
import mirror.oem.vivo.IVivoPermissonService;

/* loaded from: classes3.dex */
public class OemInjectManager {
    private static void injectVivo(InvocationStubManager invocationStubManager) {
        if (IPhysicalFlingManagerStub.TYPE != null) {
            invocationStubManager.addInjector(new PhysicalFlingManagerStub());
        }
        if (IPopupCameraManager.TYPE != null) {
            invocationStubManager.addInjector(new PopupCameraManagerStub());
        }
        if (ISuperResolutionManager.TYPE != null) {
            invocationStubManager.addInjector(new SuperResolutionManagerStub());
        }
        if (ISystemDefenceManager.TYPE != null) {
            invocationStubManager.addInjector(new SystemDefenceManagerStub());
        }
        if (IVivoPermissonService.TYPE != null) {
            invocationStubManager.addInjector(new VivoPermissionServiceStub());
        }
        if (IHwMagicWindow.TYPE != null) {
            invocationStubManager.addInjector(new HwMagicWindowManagerStub());
        }
    }

    public static void oemInject(InvocationStubManager invocationStubManager) {
        injectVivo(invocationStubManager);
    }
}
