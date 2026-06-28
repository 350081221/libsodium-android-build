package mirror.android.app;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;
import mirror.android.app.IUsageStatsManager;

/* loaded from: classes4.dex */
public class IWallpaperManager {
    public static Class<?> TYPE = RefClass.load((Class<?>) IWallpaperManager.class, "android.app.IWallpaperManager");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) IUsageStatsManager.Stub.class, "android.app.IWallpaperManager$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
