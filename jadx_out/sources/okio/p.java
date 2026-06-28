package okio;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.IOException;
import javax.crypto.Cipher;

@kotlin.i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lokio/CipherSource;", "Lokio/Source;", "source", "Lokio/BufferedSource;", "cipher", "Ljavax/crypto/Cipher;", "(Lokio/BufferedSource;Ljavax/crypto/Cipher;)V", "blockSize", "", "buffer", "Lokio/Buffer;", "getCipher", "()Ljavax/crypto/Cipher;", "closed", "", "final", ILivePush.ClickType.CLOSE, "", "doFinal", "read", "", "sink", "byteCount", "refill", m0.a.Z, "Lokio/Timeout;", "update", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCipherSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSource.kt\nokio/CipherSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1#2:121\n*E\n"})
/* loaded from: classes4.dex */
public final class p implements n1 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final BufferedSource f21011a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final Cipher f21012b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21013c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final l f21014d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21015e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21016f;

    public p(@p4.l BufferedSource source, @p4.l Cipher cipher) {
        boolean z4;
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(cipher, "cipher");
        this.f21011a = source;
        this.f21012b = cipher;
        int blockSize = cipher.getBlockSize();
        this.f21013c = blockSize;
        this.f21014d = new l();
        if (blockSize > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    private final void a() {
        int outputSize = this.f21012b.getOutputSize(0);
        if (outputSize == 0) {
            return;
        }
        i1 P0 = this.f21014d.P0(outputSize);
        int doFinal = this.f21012b.doFinal(P0.f20928a, P0.f20929b);
        P0.f20930c += doFinal;
        l lVar = this.f21014d;
        lVar.I0(lVar.M0() + doFinal);
        if (P0.f20929b == P0.f20930c) {
            this.f21014d.f20987a = P0.b();
            j1.d(P0);
        }
    }

    private final void c() {
        while (this.f21014d.M0() == 0 && !this.f21015e) {
            if (this.f21011a.e0()) {
                this.f21015e = true;
                a();
                return;
            }
            d();
        }
    }

    private final void d() {
        i1 i1Var = this.f21011a.g().f20987a;
        kotlin.jvm.internal.l0.m(i1Var);
        int i5 = i1Var.f20930c - i1Var.f20929b;
        int outputSize = this.f21012b.getOutputSize(i5);
        while (outputSize > 8192) {
            int i6 = this.f21013c;
            if (i5 <= i6) {
                this.f21015e = true;
                l lVar = this.f21014d;
                byte[] doFinal = this.f21012b.doFinal(this.f21011a.c0());
                kotlin.jvm.internal.l0.o(doFinal, "doFinal(...)");
                lVar.write(doFinal);
                return;
            }
            i5 -= i6;
            outputSize = this.f21012b.getOutputSize(i5);
        }
        i1 P0 = this.f21014d.P0(outputSize);
        int update = this.f21012b.update(i1Var.f20928a, i1Var.f20929b, i5, P0.f20928a, P0.f20929b);
        this.f21011a.skip(i5);
        P0.f20930c += update;
        l lVar2 = this.f21014d;
        lVar2.I0(lVar2.M0() + update);
        if (P0.f20929b == P0.f20930c) {
            this.f21014d.f20987a = P0.b();
            j1.d(P0);
        }
    }

    @p4.l
    public final Cipher b() {
        return this.f21012b;
    }

    @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f21016f = true;
        this.f21011a.close();
    }

    @Override // okio.n1
    public long read(@p4.l l sink, long j5) throws IOException {
        boolean z4;
        kotlin.jvm.internal.l0.p(sink, "sink");
        if (j5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (true ^ this.f21016f) {
                if (j5 == 0) {
                    return 0L;
                }
                c();
                return this.f21014d.read(sink, j5);
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
    }

    @Override // okio.n1
    @p4.l
    public p1 timeout() {
        return this.f21011a.timeout();
    }
}
