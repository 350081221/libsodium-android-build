package androidx.compose.foundation.pager;

import androidx.compose.foundation.lazy.layout.ObservableScopeInvalidator;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt$measurePager$9\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,631:1\n33#2,6:632\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt$measurePager$9\n*L\n410#1:632,6\n*E\n"})
/* loaded from: classes.dex */
final class PagerMeasureKt$measurePager$9 extends n0 implements l<Placeable.PlacementScope, r2> {
    final /* synthetic */ MutableState<r2> $placementScopeInvalidator;
    final /* synthetic */ List<MeasuredPage> $positionedPages;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerMeasureKt$measurePager$9(List<MeasuredPage> list, MutableState<r2> mutableState) {
        super(1);
        this.$positionedPages = list;
        this.$placementScopeInvalidator = mutableState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
        List<MeasuredPage> list = this.$positionedPages;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            list.get(i5).place(placementScope);
        }
        ObservableScopeInvalidator.m721attachToScopeimpl(this.$placementScopeInvalidator);
    }
}
