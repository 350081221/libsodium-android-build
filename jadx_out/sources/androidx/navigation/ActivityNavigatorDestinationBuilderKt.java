package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\bø\u0001\u0000\u001a1\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"Landroidx/navigation/NavGraphBuilder;", "", "id", "Lkotlin/Function1;", "Landroidx/navigation/ActivityNavigatorDestinationBuilder;", "Lkotlin/r2;", "Lkotlin/u;", "builder", "activity", "", "route", "navigation-runtime_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nActivityNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigatorDestinationBuilder.kt\nandroidx/navigation/ActivityNavigatorDestinationBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,101:1\n161#2:102\n161#2:103\n*S KotlinDebug\n*F\n+ 1 ActivityNavigatorDestinationBuilder.kt\nandroidx/navigation/ActivityNavigatorDestinationBuilderKt\n*L\n41#1:102\n54#1:103\n*E\n"})
/* loaded from: classes2.dex */
public final class ActivityNavigatorDestinationBuilderKt {
    @k(message = "Use routes to build your ActivityDestination instead", replaceWith = @b1(expression = "activity(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void activity(@l NavGraphBuilder navGraphBuilder, @IdRes int i5, @l v3.l<? super ActivityNavigatorDestinationBuilder, r2> builder) {
        l0.p(navGraphBuilder, "<this>");
        l0.p(builder, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class), i5);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }

    public static final void activity(@l NavGraphBuilder navGraphBuilder, @l String route, @l v3.l<? super ActivityNavigatorDestinationBuilder, r2> builder) {
        l0.p(navGraphBuilder, "<this>");
        l0.p(route, "route");
        l0.p(builder, "builder");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class), route);
        builder.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }
}
