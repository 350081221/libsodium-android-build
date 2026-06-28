package okhttp3.internal.connection;

import a1.h;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import okhttp3.Route;
import p4.l;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010#\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u0002R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/connection/RouteDatabase;", "", "Lokhttp3/Route;", "failedRoute", "Lkotlin/r2;", h.f116i, "route", "connected", "", "shouldPostpone", "", "failedRoutes", "Ljava/util/Set;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class RouteDatabase {

    @l
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final synchronized void connected(@l Route route) {
        l0.p(route, "route");
        this.failedRoutes.remove(route);
    }

    public final synchronized void failed(@l Route failedRoute) {
        l0.p(failedRoute, "failedRoute");
        this.failedRoutes.add(failedRoute);
    }

    public final synchronized boolean shouldPostpone(@l Route route) {
        l0.p(route, "route");
        return this.failedRoutes.contains(route);
    }
}
