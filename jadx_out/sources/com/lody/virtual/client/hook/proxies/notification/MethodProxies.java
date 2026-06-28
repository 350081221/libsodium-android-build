package com.lody.virtual.client.hook.proxies.notification;

import android.app.Notification;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.hook.base.MethodProxy;
import com.lody.virtual.client.hook.utils.MethodParameterUtils;
import com.lody.virtual.client.ipc.VNotificationManager;
import com.lody.virtual.helper.compat.BuildCompat;
import com.lody.virtual.helper.utils.ArrayUtils;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
class MethodProxies {

    /* loaded from: classes3.dex */
    static class AreNotificationsEnabledForPackage extends MethodProxy {
        AreNotificationsEnabledForPackage() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            String str = (String) objArr[0];
            if (MethodProxy.getHostPkg().equals(str)) {
                return method.invoke(obj, objArr);
            }
            return Boolean.valueOf(VNotificationManager.get().areNotificationsEnabledForPackage(str, MethodProxy.getAppUserId()));
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "areNotificationsEnabledForPackage";
        }
    }

    /* loaded from: classes3.dex */
    static class CancelAllNotifications extends MethodProxy {
        CancelAllNotifications() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            String replaceFirstAppPkg = MethodParameterUtils.replaceFirstAppPkg(objArr);
            if (VirtualCore.get().isAppInstalled(replaceFirstAppPkg)) {
                VNotificationManager.get().cancelAllNotification(replaceFirstAppPkg, MethodProxy.getAppUserId());
                return 0;
            }
            MethodProxy.replaceLastUserId(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "cancelAllNotifications";
        }
    }

    /* loaded from: classes3.dex */
    static class CancelNotificationWithTag extends MethodProxy {
        CancelNotificationWithTag() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            char c5;
            int i5 = 2;
            if (BuildCompat.isR()) {
                c5 = 3;
            } else {
                c5 = 2;
            }
            if (!BuildCompat.isR()) {
                i5 = 1;
            }
            String replaceFirstAppPkg = MethodParameterUtils.replaceFirstAppPkg(objArr);
            if (BuildCompat.isR()) {
                objArr[i5 - 1] = VirtualCore.get().getHostPkg();
            }
            MethodProxy.replaceLastUserId(objArr);
            if (MethodProxy.getHostPkg().equals(replaceFirstAppPkg)) {
                return method.invoke(obj, objArr);
            }
            String str = (String) objArr[i5];
            int dealNotificationId = VNotificationManager.get().dealNotificationId(((Integer) objArr[c5]).intValue(), replaceFirstAppPkg, str, MethodProxy.getAppUserId());
            objArr[i5] = VNotificationManager.get().dealNotificationTag(dealNotificationId, replaceFirstAppPkg, str, MethodProxy.getAppUserId());
            objArr[c5] = Integer.valueOf(dealNotificationId);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "cancelNotificationWithTag";
        }
    }

    /* loaded from: classes3.dex */
    static class EnqueueNotification extends MethodProxy {
        EnqueueNotification() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            String str = (String) objArr[0];
            MethodProxy.replaceLastUserId(objArr);
            if (MethodProxy.getHostPkg().equals(str)) {
                return method.invoke(obj, objArr);
            }
            int indexOfFirst = ArrayUtils.indexOfFirst(objArr, Notification.class);
            int indexOfFirst2 = ArrayUtils.indexOfFirst(objArr, Integer.class);
            int dealNotificationId = VNotificationManager.get().dealNotificationId(((Integer) objArr[indexOfFirst2]).intValue(), str, null, MethodProxy.getAppUserId());
            objArr[indexOfFirst2] = Integer.valueOf(dealNotificationId);
            if (!VNotificationManager.get().dealNotification(dealNotificationId, (Notification) objArr[indexOfFirst], str)) {
                return 0;
            }
            VNotificationManager.get().addNotification(dealNotificationId, null, str, MethodProxy.getAppUserId());
            objArr[0] = MethodProxy.getHostPkg();
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "enqueueNotification";
        }
    }

    /* loaded from: classes3.dex */
    static class EnqueueNotificationWithTag extends MethodProxy {
        EnqueueNotificationWithTag() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            String str = (String) objArr[0];
            MethodProxy.replaceLastUserId(objArr);
            if (MethodProxy.getHostPkg().equals(str)) {
                return method.invoke(obj, objArr);
            }
            int indexOfFirst = ArrayUtils.indexOfFirst(objArr, Notification.class);
            int indexOfFirst2 = ArrayUtils.indexOfFirst(objArr, Integer.class);
            int intValue = ((Integer) objArr[indexOfFirst2]).intValue();
            String str2 = (String) objArr[2];
            int dealNotificationId = VNotificationManager.get().dealNotificationId(intValue, str, str2, MethodProxy.getAppUserId());
            String dealNotificationTag = VNotificationManager.get().dealNotificationTag(dealNotificationId, str, str2, MethodProxy.getAppUserId());
            objArr[indexOfFirst2] = Integer.valueOf(dealNotificationId);
            objArr[2] = dealNotificationTag;
            if (!VNotificationManager.get().dealNotification(dealNotificationId, (Notification) objArr[indexOfFirst], str)) {
                return 0;
            }
            VNotificationManager.get().addNotification(dealNotificationId, dealNotificationTag, str, MethodProxy.getAppUserId());
            objArr[0] = MethodProxy.getHostPkg();
            if (objArr[1] instanceof String) {
                objArr[1] = MethodProxy.getHostPkg();
            }
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "enqueueNotificationWithTag";
        }
    }

    /* loaded from: classes3.dex */
    static class EnqueueNotificationWithTagPriority extends EnqueueNotificationWithTag {
        EnqueueNotificationWithTagPriority() {
        }

        @Override // com.lody.virtual.client.hook.proxies.notification.MethodProxies.EnqueueNotificationWithTag, com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "enqueueNotificationWithTagPriority";
        }
    }

    /* loaded from: classes3.dex */
    static class GetAppActiveNotifications extends MethodProxy {
        GetAppActiveNotifications() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            objArr[0] = MethodProxy.getHostPkg();
            MethodProxy.replaceLastUserId(objArr);
            return method.invoke(obj, objArr);
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "getAppActiveNotifications";
        }
    }

    /* loaded from: classes3.dex */
    static class SetNotificationsEnabledForPackage extends MethodProxy {
        SetNotificationsEnabledForPackage() {
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public Object call(Object obj, Method method, Object... objArr) throws Throwable {
            String str = (String) objArr[0];
            if (MethodProxy.getHostPkg().equals(str)) {
                return method.invoke(obj, objArr);
            }
            VNotificationManager.get().setNotificationsEnabledForPackage(str, ((Boolean) objArr[ArrayUtils.indexOfFirst(objArr, Boolean.class)]).booleanValue(), MethodProxy.getAppUserId());
            return 0;
        }

        @Override // com.lody.virtual.client.hook.base.MethodProxy
        public String getMethodName() {
            return "setNotificationsEnabledForPackage";
        }
    }

    MethodProxies() {
    }
}
