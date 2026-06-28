package kotlin.io;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tendcloud.tenddata.cq;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.b1;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;

@i0(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0007\u001a\u00020\b*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\u000b\u001a\u00020\f*\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\r\u001a\u00020\u000e*\u00020\u000f2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u001c\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\r\u0010\u0013\u001a\u00020\u000e*\u00020\u0014H\u0087\b\u001a\u001d\u0010\u0013\u001a\u00020\u000e*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0018*\u00020\u0001H\u0086\u0002\u001a\f\u0010\u0019\u001a\u00020\u0014*\u00020\u0002H\u0007\u001a\u0016\u0010\u0019\u001a\u00020\u0014*\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u0004H\u0007\u001a\u0017\u0010\u001b\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0017\u0010\u001d\u001a\u00020\u001e*\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b¨\u0006\u001f"}, d2 = {"buffered", "Ljava/io/BufferedInputStream;", "Ljava/io/InputStream;", "bufferSize", "", "Ljava/io/BufferedOutputStream;", "Ljava/io/OutputStream;", "bufferedReader", "Ljava/io/BufferedReader;", "charset", "Ljava/nio/charset/Charset;", "bufferedWriter", "Ljava/io/BufferedWriter;", "byteInputStream", "Ljava/io/ByteArrayInputStream;", "", "copyTo", "", "out", "inputStream", "", TypedValues.CycleType.S_WAVE_OFFSET, cq.a.LENGTH, "iterator", "Lkotlin/collections/ByteIterator;", "readBytes", "estimatedSize", "reader", "Ljava/io/InputStreamReader;", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "ByteStreamsKt")
/* loaded from: classes2.dex */
public final class b {

    @i0(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007¨\u0006\u0015"}, d2 = {"kotlin/io/ByteStreamsKt$iterator$1", "Lkotlin/collections/ByteIterator;", "finished", "", "getFinished", "()Z", "setFinished", "(Z)V", "nextByte", "", "getNextByte", "()I", "setNextByte", "(I)V", "nextPrepared", "getNextPrepared", "setNextPrepared", "hasNext", "", "prepareNext", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.collections.s {

        /* renamed from: a, reason: collision with root package name */
        private int f19265a = -1;

        /* renamed from: b, reason: collision with root package name */
        private boolean f19266b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f19267c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ BufferedInputStream f19268d;

        a(BufferedInputStream bufferedInputStream) {
            this.f19268d = bufferedInputStream;
        }

        private final void g() {
            if (!this.f19266b && !this.f19267c) {
                int read = this.f19268d.read();
                this.f19265a = read;
                boolean z4 = true;
                this.f19266b = true;
                if (read != -1) {
                    z4 = false;
                }
                this.f19267c = z4;
            }
        }

        @Override // kotlin.collections.s
        public byte b() {
            g();
            if (!this.f19267c) {
                byte b5 = (byte) this.f19265a;
                this.f19266b = false;
                return b5;
            }
            throw new NoSuchElementException("Input stream is over.");
        }

        public final boolean c() {
            return this.f19267c;
        }

        public final int d() {
            return this.f19265a;
        }

        public final boolean e() {
            return this.f19266b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            g();
            return !this.f19267c;
        }

        public final void i(boolean z4) {
            this.f19267c = z4;
        }

        public final void j(int i5) {
            this.f19265a = i5;
        }

        public final void k(boolean z4) {
            this.f19266b = z4;
        }
    }

    @kotlin.internal.f
    private static final BufferedInputStream a(InputStream inputStream, int i5) {
        l0.p(inputStream, "<this>");
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream, i5);
    }

    @kotlin.internal.f
    private static final BufferedOutputStream b(OutputStream outputStream, int i5) {
        l0.p(outputStream, "<this>");
        if (outputStream instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStream;
        }
        return new BufferedOutputStream(outputStream, i5);
    }

    static /* synthetic */ BufferedInputStream c(InputStream inputStream, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 8192;
        }
        l0.p(inputStream, "<this>");
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream, i5);
    }

    static /* synthetic */ BufferedOutputStream d(OutputStream outputStream, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 8192;
        }
        l0.p(outputStream, "<this>");
        if (outputStream instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStream;
        }
        return new BufferedOutputStream(outputStream, i5);
    }

    @kotlin.internal.f
    private static final BufferedReader e(InputStream inputStream, Charset charset) {
        l0.p(inputStream, "<this>");
        l0.p(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(inputStream, charset);
        if (inputStreamReader instanceof BufferedReader) {
            return (BufferedReader) inputStreamReader;
        }
        return new BufferedReader(inputStreamReader, 8192);
    }

    static /* synthetic */ BufferedReader f(InputStream inputStream, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        l0.p(inputStream, "<this>");
        l0.p(charset, "charset");
        Reader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    @kotlin.internal.f
    private static final BufferedWriter g(OutputStream outputStream, Charset charset) {
        l0.p(outputStream, "<this>");
        l0.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        if (outputStreamWriter instanceof BufferedWriter) {
            return (BufferedWriter) outputStreamWriter;
        }
        return new BufferedWriter(outputStreamWriter, 8192);
    }

    static /* synthetic */ BufferedWriter h(OutputStream outputStream, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        l0.p(outputStream, "<this>");
        l0.p(charset, "charset");
        Writer outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    @kotlin.internal.f
    private static final ByteArrayInputStream i(String str, Charset charset) {
        l0.p(str, "<this>");
        l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    static /* synthetic */ ByteArrayInputStream j(String str, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        l0.p(str, "<this>");
        l0.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        l0.o(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    public static final long k(@p4.l InputStream inputStream, @p4.l OutputStream out, int i5) {
        l0.p(inputStream, "<this>");
        l0.p(out, "out");
        byte[] bArr = new byte[i5];
        int read = inputStream.read(bArr);
        long j5 = 0;
        while (read >= 0) {
            out.write(bArr, 0, read);
            j5 += read;
            read = inputStream.read(bArr);
        }
        return j5;
    }

    public static /* synthetic */ long l(InputStream inputStream, OutputStream outputStream, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            i5 = 8192;
        }
        return k(inputStream, outputStream, i5);
    }

    @kotlin.internal.f
    private static final ByteArrayInputStream m(byte[] bArr) {
        l0.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @kotlin.internal.f
    private static final ByteArrayInputStream n(byte[] bArr, int i5, int i6) {
        l0.p(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i5, i6);
    }

    @p4.l
    public static final kotlin.collections.s o(@p4.l BufferedInputStream bufferedInputStream) {
        l0.p(bufferedInputStream, "<this>");
        return new a(bufferedInputStream);
    }

    @p4.l
    @g1(version = "1.3")
    public static final byte[] p(@p4.l InputStream inputStream) {
        l0.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        l0.o(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    @p4.l
    @kotlin.k(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @b1(expression = "readBytes()", imports = {}))
    @kotlin.l(errorSince = "1.5", warningSince = "1.3")
    public static final byte[] q(@p4.l InputStream inputStream, int i5) {
        l0.p(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i5, inputStream.available()));
        l(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        l0.o(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    public static /* synthetic */ byte[] r(InputStream inputStream, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i5 = 8192;
        }
        return q(inputStream, i5);
    }

    @kotlin.internal.f
    private static final InputStreamReader s(InputStream inputStream, Charset charset) {
        l0.p(inputStream, "<this>");
        l0.p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    static /* synthetic */ InputStreamReader t(InputStream inputStream, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        l0.p(inputStream, "<this>");
        l0.p(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @kotlin.internal.f
    private static final OutputStreamWriter u(OutputStream outputStream, Charset charset) {
        l0.p(outputStream, "<this>");
        l0.p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    static /* synthetic */ OutputStreamWriter v(OutputStream outputStream, Charset charset, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            charset = kotlin.text.f.f19703b;
        }
        l0.p(outputStream, "<this>");
        l0.p(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }
}
