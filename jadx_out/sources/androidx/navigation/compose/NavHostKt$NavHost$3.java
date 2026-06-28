package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.NavBackStackEntry;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavHostKt$NavHost$3 extends n0 implements l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> {
    public static final NavHostKt$NavHost$3 INSTANCE = new NavHostKt$NavHost$3();

    NavHostKt$NavHost$3() {
        super(1);
    }

    @Override // v3.l
    @p4.l
    public final EnterTransition invoke(@p4.l AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        return EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(TypedValues.TransitionType.TYPE_DURATION, 0, null, 6, null), 0.0f, 2, null);
    }
}
