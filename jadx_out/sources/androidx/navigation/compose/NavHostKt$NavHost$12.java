package androidx.navigation.compose;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.runtime.State;
import androidx.navigation.NavBackStackEntry;
import java.util.List;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/ContentTransform;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/compose/NavHostKt$NavHost$12\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,368:1\n1#2:369\n*E\n"})
/* loaded from: classes2.dex */
public final class NavHostKt$NavHost$12 extends n0 implements l<AnimatedContentTransitionScope<NavBackStackEntry>, ContentTransform> {
    final /* synthetic */ ComposeNavigator $composeNavigator;
    final /* synthetic */ l<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> $finalEnter;
    final /* synthetic */ l<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> $finalExit;
    final /* synthetic */ State<List<NavBackStackEntry>> $visibleEntries$delegate;
    final /* synthetic */ Map<String, Float> $zIndices;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavHostKt$NavHost$12(Map<String, Float> map, ComposeNavigator composeNavigator, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends EnterTransition> lVar, l<? super AnimatedContentTransitionScope<NavBackStackEntry>, ? extends ExitTransition> lVar2, State<? extends List<NavBackStackEntry>> state) {
        super(1);
        this.$zIndices = map;
        this.$composeNavigator = composeNavigator;
        this.$finalEnter = lVar;
        this.$finalExit = lVar2;
        this.$visibleEntries$delegate = state;
    }

    @Override // v3.l
    @p4.l
    public final ContentTransform invoke(@p4.l AnimatedContentTransitionScope<NavBackStackEntry> animatedContentTransitionScope) {
        List NavHost$lambda$6;
        float f5;
        NavHost$lambda$6 = NavHostKt.NavHost$lambda$6(this.$visibleEntries$delegate);
        if (NavHost$lambda$6.contains(animatedContentTransitionScope.getInitialState())) {
            Float f6 = this.$zIndices.get(animatedContentTransitionScope.getInitialState().getId());
            if (f6 != null) {
                f5 = f6.floatValue();
            } else {
                this.$zIndices.put(animatedContentTransitionScope.getInitialState().getId(), Float.valueOf(0.0f));
                f5 = 0.0f;
            }
            if (!l0.g(animatedContentTransitionScope.getTargetState().getId(), animatedContentTransitionScope.getInitialState().getId())) {
                f5 = this.$composeNavigator.isPop$navigation_compose_release().getValue().booleanValue() ? f5 - 1.0f : f5 + 1.0f;
            }
            float f7 = f5;
            this.$zIndices.put(animatedContentTransitionScope.getTargetState().getId(), Float.valueOf(f7));
            return new ContentTransform(this.$finalEnter.invoke(animatedContentTransitionScope), this.$finalExit.invoke(animatedContentTransitionScope), f7, null, 8, null);
        }
        return AnimatedContentKt.togetherWith(EnterTransition.Companion.getNone(), ExitTransition.Companion.getNone());
    }
}
