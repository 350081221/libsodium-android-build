package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import kotlin.b1;
import kotlin.i0;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001*B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b%\u0010&B\t\b\u0016¢\u0006\u0004\b%\u0010\u000bB\u0011\b\u0017\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b%\u0010)J*\u0010\b\u001a\u00020\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R1\u0010\u0016\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0002\b\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R1\u0010\u001b\u001a\u0019\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0002\b\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019RH\u0010 \u001a0\u0012\u0004\u0012\u00020\u0014\u0012\u001b\u0012\u0019\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u0013¢\u0006\u0002\b\u0015\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0002\b\u00158\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u0019R\u0014\u0010$\u001a\u00020\u00108BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006+"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState;", "", "slotId", "Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "precompose", "(Ljava/lang/Object;Lv3/p;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "forceRecomposeChildren$ui_release", "()V", "forceRecomposeChildren", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "slotReusePolicy", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "_state", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "Lkotlin/Function2;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/u;", "setRoot", "Lv3/p;", "getSetRoot$ui_release", "()Lv3/p;", "Landroidx/compose/runtime/CompositionContext;", "setCompositionContext", "getSetCompositionContext$ui_release", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "setMeasurePolicy", "getSetMeasurePolicy$ui_release", "getState", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "state", "<init>", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "", "maxSlotsToRetainForReuse", "(I)V", "PrecomposedSlotHandle", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SubcomposeLayoutState {
    public static final int $stable = 8;

    @m
    private LayoutNodeSubcompositionsState _state;

    @l
    private final p<LayoutNode, CompositionContext, r2> setCompositionContext;

    @l
    private final p<LayoutNode, p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, r2> setMeasurePolicy;

    @l
    private final p<LayoutNode, SubcomposeLayoutState, r2> setRoot;

    @l
    private final SubcomposeSlotReusePolicy slotReusePolicy;

    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\"\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "", "Lkotlin/r2;", "dispose", "", "index", "Landroidx/compose/ui/unit/Constraints;", "constraints", "premeasure-0kLqBqw", "(IJ)V", "premeasure", "getPlaceablesCount", "()I", "placeablesCount", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public interface PrecomposedSlotHandle {
        void dispose();

        default int getPlaceablesCount() {
            return 0;
        }

        /* renamed from: premeasure-0kLqBqw */
        default void mo5014premeasure0kLqBqw(int i5, long j5) {
        }
    }

    public SubcomposeLayoutState(@l SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.slotReusePolicy = subcomposeSlotReusePolicy;
        this.setRoot = new SubcomposeLayoutState$setRoot$1(this);
        this.setCompositionContext = new SubcomposeLayoutState$setCompositionContext$1(this);
        this.setMeasurePolicy = new SubcomposeLayoutState$setMeasurePolicy$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutNodeSubcompositionsState getState() {
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this._state;
        if (layoutNodeSubcompositionsState != null) {
            return layoutNodeSubcompositionsState;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }

    public final void forceRecomposeChildren$ui_release() {
        getState().forceRecomposeChildren();
    }

    @l
    public final p<LayoutNode, CompositionContext, r2> getSetCompositionContext$ui_release() {
        return this.setCompositionContext;
    }

    @l
    public final p<LayoutNode, p<? super SubcomposeMeasureScope, ? super Constraints, ? extends MeasureResult>, r2> getSetMeasurePolicy$ui_release() {
        return this.setMeasurePolicy;
    }

    @l
    public final p<LayoutNode, SubcomposeLayoutState, r2> getSetRoot$ui_release() {
        return this.setRoot;
    }

    @l
    public final PrecomposedSlotHandle precompose(@m Object obj, @l p<? super Composer, ? super Integer, r2> pVar) {
        return getState().precompose(obj, pVar);
    }

    public SubcomposeLayoutState() {
        this(NoOpSubcomposeSlotReusePolicy.INSTANCE);
    }

    @k(message = "This constructor is deprecated", replaceWith = @b1(expression = "SubcomposeLayoutState(SubcomposeSlotReusePolicy(maxSlotsToRetainForReuse))", imports = {"androidx.compose.ui.layout.SubcomposeSlotReusePolicy"}))
    public SubcomposeLayoutState(int i5) {
        this(SubcomposeLayoutKt.SubcomposeSlotReusePolicy(i5));
    }
}
