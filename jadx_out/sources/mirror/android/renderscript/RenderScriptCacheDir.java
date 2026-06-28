package mirror.android.renderscript;

import java.io.File;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class RenderScriptCacheDir {
    public static Class<?> TYPE = RefClass.load((Class<?>) RenderScriptCacheDir.class, "android.renderscript.RenderScriptCacheDir");

    @MethodParams({File.class})
    public static RefStaticMethod<Void> setupDiskCache;
}
