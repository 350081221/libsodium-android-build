package mirror.com.android.internal.policy;

import android.os.IInterface;
import mirror.RefClass;
import mirror.RefStaticObject;

/* loaded from: classes4.dex */
public class PhoneWindow {
    public static Class<?> TYPE;
    public static RefStaticObject<IInterface> sWindowManager;

    static {
        Class<?> load = RefClass.load((Class<?>) PhoneWindow.class, "com.android.internal.policy.impl.PhoneWindow$WindowManagerHolder");
        TYPE = load;
        if (load == null) {
            TYPE = RefClass.load((Class<?>) PhoneWindow.class, "com.android.internal.policy.PhoneWindow$WindowManagerHolder");
        }
    }
}
