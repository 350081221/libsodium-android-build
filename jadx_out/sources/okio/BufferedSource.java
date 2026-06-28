package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

@kotlin.i0(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH&J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\nH&J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\nH&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0000H&J\u0018\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H&J(\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H&J\u0010\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001dH&J \u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H&J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001fH&J\b\u0010 \u001a\u00020\fH&J\b\u0010!\u001a\u00020\u001dH&J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\nH&J\b\u0010\"\u001a\u00020\u0010H&J\u0010\u0010\"\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\nH&J\b\u0010#\u001a\u00020\nH&J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u001dH&J\u0018\u0010$\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\nH&J\b\u0010&\u001a\u00020\nH&J\b\u0010'\u001a\u00020\u0019H&J\b\u0010(\u001a\u00020\u0019H&J\b\u0010)\u001a\u00020\nH&J\b\u0010*\u001a\u00020\nH&J\b\u0010+\u001a\u00020,H&J\b\u0010-\u001a\u00020,H&J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H&J\u0018\u0010.\u001a\u00020/2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u00100\u001a\u000201H&J\b\u00102\u001a\u00020/H&J\u0010\u00102\u001a\u00020/2\u0006\u0010\u001a\u001a\u00020\nH&J\b\u00103\u001a\u00020\u0019H&J\n\u00104\u001a\u0004\u0018\u00010/H&J\b\u00105\u001a\u00020/H&J\u0010\u00105\u001a\u00020/2\u0006\u00106\u001a\u00020\nH&J\u0010\u00107\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\nH&J\u0010\u00108\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\nH&J\u0010\u00109\u001a\u00020\u00192\u0006\u0010:\u001a\u00020;H&J\u0010\u0010<\u001a\u00020%2\u0006\u0010\u001a\u001a\u00020\nH&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0004=ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006>À\u0006\u0001"}, d2 = {"Lokio/BufferedSource;", "Lokio/Source;", "Ljava/nio/channels/ReadableByteChannel;", "buffer", "Lokio/Buffer;", "getBuffer", "()Lokio/Buffer;", "exhausted", "", "indexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "indexOfElement", "targetBytes", "inputStream", "Ljava/io/InputStream;", "peek", "rangeEquals", TypedValues.CycleType.S_WAVE_OFFSET, "bytesOffset", "", "byteCount", "read", "sink", "", "readAll", "Lokio/Sink;", "readByte", "readByteArray", "readByteString", "readDecimalLong", "readFully", "", "readHexadecimalUnsignedLong", "readInt", "readIntLe", "readLong", "readLongLe", "readShort", "", "readShortLe", "readString", "", "charset", "Ljava/nio/charset/Charset;", "readUtf8", "readUtf8CodePoint", "readUtf8Line", "readUtf8LineStrict", "limit", "request", "require", "select", "options", "Lokio/Options;", "skip", "Lokio/RealBufferedSource;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface BufferedSource extends n1, ReadableByteChannel {
    int B0(@p4.l b1 b1Var) throws IOException;

    boolean D(long j5, @p4.l n nVar) throws IOException;

    @p4.l
    String K() throws IOException;

    boolean L(long j5, @p4.l n nVar, int i5, int i6) throws IOException;

    @p4.l
    byte[] N(long j5) throws IOException;

    short Q() throws IOException;

    long R() throws IOException;

    long T(@p4.l n nVar, long j5) throws IOException;

    void U(long j5) throws IOException;

    long W(byte b5) throws IOException;

    @p4.l
    String X(long j5) throws IOException;

    @p4.l
    n Y(long j5) throws IOException;

    @p4.l
    byte[] c0() throws IOException;

    boolean e0() throws IOException;

    @p4.l
    @kotlin.k(level = kotlin.m.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @kotlin.b1(expression = "buffer", imports = {}))
    l f();

    @p4.l
    l g();

    long g0() throws IOException;

    long i(@p4.l n nVar, long j5) throws IOException;

    @p4.l
    String j0(@p4.l Charset charset) throws IOException;

    int k0() throws IOException;

    @p4.l
    n m0() throws IOException;

    @p4.l
    BufferedSource peek();

    int q0() throws IOException;

    long r(@p4.l n nVar) throws IOException;

    int read(@p4.l byte[] bArr) throws IOException;

    int read(@p4.l byte[] bArr, int i5, int i6) throws IOException;

    byte readByte() throws IOException;

    void readFully(@p4.l byte[] bArr) throws IOException;

    int readInt() throws IOException;

    long readLong() throws IOException;

    short readShort() throws IOException;

    boolean request(long j5) throws IOException;

    long s(byte b5, long j5) throws IOException;

    @p4.l
    String s0() throws IOException;

    void skip(long j5) throws IOException;

    void t(@p4.l l lVar, long j5) throws IOException;

    long u(byte b5, long j5, long j6) throws IOException;

    @p4.l
    String u0(long j5, @p4.l Charset charset) throws IOException;

    long v(@p4.l n nVar) throws IOException;

    @p4.m
    String w() throws IOException;

    long w0(@p4.l l1 l1Var) throws IOException;

    long y0() throws IOException;

    @p4.l
    String z(long j5) throws IOException;

    @p4.l
    InputStream z0();
}
