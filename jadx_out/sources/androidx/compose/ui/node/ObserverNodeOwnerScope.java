package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "Landroidx/compose/ui/node/OwnerScope;", "observerNode", "Landroidx/compose/ui/node/ObserverModifierNode;", "(Landroidx/compose/ui/node/ObserverModifierNode;)V", "isValidOwnerScope", "", "()Z", "getObserverNode$ui_release", "()Landroidx/compose/ui/node/ObserverModifierNode;", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ObserverNodeOwnerScope implements OwnerScope {

    @l
    private final ObserverModifierNode observerNode;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final v3.l<ObserverNodeOwnerScope, r2> OnObserveReadsChanged = ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1.INSTANCE;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/node/ObserverNodeOwnerScope$Companion;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "Lkotlin/r2;", "OnObserveReadsChanged", "Lv3/l;", "getOnObserveReadsChanged$ui_release", "()Lv3/l;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final v3.l<ObserverNodeOwnerScope, r2> getOnObserveReadsChanged$ui_release() {
            return ObserverNodeOwnerScope.OnObserveReadsChanged;
        }
    }

    public ObserverNodeOwnerScope(@l ObserverModifierNode observerModifierNode) {
        this.observerNode = observerModifierNode;
    }

    @l
    public final ObserverModifierNode getObserverNode$ui_release() {
        return this.observerNode;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.observerNode.getNode().isAttached();
    }
}
