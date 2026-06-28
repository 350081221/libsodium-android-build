package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.Measurable;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a9\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0004*\u00020\u0003*\u00020\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0007H\u0082\b\"\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "", "isOutMostLookaheadRoot", "Landroidx/compose/ui/layout/Measurable;", "T", "Landroidx/compose/runtime/collection/MutableVector;", "destination", "Lkotlin/Function1;", "transform", "Lkotlin/r2;", "updateChildMeasurables", "", "MeasuredTwiceErrorMessage", "Ljava/lang/String;", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLayoutNodeLayoutDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n+ 2 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1781:1\n199#2:1782\n476#3,11:1783\n*S KotlinDebug\n*F\n+ 1 LayoutNodeLayoutDelegate.kt\nandroidx/compose/ui/node/LayoutNodeLayoutDelegateKt\n*L\n1699#1:1782\n1699#1:1783,11\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutNodeLayoutDelegateKt {

    @l
    private static final String MeasuredTwiceErrorMessage = "measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()";

    public static final boolean isOutMostLookaheadRoot(@l LayoutNode layoutNode) {
        LayoutNode layoutNode2;
        if (layoutNode.getLookaheadRoot$ui_release() != null) {
            LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
            if (parent$ui_release != null) {
                layoutNode2 = parent$ui_release.getLookaheadRoot$ui_release();
            } else {
                layoutNode2 = null;
            }
            if (layoutNode2 == null || layoutNode.getLayoutDelegate$ui_release().getDetachedFromParentLookaheadPass$ui_release()) {
                return true;
            }
        }
        return false;
    }

    private static final <T extends Measurable> void updateChildMeasurables(LayoutNode layoutNode, MutableVector<T> mutableVector, v3.l<? super LayoutNode, ? extends T> lVar) {
        MutableVector<LayoutNode> mutableVector2 = layoutNode.get_children$ui_release();
        int size = mutableVector2.getSize();
        if (size > 0) {
            LayoutNode[] content = mutableVector2.getContent();
            int i5 = 0;
            do {
                LayoutNode layoutNode2 = content[i5];
                if (mutableVector.getSize() <= i5) {
                    mutableVector.add(lVar.invoke(layoutNode2));
                } else {
                    mutableVector.set(i5, lVar.invoke(layoutNode2));
                }
                i5++;
            } while (i5 < size);
        }
        mutableVector.removeRange(layoutNode.getChildren$ui_release().size(), mutableVector.getSize());
    }
}
