package okio;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.IOException;
import java.security.MessageDigest;
import javax.crypto.Mac;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

@kotlin.i0(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB\u0017\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB\u001f\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000eH\u0007¢\u0006\u0002\b\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0010\u001a\u00020\u000e8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lokio/HashingSink;", "Lokio/ForwardingSink;", "Lokio/Sink;", "sink", "digest", "Ljava/security/MessageDigest;", "(Lokio/Sink;Ljava/security/MessageDigest;)V", "algorithm", "", "(Lokio/Sink;Ljava/lang/String;)V", "mac", "Ljavax/crypto/Mac;", "(Lokio/Sink;Ljavax/crypto/Mac;)V", DatabaseFileArchive.COLUMN_KEY, "Lokio/ByteString;", "(Lokio/Sink;Lokio/ByteString;Ljava/lang/String;)V", "hash", "()Lokio/ByteString;", "messageDigest", "-deprecated_hash", "write", "", "source", "Lokio/Buffer;", "byteCount", "", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nHashingSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n86#2:149\n*S KotlinDebug\n*F\n+ 1 HashingSink.kt\nokio/HashingSink\n*L\n75#1:149\n*E\n"})
/* loaded from: classes4.dex */
public final class b0 extends w implements l1 {

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    public static final a f20861c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @p4.m
    private final MessageDigest f20862a;

    /* renamed from: b, reason: collision with root package name */
    @p4.m
    private final Mac f20863b;

    @kotlin.i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000f"}, d2 = {"Lokio/HashingSink$Companion;", "", "()V", "hmacSha1", "Lokio/HashingSink;", "sink", "Lokio/Sink;", DatabaseFileArchive.COLUMN_KEY, "Lokio/ByteString;", "hmacSha256", "hmacSha512", TTDownloadField.TT_MD5, "sha1", "sha256", "sha512", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        @u3.m
        public final b0 a(@p4.l l1 sink, @p4.l n key) {
            kotlin.jvm.internal.l0.p(sink, "sink");
            kotlin.jvm.internal.l0.p(key, "key");
            return new b0(sink, key, "HmacSHA1");
        }

        @p4.l
        @u3.m
        public final b0 b(@p4.l l1 sink, @p4.l n key) {
            kotlin.jvm.internal.l0.p(sink, "sink");
            kotlin.jvm.internal.l0.p(key, "key");
            return new b0(sink, key, "HmacSHA256");
        }

        @p4.l
        @u3.m
        public final b0 c(@p4.l l1 sink, @p4.l n key) {
            kotlin.jvm.internal.l0.p(sink, "sink");
            kotlin.jvm.internal.l0.p(key, "key");
            return new b0(sink, key, "HmacSHA512");
        }

        @p4.l
        @u3.m
        public final b0 d(@p4.l l1 sink) {
            kotlin.jvm.internal.l0.p(sink, "sink");
            return new b0(sink, "MD5");
        }

        @p4.l
        @u3.m
        public final b0 e(@p4.l l1 sink) {
            kotlin.jvm.internal.l0.p(sink, "sink");
            return new b0(sink, "SHA-1");
        }

        @p4.l
        @u3.m
        public final b0 f(@p4.l l1 sink) {
            kotlin.jvm.internal.l0.p(sink, "sink");
            return new b0(sink, "SHA-256");
        }

        @p4.l
        @u3.m
        public final b0 g(@p4.l l1 sink) {
            kotlin.jvm.internal.l0.p(sink, "sink");
            return new b0(sink, "SHA-512");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@p4.l l1 sink, @p4.l MessageDigest digest) {
        super(sink);
        kotlin.jvm.internal.l0.p(sink, "sink");
        kotlin.jvm.internal.l0.p(digest, "digest");
        this.f20862a = digest;
        this.f20863b = null;
    }

    @p4.l
    @u3.m
    public static final b0 c(@p4.l l1 l1Var, @p4.l n nVar) {
        return f20861c.a(l1Var, nVar);
    }

    @p4.l
    @u3.m
    public static final b0 d(@p4.l l1 l1Var, @p4.l n nVar) {
        return f20861c.b(l1Var, nVar);
    }

    @p4.l
    @u3.m
    public static final b0 h(@p4.l l1 l1Var, @p4.l n nVar) {
        return f20861c.c(l1Var, nVar);
    }

    @p4.l
    @u3.m
    public static final b0 j(@p4.l l1 l1Var) {
        return f20861c.d(l1Var);
    }

    @p4.l
    @u3.m
    public static final b0 m(@p4.l l1 l1Var) {
        return f20861c.e(l1Var);
    }

    @p4.l
    @u3.m
    public static final b0 o(@p4.l l1 l1Var) {
        return f20861c.f(l1Var);
    }

    @p4.l
    @u3.m
    public static final b0 p(@p4.l l1 l1Var) {
        return f20861c.g(l1Var);
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
        MessageDigest messageDigest = this.f20862a;
        if (messageDigest != null) {
            doFinal = messageDigest.digest();
        } else {
            Mac mac = this.f20863b;
            kotlin.jvm.internal.l0.m(mac);
            doFinal = mac.doFinal();
        }
        kotlin.jvm.internal.l0.m(doFinal);
        return new n(doFinal);
    }

    @Override // okio.w, okio.l1
    public void write(@p4.l l source, long j5) throws IOException {
        kotlin.jvm.internal.l0.p(source, "source");
        i.e(source.M0(), 0L, j5);
        i1 i1Var = source.f20987a;
        kotlin.jvm.internal.l0.m(i1Var);
        long j6 = 0;
        while (j6 < j5) {
            int min = (int) Math.min(j5 - j6, i1Var.f20930c - i1Var.f20929b);
            MessageDigest messageDigest = this.f20862a;
            if (messageDigest != null) {
                messageDigest.update(i1Var.f20928a, i1Var.f20929b, min);
            } else {
                Mac mac = this.f20863b;
                kotlin.jvm.internal.l0.m(mac);
                mac.update(i1Var.f20928a, i1Var.f20929b, min);
            }
            j6 += min;
            i1Var = i1Var.f20933f;
            kotlin.jvm.internal.l0.m(i1Var);
        }
        super.write(source, j5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(@p4.l okio.l1 r2, @p4.l java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.l0.p(r2, r0)
            java.lang.String r0 = "algorithm"
            kotlin.jvm.internal.l0.p(r3, r0)
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)
            java.lang.String r0 = "getInstance(...)"
            kotlin.jvm.internal.l0.o(r3, r0)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.b0.<init>(okio.l1, java.lang.String):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@p4.l l1 sink, @p4.l Mac mac) {
        super(sink);
        kotlin.jvm.internal.l0.p(sink, "sink");
        kotlin.jvm.internal.l0.p(mac, "mac");
        this.f20863b = mac;
        this.f20862a = null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b0(@p4.l okio.l1 r3, @p4.l okio.n r4, @p4.l java.lang.String r5) {
        /*
            r2 = this;
            java.lang.String r0 = "sink"
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
        throw new UnsupportedOperationException("Method not decompiled: okio.b0.<init>(okio.l1, okio.n, java.lang.String):void");
    }
}
