package org.osmdroid.views.overlay;

import android.graphics.Canvas;
import android.graphics.Point;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.osmdroid.api.IMapView;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.Overlay;
import s4.b;

/* loaded from: classes4.dex */
public class DefaultOverlayManager extends AbstractList<Overlay> implements OverlayManager {
    private final CopyOnWriteArrayList<Overlay> mOverlayList;
    private TilesOverlay mTilesOverlay;

    public DefaultOverlayManager(TilesOverlay tilesOverlay) {
        setTilesOverlay(tilesOverlay);
        this.mOverlayList = new CopyOnWriteArrayList<>();
    }

    private void onDrawHelper(Canvas canvas, MapView mapView, Projection projection) {
        TilesOverlay tilesOverlay = this.mTilesOverlay;
        if (tilesOverlay != null) {
            tilesOverlay.protectDisplayedTilesForCache(canvas, projection);
        }
        Iterator<Overlay> it = this.mOverlayList.iterator();
        while (it.hasNext()) {
            Overlay next = it.next();
            if (next != null && next.isEnabled() && (next instanceof TilesOverlay)) {
                ((TilesOverlay) next).protectDisplayedTilesForCache(canvas, projection);
            }
        }
        TilesOverlay tilesOverlay2 = this.mTilesOverlay;
        if (tilesOverlay2 != null && tilesOverlay2.isEnabled()) {
            if (mapView != null) {
                this.mTilesOverlay.draw(canvas, mapView, false);
            } else {
                this.mTilesOverlay.draw(canvas, projection);
            }
        }
        Iterator<Overlay> it2 = this.mOverlayList.iterator();
        while (it2.hasNext()) {
            Overlay next2 = it2.next();
            if (next2 != null && next2.isEnabled()) {
                if (mapView != null) {
                    next2.draw(canvas, mapView, false);
                } else {
                    next2.draw(canvas, projection);
                }
            }
        }
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public TilesOverlay getTilesOverlay() {
        return this.mTilesOverlay;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public boolean onCreateOptionsMenu(Menu menu, int i5, MapView mapView) {
        boolean z4 = true;
        for (b bVar : overlaysReversed()) {
            if (bVar instanceof IOverlayMenuProvider) {
                IOverlayMenuProvider iOverlayMenuProvider = (IOverlayMenuProvider) bVar;
                if (iOverlayMenuProvider.isOptionsMenuEnabled()) {
                    z4 &= iOverlayMenuProvider.onCreateOptionsMenu(menu, i5, mapView);
                }
            }
        }
        TilesOverlay tilesOverlay = this.mTilesOverlay;
        if (tilesOverlay != null && tilesOverlay.isOptionsMenuEnabled()) {
            return z4 & this.mTilesOverlay.onCreateOptionsMenu(menu, i5, mapView);
        }
        return z4;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public void onDetach(MapView mapView) {
        TilesOverlay tilesOverlay = this.mTilesOverlay;
        if (tilesOverlay != null) {
            tilesOverlay.onDetach(mapView);
        }
        Iterator<Overlay> it = overlaysReversed().iterator();
        while (it.hasNext()) {
            it.next().onDetach(mapView);
        }
        clear();
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public boolean onDoubleTap(MotionEvent motionEvent, MapView mapView) {
        Iterator<Overlay> it = overlaysReversed().iterator();
        while (it.hasNext()) {
            if (it.next().onDoubleTap(motionEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public boolean onDoubleTapEvent(MotionEvent motionEvent, MapView mapView) {
        Iterator<Overlay> it = overlaysReversed().iterator();
        while (it.hasNext()) {
            if (it.next().onDoubleTapEvent(motionEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public boolean onDown(MotionEvent motionEvent, MapView mapView) {
        Iterator<Overlay> it = overlaysReversed().iterator();
        while (it.hasNext()) {
            if (it.next().onDown(motionEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public void onDraw(Canvas canvas, MapView mapView) {
        onDrawHelper(canvas, mapView, mapView.getProjection());
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6, MapView mapView) {
        Iterator<Overlay> it = overlaysReversed().iterator();
        while (it.hasNext()) {
            if (it.next().onFling(motionEvent, motionEvent2, f5, f6, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public boolean onKeyDown(int i5, KeyEvent keyEvent, MapView mapView) {
        Iterator<Overlay> it = overlaysReversed().iterator();
        while (it.hasNext()) {
            if (it.next().onKeyDown(i5, keyEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public boolean onKeyUp(int i5, KeyEvent keyEvent, MapView mapView) {
        Iterator<Overlay> it = overlaysReversed().iterator();
        while (it.hasNext()) {
            if (it.next().onKeyUp(i5, keyEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public boolean onLongPress(MotionEvent motionEvent, MapView mapView) {
        Iterator<Overlay> it = overlaysReversed().iterator();
        while (it.hasNext()) {
            if (it.next().onLongPress(motionEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public boolean onOptionsItemSelected(MenuItem menuItem, int i5, MapView mapView) {
        for (b bVar : overlaysReversed()) {
            if (bVar instanceof IOverlayMenuProvider) {
                IOverlayMenuProvider iOverlayMenuProvider = (IOverlayMenuProvider) bVar;
                if (iOverlayMenuProvider.isOptionsMenuEnabled() && iOverlayMenuProvider.onOptionsItemSelected(menuItem, i5, mapView)) {
                    return true;
                }
            }
        }
        TilesOverlay tilesOverlay = this.mTilesOverlay;
        if (tilesOverlay != null && tilesOverlay.isOptionsMenuEnabled() && this.mTilesOverlay.onOptionsItemSelected(menuItem, i5, mapView)) {
            return true;
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public void onPause() {
        TilesOverlay tilesOverlay = this.mTilesOverlay;
        if (tilesOverlay != null) {
            tilesOverlay.onPause();
        }
        Iterator<Overlay> it = overlaysReversed().iterator();
        while (it.hasNext()) {
            it.next().onPause();
        }
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public boolean onPrepareOptionsMenu(Menu menu, int i5, MapView mapView) {
        for (b bVar : overlaysReversed()) {
            if (bVar instanceof IOverlayMenuProvider) {
                IOverlayMenuProvider iOverlayMenuProvider = (IOverlayMenuProvider) bVar;
                if (iOverlayMenuProvider.isOptionsMenuEnabled()) {
                    iOverlayMenuProvider.onPrepareOptionsMenu(menu, i5, mapView);
                }
            }
        }
        TilesOverlay tilesOverlay = this.mTilesOverlay;
        if (tilesOverlay != null && tilesOverlay.isOptionsMenuEnabled()) {
            this.mTilesOverlay.onPrepareOptionsMenu(menu, i5, mapView);
            return true;
        }
        return true;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public void onResume() {
        TilesOverlay tilesOverlay = this.mTilesOverlay;
        if (tilesOverlay != null) {
            tilesOverlay.onResume();
        }
        Iterator<Overlay> it = overlaysReversed().iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f6, MapView mapView) {
        Iterator<Overlay> it = overlaysReversed().iterator();
        while (it.hasNext()) {
            if (it.next().onScroll(motionEvent, motionEvent2, f5, f6, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public void onShowPress(MotionEvent motionEvent, MapView mapView) {
        Iterator<Overlay> it = overlaysReversed().iterator();
        while (it.hasNext()) {
            it.next().onShowPress(motionEvent, mapView);
        }
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public boolean onSingleTapConfirmed(MotionEvent motionEvent, MapView mapView) {
        Iterator<Overlay> it = overlaysReversed().iterator();
        while (it.hasNext()) {
            if (it.next().onSingleTapConfirmed(motionEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public boolean onSingleTapUp(MotionEvent motionEvent, MapView mapView) {
        Iterator<Overlay> it = overlaysReversed().iterator();
        while (it.hasNext()) {
            if (it.next().onSingleTapUp(motionEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public boolean onSnapToItem(int i5, int i6, Point point, IMapView iMapView) {
        for (b bVar : overlaysReversed()) {
            if ((bVar instanceof Overlay.Snappable) && ((Overlay.Snappable) bVar).onSnapToItem(i5, i6, point, iMapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public boolean onTouchEvent(MotionEvent motionEvent, MapView mapView) {
        Iterator<Overlay> it = overlaysReversed().iterator();
        while (it.hasNext()) {
            if (it.next().onTouchEvent(motionEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public boolean onTrackballEvent(MotionEvent motionEvent, MapView mapView) {
        Iterator<Overlay> it = overlaysReversed().iterator();
        while (it.hasNext()) {
            if (it.next().onTrackballEvent(motionEvent, mapView)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public List<Overlay> overlays() {
        return this.mOverlayList;
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public Iterable<Overlay> overlaysReversed() {
        return new Iterable<Overlay>() { // from class: org.osmdroid.views.overlay.DefaultOverlayManager.1
            private ListIterator<Overlay> bulletProofReverseListIterator() {
                while (true) {
                    try {
                        return DefaultOverlayManager.this.mOverlayList.listIterator(DefaultOverlayManager.this.mOverlayList.size());
                    } catch (IndexOutOfBoundsException unused) {
                    }
                }
            }

            @Override // java.lang.Iterable
            public Iterator<Overlay> iterator() {
                final ListIterator<Overlay> bulletProofReverseListIterator = bulletProofReverseListIterator();
                return new Iterator<Overlay>() { // from class: org.osmdroid.views.overlay.DefaultOverlayManager.1.1
                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return bulletProofReverseListIterator.hasPrevious();
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        bulletProofReverseListIterator.remove();
                    }

                    @Override // java.util.Iterator
                    public Overlay next() {
                        return (Overlay) bulletProofReverseListIterator.previous();
                    }
                };
            }
        };
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public void setOptionsMenusEnabled(boolean z4) {
        Iterator<Overlay> it = this.mOverlayList.iterator();
        while (it.hasNext()) {
            b bVar = (Overlay) it.next();
            if (bVar instanceof IOverlayMenuProvider) {
                IOverlayMenuProvider iOverlayMenuProvider = (IOverlayMenuProvider) bVar;
                if (iOverlayMenuProvider.isOptionsMenuEnabled()) {
                    iOverlayMenuProvider.setOptionsMenuEnabled(z4);
                }
            }
        }
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public void setTilesOverlay(TilesOverlay tilesOverlay) {
        this.mTilesOverlay = tilesOverlay;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, org.osmdroid.views.overlay.OverlayManager
    public int size() {
        return this.mOverlayList.size();
    }

    @Override // java.util.AbstractList, java.util.List, org.osmdroid.views.overlay.OverlayManager
    public void add(int i5, Overlay overlay) {
        if (overlay == null) {
            Log.e(IMapView.LOGTAG, "Attempt to add a null overlay to the collection. This is probably a bug and should be reported!", new Exception());
        } else {
            this.mOverlayList.add(i5, overlay);
        }
    }

    @Override // java.util.AbstractList, java.util.List, org.osmdroid.views.overlay.OverlayManager
    public Overlay get(int i5) {
        return this.mOverlayList.get(i5);
    }

    @Override // org.osmdroid.views.overlay.OverlayManager
    public void onDraw(Canvas canvas, Projection projection) {
        onDrawHelper(canvas, null, projection);
    }

    @Override // java.util.AbstractList, java.util.List, org.osmdroid.views.overlay.OverlayManager
    public Overlay remove(int i5) {
        return this.mOverlayList.remove(i5);
    }

    @Override // java.util.AbstractList, java.util.List, org.osmdroid.views.overlay.OverlayManager
    public Overlay set(int i5, Overlay overlay) {
        if (overlay == null) {
            Log.e(IMapView.LOGTAG, "Attempt to set a null overlay to the collection. This is probably a bug and should be reported!", new Exception());
            return null;
        }
        return this.mOverlayList.set(i5, overlay);
    }
}
