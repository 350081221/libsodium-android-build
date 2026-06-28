package mirror.android.location;

import mirror.MethodParams;
import mirror.RefClass;
import mirror.RefMethod;

/* loaded from: classes4.dex */
public class GpsStatusL {
    public static Class<?> TYPE = RefClass.load(GpsStatusL.class, (Class<?>) android.location.GpsStatus.class);

    @MethodParams({int.class, int[].class, float[].class, float[].class, float[].class, int[].class, int[].class, int[].class})
    public static RefMethod<Void> setStatus;
}
