package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.unit.IntOffset;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.e1;
import kotlin.i0;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.lazy.layout.LazyLayoutAnimation$cancelPlacementAnimation$1", f = "LazyLayoutAnimation.kt", i = {}, l = {92}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyLayoutAnimation$cancelPlacementAnimation$1 extends o implements p<s0, d<? super r2>, Object> {
    int label;
    final /* synthetic */ LazyLayoutAnimation this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutAnimation$cancelPlacementAnimation$1(LazyLayoutAnimation lazyLayoutAnimation, d<? super LazyLayoutAnimation$cancelPlacementAnimation$1> dVar) {
        super(2, dVar);
        this.this$0 = lazyLayoutAnimation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new LazyLayoutAnimation$cancelPlacementAnimation$1(this.this$0, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((LazyLayoutAnimation$cancelPlacementAnimation$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        Object l5;
        Animatable animatable;
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
            animatable = this.this$0.placementDeltaAnimation;
            IntOffset m6163boximpl = IntOffset.m6163boximpl(IntOffset.Companion.m6182getZeronOccac());
            this.label = 1;
            if (animatable.snapTo(m6163boximpl, this) == l5) {
                return l5;
            }
        }
        this.this$0.m700setPlacementDeltagyyYBs(IntOffset.Companion.m6182getZeronOccac());
        this.this$0.setPlacementAnimationInProgress(false);
        return r2.f19517a;
    }
}
