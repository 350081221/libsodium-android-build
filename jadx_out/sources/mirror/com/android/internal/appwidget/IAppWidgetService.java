package mirror.com.android.internal.appwidget;

import android.os.IBinder;
import android.os.IInterface;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class IAppWidgetService {
    public static Class<?> TYPE = RefClass.load((Class<?>) IAppWidgetService.class, "com.android.internal.appwidget.IAppWidgetService");

    /* loaded from: classes4.dex */
    public static class Stub {
        public static Class<?> TYPE = RefClass.load((Class<?>) Stub.class, "com.android.internal.appwidget.IAppWidgetService$Stub");

        @MethodParams({IBinder.class})
        public static RefStaticMethod<IInterface> asInterface;
    }
}
