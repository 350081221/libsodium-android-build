package androidx.compose.material3;

import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;

@kotlin.i0(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"androidx/compose/material3/ExitAlwaysScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "onPostFling", "material3_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ExitAlwaysScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ ExitAlwaysScrollBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExitAlwaysScrollBehavior$nestedScrollConnection$1(ExitAlwaysScrollBehavior exitAlwaysScrollBehavior) {
        this.this$0 = exitAlwaysScrollBehavior;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @p4.m
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo390onPostFlingRZ2iAVY(long r10, long r12, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.unit.Velocity> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = (androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 r0 = new androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1
            r0.<init>(r9, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r0.label
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L40
            if (r1 == r2) goto L36
            if (r1 != r8) goto L2e
            long r10 = r0.J$0
            kotlin.e1.n(r14)
            goto L80
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            long r12 = r0.J$0
            java.lang.Object r10 = r0.L$0
            androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1 r10 = (androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1) r10
            kotlin.e1.n(r14)
            goto L55
        L40:
            kotlin.e1.n(r14)
            r0.L$0 = r9
            r0.J$0 = r12
            r0.label = r2
            r1 = r9
            r2 = r10
            r4 = r12
            r6 = r0
            java.lang.Object r14 = super.mo390onPostFlingRZ2iAVY(r2, r4, r6)
            if (r14 != r7) goto L54
            return r7
        L54:
            r10 = r9
        L55:
            androidx.compose.ui.unit.Velocity r14 = (androidx.compose.ui.unit.Velocity) r14
            long r1 = r14.m6288unboximpl()
            androidx.compose.material3.ExitAlwaysScrollBehavior r11 = r10.this$0
            androidx.compose.material3.BottomAppBarState r11 = r11.getState()
            float r12 = androidx.compose.ui.unit.Velocity.m6280getYimpl(r12)
            androidx.compose.material3.ExitAlwaysScrollBehavior r13 = r10.this$0
            androidx.compose.animation.core.DecayAnimationSpec r13 = r13.getFlingAnimationSpec()
            androidx.compose.material3.ExitAlwaysScrollBehavior r10 = r10.this$0
            androidx.compose.animation.core.AnimationSpec r10 = r10.getSnapAnimationSpec()
            r14 = 0
            r0.L$0 = r14
            r0.J$0 = r1
            r0.label = r8
            java.lang.Object r14 = androidx.compose.material3.AppBarKt.access$settleAppBarBottom(r11, r12, r13, r10, r0)
            if (r14 != r7) goto L7f
            return r7
        L7f:
            r10 = r1
        L80:
            androidx.compose.ui.unit.Velocity r14 = (androidx.compose.ui.unit.Velocity) r14
            long r12 = r14.m6288unboximpl()
            long r10 = androidx.compose.ui.unit.Velocity.m6283plusAH228Gc(r10, r12)
            androidx.compose.ui.unit.Velocity r10 = androidx.compose.ui.unit.Velocity.m6270boximpl(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1.mo390onPostFlingRZ2iAVY(long, long, kotlin.coroutines.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005c, code lost:
    
        if (r9 != false) goto L16;
     */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long mo391onPostScrollDzOQY0M(long r5, long r7, int r9) {
        /*
            r4 = this;
            androidx.compose.material3.ExitAlwaysScrollBehavior r9 = r4.this$0
            v3.a r9 = r9.getCanScroll()
            java.lang.Object r9 = r9.invoke()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L19
            androidx.compose.ui.geometry.Offset$Companion r5 = androidx.compose.ui.geometry.Offset.Companion
            long r5 = r5.m3509getZeroF1C5BW0()
            return r5
        L19:
            androidx.compose.material3.ExitAlwaysScrollBehavior r9 = r4.this$0
            androidx.compose.material3.BottomAppBarState r9 = r9.getState()
            float r0 = r9.getContentOffset()
            float r1 = androidx.compose.ui.geometry.Offset.m3494getYimpl(r5)
            float r0 = r0 + r1
            r9.setContentOffset(r0)
            androidx.compose.material3.ExitAlwaysScrollBehavior r9 = r4.this$0
            androidx.compose.material3.BottomAppBarState r9 = r9.getState()
            float r9 = r9.getHeightOffset()
            r0 = 0
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r9 != 0) goto L3e
            r9 = r1
            goto L3f
        L3e:
            r9 = r2
        L3f:
            if (r9 != 0) goto L5e
            androidx.compose.material3.ExitAlwaysScrollBehavior r9 = r4.this$0
            androidx.compose.material3.BottomAppBarState r9 = r9.getState()
            float r9 = r9.getHeightOffset()
            androidx.compose.material3.ExitAlwaysScrollBehavior r3 = r4.this$0
            androidx.compose.material3.BottomAppBarState r3 = r3.getState()
            float r3 = r3.getHeightOffsetLimit()
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L5b
            r9 = r1
            goto L5c
        L5b:
            r9 = r2
        L5c:
            if (r9 == 0) goto L7b
        L5e:
            float r9 = androidx.compose.ui.geometry.Offset.m3494getYimpl(r5)
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 != 0) goto L67
            goto L68
        L67:
            r1 = r2
        L68:
            if (r1 == 0) goto L7b
            float r7 = androidx.compose.ui.geometry.Offset.m3494getYimpl(r7)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 <= 0) goto L7b
            androidx.compose.material3.ExitAlwaysScrollBehavior r7 = r4.this$0
            androidx.compose.material3.BottomAppBarState r7 = r7.getState()
            r7.setContentOffset(r0)
        L7b:
            androidx.compose.material3.ExitAlwaysScrollBehavior r7 = r4.this$0
            androidx.compose.material3.BottomAppBarState r7 = r7.getState()
            androidx.compose.material3.ExitAlwaysScrollBehavior r8 = r4.this$0
            androidx.compose.material3.BottomAppBarState r8 = r8.getState()
            float r8 = r8.getHeightOffset()
            float r5 = androidx.compose.ui.geometry.Offset.m3494getYimpl(r5)
            float r8 = r8 + r5
            r7.setHeightOffset(r8)
            androidx.compose.ui.geometry.Offset$Companion r5 = androidx.compose.ui.geometry.Offset.Companion
            long r5 = r5.m3509getZeroF1C5BW0()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExitAlwaysScrollBehavior$nestedScrollConnection$1.mo391onPostScrollDzOQY0M(long, long, int):long");
    }
}
