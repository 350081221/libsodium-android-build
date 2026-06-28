package okhttp3;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.k;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\b(J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0015H\u0007¢\u0006\u0002\b)J\r\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\b*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0015\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020\u0000H\u0000¢\u0006\u0002\b0J\b\u00101\u001a\u00020\u0005H\u0016J\u000f\u0010\f\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0002\b2J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007¢\u0006\u0002\b3J\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0002\b4J\r\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\b5J\r\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\b6J\r\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b7J\u000f\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0002\b8J\b\u00109\u001a\u00020\u0003H\u0016J\r\u0010%\u001a\u00020&H\u0007¢\u0006\u0002\b:R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001cR\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u00158G¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u001dR\u0013\u0010\u0006\u001a\u00020\u00078\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u001eR\u0015\u0010\f\u001a\u0004\u0018\u00010\r8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001fR\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158G¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001dR\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010 R\u0013\u0010\u0010\u001a\u00020\u00118\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010!R\u0013\u0010\u0019\u001a\u00020\u001a8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\"R\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010#R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010$R\u0013\u0010%\u001a\u00020&8G¢\u0006\b\n\u0000\u001a\u0004\b%\u0010'¨\u0006;"}, d2 = {"Lokhttp3/Address;", "", "uriHost", "", "uriPort", "", "dns", "Lokhttp3/Dns;", "socketFactory", "Ljavax/net/SocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/SSLSocketFactory;", "hostnameVerifier", "Ljavax/net/ssl/HostnameVerifier;", "certificatePinner", "Lokhttp3/CertificatePinner;", "proxyAuthenticator", "Lokhttp3/Authenticator;", "proxy", "Ljava/net/Proxy;", "protocols", "", "Lokhttp3/Protocol;", "connectionSpecs", "Lokhttp3/ConnectionSpec;", "proxySelector", "Ljava/net/ProxySelector;", "(Ljava/lang/String;ILokhttp3/Dns;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Lokhttp3/CertificatePinner;Lokhttp3/Authenticator;Ljava/net/Proxy;Ljava/util/List;Ljava/util/List;Ljava/net/ProxySelector;)V", "()Lokhttp3/CertificatePinner;", "()Ljava/util/List;", "()Lokhttp3/Dns;", "()Ljavax/net/ssl/HostnameVerifier;", "()Ljava/net/Proxy;", "()Lokhttp3/Authenticator;", "()Ljava/net/ProxySelector;", "()Ljavax/net/SocketFactory;", "()Ljavax/net/ssl/SSLSocketFactory;", "url", "Lokhttp3/HttpUrl;", "()Lokhttp3/HttpUrl;", "-deprecated_certificatePinner", "-deprecated_connectionSpecs", "-deprecated_dns", "equals", "", "other", "equalsNonHost", "that", "equalsNonHost$okhttp", TTDownloadField.TT_HASHCODE, "-deprecated_hostnameVerifier", "-deprecated_protocols", "-deprecated_proxy", "-deprecated_proxyAuthenticator", "-deprecated_proxySelector", "-deprecated_socketFactory", "-deprecated_sslSocketFactory", "toString", "-deprecated_url", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Address {

    @m
    private final CertificatePinner certificatePinner;

    @l
    private final List<ConnectionSpec> connectionSpecs;

    @l
    private final Dns dns;

    @m
    private final HostnameVerifier hostnameVerifier;

    @l
    private final List<Protocol> protocols;

    @m
    private final Proxy proxy;

    @l
    private final Authenticator proxyAuthenticator;

    @l
    private final ProxySelector proxySelector;

    @l
    private final SocketFactory socketFactory;

    @m
    private final SSLSocketFactory sslSocketFactory;

    @l
    private final HttpUrl url;

    public Address(@l String uriHost, int i5, @l Dns dns, @l SocketFactory socketFactory, @m SSLSocketFactory sSLSocketFactory, @m HostnameVerifier hostnameVerifier, @m CertificatePinner certificatePinner, @l Authenticator proxyAuthenticator, @m Proxy proxy, @l List<? extends Protocol> protocols, @l List<ConnectionSpec> connectionSpecs, @l ProxySelector proxySelector) {
        l0.p(uriHost, "uriHost");
        l0.p(dns, "dns");
        l0.p(socketFactory, "socketFactory");
        l0.p(proxyAuthenticator, "proxyAuthenticator");
        l0.p(protocols, "protocols");
        l0.p(connectionSpecs, "connectionSpecs");
        l0.p(proxySelector, "proxySelector");
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = proxyAuthenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : "http").host(uriHost).port(i5).build();
        this.protocols = Util.toImmutableList(protocols);
        this.connectionSpecs = Util.toImmutableList(connectionSpecs);
    }

    @h(name = "-deprecated_certificatePinner")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "certificatePinner", imports = {}))
    @m
    /* renamed from: -deprecated_certificatePinner, reason: not valid java name */
    public final CertificatePinner m6457deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    @l
    @h(name = "-deprecated_connectionSpecs")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "connectionSpecs", imports = {}))
    /* renamed from: -deprecated_connectionSpecs, reason: not valid java name */
    public final List<ConnectionSpec> m6458deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    @l
    @h(name = "-deprecated_dns")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "dns", imports = {}))
    /* renamed from: -deprecated_dns, reason: not valid java name */
    public final Dns m6459deprecated_dns() {
        return this.dns;
    }

    @h(name = "-deprecated_hostnameVerifier")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "hostnameVerifier", imports = {}))
    @m
    /* renamed from: -deprecated_hostnameVerifier, reason: not valid java name */
    public final HostnameVerifier m6460deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @l
    @h(name = "-deprecated_protocols")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "protocols", imports = {}))
    /* renamed from: -deprecated_protocols, reason: not valid java name */
    public final List<Protocol> m6461deprecated_protocols() {
        return this.protocols;
    }

    @h(name = "-deprecated_proxy")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxy", imports = {}))
    @m
    /* renamed from: -deprecated_proxy, reason: not valid java name */
    public final Proxy m6462deprecated_proxy() {
        return this.proxy;
    }

    @l
    @h(name = "-deprecated_proxyAuthenticator")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxyAuthenticator", imports = {}))
    /* renamed from: -deprecated_proxyAuthenticator, reason: not valid java name */
    public final Authenticator m6463deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @l
    @h(name = "-deprecated_proxySelector")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "proxySelector", imports = {}))
    /* renamed from: -deprecated_proxySelector, reason: not valid java name */
    public final ProxySelector m6464deprecated_proxySelector() {
        return this.proxySelector;
    }

    @l
    @h(name = "-deprecated_socketFactory")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "socketFactory", imports = {}))
    /* renamed from: -deprecated_socketFactory, reason: not valid java name */
    public final SocketFactory m6465deprecated_socketFactory() {
        return this.socketFactory;
    }

    @h(name = "-deprecated_sslSocketFactory")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "sslSocketFactory", imports = {}))
    @m
    /* renamed from: -deprecated_sslSocketFactory, reason: not valid java name */
    public final SSLSocketFactory m6466deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @l
    @h(name = "-deprecated_url")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "url", imports = {}))
    /* renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m6467deprecated_url() {
        return this.url;
    }

    @h(name = "certificatePinner")
    @m
    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    @l
    @h(name = "connectionSpecs")
    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    @l
    @h(name = "dns")
    public final Dns dns() {
        return this.dns;
    }

    public boolean equals(@m Object obj) {
        if (obj instanceof Address) {
            Address address = (Address) obj;
            if (l0.g(this.url, address.url) && equalsNonHost$okhttp(address)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equalsNonHost$okhttp(@l Address that) {
        l0.p(that, "that");
        if (l0.g(this.dns, that.dns) && l0.g(this.proxyAuthenticator, that.proxyAuthenticator) && l0.g(this.protocols, that.protocols) && l0.g(this.connectionSpecs, that.connectionSpecs) && l0.g(this.proxySelector, that.proxySelector) && l0.g(this.proxy, that.proxy) && l0.g(this.sslSocketFactory, that.sslSocketFactory) && l0.g(this.hostnameVerifier, that.hostnameVerifier) && l0.g(this.certificatePinner, that.certificatePinner) && this.url.port() == that.url.port()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.url.hashCode()) * 31) + this.dns.hashCode()) * 31) + this.proxyAuthenticator.hashCode()) * 31) + this.protocols.hashCode()) * 31) + this.connectionSpecs.hashCode()) * 31) + this.proxySelector.hashCode()) * 31) + Objects.hashCode(this.proxy)) * 31) + Objects.hashCode(this.sslSocketFactory)) * 31) + Objects.hashCode(this.hostnameVerifier)) * 31) + Objects.hashCode(this.certificatePinner);
    }

    @h(name = "hostnameVerifier")
    @m
    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    @l
    @h(name = "protocols")
    public final List<Protocol> protocols() {
        return this.protocols;
    }

    @h(name = "proxy")
    @m
    public final Proxy proxy() {
        return this.proxy;
    }

    @l
    @h(name = "proxyAuthenticator")
    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    @l
    @h(name = "proxySelector")
    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    @l
    @h(name = "socketFactory")
    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    @h(name = "sslSocketFactory")
    @m
    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    @l
    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Address{");
        sb2.append(this.url.host());
        sb2.append(':');
        sb2.append(this.url.port());
        sb2.append(", ");
        if (this.proxy != null) {
            sb = new StringBuilder();
            sb.append("proxy=");
            obj = this.proxy;
        } else {
            sb = new StringBuilder();
            sb.append("proxySelector=");
            obj = this.proxySelector;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append('}');
        return sb2.toString();
    }

    @l
    @h(name = "url")
    public final HttpUrl url() {
        return this.url;
    }
}
