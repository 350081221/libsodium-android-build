package androidx.compose.ui.draw;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.m;
import p4.l;

@i0(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"shadow", "Landroidx/compose/ui/Modifier;", "elevation", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "shadow-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "ambientColor", "Landroidx/compose/ui/graphics/Color;", "spotColor", "shadow-s4CzXII", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nShadow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,123:1\n154#2:124\n154#2:125\n154#2:128\n135#3:126\n146#3:127\n*S KotlinDebug\n*F\n+ 1 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n*L\n64#1:124\n101#1:125\n98#1:128\n103#1:126\n102#1:127\n*E\n"})
/* loaded from: classes.dex */
public final class ShadowKt {
    @Stable
    @l
    /* renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m3405shadows4CzXII(@l Modifier modifier, float f5, @l Shape shape, boolean z4, long j5, long j6) {
        v3.l noInspectorInfo;
        if (Dp.m6043compareTo0680j_4(f5, Dp.m6044constructorimpl(0)) <= 0 && !z4) {
            return modifier;
        }
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new ShadowKt$shadows4CzXII$$inlined$debugInspectorInfo$1(f5, shape, z4, j5, j6);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return InspectableValueKt.inspectableWrapper(modifier, noInspectorInfo, GraphicsLayerModifierKt.graphicsLayer(Modifier.Companion, new ShadowKt$shadow$2$1(f5, shape, z4, j5, j6)));
    }

    /* renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3406shadows4CzXII$default(Modifier modifier, float f5, Shape shape, boolean z4, long j5, long j6, int i5, Object obj) {
        Shape shape2;
        boolean z5;
        long j7;
        long j8;
        if ((i5 & 2) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i5 & 4) != 0) {
            z5 = false;
            if (Dp.m6043compareTo0680j_4(f5, Dp.m6044constructorimpl(0)) > 0) {
                z5 = true;
            }
        } else {
            z5 = z4;
        }
        if ((i5 & 8) != 0) {
            j7 = GraphicsLayerScopeKt.getDefaultShadowColor();
        } else {
            j7 = j5;
        }
        if ((i5 & 16) != 0) {
            j8 = GraphicsLayerScopeKt.getDefaultShadowColor();
        } else {
            j8 = j6;
        }
        return m3405shadows4CzXII(modifier, f5, shape2, z5, j7, j8);
    }

    @Stable
    @k(level = m.HIDDEN, message = "Replace with shadow which accepts ambientColor and spotColor parameters", replaceWith = @b1(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    /* renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ Modifier m3407shadowziNgDLE(Modifier modifier, float f5, Shape shape, boolean z4) {
        return m3405shadows4CzXII(modifier, f5, shape, z4, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3408shadowziNgDLE$default(Modifier modifier, float f5, Shape shape, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i5 & 4) != 0) {
            z4 = false;
            if (Dp.m6043compareTo0680j_4(f5, Dp.m6044constructorimpl(0)) > 0) {
                z4 = true;
            }
        }
        return m3407shadowziNgDLE(modifier, f5, shape, z4);
    }
}
