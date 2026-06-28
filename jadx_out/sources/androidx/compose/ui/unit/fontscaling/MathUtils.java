package androidx.compose.ui.unit.fontscaling;

import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.bi;
import kotlin.i0;
import p4.l;
import t0.b;

@StabilityInferred(parameters = 1)
@i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004J\u001e\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004J\u001e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/unit/fontscaling/MathUtils;", "", "()V", "constrainedMap", "", "rangeMin", "rangeMax", "valueMin", "valueMax", b.f22420d, "lerp", "start", "stop", "amount", "lerpInv", bi.ay, "b", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class MathUtils {
    public static final int $stable = 0;

    @l
    public static final MathUtils INSTANCE = new MathUtils();

    private MathUtils() {
    }

    public final float constrainedMap(float f5, float f6, float f7, float f8, float f9) {
        return lerp(f5, f6, Math.max(0.0f, Math.min(1.0f, lerpInv(f7, f8, f9))));
    }

    public final float lerp(float f5, float f6, float f7) {
        return f5 + ((f6 - f5) * f7);
    }

    public final float lerpInv(float f5, float f6, float f7) {
        if (f5 == f6) {
            return 0.0f;
        }
        return (f7 - f5) / (f6 - f5);
    }
}
