package mirror.android.view;

import java.io.File;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class RenderScript {
    public static Class<?> TYPE = RefClass.load(RenderScript.class, (Class<?>) android.renderscript.RenderScript.class);

    @MethodParams({File.class})
    public static RefStaticMethod<Void> setupDiskCache;
}
