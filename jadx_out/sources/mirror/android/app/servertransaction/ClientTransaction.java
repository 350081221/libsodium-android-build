package mirror.android.app.servertransaction;

import android.os.IBinder;
import java.util.List;
import mirror.RefClass;
import mirror.RefMethod;
import mirror.RefObject;

/* loaded from: classes4.dex */
public class ClientTransaction {
    public static Class<?> TYPE = RefClass.load((Class<?>) ClientTransaction.class, "android.app.servertransaction.ClientTransaction");
    public static RefMethod<List<Object>> getTransactionItems;
    public static RefObject<List<Object>> mActivityCallbacks;
    public static RefObject<IBinder> mActivityToken;
    public static RefObject<Object> mLifecycleStateRequest;
}
