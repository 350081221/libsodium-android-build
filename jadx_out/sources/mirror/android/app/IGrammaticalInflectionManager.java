package mirror.android.app;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IGrammaticalInflectionManager {
    public static Class<?> TYPE = RefClass.load((Class<?>) IGrammaticalInflectionManager.class, "android.app.IGrammaticalInflectionManager");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.app.IGrammaticalInflectionManager$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
