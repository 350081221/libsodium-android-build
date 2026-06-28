package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import com.umeng.commonsdk.framework.UMModuleRegister;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\r\u001a\u00020\fR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventProcessor;", "", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "", "isInBounds", "Landroidx/compose/ui/input/pointer/ProcessResult;", "process-BIzXfog", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;Z)I", UMModuleRegister.PROCESS, "Lkotlin/r2;", "processCancel", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/node/LayoutNode;", "getRoot", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "hitPathTracker", "Landroidx/compose/ui/input/pointer/HitPathTracker;", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "pointerInputChangeEventProducer", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "Landroidx/compose/ui/node/HitTestResult;", "hitResult", "Landroidx/compose/ui/node/HitTestResult;", "isProcessing", "Z", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PointerInputEventProcessor {
    public static final int $stable = 8;

    @l
    private final HitPathTracker hitPathTracker;
    private boolean isProcessing;

    @l
    private final LayoutNode root;

    @l
    private final PointerInputChangeEventProducer pointerInputChangeEventProducer = new PointerInputChangeEventProducer();

    @l
    private final HitTestResult hitResult = new HitTestResult();

    public PointerInputEventProcessor(@l LayoutNode layoutNode) {
        this.root = layoutNode;
        this.hitPathTracker = new HitPathTracker(layoutNode.getCoordinates());
    }

    /* renamed from: process-BIzXfog$default, reason: not valid java name */
    public static /* synthetic */ int m4893processBIzXfog$default(PointerInputEventProcessor pointerInputEventProcessor, PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator, boolean z4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            z4 = true;
        }
        return pointerInputEventProcessor.m4894processBIzXfog(pointerInputEvent, positionCalculator, z4);
    }

    @l
    public final LayoutNode getRoot() {
        return this.root;
    }

    /* renamed from: process-BIzXfog, reason: not valid java name */
    public final int m4894processBIzXfog(@l PointerInputEvent pointerInputEvent, @l PositionCalculator positionCalculator, boolean z4) {
        boolean z5;
        if (this.isProcessing) {
            return PointerInputEventProcessorKt.ProcessResult(false, false);
        }
        boolean z6 = true;
        try {
            this.isProcessing = true;
            InternalPointerEvent produce = this.pointerInputChangeEventProducer.produce(pointerInputEvent, positionCalculator);
            int size = produce.getChanges().size();
            for (int i5 = 0; i5 < size; i5++) {
                PointerInputChange valueAt = produce.getChanges().valueAt(i5);
                if (!valueAt.getPressed() && !valueAt.getPreviousPressed()) {
                }
                z5 = false;
                break;
            }
            z5 = true;
            int size2 = produce.getChanges().size();
            for (int i6 = 0; i6 < size2; i6++) {
                PointerInputChange valueAt2 = produce.getChanges().valueAt(i6);
                if (z5 || PointerEventKt.changedToDownIgnoreConsumed(valueAt2)) {
                    LayoutNode.m5123hitTestM_7yMNQ$ui_release$default(this.root, valueAt2.m4872getPositionF1C5BW0(), this.hitResult, PointerType.m4944equalsimpl0(valueAt2.m4875getTypeT8wyACA(), PointerType.Companion.m4951getTouchT8wyACA()), false, 8, null);
                    if (!this.hitResult.isEmpty()) {
                        this.hitPathTracker.m4800addHitPathKNwqfcY(valueAt2.m4870getIdJ3iCeTQ(), this.hitResult);
                        this.hitResult.clear();
                    }
                }
            }
            this.hitPathTracker.removeDetachedPointerInputFilters();
            boolean dispatchChanges = this.hitPathTracker.dispatchChanges(produce, z4);
            if (!produce.getSuppressMovementConsumption()) {
                int size3 = produce.getChanges().size();
                for (int i7 = 0; i7 < size3; i7++) {
                    PointerInputChange valueAt3 = produce.getChanges().valueAt(i7);
                    if (PointerEventKt.positionChangedIgnoreConsumed(valueAt3) && valueAt3.isConsumed()) {
                        break;
                    }
                }
            }
            z6 = false;
            return PointerInputEventProcessorKt.ProcessResult(dispatchChanges, z6);
        } finally {
            this.isProcessing = false;
        }
    }

    public final void processCancel() {
        if (!this.isProcessing) {
            this.pointerInputChangeEventProducer.clear();
            this.hitPathTracker.processCancel();
        }
    }
}
