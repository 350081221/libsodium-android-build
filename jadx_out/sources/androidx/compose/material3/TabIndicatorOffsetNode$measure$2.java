package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.ui.unit.Dp;
import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$2", f = "TabRow.kt", i = {}, l = {536}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TabIndicatorOffsetNode$measure$2 extends kotlin.coroutines.jvm.internal.o implements v3.p<s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ float $currentTabWidth;
    final /* synthetic */ Animatable<Dp, AnimationVector1D> $widthAnim;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabIndicatorOffsetNode$measure$2(Animatable<Dp, AnimationVector1D> animatable, float f5, kotlin.coroutines.d<? super TabIndicatorOffsetNode$measure$2> dVar) {
        super(2, dVar);
        this.$widthAnim = animatable;
        this.$currentTabWidth = f5;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new TabIndicatorOffsetNode$measure$2(this.$widthAnim, this.$currentTabWidth, dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((TabIndicatorOffsetNode$measure$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        if (i5 != 0) {
            if (i5 == 1) {
                e1.n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            e1.n(obj);
            Animatable<Dp, AnimationVector1D> animatable = this.$widthAnim;
            Dp m6042boximpl = Dp.m6042boximpl(this.$currentTabWidth);
            this.label = 1;
            if (Animatable.animateTo$default(animatable, m6042boximpl, null, null, null, this, 14, null) == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
