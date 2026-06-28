package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.fragment.app.DialogFragment;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.compose.DialogNavigator;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a#\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0003H\u0087\b\u001a?\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00032\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\tH\u0087\bø\u0001\u0000\u001a!\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0086\b\u001a=\u0010\u0006\u001a\u00020\u0005\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\tH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Landroidx/fragment/app/DialogFragment;", "F", "Landroidx/navigation/NavGraphBuilder;", "", "id", "Lkotlin/r2;", DialogNavigator.NAME, "Lkotlin/Function1;", "Landroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilder;", "Lkotlin/u;", "builder", "", "route", "navigation-fragment_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nDialogFragmentNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogFragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,143:1\n55#1,3:144\n58#1,4:148\n80#1,3:153\n83#1,4:157\n161#2:147\n161#2:152\n161#2:156\n161#2:161\n*S KotlinDebug\n*F\n+ 1 DialogFragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilderKt\n*L\n39#1:144,3\n39#1:148,4\n69#1:153,3\n69#1:157,4\n39#1:147\n57#1:152\n69#1:156\n82#1:161\n*E\n"})
/* loaded from: classes2.dex */
public final class DialogFragmentNavigatorDestinationBuilderKt {
    @k(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @b1(expression = "dialog<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final /* synthetic */ <F extends DialogFragment> void dialog(NavGraphBuilder navGraphBuilder, @IdRes int i5, l<? super DialogFragmentNavigatorDestinationBuilder, r2> builder) {
        l0.p(navGraphBuilder, "<this>");
        l0.p(builder, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        l0.y(4, "F");
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, i5, (kotlin.reflect.d<? extends DialogFragment>) l1.d(DialogFragment.class));
        builder.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends DialogFragment> void dialog(NavGraphBuilder navGraphBuilder, String route, l<? super DialogFragmentNavigatorDestinationBuilder, r2> builder) {
        l0.p(navGraphBuilder, "<this>");
        l0.p(route, "route");
        l0.p(builder, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        l0.y(4, "F");
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, route, (kotlin.reflect.d<? extends DialogFragment>) l1.d(DialogFragment.class));
        builder.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    @k(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @b1(expression = "dialog<F>(route = id.toString())", imports = {}))
    public static final /* synthetic */ <F extends DialogFragment> void dialog(NavGraphBuilder navGraphBuilder, @IdRes int i5) {
        l0.p(navGraphBuilder, "<this>");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        l0.y(4, "F");
        navGraphBuilder.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, i5, (kotlin.reflect.d<? extends DialogFragment>) l1.d(DialogFragment.class)));
    }

    public static final /* synthetic */ <F extends DialogFragment> void dialog(NavGraphBuilder navGraphBuilder, String route) {
        l0.p(navGraphBuilder, "<this>");
        l0.p(route, "route");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        l0.y(4, "F");
        navGraphBuilder.destination(new DialogFragmentNavigatorDestinationBuilder(dialogFragmentNavigator, route, (kotlin.reflect.d<? extends DialogFragment>) l1.d(DialogFragment.class)));
    }
}
