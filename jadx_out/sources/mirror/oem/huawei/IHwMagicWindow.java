package mirror.oem.huawei;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IHwMagicWindow {
    public static Class<?> TYPE = RefClass.load((Class<?>) IHwMagicWindow.class, "android.magicwin.IHwMagicWindow");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.magicwin.IHwMagicWindow$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
