package com.lody.virtual.client.stub;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.lody.virtual.R;
import com.lody.virtual.helper.compat.NotificationChannelCompat;

/* loaded from: classes3.dex */
public class HiddenForeNotification extends Service {
    private static final int ID = 2781;

    public static void bindForeground(Service service) {
        Notification.Builder createBuilder = NotificationChannelCompat.createBuilder(service.getApplicationContext(), NotificationChannelCompat.DAEMON_ID);
        createBuilder.setSmallIcon(R.drawable.ic_logo);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 > 24) {
            createBuilder.setContentTitle(service.getString(R.string.keep_service_damon_noti_title_v24));
            createBuilder.setContentText(service.getString(R.string.keep_service_damon_noti_text_v24));
        } else {
            createBuilder.setContentTitle(service.getString(R.string.keep_service_damon_noti_title));
            createBuilder.setContentText(service.getString(R.string.keep_service_damon_noti_text));
            createBuilder.setContentIntent(PendingIntent.getService(service, 0, new Intent(service, (Class<?>) HiddenForeNotification.class), 100663296));
        }
        createBuilder.setSound(null);
        if (i5 >= 34) {
            service.startForeground(ID, createBuilder.build(), 1);
        } else {
            service.startForeground(ID, createBuilder.build());
        }
        if (i5 <= 24) {
            service.startService(new Intent(service, (Class<?>) HiddenForeNotification.class));
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i5, int i6) {
        try {
            Notification.Builder createBuilder = NotificationChannelCompat.createBuilder(getBaseContext(), NotificationChannelCompat.DAEMON_ID);
            createBuilder.setSmallIcon(R.drawable.ic_logo);
            createBuilder.setContentTitle(getString(R.string.keep_service_noti_title));
            createBuilder.setContentText(getString(R.string.keep_service_noti_text));
            createBuilder.setSound(null);
            if (Build.VERSION.SDK_INT >= 34) {
                startForeground(ID, createBuilder.build(), 1);
            } else {
                startForeground(ID, createBuilder.build());
            }
            stopForeground(true);
            stopSelf();
            return 2;
        } catch (Exception e5) {
            e5.printStackTrace();
            return 2;
        }
    }
}
