package okhttp3.internal.cache2;

import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import m0.a;
import okhttp3.internal.Util;
import okio.n;
import okio.n1;
import okio.p1;
import p4.l;
import p4.m;
import u3.e;

@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 C2\u00020\u0001:\u0002CDB5\b\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0004¢\u0006\u0004\bA\u0010BJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0002J\b\u0010\r\u001a\u0004\u0018\u00010\fR$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR$\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0017\u0010,\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0017\u00107\u001a\u00020+8\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010/R\"\u0010:\u001a\u0002098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0011\u0010@\u001a\u0002008F¢\u0006\u0006\u001a\u0004\b@\u00104¨\u0006E"}, d2 = {"Lokhttp3/internal/cache2/Relay;", "", "Lokio/n;", "prefix", "", "upstreamSize", "metadataSize", "Lkotlin/r2;", "writeHeader", "writeMetadata", "commit", "metadata", "Lokio/n1;", "newSource", "Ljava/io/RandomAccessFile;", "file", "Ljava/io/RandomAccessFile;", "getFile", "()Ljava/io/RandomAccessFile;", "setFile", "(Ljava/io/RandomAccessFile;)V", "upstream", "Lokio/n1;", "getUpstream", "()Lokio/n1;", "setUpstream", "(Lokio/n1;)V", "upstreamPos", "J", "getUpstreamPos", "()J", "setUpstreamPos", "(J)V", "Lokio/n;", "bufferMaxSize", "getBufferMaxSize", "Ljava/lang/Thread;", "upstreamReader", "Ljava/lang/Thread;", "getUpstreamReader", "()Ljava/lang/Thread;", "setUpstreamReader", "(Ljava/lang/Thread;)V", "Lokio/l;", "upstreamBuffer", "Lokio/l;", "getUpstreamBuffer", "()Lokio/l;", "", "complete", "Z", "getComplete", "()Z", "setComplete", "(Z)V", "buffer", "getBuffer", "", "sourceCount", "I", "getSourceCount", "()I", "setSourceCount", "(I)V", "isClosed", "<init>", "(Ljava/io/RandomAccessFile;Lokio/n1;JLokio/n;J)V", "Companion", "RelaySource", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Relay {

    @l
    public static final Companion Companion = new Companion(null);
    private static final long FILE_HEADER_SIZE = 32;

    @l
    @e
    public static final n PREFIX_CLEAN;

    @l
    @e
    public static final n PREFIX_DIRTY;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;

    @l
    private final okio.l buffer;
    private final long bufferMaxSize;
    private boolean complete;

    @m
    private RandomAccessFile file;

    @l
    private final n metadata;
    private int sourceCount;

    @m
    private n1 upstream;

    @l
    private final okio.l upstreamBuffer;
    private long upstreamPos;

    @m
    private Thread upstreamReader;

    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\r\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/cache2/Relay$Companion;", "", "Ljava/io/File;", "file", "Lokio/n1;", "upstream", "Lokio/n;", "metadata", "", "bufferMaxSize", "Lokhttp3/internal/cache2/Relay;", "edit", "read", "FILE_HEADER_SIZE", "J", "PREFIX_CLEAN", "Lokio/n;", "PREFIX_DIRTY", "", "SOURCE_FILE", "I", "SOURCE_UPSTREAM", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final Relay edit(@l File file, @l n1 upstream, @l n metadata, long j5) throws IOException {
            l0.p(file, "file");
            l0.p(upstream, "upstream");
            l0.p(metadata, "metadata");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            Relay relay = new Relay(randomAccessFile, upstream, 0L, metadata, j5, null);
            randomAccessFile.setLength(0L);
            relay.writeHeader(Relay.PREFIX_DIRTY, -1L, -1L);
            return relay;
        }

        @l
        public final Relay read(@l File file) throws IOException {
            l0.p(file, "file");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            FileChannel channel = randomAccessFile.getChannel();
            l0.o(channel, "randomAccessFile.channel");
            FileOperator fileOperator = new FileOperator(channel);
            okio.l lVar = new okio.l();
            fileOperator.read(0L, lVar, 32L);
            if (l0.g(lVar.Y(r1.size()), Relay.PREFIX_CLEAN)) {
                long readLong = lVar.readLong();
                long readLong2 = lVar.readLong();
                okio.l lVar2 = new okio.l();
                fileOperator.read(readLong + 32, lVar2, readLong2);
                return new Relay(randomAccessFile, null, readLong, lVar2.m0(), 0L, null);
            }
            throw new IOException("unreadable cache file");
        }
    }

    @i0(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/cache2/Relay$RelaySource;", "Lokio/n1;", "Lokio/l;", "sink", "", "byteCount", "read", "Lokio/p1;", a.Z, "Lkotlin/r2;", ILivePush.ClickType.CLOSE, "Lokio/p1;", "Lokhttp3/internal/cache2/FileOperator;", "fileOperator", "Lokhttp3/internal/cache2/FileOperator;", "sourcePos", "J", "<init>", "(Lokhttp3/internal/cache2/Relay;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nRelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,356:1\n563#2:357\n*S KotlinDebug\n*F\n+ 1 Relay.kt\nokhttp3/internal/cache2/Relay$RelaySource\n*L\n267#1:357\n*E\n"})
    /* loaded from: classes4.dex */
    public final class RelaySource implements n1 {

        @m
        private FileOperator fileOperator;
        private long sourcePos;

        @l
        private final p1 timeout = new p1();

        public RelaySource() {
            RandomAccessFile file = Relay.this.getFile();
            l0.m(file);
            FileChannel channel = file.getChannel();
            l0.o(channel, "file!!.channel");
            this.fileOperator = new FileOperator(channel);
        }

        @Override // okio.n1, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.fileOperator == null) {
                return;
            }
            RandomAccessFile randomAccessFile = null;
            this.fileOperator = null;
            Relay relay = Relay.this;
            synchronized (relay) {
                relay.setSourceCount(relay.getSourceCount() - 1);
                if (relay.getSourceCount() == 0) {
                    RandomAccessFile file = relay.getFile();
                    relay.setFile(null);
                    randomAccessFile = file;
                }
                r2 r2Var = r2.f19517a;
            }
            if (randomAccessFile != null) {
                Util.closeQuietly(randomAccessFile);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        
            if (r4 != 2) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
        
            r8 = java.lang.Math.min(r21, r19.this$0.getUpstreamPos() - r19.sourcePos);
            r2 = r19.fileOperator;
            kotlin.jvm.internal.l0.m(r2);
            r2.read(r19.sourcePos + 32, r20, r8);
            r19.sourcePos += r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
        
            return r8;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
        
            r0 = r19.this$0.getUpstream();
            kotlin.jvm.internal.l0.m(r0);
            r14 = r0.read(r19.this$0.getUpstreamBuffer(), r19.this$0.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
        
            if (r14 != (-1)) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
        
            r0 = r19.this$0;
            r0.commit(r0.getUpstreamPos());
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
        
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
        
            r2.setUpstreamReader(null);
            kotlin.jvm.internal.l0.n(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r0 = kotlin.r2.f19517a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00b2, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b3, code lost:
        
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00b7, code lost:
        
            r9 = java.lang.Math.min(r14, r21);
            r19.this$0.getUpstreamBuffer().y(r20, 0, r9);
            r19.sourcePos += r9;
            r13 = r19.fileOperator;
            kotlin.jvm.internal.l0.m(r13);
            r13.write(r19.this$0.getUpstreamPos() + 32, r19.this$0.getUpstreamBuffer().clone(), r14);
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00ee, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00ef, code lost:
        
            r2.getBuffer().write(r2.getUpstreamBuffer(), r14);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0108, code lost:
        
            if (r2.getBuffer().M0() <= r2.getBufferMaxSize()) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x010a, code lost:
        
            r2.getBuffer().skip(r2.getBuffer().M0() - r2.getBufferMaxSize());
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x011e, code lost:
        
            r2.setUpstreamPos(r2.getUpstreamPos() + r14);
            r0 = kotlin.r2.f19517a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0128, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x0129, code lost:
        
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x012b, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x012c, code lost:
        
            r2.setUpstreamReader(null);
            kotlin.jvm.internal.l0.n(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x0137, code lost:
        
            monitor-exit(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0138, code lost:
        
            return r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x013f, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x0140, code lost:
        
            r2 = r19.this$0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x0142, code lost:
        
            monitor-enter(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x0143, code lost:
        
            r2.setUpstreamReader(null);
            kotlin.jvm.internal.l0.n(r2, "null cannot be cast to non-null type java.lang.Object");
            r2.notifyAll();
            r3 = kotlin.r2.f19517a;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0151, code lost:
        
            throw r0;
         */
        @Override // okio.n1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public long read(@p4.l okio.l r20, long r21) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 389
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache2.Relay.RelaySource.read(okio.l, long):long");
        }

        @Override // okio.n1
        @l
        public p1 timeout() {
            return this.timeout;
        }
    }

    static {
        n.a aVar = n.Companion;
        PREFIX_CLEAN = aVar.l("OkHttp cache v1\n");
        PREFIX_DIRTY = aVar.l("OkHttp DIRTY :(\n");
    }

    private Relay(RandomAccessFile randomAccessFile, n1 n1Var, long j5, n nVar, long j6) {
        boolean z4;
        this.file = randomAccessFile;
        this.upstream = n1Var;
        this.upstreamPos = j5;
        this.metadata = nVar;
        this.bufferMaxSize = j6;
        this.upstreamBuffer = new okio.l();
        if (this.upstream == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.complete = z4;
        this.buffer = new okio.l();
    }

    public /* synthetic */ Relay(RandomAccessFile randomAccessFile, n1 n1Var, long j5, n nVar, long j6, w wVar) {
        this(randomAccessFile, n1Var, j5, nVar, j6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void writeHeader(n nVar, long j5, long j6) throws IOException {
        boolean z4;
        okio.l lVar = new okio.l();
        lVar.v0(nVar);
        lVar.writeLong(j5);
        lVar.writeLong(j6);
        if (lVar.M0() == 32) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            RandomAccessFile randomAccessFile = this.file;
            l0.m(randomAccessFile);
            FileChannel channel = randomAccessFile.getChannel();
            l0.o(channel, "file!!.channel");
            new FileOperator(channel).write(0L, lVar, 32L);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void writeMetadata(long j5) throws IOException {
        okio.l lVar = new okio.l();
        lVar.v0(this.metadata);
        RandomAccessFile randomAccessFile = this.file;
        l0.m(randomAccessFile);
        FileChannel channel = randomAccessFile.getChannel();
        l0.o(channel, "file!!.channel");
        new FileOperator(channel).write(32 + j5, lVar, this.metadata.size());
    }

    public final void commit(long j5) throws IOException {
        writeMetadata(j5);
        RandomAccessFile randomAccessFile = this.file;
        l0.m(randomAccessFile);
        randomAccessFile.getChannel().force(false);
        writeHeader(PREFIX_CLEAN, j5, this.metadata.size());
        RandomAccessFile randomAccessFile2 = this.file;
        l0.m(randomAccessFile2);
        randomAccessFile2.getChannel().force(false);
        synchronized (this) {
            this.complete = true;
            r2 r2Var = r2.f19517a;
        }
        n1 n1Var = this.upstream;
        if (n1Var != null) {
            Util.closeQuietly(n1Var);
        }
        this.upstream = null;
    }

    @l
    public final okio.l getBuffer() {
        return this.buffer;
    }

    public final long getBufferMaxSize() {
        return this.bufferMaxSize;
    }

    public final boolean getComplete() {
        return this.complete;
    }

    @m
    public final RandomAccessFile getFile() {
        return this.file;
    }

    public final int getSourceCount() {
        return this.sourceCount;
    }

    @m
    public final n1 getUpstream() {
        return this.upstream;
    }

    @l
    public final okio.l getUpstreamBuffer() {
        return this.upstreamBuffer;
    }

    public final long getUpstreamPos() {
        return this.upstreamPos;
    }

    @m
    public final Thread getUpstreamReader() {
        return this.upstreamReader;
    }

    public final boolean isClosed() {
        return this.file == null;
    }

    @l
    public final n metadata() {
        return this.metadata;
    }

    @m
    public final n1 newSource() {
        synchronized (this) {
            if (this.file == null) {
                return null;
            }
            this.sourceCount++;
            return new RelaySource();
        }
    }

    public final void setComplete(boolean z4) {
        this.complete = z4;
    }

    public final void setFile(@m RandomAccessFile randomAccessFile) {
        this.file = randomAccessFile;
    }

    public final void setSourceCount(int i5) {
        this.sourceCount = i5;
    }

    public final void setUpstream(@m n1 n1Var) {
        this.upstream = n1Var;
    }

    public final void setUpstreamPos(long j5) {
        this.upstreamPos = j5;
    }

    public final void setUpstreamReader(@m Thread thread) {
        this.upstreamReader = thread;
    }
}
