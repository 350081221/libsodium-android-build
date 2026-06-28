package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import p4.l;

@i0(d1 = {"\u0000l\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\"\u0014\u0010\u0001\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\".\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00000\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\u0011\u001a\u00020\u000e*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0015\u0010\u0011\u001a\u00020\u0013*\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0014\"\u0015\u0010\u0011\u001a\u00020\u0016*\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0017\"\u0015\u0010\u0011\u001a\u00020\u0019*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001a\"\u0015\u0010\u0011\u001a\u00020\u001c*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u001d\"\u0015\u0010\u0011\u001a\u00020\u001f*\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010 \"\u0015\u0010\u0011\u001a\u00020\"*\u00020!8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010#\"\u0015\u0010\u0011\u001a\u00020\u0004*\u00020$8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010%¨\u0006&"}, d2 = {"", "DpVisibilityThreshold", "F", "PxVisibilityThreshold", "Landroidx/compose/ui/geometry/Rect;", "rectVisibilityThreshold", "Landroidx/compose/ui/geometry/Rect;", "", "Landroidx/compose/animation/core/TwoWayConverter;", "visibilityThresholdMap", "Ljava/util/Map;", "getVisibilityThresholdMap", "()Ljava/util/Map;", "Landroidx/compose/ui/unit/IntOffset$Companion;", "Landroidx/compose/ui/unit/IntOffset;", "getVisibilityThreshold", "(Landroidx/compose/ui/unit/IntOffset$Companion;)J", "VisibilityThreshold", "Landroidx/compose/ui/geometry/Offset$Companion;", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/geometry/Offset$Companion;)J", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/j0;)I", "Landroidx/compose/ui/unit/Dp$Companion;", "Landroidx/compose/ui/unit/Dp;", "(Landroidx/compose/ui/unit/Dp$Companion;)F", "Landroidx/compose/ui/unit/DpOffset$Companion;", "Landroidx/compose/ui/unit/DpOffset;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)J", "Landroidx/compose/ui/geometry/Size$Companion;", "Landroidx/compose/ui/geometry/Size;", "(Landroidx/compose/ui/geometry/Size$Companion;)J", "Landroidx/compose/ui/unit/IntSize$Companion;", "Landroidx/compose/ui/unit/IntSize;", "(Landroidx/compose/ui/unit/IntSize$Companion;)J", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/ui/geometry/Rect;", "animation-core_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nVisibilityThresholds.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,115:1\n174#2:116\n*S KotlinDebug\n*F\n+ 1 VisibilityThresholds.kt\nandroidx/compose/animation/core/VisibilityThresholdsKt\n*L\n68#1:116\n*E\n"})
/* loaded from: classes.dex */
public final class VisibilityThresholdsKt {
    private static final float DpVisibilityThreshold = 0.1f;
    private static final float PxVisibilityThreshold = 0.5f;

    @l
    private static final Rect rectVisibilityThreshold;

    @l
    private static final Map<TwoWayConverter<?, ?>, Float> visibilityThresholdMap;

    static {
        Map<TwoWayConverter<?, ?>, Float> W;
        Float valueOf = Float.valueOf(0.5f);
        rectVisibilityThreshold = new Rect(0.5f, 0.5f, 0.5f, 0.5f);
        TwoWayConverter<Integer, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(j0.f19410a);
        Float valueOf2 = Float.valueOf(1.0f);
        TwoWayConverter<Dp, AnimationVector1D> vectorConverter2 = VectorConvertersKt.getVectorConverter(Dp.Companion);
        Float valueOf3 = Float.valueOf(0.1f);
        W = a1.W(q1.a(vectorConverter, valueOf2), q1.a(VectorConvertersKt.getVectorConverter(IntSize.Companion), valueOf2), q1.a(VectorConvertersKt.getVectorConverter(IntOffset.Companion), valueOf2), q1.a(VectorConvertersKt.getVectorConverter(a0.f19382a), Float.valueOf(0.01f)), q1.a(VectorConvertersKt.getVectorConverter(Rect.Companion), valueOf), q1.a(VectorConvertersKt.getVectorConverter(Size.Companion), valueOf), q1.a(VectorConvertersKt.getVectorConverter(Offset.Companion), valueOf), q1.a(vectorConverter2, valueOf3), q1.a(VectorConvertersKt.getVectorConverter(DpOffset.Companion), valueOf3));
        visibilityThresholdMap = W;
    }

    public static final int getVisibilityThreshold(@l j0 j0Var) {
        return 1;
    }

    public static final long getVisibilityThreshold(@l IntOffset.Companion companion) {
        return IntOffsetKt.IntOffset(1, 1);
    }

    @l
    public static final Map<TwoWayConverter<?, ?>, Float> getVisibilityThresholdMap() {
        return visibilityThresholdMap;
    }

    public static final long getVisibilityThreshold(@l Offset.Companion companion) {
        return OffsetKt.Offset(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(@l DpOffset.Companion companion) {
        Dp.Companion companion2 = Dp.Companion;
        return DpKt.m6065DpOffsetYgX7TsA(getVisibilityThreshold(companion2), getVisibilityThreshold(companion2));
    }

    public static final long getVisibilityThreshold(@l Size.Companion companion) {
        return SizeKt.Size(0.5f, 0.5f);
    }

    public static final long getVisibilityThreshold(@l IntSize.Companion companion) {
        return IntSizeKt.IntSize(1, 1);
    }

    @l
    public static final Rect getVisibilityThreshold(@l Rect.Companion companion) {
        return rectVisibilityThreshold;
    }

    public static final float getVisibilityThreshold(@l Dp.Companion companion) {
        return Dp.m6044constructorimpl(0.1f);
    }
}
