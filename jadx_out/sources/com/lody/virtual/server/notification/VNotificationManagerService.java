package com.lody.virtual.server.notification;

import android.app.NotificationManager;
import android.content.Context;
import android.text.TextUtils;
import com.lody.virtual.client.ipc.ServiceManagerNative;
import com.lody.virtual.helper.utils.Singleton;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.server.interfaces.INotificationManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public class VNotificationManagerService extends INotificationManager.Stub {
    private Context mContext;
    private NotificationManager mNotificationManager;
    private static final Singleton<VNotificationManagerService> gService = new Singleton<VNotificationManagerService>() { // from class: com.lody.virtual.server.notification.VNotificationManagerService.1
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.lody.virtual.helper.utils.Singleton
        public VNotificationManagerService create() {
            return new VNotificationManagerService();
        }
    };
    static final String TAG = NotificationCompat.class.getSimpleName();
    private final List<String> mDisables = new ArrayList();
    private final HashMap<String, List<NotificationInfo>> mNotifications = new HashMap<>();

    /* loaded from: classes3.dex */
    private static class NotificationInfo {
        int id;
        String packageName;
        String tag;
        int userId;

        NotificationInfo(int i5, String str, String str2, int i6) {
            this.id = i5;
            this.tag = str;
            this.packageName = str2;
            this.userId = i6;
        }

        public boolean equals(Object obj) {
            if (obj instanceof NotificationInfo) {
                NotificationInfo notificationInfo = (NotificationInfo) obj;
                if (notificationInfo.id == this.id && TextUtils.equals(notificationInfo.tag, this.tag) && TextUtils.equals(this.packageName, notificationInfo.packageName) && notificationInfo.userId == this.userId) {
                    return true;
                }
                return false;
            }
            return super.equals(obj);
        }
    }

    public static VNotificationManagerService get() {
        return gService.get();
    }

    private void init(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService(ServiceManagerNative.NOTIFICATION);
    }

    public static void systemReady(Context context) {
        get().init(context);
    }

    @Override // com.lody.virtual.server.interfaces.INotificationManager
    public void addNotification(int i5, String str, String str2, int i6) {
        NotificationInfo notificationInfo = new NotificationInfo(i5, str, str2, i6);
        synchronized (this.mNotifications) {
            List<NotificationInfo> list = this.mNotifications.get(str2);
            if (list == null) {
                list = new ArrayList<>();
                this.mNotifications.put(str2, list);
            }
            if (!list.contains(notificationInfo)) {
                list.add(notificationInfo);
            }
        }
    }

    @Override // com.lody.virtual.server.interfaces.INotificationManager
    public boolean areNotificationsEnabledForPackage(String str, int i5) {
        List<String> list = this.mDisables;
        return !list.contains(str + ":" + i5);
    }

    @Override // com.lody.virtual.server.interfaces.INotificationManager
    public void cancelAllNotification(String str, int i5) {
        ArrayList<NotificationInfo> arrayList = new ArrayList();
        synchronized (this.mNotifications) {
            List<NotificationInfo> list = this.mNotifications.get(str);
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    NotificationInfo notificationInfo = list.get(size);
                    if (notificationInfo.userId == i5) {
                        arrayList.add(notificationInfo);
                        list.remove(size);
                    }
                }
            }
        }
        for (NotificationInfo notificationInfo2 : arrayList) {
            VLog.d(TAG, "cancel " + notificationInfo2.tag + " " + notificationInfo2.id, new Object[0]);
            this.mNotificationManager.cancel(notificationInfo2.tag, notificationInfo2.id);
        }
    }

    @Override // com.lody.virtual.server.interfaces.INotificationManager
    public int dealNotificationId(int i5, String str, String str2, int i6) {
        return i5;
    }

    @Override // com.lody.virtual.server.interfaces.INotificationManager
    public String dealNotificationTag(int i5, String str, String str2, int i6) {
        if (TextUtils.equals(this.mContext.getPackageName(), str)) {
            return str2;
        }
        if (str2 == null) {
            return str + "@" + i6;
        }
        return str + ":" + str2 + "@" + i6;
    }

    @Override // com.lody.virtual.server.interfaces.INotificationManager
    public void setNotificationsEnabledForPackage(String str, boolean z4, int i5) {
        String str2 = str + ":" + i5;
        if (z4) {
            if (this.mDisables.contains(str2)) {
                this.mDisables.remove(str2);
            }
        } else if (!this.mDisables.contains(str2)) {
            this.mDisables.add(str2);
        }
    }
}
