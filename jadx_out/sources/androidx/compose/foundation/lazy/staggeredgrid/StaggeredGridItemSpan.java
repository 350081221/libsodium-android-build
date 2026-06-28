package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "", b.f22420d, "", "(I)V", "getValue$foundation_release", "()I", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StaggeredGridItemSpan {
    public static final int $stable = 0;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final StaggeredGridItemSpan FullLine = new StaggeredGridItemSpan(0);

    @l
    private static final StaggeredGridItemSpan SingleLane = new StaggeredGridItemSpan(1);
    private final int value;

    @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan$Companion;", "", "()V", "FullLine", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "getFullLine", "()Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "SingleLane", "getSingleLane", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final StaggeredGridItemSpan getFullLine() {
            return StaggeredGridItemSpan.FullLine;
        }

        @l
        public final StaggeredGridItemSpan getSingleLane() {
            return StaggeredGridItemSpan.SingleLane;
        }
    }

    private StaggeredGridItemSpan(int i5) {
        this.value = i5;
    }

    public final int getValue$foundation_release() {
        return this.value;
    }
}
