package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/gestures/TransformEvent;", "", "()V", "TransformDelta", "TransformStarted", "TransformStopped", "Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;", "Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;", "Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class TransformEvent {

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformDelta;", "Landroidx/compose/foundation/gestures/TransformEvent;", "", "zoomChange", "F", "getZoomChange", "()F", "Landroidx/compose/ui/geometry/Offset;", "panChange", "J", "getPanChange-F1C5BW0", "()J", "rotationChange", "getRotationChange", "<init>", "(FJFLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class TransformDelta extends TransformEvent {
        public static final int $stable = 0;
        private final long panChange;
        private final float rotationChange;
        private final float zoomChange;

        private TransformDelta(float f5, long j5, float f6) {
            super(null);
            this.zoomChange = f5;
            this.panChange = j5;
            this.rotationChange = f6;
        }

        public /* synthetic */ TransformDelta(float f5, long j5, float f6, w wVar) {
            this(f5, j5, f6);
        }

        /* renamed from: getPanChange-F1C5BW0, reason: not valid java name */
        public final long m408getPanChangeF1C5BW0() {
            return this.panChange;
        }

        public final float getRotationChange() {
            return this.rotationChange;
        }

        public final float getZoomChange() {
            return this.zoomChange;
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformStarted;", "Landroidx/compose/foundation/gestures/TransformEvent;", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class TransformStarted extends TransformEvent {
        public static final int $stable = 0;

        @l
        public static final TransformStarted INSTANCE = new TransformStarted();

        private TransformStarted() {
            super(null);
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/TransformEvent$TransformStopped;", "Landroidx/compose/foundation/gestures/TransformEvent;", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class TransformStopped extends TransformEvent {
        public static final int $stable = 0;

        @l
        public static final TransformStopped INSTANCE = new TransformStopped();

        private TransformStopped() {
            super(null);
        }
    }

    private TransformEvent() {
    }

    public /* synthetic */ TransformEvent(w wVar) {
        this();
    }
}
