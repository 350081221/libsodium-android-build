package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.math.d;
import kotlin.u0;
import p4.l;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00030\f¢\u0006\u0004\b\u0010\u0010\u0011J,\u0010\u000b\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR$\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00030\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text/TextMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "measure", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "placements", "Lv3/a;", "<init>", "(Lv3/a;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,447:1\n298#2,3:448\n69#2,4:451\n301#2:455\n302#2:457\n74#2:458\n303#2:459\n1#3:456\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy\n*L\n373#1:448,3\n373#1:451,4\n373#1:455\n373#1:457\n373#1:458\n373#1:459\n373#1:456\n*E\n"})
/* loaded from: classes.dex */
public final class TextMeasurePolicy implements MeasurePolicy {

    @l
    private final a<List<Rect>> placements;

    /* JADX WARN: Multi-variable type inference failed */
    public TextMeasurePolicy(@l a<? extends List<Rect>> aVar) {
        this.placements = aVar;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    @l
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo30measure3p2s80s(@l MeasureScope measureScope, @l List<? extends Measurable> list, long j5) {
        u0 u0Var;
        int L0;
        int L02;
        List<Rect> invoke = this.placements.invoke();
        ArrayList arrayList = null;
        if (invoke != null) {
            ArrayList arrayList2 = new ArrayList(invoke.size());
            int size = invoke.size();
            for (int i5 = 0; i5 < size; i5++) {
                Rect rect = invoke.get(i5);
                if (rect != null) {
                    Placeable mo4998measureBRTryo0 = list.get(i5).mo4998measureBRTryo0(ConstraintsKt.Constraints$default(0, (int) Math.floor(rect.getWidth()), 0, (int) Math.floor(rect.getHeight()), 5, null));
                    L0 = d.L0(rect.getLeft());
                    L02 = d.L0(rect.getTop());
                    u0Var = new u0(mo4998measureBRTryo0, IntOffset.m6163boximpl(IntOffsetKt.IntOffset(L0, L02)));
                } else {
                    u0Var = null;
                }
                if (u0Var != null) {
                    arrayList2.add(u0Var);
                }
            }
            arrayList = arrayList2;
        }
        return MeasureScope.layout$default(measureScope, Constraints.m6000getMaxWidthimpl(j5), Constraints.m5999getMaxHeightimpl(j5), null, new TextMeasurePolicy$measure$1(arrayList), 4, null);
    }
}
