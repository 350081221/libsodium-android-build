package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010B!\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR*\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8\u0000@BX\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/HistoricalChange;", "", "", "toString", "", "uptimeMillis", "J", "getUptimeMillis", "()J", "Landroidx/compose/ui/geometry/Offset;", "position", "getPosition-F1C5BW0", "<set-?>", "originalEventPosition", "getOriginalEventPosition-F1C5BW0$ui_release", "<init>", "(JJLkotlin/jvm/internal/w;)V", "(JJJLkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@Immutable
@ExperimentalComposeUiApi
/* loaded from: classes.dex */
public final class HistoricalChange {
    public static final int $stable = 0;
    private long originalEventPosition;
    private final long position;
    private final long uptimeMillis;

    private HistoricalChange(long j5, long j6) {
        this.uptimeMillis = j5;
        this.position = j6;
        this.originalEventPosition = Offset.Companion.m3509getZeroF1C5BW0();
    }

    public /* synthetic */ HistoricalChange(long j5, long j6, long j7, w wVar) {
        this(j5, j6, j7);
    }

    public /* synthetic */ HistoricalChange(long j5, long j6, w wVar) {
        this(j5, j6);
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui_release, reason: not valid java name */
    public final long m4798getOriginalEventPositionF1C5BW0$ui_release() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m4799getPositionF1C5BW0() {
        return this.position;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    @l
    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m3501toStringimpl(this.position)) + ')';
    }

    private HistoricalChange(long j5, long j6, long j7) {
        this(j5, j6, (w) null);
        this.originalEventPosition = j7;
    }
}
