package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\u000b\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/AlignmentLineOffsetTextUnitNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLine", "()Landroidx/compose/ui/layout/AlignmentLine;", "setAlignmentLine", "(Landroidx/compose/ui/layout/AlignmentLine;)V", "Landroidx/compose/ui/unit/TextUnit;", "before", "J", "getBefore-XSAIIZE", "()J", "setBefore--R2X_6o", "(J)V", "after", "getAfter-XSAIIZE", "setAfter--R2X_6o", "<init>", "(Landroidx/compose/ui/layout/AlignmentLine;JJLkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AlignmentLineOffsetTextUnitNode extends Modifier.Node implements LayoutModifierNode {
    private long after;

    @l
    private AlignmentLine alignmentLine;
    private long before;

    private AlignmentLineOffsetTextUnitNode(AlignmentLine alignmentLine, long j5, long j6) {
        this.alignmentLine = alignmentLine;
        this.before = j5;
        this.after = j6;
    }

    public /* synthetic */ AlignmentLineOffsetTextUnitNode(AlignmentLine alignmentLine, long j5, long j6, w wVar) {
        this(alignmentLine, j5, j6);
    }

    /* renamed from: getAfter-XSAIIZE, reason: not valid java name */
    public final long m448getAfterXSAIIZE() {
        return this.after;
    }

    @l
    public final AlignmentLine getAlignmentLine() {
        return this.alignmentLine;
    }

    /* renamed from: getBefore-XSAIIZE, reason: not valid java name */
    public final long m449getBeforeXSAIIZE() {
        return this.before;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo82measure3p2s80s(@l MeasureScope measureScope, @l Measurable measurable, long j5) {
        float m6064getUnspecifiedD9Ej5fM;
        float m6064getUnspecifiedD9Ej5fM2;
        MeasureResult m431alignmentLineOffsetMeasuretjqqzMA;
        AlignmentLine alignmentLine = this.alignmentLine;
        if (!TextUnitKt.m6253isUnspecifiedR2X_6o(this.before)) {
            m6064getUnspecifiedD9Ej5fM = measureScope.mo299toDpGaN1DYA(this.before);
        } else {
            m6064getUnspecifiedD9Ej5fM = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        float f5 = m6064getUnspecifiedD9Ej5fM;
        if (!TextUnitKt.m6253isUnspecifiedR2X_6o(this.after)) {
            m6064getUnspecifiedD9Ej5fM2 = measureScope.mo299toDpGaN1DYA(this.after);
        } else {
            m6064getUnspecifiedD9Ej5fM2 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        m431alignmentLineOffsetMeasuretjqqzMA = AlignmentLineKt.m431alignmentLineOffsetMeasuretjqqzMA(measureScope, alignmentLine, f5, m6064getUnspecifiedD9Ej5fM2, measurable, j5);
        return m431alignmentLineOffsetMeasuretjqqzMA;
    }

    /* renamed from: setAfter--R2X_6o, reason: not valid java name */
    public final void m450setAfterR2X_6o(long j5) {
        this.after = j5;
    }

    public final void setAlignmentLine(@l AlignmentLine alignmentLine) {
        this.alignmentLine = alignmentLine;
    }

    /* renamed from: setBefore--R2X_6o, reason: not valid java name */
    public final void m451setBeforeR2X_6o(long j5) {
        this.before = j5;
    }
}
