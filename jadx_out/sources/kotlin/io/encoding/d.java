package kotlin.io.encoding;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.live.base.api.push.ILivePush;
import com.tendcloud.tenddata.cq;
import java.io.IOException;
import java.io.InputStream;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.y1;
import p4.l;

@i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002J(\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016J \u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\tH\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlin/io/encoding/DecodeInputStream;", "Ljava/io/InputStream;", "input", "base64", "Lkotlin/io/encoding/Base64;", "(Ljava/io/InputStream;Lkotlin/io/encoding/Base64;)V", "byteBuffer", "", "byteBufferEndIndex", "", "byteBufferLength", "getByteBufferLength", "()I", "byteBufferStartIndex", "isClosed", "", "isEOF", "singleByteBuffer", "symbolBuffer", ILivePush.ClickType.CLOSE, "", "copyByteBufferInto", "dst", "dstOffset", cq.a.LENGTH, "decodeSymbolBufferInto", "dstEndIndex", "symbolBufferLength", "handlePaddingSymbol", "read", "destination", TypedValues.CycleType.S_WAVE_OFFSET, "readNextSymbol", "resetByteBufferIfEmpty", "shiftByteBufferToStartIfNeeded", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@f
/* loaded from: classes2.dex */
final class d extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    @l
    private final InputStream f19289a;

    /* renamed from: b, reason: collision with root package name */
    @l
    private final a f19290b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f19291c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f19292d;

    /* renamed from: e, reason: collision with root package name */
    @l
    private final byte[] f19293e;

    /* renamed from: f, reason: collision with root package name */
    @l
    private final byte[] f19294f;

    /* renamed from: g, reason: collision with root package name */
    @l
    private final byte[] f19295g;

    /* renamed from: h, reason: collision with root package name */
    private int f19296h;

    /* renamed from: i, reason: collision with root package name */
    private int f19297i;

    public d(@l InputStream input, @l a base64) {
        l0.p(input, "input");
        l0.p(base64, "base64");
        this.f19289a = input;
        this.f19290b = base64;
        this.f19293e = new byte[1];
        this.f19294f = new byte[1024];
        this.f19295g = new byte[1024];
    }

    private final void a(byte[] bArr, int i5, int i6) {
        byte[] bArr2 = this.f19295g;
        int i7 = this.f19296h;
        kotlin.collections.l.v0(bArr2, bArr, i5, i7, i7 + i6);
        this.f19296h += i6;
        j();
    }

    private final int b(byte[] bArr, int i5, int i6, int i7) {
        int i8 = this.f19297i;
        this.f19297i = i8 + this.f19290b.n(this.f19294f, this.f19295g, i8, 0, i7);
        int min = Math.min(c(), i6 - i5);
        a(bArr, i5, min);
        m();
        return min;
    }

    private final int c() {
        return this.f19297i - this.f19296h;
    }

    private final int d(int i5) {
        this.f19294f[i5] = a.f19277h;
        if ((i5 & 3) == 2) {
            int h5 = h();
            if (h5 >= 0) {
                this.f19294f[i5 + 1] = (byte) h5;
            }
            return i5 + 2;
        }
        return i5 + 1;
    }

    private final int h() {
        int read;
        if (!this.f19290b.D()) {
            return this.f19289a.read();
        }
        do {
            read = this.f19289a.read();
            if (read == -1) {
                break;
            }
        } while (!c.i(read));
        return read;
    }

    private final void j() {
        if (this.f19296h == this.f19297i) {
            this.f19296h = 0;
            this.f19297i = 0;
        }
    }

    private final void m() {
        byte[] bArr = this.f19295g;
        int length = bArr.length;
        int i5 = this.f19297i;
        if ((this.f19294f.length / 4) * 3 > length - i5) {
            kotlin.collections.l.v0(bArr, bArr, 0, this.f19296h, i5);
            this.f19297i -= this.f19296h;
            this.f19296h = 0;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (!this.f19291c) {
            this.f19291c = true;
            this.f19289a.close();
        }
    }

    @Override // java.io.InputStream
    public int read() {
        int i5 = this.f19296h;
        if (i5 < this.f19297i) {
            int i6 = this.f19295g[i5] & y1.f19838d;
            this.f19296h = i5 + 1;
            j();
            return i6;
        }
        int read = read(this.f19293e, 0, 1);
        if (read == -1) {
            return -1;
        }
        if (read == 1) {
            return this.f19293e[0] & y1.f19838d;
        }
        throw new IllegalStateException("Unreachable".toString());
    }

    @Override // java.io.InputStream
    public int read(@l byte[] destination, int i5, int i6) {
        int i7;
        boolean z4;
        boolean z5;
        l0.p(destination, "destination");
        if (i5 >= 0 && i6 >= 0 && (i7 = i5 + i6) <= destination.length) {
            if (!this.f19291c) {
                if (this.f19292d) {
                    return -1;
                }
                if (i6 == 0) {
                    return 0;
                }
                if (c() >= i6) {
                    a(destination, i5, i6);
                    return i6;
                }
                int c5 = ((((i6 - c()) + 3) - 1) / 3) * 4;
                int i8 = i5;
                while (true) {
                    z4 = this.f19292d;
                    if (z4 || c5 <= 0) {
                        break;
                    }
                    int min = Math.min(this.f19294f.length, c5);
                    int i9 = 0;
                    while (true) {
                        z5 = this.f19292d;
                        if (z5 || i9 >= min) {
                            break;
                        }
                        int h5 = h();
                        if (h5 == -1) {
                            this.f19292d = true;
                        } else if (h5 != 61) {
                            this.f19294f[i9] = (byte) h5;
                            i9++;
                        } else {
                            i9 = d(i9);
                            this.f19292d = true;
                        }
                    }
                    if (z5 || i9 == min) {
                        c5 -= i9;
                        i8 += b(destination, i8, i7, i9);
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                if (i8 == i5 && z4) {
                    return -1;
                }
                return i8 - i5;
            }
            throw new IOException("The input stream is closed.");
        }
        throw new IndexOutOfBoundsException("offset: " + i5 + ", length: " + i6 + ", buffer size: " + destination.length);
    }
}
