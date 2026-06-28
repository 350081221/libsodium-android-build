package com.lody.virtual.client.hook.proxies.telecom;

import android.annotation.TargetApi;
import android.content.Context;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import java.lang.reflect.Method;
import mirror.com.android.internal.telecom.ITelecomService;

@TargetApi(21)
/* loaded from: classes3.dex */
public class TelecomManagerStub extends BinderInvocationProxy {

    /* loaded from: classes3.dex */
    private static class GetCallStateUsingPackage extends ReplaceCallingPkgMethodProxy {
        public GetCallStateUsingPackage() {
            super("getCallStateUsingPackage");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            Context context = VirtualCore.get().getContext();
            if (context != null && context.checkCallingPermission("android.permission.READ_PHONE_STATE") == -1) {
                return 0;
            }
            return super.call(obj, method, objArr);
        }
    }

    public TelecomManagerStub() {
        super(ITelecomService.Stub.TYPE, "telecom");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new StaticMethodProxy("registerPhoneAccount") { // from class: com.lody.virtual.client.hook.proxies.telecom.TelecomManagerStub.1
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                return 0;
            }
        });
        addMethodProxy(new ReplaceCallingPkgMethodProxy("showInCallScreen"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getDefaultOutgoingPhoneAccount"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getUserSelectedOutgoingPhoneAccount"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getCallCapablePhoneAccounts"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getSelfManagedPhoneAccounts"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getOwnSelfManagedPhoneAccounts"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getPhoneAccountsSupportingScheme"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getPhoneAccountsForPackage"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getPhoneAccount"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("clearAccounts"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isVoiceMailNumber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getVoiceMailNumber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getLine1Number"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("silenceRinger"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isInCall"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("hasManageOngoingCallsPermission"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isInManagedCall"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isRinging"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("acceptRingingCall"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("acceptRingingCallWithVideoState"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("cancelMissedCallsNotification"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("handlePinMmi"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("handlePinMmiForPhoneAccount"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getAdnUriForPhoneAccount"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isTtySupported"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getCurrentTtyMode"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("placeCall"));
        addMethodProxy(new GetCallStateUsingPackage());
        addMethodProxy(new ReplaceCallingPkgMethodProxy("endCall"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("startConference"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("setDefaultDialer"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isIncomingCallPermitted"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isOutgoingCallPermitted"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isInSelfManagedCall"));
    }
}
