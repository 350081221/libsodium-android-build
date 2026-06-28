package androidx.compose.ui.geometry;

import kotlin.i0;
import p4.l;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, d2 = {"toStringAsFixed", "", "", "digits", "", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GeometryUtilsKt {
    @l
    public static final String toStringAsFixed(float f5, int i5) {
        int max = Math.max(i5, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f6 = f5 * pow;
        int i6 = (int) f6;
        if (f6 - i6 >= 0.5f) {
            i6++;
        }
        float f7 = i6 / pow;
        if (max > 0) {
            return String.valueOf(f7);
        }
        return String.valueOf((int) f7);
    }
}
