package androidx.compose.ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.math.d;
import p4.l;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J\u0016\u0010\b\u001a\u00020\t*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\b\u001a\u00020\t*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\n*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0010\u001a\u00020\n*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u0015*\u00020\u0016H\u0017ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\u0003*\u00020\nH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0012J\u0016\u0010\u0019\u001a\u00020\u0003*\u00020\rH\u0017ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\f\u0010\u001d\u001a\u00020\u001e*\u00020\u001fH\u0017J\u0016\u0010 \u001a\u00020\u0016*\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0018J\u0019\u0010\"\u001a\u00020\r*\u00020\u0003H\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0019\u0010\"\u001a\u00020\r*\u00020\tH\u0017ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010%R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006&À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/FontScaling;", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-u2uoSUM", "(F)F", "(I)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "(J)F", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-kPz2Gy4", "(F)J", "(I)J", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Immutable
@r1({"SMAP\nDensity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,141:1\n1#2:142\n174#3:143\n174#3:144\n473#3:145\n152#4:146\n*S KotlinDebug\n*F\n+ 1 Density.kt\nandroidx/compose/ui/unit/Density\n*L\n92#1:143\n102#1:144\n125#1:145\n135#1:146\n*E\n"})
/* loaded from: classes.dex */
public interface Density extends FontScaling {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Stable
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m6030roundToPxR2X_6o(@l Density density, long j5) {
            return Density.super.mo297roundToPxR2X_6o(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m6031roundToPx0680j_4(@l Density density, float f5) {
            return Density.super.mo298roundToPx0680j_4(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m6032toDpGaN1DYA(@l Density density, long j5) {
            return Density.super.mo299toDpGaN1DYA(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6034toDpu2uoSUM(@l Density density, int i5) {
            return Density.super.mo301toDpu2uoSUM(i5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m6035toDpSizekrfVVM(@l Density density, long j5) {
            return Density.super.mo302toDpSizekrfVVM(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m6036toPxR2X_6o(@l Density density, long j5) {
            return Density.super.mo303toPxR2X_6o(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m6037toPx0680j_4(@l Density density, float f5) {
            return Density.super.mo304toPx0680j_4(f5);
        }

        @Stable
        @l
        @Deprecated
        public static Rect toRect(@l Density density, @l DpRect dpRect) {
            return Density.super.toRect(dpRect);
        }

        @Stable
        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m6038toSizeXkaWNTQ(@l Density density, long j5) {
            return Density.super.mo305toSizeXkaWNTQ(j5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m6039toSp0xMU5do(@l Density density, float f5) {
            return Density.super.mo306toSp0xMU5do(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6041toSpkPz2Gy4(@l Density density, int i5) {
            return Density.super.mo308toSpkPz2Gy4(i5);
        }

        @Stable
        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m6033toDpu2uoSUM(@l Density density, float f5) {
            return Density.super.mo300toDpu2uoSUM(f5);
        }

        @Stable
        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m6040toSpkPz2Gy4(@l Density density, float f5) {
            return Density.super.mo307toSpkPz2Gy4(f5);
        }
    }

    float getDensity();

    @Stable
    /* renamed from: roundToPx--R2X_6o */
    default int mo297roundToPxR2X_6o(long j5) {
        int L0;
        L0 = d.L0(mo303toPxR2X_6o(j5));
        return L0;
    }

    @Stable
    /* renamed from: roundToPx-0680j_4 */
    default int mo298roundToPx0680j_4(float f5) {
        int L0;
        float mo304toPx0680j_4 = mo304toPx0680j_4(f5);
        if (Float.isInfinite(mo304toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        L0 = d.L0(mo304toPx0680j_4);
        return L0;
    }

    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo301toDpu2uoSUM(int i5) {
        return Dp.m6044constructorimpl(i5 / getDensity());
    }

    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    default long mo302toDpSizekrfVVM(long j5) {
        boolean z4;
        if (j5 != Size.Companion.m3570getUnspecifiedNHjbRc()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return DpKt.m6066DpSizeYgX7TsA(mo300toDpu2uoSUM(Size.m3562getWidthimpl(j5)), mo300toDpu2uoSUM(Size.m3559getHeightimpl(j5)));
        }
        return DpSize.Companion.m6151getUnspecifiedMYxV2XQ();
    }

    @Stable
    /* renamed from: toPx--R2X_6o */
    default float mo303toPxR2X_6o(long j5) {
        if (TextUnitType.m6263equalsimpl0(TextUnit.m6234getTypeUIouoOA(j5), TextUnitType.Companion.m6268getSpUIouoOA())) {
            return mo304toPx0680j_4(mo299toDpGaN1DYA(j5));
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @Stable
    /* renamed from: toPx-0680j_4 */
    default float mo304toPx0680j_4(float f5) {
        return f5 * getDensity();
    }

    @Stable
    @l
    default Rect toRect(@l DpRect dpRect) {
        return new Rect(mo304toPx0680j_4(dpRect.m6127getLeftD9Ej5fM()), mo304toPx0680j_4(dpRect.m6129getTopD9Ej5fM()), mo304toPx0680j_4(dpRect.m6128getRightD9Ej5fM()), mo304toPx0680j_4(dpRect.m6126getBottomD9Ej5fM()));
    }

    @Stable
    /* renamed from: toSize-XkaWNTQ */
    default long mo305toSizeXkaWNTQ(long j5) {
        boolean z4;
        if (j5 != DpSize.Companion.m6151getUnspecifiedMYxV2XQ()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return SizeKt.Size(mo304toPx0680j_4(DpSize.m6142getWidthD9Ej5fM(j5)), mo304toPx0680j_4(DpSize.m6140getHeightD9Ej5fM(j5)));
        }
        return Size.Companion.m3570getUnspecifiedNHjbRc();
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo308toSpkPz2Gy4(int i5) {
        return mo306toSp0xMU5do(mo301toDpu2uoSUM(i5));
    }

    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    default long mo307toSpkPz2Gy4(float f5) {
        return mo306toSp0xMU5do(mo300toDpu2uoSUM(f5));
    }

    @Stable
    /* renamed from: toDp-u2uoSUM */
    default float mo300toDpu2uoSUM(float f5) {
        return Dp.m6044constructorimpl(f5 / getDensity());
    }
}
