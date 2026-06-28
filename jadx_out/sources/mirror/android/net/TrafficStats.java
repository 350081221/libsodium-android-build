package mirror.android.net;

import android.os.IInterface;
import mirror.RefClass;
import mirror.RefStaticObject;

/* loaded from: classes4.dex */
public class TrafficStats {
    public static Class<?> TYPE = RefClass.load(TrafficStats.class, (Class<?>) android.net.TrafficStats.class);
    public static RefStaticObject<IInterface> sStatsService;

    public static IInterface sStatsService() {
        RefStaticObject<IInterface> refStaticObject = sStatsService;
        if (refStaticObject != null) {
            return refStaticObject.get();
        }
        return null;
    }

    public static void sStatsService(IInterface iInterface) {
        RefStaticObject<IInterface> refStaticObject = sStatsService;
        if (refStaticObject != null) {
            refStaticObject.set(iInterface);
        }
    }
}
