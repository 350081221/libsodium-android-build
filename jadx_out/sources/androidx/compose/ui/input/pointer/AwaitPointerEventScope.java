package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.coroutines.d;
import kotlin.coroutines.j;
import kotlin.i0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006JI\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010JG\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0096@¢\u0006\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u00128&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00168VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006 À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/input/pointer/PointerEvent;", "awaitPointerEvent", "(Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "withTimeoutOrNull", "(JLv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "withTimeout", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "getCurrentEvent", "()Landroidx/compose/ui/input/pointer/PointerEvent;", "currentEvent", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "ui_release"}, k = 1, mv = {1, 8, 0})
@j
/* loaded from: classes.dex */
public interface AwaitPointerEventScope extends Density {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m4785getExtendedTouchPaddingNHjbRc(@l AwaitPointerEventScope awaitPointerEventScope) {
            return AwaitPointerEventScope.super.mo4783getExtendedTouchPaddingNHjbRc();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4786roundToPxR2X_6o(@l AwaitPointerEventScope awaitPointerEventScope, long j5) {
            return AwaitPointerEventScope.super.mo297roundToPxR2X_6o(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4787roundToPx0680j_4(@l AwaitPointerEventScope awaitPointerEventScope, float f5) {
            return AwaitPointerEventScope.super.mo298roundToPx0680j_4(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4788toDpGaN1DYA(@l AwaitPointerEventScope awaitPointerEventScope, long j5) {
            return AwaitPointerEventScope.super.mo299toDpGaN1DYA(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4789toDpu2uoSUM(@l AwaitPointerEventScope awaitPointerEventScope, float f5) {
            return AwaitPointerEventScope.super.mo300toDpu2uoSUM(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4791toDpSizekrfVVM(@l AwaitPointerEventScope awaitPointerEventScope, long j5) {
            return AwaitPointerEventScope.super.mo302toDpSizekrfVVM(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4792toPxR2X_6o(@l AwaitPointerEventScope awaitPointerEventScope, long j5) {
            return AwaitPointerEventScope.super.mo303toPxR2X_6o(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4793toPx0680j_4(@l AwaitPointerEventScope awaitPointerEventScope, float f5) {
            return AwaitPointerEventScope.super.mo304toPx0680j_4(f5);
        }

        @Stable
        @l
        @Deprecated
        public static Rect toRect(@l AwaitPointerEventScope awaitPointerEventScope, @l DpRect dpRect) {
            return AwaitPointerEventScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4794toSizeXkaWNTQ(@l AwaitPointerEventScope awaitPointerEventScope, long j5) {
            return AwaitPointerEventScope.super.mo305toSizeXkaWNTQ(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4795toSp0xMU5do(@l AwaitPointerEventScope awaitPointerEventScope, float f5) {
            return AwaitPointerEventScope.super.mo306toSp0xMU5do(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4796toSpkPz2Gy4(@l AwaitPointerEventScope awaitPointerEventScope, float f5) {
            return AwaitPointerEventScope.super.mo307toSpkPz2Gy4(f5);
        }

        @Deprecated
        @m
        public static <T> Object withTimeout(@l AwaitPointerEventScope awaitPointerEventScope, long j5, @l p<? super AwaitPointerEventScope, ? super d<? super T>, ? extends Object> pVar, @l d<? super T> dVar) {
            return AwaitPointerEventScope.super.withTimeout(j5, pVar, dVar);
        }

        @Deprecated
        @m
        public static <T> Object withTimeoutOrNull(@l AwaitPointerEventScope awaitPointerEventScope, long j5, @l p<? super AwaitPointerEventScope, ? super d<? super T>, ? extends Object> pVar, @l d<? super T> dVar) {
            return AwaitPointerEventScope.super.withTimeoutOrNull(j5, pVar, dVar);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4790toDpu2uoSUM(@l AwaitPointerEventScope awaitPointerEventScope, int i5) {
            return AwaitPointerEventScope.super.mo301toDpu2uoSUM(i5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4797toSpkPz2Gy4(@l AwaitPointerEventScope awaitPointerEventScope, int i5) {
            return AwaitPointerEventScope.super.mo308toSpkPz2Gy4(i5);
        }
    }

    static /* synthetic */ Object awaitPointerEvent$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, d dVar, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 1) != 0) {
                pointerEventPass = PointerEventPass.Main;
            }
            return awaitPointerEventScope.awaitPointerEvent(pointerEventPass, dVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
    }

    static /* synthetic */ <T> Object withTimeout$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j5, p<? super AwaitPointerEventScope, ? super d<? super T>, ? extends Object> pVar, d<? super T> dVar) {
        return pVar.invoke(awaitPointerEventScope, dVar);
    }

    static /* synthetic */ <T> Object withTimeoutOrNull$suspendImpl(AwaitPointerEventScope awaitPointerEventScope, long j5, p<? super AwaitPointerEventScope, ? super d<? super T>, ? extends Object> pVar, d<? super T> dVar) {
        return pVar.invoke(awaitPointerEventScope, dVar);
    }

    @m
    Object awaitPointerEvent(@l PointerEventPass pointerEventPass, @l d<? super PointerEvent> dVar);

    @l
    PointerEvent getCurrentEvent();

    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    default long mo4783getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m3571getZeroNHjbRc();
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    long mo4784getSizeYbymL2g();

    @l
    ViewConfiguration getViewConfiguration();

    @m
    default <T> Object withTimeout(long j5, @l p<? super AwaitPointerEventScope, ? super d<? super T>, ? extends Object> pVar, @l d<? super T> dVar) {
        return withTimeout$suspendImpl(this, j5, pVar, dVar);
    }

    @m
    default <T> Object withTimeoutOrNull(long j5, @l p<? super AwaitPointerEventScope, ? super d<? super T>, ? extends Object> pVar, @l d<? super T> dVar) {
        return withTimeoutOrNull$suspendImpl(this, j5, pVar, dVar);
    }
}
