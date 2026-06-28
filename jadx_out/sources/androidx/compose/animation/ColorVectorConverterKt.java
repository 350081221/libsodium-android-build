package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\";\u0010\b\u001a)\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\"<\u0010\r\u001a)\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0000*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lkotlin/Function1;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "Lkotlin/v0;", "name", "colorSpace", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "ColorToVector", "Lv3/l;", "Landroidx/compose/ui/graphics/Color$Companion;", "getVectorConverter", "(Landroidx/compose/ui/graphics/Color$Companion;)Lv3/l;", "VectorConverter", "animation_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ColorVectorConverterKt {

    @l
    private static final v3.l<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> ColorToVector = ColorVectorConverterKt$ColorToVector$1.INSTANCE;

    @l
    public static final v3.l<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> getVectorConverter(@l Color.Companion companion) {
        return ColorToVector;
    }
}
