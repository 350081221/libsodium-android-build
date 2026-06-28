package androidx.compose.animation;

import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.graphics.TransformOrigin;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector2D;", "it", "Landroidx/compose/ui/graphics/TransformOrigin;", "invoke-__ExYCQ", "(J)Landroidx/compose/animation/core/AnimationVector2D;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class EnterExitTransitionKt$TransformOriginVectorConverter$1 extends n0 implements l<TransformOrigin, AnimationVector2D> {
    public static final EnterExitTransitionKt$TransformOriginVectorConverter$1 INSTANCE = new EnterExitTransitionKt$TransformOriginVectorConverter$1();

    EnterExitTransitionKt$TransformOriginVectorConverter$1() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ AnimationVector2D invoke(TransformOrigin transformOrigin) {
        return m68invoke__ExYCQ(transformOrigin.m4122unboximpl());
    }

    @p4.l
    /* renamed from: invoke-__ExYCQ, reason: not valid java name */
    public final AnimationVector2D m68invoke__ExYCQ(long j5) {
        return new AnimationVector2D(TransformOrigin.m4118getPivotFractionXimpl(j5), TransformOrigin.m4119getPivotFractionYimpl(j5));
    }
}
