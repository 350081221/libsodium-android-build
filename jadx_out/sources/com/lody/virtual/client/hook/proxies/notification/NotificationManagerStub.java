package com.lody.virtual.client.hook.proxies.notification;

import android.os.Build;
import android.os.IInterface;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.env.Constants;
import com.lody.virtual.client.hook.annotations.Inject;
import com.lody.virtual.client.hook.base.MethodInvocationProxy;
import com.lody.virtual.client.hook.base.MethodInvocationStub;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgAndLastUserIdMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceCallingPkgMethodProxy;
import com.lody.virtual.client.hook.base.ReplaceFirstPkgAndFirstUidMethodProxy;
import com.lody.virtual.client.hook.base.ResultStaticMethodProxy;
import com.lody.virtual.client.hook.base.StaticMethodProxy;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import com.lody.virtual.helper.compat.BuildCompat;
import java.lang.reflect.Method;
import mirror.android.app.NotificationManager;
import mirror.android.widget.Toast;

@Inject(MethodProxies.class)
/* loaded from: classes3.dex */
public class NotificationManagerStub extends MethodInvocationProxy<MethodInvocationStub<IInterface>> {
    public NotificationManagerStub() {
        super(new MethodInvocationStub(NotificationManager.getService.call(new Object[0])));
    }

    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy, com.lody.virtual.client.interfaces.IInjector
    public void inject() throws Throwable {
        NotificationManager.sService.set(getInvocationStub().getProxyInterface());
        Toast.sService.set(getInvocationStub().getProxyInterface());
    }

