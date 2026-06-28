package org.osmdroid.views.overlay.gestures;

import android.R;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.IOverlayMenuProvider;
import org.osmdroid.views.overlay.Overlay;
import org.osmdroid.views.overlay.gestures.RotationGestureDetector;

/* loaded from: classes4.dex */
public class RotationGestureOverlay extends Overlay implements RotationGestureDetector.RotationListener, IOverlayMenuProvider {
    private static final int MENU_ENABLED = Overlay.getSafeMenuId();
    private static final int MENU_ROTATE_CCW = Overlay.getSafeMenuId();
    private static final int MENU_ROTATE_CW = Overlay.getSafeMenuId();
    private static final boolean SHOW_ROTATE_MENU_ITEMS = false;
    float currentAngle;
    final long deltaTime;
    private MapView mMapView;
    private boolean mOptionsMenuEnabled;
    private final RotationGestureDetector mRotationDetector;
    long timeLastSet;

    @Deprecated
    public RotationGestureOverlay(Context context, MapView mapView) {
        this(mapView);
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean isOptionsMenuEnabled() {
        return this.mOptionsMenuEnabled;
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onCreateOptionsMenu(Menu menu, int i5, MapView mapView) {
        menu.add(0, MENU_ENABLED + i5, 0, "Enable rotation").setIcon(R.drawable.ic_menu_info_details);
        return true;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        this.mMapView = null;
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onOptionsItemSelected(MenuItem menuItem, int i5, MapView mapView) {
        if (menuItem.getItemId() == MENU_ENABLED + i5) {
            if (isEnabled()) {
                this.mMapView.setMapOrientation(0.0f);
                setEnabled(false);
            } else {
                setEnabled(true);
                return true;
            }
        } else if (menuItem.getItemId() == MENU_ROTATE_CCW + i5) {
            MapView mapView2 = this.mMapView;
            mapView2.setMapOrientation(mapView2.getMapOrientation() - 10.0f);
        } else if (menuItem.getItemId() == MENU_ROTATE_CW + i5) {
            MapView mapView3 = this.mMapView;
            mapView3.setMapOrientation(mapView3.getMapOrientation() + 10.0f);
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public boolean onPrepareOptionsMenu(Menu menu, int i5, MapView mapView) {
        String str;
        MenuItem findItem = menu.findItem(MENU_ENABLED + i5);
        if (isEnabled()) {
            str = "Disable rotation";
        } else {
            str = "Enable rotation";
        }
        findItem.setTitle(str);
        return false;
    }

    @Override // org.osmdroid.views.overlay.gestures.RotationGestureDetector.RotationListener
    public void onRotate(float f5) {
        this.currentAngle += f5;
        if (System.currentTimeMillis() - 25 > this.timeLastSet) {
            this.timeLastSet = System.currentTimeMillis();
            MapView mapView = this.mMapView;
            mapView.setMapOrientation(mapView.getMapOrientation() + this.currentAngle);
        }
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onTouchEvent(MotionEvent motionEvent, MapView mapView) {
        this.mRotationDetector.onTouch(motionEvent);
        return super.onTouchEvent(motionEvent, mapView);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void setEnabled(boolean z4) {
        this.mRotationDetector.setEnabled(z4);
        super.setEnabled(z4);
    }

    @Override // org.osmdroid.views.overlay.IOverlayMenuProvider
    public void setOptionsMenuEnabled(boolean z4) {
        this.mOptionsMenuEnabled = z4;
    }

    public RotationGestureOverlay(MapView mapView) {
        this.mOptionsMenuEnabled = true;
        this.timeLastSet = 0L;
        this.deltaTime = 25L;
        this.currentAngle = 0.0f;
        this.mMapView = mapView;
        this.mRotationDetector = new RotationGestureDetector(this);
    }
}
