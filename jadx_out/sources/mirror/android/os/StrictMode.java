package mirror.android.os;

import mirror.RefClass;
import mirror.RefStaticInt;
import mirror.RefStaticMethod;

/* loaded from: classes4.dex */
public class StrictMode {
    public static RefStaticInt DETECT_VM_FILE_URI_EXPOSURE;
    public static RefStaticInt PENALTY_DEATH_ON_FILE_URI_EXPOSURE;
    public static Class<?> TYPE = RefClass.load((Class<?>) StrictMode.class, "android.os.StrictMode");
    public static RefStaticMethod<Void> disableDeathOnFileUriExposure;
    public static RefStaticInt sVmPolicyMask;
}
