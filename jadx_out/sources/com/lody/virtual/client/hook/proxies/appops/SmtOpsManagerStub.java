package com.lody.virtual.client.hook.proxies.appops;

import android.annotation.TargetApi;
import com.lody.virtual.client.hook.annotations.Inject;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import mirror.com.android.internal.app.ISmtOpsService;

@Inject(MethodProxies.class)
@TargetApi(19)
/* loaded from: classes3.dex */
public class SmtOpsManagerStub extends BinderInvocationProxy {
    public SmtOpsManagerStub() {
        super(ISmtOpsService.Stub.asInterface, "smtops");
    }
}
