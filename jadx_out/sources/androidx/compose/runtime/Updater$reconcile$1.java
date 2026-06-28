package androidx.compose.runtime;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;
import v3.p;

/* JADX INFO: Add missing generic type declarations: [T] */
@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lkotlin/r2;", "it", "invoke", "(Ljava/lang/Object;Lkotlin/r2;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class Updater$reconcile$1<T> extends n0 implements p<T, r2, r2> {
    final /* synthetic */ l<T, r2> $block;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Updater$reconcile$1(l<? super T, r2> lVar) {
        super(2);
        this.$block = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Object obj, r2 r2Var) {
        invoke2((Updater$reconcile$1<T>) obj, r2Var);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(T t5, @p4.l r2 r2Var) {
        this.$block.invoke(t5);
    }
}
