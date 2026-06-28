package androidx.compose.material;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.a;
import v3.p;

@f(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2", f = "SnackbarHost.kt", i = {}, l = {TTAdConstant.VALUE_CLICK_AREA_SAAS_AUTH}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SnackbarHostKt$animatedOpacity$2 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $alpha;
    final /* synthetic */ AnimationSpec<Float> $animation;
    final /* synthetic */ a<r2> $onAnimationFinish;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedOpacity$2(Animatable<Float, AnimationVector1D> animatable, boolean z4, AnimationSpec<Float> animationSpec, a<r2> aVar, d<? super SnackbarHostKt$animatedOpacity$2> dVar) {
        super(2, dVar);
        this.$alpha = animatable;
        this.$visible = z4;
        this.$animation = animationSpec;
        this.$onAnimationFinish = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new SnackbarHostKt$animatedOpacity$2(this.$alpha, this.$visible, this.$animation, this.$onAnimationFinish, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((SnackbarHostKt$animatedOpacity$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        float f5;
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
            Animatable<Float, AnimationVector1D> animatable = this.$alpha;
            if (this.$visible) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            Float e5 = b.e(f5);
            AnimationSpec<Float> animationSpec = this.$animation;
            this.label = 1;
            if (Animatable.animateTo$default(animatable, e5, animationSpec, null, null, this, 12, null) == l5) {
                return l5;
            }
        }
        this.$onAnimationFinish.invoke();
        return r2.f19517a;
    }
}
