package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.w;
import kotlin.k;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b/\b\u0007\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0006\u0012\u0006\u0010.\u001a\u00020\b\u0012\u0006\u00100\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u00107\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010P\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b¢\u0006\u0004\bQ\u0010RB]\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0006\u0012\u0006\u0010.\u001a\u00020\b\u0012\u0006\u00100\u001a\u00020\n\u0012\u0006\u00107\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010P\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b¢\u0006\u0004\bQ\u0010SBS\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0006\u0012\u0006\u0010.\u001a\u00020\b\u0012\u0006\u00100\u001a\u00020\n\u0012\u0006\u00107\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\bQ\u0010TBw\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0006\u0012\u0006\u0010.\u001a\u00020\b\u0012\u0006\u00100\u001a\u00020\n\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u00107\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010P\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010$\u001a\u00020\b¢\u0006\u0004\bQ\u0010UJ\u0006\u0010\u0003\u001a\u00020\u0002Jl\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014Jj\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018Jt\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJt\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0016\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJz\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\b\b\u0002\u0010\u0016\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0090\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\b\b\u0002\u0010\u0016\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\b\u0010(\u001a\u00020'H\u0016R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010,\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+R\u001d\u0010.\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+R\u0017\u00100\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u001c\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u00104\u001a\u0004\b5\u00106R\u0017\u00107\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b8\u0010+R\u001d\u0010\r\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b9\u0010+R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b:\u00103R\u001d\u0010\u0012\u001a\u00020\u00118\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010;\u001a\u0004\b<\u0010=R\u001d\u0010\u0016\u001a\u00020\b8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010)\u001a\u0004\b>\u0010+R$\u0010?\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b?\u0010@\u0012\u0004\bA\u0010BR(\u0010$\u001a\u00020\b8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b$\u0010)\u001a\u0004\bC\u0010+\"\u0004\bD\u0010ER*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010F\u001a\u00020\u000f8\u0006@BX\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010G\u0012\u0004\bJ\u0010B\u001a\u0004\bH\u0010IR \u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f8GX\u0087\u0004¢\u0006\f\u0012\u0004\bM\u0010B\u001a\u0004\bK\u0010LR\u0017\u0010N\u001a\u00020\n8F¢\u0006\f\u0012\u0004\bO\u0010B\u001a\u0004\bN\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "Lkotlin/r2;", "consume", "Landroidx/compose/ui/input/pointer/PointerId;", "id", "", "currentTime", "Landroidx/compose/ui/geometry/Offset;", "currentPosition", "", "currentPressed", "previousTime", "previousPosition", "previousPressed", "Landroidx/compose/ui/input/pointer/ConsumedData;", "consumed", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "copy-Ezr-O64", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;I)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy", "scrollDelta", "copy-JKmWfYY", "(JJJZJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "copy-0GkPj7c", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;IJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "pressure", "copy-Tn9QgHE", "(JJJZFJJZIJ)Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "Landroidx/compose/ui/input/pointer/HistoricalChange;", "historical", "copy-OHpmEuE", "(JJJZJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "originalEventPosition", "copy-8H9lfAM", "(JJJJZFJJZILjava/util/List;J)Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "toString", "J", "getId-J3iCeTQ", "()J", "uptimeMillis", "getUptimeMillis", "position", "getPosition-F1C5BW0", "pressed", "Z", "getPressed", "()Z", "F", "getPressure", "()F", "previousUptimeMillis", "getPreviousUptimeMillis", "getPreviousPosition-F1C5BW0", "getPreviousPressed", "I", "getType-T8wyACA", "()I", "getScrollDelta-F1C5BW0", "_historical", "Ljava/util/List;", "get_historical$annotations", "()V", "getOriginalEventPosition-F1C5BW0$ui_release", "setOriginalEventPosition-k-4lQ0M$ui_release", "(J)V", "<set-?>", "Landroidx/compose/ui/input/pointer/ConsumedData;", "getConsumed", "()Landroidx/compose/ui/input/pointer/ConsumedData;", "getConsumed$annotations", "getHistorical", "()Ljava/util/List;", "getHistorical$annotations", "isConsumed", "isConsumed$annotations", "isInitiallyConsumed", "<init>", "(JJJZFJJZZIJLkotlin/jvm/internal/w;)V", "(JJJZJJZZIJLkotlin/jvm/internal/w;)V", "(JJJZJJZLandroidx/compose/ui/input/pointer/ConsumedData;ILkotlin/jvm/internal/w;)V", "(JJJZFJJZZILjava/util/List;JJLkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@Immutable
/* loaded from: classes.dex */
public final class PointerInputChange {
    public static final int $stable = 0;

    @m
    private List<HistoricalChange> _historical;

    @l
    private ConsumedData consumed;
    private final long id;
    private long originalEventPosition;
    private final long position;
    private final boolean pressed;
    private final float pressure;
    private final long previousPosition;
    private final boolean previousPressed;
    private final long previousUptimeMillis;
    private final long scrollDelta;
    private final int type;
    private final long uptimeMillis;

    private PointerInputChange(long j5, long j6, long j7, boolean z4, float f5, long j8, long j9, boolean z5, boolean z6, int i5, long j10) {
        this.id = j5;
        this.uptimeMillis = j6;
        this.position = j7;
        this.pressed = z4;
        this.pressure = f5;
        this.previousUptimeMillis = j8;
        this.previousPosition = j9;
        this.previousPressed = z5;
        this.type = i5;
        this.scrollDelta = j10;
        this.originalEventPosition = Offset.Companion.m3509getZeroF1C5BW0();
        this.consumed = new ConsumedData(z6, z6);
    }

    public /* synthetic */ PointerInputChange(long j5, long j6, long j7, boolean z4, float f5, long j8, long j9, boolean z5, boolean z6, int i5, long j10, w wVar) {
        this(j5, j6, j7, z4, f5, j8, j9, z5, z6, i5, j10);
    }

    public /* synthetic */ PointerInputChange(long j5, long j6, long j7, boolean z4, float f5, long j8, long j9, boolean z5, boolean z6, int i5, List list, long j10, long j11, w wVar) {
        this(j5, j6, j7, z4, f5, j8, j9, z5, z6, i5, (List<HistoricalChange>) list, j10, j11);
    }

    @k(level = kotlin.m.HIDDEN, message = "Use another constructor with `scrollDelta` and without `ConsumedData` instead", replaceWith = @b1(expression = "this(id, uptimeMillis, position, pressed, previousUptimeMillis, previousPosition, previousPressed, consumed.downChange || consumed.positionChange, type, Offset.Zero)", imports = {}))
    public /* synthetic */ PointerInputChange(long j5, long j6, long j7, boolean z4, long j8, long j9, boolean z5, ConsumedData consumedData, int i5, w wVar) {
        this(j5, j6, j7, z4, j8, j9, z5, consumedData, i5);
    }

    public /* synthetic */ PointerInputChange(long j5, long j6, long j7, boolean z4, long j8, long j9, boolean z5, boolean z6, int i5, long j10, w wVar) {
        this(j5, j6, j7, z4, j8, j9, z5, z6, i5, j10);
    }

    /* renamed from: copy-0GkPj7c$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m4858copy0GkPj7c$default(PointerInputChange pointerInputChange, long j5, long j6, long j7, boolean z4, long j8, long j9, boolean z5, ConsumedData consumedData, int i5, long j10, int i6, Object obj) {
        long j11;
        long j12;
        long j13;
        boolean z6;
        long j14;
        long j15;
        boolean z7;
        int i7;
        long j16;
        if ((i6 & 1) != 0) {
            j11 = pointerInputChange.id;
        } else {
            j11 = j5;
        }
        if ((i6 & 2) != 0) {
            j12 = pointerInputChange.uptimeMillis;
        } else {
            j12 = j6;
        }
        if ((i6 & 4) != 0) {
            j13 = pointerInputChange.position;
        } else {
            j13 = j7;
        }
        if ((i6 & 8) != 0) {
            z6 = pointerInputChange.pressed;
        } else {
            z6 = z4;
        }
        if ((i6 & 16) != 0) {
            j14 = pointerInputChange.previousUptimeMillis;
        } else {
            j14 = j8;
        }
        if ((i6 & 32) != 0) {
            j15 = pointerInputChange.previousPosition;
        } else {
            j15 = j9;
        }
        if ((i6 & 64) != 0) {
            z7 = pointerInputChange.previousPressed;
        } else {
            z7 = z5;
        }
        if ((i6 & 256) != 0) {
            i7 = pointerInputChange.type;
        } else {
            i7 = i5;
        }
        int i8 = i7;
        if ((i6 & 512) != 0) {
            j16 = pointerInputChange.scrollDelta;
        } else {
            j16 = j10;
        }
        return pointerInputChange.m4864copy0GkPj7c(j11, j12, j13, z6, j14, j15, z7, consumedData, i8, j16);
    }

    /* renamed from: copy-8H9lfAM$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m4859copy8H9lfAM$default(PointerInputChange pointerInputChange, long j5, long j6, long j7, long j8, boolean z4, float f5, long j9, long j10, boolean z5, int i5, List list, long j11, int i6, Object obj) {
        long j12;
        long j13;
        long j14;
        long j15;
        boolean z6;
        float f6;
        long j16;
        long j17;
        boolean z7;
        int i7;
        List list2;
        long j18;
        if ((i6 & 1) != 0) {
            j12 = pointerInputChange.id;
        } else {
            j12 = j5;
        }
        if ((i6 & 2) != 0) {
            j13 = pointerInputChange.uptimeMillis;
        } else {
            j13 = j6;
        }
        if ((i6 & 4) != 0) {
            j14 = pointerInputChange.position;
        } else {
            j14 = j7;
        }
        if ((i6 & 8) != 0) {
            j15 = pointerInputChange.originalEventPosition;
        } else {
            j15 = j8;
        }
        if ((i6 & 16) != 0) {
            z6 = pointerInputChange.pressed;
        } else {
            z6 = z4;
        }
        if ((i6 & 32) != 0) {
            f6 = pointerInputChange.pressure;
        } else {
            f6 = f5;
        }
        if ((i6 & 64) != 0) {
            j16 = pointerInputChange.previousUptimeMillis;
        } else {
            j16 = j9;
        }
        if ((i6 & 128) != 0) {
            j17 = pointerInputChange.previousPosition;
        } else {
            j17 = j10;
        }
        long j19 = j17;
        if ((i6 & 256) != 0) {
            z7 = pointerInputChange.previousPressed;
        } else {
            z7 = z5;
        }
        if ((i6 & 512) != 0) {
            i7 = pointerInputChange.type;
        } else {
            i7 = i5;
        }
        int i8 = i7;
        if ((i6 & 1024) != 0) {
            list2 = pointerInputChange.getHistorical();
        } else {
            list2 = list;
        }
        boolean z8 = z7;
        List list3 = list2;
        if ((i6 & 2048) != 0) {
            j18 = pointerInputChange.scrollDelta;
        } else {
            j18 = j11;
        }
        return pointerInputChange.m4865copy8H9lfAM(j12, j13, j14, j15, z6, f6, j16, j19, z8, i8, list3, j18);
    }

    /* renamed from: copy-Ezr-O64$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m4860copyEzrO64$default(PointerInputChange pointerInputChange, long j5, long j6, long j7, boolean z4, long j8, long j9, boolean z5, ConsumedData consumedData, int i5, int i6, Object obj) {
        long j10;
        long j11;
        long j12;
        boolean z6;
        long j13;
        long j14;
        boolean z7;
        ConsumedData consumedData2;
        int i7;
        if ((i6 & 1) != 0) {
            j10 = pointerInputChange.id;
        } else {
            j10 = j5;
        }
        if ((i6 & 2) != 0) {
            j11 = pointerInputChange.uptimeMillis;
        } else {
            j11 = j6;
        }
        if ((i6 & 4) != 0) {
            j12 = pointerInputChange.position;
        } else {
            j12 = j7;
        }
        if ((i6 & 8) != 0) {
            z6 = pointerInputChange.pressed;
        } else {
            z6 = z4;
        }
        if ((i6 & 16) != 0) {
            j13 = pointerInputChange.previousUptimeMillis;
        } else {
            j13 = j8;
        }
        if ((i6 & 32) != 0) {
            j14 = pointerInputChange.previousPosition;
        } else {
            j14 = j9;
        }
        if ((i6 & 64) != 0) {
            z7 = pointerInputChange.previousPressed;
        } else {
            z7 = z5;
        }
        if ((i6 & 128) != 0) {
            consumedData2 = pointerInputChange.consumed;
        } else {
            consumedData2 = consumedData;
        }
        if ((i6 & 256) != 0) {
            i7 = pointerInputChange.type;
        } else {
            i7 = i5;
        }
        return pointerInputChange.m4866copyEzrO64(j10, j11, j12, z6, j13, j14, z7, consumedData2, i7);
    }

    /* renamed from: copy-JKmWfYY$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m4861copyJKmWfYY$default(PointerInputChange pointerInputChange, long j5, long j6, long j7, boolean z4, long j8, long j9, boolean z5, int i5, long j10, int i6, Object obj) {
        long j11;
        long j12;
        long j13;
        boolean z6;
        long j14;
        long j15;
        boolean z7;
        int i7;
        long j16;
        if ((i6 & 1) != 0) {
            j11 = pointerInputChange.id;
        } else {
            j11 = j5;
        }
        if ((i6 & 2) != 0) {
            j12 = pointerInputChange.uptimeMillis;
        } else {
            j12 = j6;
        }
        if ((i6 & 4) != 0) {
            j13 = pointerInputChange.position;
        } else {
            j13 = j7;
        }
        if ((i6 & 8) != 0) {
            z6 = pointerInputChange.pressed;
        } else {
            z6 = z4;
        }
        if ((i6 & 16) != 0) {
            j14 = pointerInputChange.previousUptimeMillis;
        } else {
            j14 = j8;
        }
        if ((i6 & 32) != 0) {
            j15 = pointerInputChange.previousPosition;
        } else {
            j15 = j9;
        }
        if ((i6 & 64) != 0) {
            z7 = pointerInputChange.previousPressed;
        } else {
            z7 = z5;
        }
        if ((i6 & 128) != 0) {
            i7 = pointerInputChange.type;
        } else {
            i7 = i5;
        }
        int i8 = i7;
        if ((i6 & 256) != 0) {
            j16 = pointerInputChange.scrollDelta;
        } else {
            j16 = j10;
        }
        return pointerInputChange.m4867copyJKmWfYY(j11, j12, j13, z6, j14, j15, z7, i8, j16);
    }

    /* renamed from: copy-OHpmEuE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m4862copyOHpmEuE$default(PointerInputChange pointerInputChange, long j5, long j6, long j7, boolean z4, long j8, long j9, boolean z5, int i5, List list, long j10, int i6, Object obj) {
        long j11;
        long j12;
        long j13;
        boolean z6;
        long j14;
        long j15;
        boolean z7;
        int i7;
        long j16;
        if ((i6 & 1) != 0) {
            j11 = pointerInputChange.id;
        } else {
            j11 = j5;
        }
        if ((i6 & 2) != 0) {
            j12 = pointerInputChange.uptimeMillis;
        } else {
            j12 = j6;
        }
        if ((i6 & 4) != 0) {
            j13 = pointerInputChange.position;
        } else {
            j13 = j7;
        }
        if ((i6 & 8) != 0) {
            z6 = pointerInputChange.pressed;
        } else {
            z6 = z4;
        }
        if ((i6 & 16) != 0) {
            j14 = pointerInputChange.previousUptimeMillis;
        } else {
            j14 = j8;
        }
        if ((i6 & 32) != 0) {
            j15 = pointerInputChange.previousPosition;
        } else {
            j15 = j9;
        }
        if ((i6 & 64) != 0) {
            z7 = pointerInputChange.previousPressed;
        } else {
            z7 = z5;
        }
        if ((i6 & 128) != 0) {
            i7 = pointerInputChange.type;
        } else {
            i7 = i5;
        }
        int i8 = i7;
        if ((i6 & 512) != 0) {
            j16 = pointerInputChange.scrollDelta;
        } else {
            j16 = j10;
        }
        return pointerInputChange.m4868copyOHpmEuE(j11, j12, j13, z6, j14, j15, z7, i8, list, j16);
    }

    /* renamed from: copy-Tn9QgHE$default, reason: not valid java name */
    public static /* synthetic */ PointerInputChange m4863copyTn9QgHE$default(PointerInputChange pointerInputChange, long j5, long j6, long j7, boolean z4, float f5, long j8, long j9, boolean z5, int i5, long j10, int i6, Object obj) {
        long j11;
        long j12;
        long j13;
        boolean z6;
        float f6;
        long j14;
        long j15;
        boolean z7;
        int i7;
        long j16;
        if ((i6 & 1) != 0) {
            j11 = pointerInputChange.id;
        } else {
            j11 = j5;
        }
        if ((i6 & 2) != 0) {
            j12 = pointerInputChange.uptimeMillis;
        } else {
            j12 = j6;
        }
        if ((i6 & 4) != 0) {
            j13 = pointerInputChange.position;
        } else {
            j13 = j7;
        }
        if ((i6 & 8) != 0) {
            z6 = pointerInputChange.pressed;
        } else {
            z6 = z4;
        }
        if ((i6 & 16) != 0) {
            f6 = pointerInputChange.pressure;
        } else {
            f6 = f5;
        }
        if ((i6 & 32) != 0) {
            j14 = pointerInputChange.previousUptimeMillis;
        } else {
            j14 = j8;
        }
        if ((i6 & 64) != 0) {
            j15 = pointerInputChange.previousPosition;
        } else {
            j15 = j9;
        }
        if ((i6 & 128) != 0) {
            z7 = pointerInputChange.previousPressed;
        } else {
            z7 = z5;
        }
        if ((i6 & 256) != 0) {
            i7 = pointerInputChange.type;
        } else {
            i7 = i5;
        }
        boolean z8 = z7;
        int i8 = i7;
        if ((i6 & 512) != 0) {
            j16 = pointerInputChange.scrollDelta;
        } else {
            j16 = j10;
        }
        return pointerInputChange.m4869copyTn9QgHE(j11, j12, j13, z6, f6, j14, j15, z8, i8, j16);
    }

    @k(message = "use isConsumed and consume() pair of methods instead")
    public static /* synthetic */ void getConsumed$annotations() {
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getHistorical$annotations() {
    }

    private static /* synthetic */ void get_historical$annotations() {
    }

    public static /* synthetic */ void isConsumed$annotations() {
    }

    public final void consume() {
        this.consumed.setDownChange(true);
        this.consumed.setPositionChange(true);
    }

    @l
    @k(message = "Partial consumption has been deprecated. Use copy() instead without `consumed` parameter to create a shallow copy or a constructor to create a new PointerInputChange", replaceWith = @b1(expression = "copy(id, currentTime, currentPosition, currentPressed, previousTime, previousPosition, previousPressed, type, scrollDelta)", imports = {}))
    /* renamed from: copy-0GkPj7c, reason: not valid java name */
    public final PointerInputChange m4864copy0GkPj7c(long j5, long j6, long j7, boolean z4, long j8, long j9, boolean z5, @l ConsumedData consumedData, int i5, long j10) {
        boolean z6;
        float f5 = this.pressure;
        if (!consumedData.getDownChange() && !consumedData.getPositionChange()) {
            z6 = false;
        } else {
            z6 = true;
        }
        PointerInputChange pointerInputChange = new PointerInputChange(j5, j6, j7, z4, f5, j8, j9, z5, z6, i5, getHistorical(), j10, this.originalEventPosition, null);
        this.consumed = consumedData;
        return pointerInputChange;
    }

    @l
    @ExperimentalComposeUiApi
    /* renamed from: copy-8H9lfAM, reason: not valid java name */
    public final PointerInputChange m4865copy8H9lfAM(long j5, long j6, long j7, long j8, boolean z4, float f5, long j9, long j10, boolean z5, int i5, @l List<HistoricalChange> list, long j11) {
        PointerInputChange pointerInputChange = new PointerInputChange(j5, j6, j7, z4, f5, j9, j10, z5, false, i5, list, j11, j8, null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    @k(level = kotlin.m.HIDDEN, message = "Use another copy() method with scrollDelta parameter instead", replaceWith = @b1(expression = "copy(id,currentTime, currentPosition, currentPressed, previousTime,previousPosition, previousPressed, consumed, type, this.scrollDelta)", imports = {}))
    /* renamed from: copy-Ezr-O64, reason: not valid java name */
    public final /* synthetic */ PointerInputChange m4866copyEzrO64(long j5, long j6, long j7, boolean z4, long j8, long j9, boolean z5, ConsumedData consumedData, int i5) {
        boolean z6;
        float f5 = this.pressure;
        if (!consumedData.getDownChange() && !consumedData.getPositionChange()) {
            z6 = false;
        } else {
            z6 = true;
        }
        PointerInputChange pointerInputChange = new PointerInputChange(j5, j6, j7, z4, f5, j8, j9, z5, z6, i5, getHistorical(), this.scrollDelta, this.originalEventPosition, null);
        this.consumed = consumedData;
        return pointerInputChange;
    }

    @l
    /* renamed from: copy-JKmWfYY, reason: not valid java name */
    public final PointerInputChange m4867copyJKmWfYY(long j5, long j6, long j7, boolean z4, long j8, long j9, boolean z5, int i5, long j10) {
        return m4859copy8H9lfAM$default(this, j5, j6, j7, 0L, z4, this.pressure, j8, j9, z5, i5, getHistorical(), j10, 8, null);
    }

    @l
    @ExperimentalComposeUiApi
    /* renamed from: copy-OHpmEuE, reason: not valid java name */
    public final PointerInputChange m4868copyOHpmEuE(long j5, long j6, long j7, boolean z4, long j8, long j9, boolean z5, int i5, @l List<HistoricalChange> list, long j10) {
        return m4859copy8H9lfAM$default(this, j5, j6, j7, 0L, z4, this.pressure, j8, j9, z5, i5, list, j10, 8, null);
    }

    @l
    /* renamed from: copy-Tn9QgHE, reason: not valid java name */
    public final PointerInputChange m4869copyTn9QgHE(long j5, long j6, long j7, boolean z4, float f5, long j8, long j9, boolean z5, int i5, long j10) {
        PointerInputChange pointerInputChange = new PointerInputChange(j5, j6, j7, z4, f5, j8, j9, z5, false, i5, getHistorical(), j10, this.originalEventPosition, null);
        pointerInputChange.consumed = this.consumed;
        return pointerInputChange;
    }

    @l
    public final ConsumedData getConsumed() {
        return this.consumed;
    }

    @l
    @ExperimentalComposeUiApi
    public final List<HistoricalChange> getHistorical() {
        List<HistoricalChange> E;
        List<HistoricalChange> list = this._historical;
        if (list != null) {
            return list;
        }
        E = kotlin.collections.w.E();
        return E;
    }

    /* renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m4870getIdJ3iCeTQ() {
        return this.id;
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui_release, reason: not valid java name */
    public final long m4871getOriginalEventPositionF1C5BW0$ui_release() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m4872getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getPressed() {
        return this.pressed;
    }

    public final float getPressure() {
        return this.pressure;
    }

    /* renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name */
    public final long m4873getPreviousPositionF1C5BW0() {
        return this.previousPosition;
    }

    public final boolean getPreviousPressed() {
        return this.previousPressed;
    }

    public final long getPreviousUptimeMillis() {
        return this.previousUptimeMillis;
    }

    /* renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m4874getScrollDeltaF1C5BW0() {
        return this.scrollDelta;
    }

    /* renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m4875getTypeT8wyACA() {
        return this.type;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public final boolean isConsumed() {
        return this.consumed.getDownChange() || this.consumed.getPositionChange();
    }

    /* renamed from: setOriginalEventPosition-k-4lQ0M$ui_release, reason: not valid java name */
    public final void m4876setOriginalEventPositionk4lQ0M$ui_release(long j5) {
        this.originalEventPosition = j5;
    }

    @l
    public String toString() {
        return "PointerInputChange(id=" + ((Object) PointerId.m4856toStringimpl(this.id)) + ", uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m3501toStringimpl(this.position)) + ", pressed=" + this.pressed + ", pressure=" + this.pressure + ", previousUptimeMillis=" + this.previousUptimeMillis + ", previousPosition=" + ((Object) Offset.m3501toStringimpl(this.previousPosition)) + ", previousPressed=" + this.previousPressed + ", isConsumed=" + isConsumed() + ", type=" + ((Object) PointerType.m4946toStringimpl(this.type)) + ", historical=" + getHistorical() + ",scrollDelta=" + ((Object) Offset.m3501toStringimpl(this.scrollDelta)) + ')';
    }

    public /* synthetic */ PointerInputChange(long j5, long j6, long j7, boolean z4, float f5, long j8, long j9, boolean z5, boolean z6, int i5, long j10, int i6, w wVar) {
        this(j5, j6, j7, z4, f5, j8, j9, z5, z6, (i6 & 512) != 0 ? PointerType.Companion.m4951getTouchT8wyACA() : i5, (i6 & 1024) != 0 ? Offset.Companion.m3509getZeroF1C5BW0() : j10, (w) null);
    }

    public /* synthetic */ PointerInputChange(long j5, long j6, long j7, boolean z4, long j8, long j9, boolean z5, boolean z6, int i5, long j10, int i6, w wVar) {
        this(j5, j6, j7, z4, j8, j9, z5, z6, (i6 & 256) != 0 ? PointerType.Companion.m4951getTouchT8wyACA() : i5, (i6 & 512) != 0 ? Offset.Companion.m3509getZeroF1C5BW0() : j10, (w) null);
    }

    private PointerInputChange(long j5, long j6, long j7, boolean z4, long j8, long j9, boolean z5, boolean z6, int i5, long j10) {
        this(j5, j6, j7, z4, 1.0f, j8, j9, z5, z6, i5, j10, (w) null);
    }

    public /* synthetic */ PointerInputChange(long j5, long j6, long j7, boolean z4, long j8, long j9, boolean z5, ConsumedData consumedData, int i5, int i6, w wVar) {
        this(j5, j6, j7, z4, j8, j9, z5, consumedData, (i6 & 256) != 0 ? PointerType.Companion.m4951getTouchT8wyACA() : i5, (w) null);
    }

    private PointerInputChange(long j5, long j6, long j7, boolean z4, long j8, long j9, boolean z5, ConsumedData consumedData, int i5) {
        this(j5, j6, j7, z4, 1.0f, j8, j9, z5, consumedData.getDownChange() || consumedData.getPositionChange(), i5, Offset.Companion.m3509getZeroF1C5BW0(), (w) null);
    }

    private PointerInputChange(long j5, long j6, long j7, boolean z4, float f5, long j8, long j9, boolean z5, boolean z6, int i5, List<HistoricalChange> list, long j10, long j11) {
        this(j5, j6, j7, z4, f5, j8, j9, z5, z6, i5, j10, (w) null);
        this._historical = list;
        this.originalEventPosition = j11;
    }
}
