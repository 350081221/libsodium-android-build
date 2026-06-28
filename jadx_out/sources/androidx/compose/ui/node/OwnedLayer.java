package androidx.compose.ui.node;

import androidx.compose.ui.geometry.MutableRect;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH&ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0010H&ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H&J\b\u0010\u001b\u001a\u00020\bH&J\b\u0010\u001c\u001a\u00020\bH&J\b\u0010\u001d\u001a\u00020\bH&J\"\u0010\"\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\fH&ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0018\u0010%\u001a\u00020\b2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\fH&J*\u0010*\u001a\u00020\b2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b0&2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\b0(H&J\u001a\u0010/\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H&ø\u0001\u0000¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H&ø\u0001\u0000¢\u0006\u0004\b0\u0010.ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u00062À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/OwnedLayer;", "", "Landroidx/compose/ui/graphics/ReusableGraphicsLayerScope;", "scope", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/Density;", "density", "Lkotlin/r2;", "updateLayerProperties", "Landroidx/compose/ui/geometry/Offset;", "position", "", "isInLayer-k-4lQ0M", "(J)Z", "isInLayer", "Landroidx/compose/ui/unit/IntOffset;", "move--gyyYBs", "(J)V", "move", "Landroidx/compose/ui/unit/IntSize;", "size", "resize-ozmzZPI", "resize", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "drawLayer", "updateDisplayList", "invalidate", "destroy", "point", "inverse", "mapOffset-8S9VItk", "(JZ)J", "mapOffset", "Landroidx/compose/ui/geometry/MutableRect;", "rect", "mapBounds", "Lkotlin/Function1;", "drawBlock", "Lkotlin/Function0;", "invalidateParentLayer", "reuseLayer", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "transform-58bKbWc", "([F)V", "transform", "inverseTransform-58bKbWc", "inverseTransform", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface OwnedLayer {
    void destroy();

    void drawLayer(@l Canvas canvas);

    void invalidate();

    /* renamed from: inverseTransform-58bKbWc, reason: not valid java name */
    void mo5251inverseTransform58bKbWc(@l float[] fArr);

    /* renamed from: isInLayer-k-4lQ0M, reason: not valid java name */
    boolean mo5252isInLayerk4lQ0M(long j5);

    void mapBounds(@l MutableRect mutableRect, boolean z4);

    /* renamed from: mapOffset-8S9VItk, reason: not valid java name */
    long mo5253mapOffset8S9VItk(long j5, boolean z4);

    /* renamed from: move--gyyYBs, reason: not valid java name */
    void mo5254movegyyYBs(long j5);

    /* renamed from: resize-ozmzZPI, reason: not valid java name */
    void mo5255resizeozmzZPI(long j5);

    void reuseLayer(@l v3.l<? super Canvas, r2> lVar, @l v3.a<r2> aVar);

    /* renamed from: transform-58bKbWc, reason: not valid java name */
    void mo5256transform58bKbWc(@l float[] fArr);

    void updateDisplayList();

    void updateLayerProperties(@l ReusableGraphicsLayerScope reusableGraphicsLayerScope, @l LayoutDirection layoutDirection, @l Density density);
}
