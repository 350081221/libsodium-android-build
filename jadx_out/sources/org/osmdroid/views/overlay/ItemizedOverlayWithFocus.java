package org.osmdroid.views.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.core.view.ViewCompat;
import java.util.List;
import org.osmdroid.library.R;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;
import org.osmdroid.views.overlay.ItemizedIconOverlay;
import org.osmdroid.views.overlay.OverlayItem;

@Deprecated
/* loaded from: classes4.dex */
public class ItemizedOverlayWithFocus<Item extends OverlayItem> extends ItemizedIconOverlay<Item> {
    private final int DEFAULTMARKER_BACKGROUNDCOLOR;
    private int DESCRIPTION_BOX_CORNERWIDTH;
    private int DESCRIPTION_BOX_PADDING;
    private int DESCRIPTION_LINE_HEIGHT;
    private int DESCRIPTION_MAXWIDTH;
    private int DESCRIPTION_TITLE_EXTRA_LINE_HEIGHT;
    private int FONT_SIZE_DP;
    private String UNKNOWN;
    private int fontSizePixels;
    private Context mContext;
    protected Paint mDescriptionPaint;
    protected boolean mFocusItemsOnTap;
    protected int mFocusedItemIndex;
    private final Point mFocusedScreenCoords;
    protected Paint mMarkerBackgroundPaint;
    protected int mMarkerFocusedBackgroundColor;
    protected Drawable mMarkerFocusedBase;
    private final Rect mRect;
    protected Paint mTitlePaint;

    public ItemizedOverlayWithFocus(Context context, List<Item> list, ItemizedIconOverlay.OnItemGestureListener<Item> onItemGestureListener) {
        this(list, onItemGestureListener, context);
    }

    private void calculateDrawSettings() {
        int applyDimension = (int) TypedValue.applyDimension(1, this.FONT_SIZE_DP, this.mContext.getResources().getDisplayMetrics());
        this.fontSizePixels = applyDimension;
        this.DESCRIPTION_LINE_HEIGHT = applyDimension + 5;
        this.DESCRIPTION_MAXWIDTH = (int) (this.mContext.getResources().getDisplayMetrics().widthPixels * 0.8d);
        this.UNKNOWN = this.mContext.getResources().getString(R.string.W);
        this.mMarkerBackgroundPaint = new Paint();
        Paint paint = new Paint();
        this.mDescriptionPaint = paint;
        paint.setAntiAlias(true);
        this.mDescriptionPaint.setTextSize(this.fontSizePixels);
        Paint paint2 = new Paint();
        this.mTitlePaint = paint2;
        paint2.setTextSize(this.fontSizePixels);
        this.mTitlePaint.setFakeBoldText(true);
        this.mTitlePaint.setAntiAlias(true);
    }

