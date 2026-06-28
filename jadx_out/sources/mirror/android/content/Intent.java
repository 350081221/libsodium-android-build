package mirror.android.content;

import android.os.Bundle;
import android.os.IBinder;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefMethod;
import mirror.RefObject;

/* loaded from: classes4.dex */
public class Intent {
    public static Class<?> TYPE = RefClass.load(Intent.class, (Class<?>) android.content.Intent.class);

    @MethodParams({String.class})
    public static RefMethod<IBinder> getIBinderExtra;
    public static RefObject<Bundle> mExtras;

    @MethodParams({String.class, IBinder.class})
    public static RefMethod<Void> putExtra;
}
