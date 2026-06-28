package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0098\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a¤\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a¸\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001aÂ\u0001\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a%\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%H\u0007\u001a\f\u0010'\u001a\u00020\u0000*\u00020\u0000H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/ui/Modifier;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "graphicsLayer-sKFY_QE", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "graphicsLayer", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "graphicsLayer-2Xn7asI", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "graphicsLayer-pANQ8Wg", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJ)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "graphicsLayer-Ap8cVGQ", "(Landroidx/compose/ui/Modifier;FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJI)Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/r2;", "Lkotlin/u;", "block", "toolingGraphicsLayer", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class GraphicsLayerModifierKt {
    @Stable
    @p4.l
    public static final Modifier graphicsLayer(@p4.l Modifier modifier, @p4.l v3.l<? super GraphicsLayerScope, r2> lVar) {
        return modifier.then(new BlockGraphicsLayerElement(lVar));
    }

    @Stable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Replace with graphicsLayer that consumes shadow color parameters", replaceWith = @kotlin.b1(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.graphics"}))
    /* renamed from: graphicsLayer-2Xn7asI */
    public static final /* synthetic */ Modifier m3891graphicsLayer2Xn7asI(Modifier modifier, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, long j5, Shape shape, boolean z4, RenderEffect renderEffect) {
        return m3893graphicsLayerAp8cVGQ(modifier, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, j5, shape, z4, renderEffect, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor(), CompositingStrategy.Companion.m3822getAutoNrFUSI());
    }

    /* renamed from: graphicsLayer-2Xn7asI$default */
    public static /* synthetic */ Modifier m3892graphicsLayer2Xn7asI$default(Modifier modifier, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, long j5, Shape shape, boolean z4, RenderEffect renderEffect, int i5, Object obj) {
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        long j6;
        Shape shape2;
        boolean z5;
        RenderEffect renderEffect2;
        float f23 = 1.0f;
        if ((i5 & 1) != 0) {
            f15 = 1.0f;
        } else {
            f15 = f5;
        }
        if ((i5 & 2) != 0) {
            f16 = 1.0f;
        } else {
            f16 = f6;
        }
        if ((i5 & 4) == 0) {
            f23 = f7;
        }
        float f24 = 0.0f;
        if ((i5 & 8) != 0) {
            f17 = 0.0f;
        } else {
            f17 = f8;
        }
        if ((i5 & 16) != 0) {
            f18 = 0.0f;
        } else {
            f18 = f9;
        }
        if ((i5 & 32) != 0) {
            f19 = 0.0f;
        } else {
            f19 = f10;
        }
        if ((i5 & 64) != 0) {
            f20 = 0.0f;
        } else {
            f20 = f11;
        }
        if ((i5 & 128) != 0) {
            f21 = 0.0f;
        } else {
            f21 = f12;
        }
        if ((i5 & 256) == 0) {
            f24 = f13;
        }
        if ((i5 & 512) != 0) {
            f22 = 8.0f;
        } else {
            f22 = f14;
        }
        if ((i5 & 1024) != 0) {
            j6 = TransformOrigin.Companion.m4123getCenterSzJe1aQ();
        } else {
            j6 = j5;
        }
        if ((i5 & 2048) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i5 & 4096) != 0) {
            z5 = false;
        } else {
            z5 = z4;
        }
        if ((i5 & 8192) != 0) {
            renderEffect2 = null;
        } else {
            renderEffect2 = renderEffect;
        }
        return m3891graphicsLayer2Xn7asI(modifier, f15, f16, f23, f17, f18, f19, f20, f21, f24, f22, j6, shape2, z5, renderEffect2);
    }

    @Stable
    @p4.l
    /* renamed from: graphicsLayer-Ap8cVGQ */
    public static final Modifier m3893graphicsLayerAp8cVGQ(@p4.l Modifier modifier, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, long j5, @p4.l Shape shape, boolean z4, @p4.m RenderEffect renderEffect, long j6, long j7, int i5) {
        return modifier.then(new GraphicsLayerElement(f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, j5, shape, z4, renderEffect, j6, j7, i5, null));
    }

    /* renamed from: graphicsLayer-Ap8cVGQ$default */
    public static /* synthetic */ Modifier m3894graphicsLayerAp8cVGQ$default(Modifier modifier, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, long j5, Shape shape, boolean z4, RenderEffect renderEffect, long j6, long j7, int i5, int i6, Object obj) {
        return m3893graphicsLayerAp8cVGQ(modifier, (i6 & 1) != 0 ? 1.0f : f5, (i6 & 2) != 0 ? 1.0f : f6, (i6 & 4) == 0 ? f7 : 1.0f, (i6 & 8) != 0 ? 0.0f : f8, (i6 & 16) != 0 ? 0.0f : f9, (i6 & 32) != 0 ? 0.0f : f10, (i6 & 64) != 0 ? 0.0f : f11, (i6 & 128) != 0 ? 0.0f : f12, (i6 & 256) == 0 ? f13 : 0.0f, (i6 & 512) != 0 ? 8.0f : f14, (i6 & 1024) != 0 ? TransformOrigin.Companion.m4123getCenterSzJe1aQ() : j5, (i6 & 2048) != 0 ? RectangleShapeKt.getRectangleShape() : shape, (i6 & 4096) != 0 ? false : z4, (i6 & 8192) != 0 ? null : renderEffect, (i6 & 16384) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j6, (i6 & 32768) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j7, (i6 & 65536) != 0 ? CompositingStrategy.Companion.m3822getAutoNrFUSI() : i5);
    }

    @Stable
    @kotlin.k(level = kotlin.m.HIDDEN, message = "Replace with graphicsLayer that consumes a compositing strategy", replaceWith = @kotlin.b1(expression = "Modifier.graphicsLayer(scaleX, scaleY, alpha, translationX, translationY, shadowElevation, rotationX, rotationY, rotationZ, cameraDistance, transformOrigin, shape, clip, null, DefaultShadowColor, DefaultShadowColor, CompositingStrategy.Auto)", imports = {"androidx.compose.ui.graphics"}))
    /* renamed from: graphicsLayer-pANQ8Wg */
    public static final /* synthetic */ Modifier m3895graphicsLayerpANQ8Wg(Modifier modifier, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, long j5, Shape shape, boolean z4, RenderEffect renderEffect, long j6, long j7) {
        return m3893graphicsLayerAp8cVGQ(modifier, f5, f6, f7, f8, f9, f10, f11, f12, f13, f14, j5, shape, z4, renderEffect, j6, j7, CompositingStrategy.Companion.m3822getAutoNrFUSI());
    }

    /* renamed from: graphicsLayer-sKFY_QE$default */
    public static /* synthetic */ Modifier m3898graphicsLayersKFY_QE$default(Modifier modifier, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, long j5, Shape shape, boolean z4, int i5, Object obj) {
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        long j6;
        Shape shape2;
        boolean z5;
        float f23 = 1.0f;
        if ((i5 & 1) != 0) {
            f15 = 1.0f;
        } else {
            f15 = f5;
        }
        if ((i5 & 2) != 0) {
            f16 = 1.0f;
        } else {
            f16 = f6;
        }
        if ((i5 & 4) == 0) {
            f23 = f7;
        }
        float f24 = 0.0f;
        if ((i5 & 8) != 0) {
            f17 = 0.0f;
        } else {
            f17 = f8;
        }
        if ((i5 & 16) != 0) {
            f18 = 0.0f;
        } else {
            f18 = f9;
        }
        if ((i5 & 32) != 0) {
            f19 = 0.0f;
        } else {
            f19 = f10;
        }
        if ((i5 & 64) != 0) {
            f20 = 0.0f;
        } else {
            f20 = f11;
        }
        if ((i5 & 128) != 0) {
            f21 = 0.0f;
        } else {
            f21 = f12;
        }
        if ((i5 & 256) == 0) {
            f24 = f13;
        }
        if ((i5 & 512) != 0) {
            f22 = 8.0f;
        } else {
            f22 = f14;
        }
        if ((i5 & 1024) != 0) {
            j6 = TransformOrigin.Companion.m4123getCenterSzJe1aQ();
        } else {
            j6 = j5;
        }
        if ((i5 & 2048) != 0) {
            shape2 = RectangleShapeKt.getRectangleShape();
        } else {
            shape2 = shape;
        }
        if ((i5 & 4096) != 0) {
            z5 = false;
        } else {
            z5 = z4;
        }
        return m3894graphicsLayerAp8cVGQ$default(modifier, f15, f16, f23, f17, f18, f19, f20, f21, f24, f22, j6, shape2, z5, null, 0L, 0L, 0, 114688, null);
    }

    @Stable
    @p4.l
    public static final Modifier toolingGraphicsLayer(@p4.l Modifier modifier) {
        return InspectableValueKt.isDebugInspectorInfoEnabled() ? modifier.then(m3894graphicsLayerAp8cVGQ$default(Modifier.Companion, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131071, null)) : modifier;
    }
}
