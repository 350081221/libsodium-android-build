package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.i0;
import kotlin.j0;
import kotlin.jvm.internal.r1;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J2\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/text/selection/HandlePositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "handleReferencePoint", "Landroidx/compose/foundation/text/selection/HandleReferencePoint;", "positionProvider", "Landroidx/compose/foundation/text/selection/OffsetProvider;", "(Landroidx/compose/foundation/text/selection/HandleReferencePoint;Landroidx/compose/foundation/text/selection/OffsetProvider;)V", "prevPosition", "Landroidx/compose/ui/geometry/Offset;", "J", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidSelectionHandles.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/HandlePositionProvider\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,327:1\n265#2:328\n179#3:329\n*S KotlinDebug\n*F\n+ 1 AndroidSelectionHandles.android.kt\nandroidx/compose/foundation/text/selection/HandlePositionProvider\n*L\n276#1:328\n287#1:329\n*E\n"})
/* loaded from: classes.dex */
public final class HandlePositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;

    @l
    private final HandleReferencePoint handleReferencePoint;

    @l
    private final OffsetProvider positionProvider;
    private long prevPosition = Offset.Companion.m3509getZeroF1C5BW0();

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HandleReferencePoint.values().length];
            try {
                iArr[HandleReferencePoint.TopLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HandleReferencePoint.TopMiddle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HandleReferencePoint.TopRight.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HandlePositionProvider(@l HandleReferencePoint handleReferencePoint, @l OffsetProvider offsetProvider) {
        this.handleReferencePoint = handleReferencePoint;
        this.positionProvider = offsetProvider;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public long mo979calculatePositionllwVHH4(@l IntRect intRect, long j5, @l LayoutDirection layoutDirection, long j6) {
        int i5;
        int L0;
        int L02;
        long mo827provideF1C5BW0 = this.positionProvider.mo827provideF1C5BW0();
        if (!OffsetKt.m3512isSpecifiedk4lQ0M(mo827provideF1C5BW0)) {
            mo827provideF1C5BW0 = this.prevPosition;
        }
        this.prevPosition = mo827provideF1C5BW0;
        int i6 = WhenMappings.$EnumSwitchMapping$0[this.handleReferencePoint.ordinal()];
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 == 3) {
                    i5 = IntSize.m6214getWidthimpl(j6);
                } else {
                    throw new j0();
                }
            } else {
                i5 = IntSize.m6214getWidthimpl(j6) / 2;
            }
        } else {
            i5 = 0;
        }
        L0 = kotlin.math.d.L0(Offset.m3493getXimpl(mo827provideF1C5BW0));
        L02 = kotlin.math.d.L0(Offset.m3494getYimpl(mo827provideF1C5BW0));
        long IntOffset = IntOffsetKt.IntOffset(L0, L02);
        return IntOffsetKt.IntOffset((intRect.getLeft() + IntOffset.m6172getXimpl(IntOffset)) - i5, intRect.getTop() + IntOffset.m6173getYimpl(IntOffset));
    }
}
