package androidx.compose.ui.input.pointer;

import android.os.SystemClock;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInteropFilter;
import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\r\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000e\u001a\u00020\u0002H\u0016R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"androidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1", "Landroidx/compose/ui/input/pointer/PointerInputFilter;", "Lkotlin/r2;", "reset", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "dispatchToView", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancel", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "state", "Landroidx/compose/ui/input/pointer/PointerInteropFilter$DispatchToViewState;", "", "getShareWithSiblings", "()Z", "shareWithSiblings", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nPointerInteropFilter.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,352:1\n101#2,2:353\n33#2,6:355\n103#2:361\n86#2,2:362\n33#2,6:364\n88#2:370\n101#2,2:371\n33#2,6:373\n103#2:379\n33#2,6:380\n*S KotlinDebug\n*F\n+ 1 PointerInteropFilter.android.kt\nandroidx/compose/ui/input/pointer/PointerInteropFilter$pointerInputFilter$1\n*L\n223#1:353,2\n223#1:355,6\n223#1:361\n238#1:362,2\n238#1:364,6\n238#1:370\n280#1:371,2\n280#1:373,6\n280#1:379\n314#1:380,6\n*E\n"})
/* loaded from: classes.dex */
public final class PointerInteropFilter$pointerInputFilter$1 extends PointerInputFilter {

    @l
    private PointerInteropFilter.DispatchToViewState state = PointerInteropFilter.DispatchToViewState.Unknown;
    final /* synthetic */ PointerInteropFilter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PointerInteropFilter$pointerInputFilter$1(PointerInteropFilter pointerInteropFilter) {
        this.this$0 = pointerInteropFilter;
    }

    private final void dispatchToView(PointerEvent pointerEvent) {
        boolean z4;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                if (changes.get(i5).isConsumed()) {
                    z4 = true;
                    break;
                }
                i5++;
            } else {
                z4 = false;
                break;
            }
        }
        if (z4) {
            if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                LayoutCoordinates layoutCoordinates$ui_release = getLayoutCoordinates$ui_release();
                if (layoutCoordinates$ui_release != null) {
                    PointerInteropUtils_androidKt.m4931toCancelMotionEventScoped4ec7I(pointerEvent, layoutCoordinates$ui_release.mo5007localToRootMKHz9U(Offset.Companion.m3509getZeroF1C5BW0()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$2(this.this$0));
                } else {
                    throw new IllegalStateException("layoutCoordinates not set".toString());
                }
            }
            this.state = PointerInteropFilter.DispatchToViewState.NotDispatching;
            return;
        }
        LayoutCoordinates layoutCoordinates$ui_release2 = getLayoutCoordinates$ui_release();
        if (layoutCoordinates$ui_release2 != null) {
            PointerInteropUtils_androidKt.m4932toMotionEventScoped4ec7I(pointerEvent, layoutCoordinates$ui_release2.mo5007localToRootMKHz9U(Offset.Companion.m3509getZeroF1C5BW0()), new PointerInteropFilter$pointerInputFilter$1$dispatchToView$3(this, this.this$0));
            if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
                int size2 = changes.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    changes.get(i6).consume();
                }
                InternalPointerEvent internalPointerEvent$ui_release = pointerEvent.getInternalPointerEvent$ui_release();
                if (internalPointerEvent$ui_release != null) {
                    internalPointerEvent$ui_release.setSuppressMovementConsumption(!this.this$0.getDisallowIntercept$ui_release());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set".toString());
    }

    private final void reset() {
        this.state = PointerInteropFilter.DispatchToViewState.Unknown;
        this.this$0.setDisallowIntercept$ui_release(false);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public boolean getShareWithSiblings() {
        return true;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    public void onCancel() {
        if (this.state == PointerInteropFilter.DispatchToViewState.Dispatching) {
            PointerInteropUtils_androidKt.emptyCancelMotionEventScope(SystemClock.uptimeMillis(), new PointerInteropFilter$pointerInputFilter$1$onCancel$1(this.this$0));
            reset();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.input.pointer.PointerInputFilter
    /* renamed from: onPointerEvent-H0pRuoY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo4896onPointerEventH0pRuoY(@p4.l androidx.compose.ui.input.pointer.PointerEvent r6, @p4.l androidx.compose.ui.input.pointer.PointerEventPass r7, long r8) {
        /*
            r5 = this;
            java.util.List r8 = r6.getChanges()
            androidx.compose.ui.input.pointer.PointerInteropFilter r9 = r5.this$0
            boolean r9 = r9.getDisallowIntercept$ui_release()
            r0 = 0
            r1 = 1
            if (r9 != 0) goto L38
            int r9 = r8.size()
            r2 = r0
        L13:
            if (r2 >= r9) goto L32
            java.lang.Object r3 = r8.get(r2)
            androidx.compose.ui.input.pointer.PointerInputChange r3 = (androidx.compose.ui.input.pointer.PointerInputChange) r3
            boolean r4 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r3)
            if (r4 != 0) goto L2a
            boolean r3 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r3)
            if (r3 == 0) goto L28
            goto L2a
        L28:
            r3 = r0
            goto L2b
        L2a:
            r3 = r1
        L2b:
            if (r3 == 0) goto L2f
            r9 = r1
            goto L33
        L2f:
            int r2 = r2 + 1
            goto L13
        L32:
            r9 = r0
        L33:
            if (r9 == 0) goto L36
            goto L38
        L36:
            r9 = r0
            goto L39
        L38:
            r9 = r1
        L39:
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r2 = r5.state
            androidx.compose.ui.input.pointer.PointerInteropFilter$DispatchToViewState r3 = androidx.compose.ui.input.pointer.PointerInteropFilter.DispatchToViewState.NotDispatching
            if (r2 == r3) goto L51
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
            if (r7 != r2) goto L48
            if (r9 == 0) goto L48
            r5.dispatchToView(r6)
        L48:
            androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            if (r7 != r2) goto L51
            if (r9 != 0) goto L51
            r5.dispatchToView(r6)
        L51:
            androidx.compose.ui.input.pointer.PointerEventPass r6 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            if (r7 != r6) goto L72
            int r6 = r8.size()
            r7 = r0
        L5a:
            if (r7 >= r6) goto L6c
            java.lang.Object r9 = r8.get(r7)
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            boolean r9 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUpIgnoreConsumed(r9)
            if (r9 != 0) goto L69
            goto L6d
        L69:
            int r7 = r7 + 1
            goto L5a
        L6c:
            r0 = r1
        L6d:
            if (r0 == 0) goto L72
            r5.reset()
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.PointerInteropFilter$pointerInputFilter$1.mo4896onPointerEventH0pRuoY(androidx.compose.ui.input.pointer.PointerEvent, androidx.compose.ui.input.pointer.PointerEventPass, long):void");
    }
}
