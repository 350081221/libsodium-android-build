package androidx.compose.animation.core;

import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/DpOffset;", "it", "Landroidx/compose/animation/core/AnimationVector2D;", "invoke-gVRvYmI", "(Landroidx/compose/animation/core/AnimationVector2D;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nVectorConverters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt$DpOffsetToVector$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,196:1\n174#2:197\n*S KotlinDebug\n*F\n+ 1 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt$DpOffsetToVector$2\n*L\n145#1:197\n*E\n"})
/* loaded from: classes.dex */
final class VectorConvertersKt$DpOffsetToVector$2 extends n0 implements l<AnimationVector2D, DpOffset> {
    public static final VectorConvertersKt$DpOffsetToVector$2 INSTANCE = new VectorConvertersKt$DpOffsetToVector$2();

    VectorConvertersKt$DpOffsetToVector$2() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ DpOffset invoke(AnimationVector2D animationVector2D) {
        return DpOffset.m6099boximpl(m157invokegVRvYmI(animationVector2D));
    }

    /* renamed from: invoke-gVRvYmI, reason: not valid java name */
    public final long m157invokegVRvYmI(@p4.l AnimationVector2D animationVector2D) {
        return DpKt.m6065DpOffsetYgX7TsA(Dp.m6044constructorimpl(animationVector2D.getV1()), Dp.m6044constructorimpl(animationVector2D.getV2()));
    }
}
