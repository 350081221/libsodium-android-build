package okhttp3;

import com.android.multidex.ClassPathElement;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import external.org.apache.commons.lang3.d;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.b1;
import kotlin.collections.e0;
import kotlin.collections.p;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.u1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.f0;
import okhttp3.internal.tls.CertificateChainCleaner;
import okio.n;
import p4.l;
import p4.m;
import u3.e;

@i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\r\u0018\u0000 &2\u00020\u0001:\u0003'&(B#\b\u0000\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b$\u0010%J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\tH\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\u000fJ\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u001d\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lokhttp3/CertificatePinner;", "", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "Lkotlin/r2;", "check", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "check$okhttp", "(Ljava/lang/String;Lv3/a;)V", "", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "Lokhttp3/CertificatePinner$Pin;", "findMatchingPins", "Lokhttp3/internal/tls/CertificateChainCleaner;", "certificateChainCleaner", "withCertificateChainCleaner$okhttp", "(Lokhttp3/internal/tls/CertificateChainCleaner;)Lokhttp3/CertificatePinner;", "withCertificateChainCleaner", "other", "", "equals", "", TTDownloadField.TT_HASHCODE, "", "pins", "Ljava/util/Set;", "getPins", "()Ljava/util/Set;", "Lokhttp3/internal/tls/CertificateChainCleaner;", "getCertificateChainCleaner$okhttp", "()Lokhttp3/internal/tls/CertificateChainCleaner;", "<init>", "(Ljava/util/Set;Lokhttp3/internal/tls/CertificateChainCleaner;)V", "Companion", "Builder", "Pin", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,370:1\n625#2,8:371\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner\n*L\n216#1:371,8\n*E\n"})
/* loaded from: classes4.dex */
public final class CertificatePinner {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    @e
    public static final CertificatePinner DEFAULT = new Builder().build();

    @m
    private final CertificateChainCleaner certificateChainCleaner;

    @l
    private final Set<Pin> pins;

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J'\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u000b\"\u00020\n¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Lokhttp3/CertificatePinner$Builder;", "", "()V", "pins", "", "Lokhttp3/CertificatePinner$Pin;", "getPins", "()Ljava/util/List;", "add", "pattern", "", "", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/CertificatePinner$Builder;", "build", "Lokhttp3/CertificatePinner;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Builder {

        @l
        private final List<Pin> pins = new ArrayList();

