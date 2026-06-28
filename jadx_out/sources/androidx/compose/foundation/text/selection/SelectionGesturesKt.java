package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\u001a \u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000\u001a\u001c\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a$\u0010\u000f\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010\u001a,\u0010\u0013\u001a\u00020\u0003*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0015\u001a\u00020\r*\u00020\u000bH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016\u001a&\u0010\u001c\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010!\u001a\u00020 8\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0018\u0010#\u001a\u00020\u0002*\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "", "Lkotlin/r2;", "updateTouchMode", "updateSelectionTouchMode", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "mouseSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "textDragObserver", "selectionGestureInput", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "observer", "Landroidx/compose/ui/input/pointer/PointerEvent;", "down", "touchSelection", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/TextDragObserver;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/foundation/text/selection/ClicksCounter;", "clicksCounter", "mouseSelection", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/foundation/text/selection/MouseSelectionObserver;Landroidx/compose/foundation/text/selection/ClicksCounter;Landroidx/compose/ui/input/pointer/PointerEvent;Lkotlin/coroutines/d;)Ljava/lang/Object;", "awaitDown", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/geometry/Offset;", "offset1", "offset2", "distanceIsTolerable-2x9bVx0", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JJ)Z", "distanceIsTolerable", "", "STATIC_KEY", "I", "", "ClicksSlop", "D", "isPrecisePointer", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nSelectionGestures.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,238:1\n33#2,6:239\n33#2,6:245\n33#2,6:251\n86#2,2:257\n33#2,6:259\n88#2:265\n86#2,2:266\n33#2,6:268\n88#2:274\n*S KotlinDebug\n*F\n+ 1 SelectionGestures.kt\nandroidx/compose/foundation/text/selection/SelectionGesturesKt\n*L\n129#1:239,6\n160#1:245,6\n183#1:251,6\n226#1:257,2\n226#1:259,6\n226#1:265\n237#1:266,2\n237#1:268,6\n237#1:274\n*E\n"})
/* loaded from: classes.dex */
public final class SelectionGesturesKt {
    public static final double ClicksSlop = 100.0d;
    private static final int STATIC_KEY = 8675309;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0042 -> B:10:0x0045). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.PointerEvent> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$awaitDown$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r8
            kotlin.e1.n(r9)
            goto L45
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.e1.n(r9)
        L38:
            androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r9 = r8.awaitPointerEvent(r9, r0)
            if (r9 != r1) goto L45
            return r1
        L45:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            java.util.List r2 = r9.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L51:
            if (r6 >= r4) goto L63
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r7)
            if (r7 != 0) goto L60
            goto L64
        L60:
            int r6 = r6 + 1
            goto L51
        L63:
            r5 = r3
        L64:
            if (r5 == 0) goto L38
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.awaitDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: distanceIsTolerable-2x9bVx0, reason: not valid java name */
    private static final boolean m989distanceIsTolerable2x9bVx0(AwaitPointerEventScope awaitPointerEventScope, long j5, long j6) {
        return Offset.m3491getDistanceimpl(Offset.m3497minusMKHz9U(j5, j6)) < awaitPointerEventScope.getViewConfiguration().getTouchSlop();
    }

    public static final boolean isPrecisePointer(@l PointerEvent pointerEvent) {
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (!PointerType.m4944equalsimpl0(changes.get(i5).m4875getTypeT8wyACA(), PointerType.Companion.m4949getMouseT8wyACA())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object mouseSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope r7, androidx.compose.foundation.text.selection.MouseSelectionObserver r8, androidx.compose.foundation.text.selection.ClicksCounter r9, androidx.compose.ui.input.pointer.PointerEvent r10, kotlin.coroutines.d<? super kotlin.r2> r11) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.mouseSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.selection.MouseSelectionObserver, androidx.compose.foundation.text.selection.ClicksCounter, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.d):java.lang.Object");
    }

    @l
    public static final Modifier selectionGestureInput(@l Modifier modifier, @l MouseSelectionObserver mouseSelectionObserver, @l TextDragObserver textDragObserver) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, mouseSelectionObserver, textDragObserver, new SelectionGesturesKt$selectionGestureInput$1(mouseSelectionObserver, textDragObserver, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00aa A[Catch: CancellationException -> 0x00d5, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:12:0x0031, B:13:0x00a2, B:15:0x00aa, B:17:0x00b9, B:19:0x00c5, B:21:0x00c8, B:24:0x00cb, B:28:0x00cf, B:32:0x0049, B:34:0x0070, B:36:0x0074, B:38:0x0082, B:42:0x0053), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf A[Catch: CancellationException -> 0x00d5, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00d5, blocks: (B:12:0x0031, B:13:0x00a2, B:15:0x00aa, B:17:0x00b9, B:19:0x00c5, B:21:0x00c8, B:24:0x00cb, B:28:0x00cf, B:32:0x0049, B:34:0x0070, B:36:0x0074, B:38:0x0082, B:42:0x0053), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object touchSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, androidx.compose.foundation.text.TextDragObserver r10, androidx.compose.ui.input.pointer.PointerEvent r11, kotlin.coroutines.d<? super kotlin.r2> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = (androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1 r0 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L50
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.L$1
            r10 = r9
            androidx.compose.foundation.text.TextDragObserver r10 = (androidx.compose.foundation.text.TextDragObserver) r10
            java.lang.Object r9 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r9 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r9
            kotlin.e1.n(r12)     // Catch: java.util.concurrent.CancellationException -> Ld5
            goto La2
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            java.lang.Object r9 = r0.L$2
            androidx.compose.ui.input.pointer.PointerInputChange r9 = (androidx.compose.ui.input.pointer.PointerInputChange) r9
            java.lang.Object r10 = r0.L$1
            androidx.compose.foundation.text.TextDragObserver r10 = (androidx.compose.foundation.text.TextDragObserver) r10
            java.lang.Object r11 = r0.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r11
            kotlin.e1.n(r12)     // Catch: java.util.concurrent.CancellationException -> Ld5
            r8 = r11
            r11 = r9
            r9 = r8
            goto L70
        L50:
            kotlin.e1.n(r12)
            java.util.List r11 = r11.getChanges()     // Catch: java.util.concurrent.CancellationException -> Ld5
            java.lang.Object r11 = kotlin.collections.u.y2(r11)     // Catch: java.util.concurrent.CancellationException -> Ld5
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11     // Catch: java.util.concurrent.CancellationException -> Ld5
            long r5 = r11.m4870getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$1 = r10     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$2 = r11     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.label = r4     // Catch: java.util.concurrent.CancellationException -> Ld5
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m330awaitLongPressOrCancellationrnUCldI(r9, r5, r0)     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r12 != r1) goto L70
            return r1
        L70:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r12 == 0) goto Ld2
            long r4 = r11.m4872getPositionF1C5BW0()     // Catch: java.util.concurrent.CancellationException -> Ld5
            long r6 = r12.m4872getPositionF1C5BW0()     // Catch: java.util.concurrent.CancellationException -> Ld5
            boolean r11 = m989distanceIsTolerable2x9bVx0(r9, r4, r6)     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r11 == 0) goto Ld2
            long r4 = r12.m4872getPositionF1C5BW0()     // Catch: java.util.concurrent.CancellationException -> Ld5
            r10.mo897onStartk4lQ0M(r4)     // Catch: java.util.concurrent.CancellationException -> Ld5
            long r11 = r12.m4870getIdJ3iCeTQ()     // Catch: java.util.concurrent.CancellationException -> Ld5
            androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2 r2 = new androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelection$2     // Catch: java.util.concurrent.CancellationException -> Ld5
            r2.<init>(r10)     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.L$1 = r10     // Catch: java.util.concurrent.CancellationException -> Ld5
            r4 = 0
            r0.L$2 = r4     // Catch: java.util.concurrent.CancellationException -> Ld5
            r0.label = r3     // Catch: java.util.concurrent.CancellationException -> Ld5
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m339dragjO51t88(r9, r11, r2, r0)     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r12 != r1) goto La2
            return r1
        La2:
            java.lang.Boolean r12 = (java.lang.Boolean) r12     // Catch: java.util.concurrent.CancellationException -> Ld5
            boolean r11 = r12.booleanValue()     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r11 == 0) goto Lcf
            androidx.compose.ui.input.pointer.PointerEvent r9 = r9.getCurrentEvent()     // Catch: java.util.concurrent.CancellationException -> Ld5
            java.util.List r9 = r9.getChanges()     // Catch: java.util.concurrent.CancellationException -> Ld5
            int r11 = r9.size()     // Catch: java.util.concurrent.CancellationException -> Ld5
            r12 = 0
        Lb7:
            if (r12 >= r11) goto Lcb
            java.lang.Object r0 = r9.get(r12)     // Catch: java.util.concurrent.CancellationException -> Ld5
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0     // Catch: java.util.concurrent.CancellationException -> Ld5
            boolean r1 = androidx.compose.ui.input.pointer.PointerEventKt.changedToUp(r0)     // Catch: java.util.concurrent.CancellationException -> Ld5
            if (r1 == 0) goto Lc8
            r0.consume()     // Catch: java.util.concurrent.CancellationException -> Ld5
        Lc8:
            int r12 = r12 + 1
            goto Lb7
        Lcb:
            r10.onStop()     // Catch: java.util.concurrent.CancellationException -> Ld5
            goto Ld2
        Lcf:
            r10.onCancel()     // Catch: java.util.concurrent.CancellationException -> Ld5
        Ld2:
            kotlin.r2 r9 = kotlin.r2.f19517a
            return r9
        Ld5:
            r9 = move-exception
            r10.onCancel()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt.touchSelection(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.foundation.text.TextDragObserver, androidx.compose.ui.input.pointer.PointerEvent, kotlin.coroutines.d):java.lang.Object");
    }

    @l
    public static final Modifier updateSelectionTouchMode(@l Modifier modifier, @l v3.l<? super Boolean, r2> lVar) {
        return SuspendingPointerInputFilterKt.pointerInput(modifier, Integer.valueOf(STATIC_KEY), new SelectionGesturesKt$updateSelectionTouchMode$1(lVar, null));
    }
}
