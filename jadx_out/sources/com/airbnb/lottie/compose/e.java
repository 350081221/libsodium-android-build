package com.airbnb.lottie.compose;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0001\u001a\"\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0082\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\f"}, d2 = {"lottieSize", "Landroidx/compose/ui/Modifier;", "width", "", "height", "times", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/geometry/Size;", "scale", "Landroidx/compose/ui/layout/ScaleFactor;", "times-UQTWf7w", "(JJ)J", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e {
    @Stable
    @p4.l
    public static final Modifier a(@p4.l Modifier modifier, int i5, int i6) {
        l0.p(modifier, "<this>");
        return modifier.then(new LottieAnimationSizeElement(i5, i6));
    }

    private static final long b(long j5, long j6) {
        return IntSizeKt.IntSize((int) (Size.m3562getWidthimpl(j5) * ScaleFactor.m5068getScaleXimpl(j6)), (int) (Size.m3559getHeightimpl(j5) * ScaleFactor.m5069getScaleYimpl(j6)));
    }
}
