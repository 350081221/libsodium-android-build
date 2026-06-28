package mirror.android.app;

import android.content.ComponentName;
import android.os.IBinder;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefMethod;

/* loaded from: classes4.dex */
public class IServiceConnectionO {
    public static Class<?> TYPE = RefClass.load((Class<?>) IServiceConnectionO.class, "android.app.IServiceConnection");

    @MethodParams({ComponentName.class, IBinder.class, boolean.class})
    public static RefMethod<Void> connected;
}
