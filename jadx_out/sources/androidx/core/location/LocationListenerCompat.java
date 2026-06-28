package androidx.core.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes2.dex */
public interface LocationListenerCompat extends LocationListener {
    @Override // android.location.LocationListener
    default void onFlushComplete(int i5) {
    }

    @Override // android.location.LocationListener
    default void onLocationChanged(@NonNull List<Location> list) {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            onLocationChanged(list.get(i5));
        }
    }

    @Override // android.location.LocationListener
    default void onProviderDisabled(@NonNull String str) {
    }

    @Override // android.location.LocationListener
    default void onProviderEnabled(@NonNull String str) {
    }

    @Override // android.location.LocationListener
    default void onStatusChanged(@NonNull String str, int i5, @Nullable Bundle bundle) {
    }
}
