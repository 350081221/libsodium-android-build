package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.umeng.analytics.pro.bi;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.Charset;

@kotlin.i0(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0003\u001a\u00020\u0004H'J\b\u0010\u0007\u001a\u00020\u0000H&J\b\u0010\b\u001a\u00020\u0000H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fH&J \u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H&J \u0010\r\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H&J\u0018\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0015H&J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0011H&J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0016H&J\u0010\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0016H&J\u0010\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0011H&J\u0010\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0011H&J\u0010\u0010 \u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0016H&J\u0010\u0010!\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0016H&J\u0010\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0011H&J\u0010\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0011H&J\u0018\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H&J(\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00112\u0006\u0010(\u001a\u00020)H&J\u0010\u0010,\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'H&J \u0010,\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u0011H&J\u0010\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\u0011H&R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0004/ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u00060À\u0006\u0001"}, d2 = {"Lokio/BufferedSink;", "Lokio/Sink;", "Ljava/nio/channels/WritableByteChannel;", "buffer", "Lokio/Buffer;", "getBuffer", "()Lokio/Buffer;", "emit", "emitCompleteSegments", "flush", "", "outputStream", "Ljava/io/OutputStream;", "write", "source", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "byteCount", "byteString", "Lokio/ByteString;", "Lokio/Source;", "", "writeAll", "writeByte", "b", "writeDecimalLong", "v", "writeHexadecimalUnsignedLong", "writeInt", "i", "writeIntLe", "writeLong", "writeLongLe", "writeShort", bi.aE, "writeShortLe", "writeString", TypedValues.Custom.S_STRING, "", "charset", "Ljava/nio/charset/Charset;", "beginIndex", "endIndex", "writeUtf8", "writeUtf8CodePoint", "codePoint", "Lokio/RealBufferedSink;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface m extends l1, WritableByteChannel {
    @p4.l
    m C(@p4.l String str) throws IOException;

    @p4.l
    m F(@p4.l String str, int i5, int i6) throws IOException;

    long G(@p4.l n1 n1Var) throws IOException;

    @p4.l
    m S(@p4.l String str, int i5, int i6, @p4.l Charset charset) throws IOException;

    @p4.l
    m V(long j5) throws IOException;

    @p4.l
    m Z(@p4.l n nVar, int i5, int i6) throws IOException;

    @p4.l
    m d0(int i5) throws IOException;

    @p4.l
    @kotlin.k(level = kotlin.m.WARNING, message = "moved to val: use getBuffer() instead", replaceWith = @kotlin.b1(expression = "buffer", imports = {}))
    l f();

    @Override // okio.l1, java.io.Flushable
    void flush() throws IOException;

    @p4.l
    l g();

    @p4.l
    m h0(int i5) throws IOException;

    @p4.l
    m k() throws IOException;

    @p4.l
    m l(int i5) throws IOException;

    @p4.l
    m l0(long j5) throws IOException;

    @p4.l
    m n(long j5) throws IOException;

    @p4.l
    m n0(@p4.l String str, @p4.l Charset charset) throws IOException;

    @p4.l
    m o0(@p4.l n1 n1Var, long j5) throws IOException;

    @p4.l
    m v0(@p4.l n nVar) throws IOException;

    @p4.l
    m write(@p4.l byte[] bArr) throws IOException;

    @p4.l
    m write(@p4.l byte[] bArr, int i5, int i6) throws IOException;

    @p4.l
    m writeByte(int i5) throws IOException;

    @p4.l
    m writeInt(int i5) throws IOException;

    @p4.l
    m writeLong(long j5) throws IOException;

    @p4.l
    m writeShort(int i5) throws IOException;

    @p4.l
    m x() throws IOException;

    @p4.l
    OutputStream x0();
}
