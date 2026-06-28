package androidx.compose.ui.node;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.MeasurePolicy;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0011\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R/\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Landroidx/compose/ui/node/IntrinsicsPolicy;", "", "Landroidx/compose/ui/layout/MeasurePolicy;", "measurePolicyFromState", "measurePolicy", "Lkotlin/r2;", "updateFrom", "", "height", "minIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "minLookaheadIntrinsicWidth", "minLookaheadIntrinsicHeight", "maxLookaheadIntrinsicWidth", "maxLookaheadIntrinsicHeight", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "<set-?>", "measurePolicyState$delegate", "Landroidx/compose/runtime/MutableState;", "getMeasurePolicyState", "()Landroidx/compose/ui/layout/MeasurePolicy;", "setMeasurePolicyState", "(Landroidx/compose/ui/layout/MeasurePolicy;)V", "measurePolicyState", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nIntrinsicsPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,89:1\n81#2:90\n107#2,2:91\n*S KotlinDebug\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n*L\n30#1:90\n30#1:91,2\n*E\n"})
/* loaded from: classes.dex */
public final class IntrinsicsPolicy {

    @l
    private static final String NoPolicyError = "Intrinsic size is queried but there is no measure policy in place.";

    @l
    private final LayoutNode layoutNode;

    @l
    private final MutableState measurePolicyState$delegate;

    @l
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/IntrinsicsPolicy$Companion;", "", "()V", "NoPolicyError", "", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public IntrinsicsPolicy(@l LayoutNode layoutNode) {
        MutableState mutableStateOf$default;
        this.layoutNode = layoutNode;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.measurePolicyState$delegate = mutableStateOf$default;
    }

    private final MeasurePolicy getMeasurePolicyState() {
        return (MeasurePolicy) this.measurePolicyState$delegate.getValue();
    }

    private final MeasurePolicy measurePolicyFromState() {
        MeasurePolicy measurePolicyState = getMeasurePolicyState();
        if (measurePolicyState != null) {
            return measurePolicyState;
        }
        throw new IllegalStateException(NoPolicyError.toString());
    }

    private final void setMeasurePolicyState(MeasurePolicy measurePolicy) {
        this.measurePolicyState$delegate.setValue(measurePolicy);
    }

    @l
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final int maxIntrinsicHeight(int i5) {
        return measurePolicyFromState().maxIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildMeasurables$ui_release(), i5);
    }

    public final int maxIntrinsicWidth(int i5) {
        return measurePolicyFromState().maxIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildMeasurables$ui_release(), i5);
    }

    public final int maxLookaheadIntrinsicHeight(int i5) {
        return measurePolicyFromState().maxIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildLookaheadMeasurables$ui_release(), i5);
    }

    public final int maxLookaheadIntrinsicWidth(int i5) {
        return measurePolicyFromState().maxIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildLookaheadMeasurables$ui_release(), i5);
    }

    public final int minIntrinsicHeight(int i5) {
        return measurePolicyFromState().minIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildMeasurables$ui_release(), i5);
    }

    public final int minIntrinsicWidth(int i5) {
        return measurePolicyFromState().minIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildMeasurables$ui_release(), i5);
    }

    public final int minLookaheadIntrinsicHeight(int i5) {
        return measurePolicyFromState().minIntrinsicHeight(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildLookaheadMeasurables$ui_release(), i5);
    }

    public final int minLookaheadIntrinsicWidth(int i5) {
        return measurePolicyFromState().minIntrinsicWidth(this.layoutNode.getOuterCoordinator$ui_release(), this.layoutNode.getChildLookaheadMeasurables$ui_release(), i5);
    }

    public final void updateFrom(@l MeasurePolicy measurePolicy) {
        setMeasurePolicyState(measurePolicy);
    }
}
