package mirror.android.view;

import java.io.File;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class HardwareRenderer {
    public static Class<?> TYPE = RefClass.load((Class<?>) HardwareRenderer.class, "android.view.HardwareRenderer");

    @MethodParams({File.class})
    public static RefStaticMethod<Void> setupDiskCache;
}
