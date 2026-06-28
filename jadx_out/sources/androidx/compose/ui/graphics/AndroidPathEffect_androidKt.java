package androidx.compose.ui.graphics;

import android.graphics.ComposePathEffect;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.PathDashPathEffect;
import androidx.compose.ui.graphics.StampedPathEffectStyle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;

@kotlin.i0(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0018\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0000\u001a2\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\n\u0010\u0013\u001a\u00020\u0014*\u00020\u0001\u001a\u0016\u0010\u0015\u001a\u00020\u0016*\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\n\u0010\u0019\u001a\u00020\u0001*\u00020\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"actualChainPathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "outer", bi.ax, "actualCornerPathEffect", "radius", "", "actualDashPathEffect", "intervals", "", TypedValues.CycleType.S_WAVE_PHASE, "actualStampedPathEffect", "shape", "Landroidx/compose/ui/graphics/Path;", "advance", "style", "Landroidx/compose/ui/graphics/StampedPathEffectStyle;", "actualStampedPathEffect-7aD1DOk", "(Landroidx/compose/ui/graphics/Path;FFI)Landroidx/compose/ui/graphics/PathEffect;", "asAndroidPathEffect", "Landroid/graphics/PathEffect;", "toAndroidPathDashPathEffectStyle", "Landroid/graphics/PathDashPathEffect$Style;", "toAndroidPathDashPathEffectStyle-oQv6xUo", "(I)Landroid/graphics/PathDashPathEffect$Style;", "toComposePathEffect", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nAndroidPathEffect.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,67:1\n35#2,5:68\n*S KotlinDebug\n*F\n+ 1 AndroidPathEffect.android.kt\nandroidx/compose/ui/graphics/AndroidPathEffect_androidKt\n*L\n53#1:68,5\n*E\n"})
/* loaded from: classes.dex */
public final class AndroidPathEffect_androidKt {
    @p4.l
    public static final PathEffect actualChainPathEffect(@p4.l PathEffect pathEffect, @p4.l PathEffect pathEffect2) {
        kotlin.jvm.internal.l0.n(pathEffect, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        android.graphics.PathEffect nativePathEffect = ((AndroidPathEffect) pathEffect).getNativePathEffect();
        kotlin.jvm.internal.l0.n(pathEffect2, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return new AndroidPathEffect(new ComposePathEffect(nativePathEffect, ((AndroidPathEffect) pathEffect2).getNativePathEffect()));
    }

    @p4.l
    public static final PathEffect actualCornerPathEffect(float f5) {
        return new AndroidPathEffect(new CornerPathEffect(f5));
    }

    @p4.l
    public static final PathEffect actualDashPathEffect(@p4.l float[] fArr, float f5) {
        return new AndroidPathEffect(new DashPathEffect(fArr, f5));
    }

    @p4.l
    /* renamed from: actualStampedPathEffect-7aD1DOk, reason: not valid java name */
    public static final PathEffect m3630actualStampedPathEffect7aD1DOk(@p4.l Path path, float f5, float f6, int i5) {
        if (path instanceof AndroidPath) {
            return new AndroidPathEffect(new PathDashPathEffect(((AndroidPath) path).getInternalPath(), f5, f6, m3631toAndroidPathDashPathEffectStyleoQv6xUo(i5)));
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @p4.l
    public static final android.graphics.PathEffect asAndroidPathEffect(@p4.l PathEffect pathEffect) {
        kotlin.jvm.internal.l0.n(pathEffect, "null cannot be cast to non-null type androidx.compose.ui.graphics.AndroidPathEffect");
        return ((AndroidPathEffect) pathEffect).getNativePathEffect();
    }

    @p4.l
    /* renamed from: toAndroidPathDashPathEffectStyle-oQv6xUo, reason: not valid java name */
    public static final PathDashPathEffect.Style m3631toAndroidPathDashPathEffectStyleoQv6xUo(int i5) {
        StampedPathEffectStyle.Companion companion = StampedPathEffectStyle.Companion;
        if (StampedPathEffectStyle.m4071equalsimpl0(i5, companion.m4075getMorphYpspkwk())) {
            return PathDashPathEffect.Style.MORPH;
        }
        if (StampedPathEffectStyle.m4071equalsimpl0(i5, companion.m4076getRotateYpspkwk())) {
            return PathDashPathEffect.Style.ROTATE;
        }
        if (StampedPathEffectStyle.m4071equalsimpl0(i5, companion.m4077getTranslateYpspkwk())) {
            return PathDashPathEffect.Style.TRANSLATE;
        }
        return PathDashPathEffect.Style.TRANSLATE;
    }

    @p4.l
    public static final PathEffect toComposePathEffect(@p4.l android.graphics.PathEffect pathEffect) {
        return new AndroidPathEffect(pathEffect);
    }
}
