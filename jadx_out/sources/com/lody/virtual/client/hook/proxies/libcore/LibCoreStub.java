package com.lody.virtual.client.hook.proxies.libcore;

import com.lody.virtual.client.hook.annotations.Inject;
import com.lody.virtual.client.hook.base.MethodInvocationProxy;
import com.lody.virtual.client.hook.base.MethodInvocationStub;
import com.lody.virtual.client.hook.base.ReplaceUidMethodProxy;
import mirror.RefObject;
import mirror.libcore.io.ForwardingOs;
import mirror.libcore.io.Libcore;

@Inject(MethodProxies.class)
/* loaded from: classes3.dex */
public class LibCoreStub extends MethodInvocationProxy<MethodInvocationStub<Object>> {
    public LibCoreStub() {
        super(new MethodInvocationStub(getOs()));
    }

    private static Object getOs() {
        Object obj;
        Object obj2 = Libcore.os.get();
        RefObject<Object> refObject = ForwardingOs.os;
        if (refObject != null && (obj = refObject.get(obj2)) != null) {
            return obj;
        }
        return obj2;
    }

    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() {
        Libcore.os.set(getInvocationStub().getProxyInterface());
    }

    @Override // com.lody.virtual.client.interfaces.IInjector
    public boolean isEnvBad() {
        return getOs() != getInvocationStub().getProxyInterface();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceUidMethodProxy("chown", 1));
        addMethodProxy(new ReplaceUidMethodProxy("fchown", 1));
        addMethodProxy(new ReplaceUidMethodProxy("getpwuid", 0));
        addMethodProxy(new ReplaceUidMethodProxy("lchown", 1));
        addMethodProxy(new ReplaceUidMethodProxy("setuid", 0));
    }
}
