package mirror.android.content.pm;

import mirror.MethodReflectParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class PackageParserPie {
    public static Class<?> TYPE = RefClass.load((Class<?>) PackageParserPie.class, "android.content.pm.PackageParser");

    @MethodReflectParams({"android.content.pm.PackageParser$Package", "boolean"})
    public static RefStaticMethod<Void> collectCertificates;
}
