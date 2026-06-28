package androidx.compose.foundation.shape;

import androidx.annotation.IntRange;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u000e\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u000e2\b\b\u0002\u0010\t\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u000e2\b\b\u0002\u0010\u000b\u001a\u00020\u000e\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0010\u001a.\u0010\u0000\u001a\u00020\u00012\b\b\u0003\u0010\u0011\u001a\u00020\u00102\b\b\u0003\u0010\u0012\u001a\u00020\u00102\b\b\u0003\u0010\u0013\u001a\u00020\u00102\b\b\u0003\u0010\u0014\u001a\u00020\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"CutCornerShape", "Landroidx/compose/foundation/shape/CutCornerShape;", "corner", "Landroidx/compose/foundation/shape/CornerSize;", "size", "Landroidx/compose/ui/unit/Dp;", "CutCornerShape-0680j_4", "(F)Landroidx/compose/foundation/shape/CutCornerShape;", "topStart", "topEnd", "bottomEnd", "bottomStart", "CutCornerShape-a9UjIt4", "(FFFF)Landroidx/compose/foundation/shape/CutCornerShape;", "", "percent", "", "topStartPercent", "topEndPercent", "bottomEndPercent", "bottomStartPercent", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCutCornerShape.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShapeKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,199:1\n154#2:200\n154#2:201\n154#2:202\n154#2:203\n*S KotlinDebug\n*F\n+ 1 CutCornerShape.kt\nandroidx/compose/foundation/shape/CutCornerShapeKt\n*L\n146#1:200\n147#1:201\n148#1:202\n149#1:203\n*E\n"})
/* loaded from: classes.dex */
public final class CutCornerShapeKt {
    @l
    public static final CutCornerShape CutCornerShape(@l CornerSize cornerSize) {
        return new CutCornerShape(cornerSize, cornerSize, cornerSize, cornerSize);
    }

    public static /* synthetic */ CutCornerShape CutCornerShape$default(float f5, float f6, float f7, float f8, int i5, Object obj) {
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
        return CutCornerShape(f5, f6, f7, f8);
    }

    @l
    /* renamed from: CutCornerShape-0680j_4, reason: not valid java name */
    public static final CutCornerShape m816CutCornerShape0680j_4(float f5) {
        return CutCornerShape(CornerSizeKt.m815CornerSize0680j_4(f5));
    }

    @l
    /* renamed from: CutCornerShape-a9UjIt4, reason: not valid java name */
    public static final CutCornerShape m817CutCornerShapea9UjIt4(float f5, float f6, float f7, float f8) {
        return new CutCornerShape(CornerSizeKt.m815CornerSize0680j_4(f5), CornerSizeKt.m815CornerSize0680j_4(f6), CornerSizeKt.m815CornerSize0680j_4(f7), CornerSizeKt.m815CornerSize0680j_4(f8));
    }

    /* renamed from: CutCornerShape-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ CutCornerShape m818CutCornerShapea9UjIt4$default(float f5, float f6, float f7, float f8, int i5, Object obj) {
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
        return m817CutCornerShapea9UjIt4(f5, f6, f7, f8);
    }

    @l
    public static final CutCornerShape CutCornerShape(float f5) {
        return CutCornerShape(CornerSizeKt.CornerSize(f5));
    }

    public static /* synthetic */ CutCornerShape CutCornerShape$default(int i5, int i6, int i7, int i8, int i9, Object obj) {
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
        return CutCornerShape(i5, i6, i7, i8);
    }

    @l
    public static final CutCornerShape CutCornerShape(int i5) {
        return CutCornerShape(CornerSizeKt.CornerSize(i5));
    }

    @l
    public static final CutCornerShape CutCornerShape(float f5, float f6, float f7, float f8) {
        return new CutCornerShape(CornerSizeKt.CornerSize(f5), CornerSizeKt.CornerSize(f6), CornerSizeKt.CornerSize(f7), CornerSizeKt.CornerSize(f8));
    }

    @l
    public static final CutCornerShape CutCornerShape(@IntRange(from = 0, to = 100) int i5, @IntRange(from = 0, to = 100) int i6, @IntRange(from = 0, to = 100) int i7, @IntRange(from = 0, to = 100) int i8) {
        return new CutCornerShape(CornerSizeKt.CornerSize(i5), CornerSizeKt.CornerSize(i6), CornerSizeKt.CornerSize(i7), CornerSizeKt.CornerSize(i8));
    }
}
