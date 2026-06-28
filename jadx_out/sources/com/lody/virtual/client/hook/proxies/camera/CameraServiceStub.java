package com.lody.virtual.client.hook.proxies.camera;

import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import java.lang.reflect.Method;
import mirror.android.camera.ICameraService;

/* loaded from: classes3.dex */
public class CameraServiceStub extends BinderInvocationProxy {
    private static final String SERVER_NAME = "media.camera";

    public CameraServiceStub() {
        super(ICameraService.Stub.asInterface, SERVER_NAME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceCallingPkgMethodProxy("connect"));
        addMethodProxy(new StaticMethodProxy("connectDevice") { // from class: com.lody.virtual.client.hook.proxies.camera.CameraServiceStub.1
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                if (objArr[2] instanceof String) {
                    objArr[2] = VirtualCore.get().getHostPkg();
                }
                return super.call(obj, method, objArr);
            }
        });
        addMethodProxy(new ReplaceLastPkgMethodProxy("connectLegacy"));
    }
}
