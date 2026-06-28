package androidx.compose.runtime;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.p;
import p4.m;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nLatch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch$await$2$2\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,91:1\n82#2:92\n*S KotlinDebug\n*F\n+ 1 Latch.kt\nandroidx/compose/runtime/Latch$await$2$2\n*L\n84#1:92\n*E\n"})
/* loaded from: classes.dex */
public final class Latch$await$2$2 extends n0 implements l<Throwable, r2> {
    final /* synthetic */ p<r2> $co;
    final /* synthetic */ Latch this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Latch$await$2$2(Latch latch, p<? super r2> pVar) {
        super(1);
        this.this$0 = latch;
        this.$co = pVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
        invoke2(th);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@m Throwable th) {
        Object obj = this.this$0.lock;
        Latch latch = this.this$0;
        p<r2> pVar = this.$co;
        synchronized (obj) {
            latch.awaiters.remove(pVar);
            r2 r2Var = r2.f19517a;
        }
    }
}
