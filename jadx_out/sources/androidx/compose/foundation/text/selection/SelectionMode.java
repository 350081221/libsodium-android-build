package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.w;
import p4.l;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\f*\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014j\u0002\b\u0015j\u0002\b\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionMode;", "", "(Ljava/lang/String;I)V", "compare", "", "position", "Landroidx/compose/ui/geometry/Offset;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "compare-3MmeM6k$foundation_release", "(JLandroidx/compose/ui/geometry/Rect;)I", "isSelected", "", "start", "end", "isSelected-2x9bVx0$foundation_release", "(Landroidx/compose/ui/geometry/Rect;JJ)Z", "containsInclusive", TypedValues.CycleType.S_WAVE_OFFSET, "containsInclusive-Uv8p0NA", "(Landroidx/compose/ui/geometry/Rect;J)Z", "Vertical", "Horizontal", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public enum SelectionMode {
    Vertical { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* renamed from: compare-3MmeM6k$foundation_release */
        public int mo1038compare3MmeM6k$foundation_release(long j5, @l Rect rect) {
            if (SelectionManagerKt.m1031containsInclusiveUv8p0NA(rect, j5)) {
                return 0;
            }
            if (Offset.m3494getYimpl(j5) < rect.getTop()) {
                return -1;
            }
            if (Offset.m3493getXimpl(j5) < rect.getLeft() && Offset.m3494getYimpl(j5) < rect.getBottom()) {
                return -1;
            }
            return 1;
        }
    },
    Horizontal { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* renamed from: compare-3MmeM6k$foundation_release */
        public int mo1038compare3MmeM6k$foundation_release(long j5, @l Rect rect) {
            if (SelectionManagerKt.m1031containsInclusiveUv8p0NA(rect, j5)) {
                return 0;
            }
            if (Offset.m3493getXimpl(j5) < rect.getLeft()) {
                return -1;
            }
            if (Offset.m3494getYimpl(j5) < rect.getTop() && Offset.m3493getXimpl(j5) < rect.getRight()) {
                return -1;
            }
            return 1;
        }
    };

    /* synthetic */ SelectionMode(w wVar) {
        this();
    }

    /* renamed from: containsInclusive-Uv8p0NA, reason: not valid java name */
    private final boolean m1037containsInclusiveUv8p0NA(Rect rect, long j5) {
        float left = rect.getLeft();
        float right = rect.getRight();
        float m3493getXimpl = Offset.m3493getXimpl(j5);
        if (left <= m3493getXimpl && m3493getXimpl <= right) {
            float top = rect.getTop();
            float bottom = rect.getBottom();
            float m3494getYimpl = Offset.m3494getYimpl(j5);
            if (top <= m3494getYimpl && m3494getYimpl <= bottom) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: compare-3MmeM6k$foundation_release, reason: not valid java name */
    public abstract int mo1038compare3MmeM6k$foundation_release(long j5, @l Rect rect);

    /* renamed from: isSelected-2x9bVx0$foundation_release, reason: not valid java name */
    public final boolean m1039isSelected2x9bVx0$foundation_release(@l Rect rect, long j5, long j6) {
        boolean z4;
        boolean z5 = true;
        if (m1037containsInclusiveUv8p0NA(rect, j5) || m1037containsInclusiveUv8p0NA(rect, j6)) {
            return true;
        }
        int mo1038compare3MmeM6k$foundation_release = mo1038compare3MmeM6k$foundation_release(j5, rect);
        int mo1038compare3MmeM6k$foundation_release2 = mo1038compare3MmeM6k$foundation_release(j6, rect);
        if (mo1038compare3MmeM6k$foundation_release > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (mo1038compare3MmeM6k$foundation_release2 <= 0) {
            z5 = false;
        }
        return z4 ^ z5;
    }
}
