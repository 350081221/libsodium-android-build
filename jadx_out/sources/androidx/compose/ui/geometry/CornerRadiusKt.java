package androidx.compose.ui.geometry;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"CornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "x", "", "y", "(FF)J", "lerp", "start", "stop", "fraction", "lerp-3Ry4LBc", "(JJF)J", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCornerRadius.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,164:1\n25#2,3:165\n*S KotlinDebug\n*F\n+ 1 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n*L\n33#1:165,3\n*E\n"})
/* loaded from: classes.dex */
public final class CornerRadiusKt {
    @Stable
    public static final long CornerRadius(float f5, float f6) {
        return CornerRadius.m3462constructorimpl((Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32));
    }

    public static /* synthetic */ long CornerRadius$default(float f5, float f6, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            f6 = f5;
        }
        return CornerRadius(f5, f6);
    }

    @Stable
    /* renamed from: lerp-3Ry4LBc, reason: not valid java name */
    public static final long m3479lerp3Ry4LBc(long j5, long j6, float f5) {
        return CornerRadius(MathHelpersKt.lerp(CornerRadius.m3468getXimpl(j5), CornerRadius.m3468getXimpl(j6), f5), MathHelpersKt.lerp(CornerRadius.m3469getYimpl(j5), CornerRadius.m3469getYimpl(j6), f5));
    }
}
