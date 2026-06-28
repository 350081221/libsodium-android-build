package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.selection.MouseSelectionObserver;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionGesturesKt;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.i0;
import p4.l;
import v3.a;

@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¨\u0006\b"}, d2 = {"makeSelectionModifier", "Landroidx/compose/ui/Modifier;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectableId", "", "layoutCoordinates", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionControllerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier makeSelectionModifier(final SelectionRegistrar selectionRegistrar, final long j5, final a<? extends LayoutCoordinates> aVar) {
        TextDragObserver textDragObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$longPressDragObserver$1
            private long dragTotalDistance;
            private long lastPosition;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: Multi-variable type inference failed */
            {
                Offset.Companion companion = Offset.Companion;
                this.lastPosition = companion.m3509getZeroF1C5BW0();
                this.dragTotalDistance = companion.m3509getZeroF1C5BW0();
            }

            public final long getDragTotalDistance() {
                return this.dragTotalDistance;
            }

            public final long getLastPosition() {
                return this.lastPosition;
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j5)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo895onDownk4lQ0M(long j6) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo896onDragk4lQ0M(long j6) {
                LayoutCoordinates invoke = aVar.invoke();
                if (invoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j7 = j5;
                    if (!invoke.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j7)) {
                        return;
                    }
                    long m3498plusMKHz9U = Offset.m3498plusMKHz9U(this.dragTotalDistance, j6);
                    this.dragTotalDistance = m3498plusMKHz9U;
                    long m3498plusMKHz9U2 = Offset.m3498plusMKHz9U(this.lastPosition, m3498plusMKHz9U);
                    if (selectionRegistrar2.mo1040notifySelectionUpdatenjBpvok(invoke, m3498plusMKHz9U2, this.lastPosition, false, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), true)) {
                        this.lastPosition = m3498plusMKHz9U2;
                        this.dragTotalDistance = Offset.Companion.m3509getZeroF1C5BW0();
                    }
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo897onStartk4lQ0M(long j6) {
                LayoutCoordinates invoke = aVar.invoke();
                if (invoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    if (!invoke.isAttached()) {
                        return;
                    }
                    selectionRegistrar2.mo1041notifySelectionUpdateStartubNVwUQ(invoke, j6, SelectionAdjustment.Companion.getWord(), true);
                    this.lastPosition = j6;
                }
                if (!SelectionRegistrarKt.hasSelection(selectionRegistrar, j5)) {
                    return;
                }
                this.dragTotalDistance = Offset.Companion.m3509getZeroF1C5BW0();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                if (SelectionRegistrarKt.hasSelection(selectionRegistrar, j5)) {
                    selectionRegistrar.notifySelectionUpdateEnd();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            public final void setDragTotalDistance(long j6) {
                this.dragTotalDistance = j6;
            }

            public final void setLastPosition(long j6) {
                this.lastPosition = j6;
            }
        };
        return SelectionGesturesKt.selectionGestureInput(Modifier.Companion, new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.modifiers.SelectionControllerKt$makeSelectionModifier$mouseSelectionObserver$1
            private long lastPosition = Offset.Companion.m3509getZeroF1C5BW0();

            public final long getLastPosition() {
                return this.lastPosition;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k, reason: not valid java name */
            public boolean mo968onDrag3MmeM6k(long j6, @l SelectionAdjustment selectionAdjustment) {
                LayoutCoordinates invoke = aVar.invoke();
                if (invoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j7 = j5;
                    if (!invoke.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j7)) {
                        return false;
                    }
                    if (selectionRegistrar2.mo1040notifySelectionUpdatenjBpvok(invoke, j6, this.lastPosition, false, selectionAdjustment, false)) {
                        this.lastPosition = j6;
                        return true;
                    }
                    return true;
                }
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
                selectionRegistrar.notifySelectionUpdateEnd();
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M, reason: not valid java name */
            public boolean mo969onExtendk4lQ0M(long j6) {
                LayoutCoordinates invoke = aVar.invoke();
                if (invoke == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j7 = j5;
                if (!invoke.isAttached()) {
                    return false;
                }
                if (selectionRegistrar2.mo1040notifySelectionUpdatenjBpvok(invoke, j6, this.lastPosition, false, SelectionAdjustment.Companion.getNone(), false)) {
                    this.lastPosition = j6;
                }
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j7);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M, reason: not valid java name */
            public boolean mo970onExtendDragk4lQ0M(long j6) {
                LayoutCoordinates invoke = aVar.invoke();
                if (invoke != null) {
                    SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                    long j7 = j5;
                    if (!invoke.isAttached() || !SelectionRegistrarKt.hasSelection(selectionRegistrar2, j7)) {
                        return false;
                    }
                    if (selectionRegistrar2.mo1040notifySelectionUpdatenjBpvok(invoke, j6, this.lastPosition, false, SelectionAdjustment.Companion.getNone(), false)) {
                        this.lastPosition = j6;
                        return true;
                    }
                    return true;
                }
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k, reason: not valid java name */
            public boolean mo971onStart3MmeM6k(long j6, @l SelectionAdjustment selectionAdjustment) {
                LayoutCoordinates invoke = aVar.invoke();
                if (invoke == null) {
                    return false;
                }
                SelectionRegistrar selectionRegistrar2 = selectionRegistrar;
                long j7 = j5;
                if (!invoke.isAttached()) {
                    return false;
                }
                selectionRegistrar2.mo1041notifySelectionUpdateStartubNVwUQ(invoke, j6, selectionAdjustment, false);
                this.lastPosition = j6;
                return SelectionRegistrarKt.hasSelection(selectionRegistrar2, j7);
            }

            public final void setLastPosition(long j6) {
                this.lastPosition = j6;
            }
        }, textDragObserver);
    }
}
