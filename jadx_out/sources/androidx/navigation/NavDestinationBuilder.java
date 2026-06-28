package androidx.navigation;

import androidx.annotation.IdRes;
import androidx.navigation.NavDestination;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import kotlin.r2;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B-\b\u0000\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0017\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0010\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b5\u00106B#\b\u0017\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0017\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b5\u00107B#\b\u0016\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0017\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b5\u00108J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004J\u001f\u0010\r\u001a\u00020\b2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tJ)\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\tH\u0007J\u000f\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00178\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010 \u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\"\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u0002030+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010.¨\u00069"}, d2 = {"Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/NavDestination;", "D", "", "", "name", "Lkotlin/Function1;", "Landroidx/navigation/NavArgumentBuilder;", "Lkotlin/r2;", "Lkotlin/u;", "argumentBuilder", "argument", "uriPattern", "deepLink", "Landroidx/navigation/NavDeepLinkDslBuilder;", "navDeepLink", "", "actionId", "Landroidx/navigation/NavActionBuilder;", "actionBuilder", "action", "build", "()Landroidx/navigation/NavDestination;", "Landroidx/navigation/Navigator;", "navigator", "Landroidx/navigation/Navigator;", "getNavigator", "()Landroidx/navigation/Navigator;", "id", "I", "getId", "()I", "route", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "", TTDownloadField.TT_LABEL, "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "", "Landroidx/navigation/NavArgument;", "arguments", "Ljava/util/Map;", "", "Landroidx/navigation/NavDeepLink;", "deepLinks", "Ljava/util/List;", "Landroidx/navigation/NavAction;", "actions", "<init>", "(Landroidx/navigation/Navigator;ILjava/lang/String;)V", "(Landroidx/navigation/Navigator;I)V", "(Landroidx/navigation/Navigator;Ljava/lang/String;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0})
@NavDestinationDsl
@r1({"SMAP\nNavDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavDestinationBuilder\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,260:1\n215#2,2:261\n215#2,2:265\n1855#3,2:263\n*S KotlinDebug\n*F\n+ 1 NavDestinationBuilder.kt\nandroidx/navigation/NavDestinationBuilder\n*L\n152#1:261,2\n158#1:265,2\n155#1:263,2\n*E\n"})
/* loaded from: classes2.dex */
public class NavDestinationBuilder<D extends NavDestination> {

    @l
    private Map<Integer, NavAction> actions;

    @l
    private Map<String, NavArgument> arguments;

    @l
    private List<NavDeepLink> deepLinks;
    private final int id;

    @m
    private CharSequence label;

    @l
    private final Navigator<? extends D> navigator;

    @m
    private final String route;

    public NavDestinationBuilder(@l Navigator<? extends D> navigator, @IdRes int i5, @m String str) {
        l0.p(navigator, "navigator");
        this.navigator = navigator;
        this.id = i5;
        this.route = str;
        this.arguments = new LinkedHashMap();
        this.deepLinks = new ArrayList();
        this.actions = new LinkedHashMap();
    }

    @k(message = "Building NavDestinations using IDs with the Kotlin DSL has been deprecated in favor of using routes. When using routes there is no need for actions.")
    public final void action(int i5, @l v3.l<? super NavActionBuilder, r2> actionBuilder) {
        l0.p(actionBuilder, "actionBuilder");
        Map<Integer, NavAction> map = this.actions;
        Integer valueOf = Integer.valueOf(i5);
        NavActionBuilder navActionBuilder = new NavActionBuilder();
        actionBuilder.invoke(navActionBuilder);
        map.put(valueOf, navActionBuilder.build$navigation_common_release());
    }

    public final void argument(@l String name, @l v3.l<? super NavArgumentBuilder, r2> argumentBuilder) {
        l0.p(name, "name");
        l0.p(argumentBuilder, "argumentBuilder");
        Map<String, NavArgument> map = this.arguments;
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        argumentBuilder.invoke(navArgumentBuilder);
        map.put(name, navArgumentBuilder.build());
    }

    @l
    public D build() {
        D createDestination = this.navigator.createDestination();
        createDestination.setLabel(this.label);
        for (Map.Entry<String, NavArgument> entry : this.arguments.entrySet()) {
            createDestination.addArgument(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.deepLinks.iterator();
        while (it.hasNext()) {
            createDestination.addDeepLink((NavDeepLink) it.next());
        }
        for (Map.Entry<Integer, NavAction> entry2 : this.actions.entrySet()) {
            createDestination.putAction(entry2.getKey().intValue(), entry2.getValue());
        }
        String str = this.route;
        if (str != null) {
            createDestination.setRoute(str);
        }
        int i5 = this.id;
        if (i5 != -1) {
            createDestination.setId(i5);
        }
        return createDestination;
    }

    public final void deepLink(@l String uriPattern) {
        l0.p(uriPattern, "uriPattern");
        this.deepLinks.add(new NavDeepLink(uriPattern));
    }

    public final int getId() {
        return this.id;
    }

    @m
    public final CharSequence getLabel() {
        return this.label;
    }

    @l
    protected final Navigator<? extends D> getNavigator() {
        return this.navigator;
    }

    @m
    public final String getRoute() {
        return this.route;
    }

    public final void setLabel(@m CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void deepLink(@l v3.l<? super NavDeepLinkDslBuilder, r2> navDeepLink) {
        l0.p(navDeepLink, "navDeepLink");
        List<NavDeepLink> list = this.deepLinks;
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        navDeepLink.invoke(navDeepLinkDslBuilder);
        list.add(navDeepLinkDslBuilder.build$navigation_common_release());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @k(message = "Use routes to build your NavDestination instead", replaceWith = @b1(expression = "NavDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public NavDestinationBuilder(@l Navigator<? extends D> navigator, @IdRes int i5) {
        this(navigator, i5, null);
        l0.p(navigator, "navigator");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(@l Navigator<? extends D> navigator, @m String str) {
        this(navigator, -1, str);
        l0.p(navigator, "navigator");
    }
}
