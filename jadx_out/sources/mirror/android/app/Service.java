package mirror.android.app;

import android.os.IBinder;
import mirror.MethodReflectParams;
import mirror.RefClass;
import mirror.RefMethod;
import mirror.RefObject;

/* loaded from: classes4.dex */
public class Service {
    public static Class<?> TYPE = RefClass.load(Service.class, (Class<?>) android.app.Service.class);

    @MethodReflectParams({"android.content.Context", "android.app.ActivityThread", "java.lang.String", "android.os.IBinder", "android.app.Application", "java.lang.Object"})
    public static RefMethod<Void> attach;
    public static RefObject<IBinder> mToken;
}
