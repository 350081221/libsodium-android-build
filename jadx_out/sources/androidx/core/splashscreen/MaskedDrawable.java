package androidx.core.splashscreen;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0014R\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Landroidx/core/splashscreen/MaskedDrawable;", "Landroid/graphics/drawable/Drawable;", "Landroid/graphics/Canvas;", "canvas", "Lkotlin/r2;", MediationConstant.RIT_TYPE_DRAW, "", "alpha", "setAlpha", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "getOpacity", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "drawable", "Landroid/graphics/drawable/Drawable;", "", "maskDiameter", "F", "Landroid/graphics/Path;", "mask", "Landroid/graphics/Path;", "<init>", "(Landroid/graphics/drawable/Drawable;F)V", "core-splashscreen_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class MaskedDrawable extends Drawable {

    @p4.l
    private final Drawable drawable;

    @p4.l
    private final Path mask;
    private final float maskDiameter;

    public MaskedDrawable(@p4.l Drawable drawable, float f5) {
        l0.p(drawable, "drawable");
        this.drawable = drawable;
        this.maskDiameter = f5;
        Path path = new Path();
        path.addCircle(0.0f, 0.0f, f5 / 2.0f, Path.Direction.CW);
        this.mask = path;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@p4.l Canvas canvas) {
        l0.p(canvas, "canvas");
        canvas.clipPath(this.mask);
        this.drawable.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(@p4.l Rect bounds) {
        l0.p(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.drawable.setBounds(bounds);
        this.mask.offset(bounds.exactCenterX(), bounds.exactCenterY());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.drawable.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@p4.m ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter);
    }
}
