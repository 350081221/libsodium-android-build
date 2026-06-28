package mirror.android.widget;

import android.content.pm.ApplicationInfo;
import java.util.ArrayList;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefConstructor;
import mirror.RefObject;

/* loaded from: classes4.dex */
public class RemoteViews {
    public static Class<?> TYPE = RefClass.load(RemoteViews.class, (Class<?>) android.widget.RemoteViews.class);

    @MethodParams({ApplicationInfo.class, int.class})
    public static RefConstructor<android.widget.RemoteViews> ctor;
    public static RefObject<ArrayList<Object>> mActions;
    public static RefObject<ApplicationInfo> mApplication;
    public static RefObject<String> mPackage;
}
