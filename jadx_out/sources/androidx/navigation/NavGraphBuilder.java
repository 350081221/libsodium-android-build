package androidx.navigation;

import androidx.annotation.IdRes;
import java.util.ArrayList;
import java.util.List;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cB#\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0013\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001b\u0010\u001eJ\u001e\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001J\r\u0010\b\u001a\u00020\u0006*\u00020\u0003H\u0086\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0003J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "D", "navDestination", "Lkotlin/r2;", "destination", "unaryPlus", "addDestination", "build", "Landroidx/navigation/NavigatorProvider;", "provider", "Landroidx/navigation/NavigatorProvider;", "getProvider", "()Landroidx/navigation/NavigatorProvider;", "", "startDestinationId", "I", "", "startDestinationRoute", "Ljava/lang/String;", "", "destinations", "Ljava/util/List;", "id", "startDestination", "<init>", "(Landroidx/navigation/NavigatorProvider;II)V", "route", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Ljava/lang/String;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
@NavDestinationDsl
@r1({"SMAP\nNavGraphBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilder\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,193:1\n161#2:194\n161#2:195\n*S KotlinDebug\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilder\n*L\n131#1:194\n149#1:195\n*E\n"})
/* loaded from: classes2.dex */
public class NavGraphBuilder extends NavDestinationBuilder<NavGraph> {

    @l
    private final List<NavDestination> destinations;

    @l
    private final NavigatorProvider provider;

    @IdRes
    private int startDestinationId;

    @m
    private String startDestinationRoute;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k(message = "Use routes to build your NavGraph instead", replaceWith = @b1(expression = "NavGraphBuilder(provider, startDestination = startDestination.toString(), route = id.toString())", imports = {}))
    public NavGraphBuilder(@l NavigatorProvider provider, @IdRes int i5, @IdRes int i6) {
        super(provider.getNavigator(NavGraphNavigator.class), i5);
        l0.p(provider, "provider");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationId = i6;
    }

    public final void addDestination(@l NavDestination destination) {
        l0.p(destination, "destination");
        this.destinations.add(destination);
    }

    public final <D extends NavDestination> void destination(@l NavDestinationBuilder<? extends D> navDestination) {
        l0.p(navDestination, "navDestination");
        this.destinations.add(navDestination.build());
    }

    @l
    public final NavigatorProvider getProvider() {
        return this.provider;
    }

    public final void unaryPlus(@l NavDestination navDestination) {
        l0.p(navDestination, "<this>");
        addDestination(navDestination);
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @l
    public NavGraph build() {
        NavGraph navGraph = (NavGraph) super.build();
        navGraph.addDestinations(this.destinations);
        int i5 = this.startDestinationId;
        if (i5 == 0 && this.startDestinationRoute == null) {
            if (getRoute() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.startDestinationRoute;
        if (str != null) {
            l0.m(str);
            navGraph.setStartDestination(str);
        } else {
            navGraph.setStartDestination(i5);
        }
        return navGraph;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(@l NavigatorProvider provider, @l String startDestination, @m String str) {
        super(provider.getNavigator(NavGraphNavigator.class), str);
        l0.p(provider, "provider");
        l0.p(startDestination, "startDestination");
        this.destinations = new ArrayList();
        this.provider = provider;
        this.startDestinationRoute = startDestination;
    }
}
