package okio;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.IOException;
import javax.crypto.Cipher;

@kotlin.i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\r\u001a\u00020\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0018H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lokio/CipherSink;", "Lokio/Sink;", "sink", "Lokio/BufferedSink;", "cipher", "Ljavax/crypto/Cipher;", "(Lokio/BufferedSink;Ljavax/crypto/Cipher;)V", "blockSize", "", "getCipher", "()Ljavax/crypto/Cipher;", "closed", "", ILivePush.ClickType.CLOSE, "", "doFinal", "", "flush", m0.a.Z, "Lokio/Timeout;", "update", "source", "Lokio/Buffer;", "remaining", "", "write", "byteCount", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nCipherSink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,148:1\n1#2:149\n86#3:150\n*S KotlinDebug\n*F\n+ 1 CipherSink.kt\nokio/CipherSink\n*L\n47#1:150\n*E\n"})
/* loaded from: classes4.dex */
public final class o implements l1 {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final m f20999a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final Cipher f21000b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21001c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f21002d;

    public o(@p4.l m sink, @p4.l Cipher cipher) {
        boolean z4;
        kotlin.jvm.internal.l0.p(sink, "sink");
        kotlin.jvm.internal.l0.p(cipher, "cipher");
        this.f20999a = sink;
        this.f21000b = cipher;
        int blockSize = cipher.getBlockSize();
        this.f21001c = blockSize;
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

    private final Throwable a() {
        int outputSize = this.f21000b.getOutputSize(0);
        Throwable th = null;
        if (outputSize == 0) {
            return null;
        }
        if (outputSize > 8192) {
            try {
                m mVar = this.f20999a;
                byte[] doFinal = this.f21000b.doFinal();
                kotlin.jvm.internal.l0.o(doFinal, "doFinal(...)");
                mVar.write(doFinal);
                return null;
            } catch (Throwable th2) {
                return th2;
            }
        }
        l g5 = this.f20999a.g();
        i1 P0 = g5.P0(outputSize);
        try {
            int doFinal2 = this.f21000b.doFinal(P0.f20928a, P0.f20930c);
            P0.f20930c += doFinal2;
            g5.I0(g5.M0() + doFinal2);
        } catch (Throwable th3) {
            th = th3;
        }
        if (P0.f20929b == P0.f20930c) {
            g5.f20987a = P0.b();
            j1.d(P0);
        }
        return th;
    }

    private final int c(l lVar, long j5) {
        i1 i1Var = lVar.f20987a;
        kotlin.jvm.internal.l0.m(i1Var);
        int min = (int) Math.min(j5, i1Var.f20930c - i1Var.f20929b);
        l g5 = this.f20999a.g();
        int outputSize = this.f21000b.getOutputSize(min);
        while (outputSize > 8192) {
            int i5 = this.f21001c;
            if (min <= i5) {
                m mVar = this.f20999a;
                byte[] update = this.f21000b.update(lVar.N(j5));
                kotlin.jvm.internal.l0.o(update, "update(...)");
                mVar.write(update);
                return (int) j5;
            }
            min -= i5;
            outputSize = this.f21000b.getOutputSize(min);
        }
        i1 P0 = g5.P0(outputSize);
        int update2 = this.f21000b.update(i1Var.f20928a, i1Var.f20929b, min, P0.f20928a, P0.f20930c);
        P0.f20930c += update2;
        g5.I0(g5.M0() + update2);
        if (P0.f20929b == P0.f20930c) {
            g5.f20987a = P0.b();
            j1.d(P0);
        }
        this.f20999a.x();
        lVar.I0(lVar.M0() - min);
        int i6 = i1Var.f20929b + min;
        i1Var.f20929b = i6;
        if (i6 == i1Var.f20930c) {
            lVar.f20987a = i1Var.b();
            j1.d(i1Var);
        }
        return min;
    }

    @p4.l
    public final Cipher b() {
        return this.f21000b;
    }

    @Override // okio.l1, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f21002d) {
            return;
        }
        this.f21002d = true;
        Throwable a5 = a();
        try {
            this.f20999a.close();
        } catch (Throwable th) {
            if (a5 == null) {
                a5 = th;
            }
        }
        if (a5 == null) {
        } else {
            throw a5;
        }
    }

    @Override // okio.l1, java.io.Flushable
    public void flush() {
        this.f20999a.flush();
    }

    @Override // okio.l1
    @p4.l
    public p1 timeout() {
        return this.f20999a.timeout();
    }

    @Override // okio.l1
    public void write(@p4.l l source, long j5) throws IOException {
        kotlin.jvm.internal.l0.p(source, "source");
        i.e(source.M0(), 0L, j5);
        if (!this.f21002d) {
            while (j5 > 0) {
                j5 -= c(source, j5);
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }
}
