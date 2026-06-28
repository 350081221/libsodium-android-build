package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aa\u0010\u0010\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000326\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\f0\u0005H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aW\u0010\u0016\u001a\u0004\u0018\u00010\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u00052\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u0011H\u0082Hø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001e\u0010\u001b\u001a\u00020\u0018*\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001e\u0010\u001f\u001a\u00020\n*\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\"\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"\"\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Lkotlin/v0;", "name", "change", "", "overSlop", "Lkotlin/r2;", "onPointerSlopReached", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "awaitHorizontalPointerSlopOrCancellation", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "getDragDirectionValue", "awaitPointerSlopOrCancellation-pn7EDYM", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILv3/p;Lv3/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerEvent;", "", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "isPointerUp", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "pointerSlop", "Landroidx/compose/ui/unit/Dp;", "mouseSlop", "F", "defaultTouchSlop", "mouseToTouchSlopRatio", "material3_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nDragGestureDetectorCopy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/DragGestureDetectorCopyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,136:1\n74#1,10:137\n84#1,4:156\n88#1,29:167\n116#2,2:147\n33#2,6:149\n118#2:155\n33#2,6:160\n118#2:166\n116#2,2:196\n33#2,6:198\n118#2:204\n116#2,2:205\n33#2,6:207\n118#2:213\n116#2,2:214\n33#2,6:216\n118#2:222\n164#3:223\n154#3:224\n81#4:225\n*S KotlinDebug\n*F\n+ 1 DragGestureDetectorCopy.kt\nandroidx/compose/material3/DragGestureDetectorCopyKt\n*L\n41#1:137,10\n41#1:156,4\n41#1:167,29\n41#1:147,2\n41#1:149,6\n41#1:155\n41#1:160,6\n41#1:166\n83#1:196,2\n83#1:198,6\n83#1:204\n87#1:205,2\n87#1:207,6\n87#1:213\n124#1:214,2\n124#1:216,6\n124#1:222\n126#1:223\n127#1:224\n128#1:225\n*E\n"})
/* loaded from: classes.dex */
public final class DragGestureDetectorCopyKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    static {
        float m6044constructorimpl = Dp.m6044constructorimpl((float) 0.125d);
        mouseSlop = m6044constructorimpl;
        float m6044constructorimpl2 = Dp.m6044constructorimpl(18);
        defaultTouchSlop = m6044constructorimpl2;
        mouseToTouchSlopRatio = m6044constructorimpl / m6044constructorimpl2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x011b -> B:17:0x0167). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x015a -> B:11:0x015d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0181 -> B:17:0x0167). Please report as a decompilation issue!!! */
    @p4.m
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1854awaitHorizontalPointerSlopOrCancellationgDDlDlE(@p4.l androidx.compose.ui.input.pointer.AwaitPointerEventScope r19, long r20, int r22, @p4.l v3.p<? super androidx.compose.ui.input.pointer.PointerInputChange, ? super java.lang.Float, kotlin.r2> r23, @p4.l kotlin.coroutines.d<? super androidx.compose.ui.input.pointer.PointerInputChange> r24) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DragGestureDetectorCopyKt.m1854awaitHorizontalPointerSlopOrCancellationgDDlDlE(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, v3.p, kotlin.coroutines.d):java.lang.Object");
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM, reason: not valid java name */
    private static final Object m1855awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j5, int i5, v3.p<? super PointerInputChange, ? super Float, r2> pVar, v3.l<? super Offset, Float> lVar, kotlin.coroutines.d<? super PointerInputChange> dVar) {
        float f5;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (m1856isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j5)) {
            return null;
        }
        float m1857pointerSlopE8SPZFQ = m1857pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i5);
        k1.g gVar = new k1.g();
        gVar.element = j5;
        float f6 = 0.0f;
        while (true) {
            kotlin.jvm.internal.i0.e(0);
            Object awaitPointerEvent$default = AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope, null, dVar, 1, null);
            kotlin.jvm.internal.i0.e(1);
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i6 = 0;
            while (true) {
                if (i6 < size) {
                    pointerInputChange = changes.get(i6);
                    f5 = f6;
                    if (Boolean.valueOf(PointerId.m4854equalsimpl0(pointerInputChange.m4870getIdJ3iCeTQ(), gVar.element)).booleanValue()) {
                        break;
                    }
                    i6++;
                    f6 = f5;
                } else {
                    f5 = f6;
                    pointerInputChange = null;
                    break;
                }
            }
            kotlin.jvm.internal.l0.m(pointerInputChange);
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size2) {
                        pointerInputChange2 = changes2.get(i7);
                        if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                            break;
                        }
                        i7++;
                    } else {
                        pointerInputChange2 = null;
                        break;
                    }
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                gVar.element = pointerInputChange4.m4870getIdJ3iCeTQ();
            } else {
                float floatValue = f5 + (lVar.invoke(Offset.m3482boximpl(pointerInputChange3.m4872getPositionF1C5BW0())).floatValue() - lVar.invoke(Offset.m3482boximpl(pointerInputChange3.m4873getPreviousPositionF1C5BW0())).floatValue());
                if (Math.abs(floatValue) < m1857pointerSlopE8SPZFQ) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    kotlin.jvm.internal.i0.e(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, dVar);
                    kotlin.jvm.internal.i0.e(1);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                    f5 = floatValue;
                } else {
                    pVar.invoke(pointerInputChange3, Float.valueOf(floatValue - (Math.signum(floatValue) * m1857pointerSlopE8SPZFQ)));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    f5 = 0.0f;
                    f6 = f5;
                }
            }
            f6 = f5;
        }
    }

    /* renamed from: isPointerUp-DmW0f2w, reason: not valid java name */
    private static final boolean m1856isPointerUpDmW0f2w(PointerEvent pointerEvent, long j5) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                pointerInputChange = changes.get(i5);
                if (PointerId.m4854equalsimpl0(pointerInputChange.m4870getIdJ3iCeTQ(), j5)) {
                    break;
                }
                i5++;
            } else {
                pointerInputChange = null;
                break;
            }
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z4 = true;
        }
        return true ^ z4;
    }

    /* renamed from: pointerSlop-E8SPZFQ, reason: not valid java name */
    public static final float m1857pointerSlopE8SPZFQ(@p4.l ViewConfiguration viewConfiguration, int i5) {
        if (PointerType.m4944equalsimpl0(i5, PointerType.Companion.m4949getMouseT8wyACA())) {
            return viewConfiguration.getTouchSlop() * mouseToTouchSlopRatio;
        }
        return viewConfiguration.getTouchSlop();
    }
}
