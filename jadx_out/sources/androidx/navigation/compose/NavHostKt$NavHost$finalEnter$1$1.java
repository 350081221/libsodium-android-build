package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.ComposeNavigator;
import java.util.Iterator;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavHostKt$NavHost$finalEnter$1$1 extends n0 implements l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> {
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> $enterTransition;
    final /* synthetic */ l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> $popEnterTransition;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$finalEnter$1$1(ComposeNavigator composeNavigator, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar2) {
        super(1);
        this.$composeNavigator = composeNavigator;
        this.$popEnterTransition = lVar;
        this.$enterTransition = lVar2;
    }

    @Override // v3.l
    @p4.l
    public final EnterTransition invoke(@p4.l AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        EnterTransition createEnterTransition;
        EnterTransition createPopEnterTransition;
        NavDestination destination = animatedContentTransitionScope.getTargetState().getDestination();
        l0.n(destination, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
        ComposeNavigator.Destination destination2 = (ComposeNavigator.Destination) destination;
        EnterTransition enterTransition = null;
        if (this.$composeNavigator.isPop$navigation_compose_release().getValue().booleanValue()) {
            Iterator<NavDestination> it = NavDestination.Companion.getHierarchy(destination2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                createPopEnterTransition = NavHostKt.createPopEnterTransition(it.next(), animatedContentTransitionScope);
                if (createPopEnterTransition != null) {
                    enterTransition = createPopEnterTransition;
                    break;
                }
            }
            return enterTransition == null ? this.$popEnterTransition.invoke(animatedContentTransitionScope) : enterTransition;
        }
        Iterator<NavDestination> it2 = NavDestination.Companion.getHierarchy(destination2).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            createEnterTransition = NavHostKt.createEnterTransition(it2.next(), animatedContentTransitionScope);
            if (createEnterTransition != null) {
                enterTransition = createEnterTransition;
                break;
            }
        }
        return enterTransition == null ? this.$enterTransition.invoke(animatedContentTransitionScope) : enterTransition;
    }
}
