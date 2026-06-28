package org.osmdroid.views.overlay;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import org.osmdroid.api.IGeoPoint;

/* loaded from: classes4.dex */
public class OverlayItem {
    protected static final Point DEFAULT_MARKER_SIZE = new Point(26, 94);
    public static final int ITEM_STATE_FOCUSED_MASK = 4;
    public static final int ITEM_STATE_PRESSED_MASK = 1;
    public static final int ITEM_STATE_SELECTED_MASK = 2;
    protected final IGeoPoint mGeoPoint;
    protected HotspotPlace mHotspotPlace;
    protected Drawable mMarker;
    protected final String mSnippet;
    protected final String mTitle;
    protected final String mUid;

    /* loaded from: classes4.dex */
    public enum HotspotPlace {
        NONE,
        CENTER,
        BOTTOM_CENTER,
        TOP_CENTER,
        RIGHT_CENTER,
        LEFT_CENTER,
        UPPER_RIGHT_CORNER,
        LOWER_RIGHT_CORNER,
        UPPER_LEFT_CORNER,
        LOWER_LEFT_CORNER
    }

    public OverlayItem(String str, String str2, IGeoPoint iGeoPoint) {
        this(null, str, str2, iGeoPoint);
    }

    public static void setState(Drawable drawable, int i5) {
        int[] iArr = new int[3];
        int i6 = 0;
        if ((i5 & 1) > 0) {
            iArr[0] = 16842919;
            i6 = 1;
        }
        if ((i5 & 2) > 0) {
            iArr[i6] = 16842913;
            i6++;
        }
        if ((i5 & 4) > 0) {
            iArr[i6] = 16842908;
        }
        drawable.setState(iArr);
    }

    public Drawable getDrawable() {
        return this.mMarker;
    }

    public int getHeight() {
        return this.mMarker.getIntrinsicHeight();
    }

    public Drawable getMarker(int i5) {
        Drawable drawable = this.mMarker;
        if (drawable == null) {
            return null;
        }
        setState(drawable, i5);
        return this.mMarker;
    }

    public HotspotPlace getMarkerHotspot() {
        return this.mHotspotPlace;
    }

    public IGeoPoint getPoint() {
        return this.mGeoPoint;
    }

    public String getSnippet() {
        return this.mSnippet;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getUid() {
        return this.mUid;
    }

    public int getWidth() {
        return this.mMarker.getIntrinsicWidth();
    }

    public void setMarker(Drawable drawable) {
        this.mMarker = drawable;
    }

    public void setMarkerHotspot(HotspotPlace hotspotPlace) {
        if (hotspotPlace == null) {
            hotspotPlace = HotspotPlace.BOTTOM_CENTER;
        }
        this.mHotspotPlace = hotspotPlace;
    }

    public OverlayItem(String str, String str2, String str3, IGeoPoint iGeoPoint) {
        this.mTitle = str2;
        this.mSnippet = str3;
        this.mGeoPoint = iGeoPoint;
        this.mUid = str;
    }
}
