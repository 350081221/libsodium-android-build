package androidx.compose.ui.input.pointer;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.IntSize;
import kotlin.b1;
import kotlin.i0;
import kotlin.k;
import p4.l;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0000\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\b*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\u001d\u0010\r\u001a\u00020\b*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\f\u0010\u000f\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0010\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0007\u001a\f\u0010\u0013\u001a\u00020\u0011*\u00020\u0000H\u0007\u001a\f\u0010\u0014\u001a\u00020\u0011*\u00020\u0000H\u0007\u001a\u001e\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a$\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChange;", "", "changedToDown", "changedToDownIgnoreConsumed", "changedToUp", "changedToUpIgnoreConsumed", "positionChanged", "positionChangedIgnoreConsumed", "Landroidx/compose/ui/geometry/Offset;", "positionChange", "(Landroidx/compose/ui/input/pointer/PointerInputChange;)J", "positionChangeIgnoreConsumed", "ignoreConsumed", "positionChangeInternal", "(Landroidx/compose/ui/input/pointer/PointerInputChange;Z)J", "positionChangeConsumed", "anyChangeConsumed", "Lkotlin/r2;", "consumeDownChange", "consumePositionChange", "consumeAllChanges", "Landroidx/compose/ui/unit/IntSize;", "size", "isOutOfBounds-O0kMr_c", "(Landroidx/compose/ui/input/pointer/PointerInputChange;J)Z", "isOutOfBounds", "Landroidx/compose/ui/geometry/Size;", "extendedTouchPadding", "isOutOfBounds-jwHxaWs", "(Landroidx/compose/ui/input/pointer/PointerInputChange;JJ)Z", "ui_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class PointerEventKt {
    @k(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @b1(expression = "isConsumed", imports = {}))
    public static final boolean anyChangeConsumed(@l PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    public static final boolean changedToDown(@l PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || pointerInputChange.getPreviousPressed() || !pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToDownIgnoreConsumed(@l PointerInputChange pointerInputChange) {
        return !pointerInputChange.getPreviousPressed() && pointerInputChange.getPressed();
    }

    public static final boolean changedToUp(@l PointerInputChange pointerInputChange) {
        return (pointerInputChange.isConsumed() || !pointerInputChange.getPreviousPressed() || pointerInputChange.getPressed()) ? false : true;
    }

    public static final boolean changedToUpIgnoreConsumed(@l PointerInputChange pointerInputChange) {
        return pointerInputChange.getPreviousPressed() && !pointerInputChange.getPressed();
    }

    @k(message = "Use consume() instead", replaceWith = @b1(expression = "consume()", imports = {}))
    public static final void consumeAllChanges(@l PointerInputChange pointerInputChange) {
        pointerInputChange.consume();
    }

    @k(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @b1(expression = "if (pressed != previousPressed) consume()", imports = {}))
    public static final void consumeDownChange(@l PointerInputChange pointerInputChange) {
        if (pointerInputChange.getPressed() != pointerInputChange.getPreviousPressed()) {
            pointerInputChange.consume();
        }
    }

    @k(message = "Partial consumption has been deprecated. Use consume() instead.", replaceWith = @b1(expression = "if (positionChange() != Offset.Zero) consume()", imports = {}))
    public static final void consumePositionChange(@l PointerInputChange pointerInputChange) {
        if (!Offset.m3490equalsimpl0(positionChange(pointerInputChange), Offset.Companion.m3509getZeroF1C5BW0())) {
            pointerInputChange.consume();
        }
    }

    @k(message = "Use isOutOfBounds() that supports minimum touch target", replaceWith = @b1(expression = "this.isOutOfBounds(size, extendedTouchPadding)", imports = {}))
    /* renamed from: isOutOfBounds-O0kMr_c, reason: not valid java name */
    public static final boolean m4816isOutOfBoundsO0kMr_c(@l PointerInputChange pointerInputChange, long j5) {
        long m4872getPositionF1C5BW0 = pointerInputChange.m4872getPositionF1C5BW0();
        float m3493getXimpl = Offset.m3493getXimpl(m4872getPositionF1C5BW0);
        float m3494getYimpl = Offset.m3494getYimpl(m4872getPositionF1C5BW0);
        int m6214getWidthimpl = IntSize.m6214getWidthimpl(j5);
        int m6213getHeightimpl = IntSize.m6213getHeightimpl(j5);
        if (m3493getXimpl >= 0.0f && m3493getXimpl <= m6214getWidthimpl && m3494getYimpl >= 0.0f && m3494getYimpl <= m6213getHeightimpl) {
            return false;
        }
        return true;
    }

    /* renamed from: isOutOfBounds-jwHxaWs, reason: not valid java name */
    public static final boolean m4817isOutOfBoundsjwHxaWs(@l PointerInputChange pointerInputChange, long j5, long j6) {
        if (!PointerType.m4944equalsimpl0(pointerInputChange.m4875getTypeT8wyACA(), PointerType.Companion.m4951getTouchT8wyACA())) {
            return m4816isOutOfBoundsO0kMr_c(pointerInputChange, j5);
        }
        long m4872getPositionF1C5BW0 = pointerInputChange.m4872getPositionF1C5BW0();
        float m3493getXimpl = Offset.m3493getXimpl(m4872getPositionF1C5BW0);
        float m3494getYimpl = Offset.m3494getYimpl(m4872getPositionF1C5BW0);
        float f5 = -Size.m3562getWidthimpl(j6);
        float m6214getWidthimpl = IntSize.m6214getWidthimpl(j5) + Size.m3562getWidthimpl(j6);
        float f6 = -Size.m3559getHeightimpl(j6);
        float m6213getHeightimpl = IntSize.m6213getHeightimpl(j5) + Size.m3559getHeightimpl(j6);
        if (m3493getXimpl >= f5 && m3493getXimpl <= m6214getWidthimpl && m3494getYimpl >= f6 && m3494getYimpl <= m6213getHeightimpl) {
            return false;
        }
        return true;
    }

    public static final long positionChange(@l PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, false);
    }

    @k(message = "Partial consumption has been deprecated. Use isConsumed instead", replaceWith = @b1(expression = "isConsumed", imports = {}))
    public static final boolean positionChangeConsumed(@l PointerInputChange pointerInputChange) {
        return pointerInputChange.isConsumed();
    }

    public static final long positionChangeIgnoreConsumed(@l PointerInputChange pointerInputChange) {
        return positionChangeInternal(pointerInputChange, true);
    }

    private static final long positionChangeInternal(PointerInputChange pointerInputChange, boolean z4) {
        long m3497minusMKHz9U = Offset.m3497minusMKHz9U(pointerInputChange.m4872getPositionF1C5BW0(), pointerInputChange.m4873getPreviousPositionF1C5BW0());
        if (!z4 && pointerInputChange.isConsumed()) {
            return Offset.Companion.m3509getZeroF1C5BW0();
        }
        return m3497minusMKHz9U;
    }

    static /* synthetic */ long positionChangeInternal$default(PointerInputChange pointerInputChange, boolean z4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            z4 = false;
        }
        return positionChangeInternal(pointerInputChange, z4);
    }

    public static final boolean positionChanged(@l PointerInputChange pointerInputChange) {
        return !Offset.m3490equalsimpl0(positionChangeInternal(pointerInputChange, false), Offset.Companion.m3509getZeroF1C5BW0());
    }

    public static final boolean positionChangedIgnoreConsumed(@l PointerInputChange pointerInputChange) {
        return !Offset.m3490equalsimpl0(positionChangeInternal(pointerInputChange, true), Offset.Companion.m3509getZeroF1C5BW0());
    }
}
