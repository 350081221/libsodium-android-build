package mirror.android.content.pm;

import android.content.pm.VersionedPackage;
import java.util.List;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefConstructor;

/* loaded from: classes4.dex */
public class SharedLibraryInfo {
    public static Class<?> TYPE = RefClass.load((Class<?>) SharedLibraryInfo.class, "android.content.pm.SharedLibraryInfo");

    @MethodParams({String.class, String.class, List.class, String.class, long.class, int.class, VersionedPackage.class, List.class, List.class, boolean.class})
    public static RefConstructor<android.content.pm.SharedLibraryInfo> ctor;
}
