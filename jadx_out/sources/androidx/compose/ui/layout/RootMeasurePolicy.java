package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/ui/layout/RootMeasurePolicy;", "Landroidx/compose/ui/node/LayoutNode$NoIntrinsicsMeasurePolicy;", "()V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRootMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,68:1\n151#2,3:69\n33#2,4:72\n154#2,2:76\n38#2:78\n156#2:79\n33#2,6:80\n*S KotlinDebug\n*F\n+ 1 RootMeasurePolicy.kt\nandroidx/compose/ui/layout/RootMeasurePolicy\n*L\n47#1:69,3\n47#1:72,4\n47#1:76,2\n47#1:78\n47#1:79\n52#1:80,6\n*E\n"})
/* loaded from: classes.dex */
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {
    public static final int $stable = 0;

    @l
    public static final RootMeasurePolicy INSTANCE = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5) {
        if (list.isEmpty()) {
            return MeasureScope.layout$default(measureScope, Constraints.m6002getMinWidthimpl(j5), Constraints.m6001getMinHeightimpl(j5), null, RootMeasurePolicy$measure$1.INSTANCE, 4, null);
        }
        if (list.size() == 1) {
            Placeable mo4998measureBRTryo0 = list.get(0).mo4998measureBRTryo0(j5);
            return MeasureScope.layout$default(measureScope, ConstraintsKt.m6014constrainWidthK40F9xA(j5, mo4998measureBRTryo0.getWidth()), ConstraintsKt.m6013constrainHeightK40F9xA(j5, mo4998measureBRTryo0.getHeight()), null, new RootMeasurePolicy$measure$2(mo4998measureBRTryo0), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(list.get(i5).mo4998measureBRTryo0(j5));
        }
        int size2 = arrayList.size();
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < size2; i8++) {
            Placeable placeable = (Placeable) arrayList.get(i8);
            i6 = Math.max(placeable.getWidth(), i6);
            i7 = Math.max(placeable.getHeight(), i7);
        }
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m6014constrainWidthK40F9xA(j5, i6), ConstraintsKt.m6013constrainHeightK40F9xA(j5, i7), null, new RootMeasurePolicy$measure$4(arrayList), 4, null);
    }
}
