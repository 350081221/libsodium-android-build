package mirror.android.location;

import mirror.RefClass;
import mirror.RefObject;

/* loaded from: classes4.dex */
public class GeocoderParams {
    public static Class<?> TYPE = RefClass.load((Class<?>) GeocoderParams.class, "android.location.GeocoderParams");
    public static RefObject<String> mPackageName;
    public static RefObject<Integer> mUid;

    public static void mPackageName(Object obj, String str) {
        RefObject<String> refObject = mPackageName;
        if (refObject != null) {
            refObject.set(obj, str);
        }
    }

    public static void mUid(Object obj, int i5) {
        RefObject<Integer> refObject = mUid;
        if (refObject != null) {
            refObject.set(obj, Integer.valueOf(i5));
        }
    }

    public static String mPackageName(Object obj) {
        RefObject<String> refObject = mPackageName;
        if (refObject != null) {
            return refObject.get(obj);
        }
        return null;
    }

    public static int mUid(Object obj) {
        RefObject<Integer> refObject = mUid;
        if (refObject != null) {
            return refObject.get(obj).intValue();
        }
        return 0;
    }
}
