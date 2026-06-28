package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Rect;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Rect;", "it", "Landroidx/compose/animation/core/AnimationVector4D;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class VectorConvertersKt$RectToVector$2 extends n0 implements l<AnimationVector4D, Rect> {
    public static final VectorConvertersKt$RectToVector$2 INSTANCE = new VectorConvertersKt$RectToVector$2();

    VectorConvertersKt$RectToVector$2() {
        super(1);
    }

    @Override // v3.l
    @p4.l
    public final Rect invoke(@p4.l AnimationVector4D animationVector4D) {
        return new Rect(animationVector4D.getV1(), animationVector4D.getV2(), animationVector4D.getV3(), animationVector4D.getV4());
    }
}
