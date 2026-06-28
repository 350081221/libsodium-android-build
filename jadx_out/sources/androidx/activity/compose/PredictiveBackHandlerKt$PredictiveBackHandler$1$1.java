package androidx.activity.compose;

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

@f(c = "androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$1$1", f = "PredictiveBackHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class PredictiveBackHandlerKt$PredictiveBackHandler$1$1 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 $backCallBack;
    final /* synthetic */ boolean $enabled;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredictiveBackHandlerKt$PredictiveBackHandler$1$1(PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1, boolean z4, d<? super PredictiveBackHandlerKt$PredictiveBackHandler$1$1> dVar) {
        super(2, dVar);
        this.$backCallBack = predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1;
        this.$enabled = z4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new PredictiveBackHandlerKt$PredictiveBackHandler$1$1(this.$backCallBack, this.$enabled, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((PredictiveBackHandlerKt$PredictiveBackHandler$1$1) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            setEnabled(this.$enabled);
            return r2.f19517a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
