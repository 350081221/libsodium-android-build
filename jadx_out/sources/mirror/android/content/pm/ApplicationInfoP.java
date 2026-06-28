package mirror.android.content.pm;

import android.content.pm.ApplicationInfo;
import java.util.List;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefObject;

/* loaded from: classes4.dex */
public class ApplicationInfoP {
    public static Class<?> TYPE = RefClass.load(ApplicationInfoP.class, (Class<?>) ApplicationInfo.class);

    @MethodParams({int.class})
    public static RefObject<List<Object>> sharedLibraryInfos;

    public static List sharedLibraryInfos(ApplicationInfo applicationInfo) {
        RefObject<List<Object>> refObject = sharedLibraryInfos;
        if (refObject != null) {
            return refObject.get(applicationInfo);
        }
        return null;
    }

    public static void sharedLibraryInfos(ApplicationInfo applicationInfo, List list) {
        RefObject<List<Object>> refObject = sharedLibraryInfos;
        if (refObject != null) {
            refObject.set(applicationInfo, list);
        }
    }
}
