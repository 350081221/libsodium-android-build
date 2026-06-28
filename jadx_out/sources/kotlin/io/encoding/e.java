package kotlin.io.encoding;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.tendcloud.tenddata.cq;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import p4.l;

@i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J \u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002J\b\u0010\u0015\u001a\u00020\u000fH\u0002J \u0010\u0016\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0016J \u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\tH\u0016J\u0010\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lkotlin/io/encoding/EncodeOutputStream;", "Ljava/io/OutputStream;", "output", "base64", "Lkotlin/io/encoding/Base64;", "(Ljava/io/OutputStream;Lkotlin/io/encoding/Base64;)V", "byteBuffer", "", "byteBufferLength", "", "isClosed", "", "lineLength", "symbolBuffer", "checkOpen", "", ILivePush.ClickType.CLOSE, "copyIntoByteBuffer", "source", "startIndex", "endIndex", "encodeByteBufferIntoOutput", "encodeIntoOutput", "flush", "write", TypedValues.CycleType.S_WAVE_OFFSET, cq.a.LENGTH, "b", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@f
/* loaded from: classes2.dex */
final class e extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final OutputStream f19298a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final a f19299b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19300c;

    /* renamed from: d, reason: collision with root package name */
    private int f19301d;

    /* renamed from: e, reason: collision with root package name */
    @l
    private final byte[] f19302e;

    /* renamed from: f, reason: collision with root package name */
    @l
    private final byte[] f19303f;

    /* renamed from: g, reason: collision with root package name */
    private int f19304g;

    public e(@l OutputStream output, @l a base64) {
        int i5;
        l0.p(output, "output");
        l0.p(base64, "base64");
        this.f19298a = output;
        this.f19299b = base64;
        if (base64.D()) {
            i5 = 76;
        } else {
            i5 = -1;
        }
        this.f19301d = i5;
        this.f19302e = new byte[1024];
        this.f19303f = new byte[3];
    }

    private final void a() {
        if (this.f19300c) {
            throw new IOException("The output stream is closed.");
        }
    }

    private final int b(byte[] bArr, int i5, int i6) {
        int min = Math.min(3 - this.f19304g, i6 - i5);
        kotlin.collections.l.v0(bArr, this.f19303f, this.f19304g, i5, i5 + min);
        int i7 = this.f19304g + min;
        this.f19304g = i7;
        if (i7 == 3) {
            c();
        }
        return min;
    }

    private final void c() {
        boolean z4;
        if (d(this.f19303f, 0, this.f19304g) == 4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            this.f19304g = 0;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    private final int d(byte[] bArr, int i5, int i6) {
        boolean z4;
        int t5 = this.f19299b.t(bArr, this.f19302e, 0, i5, i6);
        if (this.f19301d == 0) {
            this.f19298a.write(a.f19272c.H());
            this.f19301d = 76;
            if (t5 <= 76) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        this.f19298a.write(this.f19302e, 0, t5);
        this.f19301d -= t5;
        return t5;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f19300c) {
            this.f19300c = true;
            if (this.f19304g != 0) {
                c();
            }
            this.f19298a.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        a();
        this.f19298a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i5) {
        a();
        byte[] bArr = this.f19303f;
        int i6 = this.f19304g;
        int i7 = i6 + 1;
        this.f19304g = i7;
        bArr[i6] = (byte) i5;
        if (i7 == 3) {
            c();
        }
    }

    @Override // java.io.OutputStream
    public void write(@l byte[] source, int i5, int i6) {
        int i7;
        l0.p(source, "source");
        a();
        if (i5 < 0 || i6 < 0 || (i7 = i5 + i6) > source.length) {
            throw new IndexOutOfBoundsException("offset: " + i5 + ", length: " + i6 + ", source size: " + source.length);
        }
        if (i6 == 0) {
            return;
        }
        int i8 = this.f19304g;
        if (i8 < 3) {
            if (i8 != 0) {
                i5 += b(source, i5, i7);
                if (this.f19304g != 0) {
                    return;
                }
            }
            while (i5 + 3 <= i7) {
                int min = Math.min((this.f19299b.D() ? this.f19301d : this.f19302e.length) / 4, (i7 - i5) / 3);
                int i9 = (min * 3) + i5;
                if (!(d(source, i5, i9) == min * 4)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                i5 = i9;
            }
            kotlin.collections.l.v0(source, this.f19303f, 0, i5, i7);
            this.f19304g = i7 - i5;
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
