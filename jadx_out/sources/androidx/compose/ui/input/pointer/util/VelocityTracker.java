package androidx.compose.ui.input.pointer.util;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.i0;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\r\u001a\u00020\nø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0006R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R(\u0010\u0016\u001a\u00020\u00048\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\f\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, d2 = {"Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "", "", "timeMillis", "Landroidx/compose/ui/geometry/Offset;", "position", "Lkotlin/r2;", "addPosition-Uv8p0NA", "(JJ)V", "addPosition", "Landroidx/compose/ui/unit/Velocity;", "calculateVelocity-9UxMQ8M", "()J", "calculateVelocity", "maximumVelocity", "calculateVelocity-AH228Gc", "(J)J", "resetTracking", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "xVelocityTracker", "Landroidx/compose/ui/input/pointer/util/VelocityTracker1D;", "yVelocityTracker", "currentPointerPositionAccumulator", "J", "getCurrentPointerPositionAccumulator-F1C5BW0$ui_release", "setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release", "(J)V", "lastMoveEventTimeStamp", "getLastMoveEventTimeStamp$ui_release", "setLastMoveEventTimeStamp$ui_release", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VelocityTracker {
    public static final int $stable = 8;
    private long lastMoveEventTimeStamp;

    @l
    private final VelocityTracker1D xVelocityTracker = new VelocityTracker1D(false, null, 3, null);

    @l
    private final VelocityTracker1D yVelocityTracker = new VelocityTracker1D(false, null, 3, null);
    private long currentPointerPositionAccumulator = Offset.Companion.m3509getZeroF1C5BW0();

    /* renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m4970addPositionUv8p0NA(long j5, long j6) {
        this.xVelocityTracker.addDataPoint(j5, Offset.m3493getXimpl(j6));
        this.yVelocityTracker.addDataPoint(j5, Offset.m3494getYimpl(j6));
    }

    /* renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m4971calculateVelocity9UxMQ8M() {
        return m4972calculateVelocityAH228Gc(VelocityKt.Velocity(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    /* renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public final long m4972calculateVelocityAH228Gc(long j5) {
        boolean z4;
        if (Velocity.m6279getXimpl(j5) > 0.0f && Velocity.m6280getYimpl(j5) > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return VelocityKt.Velocity(this.xVelocityTracker.calculateVelocity(Velocity.m6279getXimpl(j5)), this.yVelocityTracker.calculateVelocity(Velocity.m6280getYimpl(j5)));
        }
        throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + ((Object) Velocity.m6286toStringimpl(j5))).toString());
    }

    /* renamed from: getCurrentPointerPositionAccumulator-F1C5BW0$ui_release, reason: not valid java name */
    public final long m4973getCurrentPointerPositionAccumulatorF1C5BW0$ui_release() {
        return this.currentPointerPositionAccumulator;
    }

    public final long getLastMoveEventTimeStamp$ui_release() {
        return this.lastMoveEventTimeStamp;
    }

    public final void resetTracking() {
        this.xVelocityTracker.resetTracking();
        this.yVelocityTracker.resetTracking();
        this.lastMoveEventTimeStamp = 0L;
    }

    /* renamed from: setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release, reason: not valid java name */
    public final void m4974setCurrentPointerPositionAccumulatork4lQ0M$ui_release(long j5) {
        this.currentPointerPositionAccumulator = j5;
    }

    public final void setLastMoveEventTimeStamp$ui_release(long j5) {
        this.lastMoveEventTimeStamp = j5;
    }
}
