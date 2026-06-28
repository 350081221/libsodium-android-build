package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import v3.q;

@i0(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0004\u0012\b\u00100\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u00101\u001a\u00020\b\u0012\u0006\u00102\u001a\u00020\f\u0012\u0006\u00103\u001a\u00020\u000e\u0012\u0006\u00104\u001a\u00020\b\u0012\u0006\u00105\u001a\u00020\u0012¢\u0006\u0004\bS\u0010TJ\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u0016\u0010\u000b\u001a\u00020\bHÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\r\u001a\u00020\fHÂ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÂ\u0003J\u0016\u0010\u0011\u001a\u00020\bHÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\nJ\t\u0010\u0013\u001a\u00020\u0012HÂ\u0003J,\u0010\u001d\u001a\u00020\u001a*\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\"\u0010!\u001a\u00020\u0012*\u00020\u001e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00152\u0006\u0010 \u001a\u00020\u0012H\u0016J\"\u0010#\u001a\u00020\u0012*\u00020\u001e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00152\u0006\u0010\"\u001a\u00020\u0012H\u0016J\"\u0010$\u001a\u00020\u0012*\u00020\u001e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00152\u0006\u0010\"\u001a\u00020\u0012H\u0016J\"\u0010%\u001a\u00020\u0012*\u00020\u001e2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00152\u0006\u0010 \u001a\u00020\u0012H\u0016J,\u0010)\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00152\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0012J$\u0010+\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00152\u0006\u0010 \u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u0012J,\u0010-\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00152\u0006\u0010,\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0012Jg\u00108\u001a\u00020\u00002\b\b\u0002\u0010.\u001a\u00020\u00022\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u00101\u001a\u00020\b2\b\b\u0002\u00102\u001a\u00020\f2\b\b\u0002\u00103\u001a\u00020\u000e2\b\b\u0002\u00104\u001a\u00020\b2\b\b\u0002\u00105\u001a\u00020\u0012HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b6\u00107J\t\u0010:\u001a\u000209HÖ\u0001J\t\u0010;\u001a\u00020\u0012HÖ\u0001J\u0013\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010<HÖ\u0003R\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010@R\u0016\u0010/\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010AR\u0016\u00100\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010BR\u001a\u00101\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b1\u0010CR\u0014\u00102\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010DR\u0014\u00103\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010ER\u001a\u00104\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b4\u0010CR\u0014\u00105\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010FR4\u0010I\u001a\u001f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120G¢\u0006\u0002\bH8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR4\u0010M\u001a\u001f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120G¢\u0006\u0002\bH8\u0006¢\u0006\f\n\u0004\bM\u0010J\u001a\u0004\bN\u0010LR4\u0010O\u001a\u001f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120G¢\u0006\u0002\bH8\u0006¢\u0006\f\n\u0004\bO\u0010J\u001a\u0004\bP\u0010LR4\u0010Q\u001a\u001f\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120G¢\u0006\u0002\bH8\u0006¢\u0006\f\n\u0004\bQ\u0010J\u001a\u0004\bR\u0010L\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006U"}, d2 = {"Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/foundation/layout/LayoutOrientation;", "component1", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "component2", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "component3", "Landroidx/compose/ui/unit/Dp;", "component4-D9Ej5fM", "()F", "component4", "Landroidx/compose/foundation/layout/SizeMode;", "component5", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "component6", "component7-D9Ej5fM", "component7", "", "component8", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "minIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicHeight", "maxIntrinsicWidth", "crossAxisAvailable", "mainAxisSpacing", "crossAxisSpacing", "minIntrinsicMainAxisSize", "arrangementSpacing", "maxIntrinsicMainAxisSize", "mainAxisAvailable", "intrinsicCrossAxisSize", "orientation", "horizontalArrangement", "verticalArrangement", "mainAxisArrangementSpacing", "crossAxisSize", "crossAxisAlignment", "crossAxisArrangementSpacing", "maxItemsInMainAxis", "copy-cBR-a5Y", "(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;FI)Landroidx/compose/foundation/layout/FlowMeasurePolicy;", "copy", "", "toString", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/foundation/layout/LayoutOrientation;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "F", "Landroidx/compose/foundation/layout/SizeMode;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "I", "Lkotlin/Function3;", "Lkotlin/u;", "maxMainAxisIntrinsicItemSize", "Lv3/q;", "getMaxMainAxisIntrinsicItemSize", "()Lv3/q;", "maxCrossAxisIntrinsicItemSize", "getMaxCrossAxisIntrinsicItemSize", "minCrossAxisIntrinsicItemSize", "getMinCrossAxisIntrinsicItemSize", "minMainAxisIntrinsicItemSize", "getMinMainAxisIntrinsicItemSize", "<init>", "(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;FILkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,757:1\n523#2:758\n1#3:759\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy\n*L\n235#1:758\n*E\n"})
/* loaded from: classes.dex */
final class FlowMeasurePolicy implements MeasurePolicy {

    @l
    private final CrossAxisAlignment crossAxisAlignment;
    private final float crossAxisArrangementSpacing;

    @l
    private final SizeMode crossAxisSize;

    @m
    private final Arrangement.Horizontal horizontalArrangement;
    private final float mainAxisArrangementSpacing;

    @l
    private final q<IntrinsicMeasurable, Integer, Integer, Integer> maxCrossAxisIntrinsicItemSize;
    private final int maxItemsInMainAxis;

    @l
    private final q<IntrinsicMeasurable, Integer, Integer, Integer> maxMainAxisIntrinsicItemSize;

    @l
    private final q<IntrinsicMeasurable, Integer, Integer, Integer> minCrossAxisIntrinsicItemSize;

    @l
    private final q<IntrinsicMeasurable, Integer, Integer, Integer> minMainAxisIntrinsicItemSize;

    @l
    private final LayoutOrientation orientation;

    @m
    private final Arrangement.Vertical verticalArrangement;

    private FlowMeasurePolicy(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f5, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, float f6, int i5) {
        q<IntrinsicMeasurable, Integer, Integer, Integer> qVar;
        q<IntrinsicMeasurable, Integer, Integer, Integer> qVar2;
        q<IntrinsicMeasurable, Integer, Integer, Integer> qVar3;
        q<IntrinsicMeasurable, Integer, Integer, Integer> qVar4;
        this.orientation = layoutOrientation;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.mainAxisArrangementSpacing = f5;
        this.crossAxisSize = sizeMode;
        this.crossAxisAlignment = crossAxisAlignment;
        this.crossAxisArrangementSpacing = f6;
        this.maxItemsInMainAxis = i5;
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        if (layoutOrientation == layoutOrientation2) {
            qVar = FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$1.INSTANCE;
        } else {
            qVar = FlowMeasurePolicy$maxMainAxisIntrinsicItemSize$2.INSTANCE;
        }
        this.maxMainAxisIntrinsicItemSize = qVar;
        if (layoutOrientation == layoutOrientation2) {
            qVar2 = FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$1.INSTANCE;
        } else {
            qVar2 = FlowMeasurePolicy$maxCrossAxisIntrinsicItemSize$2.INSTANCE;
        }
        this.maxCrossAxisIntrinsicItemSize = qVar2;
        if (layoutOrientation == layoutOrientation2) {
            qVar3 = FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$1.INSTANCE;
        } else {
            qVar3 = FlowMeasurePolicy$minCrossAxisIntrinsicItemSize$2.INSTANCE;
        }
        this.minCrossAxisIntrinsicItemSize = qVar3;
        if (layoutOrientation == layoutOrientation2) {
            qVar4 = FlowMeasurePolicy$minMainAxisIntrinsicItemSize$1.INSTANCE;
        } else {
            qVar4 = FlowMeasurePolicy$minMainAxisIntrinsicItemSize$2.INSTANCE;
        }
        this.minMainAxisIntrinsicItemSize = qVar4;
    }

    public /* synthetic */ FlowMeasurePolicy(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f5, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, float f6, int i5, w wVar) {
        this(layoutOrientation, horizontal, vertical, f5, sizeMode, crossAxisAlignment, f6, i5);
    }

    private final LayoutOrientation component1() {
        return this.orientation;
    }

    private final Arrangement.Horizontal component2() {
        return this.horizontalArrangement;
    }

    private final Arrangement.Vertical component3() {
        return this.verticalArrangement;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name */
    private final float m499component4D9Ej5fM() {
        return this.mainAxisArrangementSpacing;
    }

    private final SizeMode component5() {
        return this.crossAxisSize;
    }

    private final CrossAxisAlignment component6() {
        return this.crossAxisAlignment;
    }

    /* renamed from: component7-D9Ej5fM, reason: not valid java name */
    private final float m500component7D9Ej5fM() {
        return this.crossAxisArrangementSpacing;
    }

    private final int component8() {
        return this.maxItemsInMainAxis;
    }

    @l
    /* renamed from: copy-cBR-a5Y, reason: not valid java name */
    public final FlowMeasurePolicy m502copycBRa5Y(@l LayoutOrientation layoutOrientation, @m Arrangement.Horizontal horizontal, @m Arrangement.Vertical vertical, float f5, @l SizeMode sizeMode, @l CrossAxisAlignment crossAxisAlignment, float f6, int i5) {
        return new FlowMeasurePolicy(layoutOrientation, horizontal, vertical, f5, sizeMode, crossAxisAlignment, f6, i5, null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlowMeasurePolicy)) {
            return false;
        }
        FlowMeasurePolicy flowMeasurePolicy = (FlowMeasurePolicy) obj;
        return this.orientation == flowMeasurePolicy.orientation && l0.g(this.horizontalArrangement, flowMeasurePolicy.horizontalArrangement) && l0.g(this.verticalArrangement, flowMeasurePolicy.verticalArrangement) && Dp.m6049equalsimpl0(this.mainAxisArrangementSpacing, flowMeasurePolicy.mainAxisArrangementSpacing) && this.crossAxisSize == flowMeasurePolicy.crossAxisSize && l0.g(this.crossAxisAlignment, flowMeasurePolicy.crossAxisAlignment) && Dp.m6049equalsimpl0(this.crossAxisArrangementSpacing, flowMeasurePolicy.crossAxisArrangementSpacing) && this.maxItemsInMainAxis == flowMeasurePolicy.maxItemsInMainAxis;
    }

    @l
    public final q<IntrinsicMeasurable, Integer, Integer, Integer> getMaxCrossAxisIntrinsicItemSize() {
        return this.maxCrossAxisIntrinsicItemSize;
    }

    @l
    public final q<IntrinsicMeasurable, Integer, Integer, Integer> getMaxMainAxisIntrinsicItemSize() {
        return this.maxMainAxisIntrinsicItemSize;
    }

    @l
    public final q<IntrinsicMeasurable, Integer, Integer, Integer> getMinCrossAxisIntrinsicItemSize() {
        return this.minCrossAxisIntrinsicItemSize;
    }

    @l
    public final q<IntrinsicMeasurable, Integer, Integer, Integer> getMinMainAxisIntrinsicItemSize() {
        return this.minMainAxisIntrinsicItemSize;
    }

    public int hashCode() {
        int hashCode = this.orientation.hashCode() * 31;
        Arrangement.Horizontal horizontal = this.horizontalArrangement;
        int hashCode2 = (hashCode + (horizontal == null ? 0 : horizontal.hashCode())) * 31;
        Arrangement.Vertical vertical = this.verticalArrangement;
        return ((((((((((hashCode2 + (vertical != null ? vertical.hashCode() : 0)) * 31) + Dp.m6050hashCodeimpl(this.mainAxisArrangementSpacing)) * 31) + this.crossAxisSize.hashCode()) * 31) + this.crossAxisAlignment.hashCode()) * 31) + Dp.m6050hashCodeimpl(this.crossAxisArrangementSpacing)) * 31) + Integer.hashCode(this.maxItemsInMainAxis);
    }

    public final int intrinsicCrossAxisSize(@l List<? extends IntrinsicMeasurable> list, int i5, int i6, int i7) {
        return FlowLayoutKt.access$intrinsicCrossAxisSize(list, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, i5, i6, i7, this.maxItemsInMainAxis);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        if (this.orientation == LayoutOrientation.Horizontal) {
            return intrinsicCrossAxisSize(list, i5, intrinsicMeasureScope.mo298roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo298roundToPx0680j_4(this.crossAxisArrangementSpacing));
        }
        return maxIntrinsicMainAxisSize(list, i5, intrinsicMeasureScope.mo298roundToPx0680j_4(this.mainAxisArrangementSpacing));
    }

    public final int maxIntrinsicMainAxisSize(@l List<? extends IntrinsicMeasurable> list, int i5, int i6) {
        return FlowLayoutKt.access$maxIntrinsicMainAxisSize(list, this.maxMainAxisIntrinsicItemSize, i5, i6, this.maxItemsInMainAxis);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        if (this.orientation == LayoutOrientation.Horizontal) {
            return maxIntrinsicMainAxisSize(list, i5, intrinsicMeasureScope.mo298roundToPx0680j_4(this.mainAxisArrangementSpacing));
        }
        return intrinsicCrossAxisSize(list, i5, intrinsicMeasureScope.mo298roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo298roundToPx0680j_4(this.crossAxisArrangementSpacing));
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5) {
        int mainAxisTotalSize;
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, FlowMeasurePolicy$measure$1.INSTANCE, 4, null);
        }
        RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(this.orientation, this.horizontalArrangement, this.verticalArrangement, this.mainAxisArrangementSpacing, this.crossAxisSize, this.crossAxisAlignment, list, new Placeable[list.size()], null);
        FlowResult m497breakDownItemsw1Onq5I = FlowLayoutKt.m497breakDownItemsw1Onq5I(measureScope, rowColumnMeasurementHelper, this.orientation, OrientationIndependentConstraints.m522constructorimpl(j5, this.orientation), this.maxItemsInMainAxis);
        MutableVector<RowColumnMeasureHelperResult> items = m497breakDownItemsw1Onq5I.getItems();
        int size = items.getSize();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = items.getContent()[i5].getCrossAxisSize();
        }
        int[] iArr2 = new int[size];
        int crossAxisTotalSize = m497breakDownItemsw1Onq5I.getCrossAxisTotalSize() + (measureScope.mo298roundToPx0680j_4(this.crossAxisArrangementSpacing) * (items.getSize() - 1));
        LayoutOrientation layoutOrientation = this.orientation;
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        if (layoutOrientation == layoutOrientation2) {
            Arrangement.Vertical vertical = this.verticalArrangement;
            if (vertical != null) {
                vertical.arrange(measureScope, crossAxisTotalSize, iArr, iArr2);
            } else {
                throw new IllegalArgumentException("null verticalArrangement".toString());
            }
        } else {
            Arrangement.Horizontal horizontal = this.horizontalArrangement;
            if (horizontal != null) {
                horizontal.arrange(measureScope, crossAxisTotalSize, iArr, measureScope.getLayoutDirection(), iArr2);
            } else {
                throw new IllegalArgumentException("null horizontalArrangement".toString());
            }
        }
        if (this.orientation == layoutOrientation2) {
            crossAxisTotalSize = m497breakDownItemsw1Onq5I.getMainAxisTotalSize();
            mainAxisTotalSize = crossAxisTotalSize;
        } else {
            mainAxisTotalSize = m497breakDownItemsw1Onq5I.getMainAxisTotalSize();
        }
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m6014constrainWidthK40F9xA(j5, crossAxisTotalSize), ConstraintsKt.m6013constrainHeightK40F9xA(j5, mainAxisTotalSize), null, new FlowMeasurePolicy$measure$6(m497breakDownItemsw1Onq5I, rowColumnMeasurementHelper, iArr2, measureScope), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        if (this.orientation == LayoutOrientation.Horizontal) {
            return intrinsicCrossAxisSize(list, i5, intrinsicMeasureScope.mo298roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo298roundToPx0680j_4(this.crossAxisArrangementSpacing));
        }
        return minIntrinsicMainAxisSize(list, i5, intrinsicMeasureScope.mo298roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo298roundToPx0680j_4(this.crossAxisArrangementSpacing));
    }

    public final int minIntrinsicMainAxisSize(@l List<? extends IntrinsicMeasurable> list, int i5, int i6, int i7) {
        return FlowLayoutKt.access$minIntrinsicMainAxisSize(list, this.minMainAxisIntrinsicItemSize, this.minCrossAxisIntrinsicItemSize, i5, i6, i7, this.maxItemsInMainAxis);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        if (this.orientation == LayoutOrientation.Horizontal) {
            return minIntrinsicMainAxisSize(list, i5, intrinsicMeasureScope.mo298roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo298roundToPx0680j_4(this.crossAxisArrangementSpacing));
        }
        return intrinsicCrossAxisSize(list, i5, intrinsicMeasureScope.mo298roundToPx0680j_4(this.mainAxisArrangementSpacing), intrinsicMeasureScope.mo298roundToPx0680j_4(this.crossAxisArrangementSpacing));
    }

    @l
    public String toString() {
        return "FlowMeasurePolicy(orientation=" + this.orientation + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", mainAxisArrangementSpacing=" + ((Object) Dp.m6055toStringimpl(this.mainAxisArrangementSpacing)) + ", crossAxisSize=" + this.crossAxisSize + ", crossAxisAlignment=" + this.crossAxisAlignment + ", crossAxisArrangementSpacing=" + ((Object) Dp.m6055toStringimpl(this.crossAxisArrangementSpacing)) + ", maxItemsInMainAxis=" + this.maxItemsInMainAxis + ')';
    }
}
