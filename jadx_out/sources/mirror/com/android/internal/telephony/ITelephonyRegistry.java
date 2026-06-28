package mirror.com.android.internal.telephony;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class ITelephonyRegistry {
    public static Class<?> TYPE = RefClass.load((Class<?>) ITelephonyRegistry.class, "com.android.internal.telephony.ITelephonyRegistry");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "com.android.internal.telephony.ITelephonyRegistry$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
