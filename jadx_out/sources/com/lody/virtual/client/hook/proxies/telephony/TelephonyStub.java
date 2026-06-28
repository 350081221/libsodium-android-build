package com.lody.virtual.client.hook.proxies.telephony;

import android.content.Context;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.BinderInvocationProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceLastPkgMethodProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import com.lody.virtual.client.hook.proxies.telephony.MethodProxies;
import com.lody.virtual.helper.compat.BuildCompat;
import java.lang.reflect.Method;
import mirror.com.android.internal.telephony.ITelephony;

/* loaded from: classes3.dex */
public class TelephonyStub extends BinderInvocationProxy {

    /* loaded from: classes3.dex */
    private static class GetLine1NumberForDisplay extends ReplaceCallingPkgMethodProxy {
        public GetLine1NumberForDisplay() {
            super("getLine1NumberForDisplay");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            try {
                Context context = VirtualCore.get().getContext();
                if (context != null) {
                    int checkCallingPermission = context.checkCallingPermission("android.permission.READ_PHONE_NUMBERS");
                    int checkCallingPermission2 = context.checkCallingPermission("android.permission.READ_SMS");
                    int checkCallingPermission3 = context.checkCallingPermission("android.permission.READ_PHONE_STATE");
                    if (checkCallingPermission == 0 || checkCallingPermission2 == 0 || checkCallingPermission3 == 0) {
                        return super.call(obj, method, objArr);
                    }
                }
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
    }

    /* loaded from: classes3.dex */
    private static class GetNetworkTypeForSubscriber extends ReplaceCallingPkgMethodProxy {
        public GetNetworkTypeForSubscriber() {
            super("getNetworkTypeForSubscriber");
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            Context context = VirtualCore.get().getContext();
            if (context != null && BuildCompat.isR() && context.checkCallingPermission("android.permission.READ_PHONE_NUMBERS") == -1) {
                return 0;
            }
            return super.call(obj, method, objArr);
        }
    }

    public TelephonyStub() {
        super(ITelephony.Stub.asInterface, HintConstants.AUTOFILL_HINT_PHONE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new GetLine1NumberForDisplay());
        addMethodProxy(new MethodProxies.GetCellLocation());
        addMethodProxy(new MethodProxies.GetAllCellInfoUsingSubId());
        addMethodProxy(new MethodProxies.GetAllCellInfo());
        addMethodProxy(new MethodProxies.GetNeighboringCellInfo());
        addMethodProxy(new MethodProxies.GetDeviceId());
        addMethodProxy(new MethodProxies.GetImeiForSlot());
        addMethodProxy(new MethodProxies.GetMeidForSlot());
        addMethodProxy(new ReplaceCallingPkgMethodProxy(NotificationCompat.CATEGORY_CALL));
        addMethodProxy(new ReplaceLastPkgMethodProxy("isSimPinEnabled"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getCdmaEriIconIndex"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getCdmaEriIconIndexForSubscriber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getCdmaEriIconMode"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getCdmaEriIconModeForSubscriber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getCdmaEriText"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getCdmaEriTextForSubscriber"));
        addMethodProxy(new GetNetworkTypeForSubscriber());
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getDataNetworkType"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getDataNetworkTypeForSubscriber"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getVoiceNetworkTypeForSubscriber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getLteOnCdmaMode"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getLteOnCdmaModeForSubscriber"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getCalculatedPreferredNetworkType"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getPcscfAddress"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getLine1AlphaTagForDisplay"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getMergedSubscriberIds"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("getRadioAccessFamily"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isVideoCallingEnabled"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getDeviceSoftwareVersionForSlot"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getServiceStateForSubscriber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getVisualVoicemailPackageName"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("enableVisualVoicemailSmsFilter"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("disableVisualVoicemailSmsFilter"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getVisualVoicemailSmsFilterSettings"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("sendVisualVoicemailSmsForSubscriber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getVoiceActivationState"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getDataActivationState"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getVoiceMailAlphaTagForSubscriber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("sendDialerSpecialCode"));
        if (BuildCompat.isOreo()) {
            addMethodProxy(new ReplaceCallingPkgMethodProxy("setVoicemailVibrationEnabled"));
            addMethodProxy(new ReplaceCallingPkgMethodProxy("setVoicemailRingtoneUri"));
        }
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isOffhook"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("isOffhookForSubscriber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isRinging"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("isRingingForSubscriber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isIdle"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("isIdleForSubscriber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isRadioOn"));
        addMethodProxy(new ReplaceLastPkgMethodProxy("isRadioOnForSubscriber"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getClientRequestStats"));
        if (!VirtualCore.get().isSystemApp()) {
            addMethodProxy(new ResultStaticMethodProxy("getVisualVoicemailSettings", null));
            addMethodProxy(new ResultStaticMethodProxy("setDataEnabled", 0));
            addMethodProxy(new ResultStaticMethodProxy("getDataEnabled", Boolean.FALSE));
        }
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getDeviceIdWithFeature") { // from class: com.lody.virtual.client.hook.proxies.telephony.TelephonyStub.1
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                try {
                    return super.call(obj, method, objArr);
                } catch (SecurityException e5) {
                    if (VClient.get().getCurrentApplicationInfo().targetSdkVersion < 29) {
                        if (VirtualCore.get().getContext().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
                            return null;
                        }
                        throw e5;
                    }
                    throw e5;
                }
            }
        });
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isRadioOnForSubscriberWithFeature"));
        addMethodProxy(new ResultStaticMethodProxy("requestCellInfoUpdateWithWorkSource", null));
        addMethodProxy(new ResultStaticMethodProxy("isIccLockEnabled", Boolean.FALSE));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getCallStateForSubscription"));
    }
}
