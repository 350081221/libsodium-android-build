package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import com.alipay.sdk.m.x.d;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\n*\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0017R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX§\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0003"}, d2 = {"Landroidx/compose/animation/AnimatedVisibilityScope;", "", "transition", "Landroidx/compose/animation/core/Transition;", "Landroidx/compose/animation/EnterExitState;", "getTransition$annotations", "()V", "getTransition", "()Landroidx/compose/animation/core/Transition;", "animateEnterExit", "Landroidx/compose/ui/Modifier;", "enter", "Landroidx/compose/animation/EnterTransition;", d.f3034z, "Landroidx/compose/animation/ExitTransition;", TTDownloadField.TT_LABEL, "", "animation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,919:1\n135#2:920\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityScope\n*L\n672#1:920\n*E\n"})
/* loaded from: classes.dex */
public interface AnimatedVisibilityScope {

    @i0(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @l
        @ExperimentalAnimationApi
        @Deprecated
        public static Modifier animateEnterExit(@l AnimatedVisibilityScope animatedVisibilityScope, @l Modifier modifier, @l EnterTransition enterTransition, @l ExitTransition exitTransition, @l String str) {
            return AnimatedVisibilityScope.super.animateEnterExit(modifier, enterTransition, exitTransition, str);
        }

        @ExperimentalAnimationApi
        public static /* synthetic */ void getTransition$annotations() {
        }
    }

    static /* synthetic */ Modifier animateEnterExit$default(AnimatedVisibilityScope animatedVisibilityScope, Modifier modifier, EnterTransition enterTransition, ExitTransition exitTransition, String str, int i5, Object obj) {
        if (obj == null) {
            if ((i5 & 1) != 0) {
                enterTransition = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.expandIn$default(null, null, false, null, 15, null));
            }
            if ((i5 & 2) != 0) {
                exitTransition = EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkOut$default(null, null, false, null, 15, null));
            }
            if ((i5 & 4) != 0) {
                str = "animateEnterExit";
            }
            return animatedVisibilityScope.animateEnterExit(modifier, enterTransition, exitTransition, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateEnterExit");
    }

    @l
    @ExperimentalAnimationApi
    default Modifier animateEnterExit(@l Modifier modifier, @l EnterTransition enterTransition, @l ExitTransition exitTransition, @l String str) {
        v3.l noInspectorInfo;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1(enterTransition, exitTransition, str);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new AnimatedVisibilityScope$animateEnterExit$2(this, enterTransition, exitTransition, str));
    }

    @l
    @ExperimentalAnimationApi
    Transition<EnterExitState> getTransition();
}
