package mirror.android.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefMethod;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class ILocationListener {
    public static Class<?> TYPE = RefClass.load((Class<?>) ILocationListener.class, "android.location.ILocationListener");

    @MethodParams({Location.class})
    public static RefMethod<Void> onLocationChanged;

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.location.ILocationListener$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
