package com.google.android.material.textfield;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class CutoutDrawable extends MaterialShapeDrawable {

    @NonNull
    CutoutDrawableState drawableState;

    /* loaded from: classes2.dex */
    private static class ImplApi14 extends CutoutDrawable {
        private Paint cutoutPaint;
        private int savedLayer;

        ImplApi14(@NonNull CutoutDrawableState cutoutDrawableState) {
            super(cutoutDrawableState);
        }

        private Paint getCutoutPaint() {
            if (this.cutoutPaint == null) {
                Paint paint = new Paint(1);
                this.cutoutPaint = paint;
                paint.setStyle(Paint.Style.FILL_AND_STROKE);
                this.cutoutPaint.setColor(-1);
                this.cutoutPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            }
            return this.cutoutPaint;
        }

        private void postDraw(@NonNull Canvas canvas) {
            if (!useHardwareLayer(getCallback())) {
                canvas.restoreToCount(this.savedLayer);
            }
        }

        private void preDraw(@NonNull Canvas canvas) {
            Drawable.Callback callback = getCallback();
            if (useHardwareLayer(callback)) {
                View view = (View) callback;
                if (view.getLayerType() != 2) {
                    view.setLayerType(2, null);
                    return;
                }
                return;
            }
            saveCanvasLayer(canvas);
        }

        private void saveCanvasLayer(@NonNull Canvas canvas) {
            this.savedLayer = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }

        private boolean useHardwareLayer(Drawable.Callback callback) {
            return callback instanceof View;
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            preDraw(canvas);
            super.draw(canvas);
            postDraw(canvas);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public void drawStrokeShape(@NonNull Canvas canvas) {
            super.drawStrokeShape(canvas);
            canvas.drawRect(((CutoutDrawable) this).drawableState.cutoutBounds, getCutoutPaint());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(18)
    /* loaded from: classes2.dex */
    public static class ImplApi18 extends CutoutDrawable {
        ImplApi18(@NonNull CutoutDrawableState cutoutDrawableState) {
            super(cutoutDrawableState);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.android.material.shape.MaterialShapeDrawable
        public void drawStrokeShape(@NonNull Canvas canvas) {
            if (((CutoutDrawable) this).drawableState.cutoutBounds.isEmpty()) {
                super.drawStrokeShape(canvas);
                return;
            }
            canvas.save();
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(((CutoutDrawable) this).drawableState.cutoutBounds);
            } else {
                canvas.clipRect(((CutoutDrawable) this).drawableState.cutoutBounds, Region.Op.DIFFERENCE);
            }
            super.drawStrokeShape(canvas);
            canvas.restore();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static CutoutDrawable create(@Nullable ShapeAppearanceModel shapeAppearanceModel) {
        if (shapeAppearanceModel == null) {
            shapeAppearanceModel = new ShapeAppearanceModel();
        }
        return create(new CutoutDrawableState(shapeAppearanceModel, new RectF()));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasCutout() {
        return !this.drawableState.cutoutBounds.isEmpty();
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.drawableState = new CutoutDrawableState(this.drawableState);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeCutout() {
        setCutout(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void setCutout(float f5, float f6, float f7, float f8) {
        if (f5 == this.drawableState.cutoutBounds.left && f6 == this.drawableState.cutoutBounds.top && f7 == this.drawableState.cutoutBounds.right && f8 == this.drawableState.cutoutBounds.bottom) {
            return;
        }
        this.drawableState.cutoutBounds.set(f5, f6, f7, f8);
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class CutoutDrawableState extends MaterialShapeDrawable.MaterialShapeDrawableState {

        @NonNull
        private final RectF cutoutBounds;

        @Override // com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState, android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            CutoutDrawable create = CutoutDrawable.create(this);
            create.invalidateSelf();
            return create;
        }

        private CutoutDrawableState(@NonNull ShapeAppearanceModel shapeAppearanceModel, @NonNull RectF rectF) {
            super(shapeAppearanceModel, null);
            this.cutoutBounds = rectF;
        }

        private CutoutDrawableState(@NonNull CutoutDrawableState cutoutDrawableState) {
            super(cutoutDrawableState);
            this.cutoutBounds = cutoutDrawableState.cutoutBounds;
        }
    }

    private CutoutDrawable(@NonNull CutoutDrawableState cutoutDrawableState) {
        super(cutoutDrawableState);
        this.drawableState = cutoutDrawableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static CutoutDrawable create(@NonNull CutoutDrawableState cutoutDrawableState) {
        return new ImplApi18(cutoutDrawableState);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCutout(@NonNull RectF rectF) {
        setCutout(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
