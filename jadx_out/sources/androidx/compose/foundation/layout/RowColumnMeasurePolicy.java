package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Dp;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;
import v3.q;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010&\u001a\u00020\b\u0012\u0006\u0010'\u001a\u00020\f\u0012\u0006\u0010(\u001a\u00020\u000e¢\u0006\u0004\b9\u0010:J\t\u0010\u0003\u001a\u00020\u0002HÂ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÂ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u0016\u0010\u000b\u001a\u00020\bHÂ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\r\u001a\u00020\fHÂ\u0003J\t\u0010\u000f\u001a\u00020\u000eHÂ\u0003J,\u0010\u0019\u001a\u00020\u0016*\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\"\u0010\u001e\u001a\u00020\u001c*\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\"\u0010 \u001a\u00020\u001c*\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00112\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J\"\u0010!\u001a\u00020\u001c*\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0016J\"\u0010\"\u001a\u00020\u001c*\u00020\u001a2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00112\u0006\u0010\u001f\u001a\u00020\u001cH\u0016JS\u0010+\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\f2\b\b\u0002\u0010(\u001a\u00020\u000eHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\t\u0010-\u001a\u00020,HÖ\u0001J\t\u0010.\u001a\u00020\u001cHÖ\u0001J\u0013\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00103R\u0016\u0010$\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00104R\u0016\u0010%\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00105R\u001a\u0010&\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b&\u00106R\u0014\u0010'\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00107R\u0014\u0010(\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00108\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006;"}, d2 = {"Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/foundation/layout/LayoutOrientation;", "component1", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "component2", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "component3", "Landroidx/compose/ui/unit/Dp;", "component4-D9Ej5fM", "()F", "component4", "Landroidx/compose/foundation/layout/SizeMode;", "component5", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "component6", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "minIntrinsicWidth", "width", "minIntrinsicHeight", "maxIntrinsicWidth", "maxIntrinsicHeight", "orientation", "horizontalArrangement", "verticalArrangement", "arrangementSpacing", "crossAxisSize", "crossAxisAlignment", "copy-gwO9Abs", "(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;)Landroidx/compose/foundation/layout/RowColumnMeasurePolicy;", "copy", "", "toString", TTDownloadField.TT_HASHCODE, "", "other", "", "equals", "Landroidx/compose/foundation/layout/LayoutOrientation;", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "F", "Landroidx/compose/foundation/layout/SizeMode;", "Landroidx/compose/foundation/layout/CrossAxisAlignment;", "<init>", "(Landroidx/compose/foundation/layout/LayoutOrientation;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/layout/SizeMode;Landroidx/compose/foundation/layout/CrossAxisAlignment;Lkotlin/jvm/internal/w;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RowColumnMeasurePolicy implements MeasurePolicy {
    public static final int $stable = 0;
    private final float arrangementSpacing;

    @l
    private final CrossAxisAlignment crossAxisAlignment;

    @l
    private final SizeMode crossAxisSize;

    @m
    private final Arrangement.Horizontal horizontalArrangement;

    @l
    private final LayoutOrientation orientation;

    @m
    private final Arrangement.Vertical verticalArrangement;

    private RowColumnMeasurePolicy(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f5, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment) {
        this.orientation = layoutOrientation;
        this.horizontalArrangement = horizontal;
        this.verticalArrangement = vertical;
        this.arrangementSpacing = f5;
        this.crossAxisSize = sizeMode;
        this.crossAxisAlignment = crossAxisAlignment;
    }

    public /* synthetic */ RowColumnMeasurePolicy(LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f5, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, w wVar) {
        this(layoutOrientation, horizontal, vertical, f5, sizeMode, crossAxisAlignment);
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
    private final float m578component4D9Ej5fM() {
        return this.arrangementSpacing;
    }

    private final SizeMode component5() {
        return this.crossAxisSize;
    }

    private final CrossAxisAlignment component6() {
        return this.crossAxisAlignment;
    }

    /* renamed from: copy-gwO9Abs$default, reason: not valid java name */
    public static /* synthetic */ RowColumnMeasurePolicy m579copygwO9Abs$default(RowColumnMeasurePolicy rowColumnMeasurePolicy, LayoutOrientation layoutOrientation, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, float f5, SizeMode sizeMode, CrossAxisAlignment crossAxisAlignment, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            layoutOrientation = rowColumnMeasurePolicy.orientation;
        }
        if ((i5 & 2) != 0) {
            horizontal = rowColumnMeasurePolicy.horizontalArrangement;
        }
        Arrangement.Horizontal horizontal2 = horizontal;
        if ((i5 & 4) != 0) {
            vertical = rowColumnMeasurePolicy.verticalArrangement;
        }
        Arrangement.Vertical vertical2 = vertical;
        if ((i5 & 8) != 0) {
            f5 = rowColumnMeasurePolicy.arrangementSpacing;
        }
        float f6 = f5;
        if ((i5 & 16) != 0) {
            sizeMode = rowColumnMeasurePolicy.crossAxisSize;
        }
        SizeMode sizeMode2 = sizeMode;
        if ((i5 & 32) != 0) {
            crossAxisAlignment = rowColumnMeasurePolicy.crossAxisAlignment;
        }
        return rowColumnMeasurePolicy.m580copygwO9Abs(layoutOrientation, horizontal2, vertical2, f6, sizeMode2, crossAxisAlignment);
    }

    @l
    /* renamed from: copy-gwO9Abs, reason: not valid java name */
    public final RowColumnMeasurePolicy m580copygwO9Abs(@l LayoutOrientation layoutOrientation, @m Arrangement.Horizontal horizontal, @m Arrangement.Vertical vertical, float f5, @l SizeMode sizeMode, @l CrossAxisAlignment crossAxisAlignment) {
        return new RowColumnMeasurePolicy(layoutOrientation, horizontal, vertical, f5, sizeMode, crossAxisAlignment, null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RowColumnMeasurePolicy)) {
            return false;
        }
        RowColumnMeasurePolicy rowColumnMeasurePolicy = (RowColumnMeasurePolicy) obj;
        return this.orientation == rowColumnMeasurePolicy.orientation && l0.g(this.horizontalArrangement, rowColumnMeasurePolicy.horizontalArrangement) && l0.g(this.verticalArrangement, rowColumnMeasurePolicy.verticalArrangement) && Dp.m6049equalsimpl0(this.arrangementSpacing, rowColumnMeasurePolicy.arrangementSpacing) && this.crossAxisSize == rowColumnMeasurePolicy.crossAxisSize && l0.g(this.crossAxisAlignment, rowColumnMeasurePolicy.crossAxisAlignment);
    }

    public int hashCode() {
        int hashCode = this.orientation.hashCode() * 31;
        Arrangement.Horizontal horizontal = this.horizontalArrangement;
        int hashCode2 = (hashCode + (horizontal == null ? 0 : horizontal.hashCode())) * 31;
        Arrangement.Vertical vertical = this.verticalArrangement;
        return ((((((hashCode2 + (vertical != null ? vertical.hashCode() : 0)) * 31) + Dp.m6050hashCodeimpl(this.arrangementSpacing)) * 31) + this.crossAxisSize.hashCode()) * 31) + this.crossAxisAlignment.hashCode();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        q MaxIntrinsicHeightMeasureBlock;
        MaxIntrinsicHeightMeasureBlock = RowColumnImplKt.MaxIntrinsicHeightMeasureBlock(this.orientation);
        return ((Number) MaxIntrinsicHeightMeasureBlock.invoke(list, Integer.valueOf(i5), Integer.valueOf(intrinsicMeasureScope.mo298roundToPx0680j_4(this.arrangementSpacing)))).intValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        q MaxIntrinsicWidthMeasureBlock;
        MaxIntrinsicWidthMeasureBlock = RowColumnImplKt.MaxIntrinsicWidthMeasureBlock(this.orientation);
        return ((Number) MaxIntrinsicWidthMeasureBlock.invoke(list, Integer.valueOf(i5), Integer.valueOf(intrinsicMeasureScope.mo298roundToPx0680j_4(this.arrangementSpacing)))).intValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5) {
        int crossAxisSize;
        int mainAxisSize;
        RowColumnMeasurementHelper rowColumnMeasurementHelper = new RowColumnMeasurementHelper(this.orientation, this.horizontalArrangement, this.verticalArrangement, this.arrangementSpacing, this.crossAxisSize, this.crossAxisAlignment, list, new Placeable[list.size()], null);
        RowColumnMeasureHelperResult m582measureWithoutPlacing_EkL_Y = rowColumnMeasurementHelper.m582measureWithoutPlacing_EkL_Y(measureScope, j5, 0, list.size());
        if (this.orientation == LayoutOrientation.Horizontal) {
            crossAxisSize = m582measureWithoutPlacing_EkL_Y.getMainAxisSize();
            mainAxisSize = m582measureWithoutPlacing_EkL_Y.getCrossAxisSize();
        } else {
            crossAxisSize = m582measureWithoutPlacing_EkL_Y.getCrossAxisSize();
            mainAxisSize = m582measureWithoutPlacing_EkL_Y.getMainAxisSize();
        }
        return MeasureScope.layout$default(measureScope, crossAxisSize, mainAxisSize, null, new RowColumnMeasurePolicy$measure$1(rowColumnMeasurementHelper, m582measureWithoutPlacing_EkL_Y, measureScope), 4, null);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        q MinIntrinsicHeightMeasureBlock;
        MinIntrinsicHeightMeasureBlock = RowColumnImplKt.MinIntrinsicHeightMeasureBlock(this.orientation);
        return ((Number) MinIntrinsicHeightMeasureBlock.invoke(list, Integer.valueOf(i5), Integer.valueOf(intrinsicMeasureScope.mo298roundToPx0680j_4(this.arrangementSpacing)))).intValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        q MinIntrinsicWidthMeasureBlock;
        MinIntrinsicWidthMeasureBlock = RowColumnImplKt.MinIntrinsicWidthMeasureBlock(this.orientation);
        return ((Number) MinIntrinsicWidthMeasureBlock.invoke(list, Integer.valueOf(i5), Integer.valueOf(intrinsicMeasureScope.mo298roundToPx0680j_4(this.arrangementSpacing)))).intValue();
    }

    @l
    public String toString() {
        return "RowColumnMeasurePolicy(orientation=" + this.orientation + ", horizontalArrangement=" + this.horizontalArrangement + ", verticalArrangement=" + this.verticalArrangement + ", arrangementSpacing=" + ((Object) Dp.m6055toStringimpl(this.arrangementSpacing)) + ", crossAxisSize=" + this.crossAxisSize + ", crossAxisAlignment=" + this.crossAxisAlignment + ')';
    }
}
