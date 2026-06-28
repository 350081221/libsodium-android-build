package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent;", "", "()V", "DragCancelled", "DragDelta", "DragStarted", "DragStopped", "Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;", "Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class DragEvent {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragCancelled;", "Landroidx/compose/foundation/gestures/DragEvent;", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DragCancelled extends DragEvent {
        public static final int $stable = 0;

        @l
        public static final DragCancelled INSTANCE = new DragCancelled();

        private DragCancelled() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragDelta;", "Landroidx/compose/foundation/gestures/DragEvent;", "Landroidx/compose/ui/geometry/Offset;", "delta", "J", "getDelta-F1C5BW0", "()J", "<init>", "(JLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class DragDelta extends DragEvent {
        public static final int $stable = 0;
        private final long delta;

        private DragDelta(long j5) {
            super(null);
            this.delta = j5;
        }

        public /* synthetic */ DragDelta(long j5, w wVar) {
            this(j5);
        }

        /* renamed from: getDelta-F1C5BW0, reason: not valid java name */
        public final long m321getDeltaF1C5BW0() {
            return this.delta;
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragStarted;", "Landroidx/compose/foundation/gestures/DragEvent;", "Landroidx/compose/ui/geometry/Offset;", "startPoint", "J", "getStartPoint-F1C5BW0", "()J", "<init>", "(JLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class DragStarted extends DragEvent {
        public static final int $stable = 0;
        private final long startPoint;

        private DragStarted(long j5) {
            super(null);
            this.startPoint = j5;
        }

        public /* synthetic */ DragStarted(long j5, w wVar) {
            this(j5);
        }

        /* renamed from: getStartPoint-F1C5BW0, reason: not valid java name */
        public final long m322getStartPointF1C5BW0() {
            return this.startPoint;
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/DragEvent$DragStopped;", "Landroidx/compose/foundation/gestures/DragEvent;", "Landroidx/compose/ui/unit/Velocity;", "velocity", "J", "getVelocity-9UxMQ8M", "()J", "<init>", "(JLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class DragStopped extends DragEvent {
        public static final int $stable = 0;
        private final long velocity;

        private DragStopped(long j5) {
            super(null);
            this.velocity = j5;
        }

        public /* synthetic */ DragStopped(long j5, w wVar) {
            this(j5);
        }

        /* renamed from: getVelocity-9UxMQ8M, reason: not valid java name */
        public final long m323getVelocity9UxMQ8M() {
            return this.velocity;
        }
    }

    private DragEvent() {
    }

    public /* synthetic */ DragEvent(w wVar) {
        this();
    }
}
