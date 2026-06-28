package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001d\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0018\u00010\u0014¢\u0006\u0004\b \u0010\u0019J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H&J\u0016\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0010H&R0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n\u0018\u00010\u00148\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/foundation/RectListNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroid/graphics/Rect;", "newRect", "Lkotlin/r2;", "replaceRect", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutCoordinates", "Landroidx/compose/ui/geometry/Rect;", "rect", "calcBounds", "coordinates", "onGloballyPositioned", "onDetach", "Landroidx/compose/runtime/collection/MutableVector;", "currentRects", "rects", "updateRects", "Lkotlin/Function1;", "Lv3/l;", "getRect", "()Lv3/l;", "setRect", "(Lv3/l;)V", "androidRect", "Landroid/graphics/Rect;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "view", "<init>", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nRectListNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,99:1\n1#2:100\n728#3,2:101\n*S KotlinDebug\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n*L\n69#1:101,2\n*E\n"})
/* loaded from: classes.dex */
public abstract class RectListNode extends Modifier.Node implements GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;

    @p4.m
    private Rect androidRect;

    @p4.m
    private v3.l<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> rect;

    public RectListNode(@p4.m v3.l<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> lVar) {
        this.rect = lVar;
    }

    private final Rect calcBounds(LayoutCoordinates layoutCoordinates, androidx.compose.ui.geometry.Rect rect) {
        float l02;
        float l03;
        float Q;
        float Q2;
        int L0;
        int L02;
        int L03;
        int L04;
        LayoutCoordinates findRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        long mo5006localPositionOfR5De75A = findRootCoordinates.mo5006localPositionOfR5De75A(layoutCoordinates, rect.m3528getTopLeftF1C5BW0());
        long mo5006localPositionOfR5De75A2 = findRootCoordinates.mo5006localPositionOfR5De75A(layoutCoordinates, rect.m3529getTopRightF1C5BW0());
        long mo5006localPositionOfR5De75A3 = findRootCoordinates.mo5006localPositionOfR5De75A(layoutCoordinates, rect.m3521getBottomLeftF1C5BW0());
        long mo5006localPositionOfR5De75A4 = findRootCoordinates.mo5006localPositionOfR5De75A(layoutCoordinates, rect.m3522getBottomRightF1C5BW0());
        l02 = kotlin.comparisons.h.l0(Offset.m3493getXimpl(mo5006localPositionOfR5De75A), Offset.m3493getXimpl(mo5006localPositionOfR5De75A2), Offset.m3493getXimpl(mo5006localPositionOfR5De75A3), Offset.m3493getXimpl(mo5006localPositionOfR5De75A4));
        l03 = kotlin.comparisons.h.l0(Offset.m3494getYimpl(mo5006localPositionOfR5De75A), Offset.m3494getYimpl(mo5006localPositionOfR5De75A2), Offset.m3494getYimpl(mo5006localPositionOfR5De75A3), Offset.m3494getYimpl(mo5006localPositionOfR5De75A4));
        Q = kotlin.comparisons.h.Q(Offset.m3493getXimpl(mo5006localPositionOfR5De75A), Offset.m3493getXimpl(mo5006localPositionOfR5De75A2), Offset.m3493getXimpl(mo5006localPositionOfR5De75A3), Offset.m3493getXimpl(mo5006localPositionOfR5De75A4));
        Q2 = kotlin.comparisons.h.Q(Offset.m3494getYimpl(mo5006localPositionOfR5De75A), Offset.m3494getYimpl(mo5006localPositionOfR5De75A2), Offset.m3494getYimpl(mo5006localPositionOfR5De75A3), Offset.m3494getYimpl(mo5006localPositionOfR5De75A4));
        L0 = kotlin.math.d.L0(l02);
        L02 = kotlin.math.d.L0(l03);
        L03 = kotlin.math.d.L0(Q);
        L04 = kotlin.math.d.L0(Q2);
        return new Rect(L0, L02, L03, L04);
    }

    private final void replaceRect(Rect rect) {
        MutableVector<Rect> currentRects = currentRects();
        Rect rect2 = this.androidRect;
        if (rect2 != null) {
            currentRects.remove(rect2);
        }
        boolean z4 = false;
        if (rect != null && !rect.isEmpty()) {
            z4 = true;
        }
        if (z4) {
            currentRects.add(rect);
        }
        updateRects(currentRects);
        this.androidRect = rect;
    }

    @p4.l
    public abstract MutableVector<Rect> currentRects();

    @p4.m
    public v3.l<LayoutCoordinates, androidx.compose.ui.geometry.Rect> getRect() {
        return this.rect;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @p4.l
    public final View getView() {
        return (View) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AndroidCompositionLocals_androidKt.getLocalView());
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        replaceRect(null);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@p4.l LayoutCoordinates layoutCoordinates) {
        Rect calcBounds;
        int L0;
        int L02;
        int L03;
        int L04;
        if (getRect() == null) {
            androidx.compose.ui.geometry.Rect boundsInRoot = LayoutCoordinatesKt.boundsInRoot(layoutCoordinates);
            L0 = kotlin.math.d.L0(boundsInRoot.getLeft());
            L02 = kotlin.math.d.L0(boundsInRoot.getTop());
            L03 = kotlin.math.d.L0(boundsInRoot.getRight());
            L04 = kotlin.math.d.L0(boundsInRoot.getBottom());
            calcBounds = new Rect(L0, L02, L03, L04);
        } else {
            v3.l<LayoutCoordinates, androidx.compose.ui.geometry.Rect> rect = getRect();
            l0.m(rect);
            calcBounds = calcBounds(layoutCoordinates, rect.invoke(layoutCoordinates));
        }
        replaceRect(calcBounds);
    }

    public void setRect(@p4.m v3.l<? super LayoutCoordinates, androidx.compose.ui.geometry.Rect> lVar) {
        this.rect = lVar;
    }

    public abstract void updateRects(@p4.l MutableVector<Rect> mutableVector);
}
