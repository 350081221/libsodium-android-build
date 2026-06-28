package com.lody.virtual.server.notification;

import android.app.Notification;
import android.content.Context;
import android.content.pm.PackageManager;
import android.widget.RemoteViews;
import com.lody.virtual.client.VClient;
import com.lody.virtual.client.core.VirtualCore;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class NotificationCompatCompatV14 extends NotificationCompat {
    private final RemoteViewsFixer mRemoteViewsFixer = new RemoteViewsFixer(this);

    private RemoteViewsFixer getRemoteViewsFixer() {
        return this.mRemoteViewsFixer;
    }

    @Override // com.lody.virtual.server.notification.NotificationCompat
    public boolean dealNotification(int i5, Notification notification, String str) {
        Context appContext = getAppContext(str);
        if (appContext == null) {
            return false;
        }
        if (VClient.get().isDynamicApp() && VirtualCore.get().isOutsideInstalled(str)) {
            if (notification.icon != 0) {
                getNotificationFixer().fixIconImage(appContext.getResources(), notification.contentView, false, notification);
                getNotificationFixer().fixIconImage(appContext.getResources(), notification.bigContentView, false, notification);
                notification.icon = getHostContext().getApplicationInfo().icon;
            }
            return true;
        }
        remakeRemoteViews(i5, notification, appContext);
        if (notification.icon != 0) {
            notification.icon = getHostContext().getApplicationInfo().icon;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context getAppContext(String str) {
        try {
            return getHostContext().createPackageContext(str, 3);
        } catch (PackageManager.NameNotFoundException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void remakeRemoteViews(int i5, Notification notification, Context context) {
        RemoteViews remoteViews = notification.tickerView;
        if (remoteViews != null) {
            if (isSystemLayout(remoteViews)) {
                getNotificationFixer().fixRemoteViewActions(context, false, notification.tickerView);
            } else {
                notification.tickerView = getRemoteViewsFixer().makeRemoteViews(i5 + ":tickerView", context, notification.tickerView, false, false);
            }
        }
        RemoteViews remoteViews2 = notification.contentView;
        if (remoteViews2 != null) {
            if (isSystemLayout(remoteViews2)) {
                getNotificationFixer().fixIconImage(context.getResources(), notification.contentView, getNotificationFixer().fixRemoteViewActions(context, false, notification.contentView), notification);
            } else {
                notification.contentView = getRemoteViewsFixer().makeRemoteViews(i5 + ":contentView", context, notification.contentView, false, true);
            }
        }
        RemoteViews remoteViews3 = notification.bigContentView;
        if (remoteViews3 != null) {
            if (isSystemLayout(remoteViews3)) {
                getNotificationFixer().fixRemoteViewActions(context, false, notification.bigContentView);
            } else {
                notification.bigContentView = getRemoteViewsFixer().makeRemoteViews(i5 + ":bigContentView", context, notification.bigContentView, true, true);
            }
        }
        RemoteViews remoteViews4 = notification.headsUpContentView;
        if (remoteViews4 != null) {
            if (isSystemLayout(remoteViews4)) {
                getNotificationFixer().fixIconImage(context.getResources(), notification.contentView, getNotificationFixer().fixRemoteViewActions(context, false, notification.headsUpContentView), notification);
                return;
            }
            notification.headsUpContentView = getRemoteViewsFixer().makeRemoteViews(i5 + ":headsUpContentView", context, notification.headsUpContentView, false, false);
        }
    }
}
