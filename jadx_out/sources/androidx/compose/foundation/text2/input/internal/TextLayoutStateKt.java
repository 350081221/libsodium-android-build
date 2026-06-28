package androidx.compose.foundation.text2.input.internal;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001e\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u000b\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"coerceIn", "Landroidx/compose/ui/geometry/Offset;", "rect", "Landroidx/compose/ui/geometry/Rect;", "coerceIn-3MmeM6k", "(JLandroidx/compose/ui/geometry/Rect;)J", "fromDecorationToTextLayout", "Landroidx/compose/foundation/text2/input/internal/TextLayoutState;", TypedValues.CycleType.S_WAVE_OFFSET, "fromDecorationToTextLayout-Uv8p0NA", "(Landroidx/compose/foundation/text2/input/internal/TextLayoutState;J)J", "fromTextLayoutToCore", "fromTextLayoutToCore-Uv8p0NA", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text2/input/internal/TextLayoutStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,233:1\n1#2:234\n*E\n"})
/* loaded from: classes.dex */
public final class TextLayoutStateKt {
    /* renamed from: coerceIn-3MmeM6k, reason: not valid java name */
    public static final long m1136coerceIn3MmeM6k(long j5, @l Rect rect) {
        float m3493getXimpl;
        float m3494getYimpl;
        if (Offset.m3493getXimpl(j5) < rect.getLeft()) {
            m3493getXimpl = rect.getLeft();
        } else if (Offset.m3493getXimpl(j5) > rect.getRight()) {
            m3493getXimpl = rect.getRight();
        } else {
            m3493getXimpl = Offset.m3493getXimpl(j5);
        }
        if (Offset.m3494getYimpl(j5) < rect.getTop()) {
            m3494getYimpl = rect.getTop();
        } else if (Offset.m3494getYimpl(j5) > rect.getBottom()) {
            m3494getYimpl = rect.getBottom();
        } else {
            m3494getYimpl = Offset.m3494getYimpl(j5);
        }
        return OffsetKt.Offset(m3493getXimpl, m3494getYimpl);
    }

    /* renamed from: fromDecorationToTextLayout-Uv8p0NA, reason: not valid java name */
    public static final long m1137fromDecorationToTextLayoutUv8p0NA(@l TextLayoutState textLayoutState, long j5) {
        Offset offset;
        long j6;
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            LayoutCoordinates decoratorNodeCoordinates = textLayoutState.getDecoratorNodeCoordinates();
            if (decoratorNodeCoordinates != null) {
                if (textLayoutNodeCoordinates.isAttached() && decoratorNodeCoordinates.isAttached()) {
                    j6 = textLayoutNodeCoordinates.mo5006localPositionOfR5De75A(decoratorNodeCoordinates, j5);
                } else {
                    j6 = j5;
                }
                offset = Offset.m3482boximpl(j6);
            } else {
                offset = null;
            }
            if (offset != null) {
                return offset.m3503unboximpl();
            }
            return j5;
        }
        return j5;
    }

    /* renamed from: fromTextLayoutToCore-Uv8p0NA, reason: not valid java name */
    public static final long m1138fromTextLayoutToCoreUv8p0NA(@l TextLayoutState textLayoutState, long j5) {
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            Offset offset = null;
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                LayoutCoordinates coreNodeCoordinates = textLayoutState.getCoreNodeCoordinates();
                if (coreNodeCoordinates != null) {
                    if (!coreNodeCoordinates.isAttached()) {
                        coreNodeCoordinates = null;
                    }
                    if (coreNodeCoordinates != null) {
                        offset = Offset.m3482boximpl(coreNodeCoordinates.mo5006localPositionOfR5De75A(textLayoutNodeCoordinates, j5));
                    }
                }
                if (offset != null) {
                    return offset.m3503unboximpl();
                }
                return j5;
            }
            return j5;
        }
        return j5;
    }
}
