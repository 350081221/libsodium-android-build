package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;

@kotlin.i0(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\u001a0\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aN\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aN\u0010\u0016\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a<\u0010\u001b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"ImageShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "LinearGradientShader", TypedValues.TransitionType.S_FROM, "Landroidx/compose/ui/geometry/Offset;", TypedValues.TransitionType.S_TO, "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "LinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "RadialGradientShader", "center", "radius", "RadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "SweepGradientShader", "SweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShaderKt {
    @p4.l
    /* renamed from: ImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m4045ImageShaderF49vj9s(@p4.l ImageBitmap imageBitmap, int i5, int i6) {
        return AndroidShader_androidKt.m3634ActualImageShaderF49vj9s(imageBitmap, i5, i6);
    }

    /* renamed from: ImageShader-F49vj9s$default, reason: not valid java name */
    public static /* synthetic */ Shader m4046ImageShaderF49vj9s$default(ImageBitmap imageBitmap, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i5 = TileMode.Companion.m4105getClamp3opZhB0();
        }
        if ((i7 & 4) != 0) {
            i6 = TileMode.Companion.m4105getClamp3opZhB0();
        }
        return m4045ImageShaderF49vj9s(imageBitmap, i5, i6);
    }

    @p4.l
    /* renamed from: LinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m4047LinearGradientShaderVjE6UOU(long j5, long j6, @p4.l List<Color> list, @p4.m List<Float> list2, int i5) {
        return AndroidShader_androidKt.m3635ActualLinearGradientShaderVjE6UOU(j5, j6, list, list2, i5);
    }

    /* renamed from: LinearGradientShader-VjE6UOU$default, reason: not valid java name */
    public static /* synthetic */ Shader m4048LinearGradientShaderVjE6UOU$default(long j5, long j6, List list, List list2, int i5, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i6 & 16) != 0) {
            i5 = TileMode.Companion.m4105getClamp3opZhB0();
        }
        return m4047LinearGradientShaderVjE6UOU(j5, j6, list, list3, i5);
    }

    @p4.l
    /* renamed from: RadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m4049RadialGradientShader8uybcMk(long j5, float f5, @p4.l List<Color> list, @p4.m List<Float> list2, int i5) {
        return AndroidShader_androidKt.m3636ActualRadialGradientShader8uybcMk(j5, f5, list, list2, i5);
    }

    /* renamed from: RadialGradientShader-8uybcMk$default, reason: not valid java name */
    public static /* synthetic */ Shader m4050RadialGradientShader8uybcMk$default(long j5, float f5, List list, List list2, int i5, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i6 & 16) != 0) {
            i5 = TileMode.Companion.m4105getClamp3opZhB0();
        }
        return m4049RadialGradientShader8uybcMk(j5, f5, list, list3, i5);
    }

    @p4.l
    /* renamed from: SweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m4051SweepGradientShader9KIMszo(long j5, @p4.l List<Color> list, @p4.m List<Float> list2) {
        return AndroidShader_androidKt.m3637ActualSweepGradientShader9KIMszo(j5, list, list2);
    }

    /* renamed from: SweepGradientShader-9KIMszo$default, reason: not valid java name */
    public static /* synthetic */ Shader m4052SweepGradientShader9KIMszo$default(long j5, List list, List list2, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            list2 = null;
        }
        return m4051SweepGradientShader9KIMszo(j5, list, list2);
    }
}
