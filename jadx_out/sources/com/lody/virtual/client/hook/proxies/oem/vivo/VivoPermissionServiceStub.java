package com.lody.virtual.client.hook.proxies.oem.vivo;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgAndLastUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastUidMethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import java.lang.reflect.Method;
import mirror.oem.vivo.IVivoPermissonService;

/* loaded from: classes3.dex */
public class VivoPermissionServiceStub extends BinderInvocationProxy {
    private static final String SERVER_NAME = "vivo_permission_service";

    public VivoPermissionServiceStub() {
        super(IVivoPermissonService.Stub.TYPE, SERVER_NAME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceLastUidMethodProxy("checkPermission"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("getAppPermission"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("setAppPermission"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("setWhiteListApp"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("setBlackListApp"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("noteStartActivityProcess"));
        addMethodProxy(new ReplaceFirstPkgMethodProxy("isBuildInThirdPartApp"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("setOnePermission"));
        addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("setOnePermissionExt"));
        addMethodProxy(new StaticMethodProxy("checkDelete") { // from class: com.lody.virtual.client.hook.proxies.oem.vivo.VivoPermissionServiceStub.1
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                if (objArr[1] instanceof String) {
                    objArr[1] = MethodProxy.getHostPkg();
                }
                MethodProxy.replaceLastUserId(objArr);
                return super.call(obj, method, objArr);
            }
        });
        addMethodProxy(new ReplaceFirstPkgMethodProxy("isVivoImeiPkg"));
    }
}
