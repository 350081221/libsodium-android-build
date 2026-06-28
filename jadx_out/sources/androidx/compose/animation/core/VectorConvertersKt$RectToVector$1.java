package androidx.compose.animation.core;

import androidx.compose.ui.geometry.Rect;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/core/AnimationVector4D;", "it", "Landroidx/compose/ui/geometry/Rect;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class VectorConvertersKt$RectToVector$1 extends n0 implements l<Rect, AnimationVector4D> {
    public static final VectorConvertersKt$RectToVector$1 INSTANCE = new VectorConvertersKt$RectToVector$1();

    VectorConvertersKt$RectToVector$1() {
        super(1);
    }

    @Override // v3.l
    @p4.l
    public final AnimationVector4D invoke(@p4.l Rect rect) {
        return new AnimationVector4D(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom());
    }
}