        @l
        public final Builder add(@l String pattern, @l String... pins) {
            l0.p(pattern, "pattern");
            l0.p(pins, "pins");
            for (String str : pins) {
                this.pins.add(new Pin(pattern, str));
            }
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @l
        public final CertificatePinner build() {
            Set X5;
            X5 = e0.X5(this.pins);
            return new CertificatePinner(X5, null, 2, 0 == true ? 1 : 0);
        }

        @l
        public final List<Pin> getPins() {
            return this.pins;
        }
    }

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lokhttp3/CertificatePinner$Companion;", "", "Ljava/security/cert/X509Certificate;", "Lokio/n;", "sha1Hash", "sha256Hash", "Ljava/security/cert/Certificate;", "certificate", "", "pin", "Lokhttp3/CertificatePinner;", "DEFAULT", "Lokhttp3/CertificatePinner;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n1#2:371\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        @u3.m
        public final String pin(@l Certificate certificate) {
            l0.p(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                return "sha256/" + sha256Hash((X509Certificate) certificate).base64();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        @l
        @u3.m
        public final n sha1Hash(@l X509Certificate x509Certificate) {
            l0.p(x509Certificate, "<this>");
            n.a aVar = n.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            l0.o(encoded, "publicKey.encoded");
            return n.a.p(aVar, encoded, 0, 0, 3, null).sha1();
        }

        @l
        @u3.m
        public final n sha256Hash(@l X509Certificate x509Certificate) {
            l0.p(x509Certificate, "<this>");
            n.a aVar = n.Companion;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            l0.o(encoded, "publicKey.encoded");
            return n.a.p(aVar, encoded, 0, 0, 3, null).sha256();
        }
    }

    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lokhttp3/CertificatePinner$Pin;", "", "", "hostname", "", "matchesHostname", "Ljava/security/cert/X509Certificate;", "certificate", "matchesCertificate", "toString", "other", "equals", "", TTDownloadField.TT_HASHCODE, "pattern", "Ljava/lang/String;", "getPattern", "()Ljava/lang/String;", "hashAlgorithm", "getHashAlgorithm", "Lokio/n;", "hash", "Lokio/n;", "getHash", "()Lokio/n;", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Pin {

        @l
        private final n hash;

        @l
        private final String hashAlgorithm;

        @l
        private final String pattern;

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0039, code lost:
        
            if (r0 != (-1)) goto L10;
         */
        /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
        
            if (r0 != (-1)) goto L6;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x004d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Pin(@p4.l java.lang.String r12, @p4.l java.lang.String r13) {
            /*
                Method dump skipped, instructions count: 266
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CertificatePinner.Pin.<init>(java.lang.String, java.lang.String):void");
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            if (l0.g(this.pattern, pin.pattern) && l0.g(this.hashAlgorithm, pin.hashAlgorithm) && l0.g(this.hash, pin.hash)) {
                return true;
            }
            return false;
        }

        @l
        public final n getHash() {
            return this.hash;
        }

        @l
        public final String getHashAlgorithm() {
            return this.hashAlgorithm;
        }

        @l
        public final String getPattern() {
            return this.pattern;
        }

        public int hashCode() {
            return (((this.pattern.hashCode() * 31) + this.hashAlgorithm.hashCode()) * 31) + this.hash.hashCode();
        }

        public final boolean matchesCertificate(@l X509Certificate certificate) {
            l0.p(certificate, "certificate");
            String str = this.hashAlgorithm;
            if (l0.g(str, "sha256")) {
                return l0.g(this.hash, CertificatePinner.Companion.sha256Hash(certificate));
            }
            if (l0.g(str, "sha1")) {
                return l0.g(this.hash, CertificatePinner.Companion.sha1Hash(certificate));
            }
            return false;
        }

        public final boolean matchesHostname(@l String hostname) {
            boolean s22;
            boolean s23;
            boolean d22;
            int C3;
            boolean d23;
            l0.p(hostname, "hostname");
            s22 = kotlin.text.e0.s2(this.pattern, "**.", false, 2, null);
            if (s22) {
                int length = this.pattern.length() - 3;
                int length2 = hostname.length() - length;
                d23 = kotlin.text.e0.d2(hostname, hostname.length() - length, this.pattern, 3, length, false, 16, null);
                if (!d23) {
                    return false;
                }
                if (length2 != 0 && hostname.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else {
                s23 = kotlin.text.e0.s2(this.pattern, "*.", false, 2, null);
                if (s23) {
                    int length3 = this.pattern.length() - 1;
                    int length4 = hostname.length() - length3;
                    d22 = kotlin.text.e0.d2(hostname, hostname.length() - length3, this.pattern, 1, length3, false, 16, null);
                    if (!d22) {
                        return false;
                    }
                    C3 = f0.C3(hostname, d.f15957a, length4 - 1, false, 4, null);
                    if (C3 != -1) {
                        return false;
                    }
                } else {
                    return l0.g(hostname, this.pattern);
                }
            }
            return true;
        }

        @l
        public String toString() {
            return this.hashAlgorithm + ClassPathElement.SEPARATOR_CHAR + this.hash.base64();
        }
    }

    public CertificatePinner(@l Set<Pin> pins, @m CertificateChainCleaner certificateChainCleaner) {
        l0.p(pins, "pins");
        this.pins = pins;
        this.certificateChainCleaner = certificateChainCleaner;
    }

    @l
    @u3.m
    public static final String pin(@l Certificate certificate) {
        return Companion.pin(certificate);
    }

    @l
    @u3.m
    public static final n sha1Hash(@l X509Certificate x509Certificate) {
        return Companion.sha1Hash(x509Certificate);
    }

    @l
    @u3.m
    public static final n sha256Hash(@l X509Certificate x509Certificate) {
        return Companion.sha256Hash(x509Certificate);
    }

    public final void check(@l String hostname, @l List<? extends Certificate> peerCertificates) throws SSLPeerUnverifiedException {
        l0.p(hostname, "hostname");
        l0.p(peerCertificates, "peerCertificates");
        check$okhttp(hostname, new CertificatePinner$check$1(this, peerCertificates, hostname));
    }

    public final void check$okhttp(@l String hostname, @l v3.a<? extends List<? extends X509Certificate>> cleanedPeerCertificatesFn) {
        l0.p(hostname, "hostname");
        l0.p(cleanedPeerCertificatesFn, "cleanedPeerCertificatesFn");
        List<Pin> findMatchingPins = findMatchingPins(hostname);
        if (findMatchingPins.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> invoke = cleanedPeerCertificatesFn.invoke();
        for (X509Certificate x509Certificate : invoke) {
            n nVar = null;
            n nVar2 = null;
            for (Pin pin : findMatchingPins) {
                String hashAlgorithm = pin.getHashAlgorithm();
                if (l0.g(hashAlgorithm, "sha256")) {
                    if (nVar == null) {
                        nVar = Companion.sha256Hash(x509Certificate);
                    }
                    if (l0.g(pin.getHash(), nVar)) {
                        return;
                    }
                } else if (l0.g(hashAlgorithm, "sha1")) {
                    if (nVar2 == null) {
                        nVar2 = Companion.sha1Hash(x509Certificate);
                    }
                    if (l0.g(pin.getHash(), nVar2)) {
                        return;
                    }
                } else {
                    throw new AssertionError("unsupported hashAlgorithm: " + pin.getHashAlgorithm());
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Certificate pinning failure!");
        sb.append("\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : invoke) {
            sb.append("\n    ");
            sb.append(Companion.pin(x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(hostname);
        sb.append(":");
        for (Pin pin2 : findMatchingPins) {
            sb.append("\n    ");
            sb.append(pin2);
        }
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb2);
    }

    public boolean equals(@m Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (l0.g(certificatePinner.pins, this.pins) && l0.g(certificatePinner.certificateChainCleaner, this.certificateChainCleaner)) {
                return true;
            }
        }
        return false;
    }

    @l
    public final List<Pin> findMatchingPins(@l String hostname) {
        List<Pin> E;
        l0.p(hostname, "hostname");
        Set<Pin> set = this.pins;
        E = kotlin.collections.w.E();
        for (Object obj : set) {
            if (((Pin) obj).matchesHostname(hostname)) {
                if (E.isEmpty()) {
                    E = new ArrayList<>();
                }
                l0.n(E, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                u1.g(E).add(obj);
            }
        }
        return E;
    }

    @m
    public final CertificateChainCleaner getCertificateChainCleaner$okhttp() {
        return this.certificateChainCleaner;
    }

    @l
    public final Set<Pin> getPins() {
        return this.pins;
    }

    public int hashCode() {
        int i5;
        int hashCode = (1517 + this.pins.hashCode()) * 41;
        CertificateChainCleaner certificateChainCleaner = this.certificateChainCleaner;
        if (certificateChainCleaner != null) {
            i5 = certificateChainCleaner.hashCode();
        } else {
            i5 = 0;
        }
        return hashCode + i5;
    }

    @l
    public final CertificatePinner withCertificateChainCleaner$okhttp(@l CertificateChainCleaner certificateChainCleaner) {
        l0.p(certificateChainCleaner, "certificateChainCleaner");
        if (l0.g(this.certificateChainCleaner, certificateChainCleaner)) {
            return this;
        }
        return new CertificatePinner(this.pins, certificateChainCleaner);
    }

    @k(message = "replaced with {@link #check(String, List)}.", replaceWith = @b1(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void check(@l String hostname, @l Certificate... peerCertificates) throws SSLPeerUnverifiedException {
        List<? extends Certificate> Jy;
        l0.p(hostname, "hostname");
        l0.p(peerCertificates, "peerCertificates");
        Jy = p.Jy(peerCertificates);
        check(hostname, Jy);
    }

    public /* synthetic */ CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner, int i5, w wVar) {
        this(set, (i5 & 2) != 0 ? null : certificateChainCleaner);
    }
}
