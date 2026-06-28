package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nBlur.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,154:1\n154#2:155\n*S KotlinDebug\n*F\n+ 1 Blur.kt\nandroidx/compose/ui/draw/BlurKt\n*L\n112#1:155\n*E\n"})
/* loaded from: classes.dex */
public final class BlurKt {
    @Stable
    @l
    /* renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m3386blur1fqSgw(@l Modifier modifier, float f5, float f6, @l Shape shape) {
        boolean z4;
        int m4106getDecal3opZhB0;
        if (shape != null) {
            m4106getDecal3opZhB0 = TileMode.Companion.m4105getClamp3opZhB0();
            z4 = true;
        } else {
            z4 = false;
            m4106getDecal3opZhB0 = TileMode.Companion.m4106getDecal3opZhB0();
        }
        float f7 = 0;
        if ((Dp.m6043compareTo0680j_4(f5, Dp.m6044constructorimpl(f7)) > 0 && Dp.m6043compareTo0680j_4(f6, Dp.m6044constructorimpl(f7)) > 0) || z4) {
            return GraphicsLayerModifierKt.graphicsLayer(modifier, new BlurKt$blur$1(f5, f6, m4106getDecal3opZhB0, shape, z4));
        }
        return modifier;
    }

    /* renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3387blur1fqSgw$default(Modifier modifier, float f5, float f6, BlurredEdgeTreatment blurredEdgeTreatment, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m3390boximpl(BlurredEdgeTreatment.Companion.m3397getRectangleGoahg());
        }
        return m3386blur1fqSgw(modifier, f5, f6, blurredEdgeTreatment.m3396unboximpl());
    }

    @Stable
    @l
    /* renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m3388blurF8QBwvs(@l Modifier modifier, float f5, @l Shape shape) {
        return m3386blur1fqSgw(modifier, f5, f5, shape);
    }

    /* renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3389blurF8QBwvs$default(Modifier modifier, float f5, BlurredEdgeTreatment blurredEdgeTreatment, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m3390boximpl(BlurredEdgeTreatment.Companion.m3397getRectangleGoahg());
        }
        return m3388blurF8QBwvs(modifier, f5, blurredEdgeTreatment.m3396unboximpl());
    }
}
