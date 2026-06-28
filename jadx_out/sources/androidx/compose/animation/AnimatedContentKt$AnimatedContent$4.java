package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import com.android.dx.io.Opcodes;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [S] */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatedContentKt$AnimatedContent$4<S> extends n0 implements l<AnimatedContentTransitionScope<S>, ContentTransform> {
    public static final AnimatedContentKt$AnimatedContent$4 INSTANCE = new AnimatedContentKt$AnimatedContent$4();

    AnimatedContentKt$AnimatedContent$4() {
        super(1);
    }

    @Override // v3.l
    @p4.l
    public final ContentTransform invoke(@p4.l AnimatedContentTransitionScope<S> animatedContentTransitionScope) {
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(Opcodes.REM_INT_LIT8, 90, null, 4, null), 0.0f, 2, null).plus(EnterExitTransitionKt.m65scaleInL8ZKhE$default(AnimationSpecKt.tween$default(Opcodes.REM_INT_LIT8, 90, null, 4, null), 0.92f, 0L, 4, null)), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(90, 0, null, 6, null), 0.0f, 2, null));
    }
}
