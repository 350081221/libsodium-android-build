package androidx.compose.foundation.text2.input.internal;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.math.d;
import kotlin.q1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B_\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u00126\u0010\u0016\u001a2\u0012\u0004\u0012\u00020\u000e\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\r¢\u0006\u0002\b\u0015¢\u0006\u0004\b&\u0010'J^\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b26\u0010\u0016\u001a2\u0012\u0004\u0012\u00020\u000e\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\r¢\u0006\u0002\b\u0015J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J&\u0010#\u001a\u00020 *\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TextFieldTextLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "textLayoutState", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "textFieldState", "Landroidx/compose/ui/text/TextStyle;", "textStyle", "", "singleLine", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/v0;", "name", "getResult", "Lkotlin/r2;", "Lkotlin/u;", "onTextLayout", "updateNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", "Z", "<init>", "(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;Landroidx/compose/ui/text/TextStyle;ZLv3/p;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldTextLayoutModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldTextLayoutModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldTextLayoutModifierNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,161:1\n154#2:162\n*S KotlinDebug\n*F\n+ 1 TextFieldTextLayoutModifier.kt\nandroidx/compose/foundation/text2/input/internal/TextFieldTextLayoutModifierNode\n*L\n146#1:162\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldTextLayoutModifierNode extends Modifier.Node implements LayoutModifierNode, GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;
    private boolean singleLine;

    @l
    private TextLayoutState textLayoutState;

    public TextFieldTextLayoutModifierNode(@l TextLayoutState textLayoutState, @l TransformedTextFieldState transformedTextFieldState, @l TextStyle textStyle, boolean z4, @m p<? super Density, ? super v3.a<TextLayoutResult>, r2> pVar) {
        this.textLayoutState = textLayoutState;
        this.singleLine = z4;
        textLayoutState.setOnTextLayout(pVar);
        TextLayoutState textLayoutState2 = this.textLayoutState;
        boolean z5 = this.singleLine;
        textLayoutState2.updateNonMeasureInputs(transformedTextFieldState, textStyle, z5, !z5);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        float m6044constructorimpl;
        int L0;
        int L02;
        Map<AlignmentLine, Integer> W;
        TextLayoutResult m1134layoutWithNewMeasureInputshBUhpc = this.textLayoutState.m1134layoutWithNewMeasureInputshBUhpc(measureScope, measureScope.getLayoutDirection(), (FontFamily.Resolver) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, CompositionLocalsKt.getLocalFontFamilyResolver()), j5);
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(Constraints.Companion.m6008fixedJhjzzOo(IntSize.m6214getWidthimpl(m1134layoutWithNewMeasureInputshBUhpc.m5518getSizeYbymL2g()), IntSize.m6213getHeightimpl(m1134layoutWithNewMeasureInputshBUhpc.m5518getSizeYbymL2g())));
        TextLayoutState textLayoutState = this.textLayoutState;
        if (this.singleLine) {
            m6044constructorimpl = measureScope.mo301toDpu2uoSUM(TextDelegateKt.ceilToIntPx(m1134layoutWithNewMeasureInputshBUhpc.getLineBottom(0)));
        } else {
            m6044constructorimpl = Dp.m6044constructorimpl(0);
        }
        textLayoutState.m1135setMinHeightForSingleLineField0680j_4(m6044constructorimpl);
        int m6214getWidthimpl = IntSize.m6214getWidthimpl(m1134layoutWithNewMeasureInputshBUhpc.m5518getSizeYbymL2g());
        int m6213getHeightimpl = IntSize.m6213getHeightimpl(m1134layoutWithNewMeasureInputshBUhpc.m5518getSizeYbymL2g());
        HorizontalAlignmentLine firstBaseline = AlignmentLineKt.getFirstBaseline();
        L0 = d.L0(m1134layoutWithNewMeasureInputshBUhpc.getFirstBaseline());
        HorizontalAlignmentLine lastBaseline = AlignmentLineKt.getLastBaseline();
        L02 = d.L0(m1134layoutWithNewMeasureInputshBUhpc.getLastBaseline());
        W = a1.W(q1.a(firstBaseline, Integer.valueOf(L0)), q1.a(lastBaseline, Integer.valueOf(L02)));
        return measureScope.layout(m6214getWidthimpl, m6213getHeightimpl, W, new TextFieldTextLayoutModifierNode$measure$1(mo4998measureBRTryo0));
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@l LayoutCoordinates layoutCoordinates) {
        this.textLayoutState.setTextLayoutNodeCoordinates(layoutCoordinates);
    }

    public final void updateNode(@l TextLayoutState textLayoutState, @l TransformedTextFieldState transformedTextFieldState, @l TextStyle textStyle, boolean z4, @m p<? super Density, ? super v3.a<TextLayoutResult>, r2> pVar) {
        this.textLayoutState = textLayoutState;
        textLayoutState.setOnTextLayout(pVar);
        this.singleLine = z4;
        this.textLayoutState.updateNonMeasureInputs(transformedTextFieldState, textStyle, z4, !z4);
    }
}
