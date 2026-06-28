package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.e1;
import kotlin.r2;
import kotlinx.coroutines.s0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.AppBarKt$BottomAppBar$appBarDragModifier$2$1", f = "AppBar.kt", i = {}, l = {594}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "", "velocity", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AppBarKt$BottomAppBar$appBarDragModifier$2$1 extends kotlin.coroutines.jvm.internal.o implements v3.q<s0, Float, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ BottomAppBarScrollBehavior $scrollBehavior;
    /* synthetic */ float F$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBar$appBarDragModifier$2$1(BottomAppBarScrollBehavior bottomAppBarScrollBehavior, kotlin.coroutines.d<? super AppBarKt$BottomAppBar$appBarDragModifier$2$1> dVar) {
        super(3, dVar);
        this.$scrollBehavior = bottomAppBarScrollBehavior;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Object invoke(s0 s0Var, Float f5, kotlin.coroutines.d<? super r2> dVar) {
        return invoke(s0Var, f5.floatValue(), dVar);
    }

    @p4.m
    public final Object invoke(@p4.l s0 s0Var, float f5, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        AppBarKt$BottomAppBar$appBarDragModifier$2$1 appBarKt$BottomAppBar$appBarDragModifier$2$1 = new AppBarKt$BottomAppBar$appBarDragModifier$2$1(this.$scrollBehavior, dVar);
        appBarKt$BottomAppBar$appBarDragModifier$2$1.F$0 = f5;
        return appBarKt$BottomAppBar$appBarDragModifier$2$1.invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        Object obj2;
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
            float f5 = this.F$0;
            BottomAppBarState state = this.$scrollBehavior.getState();
            DecayAnimationSpec<Float> flingAnimationSpec = this.$scrollBehavior.getFlingAnimationSpec();
            AnimationSpec<Float> snapAnimationSpec = this.$scrollBehavior.getSnapAnimationSpec();
            this.label = 1;
            obj2 = AppBarKt.settleAppBarBottom(state, f5, flingAnimationSpec, snapAnimationSpec, this);
            if (obj2 == l5) {
                return l5;
            }
        }
        return r2.f19517a;
    }
}
