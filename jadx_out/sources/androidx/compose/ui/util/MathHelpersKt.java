package androidx.compose.ui.util;

import kotlin.i0;
import kotlin.math.d;

@i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001e\u0010\u0000\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001\u001a\u001e\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0001¨\u0006\u0007"}, d2 = {"lerp", "", "start", "stop", "fraction", "", "", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MathHelpersKt {
    public static final float lerp(float f5, float f6, float f7) {
        return ((1 - f7) * f5) + (f7 * f6);
    }

    public static final int lerp(int i5, int i6, float f5) {
        int K0;
        K0 = d.K0((i6 - i5) * f5);
        return i5 + K0;
    }

    public static final long lerp(long j5, long j6, float f5) {
        long M0;
        M0 = d.M0((j6 - j5) * f5);
        return j5 + M0;
    }
}
