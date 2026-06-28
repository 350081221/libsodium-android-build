package mirror.android.app;

import android.app.Notification;
import android.content.Context;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class NotificationL {
    public static Class<?> TYPE = RefClass.load(NotificationL.class, (Class<?>) android.app.Notification.class);

    /* loaded from: classes4.dex */
    public static class Builder {
        public static Class<?> TYPE = RefClass.load(Builder.class, (Class<?>) Notification.Builder.class);

        @MethodParams({Context.class, android.app.Notification.class})
        public static RefStaticMethod<android.app.Notification> rebuild;
    }
}
