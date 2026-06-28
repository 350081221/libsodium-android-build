package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlinx.coroutines.t0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a,\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\n\u001a\u0004\u0018\u00010\b*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\n\u0010\u000b\u001a\u0014\u0010\f\u001a\u00020\u0004*\u00020\u0007H\u0082@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;", "onTap", "onDoubleTap", "Lkotlin/r2;", "detectTapAndDoubleTap", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;Landroidx/compose/foundation/text2/input/internal/selection/TapOnPosition;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "firstUp", "awaitSecondDown", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerInputChange;Lkotlin/coroutines/d;)Ljava/lang/Object;", "consumeUntilUp", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/d;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nTapAndDoubleTapGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapAndDoubleTapGesture.kt\nandroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,116:1\n33#2,6:117\n101#2,2:123\n33#2,6:125\n103#2:131\n*S KotlinDebug\n*F\n+ 1 TapAndDoubleTapGesture.kt\nandroidx/compose/foundation/text2/input/internal/selection/TapAndDoubleTapGestureKt\n*L\n109#1:117,6\n110#1:123,2\n110#1:125,6\n110#1:131\n*E\n"})
/* loaded from: classes.dex */
public final class TapAndDoubleTapGestureKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitSecondDown(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, d<? super PointerInputChange> dVar) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new TapAndDoubleTapGestureKt$awaitSecondDown$2(pointerInputChange, null), dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[LOOP:0: B:11:0x0050->B:12:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[EDGE_INSN: B:28:0x007a->B:21:0x007a BREAK  A[LOOP:1: B:15:0x0067->B:18:0x0077], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0041 -> B:10:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, kotlin.coroutines.d<? super kotlin.r2> r9) {
        /*
            boolean r0 = r9 instanceof androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$consumeUntilUp$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$consumeUntilUp$1 r0 = (androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$consumeUntilUp$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$consumeUntilUp$1 r0 = new androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt$consumeUntilUp$1
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
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            kotlin.e1.n(r9)
        L38:
            r0.L$0 = r8
            r0.label = r3
            r9 = 0
            java.lang.Object r9 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            java.util.List r2 = r9.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            r7.consume()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.util.List r9 = r9.getChanges()
            int r2 = r9.size()
            r4 = r5
        L67:
            if (r4 >= r2) goto L7a
            java.lang.Object r6 = r9.get(r4)
            androidx.compose.ui.input.pointer.PointerInputChange r6 = (androidx.compose.ui.input.pointer.PointerInputChange) r6
            boolean r6 = r6.getPressed()
            if (r6 == 0) goto L77
            r5 = r3
            goto L7a
        L77:
            int r4 = r4 + 1
            goto L67
        L7a:
            if (r5 != 0) goto L38
            kotlin.r2 r8 = kotlin.r2.f19517a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.TapAndDoubleTapGestureKt.consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.d):java.lang.Object");
    }

    @m
    public static final Object detectTapAndDoubleTap(@l PointerInputScope pointerInputScope, @m TapOnPosition tapOnPosition, @m TapOnPosition tapOnPosition2, @l d<? super r2> dVar) {
        Object l5;
        Object g5 = t0.g(new TapAndDoubleTapGestureKt$detectTapAndDoubleTap$2(pointerInputScope, tapOnPosition, tapOnPosition2, null), dVar);
        l5 = kotlin.coroutines.intrinsics.d.l();
        return g5 == l5 ? g5 : r2.f19517a;
    }

    public static /* synthetic */ Object detectTapAndDoubleTap$default(PointerInputScope pointerInputScope, TapOnPosition tapOnPosition, TapOnPosition tapOnPosition2, d dVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            tapOnPosition = null;
        }
        if ((i5 & 2) != 0) {
            tapOnPosition2 = null;
        }
        return detectTapAndDoubleTap(pointerInputScope, tapOnPosition, tapOnPosition2, dVar);
    }
}
