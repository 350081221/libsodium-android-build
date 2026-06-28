package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\t\u001a\u00020\u0007H\u0002J\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/node/LayoutTreeConsistencyChecker;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "isTreeConsistent", "consistentLayoutState", "", "nodeToString", "logTree", "Lkotlin/r2;", "assertConsistent", "root", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "relayoutNodes", "Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "", "Landroidx/compose/ui/node/MeasureAndLayoutDelegate$PostponedRequest;", "postponedMeasureRequests", "Ljava/util/List;", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;Ljava/util/List;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLayoutTreeConsistencyChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,143:1\n33#2,6:144\n116#2,2:150\n33#2,6:152\n118#2:158\n116#2,2:159\n33#2,6:161\n118#2:167\n33#2,6:168\n*S KotlinDebug\n*F\n+ 1 LayoutTreeConsistencyChecker.kt\nandroidx/compose/ui/node/LayoutTreeConsistencyChecker\n*L\n44#1:144,6\n59#1:150,2\n59#1:152,6\n59#1:158\n84#1:159,2\n84#1:161,6\n84#1:167\n136#1:168,6\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutTreeConsistencyChecker {
    public static final int $stable = 8;

    @l
    private final List<MeasureAndLayoutDelegate.PostponedRequest> postponedMeasureRequests;

    @l
    private final DepthSortedSetsForDifferentPasses relayoutNodes;

    @l
    private final LayoutNode root;

    public LayoutTreeConsistencyChecker(@l LayoutNode layoutNode, @l DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses, @l List<MeasureAndLayoutDelegate.PostponedRequest> list) {
        this.root = layoutNode;
        this.relayoutNodes = depthSortedSetsForDifferentPasses;
        this.postponedMeasureRequests = list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r3 != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean consistentLayoutState(androidx.compose.ui.node.LayoutNode r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutTreeConsistencyChecker.consistentLayoutState(androidx.compose.ui.node.LayoutNode):boolean");
    }

    private final boolean isTreeConsistent(LayoutNode layoutNode) {
        if (!consistentLayoutState(layoutNode)) {
            return false;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!isTreeConsistent(children$ui_release.get(i5))) {
                return false;
            }
        }
        return true;
    }

    private final String logTree() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tree state:");
        l0.o(sb, "append(value)");
        sb.append('\n');
        l0.o(sb, "append('\\n')");
        logTree$printSubTree(this, sb, this.root, 0);
        return sb.toString();
    }

    private static final void logTree$printSubTree(LayoutTreeConsistencyChecker layoutTreeConsistencyChecker, StringBuilder sb, LayoutNode layoutNode, int i5) {
        boolean z4;
        String nodeToString = layoutTreeConsistencyChecker.nodeToString(layoutNode);
        if (nodeToString.length() > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            for (int i6 = 0; i6 < i5; i6++) {
                sb.append("..");
            }
            sb.append(nodeToString);
            l0.o(sb, "append(value)");
            sb.append('\n');
            l0.o(sb, "append('\\n')");
            i5++;
        }
        List<LayoutNode> children$ui_release = layoutNode.getChildren$ui_release();
        int size = children$ui_release.size();
        for (int i7 = 0; i7 < size; i7++) {
            logTree$printSubTree(layoutTreeConsistencyChecker, sb, children$ui_release.get(i7), i5);
        }
    }

    private final String nodeToString(LayoutNode layoutNode) {
        StringBuilder sb = new StringBuilder();
        sb.append(layoutNode);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        sb2.append(layoutNode.getLayoutState$ui_release());
        sb2.append(']');
        sb.append(sb2.toString());
        if (!layoutNode.isPlaced()) {
            sb.append("[!isPlaced]");
        }
        sb.append("[measuredByParent=" + layoutNode.getMeasuredByParent$ui_release() + ']');
        if (!consistentLayoutState(layoutNode)) {
            sb.append("[INCONSISTENT]");
        }
        return sb.toString();
    }

    public final void assertConsistent() {
        if (!(!isTreeConsistent(this.root))) {
            return;
        }
        System.out.println((Object) logTree());
        throw new IllegalStateException("Inconsistency found!");
    }
}
