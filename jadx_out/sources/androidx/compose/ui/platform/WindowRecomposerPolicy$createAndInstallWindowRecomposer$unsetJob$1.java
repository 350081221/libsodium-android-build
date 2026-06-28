package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", f = "WindowRecomposer.android.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
@kotlin.i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 extends kotlin.coroutines.jvm.internal.o implements v3.p<kotlinx.coroutines.s0, kotlin.coroutines.d<? super r2>, Object> {
    final /* synthetic */ Recomposer $newRecomposer;
    final /* synthetic */ View $rootView;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(Recomposer recomposer, View view, kotlin.coroutines.d<? super WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1> dVar) {
        super(2, dVar);
        this.$newRecomposer = recomposer;
        this.$rootView = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.l
    public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
        return new WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1(this.$newRecomposer, this.$rootView, dVar);
    }

    @Override // v3.p
    @p4.m
    public final Object invoke(@p4.l kotlinx.coroutines.s0 s0Var, @p4.m kotlin.coroutines.d<? super r2> dVar) {
        return ((WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    public final Object invokeSuspend(@p4.l Object obj) {
        Object l5;
        View view;
        l5 = kotlin.coroutines.intrinsics.d.l();
        int i5 = this.label;
        try {
            if (i5 != 0) {
                if (i5 == 1) {
                    kotlin.e1.n(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.e1.n(obj);
                Recomposer recomposer = this.$newRecomposer;
                this.label = 1;
                if (recomposer.join(this) == l5) {
                    return l5;
                }
            }
            if (WindowRecomposer_androidKt.getCompositionContext(view) == this.$newRecomposer) {
                WindowRecomposer_androidKt.setCompositionContext(this.$rootView, null);
            }
            return r2.f19517a;
        } finally {
            if (WindowRecomposer_androidKt.getCompositionContext(this.$rootView) == this.$newRecomposer) {
                WindowRecomposer_androidKt.setCompositionContext(this.$rootView, null);
            }
        }
    }
}
