package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.BasicText_androidKt;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010#J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectionController;", "Landroidx/compose/runtime/RememberObserver;", "Lkotlin/r2;", "onRemembered", "onForgotten", "onAbandoned", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "updateTextLayout", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "updateGlobalPosition", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", MediationConstant.RIT_TYPE_DRAW, "", "selectableId", "J", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "Landroidx/compose/ui/graphics/Color;", "backgroundSelectionColor", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "params", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "Landroidx/compose/foundation/text/selection/Selectable;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "<init>", "(JLandroidx/compose/foundation/text/selection/SelectionRegistrar;JLandroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSelectionController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n+ 2 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,339:1\n215#2,8:340\n262#2,11:348\n*S KotlinDebug\n*F\n+ 1 SelectionController.kt\nandroidx/compose/foundation/text/modifiers/SelectionController\n*L\n147#1:340,8\n147#1:348,11\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionController implements RememberObserver {
    public static final int $stable = 8;
    private final long backgroundSelectionColor;

    @l
    private final Modifier modifier;

    @l
    private StaticTextSelectionParams params;

    @m
    private Selectable selectable;
    private final long selectableId;

    @l
    private final SelectionRegistrar selectionRegistrar;

    private SelectionController(long j5, SelectionRegistrar selectionRegistrar, long j6, StaticTextSelectionParams staticTextSelectionParams) {
        Modifier makeSelectionModifier;
        this.selectableId = j5;
        this.selectionRegistrar = selectionRegistrar;
        this.backgroundSelectionColor = j6;
        this.params = staticTextSelectionParams;
        makeSelectionModifier = SelectionControllerKt.makeSelectionModifier(selectionRegistrar, j5, new SelectionController$modifier$1(this));
        this.modifier = BasicText_androidKt.textPointerHoverIcon(makeSelectionModifier, selectionRegistrar);
    }

    public /* synthetic */ SelectionController(long j5, SelectionRegistrar selectionRegistrar, long j6, StaticTextSelectionParams staticTextSelectionParams, w wVar) {
        this(j5, selectionRegistrar, j6, staticTextSelectionParams);
    }

    public final void draw(@l DrawScope drawScope) {
        int offset;
        int offset2;
        int i5;
        int B;
        int B2;
        Selection selection = this.selectionRegistrar.getSubselections().get(Long.valueOf(this.selectableId));
        if (selection == null) {
            return;
        }
        if (!selection.getHandlesCrossed()) {
            offset = selection.getStart().getOffset();
        } else {
            offset = selection.getEnd().getOffset();
        }
        if (!selection.getHandlesCrossed()) {
            offset2 = selection.getEnd().getOffset();
        } else {
            offset2 = selection.getStart().getOffset();
        }
        if (offset == offset2) {
            return;
        }
        Selectable selectable = this.selectable;
        if (selectable != null) {
            i5 = selectable.getLastVisibleOffset();
        } else {
            i5 = 0;
        }
        B = u.B(offset, i5);
        B2 = u.B(offset2, i5);
        Path pathForRange = this.params.getPathForRange(B, B2);
        if (pathForRange == null) {
            return;
        }
        if (this.params.getShouldClip()) {
            float m3562getWidthimpl = Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc());
            float m3559getHeightimpl = Size.m3559getHeightimpl(drawScope.mo4277getSizeNHjbRc());
            int m3723getIntersectrtfAjoo = ClipOp.Companion.m3723getIntersectrtfAjoo();
            DrawContext drawContext = drawScope.getDrawContext();
            long mo4202getSizeNHjbRc = drawContext.mo4202getSizeNHjbRc();
            drawContext.getCanvas().save();
            drawContext.getTransform().mo4205clipRectN_I0leg(0.0f, 0.0f, m3562getWidthimpl, m3559getHeightimpl, m3723getIntersectrtfAjoo);
            DrawScope.m4268drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
            drawContext.getCanvas().restore();
            drawContext.mo4203setSizeuvyYCjk(mo4202getSizeNHjbRc);
            return;
        }
        DrawScope.m4268drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
    }

    @l
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.selectable = this.selectionRegistrar.subscribe(new MultiWidgetSelectionDelegate(this.selectableId, new SelectionController$onRemembered$1(this), new SelectionController$onRemembered$2(this)));
    }

    public final void updateGlobalPosition(@l LayoutCoordinates layoutCoordinates) {
        this.params = StaticTextSelectionParams.copy$default(this.params, layoutCoordinates, null, 2, null);
        this.selectionRegistrar.notifyPositionChange(this.selectableId);
    }

    public final void updateTextLayout(@l TextLayoutResult textLayoutResult) {
        this.params = StaticTextSelectionParams.copy$default(this.params, null, textLayoutResult, 1, null);
    }

    public /* synthetic */ SelectionController(long j5, SelectionRegistrar selectionRegistrar, long j6, StaticTextSelectionParams staticTextSelectionParams, int i5, w wVar) {
        this(j5, selectionRegistrar, j6, (i5 & 8) != 0 ? StaticTextSelectionParams.Companion.getEmpty() : staticTextSelectionParams, null);
    }
}
