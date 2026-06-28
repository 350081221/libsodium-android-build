package okhttp3;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.b1;
import kotlin.collections.e0;
import kotlin.collections.x;
import kotlin.d0;
import kotlin.f0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import okhttp3.internal.Util;
import p4.l;
import u3.h;
import u3.m;

@i0(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 *2\u00020\u0001:\u0001*B;\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0&¢\u0006\u0004\b(\u0010)J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0007¢\u0006\u0004\b\u0013\u0010\rJ\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\b\u0015\u0010\u0011J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u0005\u0010\u0004R\u0017\u0010\t\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b\t\u0010\bR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0007¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b\u0014\u0010\rR!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u000e\u0010\rR\u0018\u0010%\u001a\u00020\u001c*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u000f8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006+"}, d2 = {"Lokhttp3/Handshake;", "", "Lokhttp3/TlsVersion;", "-deprecated_tlsVersion", "()Lokhttp3/TlsVersion;", "tlsVersion", "Lokhttp3/CipherSuite;", "-deprecated_cipherSuite", "()Lokhttp3/CipherSuite;", "cipherSuite", "", "Ljava/security/cert/Certificate;", "-deprecated_peerCertificates", "()Ljava/util/List;", "peerCertificates", "Ljava/security/Principal;", "-deprecated_peerPrincipal", "()Ljava/security/Principal;", "peerPrincipal", "-deprecated_localCertificates", "localCertificates", "-deprecated_localPrincipal", "localPrincipal", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "toString", "Lokhttp3/TlsVersion;", "Lokhttp3/CipherSuite;", "Ljava/util/List;", "peerCertificates$delegate", "Lkotlin/d0;", "getName", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lokhttp3/TlsVersion;Lokhttp3/CipherSuite;Ljava/util/List;Lv3/a;)V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1549#2:201\n1620#2,3:202\n1549#2:205\n1620#2,3:206\n*S KotlinDebug\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake\n*L\n129#1:201\n129#1:202,3\n134#1:205\n134#1:206,3\n*E\n"})
/* loaded from: classes4.dex */
public final class Handshake {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private final CipherSuite cipherSuite;

    @l
    private final List<Certificate> localCertificates;

    @l
    private final d0 peerCertificates$delegate;

    @l
    private final TlsVersion tlsVersion;

    /* JADX WARN: Multi-variable type inference failed */
    public Handshake(@l TlsVersion tlsVersion, @l CipherSuite cipherSuite, @l List<? extends Certificate> localCertificates, @l v3.a<? extends List<? extends Certificate>> peerCertificatesFn) {
        d0 c5;
        l0.p(tlsVersion, "tlsVersion");
        l0.p(cipherSuite, "cipherSuite");
        l0.p(localCertificates, "localCertificates");
        l0.p(peerCertificatesFn, "peerCertificatesFn");
        this.tlsVersion = tlsVersion;
        this.cipherSuite = cipherSuite;
        this.localCertificates = localCertificates;
        c5 = f0.c(new Handshake$peerCertificates$2(peerCertificatesFn));
        this.peerCertificates$delegate = c5;
    }

    @l
    @h(name = "get")
    @m
    public static final Handshake get(@l SSLSession sSLSession) throws IOException {
        return Companion.get(sSLSession);
    }

    @l
    @m
    public static final Handshake get(@l TlsVersion tlsVersion, @l CipherSuite cipherSuite, @l List<? extends Certificate> list, @l List<? extends Certificate> list2) {
        return Companion.get(tlsVersion, cipherSuite, list, list2);
    }

    private final String getName(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        l0.o(type, "type");
        return type;
    }

