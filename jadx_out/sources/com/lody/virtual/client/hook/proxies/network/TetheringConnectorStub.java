package com.lody.virtual.client.hook.proxies.network;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import com.lody.virtual.helper.utils.Reflect;
import java.lang.reflect.Method;
import mirror.android.net.ITetheringConnector;

/* loaded from: classes3.dex */
public class TetheringConnectorStub extends BinderInvocationProxy {
    private static final String SERVER_NAME = "tethering";

    public TetheringConnectorStub() {
        super(ITetheringConnector.Stub.asInterface, SERVER_NAME);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new StaticMethodProxy("isTetheringSupported") { // from class: com.lody.virtual.client.hook.proxies.network.TetheringConnectorStub.1
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                try {
                    Reflect.on(objArr[2]).call("onResult", 3);
                    return null;
                } catch (Exception unused) {
                    return super.call(obj, method, objArr);
                }
            }
        });
    }
}
