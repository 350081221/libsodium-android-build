package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.j0;
import p4.l;

@i0(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aJ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003\u001a \u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0000\" \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\" \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\" \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f\" \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000f\" \u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u000f\" \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u000f\" \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000f\" \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00150\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000f\" \u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u000f\"!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\u0006*\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$\"!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u0006*\u00020&8F¢\u0006\u0006\u001a\u0004\b#\u0010'\"!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u0006*\u00020(8F¢\u0006\u0006\u001a\u0004\b#\u0010)\"!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u0006*\u00020*8F¢\u0006\u0006\u001a\u0004\b#\u0010+\"!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0006*\u00020,8F¢\u0006\u0006\u001a\u0004\b#\u0010-\"!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00150\u0006*\u00020.8F¢\u0006\u0006\u001a\u0004\b#\u0010/\"!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00150\u0006*\u0002008F¢\u0006\u0006\u001a\u0004\b#\u00101\"!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u0006*\u0002028F¢\u0006\u0006\u001a\u0004\b#\u00103\"!\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00150\u0006*\u0002048F¢\u0006\u0006\u001a\u0004\b#\u00105¨\u00066"}, d2 = {"T", "Landroidx/compose/animation/core/AnimationVector;", "V", "Lkotlin/Function1;", "convertToVector", "convertFromVector", "Landroidx/compose/animation/core/TwoWayConverter;", "TwoWayConverter", "", "start", "stop", "fraction", "lerp", "Landroidx/compose/animation/core/AnimationVector1D;", "FloatToVector", "Landroidx/compose/animation/core/TwoWayConverter;", "", "IntToVector", "Landroidx/compose/ui/unit/Dp;", "DpToVector", "Landroidx/compose/ui/unit/DpOffset;", "Landroidx/compose/animation/core/AnimationVector2D;", "DpOffsetToVector", "Landroidx/compose/ui/geometry/Size;", "SizeToVector", "Landroidx/compose/ui/geometry/Offset;", "OffsetToVector", "Landroidx/compose/ui/unit/IntOffset;", "IntOffsetToVector", "Landroidx/compose/ui/unit/IntSize;", "IntSizeToVector", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/animation/core/AnimationVector4D;", "RectToVector", "Lkotlin/Float$Companion;", "getVectorConverter", "(Lkotlin/jvm/internal/a0;)Landroidx/compose/animation/core/TwoWayConverter;", "VectorConverter", "Lkotlin/Int$Companion;", "(Lkotlin/jvm/internal/j0;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Rect$Companion;", "(Landroidx/compose/ui/geometry/Rect$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/Dp$Companion;", "(Landroidx/compose/ui/unit/Dp$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/DpOffset$Companion;", "(Landroidx/compose/ui/unit/DpOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Size$Companion;", "(Landroidx/compose/ui/geometry/Size$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/geometry/Offset$Companion;", "(Landroidx/compose/ui/geometry/Offset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntOffset$Companion;", "(Landroidx/compose/ui/unit/IntOffset$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/unit/IntSize$Companion;", "(Landroidx/compose/ui/unit/IntSize$Companion;)Landroidx/compose/animation/core/TwoWayConverter;", "animation-core_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class VectorConvertersKt {

    @l
    private static final TwoWayConverter<Float, AnimationVector1D> FloatToVector = TwoWayConverter(VectorConvertersKt$FloatToVector$1.INSTANCE, VectorConvertersKt$FloatToVector$2.INSTANCE);

    @l
    private static final TwoWayConverter<Integer, AnimationVector1D> IntToVector = TwoWayConverter(VectorConvertersKt$IntToVector$1.INSTANCE, VectorConvertersKt$IntToVector$2.INSTANCE);

    @l
    private static final TwoWayConverter<Dp, AnimationVector1D> DpToVector = TwoWayConverter(VectorConvertersKt$DpToVector$1.INSTANCE, VectorConvertersKt$DpToVector$2.INSTANCE);

    @l
    private static final TwoWayConverter<DpOffset, AnimationVector2D> DpOffsetToVector = TwoWayConverter(VectorConvertersKt$DpOffsetToVector$1.INSTANCE, VectorConvertersKt$DpOffsetToVector$2.INSTANCE);

    @l
    private static final TwoWayConverter<Size, AnimationVector2D> SizeToVector = TwoWayConverter(VectorConvertersKt$SizeToVector$1.INSTANCE, VectorConvertersKt$SizeToVector$2.INSTANCE);

    @l
    private static final TwoWayConverter<Offset, AnimationVector2D> OffsetToVector = TwoWayConverter(VectorConvertersKt$OffsetToVector$1.INSTANCE, VectorConvertersKt$OffsetToVector$2.INSTANCE);

    @l
    private static final TwoWayConverter<IntOffset, AnimationVector2D> IntOffsetToVector = TwoWayConverter(VectorConvertersKt$IntOffsetToVector$1.INSTANCE, VectorConvertersKt$IntOffsetToVector$2.INSTANCE);

    @l
    private static final TwoWayConverter<IntSize, AnimationVector2D> IntSizeToVector = TwoWayConverter(VectorConvertersKt$IntSizeToVector$1.INSTANCE, VectorConvertersKt$IntSizeToVector$2.INSTANCE);

    @l
    private static final TwoWayConverter<Rect, AnimationVector4D> RectToVector = TwoWayConverter(VectorConvertersKt$RectToVector$1.INSTANCE, VectorConvertersKt$RectToVector$2.INSTANCE);

    @l
    public static final <T, V extends AnimationVector> TwoWayConverter<T, V> TwoWayConverter(@l v3.l<? super T, ? extends V> lVar, @l v3.l<? super V, ? extends T> lVar2) {
        return new TwoWayConverterImpl(lVar, lVar2);
    }

    @l
    public static final TwoWayConverter<Float, AnimationVector1D> getVectorConverter(@l a0 a0Var) {
        return FloatToVector;
    }

    public static final float lerp(float f5, float f6, float f7) {
        return (f5 * (1 - f7)) + (f6 * f7);
    }

    @l
    public static final TwoWayConverter<Integer, AnimationVector1D> getVectorConverter(@l j0 j0Var) {
        return IntToVector;
    }

    @l
    public static final TwoWayConverter<Rect, AnimationVector4D> getVectorConverter(@l Rect.Companion companion) {
        return RectToVector;
    }

    @l
    public static final TwoWayConverter<Dp, AnimationVector1D> getVectorConverter(@l Dp.Companion companion) {
        return DpToVector;
    }

    @l
    public static final TwoWayConverter<DpOffset, AnimationVector2D> getVectorConverter(@l DpOffset.Companion companion) {
        return DpOffsetToVector;
    }

    @l
    public static final TwoWayConverter<Size, AnimationVector2D> getVectorConverter(@l Size.Companion companion) {
        return SizeToVector;
    }

    @l
    public static final TwoWayConverter<Offset, AnimationVector2D> getVectorConverter(@l Offset.Companion companion) {
        return OffsetToVector;
    }

    @l
    public static final TwoWayConverter<IntOffset, AnimationVector2D> getVectorConverter(@l IntOffset.Companion companion) {
        return IntOffsetToVector;
    }

    @l
    public static final TwoWayConverter<IntSize, AnimationVector2D> getVectorConverter(@l IntSize.Companion companion) {
        return IntSizeToVector;
    }
}
