package androidx.navigation.fragment;

import androidx.annotation.IdRes;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.k;
import p4.l;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B+\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\rB)\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "build", "Lkotlin/reflect/d;", "Landroidx/fragment/app/Fragment;", "fragmentClass", "Lkotlin/reflect/d;", "Landroidx/navigation/fragment/FragmentNavigator;", "navigator", "", "id", "<init>", "(Landroidx/navigation/fragment/FragmentNavigator;ILkotlin/reflect/d;)V", "", "route", "(Landroidx/navigation/fragment/FragmentNavigator;Ljava/lang/String;Lkotlin/reflect/d;)V", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0})
@NavDestinationDsl
/* loaded from: classes2.dex */
public final class FragmentNavigatorDestinationBuilder extends NavDestinationBuilder<FragmentNavigator.Destination> {

    @l
    private kotlin.reflect.d<? extends Fragment> fragmentClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @k(message = "Use routes to build your FragmentNavigatorDestination instead", replaceWith = @b1(expression = "FragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClass) ", imports = {}))
    public FragmentNavigatorDestinationBuilder(@l FragmentNavigator navigator, @IdRes int i5, @l kotlin.reflect.d<? extends Fragment> fragmentClass) {
        super(navigator, i5);
        l0.p(navigator, "navigator");
        l0.p(fragmentClass, "fragmentClass");
        this.fragmentClass = fragmentClass;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @l
    public FragmentNavigator.Destination build() {
        FragmentNavigator.Destination destination = (FragmentNavigator.Destination) super.build();
        String name = u3.a.e(this.fragmentClass).getName();
        l0.o(name, "fragmentClass.java.name");
        destination.setClassName(name);
        return destination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentNavigatorDestinationBuilder(@l FragmentNavigator navigator, @l String route, @l kotlin.reflect.d<? extends Fragment> fragmentClass) {
        super(navigator, route);
        l0.p(navigator, "navigator");
        l0.p(route, "route");
        l0.p(fragmentClass, "fragmentClass");
        this.fragmentClass = fragmentClass;
    }
}
