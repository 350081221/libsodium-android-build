package mirror.android.content.pm;

import android.content.pm.PackageParser;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefConstructor;

/* loaded from: classes4.dex */
public class SigningInfo {
    public static Class<?> TYPE = RefClass.load((Class<?>) SigningInfo.class, "android.content.pm.SigningInfo");

    @MethodParams({PackageParser.SigningDetails.class})
    public static RefConstructor<Object> ctor;
}
