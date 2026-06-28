package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@Stable
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bç\u0080\u0001\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\"\u0010\t\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0016J%\u0010\u000b\u001a\u00020\f*\u00020\r2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0006\u0010\u000f\u001a\u00020\u0010H&ø\u0001\u0000J\"\u0010\u0011\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\"\u0010\u0012\u001a\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u0003H\u0016ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/MeasurePolicy;", "", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,163:1\n151#2,3:164\n33#2,4:167\n154#2,2:171\n38#2:173\n156#2:174\n151#2,3:175\n33#2,4:178\n154#2,2:182\n38#2:184\n156#2:185\n151#2,3:186\n33#2,4:189\n154#2,2:193\n38#2:195\n156#2:196\n151#2,3:197\n33#2,4:200\n154#2,2:204\n38#2:206\n156#2:207\n*S KotlinDebug\n*F\n+ 1 MeasurePolicy.kt\nandroidx/compose/ui/layout/MeasurePolicy\n*L\n102#1:164,3\n102#1:167,4\n102#1:171,2\n102#1:173\n102#1:174\n120#1:175,3\n120#1:178,4\n120#1:182,2\n120#1:184\n120#1:185\n137#1:186,3\n137#1:189,4\n137#1:193,2\n137#1:195\n137#1:196\n154#1:197,3\n154#1:200,4\n154#1:204,2\n154#1:206\n154#1:207\n*E\n"})
/* loaded from: classes.dex */
public interface MeasurePolicy {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static int maxIntrinsicHeight(@l MeasurePolicy measurePolicy, @l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
            return MeasurePolicy.super.maxIntrinsicHeight(intrinsicMeasureScope, list, i5);
        }

        @Deprecated
        public static int maxIntrinsicWidth(@l MeasurePolicy measurePolicy, @l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
            return MeasurePolicy.super.maxIntrinsicWidth(intrinsicMeasureScope, list, i5);
        }

        @Deprecated
        public static int minIntrinsicHeight(@l MeasurePolicy measurePolicy, @l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
            return MeasurePolicy.super.minIntrinsicHeight(intrinsicMeasureScope, list, i5);
        }

        @Deprecated
        public static int minIntrinsicWidth(@l MeasurePolicy measurePolicy, @l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
            return MeasurePolicy.super.minIntrinsicWidth(intrinsicMeasureScope, list, i5);
        }
    }

    default int maxIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i6), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return mo30measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i5, 0, 0, 13, null)).getHeight();
    }

    default int maxIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i6), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return mo30measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i5, 7, null)).getWidth();
    }

    @l
    /* renamed from: measure-3p2s80s */
    MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5);

    default int minIntrinsicHeight(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i6), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return mo30measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i5, 0, 0, 13, null)).getHeight();
    }

    default int minIntrinsicWidth(@l IntrinsicMeasureScope intrinsicMeasureScope, @l List<? extends IntrinsicMeasurable> list, int i5) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i6), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return mo30measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i5, 7, null)).getWidth();
    }
}
