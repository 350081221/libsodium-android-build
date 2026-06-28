package okhttp3;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.w;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;

@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/Certificate;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
final class Handshake$peerCertificates$2 extends n0 implements v3.a<List<? extends Certificate>> {
    final /* synthetic */ v3.a<List<Certificate>> $peerCertificatesFn;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Handshake$peerCertificates$2(v3.a<? extends List<? extends Certificate>> aVar) {
        super(0);
        this.$peerCertificatesFn = aVar;
    }

    @Override // v3.a
    @l
    public final List<? extends Certificate> invoke() {
        List<? extends Certificate> E;
        try {
            return this.$peerCertificatesFn.invoke();
        } catch (SSLPeerUnverifiedException unused) {
            E = w.E();
            return E;
        }
    }
}
