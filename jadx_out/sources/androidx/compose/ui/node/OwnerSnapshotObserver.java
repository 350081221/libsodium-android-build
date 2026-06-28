package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.r2;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B0\u0012'\u00103\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\f\b0\u0012\b\b1\u0012\u0004\b\b(2\u0012\u0004\u0012\u00020\u00070\u0016¢\u0006\u0004\b4\u00105J/\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ/\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\f\u0010\nJ/\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\nJ%\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011JC\u0010\u001a\u001a\u00020\u0007\"\b\b\u0000\u0010\u0014*\u00020\u00132\u0006\u0010\u0015\u001a\u00028\u00002\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00162\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\"\u001a\u00020\u0007H\u0000¢\u0006\u0004\b!\u0010\u001cJ\u000f\u0010$\u001a\u00020\u0007H\u0000¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R \u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R \u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)R \u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010)R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010)¨\u00066"}, d2 = {"Landroidx/compose/ui/node/OwnerSnapshotObserver;", "", "Landroidx/compose/ui/node/LayoutNode;", "node", "", "affectsLookahead", "Lkotlin/Function0;", "Lkotlin/r2;", "block", "observeLayoutSnapshotReads$ui_release", "(Landroidx/compose/ui/node/LayoutNode;ZLv3/a;)V", "observeLayoutSnapshotReads", "observeLayoutModifierSnapshotReads$ui_release", "observeLayoutModifierSnapshotReads", "observeMeasureSnapshotReads$ui_release", "observeMeasureSnapshotReads", "observeSemanticsReads$ui_release", "(Landroidx/compose/ui/node/LayoutNode;Lv3/a;)V", "observeSemanticsReads", "Landroidx/compose/ui/node/OwnerScope;", "T", TypedValues.AttributesType.S_TARGET, "Lkotlin/Function1;", "onChanged", "observeReads$ui_release", "(Landroidx/compose/ui/node/OwnerScope;Lv3/l;Lv3/a;)V", "observeReads", "clearInvalidObservations$ui_release", "()V", "clearInvalidObservations", "clear$ui_release", "(Ljava/lang/Object;)V", "clear", "startObserving$ui_release", "startObserving", "stopObserving$ui_release", "stopObserving", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "observer", "Landroidx/compose/runtime/snapshots/SnapshotStateObserver;", "onCommitAffectingLookaheadMeasure", "Lv3/l;", "onCommitAffectingMeasure", "onCommitAffectingSemantics", "onCommitAffectingLayout", "onCommitAffectingLayoutModifier", "onCommitAffectingLayoutModifierInLookahead", "onCommitAffectingLookahead", "Lkotlin/v0;", "name", "callback", "onChangedExecutor", "<init>", "(Lv3/l;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class OwnerSnapshotObserver {
    public static final int $stable = SnapshotStateObserver.$stable;

    @l
    private final SnapshotStateObserver observer;

    @l
    private final v3.l<LayoutNode, r2> onCommitAffectingLookaheadMeasure = OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1.INSTANCE;

    @l
    private final v3.l<LayoutNode, r2> onCommitAffectingMeasure = OwnerSnapshotObserver$onCommitAffectingMeasure$1.INSTANCE;

    @l
    private final v3.l<LayoutNode, r2> onCommitAffectingSemantics = OwnerSnapshotObserver$onCommitAffectingSemantics$1.INSTANCE;

    @l
    private final v3.l<LayoutNode, r2> onCommitAffectingLayout = OwnerSnapshotObserver$onCommitAffectingLayout$1.INSTANCE;

    @l
    private final v3.l<LayoutNode, r2> onCommitAffectingLayoutModifier = OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1.INSTANCE;

    @l
    private final v3.l<LayoutNode, r2> onCommitAffectingLayoutModifierInLookahead = OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1.INSTANCE;

    @l
    private final v3.l<LayoutNode, r2> onCommitAffectingLookahead = OwnerSnapshotObserver$onCommitAffectingLookahead$1.INSTANCE;

    public OwnerSnapshotObserver(@l v3.l<? super v3.a<r2>, r2> lVar) {
        this.observer = new SnapshotStateObserver(lVar);
    }

    public static /* synthetic */ void observeLayoutModifierSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z4, v3.a aVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        ownerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release(layoutNode, z4, aVar);
    }

    public static /* synthetic */ void observeLayoutSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z4, v3.a aVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        ownerSnapshotObserver.observeLayoutSnapshotReads$ui_release(layoutNode, z4, aVar);
    }

    public static /* synthetic */ void observeMeasureSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z4, v3.a aVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = true;
        }
        ownerSnapshotObserver.observeMeasureSnapshotReads$ui_release(layoutNode, z4, aVar);
    }

    public final void clear$ui_release(@l Object obj) {
        this.observer.clear(obj);
    }

    public final void clearInvalidObservations$ui_release() {
        this.observer.clearIf(OwnerSnapshotObserver$clearInvalidObservations$1.INSTANCE);
    }

    public final void observeLayoutModifierSnapshotReads$ui_release(@l LayoutNode layoutNode, boolean z4, @l v3.a<r2> aVar) {
        if (z4 && layoutNode.getLookaheadRoot$ui_release() != null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayoutModifierInLookahead, aVar);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayoutModifier, aVar);
        }
    }

    public final void observeLayoutSnapshotReads$ui_release(@l LayoutNode layoutNode, boolean z4, @l v3.a<r2> aVar) {
        if (z4 && layoutNode.getLookaheadRoot$ui_release() != null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLookahead, aVar);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayout, aVar);
        }
    }

    public final void observeMeasureSnapshotReads$ui_release(@l LayoutNode layoutNode, boolean z4, @l v3.a<r2> aVar) {
        if (z4 && layoutNode.getLookaheadRoot$ui_release() != null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLookaheadMeasure, aVar);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingMeasure, aVar);
        }
    }

    public final <T extends OwnerScope> void observeReads$ui_release(@l T t5, @l v3.l<? super T, r2> lVar, @l v3.a<r2> aVar) {
        this.observer.observeReads(t5, lVar, aVar);
    }

    public final void observeSemanticsReads$ui_release(@l LayoutNode layoutNode, @l v3.a<r2> aVar) {
        observeReads$ui_release(layoutNode, this.onCommitAffectingSemantics, aVar);
    }

    public final void startObserving$ui_release() {
        this.observer.start();
    }

    public final void stopObserving$ui_release() {
        this.observer.stop();
        this.observer.clear();
    }
}
