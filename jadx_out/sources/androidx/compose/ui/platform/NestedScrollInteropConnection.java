package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;

@StabilityInferred(parameters = 0)
@kotlin.i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\"\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ*\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Landroidx/compose/ui/platform/NestedScrollInteropConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Lkotlin/r2;", "interruptOngoingScrolls", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "onPostFling", "Landroid/view/View;", "view", "Landroid/view/View;", "Landroidx/core/view/NestedScrollingChildHelper;", "nestedScrollChildHelper", "Landroidx/core/view/NestedScrollingChildHelper;", "", "consumedScrollCache", "[I", "<init>", "(Landroid/view/View;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    public static final int $stable = 8;

    @p4.l
    private final int[] consumedScrollCache;

    @p4.l
    private final NestedScrollingChildHelper nestedScrollChildHelper;

    @p4.l
    private final View view;

    public NestedScrollInteropConnection(@p4.l View view) {
        this.view = view;
        NestedScrollingChildHelper nestedScrollingChildHelper = new NestedScrollingChildHelper(view);
        nestedScrollingChildHelper.setNestedScrollingEnabled(true);
        this.nestedScrollChildHelper = nestedScrollingChildHelper;
        this.consumedScrollCache = new int[2];
        ViewCompat.setNestedScrollingEnabled(view, true);
    }

    private final void interruptOngoingScrolls() {
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(0)) {
            this.nestedScrollChildHelper.stopNestedScroll(0);
        }
        if (this.nestedScrollChildHelper.hasNestedScrollingParent(1)) {
            this.nestedScrollChildHelper.stopNestedScroll(1);
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @p4.m
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo390onPostFlingRZ2iAVY(long j5, long j6, @p4.l kotlin.coroutines.d<? super Velocity> dVar) {
        float viewVelocity;
        float viewVelocity2;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        viewVelocity = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m6279getXimpl(j6));
        viewVelocity2 = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m6280getYimpl(j6));
        if (!nestedScrollingChildHelper.dispatchNestedFling(viewVelocity, viewVelocity2, true)) {
            j6 = Velocity.Companion.m6290getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m6270boximpl(j6);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo391onPostScrollDzOQY0M(long j5, long j6, int i5) {
        int m5343getScrollAxesk4lQ0M;
        int m5345toViewTypeGyEprt8;
        int m5345toViewTypeGyEprt82;
        long m5344toOffsetUv8p0NA;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        m5343getScrollAxesk4lQ0M = NestedScrollInteropConnectionKt.m5343getScrollAxesk4lQ0M(j6);
        m5345toViewTypeGyEprt8 = NestedScrollInteropConnectionKt.m5345toViewTypeGyEprt8(i5);
        if (nestedScrollingChildHelper.startNestedScroll(m5343getScrollAxesk4lQ0M, m5345toViewTypeGyEprt8)) {
            kotlin.collections.o.T1(this.consumedScrollCache, 0, 0, 0, 6, null);
            NestedScrollingChildHelper nestedScrollingChildHelper2 = this.nestedScrollChildHelper;
            int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3493getXimpl(j5));
            int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3494getYimpl(j5));
            int composeToViewOffset3 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3493getXimpl(j6));
            int composeToViewOffset4 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3494getYimpl(j6));
            m5345toViewTypeGyEprt82 = NestedScrollInteropConnectionKt.m5345toViewTypeGyEprt8(i5);
            nestedScrollingChildHelper2.dispatchNestedScroll(composeToViewOffset, composeToViewOffset2, composeToViewOffset3, composeToViewOffset4, null, m5345toViewTypeGyEprt82, this.consumedScrollCache);
            m5344toOffsetUv8p0NA = NestedScrollInteropConnectionKt.m5344toOffsetUv8p0NA(this.consumedScrollCache, j6);
            return m5344toOffsetUv8p0NA;
        }
        return Offset.Companion.m3509getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @p4.m
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo632onPreFlingQWom1Mo(long j5, @p4.l kotlin.coroutines.d<? super Velocity> dVar) {
        float viewVelocity;
        float viewVelocity2;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        viewVelocity = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m6279getXimpl(j5));
        viewVelocity2 = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m6280getYimpl(j5));
        if (!nestedScrollingChildHelper.dispatchNestedPreFling(viewVelocity, viewVelocity2)) {
            j5 = Velocity.Companion.m6290getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m6270boximpl(j5);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo392onPreScrollOzD1aCk(long j5, int i5) {
        int m5343getScrollAxesk4lQ0M;
        int m5345toViewTypeGyEprt8;
        int m5345toViewTypeGyEprt82;
        long m5344toOffsetUv8p0NA;
        NestedScrollingChildHelper nestedScrollingChildHelper = this.nestedScrollChildHelper;
        m5343getScrollAxesk4lQ0M = NestedScrollInteropConnectionKt.m5343getScrollAxesk4lQ0M(j5);
        m5345toViewTypeGyEprt8 = NestedScrollInteropConnectionKt.m5345toViewTypeGyEprt8(i5);
        if (nestedScrollingChildHelper.startNestedScroll(m5343getScrollAxesk4lQ0M, m5345toViewTypeGyEprt8)) {
            kotlin.collections.o.T1(this.consumedScrollCache, 0, 0, 0, 6, null);
            NestedScrollingChildHelper nestedScrollingChildHelper2 = this.nestedScrollChildHelper;
            int composeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3493getXimpl(j5));
            int composeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3494getYimpl(j5));
            int[] iArr = this.consumedScrollCache;
            m5345toViewTypeGyEprt82 = NestedScrollInteropConnectionKt.m5345toViewTypeGyEprt8(i5);
            nestedScrollingChildHelper2.dispatchNestedPreScroll(composeToViewOffset, composeToViewOffset2, iArr, null, m5345toViewTypeGyEprt82);
            m5344toOffsetUv8p0NA = NestedScrollInteropConnectionKt.m5344toOffsetUv8p0NA(this.consumedScrollCache, j5);
            return m5344toOffsetUv8p0NA;
        }
        return Offset.Companion.m3509getZeroF1C5BW0();
    }
}
