package mirror.android.content;

import android.os.Bundle;
import com.lody.virtual.helper.compat.ObjectsCompat;
import mirror.RefClass;
import mirror.RefLong;

/* loaded from: classes4.dex */
public class PeriodicSync {
    public static Class<?> TYPE = RefClass.load(PeriodicSync.class, (Class<?>) android.content.PeriodicSync.class);
    public static RefLong flexTime;

    public static android.content.PeriodicSync clone(android.content.PeriodicSync periodicSync) {
        android.content.PeriodicSync periodicSync2 = new android.content.PeriodicSync(periodicSync.account, periodicSync.authority, periodicSync.extras, periodicSync.period);
        RefLong refLong = flexTime;
        refLong.set(periodicSync2, refLong.get(periodicSync));
        return periodicSync2;
    }

    public static boolean syncExtrasEquals(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        if (bundle.isEmpty()) {
            return true;
        }
        for (String str : bundle.keySet()) {
            if (!bundle2.containsKey(str) || !ObjectsCompat.equals(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }
}