    @Override // com.lody.virtual.client.interfaces.IInjector
    public boolean isEnvBad() {
        return NotificationManager.getService.call(new Object[0]) != getInvocationStub().getProxyInterface();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.lody.virtual.client.hook.base.MethodInvocationProxy
    public void onBindMethods() {
        super.onBindMethods();
        addMethodProxy(new ReplaceCallingPkgMethodProxy("enqueueToast"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("enqueueToastForLog"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("enqueueToastEx"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("enqueueToastForDex"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("enqueueTextToastForDex"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("cancelToast"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("finishToken"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("removeAutomaticZenRules"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getImportance"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("areNotificationsEnabled"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("setNotificationPolicy"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getNotificationPolicy"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("setNotificationPolicyAccessGranted"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isNotificationPolicyAccessGranted"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isNotificationPolicyAccessGrantedForPackage"));
        if ("samsung".equalsIgnoreCase(Build.BRAND) || "samsung".equalsIgnoreCase(Build.MANUFACTURER)) {
            addMethodProxy(new ReplaceCallingPkgMethodProxy("removeEdgeNotification"));
        }
        if (BuildCompat.isOreo()) {
            addMethodProxy(new ReplaceCallingPkgMethodProxy("createNotificationChannelGroups"));
            addMethodProxy(new ReplaceCallingPkgMethodProxy("getNotificationChannelGroups"));
            addMethodProxy(new ReplaceFirstPkgAndFirstUidMethodProxy("createNotificationChannelsForPackage"));
            addMethodProxy(new ReplaceCallingPkgMethodProxy("deleteNotificationChannelGroup"));
            addMethodProxy(new ReplaceCallingPkgMethodProxy("createNotificationChannels"));
            if (BuildCompat.isQ()) {
                addMethodProxy(new MethodProxy() { // from class: com.lody.virtual.client.hook.proxies.notification.NotificationManagerStub.1
                    @Override // com.lody.virtual.client.hook.base.MethodProxy
                    public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                        objArr[0] = VirtualCore.get().getHostPkg();
                        objArr[1] = VirtualCore.get().getHostPkg();
                        MethodProxy.replaceLastUserId(objArr);
                        return super.call(obj, method, objArr);
                    }

                    @Override // com.lody.virtual.client.hook.base.MethodProxy
                    public String getMethodName() {
                        return "getNotificationChannels";
                    }
                });
            } else {
                addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("getNotificationChannels"));
            }
            if (BuildCompat.isQ()) {
                addMethodProxy(new MethodProxy() { // from class: com.lody.virtual.client.hook.proxies.notification.NotificationManagerStub.2
                    @Override // com.lody.virtual.client.hook.base.MethodProxy
                    public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                        objArr[0] = VirtualCore.get().getHostPkg();
                        objArr[2] = VirtualCore.get().getHostPkg();
                        MethodProxy.replaceLastUserId(objArr);
                        return super.call(obj, method, objArr);
                    }

                    @Override // com.lody.virtual.client.hook.base.MethodProxy
                    public String getMethodName() {
                        return "getNotificationChannel";
                    }
                });
                addMethodProxy(new ResultStaticMethodProxy("setNotificationDelegate", null));
                addMethodProxy(new ResultStaticMethodProxy("getNotificationDelegate", null));
                addMethodProxy(new ResultStaticMethodProxy("canNotifyAsPackage", Boolean.FALSE));
            } else {
                addMethodProxy(new ReplaceCallingPkgAndLastUserIdMethodProxy("getNotificationChannel"));
            }
            addMethodProxy(new MethodProxy() { // from class: com.lody.virtual.client.hook.proxies.notification.NotificationManagerStub.3
                @Override // com.lody.virtual.client.hook.base.MethodProxy
                public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                    MethodParameterUtils.replaceFirstAppPkg(objArr);
                    if (objArr != null && objArr.length >= 2) {
                        Object obj2 = objArr[1];
                        if ((obj2 instanceof String) && Constants.NOTIFICATION_DAEMON_CHANNEL.equals(obj2)) {
                            return null;
                        }
                    }
                    try {
                        return super.call(obj, method, objArr);
                    } catch (Exception e5) {
                        e5.printStackTrace();
                        return null;
                    }
                }

                @Override // com.lody.virtual.client.hook.base.MethodProxy
                public String getMethodName() {
                    return "deleteNotificationChannel";
                }
            });
        }
        if (BuildCompat.isPie()) {
            addMethodProxy(new ReplaceCallingPkgMethodProxy("getNotificationChannelGroup"));
        }
        addMethodProxy(new ReplaceCallingPkgMethodProxy("setInterruptionFilter"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getPackageImportance"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("shouldGroupPkg"));
        addMethodProxy(new ResultStaticMethodProxy("getBubblePreferenceForPackage", null));
        String str = "getConversationNotificationChannel";
        addMethodProxy(new StaticMethodProxy(str) { // from class: com.lody.virtual.client.hook.proxies.notification.NotificationManagerStub.4
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                objArr[0] = VirtualCore.get().getHostPkg();
                objArr[2] = VirtualCore.get().getHostPkg();
                return super.call(obj, method, objArr);
            }
        });
        addMethodProxy(new StaticMethodProxy(str) { // from class: com.lody.virtual.client.hook.proxies.notification.NotificationManagerStub.5
            @Override // com.lody.virtual.client.hook.base.MethodProxy
            public Object call(Object obj, Method method, Object... objArr) throws Throwable {
                objArr[0] = VirtualCore.get().getHostPkg();
                objArr[2] = VirtualCore.get().getHostPkg();
                return super.call(obj, method, objArr);
            }
        });
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getAppActiveNotifications"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("getActiveNotifications"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("areBubblesAllowed"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("shouldHideSilentStatusIcons"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("isPackagePaused"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("enqueueTextToast"));
        addMethodProxy(new ReplaceCallingPkgMethodProxy("enqueueToastWithType"));
        addMethodProxy(new ResultStaticMethodProxy("isNotificationListenerAccessGranted", null));
        addMethodProxy(new ReplaceFirstPkgAndFirstUidMethodProxy("getNotificationChannelForPackage"));
    }
}
