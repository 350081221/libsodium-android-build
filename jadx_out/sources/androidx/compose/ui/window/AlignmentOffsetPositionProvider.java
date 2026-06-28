package androidx.compose.ui.window;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J2\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0012\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/window/AlignmentOffsetPositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "Landroidx/compose/ui/unit/IntRect;", "anchorBounds", "Landroidx/compose/ui/unit/IntSize;", "windowSize", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "popupContentSize", "Landroidx/compose/ui/unit/IntOffset;", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "calculatePosition", "Landroidx/compose/ui/Alignment;", "alignment", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", TypedValues.CycleType.S_WAVE_OFFSET, "J", "getOffset-nOcc-ac", "()J", "<init>", "(Landroidx/compose/ui/Alignment;JLkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nPopup.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,89:1\n92#2:90\n86#2:91\n*S KotlinDebug\n*F\n+ 1 Popup.kt\nandroidx/compose/ui/window/AlignmentOffsetPositionProvider\n*L\n73#1:90\n83#1:91\n*E\n"})
/* loaded from: classes.dex */
public final class AlignmentOffsetPositionProvider implements PopupPositionProvider {
    public static final int $stable = 0;

    @l
    private final Alignment alignment;
    private final long offset;

    private AlignmentOffsetPositionProvider(Alignment alignment, long j5) {
        this.alignment = alignment;
        this.offset = j5;
    }

    public /* synthetic */ AlignmentOffsetPositionProvider(Alignment alignment, long j5, w wVar) {
        this(alignment, j5);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo979calculatePositionllwVHH4(@l IntRect intRect, long j5, @l LayoutDirection layoutDirection, long j6) {
        int i5;
        Alignment alignment = this.alignment;
        IntSize.Companion companion = IntSize.Companion;
        long mo3370alignKFBX0sM = alignment.mo3370alignKFBX0sM(companion.m6219getZeroYbymL2g(), intRect.m6198getSizeYbymL2g(), layoutDirection);
        long mo3370alignKFBX0sM2 = this.alignment.mo3370alignKFBX0sM(companion.m6219getZeroYbymL2g(), j6, layoutDirection);
        long IntOffset = IntOffsetKt.IntOffset(-IntOffset.m6172getXimpl(mo3370alignKFBX0sM2), -IntOffset.m6173getYimpl(mo3370alignKFBX0sM2));
        int m6172getXimpl = IntOffset.m6172getXimpl(this.offset);
        if (layoutDirection == LayoutDirection.Ltr) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        long IntOffset2 = IntOffsetKt.IntOffset(m6172getXimpl * i5, IntOffset.m6173getYimpl(this.offset));
        long m6200getTopLeftnOccac = intRect.m6200getTopLeftnOccac();
        long IntOffset3 = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(m6200getTopLeftnOccac) + IntOffset.m6172getXimpl(mo3370alignKFBX0sM), IntOffset.m6173getYimpl(m6200getTopLeftnOccac) + IntOffset.m6173getYimpl(mo3370alignKFBX0sM));
        long IntOffset4 = IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(IntOffset3) + IntOffset.m6172getXimpl(IntOffset), IntOffset.m6173getYimpl(IntOffset3) + IntOffset.m6173getYimpl(IntOffset));
        return IntOffsetKt.IntOffset(IntOffset.m6172getXimpl(IntOffset4) + IntOffset.m6172getXimpl(IntOffset2), IntOffset.m6173getYimpl(IntOffset4) + IntOffset.m6173getYimpl(IntOffset2));
    }

    @l
    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: getOffset-nOcc-ac, reason: not valid java name */
    public final long m6292getOffsetnOccac() {
        return this.offset;
    }
}
