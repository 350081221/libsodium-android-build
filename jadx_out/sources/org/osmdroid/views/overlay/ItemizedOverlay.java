package org.osmdroid.views.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;
import org.osmdroid.util.RectL;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.Overlay;
import org.osmdroid.views.overlay.OverlayItem;

/* loaded from: classes4.dex */
public abstract class ItemizedOverlay<Item extends OverlayItem> extends Overlay implements Overlay.Snappable {
    private Rect itemRect;
    private final Point mCurScreenCoords;
    protected final Drawable mDefaultMarker;
    protected boolean mDrawFocusedItem;
    protected int mDrawnItemsLimit;
    private Item mFocusedItem;
    private boolean[] mInternalItemDisplayedList;
    private final ArrayList<Item> mInternalItemList;
    private final Rect mMarkerRect;
    private OnFocusChangeListener mOnFocusChangeListener;
    private final Rect mOrientedMarkerRect;
    private boolean mPendingFocusChangedEvent;
    private final Rect mRect;
    private Rect screenRect;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.osmdroid.views.overlay.ItemizedOverlay$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace;

        static {
            int[] iArr = new int[OverlayItem.HotspotPlace.values().length];
            $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace = iArr;
            try {
                iArr[OverlayItem.HotspotPlace.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.LEFT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.UPPER_LEFT_CORNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.LOWER_LEFT_CORNER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.BOTTOM_CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.TOP_CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.RIGHT_CENTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.UPPER_RIGHT_CORNER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace[OverlayItem.HotspotPlace.LOWER_RIGHT_CORNER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface OnFocusChangeListener {
        void onFocusChanged(ItemizedOverlay<?> itemizedOverlay, OverlayItem overlayItem);
    }

    @Deprecated
    public ItemizedOverlay(Context context, Drawable drawable) {
        this(drawable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r8 != 6) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.drawable.Drawable boundToHotspot(android.graphics.drawable.Drawable r7, org.osmdroid.views.overlay.OverlayItem.HotspotPlace r8) {
        /*
            r6 = this;
            if (r8 != 0) goto L4
            org.osmdroid.views.overlay.OverlayItem$HotspotPlace r8 = org.osmdroid.views.overlay.OverlayItem.HotspotPlace.BOTTOM_CENTER
        L4:
            int r0 = r7.getIntrinsicWidth()
            int r1 = r7.getIntrinsicHeight()
            int[] r2 = org.osmdroid.views.overlay.ItemizedOverlay.AnonymousClass1.$SwitchMap$org$osmdroid$views$overlay$OverlayItem$HotspotPlace
            int r3 = r8.ordinal()
            r3 = r2[r3]
            r4 = 0
            r5 = 2
            switch(r3) {
                case 5: goto L1d;
                case 6: goto L1d;
                case 7: goto L1d;
                case 8: goto L1b;
                case 9: goto L1b;
                case 10: goto L1b;
                default: goto L19;
            }
        L19:
            r3 = r4
            goto L1f
        L1b:
            int r3 = -r0
            goto L1f
        L1d:
            int r3 = -r0
            int r3 = r3 / r5
        L1f:
            int r8 = r8.ordinal()
            r8 = r2[r8]
            if (r8 == r5) goto L3b
            r2 = 8
            if (r8 == r2) goto L3b
            r2 = 10
            if (r8 == r2) goto L39
            r2 = 4
            if (r8 == r2) goto L39
            r2 = 5
            if (r8 == r2) goto L3b
            r2 = 6
            if (r8 == r2) goto L39
            goto L3e
        L39:
            int r4 = -r1
            goto L3e
        L3b:
            int r8 = -r1
            int r4 = r8 / 2
        L3e:
            int r0 = r0 + r3
            int r1 = r1 + r4
            r7.setBounds(r3, r4, r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.views.overlay.ItemizedOverlay.boundToHotspot(android.graphics.drawable.Drawable, org.osmdroid.views.overlay.OverlayItem$HotspotPlace):android.graphics.drawable.Drawable");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ca, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected android.graphics.Rect calculateItemRect(Item r5, android.graphics.Point r6, android.graphics.Rect r7) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.osmdroid.views.overlay.ItemizedOverlay.calculateItemRect(org.osmdroid.views.overlay.OverlayItem, android.graphics.Point, android.graphics.Rect):android.graphics.Rect");
    }

    protected abstract Item createItem(int i5);

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        OnFocusChangeListener onFocusChangeListener;
        if (this.mPendingFocusChangedEvent && (onFocusChangeListener = this.mOnFocusChangeListener) != null) {
            onFocusChangeListener.onFocusChanged(this, this.mFocusedItem);
        }
        this.mPendingFocusChangedEvent = false;
        int min = Math.min(this.mInternalItemList.size(), this.mDrawnItemsLimit);
        boolean[] zArr = this.mInternalItemDisplayedList;
        if (zArr == null || zArr.length != min) {
            this.mInternalItemDisplayedList = new boolean[min];
        }
        for (int i5 = min - 1; i5 >= 0; i5--) {
            Item item = getItem(i5);
            if (item != null) {
                projection.toPixels(item.getPoint(), this.mCurScreenCoords);
                calculateItemRect(item, this.mCurScreenCoords, this.itemRect);
                this.mInternalItemDisplayedList[i5] = onDrawItem(canvas, item, this.mCurScreenCoords, projection);
            }
        }
    }

    protected Drawable getDefaultMarker(int i5) {
        OverlayItem.setState(this.mDefaultMarker, i5);
        return this.mDefaultMarker;
    }

    public List<Item> getDisplayedItems() {
        ArrayList arrayList = new ArrayList();
        if (this.mInternalItemDisplayedList == null) {
            return arrayList;
        }
        int i5 = 0;
        while (true) {
            boolean[] zArr = this.mInternalItemDisplayedList;
            if (i5 < zArr.length) {
                if (zArr[i5]) {
                    arrayList.add(getItem(i5));
                }
                i5++;
            } else {
                return arrayList;
            }
        }
    }

    public int getDrawnItemsLimit() {
        return this.mDrawnItemsLimit;
    }

    public Item getFocus() {
        return this.mFocusedItem;
    }

    public final Item getItem(int i5) {
        try {
            return this.mInternalItemList.get(i5);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    protected boolean hitTest(Item item, Drawable drawable, int i5, int i6) {
        return drawable.getBounds().contains(i5, i6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isEventOnItem(Item item, int i5, int i6, MapView mapView) {
        int i7 = 0;
        if (item == null) {
            return false;
        }
        mapView.getProjection().toPixels(item.getPoint(), this.mCurScreenCoords);
        if (this.mDrawFocusedItem && this.mFocusedItem == item) {
            i7 = 4;
        }
        Drawable marker = item.getMarker(i7);
        if (marker == null) {
            marker = getDefaultMarker(i7);
        }
        boundToHotspot(marker, item.getMarkerHotspot());
        marker.copyBounds(this.mRect);
        Rect rect = this.mRect;
        Point point = this.mCurScreenCoords;
        rect.offset(point.x, point.y);
        Rect rect2 = this.mRect;
        Point point2 = this.mCurScreenCoords;
        RectL.getBounds(rect2, point2.x, point2.y, -mapView.getMapOrientation(), this.mOrientedMarkerRect);
        return this.mOrientedMarkerRect.contains(i5, i6);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
    }

    protected boolean onDrawItem(Canvas canvas, Item item, Point point, Projection projection) {
        int i5;
        Drawable marker;
        if (this.mDrawFocusedItem && this.mFocusedItem == item) {
            i5 = 4;
        } else {
            i5 = 0;
        }
        if (item.getMarker(i5) == null) {
            marker = getDefaultMarker(i5);
        } else {
            marker = item.getMarker(i5);
        }
        boundToHotspot(marker, item.getMarkerHotspot());
        Point point2 = this.mCurScreenCoords;
        int i6 = point2.x;
        int i7 = point2.y;
        marker.copyBounds(this.mRect);
        this.mMarkerRect.set(this.mRect);
        this.mRect.offset(i6, i7);
        RectL.getBounds(this.mRect, i6, i7, projection.getOrientation(), this.mOrientedMarkerRect);
        boolean intersects = Rect.intersects(this.mOrientedMarkerRect, canvas.getClipBounds());
        if (intersects) {
            if (projection.getOrientation() != 0.0f) {
                canvas.save();
                canvas.rotate(-projection.getOrientation(), i6, i7);
            }
            marker.setBounds(this.mRect);
            marker.draw(canvas);
            if (projection.getOrientation() != 0.0f) {
                canvas.restore();
            }
            marker.setBounds(this.mMarkerRect);
        }
        return intersects;
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public boolean onSingleTapConfirmed(MotionEvent motionEvent, MapView mapView) {
        int size = size();
        int round = Math.round(motionEvent.getX());
        int round2 = Math.round(motionEvent.getY());
        for (int i5 = 0; i5 < size; i5++) {
            if (isEventOnItem(getItem(i5), round, round2, mapView) && onTap(i5)) {
                return true;
            }
        }
        return super.onSingleTapConfirmed(motionEvent, mapView);
    }

    protected boolean onTap(int i5) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void populate() {
        int size = size();
        this.mInternalItemList.clear();
        this.mInternalItemList.ensureCapacity(size);
        for (int i5 = 0; i5 < size; i5++) {
            this.mInternalItemList.add(createItem(i5));
        }
        this.mInternalItemDisplayedList = null;
    }

    public void setDrawFocusedItem(boolean z4) {
        this.mDrawFocusedItem = z4;
    }

    public void setDrawnItemsLimit(int i5) {
        this.mDrawnItemsLimit = i5;
    }

    public void setFocus(Item item) {
        boolean z4;
        if (item != this.mFocusedItem) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mPendingFocusChangedEvent = z4;
        this.mFocusedItem = item;
    }

    public void setOnFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.mOnFocusChangeListener = onFocusChangeListener;
    }

    public abstract int size();

    public ItemizedOverlay(Drawable drawable) {
        this.mDrawnItemsLimit = Integer.MAX_VALUE;
        this.mRect = new Rect();
        this.mMarkerRect = new Rect();
        this.mOrientedMarkerRect = new Rect();
        this.mCurScreenCoords = new Point();
        this.mDrawFocusedItem = true;
        this.mPendingFocusChangedEvent = false;
        this.itemRect = new Rect();
        this.screenRect = new Rect();
        if (drawable != null) {
            this.mDefaultMarker = drawable;
            this.mInternalItemList = new ArrayList<>();
            return;
        }
        throw new IllegalArgumentException("You must pass a default marker to ItemizedOverlay.");
    }
}
