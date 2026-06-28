package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.ranges.u;
import v3.l;

@i0(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/TwoWayConverter;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/AnimationVector4D;", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ColorVectorConverterKt$ColorToVector$1 extends n0 implements l<ColorSpace, TwoWayConverter<Color, AnimationVector4D>> {
    public static final ColorVectorConverterKt$ColorToVector$1 INSTANCE = new ColorVectorConverterKt$ColorToVector$1();

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector4D;", TypedValues.Custom.S_COLOR, "Landroidx/compose/ui/graphics/Color;", "invoke-8_81llA", "(J)Landroidx/compose/animation/core/AnimationVector4D;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Color, AnimationVector4D> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ AnimationVector4D invoke(Color color) {
            return m62invoke8_81llA(color.m3744unboximpl());
        }

        @p4.l
        /* renamed from: invoke-8_81llA, reason: not valid java name */
        public final AnimationVector4D m62invoke8_81llA(long j5) {
            long m3731convertvNxB06k = Color.m3731convertvNxB06k(j5, ColorSpaces.INSTANCE.getOklab());
            return new AnimationVector4D(Color.m3728component4impl(m3731convertvNxB06k), Color.m3725component1impl(m3731convertvNxB06k), Color.m3726component2impl(m3731convertvNxB06k), Color.m3727component3impl(m3731convertvNxB06k));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Color;", "vector", "Landroidx/compose/animation/core/AnimationVector4D;", "invoke-vNxB06k", "(Landroidx/compose/animation/core/AnimationVector4D;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.ColorVectorConverterKt$ColorToVector$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends n0 implements l<AnimationVector4D, Color> {
        final /* synthetic */ ColorSpace $colorSpace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ColorSpace colorSpace) {
            super(1);
            this.$colorSpace = colorSpace;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ Color invoke(AnimationVector4D animationVector4D) {
            return Color.m3724boximpl(m63invokevNxB06k(animationVector4D));
        }

        /* renamed from: invoke-vNxB06k, reason: not valid java name */
        public final long m63invokevNxB06k(@p4.l AnimationVector4D animationVector4D) {
            float H;
            float H2;
            float H3;
            float H4;
            H = u.H(animationVector4D.getV2(), 0.0f, 1.0f);
            H2 = u.H(animationVector4D.getV3(), -0.5f, 0.5f);
            H3 = u.H(animationVector4D.getV4(), -0.5f, 0.5f);
            H4 = u.H(animationVector4D.getV1(), 0.0f, 1.0f);
            return Color.m3731convertvNxB06k(ColorKt.Color(H, H2, H3, H4, ColorSpaces.INSTANCE.getOklab()), this.$colorSpace);
        }
    }

    ColorVectorConverterKt$ColorToVector$1() {
        super(1);
    }

    @Override // v3.l
    @p4.l
    public final TwoWayConverter<Color, AnimationVector4D> invoke(@p4.l ColorSpace colorSpace) {
        return VectorConvertersKt.TwoWayConverter(AnonymousClass1.INSTANCE, new AnonymousClass2(colorSpace));
    }
}
