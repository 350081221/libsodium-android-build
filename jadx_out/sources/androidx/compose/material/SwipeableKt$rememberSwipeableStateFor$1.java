package androidx.compose.material;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

@f(c = "androidx.compose.material.SwipeableKt$rememberSwipeableStateFor$1", f = "Swipeable.kt", i = {}, l = {520}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@"}, d2 = {"", "T", "Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SwipeableKt$rememberSwipeableStateFor$1 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ SwipeableState<T> $swipeableState;
    final /* synthetic */ T $value;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableKt$rememberSwipeableStateFor$1(T t5, SwipeableState<T> swipeableState, d<? super SwipeableKt$rememberSwipeableStateFor$1> dVar) {
        super(2, dVar);
        this.$value = t5;
        this.$swipeableState = swipeableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new SwipeableKt$rememberSwipeableStateFor$1(this.$value, this.$swipeableState, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((SwipeableKt$rememberSwipeableStateFor$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
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
            if (!l0.g(this.$value, this.$swipeableState.getCurrentValue())) {
                SwipeableState<T> swipeableState = this.$swipeableState;
                T t5 = this.$value;
                this.label = 1;
                if (SwipeableState.animateTo$default(swipeableState, t5, null, this, 2, null) == l5) {
                    return l5;
                }
            }
        }
        return r2.f19517a;
    }
}
