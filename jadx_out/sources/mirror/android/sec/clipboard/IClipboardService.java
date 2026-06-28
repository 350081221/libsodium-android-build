package mirror.android.sec.clipboard;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IClipboardService {
    public static Class<?> TYPE = RefClass.load((Class<?>) IClipboardService.class, "android.sec.clipboard.IClipboardService");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "android.sec.clipboard.IClipboardService$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
