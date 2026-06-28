package okhttp3;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.k;
import kotlin.m;
import p4.l;
import u3.h;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\r\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\u0012J\u0006\u0010\u0013\u001a\u00020\u000eJ\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0013\u0010\u0002\u001a\u00020\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\tR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\nR\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0017"}, d2 = {"Lokhttp3/Route;", "", "address", "Lokhttp3/Address;", "proxy", "Ljava/net/Proxy;", "socketAddress", "Ljava/net/InetSocketAddress;", "(Lokhttp3/Address;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "()Lokhttp3/Address;", "()Ljava/net/Proxy;", "()Ljava/net/InetSocketAddress;", "-deprecated_address", "equals", "", "other", TTDownloadField.TT_HASHCODE, "", "-deprecated_proxy", "requiresTunnel", "-deprecated_socketAddress", "toString", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Route {

    @l
    private final Address address;

    @l
    private final Proxy proxy;

    @l
    private final InetSocketAddress socketAddress;

    public Route(@l Address address, @l Proxy proxy, @l InetSocketAddress socketAddress) {
        l0.p(address, "address");
        l0.p(proxy, "proxy");
        l0.p(socketAddress, "socketAddress");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = socketAddress;
    }

    @l
    @h(name = "-deprecated_address")
    @k(level = m.ERROR, message = "moved to val", replaceWith = @b1(expression = "address", imports = {}))
    /* renamed from: -deprecated_address, reason: not valid java name */
    public final Address m6587deprecated_address() {
        return this.address;
    }

    @l
    @h(name = "-deprecated_proxy")
    @k(level = m.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxy", imports = {}))
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m6588deprecated_proxy() {
        return this.proxy;
    }

    @l
    @h(name = "-deprecated_socketAddress")
    @k(level = m.ERROR, message = "moved to val", replaceWith = @b1(expression = "socketAddress", imports = {}))
    /* renamed from: -deprecated_socketAddress, reason: not valid java name */
    public final InetSocketAddress m6589deprecated_socketAddress() {
        return this.socketAddress;
    }

    @l
    @h(name = "address")
    public final Address address() {
        return this.address;
    }

    public boolean equals(@p4.m Object obj) {
        if (obj instanceof Route) {
            Route route = (Route) obj;
            if (l0.g(route.address, this.address) && l0.g(route.proxy, this.proxy) && l0.g(route.socketAddress, this.socketAddress)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    @l
    @h(name = "proxy")
    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    @l
    @h(name = "socketAddress")
    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    @l
    public String toString() {
        return "Route{" + this.socketAddress + '}';
    }
}
