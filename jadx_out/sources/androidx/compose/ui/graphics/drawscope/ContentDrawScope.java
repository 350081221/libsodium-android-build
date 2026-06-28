package androidx.compose.ui.graphics.drawscope;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.unit.DpRect;
import kotlin.i0;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "drawContent", "ui-graphics_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface ContentDrawScope extends DrawScope {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m4226drawImageAZ2fEMs(@l ContentDrawScope contentDrawScope, @l ImageBitmap imageBitmap, long j5, long j6, long j7, long j8, @FloatRange(from = 0.0d, to = 1.0d) float f5, @l DrawStyle drawStyle, @m ColorFilter colorFilter, int i5, int i6) {
            ContentDrawScope.super.mo4183drawImageAZ2fEMs(imageBitmap, j5, j6, j7, j8, f5, drawStyle, colorFilter, i5, i6);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m4227getCenterF1C5BW0(@l ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo4276getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m4228getSizeNHjbRc(@l ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo4277getSizeNHjbRc();
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4229roundToPxR2X_6o(@l ContentDrawScope contentDrawScope, long j5) {
            return ContentDrawScope.super.mo297roundToPxR2X_6o(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4230roundToPx0680j_4(@l ContentDrawScope contentDrawScope, float f5) {
            return ContentDrawScope.super.mo298roundToPx0680j_4(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4231toDpGaN1DYA(@l ContentDrawScope contentDrawScope, long j5) {
            return ContentDrawScope.super.mo299toDpGaN1DYA(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4232toDpu2uoSUM(@l ContentDrawScope contentDrawScope, float f5) {
            return ContentDrawScope.super.mo300toDpu2uoSUM(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4234toDpSizekrfVVM(@l ContentDrawScope contentDrawScope, long j5) {
            return ContentDrawScope.super.mo302toDpSizekrfVVM(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4235toPxR2X_6o(@l ContentDrawScope contentDrawScope, long j5) {
            return ContentDrawScope.super.mo303toPxR2X_6o(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4236toPx0680j_4(@l ContentDrawScope contentDrawScope, float f5) {
            return ContentDrawScope.super.mo304toPx0680j_4(f5);
        }

        @Stable
        @l
        @Deprecated
        public static Rect toRect(@l ContentDrawScope contentDrawScope, @l DpRect dpRect) {
            return ContentDrawScope.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4237toSizeXkaWNTQ(@l ContentDrawScope contentDrawScope, long j5) {
            return ContentDrawScope.super.mo305toSizeXkaWNTQ(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4238toSp0xMU5do(@l ContentDrawScope contentDrawScope, float f5) {
            return ContentDrawScope.super.mo306toSp0xMU5do(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4239toSpkPz2Gy4(@l ContentDrawScope contentDrawScope, float f5) {
            return ContentDrawScope.super.mo307toSpkPz2Gy4(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4233toDpu2uoSUM(@l ContentDrawScope contentDrawScope, int i5) {
            return ContentDrawScope.super.mo301toDpu2uoSUM(i5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4240toSpkPz2Gy4(@l ContentDrawScope contentDrawScope, int i5) {
            return ContentDrawScope.super.mo308toSpkPz2Gy4(i5);
        }
    }

    void drawContent();
}
