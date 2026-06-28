package mirror.android.os;

import android.os.IBinder;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefMethod;

/* loaded from: classes4.dex */
public class Bundle {
    public static Class<?> TYPE = RefClass.load(Bundle.class, (Class<?>) android.os.Bundle.class);

    @MethodParams({String.class})
    public static RefMethod<IBinder> getIBinder;

    @MethodParams({String.class, IBinder.class})
    public static RefMethod<Void> putIBinder;
}
