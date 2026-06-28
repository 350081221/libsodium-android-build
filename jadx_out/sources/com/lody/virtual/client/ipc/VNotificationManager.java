package com.lody.virtual.client.ipc;

import android.app.Notification;
import android.os.RemoteException;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.utils.IInterfaceUtils;
import com.lody.virtual.server.interfaces.INotificationManager;
import com.lody.virtual.server.notification.NotificationCompat;

/* loaded from: classes3.dex */
public class VNotificationManager {
    private static final VNotificationManager sInstance = new VNotificationManager();
    private final NotificationCompat mNotificationCompat = NotificationCompat.create();
    private INotificationManager mService;

    private VNotificationManager() {
    }

    public static VNotificationManager get() {
        return sInstance;
    }

    private Object getRemoteInterface() {
        return INotificationManager.Stub.asInterface(ServiceManagerNative.getService(ServiceManagerNative.NOTIFICATION));
    }

    public void addNotification(int i5, String str, String str2, int i6) {
        try {
            getService().addNotification(i5, str, str2, i6);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public boolean areNotificationsEnabledForPackage(String str, int i5) {
        try {
            return getService().areNotificationsEnabledForPackage(str, i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return true;
        }
    }

    public void cancelAllNotification(String str, int i5) {
        try {
            getService().cancelAllNotification(str, i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }

    public boolean dealNotification(int i5, Notification notification, String str) {
        if (notification == null) {
            return false;
        }
        if (!VirtualCore.get().getHostPkg().equals(str) && !this.mNotificationCompat.dealNotification(i5, notification, str)) {
            return false;
        }
        return true;
    }

    public int dealNotificationId(int i5, String str, String str2, int i6) {
        try {
            return getService().dealNotificationId(i5, str, str2, i6);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return i5;
        }
    }

    public String dealNotificationTag(int i5, String str, String str2, int i6) {
        try {
            return getService().dealNotificationTag(i5, str, str2, i6);
        } catch (RemoteException e5) {
            e5.printStackTrace();
            return str2;
        }
    }

    public INotificationManager getService() {
        INotificationManager iNotificationManager = this.mService;
        if (iNotificationManager == null || !IInterfaceUtils.isAlive(iNotificationManager)) {
            synchronized (VNotificationManager.class) {
                this.mService = (INotificationManager) LocalProxyUtils.genProxy(INotificationManager.class, getRemoteInterface());
            }
        }
        return this.mService;
    }

    public void setNotificationsEnabledForPackage(String str, boolean z4, int i5) {
        try {
            getService().setNotificationsEnabledForPackage(str, z4, i5);
        } catch (RemoteException e5) {
            e5.printStackTrace();
        }
    }
}
