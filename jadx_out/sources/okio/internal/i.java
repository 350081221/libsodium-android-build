package okio.internal;

import java.io.IOException;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import okio.n1;
import okio.x;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005H\u0016J\u0014\u0010\u000e\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lokio/internal/FixedLengthSource;", "Lokio/ForwardingSource;", "delegate", "Lokio/Source;", "size", "", "truncate", "", "(Lokio/Source;JZ)V", "bytesReceived", "read", "sink", "Lokio/Buffer;", "byteCount", "truncateToSize", "", "newSize", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends x {

    /* renamed from: a, reason: collision with root package name */
    private final long f20948a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20949b;

    /* renamed from: c, reason: collision with root package name */
    private long f20950c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@p4.l n1 delegate, long j5, boolean z4) {
        super(delegate);
        l0.p(delegate, "delegate");
        this.f20948a = j5;
        this.f20949b = z4;
    }

    private final void a(okio.l lVar, long j5) {
        okio.l lVar2 = new okio.l();
        lVar2.G(lVar);
        lVar.write(lVar2, j5);
        lVar2.c();
    }

    @Override // okio.x, okio.n1
    public long read(@p4.l okio.l sink, long j5) {
        l0.p(sink, "sink");
        long j6 = this.f20950c;
        long j7 = this.f20948a;
        if (j6 > j7) {
            j5 = 0;
        } else if (this.f20949b) {
            long j8 = j7 - j6;
            if (j8 == 0) {
                return -1L;
            }
            j5 = Math.min(j5, j8);
        }
        long read = super.read(sink, j5);
        if (read != -1) {
            this.f20950c += read;
        }
        long j9 = this.f20950c;
        long j10 = this.f20948a;
        if ((j9 < j10 && read == -1) || j9 > j10) {
            if (read > 0 && j9 > j10) {
                a(sink, sink.M0() - (this.f20950c - this.f20948a));
            }
            throw new IOException("expected " + this.f20948a + " bytes but got " + this.f20950c);
        }
        return read;
    }
}
