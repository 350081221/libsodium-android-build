package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Comparator;
import java.util.Map;
import kotlin.d0;
import kotlin.f0;
import kotlin.h0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\t\u001a\u00020\u0002J\u001f\u0010\f\u001a\u00020\u00062\u0014\b\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\nH\u0086\bJ\u0006\u0010\r\u001a\u00020\u0004J\t\u0010\u000e\u001a\u00020\u0004H\u0086\bJ\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R'\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00140\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001aj\b\u0012\u0004\u0012\u00020\u0002`\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Landroidx/compose/ui/node/DepthSortedSet;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "contains", "Lkotlin/r2;", "add", "remove", "pop", "Lkotlin/Function1;", "block", "popEach", "isEmpty", "isNotEmpty", "", "toString", "extraAssertions", "Z", "", "", "mapOfOriginalDepth$delegate", "Lkotlin/d0;", "getMapOfOriginalDepth", "()Ljava/util/Map;", "mapOfOriginalDepth", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "DepthComparator", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/TreeSet;", "set", "Landroidx/compose/ui/node/TreeSet;", "<init>", "(Z)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nDepthSortedSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n96#1:186\n1#2:185\n*S KotlinDebug\n*F\n+ 1 DepthSortedSet.kt\nandroidx/compose/ui/node/DepthSortedSet\n*L\n87#1:186\n*E\n"})
/* loaded from: classes.dex */
public final class DepthSortedSet {
    public static final int $stable = 8;

    @l
    private final Comparator<LayoutNode> DepthComparator;
    private final boolean extraAssertions;

    @l
    private final d0 mapOfOriginalDepth$delegate;

    @l
    private final TreeSet<LayoutNode> set;

    public DepthSortedSet(boolean z4) {
        d0 b5;
        this.extraAssertions = z4;
        b5 = f0.b(h0.NONE, DepthSortedSet$mapOfOriginalDepth$2.INSTANCE);
        this.mapOfOriginalDepth$delegate = b5;
        Comparator<LayoutNode> comparator = new Comparator<LayoutNode>() { // from class: androidx.compose.ui.node.DepthSortedSet$DepthComparator$1
            @Override // java.util.Comparator
            public int compare(@l LayoutNode layoutNode, @l LayoutNode layoutNode2) {
                int t5 = l0.t(layoutNode.getDepth$ui_release(), layoutNode2.getDepth$ui_release());
                return t5 != 0 ? t5 : l0.t(layoutNode.hashCode(), layoutNode2.hashCode());
            }
        };
        this.DepthComparator = comparator;
        this.set = new TreeSet<>(comparator);
    }

    private final Map<LayoutNode, Integer> getMapOfOriginalDepth() {
        return (Map) this.mapOfOriginalDepth$delegate.getValue();
    }

    public final void add(@l LayoutNode layoutNode) {
        boolean z4;
        if (layoutNode.isAttached()) {
            if (this.extraAssertions) {
                Integer num = getMapOfOriginalDepth().get(layoutNode);
                if (num == null) {
                    getMapOfOriginalDepth().put(layoutNode, Integer.valueOf(layoutNode.getDepth$ui_release()));
                } else {
                    if (num.intValue() == layoutNode.getDepth$ui_release()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        throw new IllegalStateException("invalid node depth".toString());
                    }
                }
            }
            this.set.add(layoutNode);
            return;
        }
        throw new IllegalStateException("DepthSortedSet.add called on an unattached node".toString());
    }

    public final boolean contains(@l LayoutNode layoutNode) {
        boolean z4;
        boolean contains = this.set.contains(layoutNode);
        if (this.extraAssertions) {
            if (contains == getMapOfOriginalDepth().containsKey(layoutNode)) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                throw new IllegalStateException("inconsistency in TreeSet".toString());
            }
        }
        return contains;
    }

    public final boolean isEmpty() {
        return this.set.isEmpty();
    }

    public final boolean isNotEmpty() {
        return !isEmpty();
    }

    @l
    public final LayoutNode pop() {
        LayoutNode first = this.set.first();
        remove(first);
        return first;
    }

    public final void popEach(@l v3.l<? super LayoutNode, r2> lVar) {
        while (!isEmpty()) {
            lVar.invoke(pop());
        }
    }

    public final boolean remove(@l LayoutNode layoutNode) {
        Integer num;
        if (layoutNode.isAttached()) {
            boolean remove = this.set.remove(layoutNode);
            if (this.extraAssertions) {
                Integer remove2 = getMapOfOriginalDepth().remove(layoutNode);
                if (remove) {
                    num = Integer.valueOf(layoutNode.getDepth$ui_release());
                } else {
                    num = null;
                }
                if (!l0.g(remove2, num)) {
                    throw new IllegalStateException("invalid node depth".toString());
                }
            }
            return remove;
        }
        throw new IllegalStateException("DepthSortedSet.remove called on an unattached node".toString());
    }

    @l
    public String toString() {
        return this.set.toString();
    }
}
