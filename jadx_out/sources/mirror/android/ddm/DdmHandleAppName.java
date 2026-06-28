package mirror.android.ddm;

import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class DdmHandleAppName {
    public static Class Class = RefClass.load((Class<?>) DdmHandleAppName.class, "android.ddm.DdmHandleAppName");

    @MethodParams({String.class})
    public static RefStaticMethod<Void> setAppName;
}
