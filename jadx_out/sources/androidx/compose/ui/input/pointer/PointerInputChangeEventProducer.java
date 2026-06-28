package androidx.compose.ui.input.pointer;

import androidx.collection.LongSparseArray;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\t\u001a\u00020\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "pointerInputEvent", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "produce", "Lkotlin/r2;", "clear", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "previousPointerInputData", "Landroidx/collection/LongSparseArray;", "<init>", "()V", "PointerInputData", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nPointerInputEventProcessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,261:1\n33#2,6:262\n*S KotlinDebug\n*F\n+ 1 PointerInputEventProcessor.kt\nandroidx/compose/ui/input/pointer/PointerInputChangeEventProducer\n*L\n169#1:262,6\n*E\n"})
/* loaded from: classes.dex */
public final class PointerInputChangeEventProducer {

    @l
    private final LongSparseArray<PointerInputData> previousPointerInputData = new LongSparseArray<>(0, 1, null);

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\b\u001a\u00020\u00078\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0010\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "", "", "uptime", "J", "getUptime", "()J", "Landroidx/compose/ui/geometry/Offset;", "positionOnScreen", "getPositionOnScreen-F1C5BW0", "", "down", "Z", "getDown", "()Z", "Landroidx/compose/ui/input/pointer/PointerType;", "type", "I", "getType-T8wyACA", "()I", "<init>", "(JJZILkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes.dex */
    private static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final int type;
        private final long uptime;

        private PointerInputData(long j5, long j6, boolean z4, int i5) {
            this.uptime = j5;
            this.positionOnScreen = j6;
            this.down = z4;
            this.type = i5;
        }

        public /* synthetic */ PointerInputData(long j5, long j6, boolean z4, int i5, w wVar) {
            this(j5, j6, z4, i5);
        }

        public final boolean getDown() {
            return this.down;
        }

        /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
        public final long m4877getPositionOnScreenF1C5BW0() {
            return this.positionOnScreen;
        }

        /* renamed from: getType-T8wyACA, reason: not valid java name */
        public final int m4878getTypeT8wyACA() {
            return this.type;
        }

        public final long getUptime() {
            return this.uptime;
        }
    }

    public final void clear() {
        this.previousPointerInputData.clear();
    }

    @l
    public final InternalPointerEvent produce(@l PointerInputEvent pointerInputEvent, @l PositionCalculator positionCalculator) {
        long j5;
        boolean down;
        long mo4955screenToLocalMKHz9U;
        LongSparseArray longSparseArray = new LongSparseArray(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i5 = 0; i5 < size; i5++) {
            PointerInputEventData pointerInputEventData = pointers.get(i5);
            PointerInputData pointerInputData = this.previousPointerInputData.get(pointerInputEventData.m4887getIdJ3iCeTQ());
            if (pointerInputData == null) {
                j5 = pointerInputEventData.getUptime();
                mo4955screenToLocalMKHz9U = pointerInputEventData.m4889getPositionF1C5BW0();
                down = false;
            } else {
                long uptime = pointerInputData.getUptime();
                j5 = uptime;
                down = pointerInputData.getDown();
                mo4955screenToLocalMKHz9U = positionCalculator.mo4955screenToLocalMKHz9U(pointerInputData.m4877getPositionOnScreenF1C5BW0());
            }
            longSparseArray.put(pointerInputEventData.m4887getIdJ3iCeTQ(), new PointerInputChange(pointerInputEventData.m4887getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m4889getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), j5, mo4955screenToLocalMKHz9U, down, false, pointerInputEventData.m4892getTypeT8wyACA(), pointerInputEventData.getHistorical(), pointerInputEventData.m4891getScrollDeltaF1C5BW0(), pointerInputEventData.m4888getOriginalEventPositionF1C5BW0(), null));
            if (pointerInputEventData.getDown()) {
                this.previousPointerInputData.put(pointerInputEventData.m4887getIdJ3iCeTQ(), new PointerInputData(pointerInputEventData.getUptime(), pointerInputEventData.m4890getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.m4892getTypeT8wyACA(), null));
            } else {
                this.previousPointerInputData.remove(pointerInputEventData.m4887getIdJ3iCeTQ());
            }
        }
        return new InternalPointerEvent(longSparseArray, pointerInputEvent);
    }
}
