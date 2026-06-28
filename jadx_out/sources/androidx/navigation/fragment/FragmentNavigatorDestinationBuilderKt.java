package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavGraphBuilder;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0087\b\u001a?\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000\u001a!\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0086\b\u001a=\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Landroidx/fragment/app/Fragment;", "F", "Landroidx/navigation/NavGraphBuilder;", "", "id", "Lkotlin/r2;", "fragment", "Lkotlin/Function1;", "Landroidx/navigation/fragment/FragmentNavigatorDestinationBuilder;", "Lkotlin/u;", "builder", "", "route", "navigation-fragment_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nFragmentNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/FragmentNavigatorDestinationBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,142:1\n55#1,3:143\n58#1,4:147\n81#1,3:152\n84#1,4:156\n161#2:146\n161#2:151\n161#2:155\n161#2:160\n*S KotlinDebug\n*F\n+ 1 FragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/FragmentNavigatorDestinationBuilderKt\n*L\n39#1:143,3\n39#1:147,4\n70#1:152,3\n70#1:156,4\n39#1:146\n57#1:151\n70#1:155\n83#1:160\n*E\n"})
/* loaded from: classes2.dex */
public final class FragmentNavigatorDestinationBuilderKt {
    @k(message = "Use routes to create your FragmentDestination instead", replaceWith = @b1(expression = "fragment<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final /* synthetic */ <F extends Fragment> void fragment(NavGraphBuilder navGraphBuilder, @IdRes int i5, l<? super FragmentNavigatorDestinationBuilder, r2> builder) {
        l0.p(navGraphBuilder, "<this>");
        l0.p(builder, "builder");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        l0.y(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder(fragmentNavigator, i5, (kotlin.reflect.d<? extends Fragment>) l1.d(Fragment.class));
        builder.invoke(fragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(fragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends Fragment> void fragment(NavGraphBuilder navGraphBuilder, String route, l<? super FragmentNavigatorDestinationBuilder, r2> builder) {
        l0.p(navGraphBuilder, "<this>");
        l0.p(route, "route");
        l0.p(builder, "builder");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        l0.y(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder(fragmentNavigator, route, (kotlin.reflect.d<? extends Fragment>) l1.d(Fragment.class));
        builder.invoke(fragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(fragmentNavigatorDestinationBuilder);
    }

    @k(message = "Use routes to create your FragmentDestination instead", replaceWith = @b1(expression = "fragment<F>(route = id.toString())", imports = {}))
    public static final /* synthetic */ <F extends Fragment> void fragment(NavGraphBuilder navGraphBuilder, @IdRes int i5) {
        l0.p(navGraphBuilder, "<this>");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        l0.y(4, "F");
        navGraphBuilder.destination(new FragmentNavigatorDestinationBuilder(fragmentNavigator, i5, (kotlin.reflect.d<? extends Fragment>) l1.d(Fragment.class)));
    }

    public static final /* synthetic */ <F extends Fragment> void fragment(NavGraphBuilder navGraphBuilder, String route) {
        l0.p(navGraphBuilder, "<this>");
        l0.p(route, "route");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.getProvider().getNavigator(FragmentNavigator.class);
        l0.y(4, "F");
        navGraphBuilder.destination(new FragmentNavigatorDestinationBuilder(fragmentNavigator, route, (kotlin.reflect.d<? extends Fragment>) l1.d(Fragment.class)));
    }
}
