package mirror.android.os;

import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class Message {
    public static Class<?> TYPE = RefClass.load(Message.class, (Class<?>) android.os.Message.class);

    @MethodParams({int.class})
    public static RefStaticMethod<Void> updateCheckRecycle;
}
