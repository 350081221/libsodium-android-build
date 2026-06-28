package mirror.android.app;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class ApplicationThreadNative {
    public static Class<?> TYPE = RefClass.load((Class<?>) ApplicationThreadNative.class, "android.app.ApplicationThreadNative");

    @MethodParams({IBinder.class})
    public static RefStaticMethod<IInterface> asInterface;
}
