package com.lody.virtual.client.hook.proxies.telephony;

import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceSequencePkgMethodProxy;
import java.lang.reflect.Method;
import mirror.com.android.internal.telephony.ITelephonyRegistry;

/* loaded from: classes3.dex */
public class TelephonyRegistryStub extends BinderInvocationProxy {

    /* loaded from: classes3.dex */
    private static class ListenWithEventList extends ReplaceCallingPkgMethodProxy {
        public ListenWithEventList() {
            super("listenWithEventList");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            if (VirtualCore.get().getContext().checkCallingPermission("android.permission.READ_PHONE_STATE") == -1) {
                return 0;
            }
            return super.call(obj, method, objArr);
        }
    }

    public TelephonyRegistryStub() {
        super(ITelephonyRegistry.Stub.asInterface, "telephony.registry");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceCallingPkgMethodProxy("addOnSubscriptionsChangedListener"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("addOnOpportunisticSubscriptionsChangedListener"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("removeOnSubscriptionsChangedListener"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("listen"));
        addMethodProxy(new ListenWithEventList());
        addMethodProxy(new ReplaceSequencePkgMethodProxy("listenForSubscriber", 1) { // from class: com.lody.virtual.client.hook.proxies.telephony.TelephonyRegistryStub.1
            @Override // com.lody.virtual.client.hook.base.ReplaceSequencePkgMethodProxy, com.lody.virtual.client.hook.base.MethodProxy
            public boolean beforeCall(Object obj, Method method, Object... objArr) {
                if (MethodProxy.isFakeLocationEnable()) {
                    int length = objArr.length - 1;
                    while (true) {
                        if (length <= 0) {
                            break;
                        }
                        Object obj2 = objArr[length];
                        if (obj2 instanceof Integer) {
                            objArr[length] = Integer.valueOf((((Integer) obj2).intValue() ^ 1024) ^ 16);
                            break;
                        }
                        length--;
                    }
                }
                return super.beforeCall(obj, method, objArr);
            }
        });
    }
}
