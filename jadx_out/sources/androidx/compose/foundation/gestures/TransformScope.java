package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import kotlin.i0;

@i0(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "", "", "zoomChange", "Landroidx/compose/ui/geometry/Offset;", "panChange", "rotationChange", "Lkotlin/r2;", "transformBy-d-4ec7I", "(FJF)V", "transformBy", "foundation_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public interface TransformScope {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    /* renamed from: transformBy-d-4ec7I$default, reason: not valid java name */
    static /* synthetic */ void m410transformByd4ec7I$default(TransformScope transformScope, float f5, long j5, float f6, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 1) != 0) {
                f5 = 1.0f;
            }
            if ((i5 & 2) != 0) {
                j5 = Offset.Companion.m3509getZeroF1C5BW0();
            }
            if ((i5 & 4) != 0) {
                f6 = 0.0f;
            }
            transformScope.mo320transformByd4ec7I(f5, j5, f6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-d-4ec7I");
    }

    /* renamed from: transformBy-d-4ec7I */
    void mo320transformByd4ec7I(float f5, long j5, float f6);
}
