package androidx.navigation;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import p4.l;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Landroidx/navigation/NavDeepLinkDslBuilder;", "Lkotlin/r2;", "Lkotlin/u;", "deepLinkBuilder", "Landroidx/navigation/NavDeepLink;", "navDeepLink", "navigation-common_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class NavDeepLinkDslBuilderKt {
    @l
    public static final NavDeepLink navDeepLink(@l v3.l<? super NavDeepLinkDslBuilder, r2> deepLinkBuilder) {
        l0.p(deepLinkBuilder, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        deepLinkBuilder.invoke(navDeepLinkDslBuilder);
        return navDeepLinkDslBuilder.build$navigation_common_release();
    }
}
