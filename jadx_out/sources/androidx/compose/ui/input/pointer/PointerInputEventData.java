package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0080\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010!\u001a\u00020\r\u0012\u0006\u0010\"\u001a\u00020\u000f\u0012\u0006\u0010#\u001a\u00020\u0011\u0012\b\b\u0002\u0010$\u001a\u00020\r\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\b\b\u0002\u0010&\u001a\u00020\b\u0012\b\b\u0002\u0010'\u001a\u00020\b¢\u0006\u0004\bD\u0010EJ\u0016\u0010\u0005\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u0016\u0010\n\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0004J\u0016\u0010\f\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\u0004J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J\u0016\u0010\u0014\u001a\u00020\u0011HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0015\u001a\u00020\rHÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003J\u0016\u0010\u001a\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u0004J\u0016\u0010\u001c\u001a\u00020\bHÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u0004J\u0087\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\r2\b\b\u0002\u0010\"\u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020\u00112\b\b\u0002\u0010$\u001a\u00020\r2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010'\u001a\u00020\bHÆ\u0001ø\u0001\u0001¢\u0006\u0004\b(\u0010)J\t\u0010,\u001a\u00020+HÖ\u0001J\t\u0010.\u001a\u00020-HÖ\u0001J\u0013\u00100\u001a\u00020\r2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u001d\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001d\u00101\u001a\u0004\b2\u0010\u0004R\u0017\u0010\u001e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u00101\u001a\u0004\b3\u0010\u0004R\u001d\u0010\u001f\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001f\u00101\u001a\u0004\b4\u0010\u0004R\u001d\u0010 \u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b \u00101\u001a\u0004\b5\u0010\u0004R\u0017\u0010!\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b!\u00106\u001a\u0004\b7\u00108R\u0017\u0010\"\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\"\u00109\u001a\u0004\b:\u0010;R\u001d\u0010#\u001a\u00020\u00118\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b#\u0010<\u001a\u0004\b=\u0010\u0013R\u0017\u0010$\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b$\u00106\u001a\u0004\b>\u00108R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006¢\u0006\f\n\u0004\b%\u0010?\u001a\u0004\b@\u0010AR\u001d\u0010&\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b&\u00101\u001a\u0004\bB\u0010\u0004R\u001d\u0010'\u001a\u00020\b8\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b'\u00101\u001a\u0004\bC\u0010\u0004\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputEventData;", "", "Landroidx/compose/ui/input/pointer/PointerId;", "component1-J3iCeTQ", "()J", "component1", "", "component2", "Landroidx/compose/ui/geometry/Offset;", "component3-F1C5BW0", "component3", "component4-F1C5BW0", "component4", "", "component5", "", "component6", "Landroidx/compose/ui/input/pointer/PointerType;", "component7-T8wyACA", "()I", "component7", "component8", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "component9", "component10-F1C5BW0", "component10", "component11-F1C5BW0", "component11", "id", "uptime", "positionOnScreen", "position", "down", "pressure", "type", "issuesEnterExit", "historical", "scrollDelta", "originalEventPosition", "copy-rc8HELY", "(JJJJZFIZLjava/util/List;JJ)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "copy", "", "toString", "", TTDownloadField.TT_HASHCODE, "other", "equals", "J", "getId-J3iCeTQ", "getUptime", "getPositionOnScreen-F1C5BW0", "getPosition-F1C5BW0", "Z", "getDown", "()Z", "F", "getPressure", "()F", "I", "getType-T8wyACA", "getIssuesEnterExit", "Ljava/util/List;", "getHistorical", "()Ljava/util/List;", "getScrollDelta-F1C5BW0", "getOriginalEventPosition-F1C5BW0", "<init>", "(JJJJZFIZLjava/util/List;JJLkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PointerInputEventData {
    public static final int $stable = 8;
    private final boolean down;

    @l
    private final List<HistoricalChange> historical;
    private final long id;
    private final boolean issuesEnterExit;
    private final long originalEventPosition;
    private final long position;
    private final long positionOnScreen;
    private final float pressure;
    private final long scrollDelta;
    private final int type;
    private final long uptime;

    private PointerInputEventData(long j5, long j6, long j7, long j8, boolean z4, float f5, int i5, boolean z5, List<HistoricalChange> list, long j9, long j10) {
        this.id = j5;
        this.uptime = j6;
        this.positionOnScreen = j7;
        this.position = j8;
        this.down = z4;
        this.pressure = f5;
        this.type = i5;
        this.issuesEnterExit = z5;
        this.historical = list;
        this.scrollDelta = j9;
        this.originalEventPosition = j10;
    }

    public /* synthetic */ PointerInputEventData(long j5, long j6, long j7, long j8, boolean z4, float f5, int i5, boolean z5, List list, long j9, long j10, w wVar) {
        this(j5, j6, j7, j8, z4, f5, i5, z5, list, j9, j10);
    }

    /* renamed from: component1-J3iCeTQ, reason: not valid java name */
    public final long m4880component1J3iCeTQ() {
        return this.id;
    }

    /* renamed from: component10-F1C5BW0, reason: not valid java name */
    public final long m4881component10F1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: component11-F1C5BW0, reason: not valid java name */
    public final long m4882component11F1C5BW0() {
        return this.originalEventPosition;
    }

    public final long component2() {
        return this.uptime;
    }

    /* renamed from: component3-F1C5BW0, reason: not valid java name */
    public final long m4883component3F1C5BW0() {
        return this.positionOnScreen;
    }

    /* renamed from: component4-F1C5BW0, reason: not valid java name */
    public final long m4884component4F1C5BW0() {
        return this.position;
    }

    public final boolean component5() {
        return this.down;
    }

    public final float component6() {
        return this.pressure;
    }

    /* renamed from: component7-T8wyACA, reason: not valid java name */
    public final int m4885component7T8wyACA() {
        return this.type;
    }

    public final boolean component8() {
        return this.issuesEnterExit;
    }

    @l
    public final List<HistoricalChange> component9() {
        return this.historical;
    }

    @l
    /* renamed from: copy-rc8HELY, reason: not valid java name */
    public final PointerInputEventData m4886copyrc8HELY(long j5, long j6, long j7, long j8, boolean z4, float f5, int i5, boolean z5, @l List<HistoricalChange> list, long j9, long j10) {
        return new PointerInputEventData(j5, j6, j7, j8, z4, f5, i5, z5, list, j9, j10, null);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointerInputEventData)) {
            return false;
        }
        PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
        return PointerId.m4854equalsimpl0(this.id, pointerInputEventData.id) && this.uptime == pointerInputEventData.uptime && Offset.m3490equalsimpl0(this.positionOnScreen, pointerInputEventData.positionOnScreen) && Offset.m3490equalsimpl0(this.position, pointerInputEventData.position) && this.down == pointerInputEventData.down && Float.compare(this.pressure, pointerInputEventData.pressure) == 0 && PointerType.m4944equalsimpl0(this.type, pointerInputEventData.type) && this.issuesEnterExit == pointerInputEventData.issuesEnterExit && l0.g(this.historical, pointerInputEventData.historical) && Offset.m3490equalsimpl0(this.scrollDelta, pointerInputEventData.scrollDelta) && Offset.m3490equalsimpl0(this.originalEventPosition, pointerInputEventData.originalEventPosition);
    }

    public final boolean getDown() {
        return this.down;
    }

    @l
    public final List<HistoricalChange> getHistorical() {
        return this.historical;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m4887getIdJ3iCeTQ() {
        return this.id;
    }

    public final boolean getIssuesEnterExit() {
        return this.issuesEnterExit;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0, reason: not valid java name */
    public final long m4888getOriginalEventPositionF1C5BW0() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m4889getPositionF1C5BW0() {
        return this.position;
    }

    /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m4890getPositionOnScreenF1C5BW0() {
        return this.positionOnScreen;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m4891getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m4892getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptime() {
        return this.uptime;
    }

    public int hashCode() {
        return (((((((((((((((((((PointerId.m4855hashCodeimpl(this.id) * 31) + Long.hashCode(this.uptime)) * 31) + Offset.m3495hashCodeimpl(this.positionOnScreen)) * 31) + Offset.m3495hashCodeimpl(this.position)) * 31) + Boolean.hashCode(this.down)) * 31) + Float.hashCode(this.pressure)) * 31) + PointerType.m4945hashCodeimpl(this.type)) * 31) + Boolean.hashCode(this.issuesEnterExit)) * 31) + this.historical.hashCode()) * 31) + Offset.m3495hashCodeimpl(this.scrollDelta)) * 31) + Offset.m3495hashCodeimpl(this.originalEventPosition);
    }

    @l
    public String toString() {
        return "PointerInputEventData(id=" + ((Object) PointerId.m4856toStringimpl(this.id)) + ", uptime=" + this.uptime + ", positionOnScreen=" + ((Object) Offset.m3501toStringimpl(this.positionOnScreen)) + ", position=" + ((Object) Offset.m3501toStringimpl(this.position)) + ", down=" + this.down + ", pressure=" + this.pressure + ", type=" + ((Object) PointerType.m4946toStringimpl(this.type)) + ", issuesEnterExit=" + this.issuesEnterExit + ", historical=" + this.historical + ", scrollDelta=" + ((Object) Offset.m3501toStringimpl(this.scrollDelta)) + ", originalEventPosition=" + ((Object) Offset.m3501toStringimpl(this.originalEventPosition)) + ')';
    }

    public /* synthetic */ PointerInputEventData(long j5, long j6, long j7, long j8, boolean z4, float f5, int i5, boolean z5, List list, long j9, long j10, int i6, w wVar) {
        this(j5, j6, j7, j8, z4, f5, i5, (i6 & 128) != 0 ? false : z5, (i6 & 256) != 0 ? new ArrayList() : list, (i6 & 512) != 0 ? Offset.Companion.m3509getZeroF1C5BW0() : j9, (i6 & 1024) != 0 ? Offset.Companion.m3509getZeroF1C5BW0() : j10, null);
    }
}
