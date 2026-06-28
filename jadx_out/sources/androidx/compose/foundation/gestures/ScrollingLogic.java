package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import kotlin.i0;
import p4.l;
import p4.m;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u00103\u001a\u00020)\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\bH\u0010IJ\u0017\u0010\u0006\u001a\u00020\u0003*\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\t\u001a\u00020\u0003*\u00020\u0003ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\f\u001a\u00020\u0002*\u00020\u0003ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\f\u001a\u00020\u0002*\u00020\rø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0014\u0010\u0010\u001a\u00020\r*\u00020\rø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001c\u0010\u0014\u001a\u00020\r*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0002ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0015\u001a\u00020\u0002*\u00020\u0002J\u0014\u0010\u0015\u001a\u00020\u0003*\u00020\u0003ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\bJ$\u0010\u001d\u001a\u00020\u0003*\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0019ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010\bJ\u001b\u0010%\u001a\u00020\"2\u0006\u0010!\u001a\u00020\rH\u0086@ø\u0001\u0001¢\u0006\u0004\b#\u0010$J\u001b\u0010(\u001a\u00020\r2\u0006\u0010&\u001a\u00020\rH\u0086@ø\u0001\u0001¢\u0006\u0004\b'\u0010$J\u0006\u0010*\u001a\u00020)J\u000e\u0010,\u001a\u00020\"2\u0006\u0010+\u001a\u00020)J8\u0010\u0014\u001a\u00020\"2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u00103\u001a\u00020)2\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206R\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010=R\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010>R\u0016\u00103\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010?R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010@R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010AR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020)0B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020)8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006J"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "", "Landroidx/compose/ui/geometry/Offset;", "toOffset-tuRUvjQ", "(F)J", "toOffset", "singleAxisOffset-MK-Hz9U", "(J)J", "singleAxisOffset", "toFloat-k-4lQ0M", "(J)F", "toFloat", "Landroidx/compose/ui/unit/Velocity;", "toFloat-TH1AsA0", "singleAxisVelocity-AH228Gc", "singleAxisVelocity", "newValue", "update-QWom1Mo", "(JF)J", "update", "reverseIfNeeded", "reverseIfNeeded-MK-Hz9U", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialAvailableDelta", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "dispatchScroll-3eAAhYA", "(Landroidx/compose/foundation/gestures/ScrollScope;JI)J", "dispatchScroll", "scroll", "performRawScroll-MK-Hz9U", "performRawScroll", "initialVelocity", "Lkotlin/r2;", "onDragStopped-sF-c-tU", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "onDragStopped", "available", "doFlingAnimation-QWom1Mo", "doFlingAnimation", "", "shouldScrollImmediately", "isFlinging", "registerNestedFling", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollableState", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "reverseDirection", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingBehavior", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "nestedScrollDispatcher", "Landroidx/compose/foundation/gestures/ScrollableState;", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "setScrollableState", "(Landroidx/compose/foundation/gestures/ScrollableState;)V", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/foundation/OverscrollEffect;", "Z", "Landroidx/compose/foundation/gestures/FlingBehavior;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Landroidx/compose/runtime/MutableState;", "isNestedFlinging", "Landroidx/compose/runtime/MutableState;", "getShouldDispatchOverscroll", "()Z", "shouldDispatchOverscroll", "<init>", "(Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/OverscrollEffect;ZLandroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ScrollingLogic {

    @l
    private FlingBehavior flingBehavior;

    @l
    private final MutableState<Boolean> isNestedFlinging;

    @l
    private NestedScrollDispatcher nestedScrollDispatcher;

    @l
    private Orientation orientation;

    @m
    private OverscrollEffect overscrollEffect;
    private boolean reverseDirection;

    @l
    private ScrollableState scrollableState;

    public ScrollingLogic(@l ScrollableState scrollableState, @l Orientation orientation, @m OverscrollEffect overscrollEffect, boolean z4, @l FlingBehavior flingBehavior, @l NestedScrollDispatcher nestedScrollDispatcher) {
        MutableState<Boolean> mutableStateOf$default;
        this.scrollableState = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.reverseDirection = z4;
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.isNestedFlinging = mutableStateOf$default;
    }

    private final boolean getShouldDispatchOverscroll() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    /* renamed from: dispatchScroll-3eAAhYA, reason: not valid java name */
    public final long m393dispatchScroll3eAAhYA(@l ScrollScope scrollScope, long j5, int i5) {
        ScrollingLogic$dispatchScroll$performScroll$1 scrollingLogic$dispatchScroll$performScroll$1 = new ScrollingLogic$dispatchScroll$performScroll$1(this, i5, scrollScope);
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        if (NestedScrollSource.m4761equalsimpl0(i5, NestedScrollSource.Companion.m4769getWheelWNlRxjI())) {
            return scrollingLogic$dispatchScroll$performScroll$1.invoke(Offset.m3482boximpl(j5)).m3503unboximpl();
        }
        if (overscrollEffect != null && getShouldDispatchOverscroll()) {
            return overscrollEffect.mo182applyToScrollRhakbz0(j5, i5, scrollingLogic$dispatchScroll$performScroll$1);
        }
        return scrollingLogic$dispatchScroll$performScroll$1.invoke(Offset.m3482boximpl(j5)).m3503unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @p4.m
    /* renamed from: doFlingAnimation-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m394doFlingAnimationQWom1Mo(long r13, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.unit.Velocity> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            if (r0 == 0) goto L13
            r0 = r15
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$1
            r0.<init>(r12, r15)
        L18:
            r4 = r0
            java.lang.Object r15 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r13 = r4.L$0
            kotlin.jvm.internal.k1$g r13 = (kotlin.jvm.internal.k1.g) r13
            kotlin.e1.n(r15)
            goto L5d
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            kotlin.e1.n(r15)
            kotlin.jvm.internal.k1$g r15 = new kotlin.jvm.internal.k1$g
            r15.<init>()
            r15.element = r13
            androidx.compose.foundation.gestures.ScrollableState r1 = r12.scrollableState
            r3 = 0
            androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2 r11 = new androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2
            r10 = 0
            r5 = r11
            r6 = r12
            r7 = r15
            r8 = r13
            r5.<init>(r6, r7, r8, r10)
            r5 = 1
            r6 = 0
            r4.L$0 = r15
            r4.label = r2
            r2 = r3
            r3 = r11
            java.lang.Object r13 = androidx.compose.foundation.gestures.ScrollableState.scroll$default(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L5c
            return r0
        L5c:
            r13 = r15
        L5d:
            long r13 = r13.element
            androidx.compose.ui.unit.Velocity r13 = androidx.compose.ui.unit.Velocity.m6270boximpl(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m394doFlingAnimationQWom1Mo(long, kotlin.coroutines.d):java.lang.Object");
    }

    @l
    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @p4.m
    /* renamed from: onDragStopped-sF-c-tU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m395onDragStoppedsFctU(long r7, @p4.l kotlin.coroutines.d<? super kotlin.r2> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = (androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1 r0 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            java.lang.Object r7 = r0.L$0
            androidx.compose.foundation.gestures.ScrollingLogic r7 = (androidx.compose.foundation.gestures.ScrollingLogic) r7
            kotlin.e1.n(r9)
            goto L6f
        L39:
            kotlin.e1.n(r9)
            r6.registerNestedFling(r4)
            long r7 = r6.m399singleAxisVelocityAH228Gc(r7)
            androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1 r9 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1
            r2 = 0
            r9.<init>(r6, r2)
            androidx.compose.foundation.OverscrollEffect r2 = r6.overscrollEffect
            if (r2 == 0) goto L60
            boolean r5 = r6.getShouldDispatchOverscroll()
            if (r5 == 0) goto L60
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r2.mo181applyToFlingBMRW4eQ(r7, r9, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            r7 = r6
            goto L6f
        L60:
            androidx.compose.ui.unit.Velocity r7 = androidx.compose.ui.unit.Velocity.m6270boximpl(r7)
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r7 = r9.invoke(r7, r0)
            if (r7 != r1) goto L5e
            return r1
        L6f:
            r8 = 0
            r7.registerNestedFling(r8)
            kotlin.r2 r7 = kotlin.r2.f19517a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollingLogic.m395onDragStoppedsFctU(long, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: performRawScroll-MK-Hz9U, reason: not valid java name */
    public final long m396performRawScrollMKHz9U(long j5) {
        if (this.scrollableState.isScrollInProgress()) {
            return Offset.Companion.m3509getZeroF1C5BW0();
        }
        return m402toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m401toFloatk4lQ0M(j5)))));
    }

    public final void registerNestedFling(boolean z4) {
        this.isNestedFlinging.setValue(Boolean.valueOf(z4));
    }

    public final float reverseIfNeeded(float f5) {
        return this.reverseDirection ? f5 * (-1) : f5;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U, reason: not valid java name */
    public final long m397reverseIfNeededMKHz9U(long j5) {
        return this.reverseDirection ? Offset.m3500timestuRUvjQ(j5, -1.0f) : j5;
    }

    public final void setScrollableState(@l ScrollableState scrollableState) {
        this.scrollableState = scrollableState;
    }

    public final boolean shouldScrollImmediately() {
        boolean z4;
        if (!this.scrollableState.isScrollInProgress() && !this.isNestedFlinging.getValue().booleanValue()) {
            OverscrollEffect overscrollEffect = this.overscrollEffect;
            if (overscrollEffect != null) {
                z4 = overscrollEffect.isInProgress();
            } else {
                z4 = false;
            }
            if (!z4) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: singleAxisOffset-MK-Hz9U, reason: not valid java name */
    public final long m398singleAxisOffsetMKHz9U(long j5) {
        return this.orientation == Orientation.Horizontal ? Offset.m3487copydBAh8RU$default(j5, 0.0f, 0.0f, 1, null) : Offset.m3487copydBAh8RU$default(j5, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: singleAxisVelocity-AH228Gc, reason: not valid java name */
    public final long m399singleAxisVelocityAH228Gc(long j5) {
        return this.orientation == Orientation.Horizontal ? Velocity.m6275copyOhffZ5M$default(j5, 0.0f, 0.0f, 1, null) : Velocity.m6275copyOhffZ5M$default(j5, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: toFloat-TH1AsA0, reason: not valid java name */
    public final float m400toFloatTH1AsA0(long j5) {
        return this.orientation == Orientation.Horizontal ? Velocity.m6279getXimpl(j5) : Velocity.m6280getYimpl(j5);
    }

    /* renamed from: toFloat-k-4lQ0M, reason: not valid java name */
    public final float m401toFloatk4lQ0M(long j5) {
        return this.orientation == Orientation.Horizontal ? Offset.m3493getXimpl(j5) : Offset.m3494getYimpl(j5);
    }

    /* renamed from: toOffset-tuRUvjQ, reason: not valid java name */
    public final long m402toOffsettuRUvjQ(float f5) {
        boolean z4;
        if (f5 == 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return Offset.Companion.m3509getZeroF1C5BW0();
        }
        if (this.orientation == Orientation.Horizontal) {
            return OffsetKt.Offset(f5, 0.0f);
        }
        return OffsetKt.Offset(0.0f, f5);
    }

    public final void update(@l ScrollableState scrollableState, @l Orientation orientation, @m OverscrollEffect overscrollEffect, boolean z4, @l FlingBehavior flingBehavior, @l NestedScrollDispatcher nestedScrollDispatcher) {
        this.scrollableState = scrollableState;
        this.orientation = orientation;
        this.overscrollEffect = overscrollEffect;
        this.reverseDirection = z4;
        this.flingBehavior = flingBehavior;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
    }

    /* renamed from: update-QWom1Mo, reason: not valid java name */
    public final long m403updateQWom1Mo(long j5, float f5) {
        return this.orientation == Orientation.Horizontal ? Velocity.m6275copyOhffZ5M$default(j5, f5, 0.0f, 2, null) : Velocity.m6275copyOhffZ5M$default(j5, 0.0f, f5, 1, null);
    }
}
