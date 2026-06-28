package mirror.android.app;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.MethodReflectParams;
import mirror.RefClass;
import mirror.RefMethod;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IApplicationThreadOreo {
    public static Class<?> TYPE = RefClass.load((Class<?>) IApplicationThreadOreo.class, "android.app.IApplicationThread");

    @MethodReflectParams({"android.os.IBinder", "android.content.pm.ParceledListSlice"})
    public static RefMethod<Void> scheduleServiceArgs;

    /* loaded from: classes4.dex */
    public static final class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.app.IApplicationThread$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
