package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.InvalidationResult;
import androidx.compose.runtime.MovableContentKt;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeOwner;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.List;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import kotlin.r2;
import kotlin.u0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a(\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002\u001a(\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/Applier;", "", "applier", "", "index", "Lkotlin/r2;", "positionToParentOf", "currentNodeIndex", "Landroidx/compose/runtime/Anchor;", "anchor", "positionToInsert", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "releaseMovableGroupAtCurrent", "runtime_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n+ 2 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,879:1\n166#2,8:880\n166#2,8:888\n*S KotlinDebug\n*F\n+ 1 Operation.kt\nandroidx/compose/runtime/changelist/OperationKt\n*L\n809#1:880,8\n869#1:888,8\n*E\n"})
/* loaded from: classes.dex */
public final class OperationKt {
    public static final /* synthetic */ int access$positionToInsert(SlotWriter slotWriter, Anchor anchor, Applier applier) {
        return positionToInsert(slotWriter, anchor, applier);
    }

    public static final /* synthetic */ void access$positionToParentOf(SlotWriter slotWriter, Applier applier, int i5) {
        positionToParentOf(slotWriter, applier, i5);
    }

    public static final /* synthetic */ void access$releaseMovableGroupAtCurrent(ControlledComposition controlledComposition, CompositionContext compositionContext, MovableContentStateReference movableContentStateReference, SlotWriter slotWriter) {
        releaseMovableGroupAtCurrent(controlledComposition, compositionContext, movableContentStateReference, slotWriter);
    }

    private static final int currentNodeIndex(SlotWriter slotWriter) {
        int nodeCount;
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int i5 = parent + 1;
        int i6 = 0;
        while (i5 < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, i5)) {
                if (slotWriter.isNode(i5)) {
                    i6 = 0;
                }
                i5++;
            } else {
                if (slotWriter.isNode(i5)) {
                    nodeCount = 1;
                } else {
                    nodeCount = slotWriter.nodeCount(i5);
                }
                i6 += nodeCount;
                i5 += slotWriter.groupSize(i5);
            }
        }
        return i6;
    }

    public static final int positionToInsert(SlotWriter slotWriter, Anchor anchor, Applier<Object> applier) {
        boolean z4;
        int anchorIndex = slotWriter.anchorIndex(anchor);
        boolean z5 = true;
        if (slotWriter.getCurrentGroup() < anchorIndex) {
            z4 = true;
        } else {
            z4 = false;
        }
        ComposerKt.runtimeCheck(z4);
        positionToParentOf(slotWriter, applier, anchorIndex);
        int currentNodeIndex = currentNodeIndex(slotWriter);
        while (slotWriter.getCurrentGroup() < anchorIndex) {
            if (slotWriter.indexInCurrentGroup(anchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    currentNodeIndex = 0;
                }
                slotWriter.startGroup();
            } else {
                currentNodeIndex += slotWriter.skipGroup();
            }
        }
        if (slotWriter.getCurrentGroup() != anchorIndex) {
            z5 = false;
        }
        ComposerKt.runtimeCheck(z5);
        return currentNodeIndex;
    }

    public static final void positionToParentOf(SlotWriter slotWriter, Applier<Object> applier, int i5) {
        while (!slotWriter.indexInParent(i5)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.up();
            }
            slotWriter.endGroup();
        }
    }

    public static final void releaseMovableGroupAtCurrent(final ControlledComposition controlledComposition, CompositionContext compositionContext, final MovableContentStateReference movableContentStateReference, SlotWriter slotWriter) {
        SlotTable slotTable = new SlotTable();
        SlotWriter openWriter = slotTable.openWriter();
        try {
            openWriter.beginInsert();
            openWriter.startGroup(MovableContentKt.movableContentKey, movableContentStateReference.getContent$runtime_release());
            SlotWriter.markGroup$default(openWriter, 0, 1, null);
            openWriter.update(movableContentStateReference.getParameter$runtime_release());
            List<Anchor> moveTo = slotWriter.moveTo(movableContentStateReference.getAnchor$runtime_release(), 1, openWriter);
            openWriter.skipGroup();
            openWriter.endGroup();
            openWriter.endInsert();
            openWriter.close();
            MovableContentState movableContentState = new MovableContentState(slotTable);
            RecomposeScopeImpl.Companion companion = RecomposeScopeImpl.Companion;
            if (companion.hasAnchoredRecomposeScopes$runtime_release(slotTable, moveTo)) {
                try {
                    companion.adoptAnchoredScopes$runtime_release(slotTable.openWriter(), moveTo, new RecomposeScopeOwner() { // from class: androidx.compose.runtime.changelist.OperationKt$releaseMovableGroupAtCurrent$movableContentRecomposeScopeOwner$1
                        @Override // androidx.compose.runtime.RecomposeScopeOwner
                        @l
                        public InvalidationResult invalidate(@l RecomposeScopeImpl recomposeScopeImpl, @m Object obj) {
                            RecomposeScopeOwner recomposeScopeOwner;
                            InvalidationResult invalidationResult;
                            List<u0<RecomposeScopeImpl, IdentityArraySet<Object>>> B4;
                            ControlledComposition controlledComposition2 = ControlledComposition.this;
                            IdentityArraySet identityArraySet = null;
                            if (controlledComposition2 instanceof RecomposeScopeOwner) {
                                recomposeScopeOwner = (RecomposeScopeOwner) controlledComposition2;
                            } else {
                                recomposeScopeOwner = null;
                            }
                            if (recomposeScopeOwner == null || (invalidationResult = recomposeScopeOwner.invalidate(recomposeScopeImpl, obj)) == null) {
                                invalidationResult = InvalidationResult.IGNORED;
                            }
                            if (invalidationResult == InvalidationResult.IGNORED) {
                                MovableContentStateReference movableContentStateReference2 = movableContentStateReference;
                                List<u0<RecomposeScopeImpl, IdentityArraySet<Object>>> invalidations$runtime_release = movableContentStateReference2.getInvalidations$runtime_release();
                                if (obj != null) {
                                    identityArraySet = new IdentityArraySet();
                                    identityArraySet.add(identityArraySet);
                                }
                                B4 = e0.B4(invalidations$runtime_release, q1.a(recomposeScopeImpl, identityArraySet));
                                movableContentStateReference2.setInvalidations$runtime_release(B4);
                                return InvalidationResult.SCHEDULED;
                            }
                            return invalidationResult;
                        }

                        @Override // androidx.compose.runtime.RecomposeScopeOwner
                        public void recomposeScopeReleased(@l RecomposeScopeImpl recomposeScopeImpl) {
                        }

                        @Override // androidx.compose.runtime.RecomposeScopeOwner
                        public void recordReadOf(@l Object obj) {
                        }
                    });
                    r2 r2Var = r2.f19517a;
                } finally {
                }
            }
            compositionContext.movableContentStateReleased$runtime_release(movableContentStateReference, movableContentState);
        } finally {
        }
    }
}
