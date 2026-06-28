package mirror.android.content.pm;

import mirror.MethodReflectParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class PackageParserNougat {
    public static Class<?> TYPE = RefClass.load((Class<?>) PackageParserNougat.class, "android.content.pm.PackageParser");

    @MethodReflectParams({"android.content.pm.PackageParser$Package", com.swift.sandhook.annotation.MethodReflectParams.INT})
    public static RefStaticMethod<Void> collectCertificates;
}
