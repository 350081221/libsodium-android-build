package androidx.navigation;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.reflect.d;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\u0006\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\n¢\u0006\u0004\b\u0006\u0010\u0007\u001a4\u0010\u0006\u001a\u00028\u0000\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000*\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0086\n¢\u0006\u0004\b\u0006\u0010\n\u001a/\u0010\f\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0001\u0018\u00010\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0086\n\u001a\u001d\u0010\u000e\u001a\u00020\r*\u00020\u00032\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0086\n¨\u0006\u000f"}, d2 = {"Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "T", "Landroidx/navigation/NavigatorProvider;", "", "name", "get", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;)Landroidx/navigation/Navigator;", "Lkotlin/reflect/d;", "clazz", "(Landroidx/navigation/NavigatorProvider;Lkotlin/reflect/d;)Landroidx/navigation/Navigator;", "navigator", "set", "Lkotlin/r2;", "plusAssign", "navigation-common_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavigatorProviderKt {
    @l
    public static final <T extends Navigator<? extends NavDestination>> T get(@l NavigatorProvider navigatorProvider, @l String name) {
        l0.p(navigatorProvider, "<this>");
        l0.p(name, "name");
        return (T) navigatorProvider.getNavigator(name);
    }

    public static final void plusAssign(@l NavigatorProvider navigatorProvider, @l Navigator<? extends NavDestination> navigator) {
        l0.p(navigatorProvider, "<this>");
        l0.p(navigator, "navigator");
        navigatorProvider.addNavigator(navigator);
    }

    @m
    public static final Navigator<? extends NavDestination> set(@l NavigatorProvider navigatorProvider, @l String name, @l Navigator<? extends NavDestination> navigator) {
        l0.p(navigatorProvider, "<this>");
        l0.p(name, "name");
        l0.p(navigator, "navigator");
        return navigatorProvider.addNavigator(name, navigator);
    }

    @l
    public static final <T extends Navigator<? extends NavDestination>> T get(@l NavigatorProvider navigatorProvider, @l d<T> clazz) {
        l0.p(navigatorProvider, "<this>");
        l0.p(clazz, "clazz");
        return (T) navigatorProvider.getNavigator(u3.a.e(clazz));
    }
}
