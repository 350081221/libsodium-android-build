package androidx.compose.material3;

import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/material3/SliderRange;", "it", "Lkotlin/r2;", "invoke-If1S1O4", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SliderKt$RangeSlider$10$1 extends kotlin.jvm.internal.n0 implements v3.l<SliderRange, r2> {
    final /* synthetic */ v3.l<kotlin.ranges.f<Float>, r2> $onValueChange;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SliderKt$RangeSlider$10$1(v3.l<? super kotlin.ranges.f<Float>, r2> lVar) {
        super(1);
        this.$onValueChange = lVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(SliderRange sliderRange) {
        m2203invokeIf1S1O4(sliderRange.m2214unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-If1S1O4, reason: not valid java name */
    public final void m2203invokeIf1S1O4(long j5) {
        kotlin.ranges.f<Float> e5;
        v3.l<kotlin.ranges.f<Float>, r2> lVar = this.$onValueChange;
        e5 = kotlin.ranges.t.e(SliderRange.m2211getStartimpl(j5), SliderRange.m2210getEndInclusiveimpl(j5));
        lVar.invoke(e5);
    }
}
