package androidx.compose.ui.graphics;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/graphics/BlendModeColorFilterHelper;", "", "()V", "BlendModeColorFilter", "Landroid/graphics/BlendModeColorFilter;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "BlendModeColorFilter-xETnrds", "(JI)Landroid/graphics/BlendModeColorFilter;", "createBlendModeColorFilter", "Landroidx/compose/ui/graphics/BlendModeColorFilter;", "androidBlendModeColorFilter", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(29)
/* loaded from: classes.dex */
public final class BlendModeColorFilterHelper {

    @p4.l
    public static final BlendModeColorFilterHelper INSTANCE = new BlendModeColorFilterHelper();

    private BlendModeColorFilterHelper() {
    }

    @p4.l
    @DoNotInline
    /* renamed from: BlendModeColorFilter-xETnrds, reason: not valid java name */
    public final android.graphics.BlendModeColorFilter m3680BlendModeColorFilterxETnrds(long j5, int i5) {
        return new android.graphics.BlendModeColorFilter(ColorKt.m3788toArgb8_81llA(j5), AndroidBlendMode_androidKt.m3585toAndroidBlendModes9anfk8(i5));
    }

    @p4.l
    @DoNotInline
    public final BlendModeColorFilter createBlendModeColorFilter(@p4.l android.graphics.BlendModeColorFilter blendModeColorFilter) {
        int color;
        android.graphics.BlendMode mode;
        color = blendModeColorFilter.getColor();
        long Color = ColorKt.Color(color);
        mode = blendModeColorFilter.getMode();
        return new BlendModeColorFilter(Color, AndroidBlendMode_androidKt.toComposeBlendMode(mode), blendModeColorFilter, null);
    }
}
