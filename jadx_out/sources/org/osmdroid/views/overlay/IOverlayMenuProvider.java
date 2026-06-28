package org.osmdroid.views.overlay;

import android.view.Menu;
import android.view.MenuItem;
import org.osmdroid.views.MapView;

/* loaded from: classes4.dex */
public interface IOverlayMenuProvider {
    boolean isOptionsMenuEnabled();

    boolean onCreateOptionsMenu(Menu menu, int i5, MapView mapView);

    boolean onOptionsItemSelected(MenuItem menuItem, int i5, MapView mapView);

    boolean onPrepareOptionsMenu(Menu menu, int i5, MapView mapView);

    void setOptionsMenuEnabled(boolean z4);
}
