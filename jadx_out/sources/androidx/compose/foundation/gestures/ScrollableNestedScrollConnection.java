package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import kotlin.i0;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0010\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollableNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "onPostFling", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogic", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "getScrollingLogic", "()Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "enabled", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V", "<init>", "(Landroidx/compose/foundation/gestures/ScrollingLogic;Z)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScrollableNestedScrollConnection implements NestedScrollConnection {
    private boolean enabled;

    @l
    private final ScrollingLogic scrollingLogic;

    public ScrollableNestedScrollConnection(@l ScrollingLogic scrollingLogic, boolean z4) {
        this.scrollingLogic = scrollingLogic;
        this.enabled = z4;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @l
    public final ScrollingLogic getScrollingLogic() {
        return this.scrollingLogic;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @p4.m
    /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo390onPostFlingRZ2iAVY(long r3, long r5, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.unit.Velocity> r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            if (r3 == 0) goto L13
            r3 = r7
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r3 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1) r3
            int r4 = r3.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.label = r4
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1 r3 = new androidx.compose.foundation.gestures.ScrollableNestedScrollConnection$onPostFling$1
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.result
            java.lang.Object r7 = kotlin.coroutines.intrinsics.b.l()
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L37
            if (r0 != r1) goto L2f
            long r5 = r3.J$0
            java.lang.Object r3 = r3.L$0
            androidx.compose.foundation.gestures.ScrollableNestedScrollConnection r3 = (androidx.compose.foundation.gestures.ScrollableNestedScrollConnection) r3
            kotlin.e1.n(r4)
            goto L4e
        L2f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L37:
            kotlin.e1.n(r4)
            boolean r4 = r2.enabled
            if (r4 == 0) goto L59
            androidx.compose.foundation.gestures.ScrollingLogic r4 = r2.scrollingLogic
            r3.L$0 = r2
            r3.J$0 = r5
            r3.label = r1
            java.lang.Object r4 = r4.m394doFlingAnimationQWom1Mo(r5, r3)
            if (r4 != r7) goto L4d
            return r7
        L4d:
            r3 = r2
        L4e:
            androidx.compose.ui.unit.Velocity r4 = (androidx.compose.ui.unit.Velocity) r4
            long r0 = r4.m6288unboximpl()
            long r4 = androidx.compose.ui.unit.Velocity.m6282minusAH228Gc(r5, r0)
            goto L60
        L59:
            androidx.compose.ui.unit.Velocity$Companion r3 = androidx.compose.ui.unit.Velocity.Companion
            long r4 = r3.m6290getZero9UxMQ8M()
            r3 = r2
        L60:
            androidx.compose.ui.unit.Velocity r4 = androidx.compose.ui.unit.Velocity.m6270boximpl(r4)
            r4.m6288unboximpl()
            androidx.compose.foundation.gestures.ScrollingLogic r3 = r3.scrollingLogic
            r5 = 0
            r3.registerNestedFling(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableNestedScrollConnection.mo390onPostFlingRZ2iAVY(long, long, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public long mo391onPostScrollDzOQY0M(long j5, long j6, int i5) {
        if (this.enabled) {
            return this.scrollingLogic.m396performRawScrollMKHz9U(j6);
        }
        return Offset.Companion.m3509getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long mo392onPreScrollOzD1aCk(long j5, int i5) {
        if (NestedScrollSource.m4761equalsimpl0(i5, NestedScrollSource.Companion.m4767getFlingWNlRxjI())) {
            this.scrollingLogic.registerNestedFling(true);
        }
        return Offset.Companion.m3509getZeroF1C5BW0();
    }

    public final void setEnabled(boolean z4) {
        this.enabled = z4;
    }
}
