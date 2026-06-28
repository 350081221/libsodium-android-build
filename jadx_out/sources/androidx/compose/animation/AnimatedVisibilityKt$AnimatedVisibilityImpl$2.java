package androidx.compose.animation;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "current", "Landroidx/compose/animation/EnterExitState;", TypedValues.AttributesType.S_TARGET, "invoke", "(Landroidx/compose/animation/EnterExitState;Landroidx/compose/animation/EnterExitState;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnimatedVisibilityKt$AnimatedVisibilityImpl$2 extends n0 implements p<EnterExitState, EnterExitState, Boolean> {
    public static final AnimatedVisibilityKt$AnimatedVisibilityImpl$2 INSTANCE = new AnimatedVisibilityKt$AnimatedVisibilityImpl$2();

    AnimatedVisibilityKt$AnimatedVisibilityImpl$2() {
        super(2);
    }

    @Override // v3.p
    @l
    public final Boolean invoke(@l EnterExitState enterExitState, @l EnterExitState enterExitState2) {
        return Boolean.valueOf(enterExitState == enterExitState2 && enterExitState2 == EnterExitState.PostExit);
    }
}
