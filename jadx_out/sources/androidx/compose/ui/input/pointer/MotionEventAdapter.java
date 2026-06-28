package androidx.compose.ui.input.pointer;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b/\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001d\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J(\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\tH\u0002J!\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010 \u001a\u00020\u001f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010-\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "", "Landroid/view/MotionEvent;", "motionEvent", "Lkotlin/r2;", "addFreshIds", "removeStaleIds", "", "pointerId", "", "hasPointerId", "motionEventPointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "getComposePointerId-_I2yYro", "(I)J", "getComposePointerId", "clearOnDeviceChange", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "index", "pressed", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "createPointerInputEventData", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "convertToPointerInputEvent$ui_release", "(Landroid/view/MotionEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;)Landroidx/compose/ui/input/pointer/PointerInputEvent;", "convertToPointerInputEvent", "endStream", "", "nextId", "J", "Landroid/util/SparseLongArray;", "motionEventToComposePointerIdMap", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release", "()Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui_release$annotations", "()V", "Landroid/util/SparseBooleanArray;", "canHover", "Landroid/util/SparseBooleanArray;", "", "pointers", "Ljava/util/List;", "previousToolType", "I", "previousSource", "<init>", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MotionEventAdapter {
    public static final int $stable = 8;
    private long nextId;

    @l
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();

    @l
    private final SparseBooleanArray canHover = new SparseBooleanArray();

    @l
    private final List<PointerInputEventData> pointers = new ArrayList();
    private int previousToolType = -1;
    private int previousSource = -1;

    private final void addFreshIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked == 9) {
                int pointerId = motionEvent.getPointerId(0);
                if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                    SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                    long j5 = this.nextId;
                    this.nextId = 1 + j5;
                    sparseLongArray.put(pointerId, j5);
                    return;
                }
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j6 = this.nextId;
            this.nextId = 1 + j6;
            sparseLongArray2.put(pointerId2, j6);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.canHover.put(pointerId2, true);
            }
        }
    }

    private final void clearOnDeviceChange(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType != this.previousToolType || source != this.previousSource) {
            this.previousToolType = toolType;
            this.previousSource = source;
            this.canHover.clear();
            this.motionEventToComposePointerIdMap.clear();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.ui.input.pointer.PointerInputEventData createPointerInputEventData(androidx.compose.ui.input.pointer.PositionCalculator r32, android.view.MotionEvent r33, int r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.MotionEventAdapter.createPointerInputEventData(androidx.compose.ui.input.pointer.PositionCalculator, android.view.MotionEvent, int, boolean):androidx.compose.ui.input.pointer.PointerInputEventData");
    }

    /* renamed from: getComposePointerId-_I2yYro, reason: not valid java name */
    private final long m4802getComposePointerId_I2yYro(int i5) {
        long j5;
        int indexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(i5);
        if (indexOfKey >= 0) {
            j5 = this.motionEventToComposePointerIdMap.valueAt(indexOfKey);
        } else {
            j5 = this.nextId;
            this.nextId = 1 + j5;
            this.motionEventToComposePointerIdMap.put(i5, j5);
        }
        return PointerId.m4852constructorimpl(j5);
    }

    @VisibleForTesting
    public static /* synthetic */ void getMotionEventToComposePointerIdMap$ui_release$annotations() {
    }

    private final boolean hasPointerId(MotionEvent motionEvent, int i5) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i6 = 0; i6 < pointerCount; i6++) {
            if (motionEvent.getPointerId(i6) == i5) {
                return true;
            }
        }
        return false;
    }

    private final void removeStaleIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.canHover.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.canHover.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int keyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!hasPointerId(motionEvent, keyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.canHover.delete(keyAt);
                }
            }
        }
    }

    @m
    public final PointerInputEvent convertToPointerInputEvent$ui_release(@l MotionEvent motionEvent, @l PositionCalculator positionCalculator) {
        boolean z4;
        boolean z5;
        int i5;
        boolean z6;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.motionEventToComposePointerIdMap.clear();
            this.canHover.clear();
            return null;
        }
        clearOnDeviceChange(motionEvent);
        addFreshIds(motionEvent);
        if (actionMasked != 10 && actionMasked != 7 && actionMasked != 9) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (actionMasked == 8) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z4) {
            this.canHover.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            if (actionMasked != 6) {
                i5 = -1;
            } else {
                i5 = motionEvent.getActionIndex();
            }
        } else {
            i5 = 0;
        }
        this.pointers.clear();
        int pointerCount = motionEvent.getPointerCount();
        for (int i6 = 0; i6 < pointerCount; i6++) {
            List<PointerInputEventData> list = this.pointers;
            if (!z4 && i6 != i5 && (!z5 || motionEvent.getButtonState() != 0)) {
                z6 = true;
            } else {
                z6 = false;
            }
            list.add(createPointerInputEventData(positionCalculator, motionEvent, i6, z6));
        }
        removeStaleIds(motionEvent);
        return new PointerInputEvent(motionEvent.getEventTime(), this.pointers, motionEvent);
    }

    public final void endStream(int i5) {
        this.canHover.delete(i5);
        this.motionEventToComposePointerIdMap.delete(i5);
    }

    @l
    public final SparseLongArray getMotionEventToComposePointerIdMap$ui_release() {
        return this.motionEventToComposePointerIdMap;
    }
}
