package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.umeng.analytics.pro.d;
import java.util.List;
import kotlin.collections.p;
import kotlin.collections.v;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import p4.l;
import v3.q;

@i0(d1 = {"\u0000D\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\u001a.\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000\u001a(\u0010\b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0000\u001a(\u0010\u000b\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003H\u0000\u001a\u0014\u0010\f\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0000H\u0000\u001aD\u0010\u0017\u001a\u00020\u0011*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\rj\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001aL\u0010\u001b\u001a\u00020\u0011*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\rj\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aX\u0010 \u001a\u00020\u0011*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\rj\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u0012\u0010\u001d\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u001c\"\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001aR\u0010 \u001a\u00020\u0011*\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\rj\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000f0!2\b\b\u0002\u0010\u0014\u001a\u00020\u0010H\u0000ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\"*<\b\u0000\u0010#\"\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\r2\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"", "id", "durationMillis", "", "x", "y", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "down", "moveTo", "dx", "dy", "moveBy", d.R, "Lkotlin/Function3;", "Landroidx/compose/ui/input/pointer/PointerEvent;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/r2;", "Landroidx/compose/ui/input/pointer/PointerInputHandler;", "pointerEvent", "size", "invokeOverAllPasses-H0pRuoY", "(Lv3/q;Landroidx/compose/ui/input/pointer/PointerEvent;J)V", "invokeOverAllPasses", "pointerEventPass", "invokeOverPass-hUlJWOE", "(Lv3/q;Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "invokeOverPass", "", "pointerEventPasses", "invokeOverPasses-hUlJWOE", "(Lv3/q;Landroidx/compose/ui/input/pointer/PointerEvent;[Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "invokeOverPasses", "", "(Lv3/q;Landroidx/compose/ui/input/pointer/PointerEvent;Ljava/util/List;J)V", "PointerInputHandler", "ui_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nPointerInputTestUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,148:1\n1#2:149\n33#3,6:150\n*S KotlinDebug\n*F\n+ 1 PointerInputTestUtil.kt\nandroidx/compose/ui/input/pointer/PointerInputTestUtilKt\n*L\n144#1:150,6\n*E\n"})
/* loaded from: classes.dex */
public final class PointerInputTestUtilKt {
    @l
    public static final PointerInputChange down(long j5, long j6, float f5, float f6) {
        return new PointerInputChange(PointerId.m4852constructorimpl(j5), j6, OffsetKt.Offset(f5, f6), true, 1.0f, j6, OffsetKt.Offset(f5, f6), false, false, 0, 0L, 1536, (w) null);
    }

    public static /* synthetic */ PointerInputChange down$default(long j5, long j6, float f5, float f6, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j6 = 0;
        }
        return down(j5, j6, (i5 & 4) != 0 ? 0.0f : f5, (i5 & 8) != 0 ? 0.0f : f6);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY, reason: not valid java name */
    public static final void m4923invokeOverAllPassesH0pRuoY(@l q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, r2> qVar, @l PointerEvent pointerEvent, long j5) {
        List L;
        L = kotlin.collections.w.L(PointerEventPass.Initial, PointerEventPass.Main, PointerEventPass.Final);
        m4927invokeOverPasseshUlJWOE(qVar, pointerEvent, (List<? extends PointerEventPass>) L, j5);
    }

    /* renamed from: invokeOverAllPasses-H0pRuoY$default, reason: not valid java name */
    public static /* synthetic */ void m4924invokeOverAllPassesH0pRuoY$default(q qVar, PointerEvent pointerEvent, long j5, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j5 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m4923invokeOverAllPassesH0pRuoY(qVar, pointerEvent, j5);
    }

    /* renamed from: invokeOverPass-hUlJWOE, reason: not valid java name */
    public static final void m4925invokeOverPasshUlJWOE(@l q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, r2> qVar, @l PointerEvent pointerEvent, @l PointerEventPass pointerEventPass, long j5) {
        List k5;
        k5 = v.k(pointerEventPass);
        m4927invokeOverPasseshUlJWOE(qVar, pointerEvent, (List<? extends PointerEventPass>) k5, j5);
    }

    /* renamed from: invokeOverPass-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m4926invokeOverPasshUlJWOE$default(q qVar, PointerEvent pointerEvent, PointerEventPass pointerEventPass, long j5, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            j5 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m4925invokeOverPasshUlJWOE(qVar, pointerEvent, pointerEventPass, j5);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m4928invokeOverPasseshUlJWOE(@l q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, r2> qVar, @l PointerEvent pointerEvent, @l PointerEventPass[] pointerEventPassArr, long j5) {
        List Jy;
        Jy = p.Jy(pointerEventPassArr);
        m4927invokeOverPasseshUlJWOE(qVar, pointerEvent, (List<? extends PointerEventPass>) Jy, j5);
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m4930invokeOverPasseshUlJWOE$default(q qVar, PointerEvent pointerEvent, PointerEventPass[] pointerEventPassArr, long j5, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            j5 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m4928invokeOverPasseshUlJWOE((q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, r2>) qVar, pointerEvent, pointerEventPassArr, j5);
    }

    @l
    public static final PointerInputChange moveBy(@l PointerInputChange pointerInputChange, long j5, float f5, float f6) {
        long m4870getIdJ3iCeTQ = pointerInputChange.m4870getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(m4870getIdJ3iCeTQ, pointerInputChange.getUptimeMillis() + j5, OffsetKt.Offset(Offset.m3493getXimpl(pointerInputChange.m4872getPositionF1C5BW0()) + f5, Offset.m3494getYimpl(pointerInputChange.m4872getPositionF1C5BW0()) + f6), true, 1.0f, uptimeMillis, pointerInputChange.m4872getPositionF1C5BW0(), pressed, false, 0, 0L, 1536, (w) null);
    }

    public static /* synthetic */ PointerInputChange moveBy$default(PointerInputChange pointerInputChange, long j5, float f5, float f6, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            f6 = 0.0f;
        }
        return moveBy(pointerInputChange, j5, f5, f6);
    }

    @l
    public static final PointerInputChange moveTo(@l PointerInputChange pointerInputChange, long j5, float f5, float f6) {
        long m4870getIdJ3iCeTQ = pointerInputChange.m4870getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(m4870getIdJ3iCeTQ, j5, OffsetKt.Offset(f5, f6), true, 1.0f, uptimeMillis, pointerInputChange.m4872getPositionF1C5BW0(), pressed, false, 0, 0L, 1536, (w) null);
    }

    public static /* synthetic */ PointerInputChange moveTo$default(PointerInputChange pointerInputChange, long j5, float f5, float f6, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            f6 = 0.0f;
        }
        return moveTo(pointerInputChange, j5, f5, f6);
    }

    @l
    public static final PointerInputChange up(@l PointerInputChange pointerInputChange, long j5) {
        long m4870getIdJ3iCeTQ = pointerInputChange.m4870getIdJ3iCeTQ();
        long uptimeMillis = pointerInputChange.getUptimeMillis();
        boolean pressed = pointerInputChange.getPressed();
        return new PointerInputChange(m4870getIdJ3iCeTQ, j5, pointerInputChange.m4872getPositionF1C5BW0(), false, 1.0f, uptimeMillis, pointerInputChange.m4872getPositionF1C5BW0(), pressed, false, 0, 0L, 1536, (w) null);
    }

    /* renamed from: invokeOverPasses-hUlJWOE, reason: not valid java name */
    public static final void m4927invokeOverPasseshUlJWOE(@l q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, r2> qVar, @l PointerEvent pointerEvent, @l List<? extends PointerEventPass> list, long j5) {
        if (!pointerEvent.getChanges().isEmpty()) {
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    qVar.invoke(pointerEvent, list.get(i5), IntSize.m6206boximpl(j5));
                }
                return;
            }
            throw new IllegalArgumentException("invokeOverPasses called with no passes".toString());
        }
        throw new IllegalArgumentException("invokeOverPasses called with no changes".toString());
    }

    /* renamed from: invokeOverPasses-hUlJWOE$default, reason: not valid java name */
    public static /* synthetic */ void m4929invokeOverPasseshUlJWOE$default(q qVar, PointerEvent pointerEvent, List list, long j5, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            j5 = IntSizeKt.IntSize(Integer.MAX_VALUE, Integer.MAX_VALUE);
        }
        m4927invokeOverPasseshUlJWOE((q<? super PointerEvent, ? super PointerEventPass, ? super IntSize, r2>) qVar, pointerEvent, (List<? extends PointerEventPass>) list, j5);
    }
}
