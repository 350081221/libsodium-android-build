package com.lody.virtual.helper.compat;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.env.Constants;
import com.lody.virtual.client.ipc.ServiceManagerNative;

/* loaded from: classes3.dex */
public class NotificationChannelCompat {
    public static final String DAEMON_ID = Constants.NOTIFICATION_DAEMON_CHANNEL;
    public static final String DEFAULT_ID = Constants.NOTIFICATION_CHANNEL;

    @TargetApi(26)
    public static void checkOrCreateChannel(Context context, String str, String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(ServiceManagerNative.NOTIFICATION);
            notificationChannel = notificationManager.getNotificationChannel(str);
            if (notificationChannel == null) {
                NotificationChannel notificationChannel2 = new NotificationChannel(str, str2, 4);
                notificationChannel2.setDescription("Compatibility of old versions");
                notificationChannel2.setSound(null, null);
                notificationChannel2.setShowBadge(false);
                try {
                    notificationManager.createNotificationChannel(notificationChannel2);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    public static Notification.Builder createBuilder(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 26 && VirtualCore.get().getTargetSdkVersion() >= 26) {
            return new Notification.Builder(context, str);
        }
        return new Notification.Builder(context);
    }

    public static boolean enable() {
        if (Build.VERSION.SDK_INT <= 26 || VirtualCore.get().getTargetSdkVersion() < 26) {
            return false;
        }
        return true;
    }
}
