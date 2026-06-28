package androidx.compose.foundation.text;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.u0;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nBasicText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy$measure$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,447:1\n33#2,6:448\n*S KotlinDebug\n*F\n+ 1 BasicText.kt\nandroidx/compose/foundation/text/TextMeasurePolicy$measure$1\n*L\n392#1:448,6\n*E\n"})
/* loaded from: classes.dex */
final class TextMeasurePolicy$measure$1 extends n0 implements l<Placeable.PlacementScope, r2> {
    final /* synthetic */ List<u0<Placeable, IntOffset>> $toPlace;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextMeasurePolicy$measure$1(List<? extends u0<? extends Placeable, IntOffset>> list) {
        super(1);
        this.$toPlace = list;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        List<u0<Placeable, IntOffset>> list = this.$toPlace;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                u0<Placeable, IntOffset> u0Var = list.get(i5);
                Placeable.PlacementScope.m5049place70tqf50$default(placementScope, u0Var.component1(), u0Var.component2().m6181unboximpl(), 0.0f, 2, null);
            }
        }
    }
}
