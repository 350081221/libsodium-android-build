package androidx.compose.foundation.shape;

import androidx.annotation.IntRange;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0018\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a8\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0011\u001a.\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\u00112\b\b\u0002\u0010\r\u001a\u00020\u00112\b\b\u0002\u0010\u000e\u001a\u00020\u0011\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013\u001a.\u0010\u0004\u001a\u00020\u00012\b\b\u0003\u0010\u0014\u001a\u00020\u00132\b\b\u0003\u0010\u0015\u001a\u00020\u00132\b\b\u0003\u0010\u0016\u001a\u00020\u00132\b\b\u0003\u0010\u0017\u001a\u00020\u0013\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"CircleShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "getCircleShape", "()Landroidx/compose/foundation/shape/RoundedCornerShape;", "RoundedCornerShape", "corner", "Landroidx/compose/foundation/shape/CornerSize;", "size", "Landroidx/compose/ui/unit/Dp;", "RoundedCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/RoundedCornerShape;", "topStart", "topEnd", "bottomEnd", "bottomStart", "RoundedCornerShape-a9UjIt4", "(FFFF)Landroidx/compose/foundation/shape/RoundedCornerShape;", "", "percent", "", "topStartPercent", "topEndPercent", "bottomEndPercent", "bottomStartPercent", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRoundedCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,201:1\n154#2:202\n154#2:203\n154#2:204\n154#2:205\n*S KotlinDebug\n*F\n+ 1 RoundedCornerShape.kt\nandroidx/compose/foundation/shape/RoundedCornerShapeKt\n*L\n148#1:202\n149#1:203\n150#1:204\n151#1:205\n*E\n"})
/* loaded from: classes.dex */
public final class RoundedCornerShapeKt {

    @l
    private static final RoundedCornerShape CircleShape = RoundedCornerShape(50);

    @l
    public static final RoundedCornerShape RoundedCornerShape(@l CornerSize cornerSize) {
        return new RoundedCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = 0.0f;
        }
        if ((i5 & 2) != 0) {
            f6 = 0.0f;
        }
        if ((i5 & 4) != 0) {
            f7 = 0.0f;
        }
        if ((i5 & 8) != 0) {
            f8 = 0.0f;
        }
        return RoundedCornerShape(f5, f6, f7, f8);
    }

    @l
    /* renamed from: RoundedCornerShape-0680j_4, reason: not valid java name */
    public static final RoundedCornerShape m823RoundedCornerShape0680j_4(float f5) {
        return RoundedCornerShape(CornerSizeKt.m815CornerSize0680j_4(f5));
    }

    @l
    /* renamed from: RoundedCornerShape-a9UjIt4, reason: not valid java name */
    public static final RoundedCornerShape m824RoundedCornerShapea9UjIt4(float f5, float f6, float f7, float f8) {
        return new RoundedCornerShape(CornerSizeKt.m815CornerSize0680j_4(f5), CornerSizeKt.m815CornerSize0680j_4(f6), CornerSizeKt.m815CornerSize0680j_4(f7), CornerSizeKt.m815CornerSize0680j_4(f8));
    }

    /* renamed from: RoundedCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ RoundedCornerShape m825RoundedCornerShapea9UjIt4$default(float f5, float f6, float f7, float f8, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            f5 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 2) != 0) {
            f6 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 4) != 0) {
            f7 = Dp.m6044constructorimpl(0);
        }
        if ((i5 & 8) != 0) {
            f8 = Dp.m6044constructorimpl(0);
        }
        return m824RoundedCornerShapea9UjIt4(f5, f6, f7, f8);
    }

    @l
    public static final RoundedCornerShape getCircleShape() {
        return CircleShape;
    }

    @l
    public static final RoundedCornerShape RoundedCornerShape(float f5) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(f5));
    }

    public static /* synthetic */ RoundedCornerShape RoundedCornerShape$default(int i5, int i6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i5 = 0;
        }
        if ((i9 & 2) != 0) {
            i6 = 0;
        }
        if ((i9 & 4) != 0) {
            i7 = 0;
        }
        if ((i9 & 8) != 0) {
            i8 = 0;
        }
        return RoundedCornerShape(i5, i6, i7, i8);
    }

    @l
    public static final RoundedCornerShape RoundedCornerShape(int i5) {
        return RoundedCornerShape(CornerSizeKt.CornerSize(i5));
    }

    @l
    public static final RoundedCornerShape RoundedCornerShape(float f5, float f6, float f7, float f8) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(f5), CornerSizeKt.CornerSize(f6), CornerSizeKt.CornerSize(f7), CornerSizeKt.CornerSize(f8));
    }

    @l
    public static final RoundedCornerShape RoundedCornerShape(@IntRange(from = 0, to = 100) int i5, @IntRange(from = 0, to = 100) int i6, @IntRange(from = 0, to = 100) int i7, @IntRange(from = 0, to = 100) int i8) {
        return new RoundedCornerShape(CornerSizeKt.CornerSize(i5), CornerSizeKt.CornerSize(i6), CornerSizeKt.CornerSize(i7), CornerSizeKt.CornerSize(i8));
    }
}
