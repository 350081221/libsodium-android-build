package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.x;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import okhttp3.internal.tls.CertificateChainCleaner;
import p4.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nCertificatePinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$check$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,370:1\n1549#2:371\n1620#2,3:372\n*S KotlinDebug\n*F\n+ 1 CertificatePinner.kt\nokhttp3/CertificatePinner$check$1\n*L\n152#1:371\n152#1:372,3\n*E\n"})
/* loaded from: classes4.dex */
public final class CertificatePinner$check$1 extends n0 implements v3.a<List<? extends X509Certificate>> {
    final /* synthetic */ String $hostname;
    final /* synthetic */ List<Certificate> $peerCertificates;
    final /* synthetic */ CertificatePinner this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CertificatePinner$check$1(CertificatePinner certificatePinner, List<? extends Certificate> list, String str) {
        super(0);
        this.this$0 = certificatePinner;
        this.$peerCertificates = list;
        this.$hostname = str;
    }

    @Override // v3.a
    @l
    public final List<? extends X509Certificate> invoke() {
        List<Certificate> list;
        int Y;
        CertificateChainCleaner certificateChainCleaner$okhttp = this.this$0.getCertificateChainCleaner$okhttp();
        if (certificateChainCleaner$okhttp == null || (list = certificateChainCleaner$okhttp.clean(this.$peerCertificates, this.$hostname)) == null) {
            list = this.$peerCertificates;
        }
        List<Certificate> list2 = list;
        Y = x.Y(list2, 10);
        ArrayList arrayList = new ArrayList(Y);
        for (Certificate certificate : list2) {
            l0.n(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
