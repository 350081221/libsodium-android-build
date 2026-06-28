package androidx.compose.foundation.gestures;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0006\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/PressGestureScope;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/r2;", "awaitRelease", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "tryAwaitRelease", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface PressGestureScope extends Density {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m376roundToPxR2X_6o(@l PressGestureScope pressGestureScope, long j5) {
            return PressGestureScope.super.mo297roundToPxR2X_6o(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m377roundToPx0680j_4(@l PressGestureScope pressGestureScope, float f5) {
            return PressGestureScope.super.mo298roundToPx0680j_4(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m378toDpGaN1DYA(@l PressGestureScope pressGestureScope, long j5) {
            return PressGestureScope.super.mo299toDpGaN1DYA(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m379toDpu2uoSUM(@l PressGestureScope pressGestureScope, float f5) {
            return PressGestureScope.super.mo300toDpu2uoSUM(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m381toDpSizekrfVVM(@l PressGestureScope pressGestureScope, long j5) {
            return PressGestureScope.super.mo302toDpSizekrfVVM(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m382toPxR2X_6o(@l PressGestureScope pressGestureScope, long j5) {
            return PressGestureScope.super.mo303toPxR2X_6o(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m383toPx0680j_4(@l PressGestureScope pressGestureScope, float f5) {
            return PressGestureScope.super.mo304toPx0680j_4(f5);
        }

        @Stable
        @l
        @Deprecated
        public static Rect toRect(@l PressGestureScope pressGestureScope, @l DpRect dpRect) {
            return PressGestureScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m384toSizeXkaWNTQ(@l PressGestureScope pressGestureScope, long j5) {
            return PressGestureScope.super.mo305toSizeXkaWNTQ(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m385toSp0xMU5do(@l PressGestureScope pressGestureScope, float f5) {
            return PressGestureScope.super.mo306toSp0xMU5do(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m386toSpkPz2Gy4(@l PressGestureScope pressGestureScope, float f5) {
            return PressGestureScope.super.mo307toSpkPz2Gy4(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m380toDpu2uoSUM(@l PressGestureScope pressGestureScope, int i5) {
            return PressGestureScope.super.mo301toDpu2uoSUM(i5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m387toSpkPz2Gy4(@l PressGestureScope pressGestureScope, int i5) {
            return PressGestureScope.super.mo308toSpkPz2Gy4(i5);
        }
    }

    @m
    Object awaitRelease(@l d<? super r2> dVar);

    @m
    Object tryAwaitRelease(@l d<? super Boolean> dVar);
}
