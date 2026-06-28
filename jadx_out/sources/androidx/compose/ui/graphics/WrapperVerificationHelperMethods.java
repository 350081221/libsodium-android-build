package androidx.compose.ui.graphics;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\n\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/WrapperVerificationHelperMethods;", "", "Landroid/graphics/Paint;", "Landroidx/compose/ui/graphics/NativePaint;", "paint", "Landroidx/compose/ui/graphics/BlendMode;", "mode", "Lkotlin/r2;", "setBlendMode-GB0RdKg", "(Landroid/graphics/Paint;I)V", "setBlendMode", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
@RequiresApi(29)
/* loaded from: classes.dex */
public final class WrapperVerificationHelperMethods {

    @p4.l
    public static final WrapperVerificationHelperMethods INSTANCE = new WrapperVerificationHelperMethods();

    private WrapperVerificationHelperMethods() {
    }

    @DoNotInline
    /* renamed from: setBlendMode-GB0RdKg, reason: not valid java name */
    public final void m4135setBlendModeGB0RdKg(@p4.l android.graphics.Paint paint, int i5) {
        paint.setBlendMode(AndroidBlendMode_androidKt.m3585toAndroidBlendModes9anfk8(i5));
    }
}
