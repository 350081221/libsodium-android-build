package com.lody.virtual.server.notification;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.ipc.VPackageManager;
import com.lody.virtual.helper.compat.NotificationChannelCompat;
import com.lody.virtual.helper.utils.Reflect;
import com.lody.virtual.helper.utils.VLog;
import mirror.android.app.NotificationO;

@TargetApi(21)
/* loaded from: classes3.dex */
class NotificationCompatCompatV21 extends NotificationCompatCompatV14 {
    private static final String TAG = "NotificationCompatCompatV21";

    private void fixApplicationInfo(RemoteViews remoteViews, ApplicationInfo applicationInfo) {
        if (remoteViews != null) {
            mirror.android.widget.RemoteViews.mApplication.set(remoteViews, applicationInfo);
        }
    }

    private ApplicationInfo getApplicationInfo(Notification notification) {
        ApplicationInfo applicationInfo = getApplicationInfo(notification.tickerView);
        if (applicationInfo != null) {
            return applicationInfo;
        }
        ApplicationInfo applicationInfo2 = getApplicationInfo(notification.contentView);
        if (applicationInfo2 != null) {
            return applicationInfo2;
        }
        ApplicationInfo applicationInfo3 = getApplicationInfo(notification.bigContentView);
        if (applicationInfo3 != null) {
            return applicationInfo3;
        }
        ApplicationInfo applicationInfo4 = getApplicationInfo(notification.headsUpContentView);
        if (applicationInfo4 != null) {
            return applicationInfo4;
        }
        return null;
    }

    private PackageInfo getOutSidePackageInfo(String str) {
        try {
            return VirtualCore.get().getOutSidePackageInfo(str, 1024);
        } catch (Throwable unused) {
            return null;
        }
    }

    private boolean resolveRemoteViews(Context context, int i5, String str, Notification notification) {
        ApplicationInfo applicationInfo;
        boolean z4 = false;
        if (notification == null) {
            return false;
        }
        ApplicationInfo applicationInfo2 = getHostContext().getApplicationInfo();
        PackageInfo outSidePackageInfo = getOutSidePackageInfo(str);
        PackageInfo packageInfo = VPackageManager.get().getPackageInfo(str, 1024, 0);
        if (outSidePackageInfo != null && outSidePackageInfo.versionCode == packageInfo.versionCode) {
            z4 = true;
        }
        getNotificationFixer().fixNotificationRemoteViews(context, notification);
        int i6 = Build.VERSION.SDK_INT;
        getNotificationFixer().fixIcon(notification.getSmallIcon(), context, z4);
        getNotificationFixer().fixIcon(notification.getLargeIcon(), context, z4);
        notification.icon = applicationInfo2.icon;
        if (z4) {
            applicationInfo = outSidePackageInfo.applicationInfo;
        } else {
            applicationInfo = packageInfo.applicationInfo;
        }
        applicationInfo.targetSdkVersion = 22;
        fixApplicationInfo(notification.tickerView, applicationInfo);
        fixApplicationInfo(notification.contentView, applicationInfo);
        fixApplicationInfo(notification.bigContentView, applicationInfo);
        fixApplicationInfo(notification.headsUpContentView, applicationInfo);
        Bundle bundle = (Bundle) Reflect.on(notification).get("extras");
        if (bundle != null) {
            bundle.putParcelable(NotificationCompat.EXTRA_BUILDER_APPLICATION_INFO, applicationInfo);
        }
        if (i6 >= 26 && !z4) {
            remakeRemoteViews(i5, notification, context);
        }
        return true;
    }

    @Override // com.lody.virtual.server.notification.NotificationCompatCompatV14, com.lody.virtual.server.notification.NotificationCompat
    public boolean dealNotification(int i5, Notification notification, String str) {
        String channelId;
        Context appContext = getAppContext(str);
        if (Build.VERSION.SDK_INT >= 26 && VirtualCore.get().getTargetSdkVersion() >= 26) {
            channelId = notification.getChannelId();
            if (TextUtils.isEmpty(channelId)) {
                NotificationO.mChannelId.set(notification, NotificationChannelCompat.DEFAULT_ID);
            }
        }
        try {
            if (!resolveRemoteViews(appContext, i5, str, notification)) {
                if (!resolveRemoteViews(appContext, i5, str, notification.publicVersion)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            VLog.e(TAG, "error deal Notification!");
            return false;
        }
    }

    private ApplicationInfo getApplicationInfo(RemoteViews remoteViews) {
        if (remoteViews != null) {
            return mirror.android.widget.RemoteViews.mApplication.get(remoteViews);
        }
        return null;
    }
}
