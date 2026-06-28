package mirror.android.app;

import android.app.PendingIntent;
import android.content.Context;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefMethod;

/* loaded from: classes4.dex */
public class Notification {
    public static Class<?> TYPE = RefClass.load(Notification.class, (Class<?>) android.app.Notification.class);

    @MethodParams({Context.class, CharSequence.class, CharSequence.class, PendingIntent.class})
    public static RefMethod<Void> setLatestEventInfo;
}
