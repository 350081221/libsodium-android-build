package androidx.core.location;

import android.location.LocationManager;
import androidx.core.location.LocationManagerCompat;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocationManager f405a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationManagerCompat.GpsStatusTransport f406b;

    public /* synthetic */ p(LocationManager locationManager, LocationManagerCompat.GpsStatusTransport gpsStatusTransport) {
        this.f405a = locationManager;
        this.f406b = gpsStatusTransport;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean lambda$registerGnssStatusCallback$1;
        lambda$registerGnssStatusCallback$1 = LocationManagerCompat.lambda$registerGnssStatusCallback$1(this.f405a, this.f406b);
        return lambda$registerGnssStatusCallback$1;
    }
}
