package androidx.compose.runtime;

import androidx.compose.runtime.BroadcastFrameClock;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"R", "", "it", "Lkotlin/r2;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nBroadcastFrameClock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$1\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,132:1\n82#2:133\n*S KotlinDebug\n*F\n+ 1 BroadcastFrameClock.kt\nandroidx/compose/runtime/BroadcastFrameClock$withFrameNanos$2$1\n*L\n94#1:133\n*E\n"})
/* loaded from: classes.dex */
final class BroadcastFrameClock$withFrameNanos$2$1 extends n0 implements l<Throwable, r2> {
    final /* synthetic */ k1.h<BroadcastFrameClock.FrameAwaiter<R>> $awaiter;
    final /* synthetic */ BroadcastFrameClock this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastFrameClock$withFrameNanos$2$1(BroadcastFrameClock broadcastFrameClock, k1.h<BroadcastFrameClock.FrameAwaiter<R>> hVar) {
        super(1);
        this.this$0 = broadcastFrameClock;
        this.$awaiter = hVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Throwable th) {
        invoke2(th);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@m Throwable th) {
        BroadcastFrameClock.FrameAwaiter frameAwaiter;
        Object obj = this.this$0.lock;
        BroadcastFrameClock broadcastFrameClock = this.this$0;
        k1.h<BroadcastFrameClock.FrameAwaiter<R>> hVar = this.$awaiter;
        synchronized (obj) {
            List list = broadcastFrameClock.awaiters;
            Object obj2 = hVar.element;
            if (obj2 == null) {
                l0.S("awaiter");
                frameAwaiter = null;
            } else {
                frameAwaiter = (BroadcastFrameClock.FrameAwaiter) obj2;
            }
            list.remove(frameAwaiter);
            r2 r2Var = r2.f19517a;
        }
    }
}
