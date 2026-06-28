package mirror.android.view.accessibility;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IAccessibilityManager {
    public static Class<?> TYPE = RefClass.load((Class<?>) IAccessibilityManager.class, "android.view.accessibility.IAccessibilityManager");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.view.accessibility.IAccessibilityManager$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
