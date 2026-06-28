package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u001f\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u001f\u001a\u00020\u001aH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\fJ\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u001e\u0010\"\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u0019\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0014\u0010\fR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R,\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@@X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "changes", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "(Ljava/util/List;)V", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "(Ljava/util/List;Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "buttons", "Landroidx/compose/ui/input/pointer/PointerButtons;", "getButtons-ry648PA", "()I", "I", "getChanges", "()Ljava/util/List;", "getInternalPointerEvent$ui_release", "()Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "keyboardModifiers", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "getKeyboardModifiers-k7X9c1A", "motionEvent", "Landroid/view/MotionEvent;", "getMotionEvent$ui_release", "()Landroid/view/MotionEvent;", "<set-?>", "Landroidx/compose/ui/input/pointer/PointerEventType;", "type", "getType-7fucELk", "setType-EhbLWgg$ui_release", "(I)V", "calculatePointerEventType", "calculatePointerEventType-7fucELk", "component1", "copy", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nPointerEvent.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,202:1\n33#2,6:203\n33#2,6:209\n*S KotlinDebug\n*F\n+ 1 PointerEvent.android.kt\nandroidx/compose/ui/input/pointer/PointerEvent\n*L\n72#1:203,6\n97#1:209,6\n*E\n"})
/* loaded from: classes.dex */
public final class PointerEvent {
    public static final int $stable = 8;
    private final int buttons;

    @l
    private final List<PointerInputChange> changes;

    @m
    private final InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    public PointerEvent(@l List<PointerInputChange> list, @m InternalPointerEvent internalPointerEvent) {
        this.changes = list;
        this.internalPointerEvent = internalPointerEvent;
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        this.buttons = PointerButtons.m4805constructorimpl(motionEvent$ui_release != null ? motionEvent$ui_release.getButtonState() : 0);
        MotionEvent motionEvent$ui_release2 = getMotionEvent$ui_release();
        this.keyboardModifiers = PointerKeyboardModifiers.m4935constructorimpl(motionEvent$ui_release2 != null ? motionEvent$ui_release2.getMetaState() : 0);
        this.type = m4811calculatePointerEventType7fucELk();
    }

    /* renamed from: calculatePointerEventType-7fucELk, reason: not valid java name */
    private final int m4811calculatePointerEventType7fucELk() {
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        if (motionEvent$ui_release != null) {
            int actionMasked = motionEvent$ui_release.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        switch (actionMasked) {
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                break;
                            case 8:
                                return PointerEventType.Companion.m4830getScroll7fucELk();
                            case 9:
                                return PointerEventType.Companion.m4825getEnter7fucELk();
                            case 10:
                                return PointerEventType.Companion.m4826getExit7fucELk();
                            default:
                                return PointerEventType.Companion.m4831getUnknown7fucELk();
                        }
                    }
                    return PointerEventType.Companion.m4827getMove7fucELk();
                }
                return PointerEventType.Companion.m4829getRelease7fucELk();
            }
            return PointerEventType.Companion.m4828getPress7fucELk();
        }
        List<PointerInputChange> list = this.changes;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            PointerInputChange pointerInputChange = list.get(i5);
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                return PointerEventType.Companion.m4829getRelease7fucELk();
            }
            if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                return PointerEventType.Companion.m4828getPress7fucELk();
            }
        }
        return PointerEventType.Companion.m4827getMove7fucELk();
    }

    @l
    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    @l
    public final PointerEvent copy(@l List<PointerInputChange> list, @m MotionEvent motionEvent) {
        boolean z4;
        if (motionEvent == null) {
            return new PointerEvent(list, null);
        }
        if (l0.g(motionEvent, getMotionEvent$ui_release())) {
            return new PointerEvent(list, this.internalPointerEvent);
        }
        LongSparseArray longSparseArray = new LongSparseArray(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i5 = 0;
        while (i5 < size) {
            PointerInputChange pointerInputChange = list.get(i5);
            longSparseArray.put(pointerInputChange.m4870getIdJ3iCeTQ(), pointerInputChange);
            long m4870getIdJ3iCeTQ = pointerInputChange.m4870getIdJ3iCeTQ();
            long uptimeMillis = pointerInputChange.getUptimeMillis();
            long m4872getPositionF1C5BW0 = pointerInputChange.m4872getPositionF1C5BW0();
            long m4872getPositionF1C5BW02 = pointerInputChange.m4872getPositionF1C5BW0();
            boolean pressed = pointerInputChange.getPressed();
            float pressure = pointerInputChange.getPressure();
            int m4875getTypeT8wyACA = pointerInputChange.m4875getTypeT8wyACA();
            InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
            int i6 = i5;
            if (internalPointerEvent != null && internalPointerEvent.m4801issuesEnterExitEvent0FcD4WY(pointerInputChange.m4870getIdJ3iCeTQ())) {
                z4 = true;
            } else {
                z4 = false;
            }
            arrayList.add(new PointerInputEventData(m4870getIdJ3iCeTQ, uptimeMillis, m4872getPositionF1C5BW0, m4872getPositionF1C5BW02, pressed, pressure, m4875getTypeT8wyACA, z4, null, 0L, 0L, 1792, null));
            i5 = i6 + 1;
        }
        return new PointerEvent(list, new InternalPointerEvent(longSparseArray, new PointerInputEvent(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    /* renamed from: getButtons-ry648PA, reason: not valid java name */
    public final int m4812getButtonsry648PA() {
        return this.buttons;
    }

    @l
    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    @m
    public final InternalPointerEvent getInternalPointerEvent$ui_release() {
        return this.internalPointerEvent;
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name */
    public final int m4813getKeyboardModifiersk7X9c1A() {
        return this.keyboardModifiers;
    }

    @m
    public final MotionEvent getMotionEvent$ui_release() {
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
    }

    /* renamed from: getType-7fucELk, reason: not valid java name */
    public final int m4814getType7fucELk() {
        return this.type;
    }

    /* renamed from: setType-EhbLWgg$ui_release, reason: not valid java name */
    public final void m4815setTypeEhbLWgg$ui_release(int i5) {
        this.type = i5;
    }

    public PointerEvent(@l List<PointerInputChange> list) {
        this(list, null);
    }
}
