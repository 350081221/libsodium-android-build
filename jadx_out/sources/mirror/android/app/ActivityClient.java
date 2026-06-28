package mirror.android.app;

import android.os.IInterface;
import mirror.RefClass;
import mirror.RefObject;
import mirror.RefStaticMethod;
import mirror.RefStaticObject;

/* loaded from: classes4.dex */
public class ActivityClient {
    public static RefStaticObject<Object> INTERFACE_SINGLETON;
    public static Class<?> TYPE = RefClass.load((Class<?>) ActivityClient.class, "android.app.ActivityClient");
    public static RefStaticMethod<IInterface> getActivityClientController;

    /* loaded from: classes4.dex */
    public static class ActivityClientControllerSingleton {
        public static Class<?> TYPE = RefClass.load((Class<?>) ActivityClientControllerSingleton.class, "android.app.ActivityClient$ActivityClientControllerSingleton");
        public static RefObject<IInterface> mKnownInstance;
    }
}
