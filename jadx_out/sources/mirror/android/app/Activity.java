package mirror.android.app;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.IBinder;
import mirror.RefBoolean;
import mirror.RefClass;
import mirror.RefInt;
import mirror.RefObject;

/* loaded from: classes4.dex */
public class Activity {
    public static Class<?> TYPE = RefClass.load((Class<?>) Activity.class, "android.app.Activity");
    public static RefObject<ActivityInfo> mActivityInfo;
    public static RefObject<String> mEmbeddedID;
    public static RefBoolean mFinished;
    public static RefObject<android.app.Activity> mParent;
    public static RefInt mResultCode;
    public static RefObject<Intent> mResultData;
    public static RefObject<IBinder> mToken;
}
