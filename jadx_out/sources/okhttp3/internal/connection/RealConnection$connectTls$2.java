package okhttp3.internal.connection;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.x;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import okhttp3.Handshake;
import p4.l;
import v3.a;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Ljava/security/cert/X509Certificate;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nRealConnection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection$connectTls$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n1549#2:766\n1620#2,3:767\n*S KotlinDebug\n*F\n+ 1 RealConnection.kt\nokhttp3/internal/connection/RealConnection$connectTls$2\n*L\n411#1:766\n411#1:767,3\n*E\n"})
/* loaded from: classes4.dex */
public final class RealConnection$connectTls$2 extends n0 implements a<List<? extends X509Certificate>> {
    final /* synthetic */ RealConnection this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealConnection$connectTls$2(RealConnection realConnection) {
        super(0);
        this.this$0 = realConnection;
    }

    @Override // v3.a
    @l
    public final List<? extends X509Certificate> invoke() {
        Handshake handshake;
        int Y;
        handshake = this.this$0.handshake;
        l0.m(handshake);
        List<Certificate> peerCertificates = handshake.peerCertificates();
        Y = x.Y(peerCertificates, 10);
        ArrayList arrayList = new ArrayList(Y);
        for (Certificate certificate : peerCertificates) {
            l0.n(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificate);
        }
        return arrayList;
    }
}
