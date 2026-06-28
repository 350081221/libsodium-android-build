package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.ranges.u;
import p4.l;

@i0(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a>\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a2\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00162\b\b\u0002\u0010\u000b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a*\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a*\u0010\u0019\u001a\u00020\u0013*\u00020\u00132\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"horizontal", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getHorizontal", "(Landroidx/compose/ui/layout/AlignmentLine;)Z", "alignmentLineOffsetMeasure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "alignmentLine", "before", "Landroidx/compose/ui/unit/Dp;", "after", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "alignmentLineOffsetMeasure-tjqqzMA", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/AlignmentLine;FFLandroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "paddingFrom", "Landroidx/compose/ui/Modifier;", "paddingFrom-4j6BHR0", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;FF)Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/unit/TextUnit;", "paddingFrom-Y_r0B1c", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/layout/AlignmentLine;JJ)Landroidx/compose/ui/Modifier;", "paddingFromBaseline", "top", "bottom", "paddingFromBaseline-VpY3zN4", "(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;", "paddingFromBaseline-wCyjxdI", "(Landroidx/compose/ui/Modifier;JJ)Landroidx/compose/ui/Modifier;", "foundation-layout_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAlignmentLine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,366:1\n135#2:367\n135#2:368\n*S KotlinDebug\n*F\n+ 1 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n75#1:367\n121#1:368\n*E\n"})
/* loaded from: classes.dex */
public final class AlignmentLineKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: alignmentLineOffsetMeasure-tjqqzMA, reason: not valid java name */
    public static final MeasureResult m431alignmentLineOffsetMeasuretjqqzMA(MeasureScope measureScope, AlignmentLine alignmentLine, float f5, float f6, Measurable measurable, long j5) {
        long m5991copyZbe2FdA$default;
        int width;
        int m6000getMaxWidthimpl;
        int i5;
        int I;
        int i6;
        int I2;
        int max;
        int height;
        if (getHorizontal(alignmentLine)) {
            m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 11, null);
        } else {
            m5991copyZbe2FdA$default = Constraints.m5991copyZbe2FdA$default(j5, 0, 0, 0, 0, 14, null);
        }
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(m5991copyZbe2FdA$default);
        int i7 = mo4998measureBRTryo0.get(alignmentLine);
        if (i7 == Integer.MIN_VALUE) {
            i7 = 0;
        }
        if (getHorizontal(alignmentLine)) {
            width = mo4998measureBRTryo0.getHeight();
        } else {
            width = mo4998measureBRTryo0.getWidth();
        }
        if (getHorizontal(alignmentLine)) {
            m6000getMaxWidthimpl = Constraints.m5999getMaxHeightimpl(j5);
        } else {
            m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
        }
        Dp.Companion companion = Dp.Companion;
        if (!Dp.m6049equalsimpl0(f5, companion.m6064getUnspecifiedD9Ej5fM())) {
            i5 = measureScope.mo298roundToPx0680j_4(f5);
        } else {
            i5 = 0;
        }
        int i8 = m6000getMaxWidthimpl - width;
        I = u.I(i5 - i7, 0, i8);
        if (!Dp.m6049equalsimpl0(f6, companion.m6064getUnspecifiedD9Ej5fM())) {
            i6 = measureScope.mo298roundToPx0680j_4(f6);
        } else {
            i6 = 0;
        }
        I2 = u.I((i6 - width) + i7, 0, i8 - I);
        if (getHorizontal(alignmentLine)) {
            max = mo4998measureBRTryo0.getWidth();
        } else {
            max = Math.max(mo4998measureBRTryo0.getWidth() + I + I2, Constraints.m6002getMinWidthimpl(j5));
        }
        int i9 = max;
        if (getHorizontal(alignmentLine)) {
            height = Math.max(mo4998measureBRTryo0.getHeight() + I + I2, Constraints.m6001getMinHeightimpl(j5));
        } else {
            height = mo4998measureBRTryo0.getHeight();
        }
        int i10 = height;
        return MeasureScope.layout$default(measureScope, i9, i10, null, new AlignmentLineKt$alignmentLineOffsetMeasure$1(alignmentLine, f5, I, i9, I2, mo4998measureBRTryo0, i10), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getHorizontal(AlignmentLine alignmentLine) {
        return alignmentLine instanceof HorizontalAlignmentLine;
    }

    @Stable
    @l
    /* renamed from: paddingFrom-4j6BHR0, reason: not valid java name */
    public static final Modifier m432paddingFrom4j6BHR0(@l Modifier modifier, @l AlignmentLine alignmentLine, float f5, float f6) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1(alignmentLine, f5, f6);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new AlignmentLineOffsetDpElement(alignmentLine, f5, f6, noInspectorInfo, null));
    }

    /* renamed from: paddingFrom-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m433paddingFrom4j6BHR0$default(Modifier modifier, AlignmentLine alignmentLine, float f5, float f6, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f5 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        if ((i5 & 4) != 0) {
            f6 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        return m432paddingFrom4j6BHR0(modifier, alignmentLine, f5, f6);
    }

    @Stable
    @l
    /* renamed from: paddingFrom-Y_r0B1c, reason: not valid java name */
    public static final Modifier m434paddingFromY_r0B1c(@l Modifier modifier, @l AlignmentLine alignmentLine, long j5, long j6) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new AlignmentLineKt$paddingFromY_r0B1c$$inlined$debugInspectorInfo$1(alignmentLine, j5, j6);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return modifier.then(new AlignmentLineOffsetTextUnitElement(alignmentLine, j5, j6, noInspectorInfo, null));
    }

    /* renamed from: paddingFrom-Y_r0B1c$default, reason: not valid java name */
    public static /* synthetic */ Modifier m435paddingFromY_r0B1c$default(Modifier modifier, AlignmentLine alignmentLine, long j5, long j6, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = TextUnit.Companion.m6246getUnspecifiedXSAIIZE();
        }
        long j7 = j5;
        if ((i5 & 4) != 0) {
            j6 = TextUnit.Companion.m6246getUnspecifiedXSAIIZE();
        }
        return m434paddingFromY_r0B1c(modifier, alignmentLine, j7, j6);
    }

    @Stable
    @l
    /* renamed from: paddingFromBaseline-VpY3zN4, reason: not valid java name */
    public static final Modifier m436paddingFromBaselineVpY3zN4(@l Modifier modifier, float f5, float f6) {
        Modifier modifier2;
        Modifier modifier3;
        Dp.Companion companion = Dp.Companion;
        if (!Dp.m6049equalsimpl0(f5, companion.m6064getUnspecifiedD9Ej5fM())) {
            modifier2 = m433paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), f5, 0.0f, 4, null);
        } else {
            modifier2 = Modifier.Companion;
        }
        Modifier then = modifier.then(modifier2);
        if (!Dp.m6049equalsimpl0(f6, companion.m6064getUnspecifiedD9Ej5fM())) {
            modifier3 = m433paddingFrom4j6BHR0$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0.0f, f6, 2, null);
        } else {
            modifier3 = Modifier.Companion;
        }
        return then.then(modifier3);
    }

    /* renamed from: paddingFromBaseline-VpY3zN4$default, reason: not valid java name */
    public static /* synthetic */ Modifier m437paddingFromBaselineVpY3zN4$default(Modifier modifier, float f5, float f6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        if ((i5 & 2) != 0) {
            f6 = Dp.Companion.m6064getUnspecifiedD9Ej5fM();
        }
        return m436paddingFromBaselineVpY3zN4(modifier, f5, f6);
    }

    @Stable
    @l
    /* renamed from: paddingFromBaseline-wCyjxdI, reason: not valid java name */
    public static final Modifier m438paddingFromBaselinewCyjxdI(@l Modifier modifier, long j5, long j6) {
        Modifier modifier2;
        Modifier modifier3;
        if (!TextUnitKt.m6253isUnspecifiedR2X_6o(j5)) {
            modifier2 = m435paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline(), j5, 0L, 4, null);
        } else {
            modifier2 = Modifier.Companion;
        }
        Modifier then = modifier.then(modifier2);
        if (!TextUnitKt.m6253isUnspecifiedR2X_6o(j6)) {
            modifier3 = m435paddingFromY_r0B1c$default(Modifier.Companion, androidx.compose.ui.layout.AlignmentLineKt.getLastBaseline(), 0L, j6, 2, null);
        } else {
            modifier3 = Modifier.Companion;
        }
        return then.then(modifier3);
    }

    /* renamed from: paddingFromBaseline-wCyjxdI$default, reason: not valid java name */
    public static /* synthetic */ Modifier m439paddingFromBaselinewCyjxdI$default(Modifier modifier, long j5, long j6, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            j5 = TextUnit.Companion.m6246getUnspecifiedXSAIIZE();
        }
        if ((i5 & 2) != 0) {
            j6 = TextUnit.Companion.m6246getUnspecifiedXSAIIZE();
        }
        return m438paddingFromBaselinewCyjxdI(modifier, j5, j6);
    }
}
