package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.b0;
import kotlin.collections.v;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Route;
import okhttp3.internal.Util;
import p4.l;

@i0(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 (2\u00020\u0001:\u0002()B'\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b&\u0010'J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\t\u0010\f\u001a\u00020\bH\u0086\u0002J\t\u0010\u000e\u001a\u00020\rH\u0086\u0002R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u001d¨\u0006*"}, d2 = {"Lokhttp3/internal/connection/RouteSelector;", "", "Lokhttp3/HttpUrl;", "url", "Ljava/net/Proxy;", "proxy", "Lkotlin/r2;", "resetNextProxy", "", "hasNextProxy", "nextProxy", "resetNextInetSocketAddress", "hasNext", "Lokhttp3/internal/connection/RouteSelector$Selection;", "next", "Lokhttp3/Address;", "address", "Lokhttp3/Address;", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "Lokhttp3/Call;", NotificationCompat.CATEGORY_CALL, "Lokhttp3/Call;", "Lokhttp3/EventListener;", "eventListener", "Lokhttp3/EventListener;", "", "proxies", "Ljava/util/List;", "", "nextProxyIndex", "I", "Ljava/net/InetSocketAddress;", "inetSocketAddresses", "", "Lokhttp3/Route;", "postponedRoutes", "<init>", "(Lokhttp3/Address;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/Call;Lokhttp3/EventListener;)V", "Companion", "Selection", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class RouteSelector {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final Address address;

    @l
    private final Call call;

    @l
    private final EventListener eventListener;

    @l
    private List<? extends InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;

    @l
    private final List<Route> postponedRoutes;

    @l
    private List<? extends Proxy> proxies;

    @l
    private final RouteDatabase routeDatabase;

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", "", "()V", "socketHost", "", "Ljava/net/InetSocketAddress;", "getSocketHost", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final String getSocketHost(@l InetSocketAddress inetSocketAddress) {
            l0.p(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                l0.o(hostName, "hostName");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            l0.o(hostAddress, "address.hostAddress");
            return hostAddress;
        }
    }

    @i0(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\n\u001a\u00020\u000bH\u0086\u0002J\t\u0010\f\u001a\u00020\u0004H\u0086\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", "", "routes", "", "Lokhttp3/Route;", "(Ljava/util/List;)V", "nextRouteIndex", "", "getRoutes", "()Ljava/util/List;", "hasNext", "", "next", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Selection {
        private int nextRouteIndex;

        @l
        private final List<Route> routes;

        public Selection(@l List<Route> routes) {
            l0.p(routes, "routes");
            this.routes = routes;
        }

        @l
        public final List<Route> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            return this.nextRouteIndex < this.routes.size();
        }

        @l
        public final Route next() {
            if (hasNext()) {
                List<Route> list = this.routes;
                int i5 = this.nextRouteIndex;
                this.nextRouteIndex = i5 + 1;
                return list.get(i5);
            }
            throw new NoSuchElementException();
        }
    }

    public RouteSelector(@l Address address, @l RouteDatabase routeDatabase, @l Call call, @l EventListener eventListener) {
        List<? extends Proxy> E;
        List<? extends InetSocketAddress> E2;
        l0.p(address, "address");
        l0.p(routeDatabase, "routeDatabase");
        l0.p(call, "call");
        l0.p(eventListener, "eventListener");
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.eventListener = eventListener;
        E = kotlin.collections.w.E();
        this.proxies = E;
        E2 = kotlin.collections.w.E();
        this.inetSocketAddresses = E2;
        this.postponedRoutes = new ArrayList();
        resetNextProxy(address.url(), address.proxy());
    }

    private final boolean hasNextProxy() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private final Proxy nextProxy() throws IOException {
        if (hasNextProxy()) {
            List<? extends Proxy> list = this.proxies;
            int i5 = this.nextProxyIndex;
            this.nextProxyIndex = i5 + 1;
            Proxy proxy = list.get(i5);
            resetNextInetSocketAddress(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.address.url().host() + "; exhausted proxy configurations: " + this.proxies);
    }

    private final void resetNextInetSocketAddress(Proxy proxy) throws IOException {
        String host;
        int port;
        List<InetAddress> lookup;
        ArrayList arrayList = new ArrayList();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() != Proxy.Type.DIRECT && proxy.type() != Proxy.Type.SOCKS) {
            SocketAddress proxyAddress = proxy.address();
            if (proxyAddress instanceof InetSocketAddress) {
                Companion companion = Companion;
                l0.o(proxyAddress, "proxyAddress");
                InetSocketAddress inetSocketAddress = (InetSocketAddress) proxyAddress;
                host = companion.getSocketHost(inetSocketAddress);
                port = inetSocketAddress.getPort();
            } else {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + proxyAddress.getClass()).toString());
            }
        } else {
            host = this.address.url().host();
            port = this.address.url().port();
        }
        boolean z4 = false;
        if (1 <= port && port < 65536) {
            z4 = true;
        }
        if (z4) {
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList.add(InetSocketAddress.createUnresolved(host, port));
                return;
            }
            if (Util.canParseAsIpAddress(host)) {
                lookup = v.k(InetAddress.getByName(host));
            } else {
                this.eventListener.dnsStart(this.call, host);
                lookup = this.address.dns().lookup(host);
                if (!lookup.isEmpty()) {
                    this.eventListener.dnsEnd(this.call, host, lookup);
                } else {
                    throw new UnknownHostException(this.address.dns() + " returned no addresses for " + host);
                }
            }
            Iterator<InetAddress> it = lookup.iterator();
            while (it.hasNext()) {
                arrayList.add(new InetSocketAddress(it.next(), port));
            }
            return;
        }
        throw new SocketException("No route to " + host + ':' + port + "; port is out of range");
    }

    private final void resetNextProxy(HttpUrl httpUrl, Proxy proxy) {
        this.eventListener.proxySelectStart(this.call, httpUrl);
        List<Proxy> resetNextProxy$selectProxies = resetNextProxy$selectProxies(proxy, httpUrl, this);
        this.proxies = resetNextProxy$selectProxies;
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, httpUrl, resetNextProxy$selectProxies);
    }

    private static final List<Proxy> resetNextProxy$selectProxies(Proxy proxy, HttpUrl httpUrl, RouteSelector routeSelector) {
        boolean z4;
        List<Proxy> k5;
        if (proxy != null) {
            k5 = v.k(proxy);
            return k5;
        }
        URI uri = httpUrl.uri();
        if (uri.getHost() == null) {
            return Util.immutableListOf(Proxy.NO_PROXY);
        }
        List<Proxy> proxiesOrNull = routeSelector.address.proxySelector().select(uri);
        List<Proxy> list = proxiesOrNull;
        if (list != null && !list.isEmpty()) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            return Util.immutableListOf(Proxy.NO_PROXY);
        }
        l0.o(proxiesOrNull, "proxiesOrNull");
        return Util.toImmutableList(proxiesOrNull);
    }

    public final boolean hasNext() {
        return hasNextProxy() || (this.postponedRoutes.isEmpty() ^ true);
    }

    @l
    public final Selection next() throws IOException {
        if (hasNext()) {
            ArrayList arrayList = new ArrayList();
            while (hasNextProxy()) {
                Proxy nextProxy = nextProxy();
                Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
                while (it.hasNext()) {
                    Route route = new Route(this.address, nextProxy, it.next());
                    if (this.routeDatabase.shouldPostpone(route)) {
                        this.postponedRoutes.add(route);
                    } else {
                        arrayList.add(route);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                b0.n0(arrayList, this.postponedRoutes);
                this.postponedRoutes.clear();
            }
            return new Selection(arrayList);
        }
        throw new NoSuchElementException();
    }
}
