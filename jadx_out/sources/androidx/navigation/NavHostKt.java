package androidx.navigation;

import androidx.annotation.IdRes;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a=\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0087\bø\u0001\u0000\u001a=\u0010\n\u001a\u00020\t*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Landroidx/navigation/NavHost;", "", "id", "startDestination", "Lkotlin/Function1;", "Landroidx/navigation/NavGraphBuilder;", "Lkotlin/r2;", "Lkotlin/u;", "builder", "Landroidx/navigation/NavGraph;", "createGraph", "", "route", "navigation-runtime_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/NavHostKt\n+ 2 NavController.kt\nandroidx/navigation/NavControllerKt\n+ 3 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n*L\n1#1,78:1\n2590#2:79\n2603#2:81\n42#3:80\n57#3,2:82\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/NavHostKt\n*L\n68#1:79\n77#1:81\n68#1:80\n77#1:82,2\n*E\n"})
/* loaded from: classes2.dex */
public final class NavHostKt {
    @l
    @k(message = "Use routes to create your NavGraph instead", replaceWith = @b1(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final NavGraph createGraph(@l NavHost navHost, @IdRes int i5, @IdRes int i6, @l v3.l<? super NavGraphBuilder, r2> builder) {
        l0.p(navHost, "<this>");
        l0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), i5, i6);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, int i5, int i6, v3.l builder, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i5 = 0;
        }
        l0.p(navHost, "<this>");
        l0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), i5, i6);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @l
    public static final NavGraph createGraph(@l NavHost navHost, @l String startDestination, @m String str, @l v3.l<? super NavGraphBuilder, r2> builder) {
        l0.p(navHost, "<this>");
        l0.p(startDestination, "startDestination");
        l0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph createGraph$default(NavHost navHost, String startDestination, String str, v3.l builder, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            str = null;
        }
        l0.p(navHost, "<this>");
        l0.p(startDestination, "startDestination");
        l0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navHost.getNavController().getNavigatorProvider(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }
}
