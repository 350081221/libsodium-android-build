package okio;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.IOException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@kotlin.i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u001f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0002\b\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0015H\u0016R\u0011\u0010\u0010\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lokio/HashingSource;", "Lokio/ForwardingSource;", "Lokio/Source;", "source", "digest", "Ljava/security/MessageDigest;", "(Lokio/Source;Ljava/security/MessageDigest;)V", "algorithm", "", "(Lokio/Source;Ljava/lang/String;)V", "mac", "Ljavax/crypto/Mac;", "(Lokio/Source;Ljavax/crypto/Mac;)V", DatabaseFileArchive.COLUMN_KEY, "Lokio/ByteString;", "(Lokio/Source;Lokio/ByteString;Ljava/lang/String;)V", "hash", "()Lokio/ByteString;", "messageDigest", "-deprecated_hash", "read", "", "sink", "Lokio/Buffer;", "byteCount", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c0 extends x implements n1 {

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    public static final a f20868c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private final MessageDigest f20869a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private final Mac f20870b;

    @kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lokio/HashingSource$Companion;", "", "()V", "hmacSha1", "Lokio/HashingSource;", "source", "Lokio/Source;", DatabaseFileArchive.COLUMN_KEY, "Lokio/ByteString;", "hmacSha256", "hmacSha512", TTDownloadField.TT_MD5, "sha1", "sha256", "sha512", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        @u3.m
        public final c0 a(@p4.l n1 source, @p4.l n key) {
            kotlin.jvm.internal.l0.p(source, "source");
            kotlin.jvm.internal.l0.p(key, "key");
            return new c0(source, key, "HmacSHA1");
        }

        @p4.l
        @u3.m
        public final c0 b(@p4.l n1 source, @p4.l n key) {
            kotlin.jvm.internal.l0.p(source, "source");
            kotlin.jvm.internal.l0.p(key, "key");
            return new c0(source, key, "HmacSHA256");
        }

        @p4.l
        @u3.m
        public final c0 c(@p4.l n1 source, @p4.l n key) {
            kotlin.jvm.internal.l0.p(source, "source");
            kotlin.jvm.internal.l0.p(key, "key");
            return new c0(source, key, "HmacSHA512");
        }

        @p4.l
        @u3.m
        public final c0 d(@p4.l n1 source) {
            kotlin.jvm.internal.l0.p(source, "source");
            return new c0(source, "MD5");
        }

        @p4.l
        @u3.m
        public final c0 e(@p4.l n1 source) {
            kotlin.jvm.internal.l0.p(source, "source");
            return new c0(source, "SHA-1");
        }

        @p4.l
        @u3.m
        public final c0 f(@p4.l n1 source) {
            kotlin.jvm.internal.l0.p(source, "source");
            return new c0(source, "SHA-256");
        }

        @p4.l
        @u3.m
        public final c0 g(@p4.l n1 source) {
            kotlin.jvm.internal.l0.p(source, "source");
            return new c0(source, "SHA-512");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(@p4.l n1 source, @p4.l MessageDigest digest) {
        super(source);
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(digest, "digest");
        this.f20869a = digest;
        this.f20870b = null;
    }

    @p4.l
    @u3.m
    public static final c0 c(@p4.l n1 n1Var, @p4.l n nVar) {
        return f20868c.a(n1Var, nVar);
    }

    @p4.l
    @u3.m
    public static final c0 d(@p4.l n1 n1Var, @p4.l n nVar) {
        return f20868c.b(n1Var, nVar);
    }

    @p4.l
    @u3.m
    public static final c0 h(@p4.l n1 n1Var, @p4.l n nVar) {
        return f20868c.c(n1Var, nVar);
    }

    @p4.l
    @u3.m
    public static final c0 j(@p4.l n1 n1Var) {
        return f20868c.d(n1Var);
    }

    @p4.l
    @u3.m
    public static final c0 m(@p4.l n1 n1Var) {
        return f20868c.e(n1Var);
    }

    @p4.l
    @u3.m
    public static final c0 o(@p4.l n1 n1Var) {
        return f20868c.f(n1Var);
    }

    @p4.l
    @u3.m
    public static final c0 p(@p4.l n1 n1Var) {
        return f20868c.g(n1Var);
    }

    @p4.l
    @u3.h(name = "-deprecated_hash")
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @kotlin.b1(expression = "hash", imports = {}))
    public final n a() {
        return b();
    }

    @p4.l
    @u3.h(name = "hash")
    public final n b() {
        byte[] doFinal;
        MessageDigest messageDigest = this.f20869a;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            Mac mac = this.f20870b;
            kotlin.jvm.internal.l0.m(mac);
            doFinal = mac.doFinal();
        }
        kotlin.jvm.internal.l0.m(doFinal);
        return new n(doFinal);
    }

    @Override // okio.x, okio.n1
    public long read(@p4.l l sink, long j5) throws IOException {
        kotlin.jvm.internal.l0.p(sink, "sink");
        long read = super.read(sink, j5);
        if (read != -1) {
            long M0 = sink.M0() - read;
            long M02 = sink.M0();
            i1 i1Var = sink.f20987a;
            kotlin.jvm.internal.l0.m(i1Var);
            while (M02 > M0) {
                i1Var = i1Var.f20934g;
                kotlin.jvm.internal.l0.m(i1Var);
                M02 -= i1Var.f20930c - i1Var.f20929b;
            }
            while (M02 < sink.M0()) {
                int i5 = (int) ((i1Var.f20929b + M0) - M02);
                MessageDigest messageDigest = this.f20869a;
                if (messageDigest != null) {
                    messageDigest.update(i1Var.f20928a, i5, i1Var.f20930c - i5);
                } else {
                    Mac mac = this.f20870b;
                    kotlin.jvm.internal.l0.m(mac);
                    mac.update(i1Var.f20928a, i5, i1Var.f20930c - i5);
                }
                M02 += i1Var.f20930c - i1Var.f20929b;
                i1Var = i1Var.f20933f;
                kotlin.jvm.internal.l0.m(i1Var);
                M0 = M02;
            }
        }
        return read;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c0(@p4.l okio.n1 r2, @p4.l java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.l0.p(r3, r0)
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)
            java.lang.String r0 = "getInstance(...)"
            kotlin.jvm.internal.l0.o(r3, r0)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.c0.<init>(okio.n1, java.lang.String):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(@p4.l n1 source, @p4.l Mac mac) {
        super(source);
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(mac, "mac");
        this.f20870b = mac;
        this.f20869a = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c0(@p4.l okio.n1 r3, @p4.l okio.n r4, @p4.l java.lang.String r5) {
        /*
            r2 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.l0.p(r3, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.l0.p(r4, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.l0.p(r5, r0)
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r5)     // Catch: java.security.InvalidKeyException -> L28
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L28
            byte[] r4 = r4.toByteArray()     // Catch: java.security.InvalidKeyException -> L28
            r1.<init>(r4, r5)     // Catch: java.security.InvalidKeyException -> L28
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L28
            kotlin.r2 r4 = kotlin.r2.f19517a     // Catch: java.security.InvalidKeyException -> L28
            kotlin.jvm.internal.l0.m(r0)
            r2.<init>(r3, r0)
            return
        L28:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.c0.<init>(okio.n1, okio.n, java.lang.String):void");
    }
}
