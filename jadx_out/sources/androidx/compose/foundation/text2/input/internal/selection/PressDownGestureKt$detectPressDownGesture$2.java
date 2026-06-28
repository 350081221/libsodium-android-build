package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;
import v3.p;

@f(c = "androidx.compose.foundation.text2.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", f = "PressDownGesture.kt", i = {0, 1, 1}, l = {32, 38}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
@i0(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/r2;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nPressDownGesture.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PressDownGesture.kt\nandroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,44:1\n101#2,2:45\n33#2,6:47\n103#2:53\n*S KotlinDebug\n*F\n+ 1 PressDownGesture.kt\nandroidx/compose/foundation/text2/input/internal/selection/PressDownGestureKt$detectPressDownGesture$2\n*L\n39#1:45,2\n39#1:47,6\n39#1:53\n*E\n"})
/* loaded from: classes.dex */
final class PressDownGestureKt$detectPressDownGesture$2 extends k implements p<AwaitPointerEventScope, d<? super r2>, Object> {
    final /* synthetic */ TapOnPosition $onDown;
    final /* synthetic */ a<r2> $onUp;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressDownGestureKt$detectPressDownGesture$2(TapOnPosition tapOnPosition, a<r2> aVar, d<? super PressDownGestureKt$detectPressDownGesture$2> dVar) {
        super(2, dVar);
        this.$onDown = tapOnPosition;
        this.$onUp = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @l
    public final d<r2> create(@m Object obj, @l d<?> dVar) {
        PressDownGestureKt$detectPressDownGesture$2 pressDownGestureKt$detectPressDownGesture$2 = new PressDownGestureKt$detectPressDownGesture$2(this.$onDown, this.$onUp, dVar);
        pressDownGestureKt$detectPressDownGesture$2.L$0 = obj;
        return pressDownGestureKt$detectPressDownGesture$2;
    }

    @Override // v3.p
    @m
    public final Object invoke(@l AwaitPointerEventScope awaitPointerEventScope, @m d<? super r2> dVar) {
        return ((PressDownGestureKt$detectPressDownGesture$2) create(awaitPointerEventScope, dVar)).invokeSuspend(r2.f19517a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d A[EDGE_INSN: B:26:0x009d->B:17:0x009d BREAK  A[LOOP:0: B:7:0x0077->B:14:0x009a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0079  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0068 -> B:6:0x006b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r17) {
        /*
            r16 = this;
            r6 = r16
            java.lang.Object r7 = kotlin.coroutines.intrinsics.b.l()
            int r0 = r6.label
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L32
            if (r0 == r9) goto L27
            if (r0 != r8) goto L1f
            java.lang.Object r0 = r6.L$1
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
            java.lang.Object r1 = r6.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
            kotlin.e1.n(r17)
            r3 = r17
            r2 = r6
            goto L6b
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L27:
            java.lang.Object r0 = r6.L$0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
            kotlin.e1.n(r17)
            r10 = r0
            r0 = r17
            goto L4c
        L32:
            kotlin.e1.n(r17)
            java.lang.Object r0 = r6.L$0
            r10 = r0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r10 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r10
            r1 = 0
            r2 = 0
            r4 = 2
            r5 = 0
            r6.L$0 = r10
            r6.label = r9
            r0 = r10
            r3 = r16
            java.lang.Object r0 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r0, r1, r2, r3, r4, r5)
            if (r0 != r7) goto L4c
            return r7
        L4c:
            androidx.compose.ui.input.pointer.PointerInputChange r0 = (androidx.compose.ui.input.pointer.PointerInputChange) r0
            androidx.compose.foundation.text2.input.internal.selection.TapOnPosition r1 = r6.$onDown
            long r2 = r0.m4872getPositionF1C5BW0()
            r1.mo1152onEventk4lQ0M(r2)
            v3.a<kotlin.r2> r1 = r6.$onUp
            if (r1 == 0) goto La4
            r2 = r6
            r1 = r10
        L5d:
            r2.L$0 = r1
            r2.L$1 = r0
            r2.label = r8
            r3 = 0
            java.lang.Object r3 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r1, r3, r2, r9, r3)
            if (r3 != r7) goto L6b
            return r7
        L6b:
            androidx.compose.ui.input.pointer.PointerEvent r3 = (androidx.compose.ui.input.pointer.PointerEvent) r3
            java.util.List r3 = r3.getChanges()
            int r4 = r3.size()
            r5 = 0
            r10 = r5
        L77:
            if (r10 >= r4) goto L9d
            java.lang.Object r11 = r3.get(r10)
            androidx.compose.ui.input.pointer.PointerInputChange r11 = (androidx.compose.ui.input.pointer.PointerInputChange) r11
            long r12 = r11.m4870getIdJ3iCeTQ()
            long r14 = r0.m4870getIdJ3iCeTQ()
            boolean r12 = androidx.compose.ui.input.pointer.PointerId.m4854equalsimpl0(r12, r14)
            if (r12 == 0) goto L95
            boolean r11 = r11.getPressed()
            if (r11 == 0) goto L95
            r11 = r9
            goto L96
        L95:
            r11 = r5
        L96:
            if (r11 == 0) goto L9a
            r5 = r9
            goto L9d
        L9a:
            int r10 = r10 + 1
            goto L77
        L9d:
            if (r5 != 0) goto L5d
            v3.a<kotlin.r2> r0 = r2.$onUp
            r0.invoke()
        La4:
            kotlin.r2 r0 = kotlin.r2.f19517a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text2.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
