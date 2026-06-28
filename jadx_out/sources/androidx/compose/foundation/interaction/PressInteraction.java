package androidx.compose.foundation.interaction;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/interaction/PressInteraction;", "Landroidx/compose/foundation/interaction/Interaction;", "Cancel", "Press", "Release", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface PressInteraction extends Interaction {

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/interaction/PressInteraction$Cancel;", "Landroidx/compose/foundation/interaction/PressInteraction;", "press", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "getPress", "()Landroidx/compose/foundation/interaction/PressInteraction$Press;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Cancel implements PressInteraction {
        public static final int $stable = 0;

        @l
        private final Press press;

        public Cancel(@l Press press) {
            this.press = press;
        }

        @l
        public final Press getPress() {
            return this.press;
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/interaction/PressInteraction$Press;", "Landroidx/compose/foundation/interaction/PressInteraction;", "Landroidx/compose/ui/geometry/Offset;", "pressPosition", "J", "getPressPosition-F1C5BW0", "()J", "<init>", "(JLkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    public static final class Press implements PressInteraction {
        public static final int $stable = 0;
        private final long pressPosition;

        private Press(long j5) {
            this.pressPosition = j5;
        }

        public /* synthetic */ Press(long j5, w wVar) {
            this(j5);
        }

        /* renamed from: getPressPosition-F1C5BW0, reason: not valid java name */
        public final long m429getPressPositionF1C5BW0() {
            return this.pressPosition;
        }
    }

    @StabilityInferred(parameters = 1)
    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/interaction/PressInteraction$Release;", "Landroidx/compose/foundation/interaction/PressInteraction;", "press", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "getPress", "()Landroidx/compose/foundation/interaction/PressInteraction$Press;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Release implements PressInteraction {
        public static final int $stable = 0;

        @l
        private final Press press;

        public Release(@l Press press) {
            this.press = press;
        }

        @l
        public final Press getPress() {
            return this.press;
        }
    }
}
