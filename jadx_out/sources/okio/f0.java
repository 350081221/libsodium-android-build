package okio;

import java.io.RandomAccessFile;

@kotlin.i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0014J\b\u0010\t\u001a\u00020\bH\u0014J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0014J\u0010\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\rH\u0014J\b\u0010\u0014\u001a\u00020\rH\u0014J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lokio/JvmFileHandle;", "Lokio/FileHandle;", "readWrite", "", "randomAccessFile", "Ljava/io/RandomAccessFile;", "(ZLjava/io/RandomAccessFile;)V", "protectedClose", "", "protectedFlush", "protectedRead", "", "fileOffset", "", "array", "", "arrayOffset", "byteCount", "protectedResize", "size", "protectedSize", "protectedWrite", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f0 extends s {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final RandomAccessFile f20891e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(boolean z4, @p4.l RandomAccessFile randomAccessFile) {
        super(z4);
        kotlin.jvm.internal.l0.p(randomAccessFile, "randomAccessFile");
        this.f20891e = randomAccessFile;
    }

    @Override // okio.s
    protected synchronized void A() {
        this.f20891e.getFD().sync();
    }

    @Override // okio.s
    protected synchronized int H(long j5, @p4.l byte[] array, int i5, int i6) {
        kotlin.jvm.internal.l0.p(array, "array");
        this.f20891e.seek(j5);
        int i7 = 0;
        while (true) {
            if (i7 >= i6) {
                break;
            }
            int read = this.f20891e.read(array, i5, i6 - i7);
            if (read == -1) {
                if (i7 == 0) {
                    return -1;
                }
            } else {
                i7 += read;
            }
        }
        return i7;
    }

    @Override // okio.s
    protected synchronized void I(long j5) {
        long t02 = t0();
        long j6 = j5 - t02;
        if (j6 > 0) {
            int i5 = (int) j6;
            M(t02, new byte[i5], 0, i5);
        } else {
            this.f20891e.setLength(j5);
        }
    }

    @Override // okio.s
    protected synchronized long J() {
        return this.f20891e.length();
    }

    @Override // okio.s
    protected synchronized void M(long j5, @p4.l byte[] array, int i5, int i6) {
        kotlin.jvm.internal.l0.p(array, "array");
        this.f20891e.seek(j5);
        this.f20891e.write(array, i5, i6);
    }

    @Override // okio.s
    protected synchronized void y() {
        this.f20891e.close();
    }
}
