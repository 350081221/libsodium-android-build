package androidx.compose.runtime;

import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.c;
import kotlin.coroutines.jvm.internal.h;
import kotlin.d1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.q;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/ProduceFrameSignal;", "", "lock", "Lkotlin/r2;", "awaitFrameRequest", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "takeFrameRequestLocked", "Lkotlin/coroutines/d;", "requestFrameLocked", "pendingFrameContinuation", "Ljava/lang/Object;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1564:1\n82#2:1565\n82#2:1575\n314#3,9:1566\n323#3,2:1576\n1#4:1578\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/ProduceFrameSignal\n*L\n1510#1:1565\n1517#1:1575\n1516#1:1566,9\n1516#1:1576,2\n*E\n"})
/* loaded from: classes.dex */
public final class ProduceFrameSignal {

    @m
    private Object pendingFrameContinuation;

    @m
    public final Object awaitFrameRequest(@l Object obj, @l d<? super r2> dVar) {
        Object obj2;
        d e5;
        Object obj3;
        q qVar;
        Object l5;
        Object l6;
        Object obj4;
        Object obj5;
        synchronized (obj) {
            Object obj6 = this.pendingFrameContinuation;
            obj2 = RecomposerKt.ProduceAnotherFrame;
            if (obj6 == obj2) {
                obj5 = RecomposerKt.FramePending;
                this.pendingFrameContinuation = obj5;
                return r2.f19517a;
            }
            r2 r2Var = r2.f19517a;
            e5 = c.e(dVar);
            q qVar2 = new q(e5, 1);
            qVar2.B();
            synchronized (obj) {
                Object obj7 = this.pendingFrameContinuation;
                obj3 = RecomposerKt.ProduceAnotherFrame;
                if (obj7 == obj3) {
                    obj4 = RecomposerKt.FramePending;
                    this.pendingFrameContinuation = obj4;
                    qVar = qVar2;
                } else {
                    this.pendingFrameContinuation = qVar2;
                    qVar = null;
                }
            }
            if (qVar != null) {
                d1.a aVar = d1.Companion;
                qVar.resumeWith(d1.m6444constructorimpl(r2Var));
            }
            Object E = qVar2.E();
            l5 = kotlin.coroutines.intrinsics.d.l();
            if (E == l5) {
                h.c(dVar);
            }
            l6 = kotlin.coroutines.intrinsics.d.l();
            if (E == l6) {
                return E;
            }
            return r2Var;
        }
    }

    @m
    public final d<r2> requestFrameLocked() {
        Object obj;
        Object obj2;
        boolean g5;
        Object obj3;
        Object obj4;
        Object obj5 = this.pendingFrameContinuation;
        if (obj5 instanceof d) {
            obj4 = RecomposerKt.FramePending;
            this.pendingFrameContinuation = obj4;
            return (d) obj5;
        }
        obj = RecomposerKt.ProduceAnotherFrame;
        if (l0.g(obj5, obj)) {
            g5 = true;
        } else {
            obj2 = RecomposerKt.FramePending;
            g5 = l0.g(obj5, obj2);
        }
        if (!g5) {
            if (obj5 == null) {
                obj3 = RecomposerKt.ProduceAnotherFrame;
                this.pendingFrameContinuation = obj3;
            } else {
                throw new IllegalStateException(("invalid pendingFrameContinuation " + obj5).toString());
            }
        }
        return null;
    }

    public final void takeFrameRequestLocked() {
        Object obj;
        boolean z4;
        Object obj2 = this.pendingFrameContinuation;
        obj = RecomposerKt.FramePending;
        if (obj2 == obj) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.pendingFrameContinuation = null;
            return;
        }
        throw new IllegalStateException("frame not pending".toString());
    }
}
