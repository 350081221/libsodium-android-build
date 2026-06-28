package mirror.android.os;

import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class UserHandle {
    public static Class<?> TYPE = RefClass.load((Class<?>) UserHandle.class, "android.os.UserHandle");

    @MethodParams({int.class})
    public static RefStaticMethod<Integer> getUserId;
}
