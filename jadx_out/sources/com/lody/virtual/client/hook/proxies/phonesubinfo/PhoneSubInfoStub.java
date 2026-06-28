package com.lody.virtual.client.hook.proxies.phonesubinfo;

import android.content.Context;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.annotations.Inject;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import com.lody.virtual.helper.compat.BuildCompat;
import java.lang.reflect.Method;
import mirror.com.android.internal.telephony.IPhoneSubInfo;

@Inject(MethodProxies.class)
/* loaded from: classes3.dex */
public class PhoneSubInfoStub extends BinderInvocationProxy {

    /* loaded from: classes3.dex */
    static class GetLine1NumberForSubscriber extends ReplaceCallingPkgMethodProxy {
        public GetLine1NumberForSubscriber() {
            super("getLine1NumberForSubscriber");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            try {
                Context context = VirtualCore.get().getContext();
                if (context != null) {
                    int checkCallingPermission = context.checkCallingPermission("android.permission.READ_PHONE_NUMBERS");
                    int checkCallingPermission2 = context.checkCallingPermission("android.permission.READ_SMS");
                    int checkCallingPermission3 = context.checkCallingPermission("android.permission.READ_PHONE_STATE");
                    if (checkCallingPermission == -1 && checkCallingPermission2 == -1 && checkCallingPermission3 == -1) {
                        return null;
                    }
                }
                return super.call(obj, method, objArr);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* loaded from: classes3.dex */
    static class GetSubscriberId extends ReplaceCallingPkgMethodProxy {
        public GetSubscriberId() {
            super("getSubscriberId");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            try {
                if (BuildCompat.isQ()) {
                    return "unknown";
                }
                return super.call(obj, method, objArr);
            } catch (Throwable unused) {
                return "unknown";
            }
        }
    }

    /* loaded from: classes3.dex */
    static class GetSubscriberIdForSubscriber extends ReplaceCallingPkgMethodProxy {
        public GetSubscriberIdForSubscriber() {
            super("getSubscriberIdForSubscriber");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            try {
                if (BuildCompat.isQ()) {
                    return "unknown";
                }
                return super.call(obj, method, objArr);
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public PhoneSubInfoStub() {
        super(IPhoneSubInfo.Stub.asInterface, "iphonesubinfo");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceLastPkgMethodProxy("getNaiForSubscriber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getDeviceSvn"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getDeviceSvnUsingSubId"));
        addMethodProxy(new GetSubscriberId());
        addMethodProxy(new GetSubscriberIdForSubscriber());
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getGroupIdLevel1"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getGroupIdLevel1ForSubscriber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getLine1AlphaTag"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getLine1AlphaTagForSubscriber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getMsisdn"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getMsisdnForSubscriber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getVoiceMailNumber"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getVoiceMailNumberForSubscriber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getVoiceMailAlphaTag"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getVoiceMailAlphaTagForSubscriber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getLine1Number"));
        addMethodProxy(new GetLine1NumberForSubscriber());
    }
}
