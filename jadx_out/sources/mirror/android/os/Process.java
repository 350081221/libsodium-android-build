package mirror.android.os;

import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class Process {
    public static Class<?> TYPE = RefClass.load(Process.class, (Class<?>) android.os.Process.class);

    @MethodParams({String.class})
    public static RefStaticMethod<Void> setArgV0;
}
