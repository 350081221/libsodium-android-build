package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", i = {0, 1, 1, 2, 2}, l = {804, 807, 810}, m = "invokeSuspend", n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/unit/Velocity;", "velocity", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScrollingLogic$onDragStopped$performFling$1 extends o implements p<Velocity, d<? super Velocity>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, d<? super ScrollingLogic$onDragStopped$performFling$1> dVar) {
        super(2, dVar);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, dVar);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((Velocity) obj).m6288unboximpl();
        return scrollingLogic$onDragStopped$performFling$1;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, d<? super Velocity> dVar) {
        return m406invokesFctU(velocity.m6288unboximpl(), dVar);
    }

    @m
    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final Object m406invokesFctU(long j5, @m d<? super Velocity> dVar) {
        return ((ScrollingLogic$onDragStopped$performFling$1) create(Velocity.m6270boximpl(j5), dVar)).invokeSuspend(r2.f19517a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r6 = kotlin.coroutines.intrinsics.b.l()
            int r0 = r13.label
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L35
            if (r0 == r3) goto L2e
            if (r0 == r2) goto L24
            if (r0 != r1) goto L1c
            long r0 = r13.J$1
            long r2 = r13.J$0
            kotlin.e1.n(r14)
            r9 = r0
            r0 = r14
            goto L89
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L24:
            long r2 = r13.J$1
            long r4 = r13.J$0
            kotlin.e1.n(r14)
            r0 = r14
            r7 = r4
            goto L68
        L2e:
            long r3 = r13.J$0
            kotlin.e1.n(r14)
            r0 = r14
            goto L4c
        L35:
            kotlin.e1.n(r14)
            long r4 = r13.J$0
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = androidx.compose.foundation.gestures.ScrollingLogic.access$getNestedScrollDispatcher$p(r0)
            r13.J$0 = r4
            r13.label = r3
            java.lang.Object r0 = r0.m4756dispatchPreFlingQWom1Mo(r4, r13)
            if (r0 != r6) goto L4b
            return r6
        L4b:
            r3 = r4
        L4c:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r7 = r0.m6288unboximpl()
            long r7 = androidx.compose.ui.unit.Velocity.m6282minusAH228Gc(r3, r7)
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            r13.J$0 = r3
            r13.J$1 = r7
            r13.label = r2
            java.lang.Object r0 = r0.m394doFlingAnimationQWom1Mo(r7, r13)
            if (r0 != r6) goto L65
            return r6
        L65:
            r11 = r3
            r2 = r7
            r7 = r11
        L68:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r9 = r0.m6288unboximpl()
            androidx.compose.foundation.gestures.ScrollingLogic r0 = r13.this$0
            androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r0 = androidx.compose.foundation.gestures.ScrollingLogic.access$getNestedScrollDispatcher$p(r0)
            long r2 = androidx.compose.ui.unit.Velocity.m6282minusAH228Gc(r2, r9)
            r13.J$0 = r7
            r13.J$1 = r9
            r13.label = r1
            r1 = r2
            r3 = r9
            r5 = r13
            java.lang.Object r0 = r0.m4754dispatchPostFlingRZ2iAVY(r1, r3, r5)
            if (r0 != r6) goto L88
            return r6
        L88:
            r2 = r7
        L89:
            androidx.compose.ui.unit.Velocity r0 = (androidx.compose.ui.unit.Velocity) r0
            long r0 = r0.m6288unboximpl()
            long r0 = androidx.compose.ui.unit.Velocity.m6282minusAH228Gc(r9, r0)
            long r0 = androidx.compose.ui.unit.Velocity.m6282minusAH228Gc(r2, r0)
            androidx.compose.ui.unit.Velocity r0 = androidx.compose.ui.unit.Velocity.m6270boximpl(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
