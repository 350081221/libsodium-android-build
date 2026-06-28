package com.lody.virtual.client.hook.proxies.isms;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceSpecPkgMethodProxy;
import mirror.com.android.internal.telephony.ISms;

/* loaded from: classes3.dex */
public class ISmsStub extends BinderInvocationProxy {
    public ISmsStub() {
        super(ISms.Stub.asInterface, "isms");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceSpecPkgMethodProxy("getAllMessagesFromIccEfForSubscriber", 1));
        addMethodProxy(new ReplaceSpecPkgMethodProxy("updateMessageOnIccEfForSubscriber", 1));
        addMethodProxy(new ReplaceSpecPkgMethodProxy("copyMessageToIccEfForSubscriber", 1));
        addMethodProxy(new ReplaceSpecPkgMethodProxy("sendDataForSubscriber", 1));
        addMethodProxy(new ReplaceSpecPkgMethodProxy("sendDataForSubscriberWithSelfPermissions", 1));
        addMethodProxy(new ReplaceSpecPkgMethodProxy("sendTextForSubscriber", 1));
        addMethodProxy(new ReplaceSpecPkgMethodProxy("sendTextForSubscriberWithSelfPermissions", 1));
        addMethodProxy(new ReplaceSpecPkgMethodProxy("sendMultipartTextForSubscriber", 1));
        addMethodProxy(new ReplaceSpecPkgMethodProxy("sendStoredText", 1));
        addMethodProxy(new ReplaceSpecPkgMethodProxy("sendStoredMultipartText", 1));
    }
}
