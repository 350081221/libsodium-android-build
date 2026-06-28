package androidx.compose.runtime;

import java.util.List;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.d1;
import kotlin.e1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.p;

@f(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/s0;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1564:1\n82#2:1565\n1#3:1566\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2\n*L\n849#1:1565\n*E\n"})
/* loaded from: classes.dex */
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2 extends o implements p<s0, d<? super r2>, Object> {
    final /* synthetic */ ControlledComposition $composition;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(Recomposer recomposer, ControlledComposition controlledComposition, d<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2> dVar) {
        super(2, dVar);
        this.this$0 = recomposer;
        this.$composition = controlledComposition;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        return new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(this.this$0, this.$composition, dVar);
    }

    @Override // v3.p
    @m
    public final Object invoke(@l s0 s0Var, @m d<? super r2> dVar) {
        return ((Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2) create(s0Var, dVar)).invokeSuspend(r2.f19517a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @m
    public final Object invokeSuspend(@l Object obj) {
        ControlledComposition performRecompose;
        List list;
        int i5;
        kotlinx.coroutines.p deriveStateLocked;
        kotlin.coroutines.intrinsics.d.l();
        if (this.label == 0) {
            e1.n(obj);
            performRecompose = this.this$0.performRecompose(this.$composition, null);
            Object obj2 = this.this$0.stateLock;
            Recomposer recomposer = this.this$0;
            synchronized (obj2) {
                if (performRecompose != null) {
                    try {
                        list = recomposer.compositionsAwaitingApply;
                        list.add(performRecompose);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                i5 = recomposer.concurrentCompositionsOutstanding;
                recomposer.concurrentCompositionsOutstanding = i5 - 1;
                deriveStateLocked = recomposer.deriveStateLocked();
            }
            if (deriveStateLocked != null) {
                d1.a aVar = d1.Companion;
                deriveStateLocked.resumeWith(d1.m6444constructorimpl(r2.f19517a));
            }
            return r2.f19517a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
