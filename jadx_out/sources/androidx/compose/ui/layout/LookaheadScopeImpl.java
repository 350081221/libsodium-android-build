package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import v3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\nJ\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0002H\u0016R*\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u00020\u0002*\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/layout/LookaheadScopeImpl;", "Landroidx/compose/ui/layout/LookaheadScope;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "toLookaheadCoordinates", "Lkotlin/Function0;", "scopeCoordinates", "Lv3/a;", "getScopeCoordinates", "()Lv3/a;", "setScopeCoordinates", "(Lv3/a;)V", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "getLookaheadScopeCoordinates", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadScopeCoordinates", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LookaheadScopeImpl implements LookaheadScope {
    public static final int $stable = 8;

    @m
    private a<? extends LayoutCoordinates> scopeCoordinates;

    /* JADX WARN: Multi-variable type inference failed */
    public LookaheadScopeImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public LookaheadScopeImpl(@m a<? extends LayoutCoordinates> aVar) {
        this.scopeCoordinates = aVar;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    @l
    public LayoutCoordinates getLookaheadScopeCoordinates(@l Placeable.PlacementScope placementScope) {
        a<? extends LayoutCoordinates> aVar = this.scopeCoordinates;
        l0.m(aVar);
        return aVar.invoke();
    }

    @m
    public final a<LayoutCoordinates> getScopeCoordinates() {
        return this.scopeCoordinates;
    }

    public final void setScopeCoordinates(@m a<? extends LayoutCoordinates> aVar) {
        this.scopeCoordinates = aVar;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    @l
    public LayoutCoordinates toLookaheadCoordinates(@l LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates2;
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            lookaheadLayoutCoordinates = (LookaheadLayoutCoordinates) layoutCoordinates;
        } else {
            lookaheadLayoutCoordinates = null;
        }
        if (lookaheadLayoutCoordinates == null) {
            l0.n(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
            NodeCoordinator nodeCoordinator = (NodeCoordinator) layoutCoordinates;
            LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
            if (lookaheadDelegate == null || (lookaheadLayoutCoordinates2 = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) {
                return nodeCoordinator;
            }
            return lookaheadLayoutCoordinates2;
        }
        return lookaheadLayoutCoordinates;
    }

    public /* synthetic */ LookaheadScopeImpl(a aVar, int i5, w wVar) {
        this((i5 & 1) != 0 ? null : aVar);
    }
}
