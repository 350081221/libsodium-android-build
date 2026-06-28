package mirror.android.app;

import android.annotation.TargetApi;
import android.os.IInterface;
import mirror.RefClass;
import mirror.RefObject;

@TargetApi(19)
/* loaded from: classes4.dex */
public class AppOpsManager {
    public static Class<?> TYPE = RefClass.load(AppOpsManager.class, (Class<?>) android.app.AppOpsManager.class);
    public static RefObject<IInterface> mService;
}
