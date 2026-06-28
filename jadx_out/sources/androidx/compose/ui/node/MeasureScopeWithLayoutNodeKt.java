package androidx.compose.ui.node;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0006*\u00020\u0007H\u0002¨\u0006\b"}, d2 = {"getChildrenOfVirtualChildren", "", "Landroidx/compose/ui/layout/Measurable;", "scope", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "isInLookaheadPass", "", "Landroidx/compose/ui/node/LayoutNode;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMeasureScopeWithLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n151#2,3:48\n33#2,4:51\n154#2,2:55\n38#2:57\n156#2:58\n1#3:59\n*S KotlinDebug\n*F\n+ 1 MeasureScopeWithLayoutNode.kt\nandroidx/compose/ui/node/MeasureScopeWithLayoutNodeKt\n*L\n32#1:48,3\n32#1:51,4\n32#1:55,2\n32#1:57\n32#1:58\n*E\n"})
/* loaded from: classes.dex */
public final class MeasureScopeWithLayoutNodeKt {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutNode.LayoutState.values().length];
            try {
                iArr[LayoutNode.LayoutState.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutNode.LayoutState.LookaheadLayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LayoutNode.LayoutState.Measuring.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LayoutNode.LayoutState.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LayoutNode.LayoutState.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @l
    public static final List<List<Measurable>> getChildrenOfVirtualChildren(@l IntrinsicMeasureScope intrinsicMeasureScope) {
        List<Measurable> childMeasurables$ui_release;
        l0.n(intrinsicMeasureScope, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        LayoutNode layoutNode = ((MeasureScopeWithLayoutNode) intrinsicMeasureScope).getLayoutNode();
        boolean isInLookaheadPass = isInLookaheadPass(layoutNode);
        List<LayoutNode> foldedChildren$ui_release = layoutNode.getFoldedChildren$ui_release();
        ArrayList arrayList = new ArrayList(foldedChildren$ui_release.size());
        int size = foldedChildren$ui_release.size();
        for (int i5 = 0; i5 < size; i5++) {
            LayoutNode layoutNode2 = foldedChildren$ui_release.get(i5);
            if (isInLookaheadPass) {
                childMeasurables$ui_release = layoutNode2.getChildLookaheadMeasurables$ui_release();
            } else {
                childMeasurables$ui_release = layoutNode2.getChildMeasurables$ui_release();
            }
            arrayList.add(childMeasurables$ui_release);
        }
        return arrayList;
    }

    private static final boolean isInLookaheadPass(LayoutNode layoutNode) {
        int i5 = WhenMappings.$EnumSwitchMapping$0[layoutNode.getLayoutState$ui_release().ordinal()];
        if (i5 == 1 || i5 == 2) {
            return true;
        }
        if (i5 != 3 && i5 != 4) {
            if (i5 == 5) {
                LayoutNode parent$ui_release = layoutNode.getParent$ui_release();
                if (parent$ui_release != null) {
                    return isInLookaheadPass(parent$ui_release);
                }
                throw new IllegalArgumentException("no parent for idle node".toString());
            }
            throw new j0();
        }
        return false;
    }
}
