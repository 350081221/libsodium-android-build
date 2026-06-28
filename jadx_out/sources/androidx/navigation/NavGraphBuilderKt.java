package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.core.app.NotificationCompat;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a=\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087\bø\u0001\u0000\u001a=\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u001a=\u0010\n\u001a\u00020\u0006*\u00020\u00052\b\b\u0001\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087\bø\u0001\u0000\u001a9\u0010\n\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Landroidx/navigation/NavigatorProvider;", "", "id", "startDestination", "Lkotlin/Function1;", "Landroidx/navigation/NavGraphBuilder;", "Lkotlin/r2;", "Lkotlin/u;", "builder", "Landroidx/navigation/NavGraph;", NotificationCompat.CATEGORY_NAVIGATION, "", "route", "navigation-common_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavGraphBuilderKt {
    @l
    @k(message = "Use routes to build your NavGraph instead", replaceWith = @b1(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final NavGraph navigation(@l NavigatorProvider navigatorProvider, @IdRes int i5, @IdRes int i6, @l v3.l<? super NavGraphBuilder, r2> builder) {
        l0.p(navigatorProvider, "<this>");
        l0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, i5, i6);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, int i5, int i6, v3.l builder, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        l0.p(navigatorProvider, "<this>");
        l0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, i5, i6);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @l
    public static final NavGraph navigation(@l NavigatorProvider navigatorProvider, @l String startDestination, @m String str, @l v3.l<? super NavGraphBuilder, r2> builder) {
        l0.p(navigatorProvider, "<this>");
        l0.p(startDestination, "startDestination");
        l0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider navigatorProvider, String startDestination, String str, v3.l builder, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = null;
        }
        l0.p(navigatorProvider, "<this>");
        l0.p(startDestination, "startDestination");
        l0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navigatorProvider, startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @k(message = "Use routes to build your nested NavGraph instead", replaceWith = @b1(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void navigation(@l NavGraphBuilder navGraphBuilder, @IdRes int i5, @IdRes int i6, @l v3.l<? super NavGraphBuilder, r2> builder) {
        l0.p(navGraphBuilder, "<this>");
        l0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), i5, i6);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }

    public static final void navigation(@l NavGraphBuilder navGraphBuilder, @l String startDestination, @l String route, @l v3.l<? super NavGraphBuilder, r2> builder) {
        l0.p(navGraphBuilder, "<this>");
        l0.p(startDestination, "startDestination");
        l0.p(route, "route");
        l0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.getProvider(), startDestination, route);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.destination(navGraphBuilder2);
    }
}
