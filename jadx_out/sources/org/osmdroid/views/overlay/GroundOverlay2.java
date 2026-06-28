package org.osmdroid.views.overlay;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.Projection;

@Deprecated
/* loaded from: classes4.dex */
public class GroundOverlay2 extends Overlay {
    private Bitmap mImage;
    private float mLatD;
    private float mLatU;
    private float mLonL;
    private float mLonR;
    protected float mTransparency;
    private final Paint mPaint = new Paint();
    private Matrix mMatrix = new Matrix();
    protected float mBearing = 0.0f;

    public GroundOverlay2() {
        setTransparency(0.0f);
    }

    protected void computeMatrix(Projection projection) {
        long longPixelXFromLongitude = projection.getLongPixelXFromLongitude(this.mLonL);
        long longPixelYFromLatitude = projection.getLongPixelYFromLatitude(this.mLatU);
        getMatrix().setScale(((float) (projection.getLongPixelXFromLongitude(this.mLonR) - longPixelXFromLongitude)) / getImage().getWidth(), ((float) (projection.getLongPixelYFromLatitude(this.mLatD) - longPixelYFromLatitude)) / getImage().getHeight());
        getMatrix().postTranslate((float) longPixelXFromLongitude, (float) longPixelYFromLatitude);
    }

    @Override // org.osmdroid.views.overlay.Overlay
    public void draw(Canvas canvas, Projection projection) {
        if (this.mImage == null) {
            return;
        }
        computeMatrix(projection);
        canvas.drawBitmap(getImage(), getMatrix(), getPaint());
    }

    public float getBearing() {
        return this.mBearing;
    }

    public Bitmap getImage() {
        return this.mImage;
    }

    protected Matrix getMatrix() {
        return this.mMatrix;
    }

    protected Paint getPaint() {
        return this.mPaint;
    }

    public float getTransparency() {
        return this.mTransparency;
    }

    public void setBearing(float f5) {
        this.mBearing = f5;
    }

    public void setImage(Bitmap bitmap) {
        this.mImage = bitmap;
    }

    public void setPosition(GeoPoint geoPoint, GeoPoint geoPoint2) {
        this.mLatU = (float) geoPoint.getLatitude();
        this.mLonL = (float) geoPoint.getLongitude();
        this.mLatD = (float) geoPoint2.getLatitude();
        this.mLonR = (float) geoPoint2.getLongitude();
    }

    public void setTransparency(float f5) {
        this.mTransparency = f5;
        this.mPaint.setAlpha(255 - ((int) (f5 * 255.0f)));
    }
}
