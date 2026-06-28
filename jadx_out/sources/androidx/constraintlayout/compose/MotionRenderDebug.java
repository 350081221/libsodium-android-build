package androidx.constraintlayout.compose;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import androidx.constraintlayout.core.motion.Motion;
import androidx.core.internal.view.SupportMenu;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class MotionRenderDebug {
    private static final int DEBUG_PATH_TICKS_PER_MS = 16;
    public static final int DEBUG_SHOW_NONE = 0;
    public static final int DEBUG_SHOW_PATH = 2;
    public static final int DEBUG_SHOW_PROGRESS = 1;
    static final int MAX_KEY_FRAMES = 50;
    DashPathEffect mDashPathEffect;
    Paint mFillPaint;
    int mKeyFrameCount;
    float[] mKeyFramePoints;
    Paint mPaint;
    Paint mPaintGraph;
    Paint mPaintKeyframes;
    Path mPath;
    int[] mPathMode;
    float[] mPoints;
    private float[] mRectangle;
    int mShadowTranslate;
    Paint mTextPaint;
    final int RED_COLOR = -21965;
    final int KEYFRAME_COLOR = -2067046;
    final int GRAPH_COLOR = -13391360;
    final int SHADOW_COLOR = 1996488704;
    final int DIAMOND_SIZE = 10;
    Rect mBounds = new Rect();
    boolean mPresentationMode = false;

    public MotionRenderDebug(float f5) {
        this.mShadowTranslate = 1;
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setAntiAlias(true);
        this.mPaint.setColor(-21965);
        this.mPaint.setStrokeWidth(2.0f);
        this.mPaint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint();
        this.mPaintKeyframes = paint2;
        paint2.setAntiAlias(true);
        this.mPaintKeyframes.setColor(-2067046);
        this.mPaintKeyframes.setStrokeWidth(2.0f);
        this.mPaintKeyframes.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint();
        this.mPaintGraph = paint3;
        paint3.setAntiAlias(true);
        this.mPaintGraph.setColor(-13391360);
        this.mPaintGraph.setStrokeWidth(2.0f);
        this.mPaintGraph.setStyle(Paint.Style.STROKE);
        Paint paint4 = new Paint();
        this.mTextPaint = paint4;
        paint4.setAntiAlias(true);
        this.mTextPaint.setColor(-13391360);
        this.mTextPaint.setTextSize(f5);
        this.mRectangle = new float[8];
        Paint paint5 = new Paint();
        this.mFillPaint = paint5;
        paint5.setAntiAlias(true);
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f);
        this.mDashPathEffect = dashPathEffect;
        this.mPaintGraph.setPathEffect(dashPathEffect);
        this.mKeyFramePoints = new float[100];
        this.mPathMode = new int[50];
        if (this.mPresentationMode) {
            this.mPaint.setStrokeWidth(8.0f);
            this.mFillPaint.setStrokeWidth(8.0f);
            this.mPaintKeyframes.setStrokeWidth(8.0f);
            this.mShadowTranslate = 4;
        }
    }

    private void drawBasicPath(Canvas canvas) {
        canvas.drawLines(this.mPoints, this.mPaint);
    }

    private void drawPathAsConfigured(Canvas canvas) {
        boolean z4 = false;
        boolean z5 = false;
        for (int i5 = 0; i5 < this.mKeyFrameCount; i5++) {
            int i6 = this.mPathMode[i5];
            if (i6 == 1) {
                z4 = true;
            }
            if (i6 == 0) {
                z5 = true;
            }
        }
        if (z4) {
            drawPathRelative(canvas);
        }
        if (z5) {
            drawPathCartesian(canvas);
        }
    }

    private void drawPathCartesian(Canvas canvas) {
        float[] fArr = this.mPoints;
        float f5 = fArr[0];
        float f6 = fArr[1];
        float f7 = fArr[fArr.length - 2];
        float f8 = fArr[fArr.length - 1];
        canvas.drawLine(Math.min(f5, f7), Math.max(f6, f8), Math.max(f5, f7), Math.max(f6, f8), this.mPaintGraph);
        canvas.drawLine(Math.min(f5, f7), Math.min(f6, f8), Math.min(f5, f7), Math.max(f6, f8), this.mPaintGraph);
    }

    private void drawPathCartesianTicks(Canvas canvas, float f5, float f6) {
        float[] fArr = this.mPoints;
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[fArr.length - 2];
        float f10 = fArr[fArr.length - 1];
        float min = Math.min(f7, f9);
        float max = Math.max(f8, f10);
        float min2 = f5 - Math.min(f7, f9);
        float max2 = Math.max(f8, f10) - f6;
        String str = "" + (((int) (((min2 * 100.0f) / Math.abs(f9 - f7)) + 0.5d)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawText(str, ((min2 / 2.0f) - (this.mBounds.width() / 2)) + min, f6 - 20.0f, this.mTextPaint);
        canvas.drawLine(f5, f6, Math.min(f7, f9), f6, this.mPaintGraph);
        String str2 = "" + (((int) (((max2 * 100.0f) / Math.abs(f10 - f8)) + 0.5d)) / 100.0f);
        getTextBounds(str2, this.mTextPaint);
        canvas.drawText(str2, f5 + 5.0f, max - ((max2 / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
        canvas.drawLine(f5, f6, f5, Math.max(f8, f10), this.mPaintGraph);
    }

    private void drawPathRelative(Canvas canvas) {
        float[] fArr = this.mPoints;
        canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.mPaintGraph);
    }

    private void drawPathRelativeTicks(Canvas canvas, float f5, float f6) {
        float[] fArr = this.mPoints;
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[fArr.length - 2];
        float f10 = fArr[fArr.length - 1];
        float hypot = (float) Math.hypot(f7 - f9, f8 - f10);
        float f11 = f9 - f7;
        float f12 = f10 - f8;
        float f13 = (((f5 - f7) * f11) + ((f6 - f8) * f12)) / (hypot * hypot);
        float f14 = f7 + (f11 * f13);
        float f15 = f8 + (f13 * f12);
        Path path = new Path();
        path.moveTo(f5, f6);
        path.lineTo(f14, f15);
        float hypot2 = (float) Math.hypot(f14 - f5, f15 - f6);
        String str = "" + (((int) ((hypot2 * 100.0f) / hypot)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawTextOnPath(str, path, (hypot2 / 2.0f) - (this.mBounds.width() / 2), -20.0f, this.mTextPaint);
        canvas.drawLine(f5, f6, f14, f15, this.mPaintGraph);
    }

    private void drawPathScreenTicks(Canvas canvas, float f5, float f6, int i5, int i6, int i7, int i8) {
        String str = "" + (((int) ((((f5 - (i5 / 2)) * 100.0f) / (i7 - i5)) + 0.5d)) / 100.0f);
        getTextBounds(str, this.mTextPaint);
        canvas.drawText(str, ((f5 / 2.0f) - (this.mBounds.width() / 2)) + 0.0f, f6 - 20.0f, this.mTextPaint);
        canvas.drawLine(f5, f6, Math.min(0.0f, 1.0f), f6, this.mPaintGraph);
        String str2 = "" + (((int) ((((f6 - (i6 / 2)) * 100.0f) / (i8 - i6)) + 0.5d)) / 100.0f);
        getTextBounds(str2, this.mTextPaint);
        canvas.drawText(str2, f5 + 5.0f, 0.0f - ((f6 / 2.0f) - (this.mBounds.height() / 2)), this.mTextPaint);
        canvas.drawLine(f5, f6, f5, Math.max(0.0f, 1.0f), this.mPaintGraph);
    }

    private void drawRectangle(Canvas canvas, Motion motion) {
        this.mPath.reset();
        for (int i5 = 0; i5 <= 50; i5++) {
            motion.buildRect(i5 / 50, this.mRectangle, 0);
            Path path = this.mPath;
            float[] fArr = this.mRectangle;
            path.moveTo(fArr[0], fArr[1]);
            Path path2 = this.mPath;
            float[] fArr2 = this.mRectangle;
            path2.lineTo(fArr2[2], fArr2[3]);
            Path path3 = this.mPath;
            float[] fArr3 = this.mRectangle;
            path3.lineTo(fArr3[4], fArr3[5]);
            Path path4 = this.mPath;
            float[] fArr4 = this.mRectangle;
            path4.lineTo(fArr4[6], fArr4[7]);
            this.mPath.close();
        }
        this.mPaint.setColor(1140850688);
        canvas.translate(2.0f, 2.0f);
        canvas.drawPath(this.mPath, this.mPaint);
        canvas.translate(-2.0f, -2.0f);
        this.mPaint.setColor(SupportMenu.CATEGORY_MASK);
        canvas.drawPath(this.mPath, this.mPaint);
    }

    private void drawTicks(Canvas canvas, int i5, int i6, Motion motion, int i7, int i8) {
        int i9;
        int i10;
        float f5;
        float f6;
        int i11;
        if (motion.getView() != null) {
            i9 = motion.getView().getWidth();
            i10 = motion.getView().getHeight();
        } else {
            i9 = 0;
            i10 = 0;
        }
        for (int i12 = 1; i12 < i6 - 1; i12++) {
            if (i5 != 4 || this.mPathMode[i12 - 1] != 0) {
                float[] fArr = this.mKeyFramePoints;
                int i13 = i12 * 2;
                float f7 = fArr[i13];
                float f8 = fArr[i13 + 1];
                this.mPath.reset();
                this.mPath.moveTo(f7, f8 + 10.0f);
                this.mPath.lineTo(f7 + 10.0f, f8);
                this.mPath.lineTo(f7, f8 - 10.0f);
                this.mPath.lineTo(f7 - 10.0f, f8);
                this.mPath.close();
                int i14 = i12 - 1;
                motion.getKeyFrame(i14);
                if (i5 == 4) {
                    int i15 = this.mPathMode[i14];
                    if (i15 == 1) {
                        drawPathRelativeTicks(canvas, f7 - 0.0f, f8 - 0.0f);
                    } else if (i15 == 0) {
                        drawPathCartesianTicks(canvas, f7 - 0.0f, f8 - 0.0f);
                    } else if (i15 == 2) {
                        f5 = f8;
                        f6 = f7;
                        i11 = 2;
                        drawPathScreenTicks(canvas, f7 - 0.0f, f8 - 0.0f, i9, i10, i7, i8);
                        canvas.drawPath(this.mPath, this.mFillPaint);
                    }
                    f5 = f8;
                    f6 = f7;
                    i11 = 2;
                    canvas.drawPath(this.mPath, this.mFillPaint);
                } else {
                    f5 = f8;
                    f6 = f7;
                    i11 = 2;
                }
                if (i5 == i11) {
                    drawPathRelativeTicks(canvas, f6 - 0.0f, f5 - 0.0f);
                }
                if (i5 == 3) {
                    drawPathCartesianTicks(canvas, f6 - 0.0f, f5 - 0.0f);
                }
                if (i5 == 6) {
                    drawPathScreenTicks(canvas, f6 - 0.0f, f5 - 0.0f, i9, i10, i7, i8);
                }
                canvas.drawPath(this.mPath, this.mFillPaint);
            }
        }
        float[] fArr2 = this.mPoints;
        if (fArr2.length > 1) {
            canvas.drawCircle(fArr2[0], fArr2[1], 8.0f, this.mPaintKeyframes);
            float[] fArr3 = this.mPoints;
            canvas.drawCircle(fArr3[fArr3.length - 2], fArr3[fArr3.length - 1], 8.0f, this.mPaintKeyframes);
        }
    }

    private void drawTranslation(Canvas canvas, float f5, float f6, float f7, float f8) {
        canvas.drawRect(f5, f6, f7, f8, this.mPaintGraph);
        canvas.drawLine(f5, f6, f7, f8, this.mPaintGraph);
    }

    public void draw(Canvas canvas, HashMap<String, Motion> hashMap, int i5, int i6, int i7, int i8) {
        if (hashMap == null || hashMap.size() == 0) {
            return;
        }
        canvas.save();
        Iterator<Motion> it = hashMap.values().iterator();
        while (it.hasNext()) {
            draw(canvas, it.next(), i5, i6, i7, i8);
        }
        canvas.restore();
    }

    public void drawAll(Canvas canvas, int i5, int i6, Motion motion, int i7, int i8) {
        if (i5 == 4) {
            drawPathAsConfigured(canvas);
        }
        if (i5 == 2) {
            drawPathRelative(canvas);
        }
        if (i5 == 3) {
            drawPathCartesian(canvas);
        }
        drawBasicPath(canvas);
        drawTicks(canvas, i5, i6, motion, i7, i8);
    }

    void getTextBounds(String str, Paint paint) {
        paint.getTextBounds(str, 0, str.length(), this.mBounds);
    }

    public void draw(Canvas canvas, Motion motion, int i5, int i6, int i7, int i8) {
        int drawPath = motion.getDrawPath();
        if (i6 > 0 && drawPath == 0) {
            drawPath = 1;
        }
        if (drawPath == 0) {
            return;
        }
        this.mKeyFrameCount = motion.buildKeyFrames(this.mKeyFramePoints, this.mPathMode, null);
        if (drawPath >= 1) {
            int i9 = i5 / 16;
            float[] fArr = this.mPoints;
            if (fArr == null || fArr.length != i9 * 2) {
                this.mPoints = new float[i9 * 2];
                this.mPath = new Path();
            }
            int i10 = this.mShadowTranslate;
            canvas.translate(i10, i10);
            this.mPaint.setColor(1996488704);
            this.mFillPaint.setColor(1996488704);
            this.mPaintKeyframes.setColor(1996488704);
            this.mPaintGraph.setColor(1996488704);
            motion.buildPath(this.mPoints, i9);
            int i11 = drawPath;
            drawAll(canvas, i11, this.mKeyFrameCount, motion, i7, i8);
            this.mPaint.setColor(-21965);
            this.mPaintKeyframes.setColor(-2067046);
            this.mFillPaint.setColor(-2067046);
            this.mPaintGraph.setColor(-13391360);
            int i12 = this.mShadowTranslate;
            canvas.translate(-i12, -i12);
            drawAll(canvas, i11, this.mKeyFrameCount, motion, i7, i8);
            if (drawPath == 5) {
                drawRectangle(canvas, motion);
            }
        }
    }
}
