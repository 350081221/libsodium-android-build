package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002JC\u0010\u000f\u001a\u00020\u000728\b\u0004\u0010\u000e\u001a2\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0003\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\u00070\u000bH\u0086\bJ\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSetsForDifferentPasses;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "affectsLookahead", "contains", "Lkotlin/r2;", "add", "remove", "pop", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "block", "popEach", "isEmpty", "isNotEmpty", "Landroidx/compose/ui/node/DepthSortedSet;", "lookaheadSet", "Landroidx/compose/ui/node/DepthSortedSet;", "set", "extraAssertions", "<init>", "(Z)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n+ 2 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n1#1,184:1\n96#2:185\n96#2:186\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSetsForDifferentPasses\n*L\n160#1:185\n172#1:186\n*E\n"})
/* loaded from: classes.dex */
public final class DepthSortedSetsForDifferentPasses {
    public static final int $stable = 8;

    @l
    private final DepthSortedSet lookaheadSet;

    @l
    private final DepthSortedSet set;

    public DepthSortedSetsForDifferentPasses(boolean z4) {
        this.lookaheadSet = new DepthSortedSet(z4);
        this.set = new DepthSortedSet(z4);
    }

    public final void add(@l LayoutNode layoutNode, boolean z4) {
        if (z4) {
            this.lookaheadSet.add(layoutNode);
        } else if (!this.lookaheadSet.contains(layoutNode)) {
            this.set.add(layoutNode);
        }
    }

    public final boolean contains(@l LayoutNode layoutNode, boolean z4) {
        boolean contains = this.lookaheadSet.contains(layoutNode);
        return z4 ? contains : contains || this.set.contains(layoutNode);
    }

    public final boolean isEmpty() {
        return this.set.isEmpty() && this.lookaheadSet.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    @l
    public final LayoutNode pop() {
        if (!this.lookaheadSet.isEmpty()) {
            return this.lookaheadSet.pop();
        }
        return this.set.pop();
    }

    public final void popEach(@l p<? super LayoutNode, ? super Boolean, r2> pVar) {
        DepthSortedSet depthSortedSet;
        while (isNotEmpty()) {
            boolean z4 = !this.lookaheadSet.isEmpty();
            if (z4) {
                depthSortedSet = this.lookaheadSet;
            } else {
                depthSortedSet = this.set;
            }
            pVar.invoke(depthSortedSet.pop(), Boolean.valueOf(z4));
        }
    }

    public final boolean remove(@l LayoutNode layoutNode, boolean z4) {
        if (z4) {
            return this.lookaheadSet.remove(layoutNode);
        }
        return this.set.remove(layoutNode);
    }

    public final boolean isEmpty(boolean z4) {
        return (z4 ? this.lookaheadSet : this.set).isEmpty();
    }

    public final boolean contains(@l LayoutNode layoutNode) {
        return this.lookaheadSet.contains(layoutNode) || this.set.contains(layoutNode);
    }

    public final boolean remove(@l LayoutNode layoutNode) {
        return this.set.remove(layoutNode) || this.lookaheadSet.remove(layoutNode);
    }
}
