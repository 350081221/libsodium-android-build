package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.coroutines.d;
import kotlin.i0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J?\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003¢\u0006\u0002\b\u0007H¦@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000b8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0011\u001a\u00020\u000f8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R*\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "awaitPointerEventScope", "(Lv3/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/compose/ui/unit/IntSize;", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "", "<anonymous parameter 0>", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "getInterceptOutOfBoundsChildEvents$annotations", "()V", "interceptOutOfBoundsChildEvents", "ui_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface PointerInputScope extends Density {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
        public static long m4910getExtendedTouchPaddingNHjbRc(@l PointerInputScope pointerInputScope) {
            return PointerInputScope.super.mo295getExtendedTouchPaddingNHjbRc();
        }

        @Deprecated
        public static boolean getInterceptOutOfBoundsChildEvents(@l PointerInputScope pointerInputScope) {
            return PointerInputScope.super.getInterceptOutOfBoundsChildEvents();
        }

        public static /* synthetic */ void getInterceptOutOfBoundsChildEvents$annotations() {
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4911roundToPxR2X_6o(@l PointerInputScope pointerInputScope, long j5) {
            return PointerInputScope.super.mo297roundToPxR2X_6o(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4912roundToPx0680j_4(@l PointerInputScope pointerInputScope, float f5) {
            return PointerInputScope.super.mo298roundToPx0680j_4(f5);
        }

        @Deprecated
        public static void setInterceptOutOfBoundsChildEvents(@l PointerInputScope pointerInputScope, boolean z4) {
            PointerInputScope.super.setInterceptOutOfBoundsChildEvents(z4);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4913toDpGaN1DYA(@l PointerInputScope pointerInputScope, long j5) {
            return PointerInputScope.super.mo299toDpGaN1DYA(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4914toDpu2uoSUM(@l PointerInputScope pointerInputScope, float f5) {
            return PointerInputScope.super.mo300toDpu2uoSUM(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4916toDpSizekrfVVM(@l PointerInputScope pointerInputScope, long j5) {
            return PointerInputScope.super.mo302toDpSizekrfVVM(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4917toPxR2X_6o(@l PointerInputScope pointerInputScope, long j5) {
            return PointerInputScope.super.mo303toPxR2X_6o(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4918toPx0680j_4(@l PointerInputScope pointerInputScope, float f5) {
            return PointerInputScope.super.mo304toPx0680j_4(f5);
        }

        @Stable
        @l
        @Deprecated
        public static Rect toRect(@l PointerInputScope pointerInputScope, @l DpRect dpRect) {
            return PointerInputScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4919toSizeXkaWNTQ(@l PointerInputScope pointerInputScope, long j5) {
            return PointerInputScope.super.mo305toSizeXkaWNTQ(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4920toSp0xMU5do(@l PointerInputScope pointerInputScope, float f5) {
            return PointerInputScope.super.mo306toSp0xMU5do(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4921toSpkPz2Gy4(@l PointerInputScope pointerInputScope, float f5) {
            return PointerInputScope.super.mo307toSpkPz2Gy4(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4915toDpu2uoSUM(@l PointerInputScope pointerInputScope, int i5) {
            return PointerInputScope.super.mo301toDpu2uoSUM(i5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4922toSpkPz2Gy4(@l PointerInputScope pointerInputScope, int i5) {
            return PointerInputScope.super.mo308toSpkPz2Gy4(i5);
        }
    }

    @m
    <R> Object awaitPointerEventScope(@l p<? super AwaitPointerEventScope, ? super d<? super R>, ? extends Object> pVar, @l d<? super R> dVar);

    /* renamed from: getExtendedTouchPadding-NH-jbRc */
    default long mo295getExtendedTouchPaddingNHjbRc() {
        return Size.Companion.m3571getZeroNHjbRc();
    }

    default boolean getInterceptOutOfBoundsChildEvents() {
        return false;
    }

    /* renamed from: getSize-YbymL2g */
    long mo296getSizeYbymL2g();

    @l
    ViewConfiguration getViewConfiguration();

    default void setInterceptOutOfBoundsChildEvents(boolean z4) {
    }
}
