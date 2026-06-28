package mirror.android.view;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IGraphicsStats {
    public static Class<?> TYPE = RefClass.load((Class<?>) IGraphicsStats.class, "android.view.IGraphicsStats");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.view.IGraphicsStats$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
