package mirror.android.app.servertransaction;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IInterface;
import mirror.RefClass;
import mirror.RefObject;

/* loaded from: classes4.dex */
public class LaunchActivityItem {
    public static Class<?> TYPE = RefClass.load((Class<?>) LaunchActivityItem.class, "android.app.servertransaction.LaunchActivityItem");
    public static RefObject<IInterface> mActivityClientController;
    public static RefObject<ActivityInfo> mInfo;
    public static RefObject<Intent> mIntent;
}
