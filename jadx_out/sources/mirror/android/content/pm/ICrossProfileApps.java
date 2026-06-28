package mirror.android.content.pm;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class ICrossProfileApps {
    public static Class<?> TYPE = RefClass.load((Class<?>) ICrossProfileApps.class, "android.content.pm.ICrossProfileApps");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.content.pm.ICrossProfileApps$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
