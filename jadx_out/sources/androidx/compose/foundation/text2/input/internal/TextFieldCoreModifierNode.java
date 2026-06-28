package androidx.compose.foundation.text2.input.internal;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.foundation.text2.input.TextFieldCharSequence;
import androidx.compose.foundation.text2.input.internal.selection.AndroidTextFieldMagnifier_androidKt;
import androidx.compose.foundation.text2.input.internal.selection.TextFieldMagnifierNode;
import androidx.compose.foundation.text2.input.internal.selection.TextFieldSelectionState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.Constraints;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import kotlinx.coroutines.k;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.u0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006BG\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00101\u001a\u00020'\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u00105\u001a\u000204¢\u0006\u0004\bY\u0010ZJ&\u0010\u000f\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\"\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u0014H\u0002J&\u0010$\u001a\u00020\u001c*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0014\u0010%\u001a\u00020\u001c*\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002J\f\u0010&\u001a\u00020\u001c*\u00020\u001eH\u0002JF\u00106\u001a\u00020\u001c2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020'2\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204J&\u00108\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b7\u0010\u000eJ\f\u0010:\u001a\u00020\u001c*\u000209H\u0016J\u0010\u0010=\u001a\u00020\u001c2\u0006\u0010<\u001a\u00020;H\u0016J\f\u0010?\u001a\u00020\u001c*\u00020>H\u0016R\u0016\u0010(\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010@R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010AR\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010BR\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010CR\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010DR\u0016\u00101\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010@R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010ER\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010FR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020H\u0012\u0004\u0012\u00020I0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u001e\u0010O\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010Q\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measureVerticalScroll-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measureVerticalScroll", "measureHorizontalScroll-3p2s80s", "measureHorizontalScroll", "Landroidx/compose/ui/text/TextRange;", "currSelection", "", "calculateOffsetToFollow-5zc-tL8", "(J)I", "calculateOffsetToFollow", "Landroidx/compose/ui/geometry/Rect;", "cursorRect", "containerSize", "textFieldSize", "Lkotlin/r2;", "updateScrollState", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "selection", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "drawSelection-Sb-Bc2M", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JLandroidx/compose/ui/text/TextLayoutResult;)V", "drawSelection", "drawText", "drawCursor", "", "isFocused", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "textFieldSelectionState", "Landroidx/compose/ui/graphics/Brush;", "cursorBrush", "writeable", "Landroidx/compose/foundation/ScrollState;", "scrollState", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "updateNode", "measure-3p2s80s", "measure", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", MediationConstant.RIT_TYPE_DRAW, "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "applySemantics", "Z", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;", "Landroidx/compose/ui/graphics/Brush;", "Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "cursorAlpha", "Landroidx/compose/animation/core/Animatable;", "Lkotlinx/coroutines/l2;", "changeObserverJob", "Lkotlinx/coroutines/l2;", "previousSelection", "Landroidx/compose/ui/text/TextRange;", "previousCursorRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierNode;", "textFieldMagnifierNode", "Landroidx/compose/foundation/text2/input/internal/selection/TextFieldMagnifierNode;", "getShowCursor", "()Z", "showCursor", "<init>", "(ZLandroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/foundation/text2/input/internal/selection/TextFieldSelectionState;Landroidx/compose/ui/graphics/Brush;ZLandroidx/compose/foundation/ScrollState;Landroidx/compose/foundation/gestures/Orientation;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldCoreModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,584:1\n1#2:585\n246#3:586\n*S KotlinDebug\n*F\n+ 1 TextFieldCoreModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldCoreModifierNode\n*L\n479#1:586\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldCoreModifierNode extends DelegatingNode implements LayoutModifierNode, DrawModifierNode, CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, SemanticsModifierNode {
    public static final int $stable = 8;

    @m
    private l2 changeObserverJob;

    @l
    private Brush cursorBrush;
    private boolean isFocused;

    @l
    private Orientation orientation;

    @m
    private TextRange previousSelection;

    @l
    private ScrollState scrollState;

    @l
    private final TextFieldMagnifierNode textFieldMagnifierNode;

    @l
    private TextFieldSelectionState textFieldSelectionState;

    @l
    private TransformedTextFieldState textFieldState;

    @l
    private TextLayoutState textLayoutState;
    private boolean writeable;

    @l
    private final Animatable<Float, AnimationVector1D> cursorAlpha = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);

    @l
    private Rect previousCursorRect = new Rect(-1.0f, -1.0f, -1.0f, -1.0f);

    public TextFieldCoreModifierNode(boolean z4, @l TextLayoutState textLayoutState, @l TransformedTextFieldState transformedTextFieldState, @l TextFieldSelectionState textFieldSelectionState, @l Brush brush, boolean z5, @l ScrollState scrollState, @l Orientation orientation) {
        this.isFocused = z4;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z5;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.textFieldMagnifierNode = (TextFieldMagnifierNode) delegate(AndroidTextFieldMagnifier_androidKt.textFieldMagnifierNode(this.textFieldState, this.textFieldSelectionState, this.textLayoutState, this.isFocused));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateOffsetToFollow-5zc-tL8, reason: not valid java name */
    public final int m1115calculateOffsetToFollow5zctL8(long j5) {
        boolean z4;
        TextRange textRange = this.previousSelection;
        boolean z5 = true;
        if (textRange != null && TextRange.m5540getEndimpl(j5) == TextRange.m5540getEndimpl(textRange.m5549unboximpl())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            return TextRange.m5540getEndimpl(j5);
        }
        TextRange textRange2 = this.previousSelection;
        if (textRange2 == null || TextRange.m5545getStartimpl(j5) != TextRange.m5545getStartimpl(textRange2.m5549unboximpl())) {
            z5 = false;
        }
        if (!z5) {
            return TextRange.m5545getStartimpl(j5);
        }
        return -1;
    }

    private final void drawCursor(DrawScope drawScope) {
        float H;
        boolean z4;
        if (this.cursorAlpha.getValue().floatValue() > 0.0f && getShowCursor()) {
            H = u.H(this.cursorAlpha.getValue().floatValue(), 0.0f, 1.0f);
            if (H == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                return;
            }
            Rect cursorRect = this.textFieldSelectionState.getCursorRect();
            DrawScope.m4263drawLine1RTmtNc$default(drawScope, this.cursorBrush, cursorRect.m3527getTopCenterF1C5BW0(), cursorRect.m3520getBottomCenterF1C5BW0(), cursorRect.getWidth(), 0, null, H, null, 0, 432, null);
        }
    }

    /* renamed from: drawSelection-Sb-Bc2M, reason: not valid java name */
    private final void m1116drawSelectionSbBc2M(DrawScope drawScope, long j5, TextLayoutResult textLayoutResult) {
        int m5543getMinimpl = TextRange.m5543getMinimpl(j5);
        int m5542getMaximpl = TextRange.m5542getMaximpl(j5);
        if (m5543getMinimpl != m5542getMaximpl) {
            DrawScope.m4268drawPathLG529CI$default(drawScope, textLayoutResult.getPathForRange(m5543getMinimpl, m5542getMaximpl), ((TextSelectionColors) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, TextSelectionColorsKt.getLocalTextSelectionColors())).m1058getBackgroundColor0d7_KjU(), 0.0f, null, null, 0, 60, null);
        }
    }

    private final void drawText(DrawScope drawScope, TextLayoutResult textLayoutResult) {
        TextPainter.INSTANCE.paint(drawScope.getDrawContext().getCanvas(), textLayoutResult);
    }

    private final boolean getShowCursor() {
        boolean isSpecified;
        if (this.writeable && this.isFocused) {
            isSpecified = TextFieldCoreModifierKt.isSpecified(this.cursorBrush);
            if (isSpecified) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: measureHorizontalScroll-3p2s80s, reason: not valid java name */
    private final MeasureResult m1117measureHorizontalScroll3p2s80s(MeasureScope measureScope, Measurable measurable, long j5) {
        long m5991copyZbe2FdA$default;
        if (measurable.maxIntrinsicWidth(Constraints.m5999getMaxHeightimpl(j5)) < Constraints.m6000getMaxWidthimpl(j5)) {
            m5991copyZbe2FdA$default = j5;
        } else {
            m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(j5, 0, Integer.MAX_VALUE, 0, 0, 13, null);
        }
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(m5991copyZbe2FdA$default);
        int min = Math.min(mo4998measureBRTryo0.getWidth(), Constraints.m6000getMaxWidthimpl(j5));
        return MeasureScope.layout$default(measureScope, min, mo4998measureBRTryo0.getHeight(), null, new TextFieldCoreModifierNode$measureHorizontalScroll$1(this, measureScope, mo4998measureBRTryo0, min), 4, null);
    }

    /* renamed from: measureVerticalScroll-3p2s80s, reason: not valid java name */
    private final MeasureResult m1118measureVerticalScroll3p2s80s(MeasureScope measureScope, Measurable measurable, long j5) {
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        int min = Math.min(mo4998measureBRTryo0.getHeight(), Constraints.m5999getMaxHeightimpl(j5));
        return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), min, null, new TextFieldCoreModifierNode$measureVerticalScroll$1(this, measureScope, mo4998measureBRTryo0, min), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateScrollState(Rect rect, int i5, int i6) {
        boolean z4;
        float left;
        float right;
        float f5;
        boolean z5;
        this.scrollState.setMaxValue$foundation_release(i6 - i5);
        if (getShowCursor() && rect != null) {
            boolean z6 = true;
            if (rect.getLeft() == this.previousCursorRect.getLeft()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                if (rect.getTop() == this.previousCursorRect.getTop()) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    return;
                }
            }
            if (this.orientation != Orientation.Vertical) {
                z6 = false;
            }
            if (z6) {
                left = rect.getTop();
            } else {
                left = rect.getLeft();
            }
            if (z6) {
                right = rect.getBottom();
            } else {
                right = rect.getRight();
            }
            int value = this.scrollState.getValue();
            float f6 = value + i5;
            if (right <= f6) {
                float f7 = value;
                if (left >= f7 || right - left <= i5) {
                    if (left < f7 && right - left <= i5) {
                        f5 = left - f7;
                    } else {
                        f5 = 0.0f;
                    }
                    this.previousCursorRect = rect;
                    k.f(getCoroutineScope(), null, u0.UNDISPATCHED, new TextFieldCoreModifierNode$updateScrollState$1(this, f5, null), 1, null);
                }
            }
            f5 = right - f6;
            this.previousCursorRect = rect;
            k.f(getCoroutineScope(), null, u0.UNDISPATCHED, new TextFieldCoreModifierNode$updateScrollState$1(this, f5, null), 1, null);
        }
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(@l SemanticsPropertyReceiver semanticsPropertyReceiver) {
        this.textFieldMagnifierNode.applySemantics(semanticsPropertyReceiver);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(@l ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        TextFieldCharSequence text = this.textFieldState.getText();
        TextLayoutResult layoutResult = this.textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return;
        }
        if (TextRange.m5539getCollapsedimpl(text.mo1076getSelectionInCharsd9O1mEE())) {
            drawText(contentDrawScope, layoutResult);
            drawCursor(contentDrawScope);
        } else {
            m1116drawSelectionSbBc2M(contentDrawScope, text.mo1076getSelectionInCharsd9O1mEE(), layoutResult);
            drawText(contentDrawScope, layoutResult);
        }
        this.textFieldMagnifierNode.draw(contentDrawScope);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        if (this.orientation == Orientation.Vertical) {
            return m1118measureVerticalScroll3p2s80s(measureScope, measurable, j5);
        }
        return m1117measureHorizontalScroll3p2s80s(measureScope, measurable, j5);
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@l LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setCoreNodeCoordinates(layoutCoordinates);
        this.textFieldMagnifierNode.onGloballyPositioned(layoutCoordinates);
    }

    public final void updateNode(boolean z4, @l TextLayoutState textLayoutState, @l TransformedTextFieldState transformedTextFieldState, @l TextFieldSelectionState textFieldSelectionState, @l Brush brush, boolean z5, @l ScrollState scrollState, @l Orientation orientation) {
        l2 f5;
        boolean showCursor = getShowCursor();
        boolean z6 = this.isFocused;
        TransformedTextFieldState transformedTextFieldState2 = this.textFieldState;
        TextLayoutState textLayoutState2 = this.textLayoutState;
        TextFieldSelectionState textFieldSelectionState2 = this.textFieldSelectionState;
        ScrollState scrollState2 = this.scrollState;
        this.isFocused = z4;
        this.textLayoutState = textLayoutState;
        this.textFieldState = transformedTextFieldState;
        this.textFieldSelectionState = textFieldSelectionState;
        this.cursorBrush = brush;
        this.writeable = z5;
        this.scrollState = scrollState;
        this.orientation = orientation;
        this.textFieldMagnifierNode.update(transformedTextFieldState, textFieldSelectionState, textLayoutState, z4);
        if (!getShowCursor()) {
            l2 l2Var = this.changeObserverJob;
            if (l2Var != null) {
                l2.a.b(l2Var, null, 1, null);
            }
            this.changeObserverJob = null;
            k.f(getCoroutineScope(), null, null, new TextFieldCoreModifierNode$updateNode$1(this, null), 3, null);
        } else if (!z6 || !l0.g(transformedTextFieldState2, transformedTextFieldState) || !showCursor) {
            f5 = k.f(getCoroutineScope(), null, null, new TextFieldCoreModifierNode$updateNode$2(transformedTextFieldState, this, null), 3, null);
            this.changeObserverJob = f5;
        }
        if (!l0.g(transformedTextFieldState2, transformedTextFieldState) || !l0.g(textLayoutState2, textLayoutState) || !l0.g(textFieldSelectionState2, textFieldSelectionState) || !l0.g(scrollState2, scrollState)) {
            LayoutModifierNodeKt.invalidateMeasurement(this);
        }
    }
}
