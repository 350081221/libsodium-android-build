package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.ranges.u;
import p4.l;
import p4.m;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u0016\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000bJ\"\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/pager/DefaultPagerNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroidx/compose/ui/geometry/Offset;", "", "mainAxis-k-4lQ0M", "(J)F", "mainAxis", "Landroidx/compose/ui/unit/Velocity;", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "consumeOnOrientation-QWom1Mo", "(JLandroidx/compose/foundation/gestures/Orientation;)J", "consumeOnOrientation", "consumeOnOrientation-8S9VItk", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "onPostFling", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/pager/PagerState;", "getState", "()Landroidx/compose/foundation/pager/PagerState;", "Landroidx/compose/foundation/gestures/Orientation;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "<init>", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/gestures/Orientation;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class DefaultPagerNestedScrollConnection implements NestedScrollConnection {

    @l
    private final Orientation orientation;

    @l
    private final PagerState state;

    public DefaultPagerNestedScrollConnection(@l PagerState pagerState, @l Orientation orientation) {
        this.state = pagerState;
        this.orientation = orientation;
    }

    /* renamed from: mainAxis-k-4lQ0M, reason: not valid java name */
    private final float m773mainAxisk4lQ0M(long j5) {
        return this.orientation == Orientation.Horizontal ? Offset.m3493getXimpl(j5) : Offset.m3494getYimpl(j5);
    }

    /* renamed from: consumeOnOrientation-8S9VItk, reason: not valid java name */
    public final long m774consumeOnOrientation8S9VItk(long j5, @l Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            return Offset.m3487copydBAh8RU$default(j5, 0.0f, 0.0f, 2, null);
        }
        return Offset.m3487copydBAh8RU$default(j5, 0.0f, 0.0f, 1, null);
    }

    /* renamed from: consumeOnOrientation-QWom1Mo, reason: not valid java name */
    public final long m775consumeOnOrientationQWom1Mo(long j5, @l Orientation orientation) {
        if (orientation == Orientation.Vertical) {
            return Velocity.m6275copyOhffZ5M$default(j5, 0.0f, 0.0f, 2, null);
        }
        return Velocity.m6275copyOhffZ5M$default(j5, 0.0f, 0.0f, 1, null);
    }

    @l
    public final Orientation getOrientation() {
        return this.orientation;
    }

    @l
    public final PagerState getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    @m
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo390onPostFlingRZ2iAVY(long j5, long j6, @l d<? super Velocity> dVar) {
        return Velocity.m6270boximpl(m775consumeOnOrientationQWom1Mo(j6, this.orientation));
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo391onPostScrollDzOQY0M(long j5, long j6, int i5) {
        boolean z4;
        if (NestedScrollSource.m4761equalsimpl0(i5, NestedScrollSource.Companion.m4767getFlingWNlRxjI())) {
            if (m773mainAxisk4lQ0M(j6) == 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                throw new CancellationException();
            }
        }
        return Offset.Companion.m3509getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo392onPreScrollOzD1aCk(long j5, int i5) {
        float m3494getYimpl;
        float H;
        float m3493getXimpl;
        if (NestedScrollSource.m4761equalsimpl0(i5, NestedScrollSource.Companion.m4766getDragWNlRxjI()) && Math.abs(this.state.getCurrentPageOffsetFraction()) > 0.0d) {
            float currentPageOffsetFraction = this.state.getCurrentPageOffsetFraction() * this.state.getPageSize$foundation_release();
            float pageSize = ((this.state.getLayoutInfo().getPageSize() + this.state.getLayoutInfo().getPageSpacing()) * (-Math.signum(this.state.getCurrentPageOffsetFraction()))) + currentPageOffsetFraction;
            if (this.state.getCurrentPageOffsetFraction() > 0.0f) {
                pageSize = currentPageOffsetFraction;
                currentPageOffsetFraction = pageSize;
            }
            Orientation orientation = this.orientation;
            Orientation orientation2 = Orientation.Horizontal;
            if (orientation == orientation2) {
                m3494getYimpl = Offset.m3493getXimpl(j5);
            } else {
                m3494getYimpl = Offset.m3494getYimpl(j5);
            }
            H = u.H(m3494getYimpl, currentPageOffsetFraction, pageSize);
            float f5 = -this.state.dispatchRawDelta(-H);
            if (this.orientation == orientation2) {
                m3493getXimpl = f5;
            } else {
                m3493getXimpl = Offset.m3493getXimpl(j5);
            }
            if (this.orientation != Orientation.Vertical) {
                f5 = Offset.m3494getYimpl(j5);
            }
            return Offset.m3486copydBAh8RU(j5, m3493getXimpl, f5);
        }
        return Offset.Companion.m3509getZeroF1C5BW0();
    }
}
