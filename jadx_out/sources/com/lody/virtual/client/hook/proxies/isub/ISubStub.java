package com.lody.virtual.client.hook.proxies.isub;

import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import mirror.com.android.internal.telephony.ISub;

/* loaded from: classes3.dex */
public class ISubStub extends BinderInvocationProxy {
    public ISubStub() {
        super(ISub.Stub.asInterface, "isub");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceLastPkgMethodProxy("getActiveSubInfoCount"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getSubscriptionProperty"));
        addMethodProxy(new StaticMethodProxy("getSimStateForSlotIdx"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getActiveSubscriptionInfo"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getActiveSubscriptionInfoForIccId"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getActiveSubscriptionInfoForSimSlotIndex"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getAllSubInfoList"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getAllSubInfoCount"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getActiveSubscriptionInfoList"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getAvailableSubscriptionInfoList"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getAccessibleSubscriptionInfoList"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("isActiveSubId"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getOpportunisticSubscriptions"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("createSubscriptionGroup"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("removeSubscriptionsFromGroup"));
        addMethodProxy(new ResultStaticMethodProxy("getActiveSubIdList", new int[0]));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("setOpportunistic"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("addSubscriptionsIntoGroup"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getSubscriptionsInGroup"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getPhoneNumber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getPhoneNumberFromFirstAvailableSource"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("setPhoneNumber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("setUsageSetting"));
    }
}
