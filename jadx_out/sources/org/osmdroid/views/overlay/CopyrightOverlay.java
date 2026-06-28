package org.osmdroid.views.overlay;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.DisplayMetrics;
import org.osmdroid.views.MapView;
import org.osmdroid.views.Projection;

/* loaded from: classes4.dex */
public class CopyrightOverlay extends Overlay {
    final DisplayMetrics dm;
    private String mCopyrightNotice;
    private Paint paint;
    int xOffset = 10;
    int yOffset = 10;
    protected boolean alignBottom = true;
    protected boolean alignRight = false;

    public CopyrightOverlay(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.dm = displayMetrics;
        Paint paint = new Paint();
        this.paint = paint;
        paint.setAntiAlias(true);
        this.paint.setTextSize(displayMetrics.density * 12.0f);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, MapView mapView, boolean z4) {
        setCopyrightNotice(mapView.getTileProvider().getTileSource().getCopyrightNotice());
        draw(canvas, mapView.getProjection());
    }

    public void setAlignBottom(boolean z4) {
        this.alignBottom = z4;
    }

    public void setAlignRight(boolean z4) {
        this.alignRight = z4;
    }

    public void setCopyrightNotice(String str) {
        this.mCopyrightNotice = str;
    }

    public void setOffset(int i5, int i6) {
        this.xOffset = i5;
        this.yOffset = i6;
    }

    public void setTextColor(int i5) {
        this.paint.setColor(i5);
    }

    public void setTextSize(int i5) {
        this.paint.setTextSize(this.dm.density * i5);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        float f5;
        float textSize;
        String str = this.mCopyrightNotice;
        if (str == null || str.length() == 0) {
            return;
        }
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        if (this.alignRight) {
            f5 = width - this.xOffset;
            this.paint.setTextAlign(Paint.Align.RIGHT);
        } else {
            f5 = this.xOffset;
            this.paint.setTextAlign(Paint.Align.LEFT);
        }
        if (this.alignBottom) {
            textSize = height - this.yOffset;
        } else {
            textSize = this.paint.getTextSize() + this.yOffset;
        }
        projection.save(canvas, false, false);
        canvas.drawText(this.mCopyrightNotice, f5, textSize, this.paint);
        projection.restore(canvas, false);
    }
}
