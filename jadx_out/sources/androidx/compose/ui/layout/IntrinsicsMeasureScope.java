package androidx.compose.ui.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.ViewCompat;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010=\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u000200¢\u0006\u0004\b>\u0010?J\u0017\u0010\u0007\u001a\u00020\u0004*\u00020\u0003H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u0004*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u0003*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u0003*\u00020\u000eH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\r\u001a\u00020\u0003*\u00020\u0004H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u0013*\u00020\u0012H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000e*\u00020\u0003H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u000e*\u00020\bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\fJ\r\u0010\u001c\u001a\u00020\u001b*\u00020\u001aH\u0097\u0001J\u0017\u0010\u001e\u001a\u00020\u0012*\u00020\u0013H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0015J\u0017\u0010!\u001a\u00020\b*\u00020\u0003H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\b*\u00020\u000eH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010 J\u001a\u0010!\u001a\u00020\b*\u00020\u0004H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#JE\u0010/\u001a\u00020.2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00040&2\u0017\u0010-\u001a\u0013\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)¢\u0006\u0002\b,H\u0016R\u001a\u00101\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00107\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u000e8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u0010;\u001a\u00020:8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b;\u0010<\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Landroidx/compose/ui/layout/IntrinsicsMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/unit/Dp;", "", "roundToPx-0680j_4", "(F)I", "roundToPx", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp-GaN1DYA", "(J)F", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toDpSize-k-rfVVM", "(J)J", "toDpSize", "toPx-0680j_4", "toPx", "toPx--R2X_6o", "Landroidx/compose/ui/unit/DpRect;", "Landroidx/compose/ui/geometry/Rect;", "toRect", "toSize-XkaWNTQ", "toSize", "toSp-0xMU5do", "(F)J", "toSp", "toSp-kPz2Gy4", "(I)J", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "Lkotlin/u;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "layout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "getDensity", "()F", "density", "getFontScale", "fontScale", "", "isLookingAhead", "()Z", "intrinsicMeasureScope", "<init>", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/unit/LayoutDirection;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/IntrinsicsMeasureScope\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n1#1,390:1\n120#2,5:391\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/IntrinsicsMeasureScope\n*L\n375#1:391,5\n*E\n"})
/* loaded from: classes.dex */
public final class IntrinsicsMeasureScope implements MeasureScope, IntrinsicMeasureScope {
    public static final int $stable = 0;
    private final /* synthetic */ IntrinsicMeasureScope $$delegate_0;

    @l
    private final LayoutDirection layoutDirection;

    public IntrinsicsMeasureScope(@l IntrinsicMeasureScope intrinsicMeasureScope, @l LayoutDirection layoutDirection) {
        this.layoutDirection = layoutDirection;
        this.$$delegate_0 = intrinsicMeasureScope;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.$$delegate_0.getDensity();
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float getFontScale() {
        return this.$$delegate_0.getFontScale();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    @l
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean isLookingAhead() {
        return this.$$delegate_0.isLookingAhead();
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    @l
    public MeasureResult layout(int i5, int i6, @l final Map<AlignmentLine, Integer> map, @l v3.l<? super Placeable.PlacementScope, r2> lVar) {
        final int u4;
        final int u5;
        boolean z4 = false;
        u4 = u.u(i5, 0);
        u5 = u.u(i6, 0);
        if ((u4 & ViewCompat.MEASURED_STATE_MASK) == 0 && ((-16777216) & u5) == 0) {
            z4 = true;
        }
        if (z4) {
            return new MeasureResult() { // from class: androidx.compose.ui.layout.IntrinsicsMeasureScope$layout$1
                @Override // androidx.compose.ui.layout.MeasureResult
                @l
                public Map<AlignmentLine, Integer> getAlignmentLines() {
                    return map;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getHeight() {
                    return u5;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public int getWidth() {
                    return u4;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void placeChildren() {
                }
            };
        }
        throw new IllegalStateException(("Size(" + u4 + " x " + u5 + ") is out of range. Each dimension must be between 0 and 16777215.").toString());
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx--R2X_6o */
    public int mo297roundToPxR2X_6o(long j5) {
        return this.$$delegate_0.mo297roundToPxR2X_6o(j5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: roundToPx-0680j_4 */
    public int mo298roundToPx0680j_4(float f5) {
        return this.$$delegate_0.mo298roundToPx0680j_4(f5);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toDp-GaN1DYA */
    public float mo299toDpGaN1DYA(long j5) {
        return this.$$delegate_0.mo299toDpGaN1DYA(j5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo300toDpu2uoSUM(float f5) {
        return this.$$delegate_0.mo300toDpu2uoSUM(f5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDp-u2uoSUM */
    public float mo301toDpu2uoSUM(int i5) {
        return this.$$delegate_0.mo301toDpu2uoSUM(i5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toDpSize-k-rfVVM */
    public long mo302toDpSizekrfVVM(long j5) {
        return this.$$delegate_0.mo302toDpSizekrfVVM(j5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx--R2X_6o */
    public float mo303toPxR2X_6o(long j5) {
        return this.$$delegate_0.mo303toPxR2X_6o(j5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toPx-0680j_4 */
    public float mo304toPx0680j_4(float f5) {
        return this.$$delegate_0.mo304toPx0680j_4(f5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    @l
    public Rect toRect(@l DpRect dpRect) {
        return this.$$delegate_0.toRect(dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSize-XkaWNTQ */
    public long mo305toSizeXkaWNTQ(long j5) {
        return this.$$delegate_0.mo305toSizeXkaWNTQ(j5);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    @Stable
    /* renamed from: toSp-0xMU5do */
    public long mo306toSp0xMU5do(float f5) {
        return this.$$delegate_0.mo306toSp0xMU5do(f5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo307toSpkPz2Gy4(float f5) {
        return this.$$delegate_0.mo307toSpkPz2Gy4(f5);
    }

    @Override // androidx.compose.ui.unit.Density
    @Stable
    /* renamed from: toSp-kPz2Gy4 */
    public long mo308toSpkPz2Gy4(int i5) {
        return this.$$delegate_0.mo308toSpkPz2Gy4(i5);
    }
}
