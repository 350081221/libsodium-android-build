package com.lody.virtual.server.notification;

import android.app.Notification;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.widget.RemoteViews;
import com.lody.virtual.client.core.VirtualCore;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import mirror.com.android.internal.R_Hide;

/* loaded from: classes3.dex */
public abstract class NotificationCompat {
    public static final String EXTRA_BIG_TEXT = "android.bigText";
    public static final String EXTRA_BUILDER_APPLICATION_INFO = "android.appInfo";
    public static final String EXTRA_INFO_TEXT = "android.infoText";
    public static final String EXTRA_PROGRESS = "android.progress";
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final String EXTRA_SUB_TEXT = "android.subText";
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final String EXTRA_TEXT = "android.text";
    public static final String EXTRA_TITLE = "android.title";
    public static final String EXTRA_TITLE_BIG = "android.title.big";
    static final String SYSTEM_UI_PKG = "com.android.systemui";
    static final String TAG = "NotificationCompat";
    private NotificationFixer mNotificationFixer;
    private final List<Integer> sSystemLayoutResIds = new ArrayList(10);

    /* JADX INFO: Access modifiers changed from: package-private */
    public NotificationCompat() {
        loadSystemLayoutRes();
        this.mNotificationFixer = new NotificationFixer(this);
    }

    public static NotificationCompat create() {
        return new NotificationCompatCompatV21();
    }

    private void loadSystemLayoutRes() {
        for (Field field : R_Hide.layout.TYPE.getFields()) {
            if (Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    this.sSystemLayoutResIds.add(Integer.valueOf(field.getInt(null)));
                } catch (Throwable unused) {
                }
            }
        }
    }

    public abstract boolean dealNotification(int i5, Notification notification, String str);

    public Context getHostContext() {
        return VirtualCore.get().getContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NotificationFixer getNotificationFixer() {
        return this.mNotificationFixer;
    }

    PackageInfo getPackageInfo(String str) {
        try {
            return VirtualCore.get().getHostPackageManager().getPackageInfo(str, 0L);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isSystemLayout(RemoteViews remoteViews) {
        if (remoteViews != null && this.sSystemLayoutResIds.contains(Integer.valueOf(remoteViews.getLayoutId()))) {
            return true;
        }
        return false;
    }
}