    @l
    @h(name = "-deprecated_cipherSuite")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "cipherSuite", imports = {}))
    /* renamed from: -deprecated_cipherSuite, reason: not valid java name */
    public final CipherSuite m6498deprecated_cipherSuite() {
        return this.cipherSuite;
    }

    @l
    @h(name = "-deprecated_localCertificates")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "localCertificates", imports = {}))
    /* renamed from: -deprecated_localCertificates, reason: not valid java name */
    public final List<Certificate> m6499deprecated_localCertificates() {
        return this.localCertificates;
    }

    @h(name = "-deprecated_localPrincipal")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "localPrincipal", imports = {}))
    @p4.m
    /* renamed from: -deprecated_localPrincipal, reason: not valid java name */
    public final Principal m6500deprecated_localPrincipal() {
        return localPrincipal();
    }

    @l
    @h(name = "-deprecated_peerCertificates")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "peerCertificates", imports = {}))
    /* renamed from: -deprecated_peerCertificates, reason: not valid java name */
    public final List<Certificate> m6501deprecated_peerCertificates() {
        return peerCertificates();
    }

    @h(name = "-deprecated_peerPrincipal")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "peerPrincipal", imports = {}))
    @p4.m
    /* renamed from: -deprecated_peerPrincipal, reason: not valid java name */
    public final Principal m6502deprecated_peerPrincipal() {
        return peerPrincipal();
    }

    @l
    @h(name = "-deprecated_tlsVersion")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "tlsVersion", imports = {}))
    /* renamed from: -deprecated_tlsVersion, reason: not valid java name */
    public final TlsVersion m6503deprecated_tlsVersion() {
        return this.tlsVersion;
    }

    @l
    @h(name = "cipherSuite")
    public final CipherSuite cipherSuite() {
        return this.cipherSuite;
    }

    public boolean equals(@p4.m Object obj) {
        if (obj instanceof Handshake) {
            Handshake handshake = (Handshake) obj;
            if (handshake.tlsVersion == this.tlsVersion && l0.g(handshake.cipherSuite, this.cipherSuite) && l0.g(handshake.peerCertificates(), peerCertificates()) && l0.g(handshake.localCertificates, this.localCertificates)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((527 + this.tlsVersion.hashCode()) * 31) + this.cipherSuite.hashCode()) * 31) + peerCertificates().hashCode()) * 31) + this.localCertificates.hashCode();
    }

    @l
    @h(name = "localCertificates")
    public final List<Certificate> localCertificates() {
        return this.localCertificates;
    }

    @h(name = "localPrincipal")
    @p4.m
    public final Principal localPrincipal() {
        Object D2;
        D2 = e0.D2(this.localCertificates);
        X509Certificate x509Certificate = D2 instanceof X509Certificate ? (X509Certificate) D2 : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @l
    @h(name = "peerCertificates")
    public final List<Certificate> peerCertificates() {
        return (List) this.peerCertificates$delegate.getValue();
    }

    @h(name = "peerPrincipal")
    @p4.m
    public final Principal peerPrincipal() {
        Object D2;
        D2 = e0.D2(peerCertificates());
        X509Certificate x509Certificate = D2 instanceof X509Certificate ? (X509Certificate) D2 : null;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @l
    @h(name = "tlsVersion")
    public final TlsVersion tlsVersion() {
        return this.tlsVersion;
    }

    @l
    public String toString() {
        int Y;
        int Y2;
        List<Certificate> peerCertificates = peerCertificates();
        Y = x.Y(peerCertificates, 10);
        ArrayList arrayList = new ArrayList(Y);
        Iterator<T> it = peerCertificates.iterator();
        while (it.hasNext()) {
            arrayList.add(getName((Certificate) it.next()));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.tlsVersion);
        sb.append(" cipherSuite=");
        sb.append(this.cipherSuite);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.localCertificates;
        Y2 = x.Y(list, 10);
        ArrayList arrayList2 = new ArrayList(Y2);
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(getName((Certificate) it2.next()));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }

    @i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\b\u0007J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007J\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0006H\u0007¢\u0006\u0002\b\u0003J!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r*\f\u0012\u0006\b\u0001\u0012\u00020\u000e\u0018\u00010\u0012H\u0002¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lokhttp3/Handshake$Companion;", "", "()V", "get", "Lokhttp3/Handshake;", "sslSession", "Ljavax/net/ssl/SSLSession;", "-deprecated_get", "tlsVersion", "Lokhttp3/TlsVersion;", "cipherSuite", "Lokhttp3/CipherSuite;", "peerCertificates", "", "Ljava/security/cert/Certificate;", "localCertificates", "handshake", "toImmutableList", "", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nHandshake.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Handshake.kt\nokhttp3/Handshake$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        private final List<Certificate> toImmutableList(Certificate[] certificateArr) {
            List<Certificate> E;
            if (certificateArr != null) {
                return Util.immutableListOf(Arrays.copyOf(certificateArr, certificateArr.length));
            }
            E = kotlin.collections.w.E();
            return E;
        }

        @l
        @h(name = "-deprecated_get")
        @k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @b1(expression = "sslSession.handshake()", imports = {}))
        /* renamed from: -deprecated_get, reason: not valid java name */
        public final Handshake m6504deprecated_get(@l SSLSession sslSession) throws IOException {
            l0.p(sslSession, "sslSession");
            return get(sslSession);
        }

        @l
        @h(name = "get")
        @m
        public final Handshake get(@l SSLSession sSLSession) throws IOException {
            List<Certificate> E;
            l0.p(sSLSession, "<this>");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                if (!(l0.g(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : l0.g(cipherSuite, "SSL_NULL_WITH_NULL_NULL"))) {
                    CipherSuite forJavaName = CipherSuite.Companion.forJavaName(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol != null) {
                        if (!l0.g("NONE", protocol)) {
                            TlsVersion forJavaName2 = TlsVersion.Companion.forJavaName(protocol);
                            try {
                                E = toImmutableList(sSLSession.getPeerCertificates());
                            } catch (SSLPeerUnverifiedException unused) {
                                E = kotlin.collections.w.E();
                            }
                            return new Handshake(forJavaName2, forJavaName, toImmutableList(sSLSession.getLocalCertificates()), new Handshake$Companion$handshake$1(E));
                        }
                        throw new IOException("tlsVersion == NONE");
                    }
                    throw new IllegalStateException("tlsVersion == null".toString());
                }
                throw new IOException("cipherSuite == " + cipherSuite);
            }
            throw new IllegalStateException("cipherSuite == null".toString());
        }

        @l
        @m
        public final Handshake get(@l TlsVersion tlsVersion, @l CipherSuite cipherSuite, @l List<? extends Certificate> peerCertificates, @l List<? extends Certificate> localCertificates) {
            l0.p(tlsVersion, "tlsVersion");
            l0.p(cipherSuite, "cipherSuite");
            l0.p(peerCertificates, "peerCertificates");
            l0.p(localCertificates, "localCertificates");
            return new Handshake(tlsVersion, cipherSuite, Util.toImmutableList(localCertificates), new Handshake$Companion$get$1(Util.toImmutableList(peerCertificates)));
        }
    }
}
