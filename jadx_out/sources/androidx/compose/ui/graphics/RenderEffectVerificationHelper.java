package androidx.compose.ui.graphics;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;

@kotlin.i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/graphics/RenderEffectVerificationHelper;", "", "()V", "createBlurEffect", "Landroid/graphics/RenderEffect;", "inputRenderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "radiusX", "", "radiusY", "edgeTreatment", "Landroidx/compose/ui/graphics/TileMode;", "createBlurEffect-8A-3gB4", "(Landroidx/compose/ui/graphics/RenderEffect;FFI)Landroid/graphics/RenderEffect;", "createOffsetEffect", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/geometry/Offset;", "createOffsetEffect-Uv8p0NA", "(Landroidx/compose/ui/graphics/RenderEffect;J)Landroid/graphics/RenderEffect;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(31)
/* loaded from: classes.dex */
final class RenderEffectVerificationHelper {

    @p4.l
    public static final RenderEffectVerificationHelper INSTANCE = new RenderEffectVerificationHelper();

    private RenderEffectVerificationHelper() {
    }

    @p4.l
    @DoNotInline
    /* renamed from: createBlurEffect-8A-3gB4, reason: not valid java name */
    public final android.graphics.RenderEffect m4042createBlurEffect8A3gB4(@p4.m RenderEffect renderEffect, float f5, float f6, int i5) {
        android.graphics.RenderEffect createBlurEffect;
        android.graphics.RenderEffect createBlurEffect2;
        if (renderEffect == null) {
            createBlurEffect2 = android.graphics.RenderEffect.createBlurEffect(f5, f6, AndroidTileMode_androidKt.m3639toAndroidTileMode0vamqd0(i5));
            return createBlurEffect2;
        }
        createBlurEffect = android.graphics.RenderEffect.createBlurEffect(f5, f6, renderEffect.asAndroidRenderEffect(), AndroidTileMode_androidKt.m3639toAndroidTileMode0vamqd0(i5));
        return createBlurEffect;
    }

    @p4.l
    @DoNotInline
    /* renamed from: createOffsetEffect-Uv8p0NA, reason: not valid java name */
    public final android.graphics.RenderEffect m4043createOffsetEffectUv8p0NA(@p4.m RenderEffect renderEffect, long j5) {
        android.graphics.RenderEffect createOffsetEffect;
        android.graphics.RenderEffect createOffsetEffect2;
        if (renderEffect == null) {
            createOffsetEffect2 = android.graphics.RenderEffect.createOffsetEffect(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5));
            return createOffsetEffect2;
        }
        createOffsetEffect = android.graphics.RenderEffect.createOffsetEffect(Offset.m3493getXimpl(j5), Offset.m3494getYimpl(j5), renderEffect.asAndroidRenderEffect());
        return createOffsetEffect;
    }
}
