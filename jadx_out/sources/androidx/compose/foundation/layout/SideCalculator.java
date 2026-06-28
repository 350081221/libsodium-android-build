package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.i0;
import kotlin.ranges.u;
import p4.l;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\bc\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u001a\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH&ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH&J\u0018\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0003H&ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u001aÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator;", "", "adjustInsets", "Landroid/graphics/Insets;", "oldInsets", "newValue", "", "consumedOffsets", "Landroidx/compose/ui/geometry/Offset;", "available", "consumedOffsets-MK-Hz9U", "(J)J", "consumedVelocity", "Landroidx/compose/ui/unit/Velocity;", "remaining", "", "consumedVelocity-QWom1Mo", "(JF)J", "hideMotion", "x", "y", "motionOf", "showMotion", "valueOf", "insets", "Companion", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RequiresApi(30)
/* loaded from: classes.dex */
interface SideCalculator {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0004\u0004\u0007\n\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/layout/SideCalculator$Companion;", "", "()V", "BottomSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator$Companion$BottomSideCalculator$1;", "LeftSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator$Companion$LeftSideCalculator$1;", "RightSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$RightSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator$Companion$RightSideCalculator$1;", "TopSideCalculator", "androidx/compose/foundation/layout/SideCalculator$Companion$TopSideCalculator$1", "Landroidx/compose/foundation/layout/SideCalculator$Companion$TopSideCalculator$1;", "chooseCalculator", "Landroidx/compose/foundation/layout/SideCalculator;", "side", "Landroidx/compose/foundation/layout/WindowInsetsSides;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "chooseCalculator-ni1skBw", "(ILandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/foundation/layout/SideCalculator;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @l
        private static final SideCalculator$Companion$LeftSideCalculator$1 LeftSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            @l
            public Insets adjustInsets(@l Insets insets, int i5) {
                int i6;
                int i7;
                int i8;
                Insets of;
                i6 = insets.top;
                i7 = insets.right;
                i8 = insets.bottom;
                of = Insets.of(i5, i6, i7, i8);
                return of;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo583consumedOffsetsMKHz9U(long j5) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(Offset.m3493getXimpl(j5), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo584consumedVelocityQWom1Mo(long j5, float f5) {
                return VelocityKt.Velocity(Velocity.m6279getXimpl(j5) - f5, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f5, float f6) {
                return f5;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(@l Insets insets) {
                int i5;
                i5 = insets.left;
                return i5;
            }
        };

        @l
        private static final SideCalculator$Companion$TopSideCalculator$1 TopSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            @l
            public Insets adjustInsets(@l Insets insets, int i5) {
                int i6;
                int i7;
                int i8;
                Insets of;
                i6 = insets.left;
                i7 = insets.right;
                i8 = insets.bottom;
                of = Insets.of(i6, i5, i7, i8);
                return of;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo583consumedOffsetsMKHz9U(long j5) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, Offset.m3494getYimpl(j5));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo584consumedVelocityQWom1Mo(long j5, float f5) {
                return VelocityKt.Velocity(0.0f, Velocity.m6280getYimpl(j5) - f5);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f5, float f6) {
                return f6;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(@l Insets insets) {
                int i5;
                i5 = insets.top;
                return i5;
            }
        };

        @l
        private static final SideCalculator$Companion$RightSideCalculator$1 RightSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            @l
            public Insets adjustInsets(@l Insets insets, int i5) {
                int i6;
                int i7;
                int i8;
                Insets of;
                i6 = insets.left;
                i7 = insets.top;
                i8 = insets.bottom;
                of = Insets.of(i6, i7, i5, i8);
                return of;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo583consumedOffsetsMKHz9U(long j5) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(Offset.m3493getXimpl(j5), 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo584consumedVelocityQWom1Mo(long j5, float f5) {
                return VelocityKt.Velocity(Velocity.m6279getXimpl(j5) + f5, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f5, float f6) {
                return -f5;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(@l Insets insets) {
                int i5;
                i5 = insets.right;
                return i5;
            }
        };

        @l
        private static final SideCalculator$Companion$BottomSideCalculator$1 BottomSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            @l
            public Insets adjustInsets(@l Insets insets, int i5) {
                int i6;
                int i7;
                int i8;
                Insets of;
                i6 = insets.left;
                i7 = insets.top;
                i8 = insets.right;
                of = Insets.of(i6, i7, i8, i5);
                return of;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo583consumedOffsetsMKHz9U(long j5) {
                return androidx.compose.ui.geometry.OffsetKt.Offset(0.0f, Offset.m3494getYimpl(j5));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo584consumedVelocityQWom1Mo(long j5, float f5) {
                return VelocityKt.Velocity(0.0f, Velocity.m6280getYimpl(j5) + f5);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f5, float f6) {
                return -f6;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(@l Insets insets) {
                int i5;
                i5 = insets.bottom;
                return i5;
            }
        };

        private Companion() {
        }

        @l
        /* renamed from: chooseCalculator-ni1skBw, reason: not valid java name */
        public final SideCalculator m585chooseCalculatorni1skBw(int i5, @l LayoutDirection layoutDirection) {
            WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
            if (WindowInsetsSides.m636equalsimpl0(i5, companion.m650getLeftJoeWqyM())) {
                return LeftSideCalculator;
            }
            if (WindowInsetsSides.m636equalsimpl0(i5, companion.m653getTopJoeWqyM())) {
                return TopSideCalculator;
            }
            if (WindowInsetsSides.m636equalsimpl0(i5, companion.m651getRightJoeWqyM())) {
                return RightSideCalculator;
            }
            if (WindowInsetsSides.m636equalsimpl0(i5, companion.m647getBottomJoeWqyM())) {
                return BottomSideCalculator;
            }
            if (WindowInsetsSides.m636equalsimpl0(i5, companion.m652getStartJoeWqyM())) {
                if (layoutDirection == LayoutDirection.Ltr) {
                    return LeftSideCalculator;
                }
                return RightSideCalculator;
            }
            if (WindowInsetsSides.m636equalsimpl0(i5, companion.m648getEndJoeWqyM())) {
                if (layoutDirection == LayoutDirection.Ltr) {
                    return RightSideCalculator;
                }
                return LeftSideCalculator;
            }
            throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed".toString());
        }
    }

    @l
    Insets adjustInsets(@l Insets insets, int i5);

    /* renamed from: consumedOffsets-MK-Hz9U, reason: not valid java name */
    long mo583consumedOffsetsMKHz9U(long j5);

    /* renamed from: consumedVelocity-QWom1Mo, reason: not valid java name */
    long mo584consumedVelocityQWom1Mo(long j5, float f5);

    default float hideMotion(float f5, float f6) {
        float A;
        A = u.A(motionOf(f5, f6), 0.0f);
        return A;
    }

    float motionOf(float f5, float f6);

    default float showMotion(float f5, float f6) {
        float t5;
        t5 = u.t(motionOf(f5, f6), 0.0f);
        return t5;
    }

    int valueOf(@l Insets insets);
}
