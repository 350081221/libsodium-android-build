package okio;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002-.B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019J\b\u0010\u001a\u001a\u00020\u0013H$J\b\u0010\u001b\u001a\u00020\u0013H$J(\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH$J\u0010\u0010\"\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0016H$J\b\u0010$\u001a\u00020\u0016H$J(\u0010%\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rH$J&\u0010&\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rJ\u001e\u0010&\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0016J \u0010(\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0016H\u0002J\u0016\u0010)\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010)\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010*\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u0016J\u0006\u0010#\u001a\u00020\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001d\u001a\u00020\u0016J&\u0010+\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\rJ\u001e\u0010+\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0016J \u0010,\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020'2\u0006\u0010!\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0015\u0010\u0007\u001a\u00060\bj\u0002`\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006/"}, d2 = {"Lokio/FileHandle;", "Ljava/io/Closeable;", "Lokio/Closeable;", "readWrite", "", "(Z)V", "closed", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lokio/Lock;", "getLock", "()Ljava/util/concurrent/locks/ReentrantLock;", "openStreamCount", "", "getReadWrite", "()Z", "appendingSink", "Lokio/Sink;", ILivePush.ClickType.CLOSE, "", "flush", "position", "", "sink", "source", "Lokio/Source;", "protectedClose", "protectedFlush", "protectedRead", "fileOffset", "array", "", "arrayOffset", "byteCount", "protectedResize", "size", "protectedSize", "protectedWrite", "read", "Lokio/Buffer;", "readNoCloseCheck", "reposition", "resize", "write", "writeNoCloseCheck", "FileHandleSink", "FileHandleSource", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n+ 2 -JvmPlatform.kt\nokio/_JvmPlatformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 5 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 6 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,444:1\n33#2:445\n33#2:447\n33#2:448\n33#2:449\n33#2:450\n33#2:451\n33#2:452\n33#2:453\n33#2:457\n33#2:459\n1#3:446\n62#4:454\n62#4:455\n62#4:456\n51#5:458\n86#6:460\n86#6:461\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n*L\n69#1:445\n81#1:447\n92#1:448\n105#1:449\n119#1:450\n129#1:451\n139#1:452\n151#1:453\n221#1:457\n287#1:459\n169#1:454\n195#1:455\n202#1:456\n248#1:458\n345#1:460\n374#1:461\n*E\n"})
/* loaded from: classes4.dex */
public abstract class s implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f21035a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f21036b;

    /* renamed from: c, reason: collision with root package name */
    private int f21037c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final ReentrantLock f21038d = s1.b();

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lokio/FileHandle$FileHandleSink;", "Lokio/Sink;", "fileHandle", "Lokio/FileHandle;", "position", "", "(Lokio/FileHandle;J)V", "closed", "", "getClosed", "()Z", "setClosed", "(Z)V", "getFileHandle", "()Lokio/FileHandle;", "getPosition", "()J", "setPosition", "(J)V", ILivePush.ClickType.CLOSE, "", "flush", m0.a.Z, "Lokio/Timeout;", "write", "source", "Lokio/Buffer;", "byteCount", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n33#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n*L\n410#1:446\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a implements l1 {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final s f21039a;

        /* renamed from: b, reason: collision with root package name */
        private long f21040b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f21041c;

        public a(@p4.l s fileHandle, long j5) {
            kotlin.jvm.internal.l0.p(fileHandle, "fileHandle");
            this.f21039a = fileHandle;
            this.f21040b = j5;
        }

        public final boolean a() {
            return this.f21041c;
        }

        @p4.l
        public final s b() {
            return this.f21039a;
        }

        public final long c() {
            return this.f21040b;
        }

        @Override // okio.l1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f21041c) {
                return;
            }
            this.f21041c = true;
            ReentrantLock m5 = this.f21039a.m();
            m5.lock();
            try {
                s sVar = this.f21039a;
                sVar.f21037c--;
                if (this.f21039a.f21037c == 0 && this.f21039a.f21036b) {
                    r2 r2Var = r2.f19517a;
                    m5.unlock();
                    this.f21039a.y();
                }
            } finally {
                m5.unlock();
            }
        }

        public final void d(boolean z4) {
            this.f21041c = z4;
        }

        @Override // okio.l1, java.io.Flushable
        public void flush() {
            if (!this.f21041c) {
                this.f21039a.A();
                return;
            }
            throw new IllegalStateException("closed".toString());
        }

        public final void h(long j5) {
            this.f21040b = j5;
        }

        @Override // okio.l1
        @p4.l
        public p1 timeout() {
            return p1.NONE;
        }

        @Override // okio.l1
        public void write(@p4.l l source, long j5) {
            kotlin.jvm.internal.l0.p(source, "source");
            if (!this.f21041c) {
                this.f21039a.F0(this.f21040b, source, j5);
                this.f21040b += j5;
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u001aH\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lokio/FileHandle$FileHandleSource;", "Lokio/Source;", "fileHandle", "Lokio/FileHandle;", "position", "", "(Lokio/FileHandle;J)V", "closed", "", "getClosed", "()Z", "setClosed", "(Z)V", "getFileHandle", "()Lokio/FileHandle;", "getPosition", "()J", "setPosition", "(J)V", ILivePush.ClickType.CLOSE, "", "read", "sink", "Lokio/Buffer;", "byteCount", m0.a.Z, "Lokio/Timeout;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n33#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n*L\n436#1:446\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b implements n1 {

        /* renamed from: a, reason: collision with root package name */
        @p4.l
        private final s f21042a;

        /* renamed from: b, reason: collision with root package name */
        private long f21043b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f21044c;

        public b(@p4.l s fileHandle, long j5) {
            kotlin.jvm.internal.l0.p(fileHandle, "fileHandle");
            this.f21042a = fileHandle;
            this.f21043b = j5;
        }

        public final boolean a() {
            return this.f21044c;
        }

        @p4.l
        public final s b() {
            return this.f21042a;
        }

        public final long c() {
            return this.f21043b;
        }

        @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f21044c) {
                return;
            }
            this.f21044c = true;
            ReentrantLock m5 = this.f21042a.m();
            m5.lock();
            try {
                s sVar = this.f21042a;
                sVar.f21037c--;
                if (this.f21042a.f21037c == 0 && this.f21042a.f21036b) {
                    r2 r2Var = r2.f19517a;
                    m5.unlock();
                    this.f21042a.y();
                }
            } finally {
                m5.unlock();
            }
        }

        public final void d(boolean z4) {
            this.f21044c = z4;
        }

        public final void h(long j5) {
            this.f21043b = j5;
        }

        @Override // okio.n1
        public long read(@p4.l l sink, long j5) {
            kotlin.jvm.internal.l0.p(sink, "sink");
            if (!this.f21044c) {
                long a02 = this.f21042a.a0(this.f21043b, sink, j5);
                if (a02 != -1) {
                    this.f21043b += a02;
                }
                return a02;
            }
            throw new IllegalStateException("closed".toString());
        }

        @Override // okio.n1
        @p4.l
        public p1 timeout() {
            return p1.NONE;
        }
    }

    public s(boolean z4) {
        this.f21035a = z4;
    }

    public static /* synthetic */ n1 C0(s sVar, long j5, int i5, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: source");
        }
        if ((i5 & 1) != 0) {
            j5 = 0;
        }
        return sVar.A0(j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0(long j5, l lVar, long j6) {
        i.e(lVar.M0(), 0L, j6);
        long j7 = j6 + j5;
        while (j5 < j7) {
            i1 i1Var = lVar.f20987a;
            kotlin.jvm.internal.l0.m(i1Var);
            int min = (int) Math.min(j7 - j5, i1Var.f20930c - i1Var.f20929b);
            M(j5, i1Var.f20928a, i1Var.f20929b, min);
            i1Var.f20929b += min;
            long j8 = min;
            j5 += j8;
            lVar.I0(lVar.M0() - j8);
            if (i1Var.f20929b == i1Var.f20930c) {
                lVar.f20987a = i1Var.b();
                j1.d(i1Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long a0(long j5, l lVar, long j6) {
        boolean z4;
        if (j6 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            long j7 = j5 + j6;
            long j8 = j5;
            while (true) {
                if (j8 >= j7) {
                    break;
                }
                i1 P0 = lVar.P0(1);
                int H = H(j8, P0.f20928a, P0.f20930c, (int) Math.min(j7 - j8, 8192 - r9));
                if (H == -1) {
                    if (P0.f20929b == P0.f20930c) {
                        lVar.f20987a = P0.b();
                        j1.d(P0);
                    }
                    if (j5 == j8) {
                        return -1L;
                    }
                } else {
                    P0.f20930c += H;
                    long j9 = H;
                    j8 += j9;
                    lVar.I0(lVar.M0() + j9);
                }
            }
            return j8 - j5;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j6).toString());
    }

    public static /* synthetic */ l1 r0(s sVar, long j5, int i5, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i5 & 1) != 0) {
            j5 = 0;
        }
        return sVar.p0(j5);
    }

    protected abstract void A() throws IOException;

    @p4.l
    public final n1 A0(long j5) throws IOException {
        ReentrantLock reentrantLock = this.f21038d;
        reentrantLock.lock();
        try {
            if (!this.f21036b) {
                this.f21037c++;
                reentrantLock.unlock();
                return new b(this, j5);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void D0(long j5, @p4.l l source, long j6) throws IOException {
        kotlin.jvm.internal.l0.p(source, "source");
        if (this.f21035a) {
            ReentrantLock reentrantLock = this.f21038d;
            reentrantLock.lock();
            try {
                if (!this.f21036b) {
                    r2 r2Var = r2.f19517a;
                    reentrantLock.unlock();
                    F0(j5, source, j6);
                    return;
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }

    public final void E0(long j5, @p4.l byte[] array, int i5, int i6) {
        kotlin.jvm.internal.l0.p(array, "array");
        if (this.f21035a) {
            ReentrantLock reentrantLock = this.f21038d;
            reentrantLock.lock();
            try {
                if (!this.f21036b) {
                    r2 r2Var = r2.f19517a;
                    reentrantLock.unlock();
                    M(j5, array, i5, i6);
                    return;
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }

    protected abstract int H(long j5, @p4.l byte[] bArr, int i5, int i6) throws IOException;

    protected abstract void I(long j5) throws IOException;

    protected abstract long J() throws IOException;

    protected abstract void M(long j5, @p4.l byte[] bArr, int i5, int i6) throws IOException;

    public final int O(long j5, @p4.l byte[] array, int i5, int i6) throws IOException {
        kotlin.jvm.internal.l0.p(array, "array");
        ReentrantLock reentrantLock = this.f21038d;
        reentrantLock.lock();
        try {
            if (!this.f21036b) {
                r2 r2Var = r2.f19517a;
                reentrantLock.unlock();
                return H(j5, array, i5, i6);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long P(long j5, @p4.l l sink, long j6) throws IOException {
        kotlin.jvm.internal.l0.p(sink, "sink");
        ReentrantLock reentrantLock = this.f21038d;
        reentrantLock.lock();
        try {
            if (!this.f21036b) {
                r2 r2Var = r2.f19517a;
                reentrantLock.unlock();
                return a0(j5, sink, j6);
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b0(@p4.l l1 sink, long j5) throws IOException {
        kotlin.jvm.internal.l0.p(sink, "sink");
        boolean z4 = false;
        if (sink instanceof g1) {
            g1 g1Var = (g1) sink;
            l1 l1Var = g1Var.f20914a;
            if ((l1Var instanceof a) && ((a) l1Var).b() == this) {
                z4 = true;
            }
            if (z4) {
                a aVar = (a) l1Var;
                if (!aVar.a()) {
                    g1Var.k();
                    aVar.h(j5);
                    return;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
        }
        if ((sink instanceof a) && ((a) sink).b() == this) {
            z4 = true;
        }
        if (z4) {
            a aVar2 = (a) sink;
            if (!aVar2.a()) {
                aVar2.h(j5);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.f21038d;
        reentrantLock.lock();
        try {
            if (this.f21036b) {
                return;
            }
            this.f21036b = true;
            if (this.f21037c != 0) {
                return;
            }
            r2 r2Var = r2.f19517a;
            reentrantLock.unlock();
            y();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f0(@p4.l n1 source, long j5) throws IOException {
        boolean z4;
        kotlin.jvm.internal.l0.p(source, "source");
        boolean z5 = false;
        if (source instanceof h1) {
            h1 h1Var = (h1) source;
            n1 n1Var = h1Var.f20919a;
            if ((n1Var instanceof b) && ((b) n1Var).b() == this) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                b bVar = (b) n1Var;
                if (!bVar.a()) {
                    long M0 = h1Var.f20920b.M0();
                    long c5 = j5 - (bVar.c() - M0);
                    if (0 <= c5 && c5 < M0) {
                        z5 = true;
                    }
                    if (z5) {
                        h1Var.skip(c5);
                        return;
                    } else {
                        h1Var.f20920b.c();
                        bVar.h(j5);
                        return;
                    }
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException("source was not created by this FileHandle".toString());
        }
        if ((source instanceof b) && ((b) source).b() == this) {
            z5 = true;
        }
        if (z5) {
            b bVar2 = (b) source;
            if (!bVar2.a()) {
                bVar2.h(j5);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException("source was not created by this FileHandle".toString());
    }

    public final void flush() throws IOException {
        if (this.f21035a) {
            ReentrantLock reentrantLock = this.f21038d;
            reentrantLock.lock();
            try {
                if (!this.f21036b) {
                    r2 r2Var = r2.f19517a;
                    reentrantLock.unlock();
                    A();
                    return;
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }

    public final void i0(long j5) throws IOException {
        if (this.f21035a) {
            ReentrantLock reentrantLock = this.f21038d;
            reentrantLock.lock();
            try {
                if (!this.f21036b) {
                    r2 r2Var = r2.f19517a;
                    reentrantLock.unlock();
                    I(j5);
                    return;
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }

    @p4.l
    public final l1 j() throws IOException {
        return p0(t0());
    }

    @p4.l
    public final ReentrantLock m() {
        return this.f21038d;
    }

    public final boolean o() {
        return this.f21035a;
    }

    public final long p(@p4.l l1 sink) throws IOException {
        long j5;
        boolean z4;
        kotlin.jvm.internal.l0.p(sink, "sink");
        if (sink instanceof g1) {
            g1 g1Var = (g1) sink;
            j5 = g1Var.f20915b.M0();
            sink = g1Var.f20914a;
        } else {
            j5 = 0;
        }
        if ((sink instanceof a) && ((a) sink).b() == this) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            a aVar = (a) sink;
            if (!aVar.a()) {
                return aVar.c() + j5;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException("sink was not created by this FileHandle".toString());
    }

    @p4.l
    public final l1 p0(long j5) throws IOException {
        if (this.f21035a) {
            ReentrantLock reentrantLock = this.f21038d;
            reentrantLock.lock();
            try {
                if (!this.f21036b) {
                    this.f21037c++;
                    reentrantLock.unlock();
                    return new a(this, j5);
                }
                throw new IllegalStateException("closed".toString());
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new IllegalStateException("file handle is read-only".toString());
    }

    public final long q(@p4.l n1 source) throws IOException {
        long j5;
        boolean z4;
        kotlin.jvm.internal.l0.p(source, "source");
        if (source instanceof h1) {
            h1 h1Var = (h1) source;
            j5 = h1Var.f20920b.M0();
            source = h1Var.f20919a;
        } else {
            j5 = 0;
        }
        if ((source instanceof b) && ((b) source).b() == this) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            b bVar = (b) source;
            if (!bVar.a()) {
                return bVar.c() - j5;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException("source was not created by this FileHandle".toString());
    }

    public final long t0() throws IOException {
        ReentrantLock reentrantLock = this.f21038d;
        reentrantLock.lock();
        try {
            if (!this.f21036b) {
                r2 r2Var = r2.f19517a;
                reentrantLock.unlock();
                return J();
            }
            throw new IllegalStateException("closed".toString());
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    protected abstract void y() throws IOException;
}
