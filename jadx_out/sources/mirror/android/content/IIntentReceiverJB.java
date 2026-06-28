package mirror.android.content;

import android.os.Bundle;
import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefMethod;

/* loaded from: classes4.dex */
public class IIntentReceiverJB {
    public static Class<?> TYPE = RefClass.load((Class<?>) IIntentReceiverJB.class, "android.content.IIntentReceiver");

    @MethodParams({android.content.Intent.class, int.class, String.class, Bundle.class, boolean.class, boolean.class, int.class})
    public static RefMethod<Void> performReceive;
}
