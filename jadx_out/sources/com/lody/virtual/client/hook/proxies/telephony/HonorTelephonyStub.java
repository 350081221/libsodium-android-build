package com.lody.virtual.client.hook.proxies.telephony;

import com.lody.virtual.client.hook.annotations.Inject;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.proxies.telephony.MethodProxies;
import mirror.com.android.internal.telephony.IHwTelephony;

@Inject(MethodProxies.class)
/* loaded from: classes3.dex */
public class HonorTelephonyStub extends BinderInvocationProxy {

    /* loaded from: classes3.dex */
    private static class GetUniqueDeviceId extends MethodProxies.GetDeviceId {
        private GetUniqueDeviceId() {
        }

        @Override // com.lody.virtual.client.hook.base.StaticMethodProxy, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getUniqueDeviceId";
        }
    }

    public HonorTelephonyStub() {
        super(IHwTelephony.Stub.TYPE, "phone_honor");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        addMethodProxy(new GetUniqueDeviceId());
    }
}