    @Override // org.osmdroid.views.overlay.ItemizedOverlay, org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        List<Item> list;
        String title;
        String snippet;
        boolean z4;
        super.draw(canvas, projection);
        int i5 = this.mFocusedItemIndex;
        if (i5 == Integer.MIN_VALUE || (list = this.mItemList) == null) {
            return;
        }
        Item item = list.get(i5);
        Drawable marker = item.getMarker(4);
        if (marker == null) {
            marker = this.mMarkerFocusedBase;
        }
        Drawable drawable = marker;
        projection.toPixels(item.getPoint(), this.mFocusedScreenCoords);
        drawable.copyBounds(this.mRect);
        Rect rect = this.mRect;
        Point point = this.mFocusedScreenCoords;
        rect.offset(point.x, point.y);
        if (item.getTitle() == null) {
            title = this.UNKNOWN;
        } else {
            title = item.getTitle();
        }
        if (item.getSnippet() == null) {
            snippet = this.UNKNOWN;
        } else {
            snippet = item.getSnippet();
        }
        int length = snippet.length();
        float[] fArr = new float[length];
        this.mDescriptionPaint.getTextWidths(snippet, fArr);
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i6 < length) {
            if (!Character.isLetter(snippet.charAt(i6))) {
                i10 = i6;
            }
            float f5 = fArr[i6];
            if (snippet.charAt(i6) == '\n') {
                int i11 = i6 + 1;
                sb.append(snippet.subSequence(i7, i11));
                i10 = i11;
                i8 = Math.max(i8, i9);
                i9 = 0;
                i7 = i10;
            } else {
                if (i9 + f5 > this.DESCRIPTION_MAXWIDTH) {
                    if (i7 == i10) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        i6 = i10;
                    }
                    sb.append(snippet.subSequence(i7, i6));
                    sb.append('\n');
                    i8 = Math.max(i8, i9);
                    if (z4) {
                        i7 = i6;
                        i10 = i7;
                        i9 = 0;
                        i6--;
                    } else {
                        i7 = i6;
                        i10 = i7;
                        i9 = 0;
                    }
                }
                i9 = (int) (i9 + f5);
            }
            i6++;
        }
        if (i6 != i7) {
            String substring = snippet.substring(i7, i6);
            i8 = Math.max(i8, (int) this.mDescriptionPaint.measureText(substring));
            sb.append(substring);
        }
        String[] split = sb.toString().split("\n");
        int min = Math.min(Math.max(i8, (int) this.mDescriptionPaint.measureText(title)), this.DESCRIPTION_MAXWIDTH);
        Rect rect2 = this.mRect;
        int width = ((rect2.left - (min / 2)) - this.DESCRIPTION_BOX_PADDING) + (rect2.width() / 2);
        int i12 = this.DESCRIPTION_BOX_PADDING;
        int i13 = min + width + (i12 * 2);
        int i14 = this.mRect.top;
        int length2 = ((i14 - this.DESCRIPTION_TITLE_EXTRA_LINE_HEIGHT) - ((split.length + 1) * this.DESCRIPTION_LINE_HEIGHT)) - (i12 * 2);
        if (projection.getOrientation() != 0.0f) {
            canvas.save();
            float f6 = -projection.getOrientation();
            Point point2 = this.mFocusedScreenCoords;
            canvas.rotate(f6, point2.x, point2.y);
        }
        this.mMarkerBackgroundPaint.setColor(ViewCompat.MEASURED_STATE_MASK);
        RectF rectF = new RectF(width - 1, length2 - 1, i13 + 1, i14 + 1);
        int i15 = this.DESCRIPTION_BOX_CORNERWIDTH;
        canvas.drawRoundRect(rectF, i15, i15, this.mDescriptionPaint);
        this.mMarkerBackgroundPaint.setColor(this.mMarkerFocusedBackgroundColor);
        float f7 = width;
        float f8 = i13;
        RectF rectF2 = new RectF(f7, length2, f8, i14);
        int i16 = this.DESCRIPTION_BOX_CORNERWIDTH;
        canvas.drawRoundRect(rectF2, i16, i16, this.mMarkerBackgroundPaint);
        int i17 = this.DESCRIPTION_BOX_PADDING;
        int i18 = width + i17;
        int i19 = i14 - i17;
        for (int length3 = split.length - 1; length3 >= 0; length3--) {
            canvas.drawText(split[length3].trim(), i18, i19, this.mDescriptionPaint);
            i19 -= this.DESCRIPTION_LINE_HEIGHT;
        }
        canvas.drawText(title, i18, i19 - this.DESCRIPTION_TITLE_EXTRA_LINE_HEIGHT, this.mTitlePaint);
        float f9 = i19;
        canvas.drawLine(f7, f9, f8, f9, this.mDescriptionPaint);
        drawable.setBounds(this.mRect);
        drawable.draw(canvas);
        Rect rect3 = this.mRect;
        Point point3 = this.mFocusedScreenCoords;
        rect3.offset(-point3.x, -point3.y);
        drawable.setBounds(this.mRect);
        if (projection.getOrientation() != 0.0f) {
            canvas.restore();
        }
    }

    public Item getFocusedItem() {
        int i5 = this.mFocusedItemIndex;
        if (i5 == Integer.MIN_VALUE) {
            return null;
        }
        return this.mItemList.get(i5);
    }

    @Override // org.osmdroid.views.overlay.ItemizedIconOverlay, org.osmdroid.views.overlay.ItemizedOverlay, org.osmdroid.views.overlay.Overlay
    public void onDetach(MapView mapView) {
        super.onDetach(mapView);
        this.mContext = null;
    }

    @Override // org.osmdroid.views.overlay.ItemizedIconOverlay
    protected boolean onSingleTapUpHelper(int i5, Item item, MapView mapView) {
        if (this.mFocusItemsOnTap) {
            this.mFocusedItemIndex = i5;
            mapView.postInvalidate();
        }
        return this.mOnItemGestureListener.onItemSingleTapUp(i5, item);
    }

    public void setDescriptionBoxCornerWidth(int i5) {
        this.DESCRIPTION_BOX_CORNERWIDTH = i5;
    }

    public void setDescriptionBoxPadding(int i5) {
        this.DESCRIPTION_BOX_PADDING = i5;
    }

    public void setDescriptionLineHeight(int i5) {
        this.DESCRIPTION_LINE_HEIGHT = i5;
        calculateDrawSettings();
    }

    public void setDescriptionMaxWidth(int i5) {
        this.DESCRIPTION_MAXWIDTH = i5;
        calculateDrawSettings();
    }

    public void setDescriptionTitleExtraLineHeight(int i5) {
        this.DESCRIPTION_TITLE_EXTRA_LINE_HEIGHT = i5;
    }

    public void setFocusItemsOnTap(boolean z4) {
        this.mFocusItemsOnTap = z4;
    }

    public void setFocusedItem(int i5) {
        this.mFocusedItemIndex = i5;
    }

    public void setFontSize(int i5) {
        this.FONT_SIZE_DP = i5;
        calculateDrawSettings();
    }

    public void setMarkerBackgroundColor(int i5) {
        this.mMarkerFocusedBackgroundColor = i5;
    }

    public void setMarkerDescriptionForegroundColor(int i5) {
        this.mDescriptionPaint.setColor(i5);
    }

    public void setMarkerTitleForegroundColor(int i5) {
        this.mTitlePaint.setColor(i5);
    }

    public void unSetFocusedItem() {
        this.mFocusedItemIndex = Integer.MIN_VALUE;
    }

    public ItemizedOverlayWithFocus(List<Item> list, ItemizedIconOverlay.OnItemGestureListener<Item> onItemGestureListener, Context context) {
        this(list, context.getResources().getDrawable(R.drawable.f21666h), null, Integer.MIN_VALUE, onItemGestureListener, context);
    }

    public void setFocusedItem(Item item) {
        int indexOf = this.mItemList.indexOf(item);
        if (indexOf >= 0) {
            setFocusedItem(indexOf);
            return;
        }
        throw new IllegalArgumentException();
    }

    public ItemizedOverlayWithFocus(List<Item> list, Drawable drawable, Drawable drawable2, int i5, ItemizedIconOverlay.OnItemGestureListener<Item> onItemGestureListener, Context context) {
        super(list, drawable, onItemGestureListener, context);
        int rgb = Color.rgb(101, 185, 74);
        this.DEFAULTMARKER_BACKGROUNDCOLOR = rgb;
        this.DESCRIPTION_BOX_PADDING = 3;
        this.DESCRIPTION_BOX_CORNERWIDTH = 3;
        this.DESCRIPTION_TITLE_EXTRA_LINE_HEIGHT = 2;
        this.FONT_SIZE_DP = 14;
        this.DESCRIPTION_MAXWIDTH = 600;
        this.DESCRIPTION_LINE_HEIGHT = 30;
        this.mFocusedScreenCoords = new Point();
        this.mRect = new Rect();
        this.mContext = context;
        if (drawable2 == null) {
            this.mMarkerFocusedBase = boundToHotspot(context.getResources().getDrawable(R.drawable.f21667i), OverlayItem.HotspotPlace.BOTTOM_CENTER);
        } else {
            this.mMarkerFocusedBase = drawable2;
        }
        this.mMarkerFocusedBackgroundColor = i5 == Integer.MIN_VALUE ? rgb : i5;
        calculateDrawSettings();
        unSetFocusedItem();
    }
}
