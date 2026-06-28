package mirror.android.view;

import android.graphics.Bitmap;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class SurfaceControl {
    public static Class<?> TYPE = RefClass.load((Class<?>) SurfaceControl.class, "android.view.SurfaceControl");

    @MethodParams({int.class, int.class})
    public static RefStaticMethod<Bitmap> screnshot;
}
