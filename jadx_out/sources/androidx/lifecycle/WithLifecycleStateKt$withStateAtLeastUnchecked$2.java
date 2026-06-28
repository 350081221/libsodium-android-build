package androidx.lifecycle;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;

/* JADX INFO: Add missing generic type declarations: [R] */
@i0(d1 = {"\u0000\u0004\n\u0002\b\u0004\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "R", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 176)
@r1({"SMAP\nWithLifecycleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WithLifecycleState.kt\nandroidx/lifecycle/WithLifecycleStateKt$withStateAtLeastUnchecked$2\n*L\n1#1,206:1\n*E\n"})
/* loaded from: classes2.dex */
public final class WithLifecycleStateKt$withStateAtLeastUnchecked$2<R> extends n0 implements v3.a<R> {
    final /* synthetic */ v3.a<R> $block;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WithLifecycleStateKt$withStateAtLeastUnchecked$2(v3.a<? extends R> aVar) {
        super(0);
        this.$block = aVar;
    }

    @Override // v3.a
    public final R invoke() {
        return this.$block.invoke();
    }
}
