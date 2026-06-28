package okhttp3.internal.cache;

import com.bytedance.android.live.base.api.push.ILivePush;
import com.lody.virtual.server.content.SyncStorageEngine;
import external.org.apache.commons.lang3.d;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.i0;
import kotlin.io.c;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.text.e0;
import kotlin.text.f0;
import kotlin.text.k0;
import kotlin.text.r;
import kotlin.y;
import okhttp3.internal.Util;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.BufferedSource;
import okio.l1;
import okio.n1;
import okio.x;
import okio.y0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import u3.e;
import u3.i;

@i0(d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b*\u0001`\u0018\u0000 g2\u00020\u00012\u00020\u0002:\u0004ghijB9\b\u0000\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00105\u001a\u000204\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010<\u001a\u000209\u0012\u0006\u0010@\u001a\u00020\u0017\u0012\u0006\u0010d\u001a\u00020c¢\u0006\u0004\be\u0010fJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0006\u0010\u0011\u001a\u00020\u0003J\u000f\u0010\u0014\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\b\u0018\u00010\u0015R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0086\u0002J \u0010\u001a\u001a\b\u0018\u00010\u0019R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007J\u0006\u0010\u001b\u001a\u00020\u0017J#\u0010 \u001a\u00020\u00032\n\u0010\u001c\u001a\u00060\u0019R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010!\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007J\u001b\u0010&\u001a\u00020\u000b2\n\u0010#\u001a\u00060\"R\u00020\u0000H\u0000¢\u0006\u0004\b$\u0010%J\b\u0010'\u001a\u00020\u0003H\u0016J\u0006\u0010(\u001a\u00020\u000bJ\b\u0010)\u001a\u00020\u0003H\u0016J\u0006\u0010*\u001a\u00020\u0003J\u0006\u0010+\u001a\u00020\u0003J\u0006\u0010,\u001a\u00020\u0003J\u0010\u0010.\u001a\f\u0012\b\u0012\u00060\u0015R\u00020\u00000-R\u001a\u00100\u001a\u00020/8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00105\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010<\u001a\u0002098\u0000X\u0080\u0004¢\u0006\f\n\u0004\b<\u0010;\u001a\u0004\b=\u0010>R*\u0010@\u001a\u00020\u00172\u0006\u0010?\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0014\u0010F\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u00106R\u0014\u0010G\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u00106R\u0014\u0010H\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u00106R\u0016\u0010\u001b\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010AR\u0018\u0010I\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR*\u0010L\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u00060\"R\u00020\u00000K8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010P\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010;R\u0016\u0010Q\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010RR\u0016\u0010T\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010RR\"\u0010U\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010R\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0016\u0010Z\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010RR\u0016\u0010[\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010RR\u0016\u0010\\\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010AR\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006k"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lkotlin/r2;", "readJournal", "Lokio/m;", "newJournalWriter", "", "line", "readJournalLine", "processJournal", "", "journalRebuildRequired", "checkNotClosed", "removeOldestEntry", DatabaseFileArchive.COLUMN_KEY, "validateKey", "initialize", "rebuildJournal$okhttp", "()V", "rebuildJournal", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "", "expectedSequenceNumber", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "edit", "size", "editor", SyncStorageEngine.MESG_SUCCESS, "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "completeEdit", "remove", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "entry", "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "removeEntry", "flush", "isClosed", ILivePush.ClickType.CLOSE, "trimToSize", "delete", "evictAll", "", "snapshots", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "directory", "Ljava/io/File;", "getDirectory", "()Ljava/io/File;", "", "appVersion", "I", "valueCount", "getValueCount$okhttp", "()I", b.f22420d, "maxSize", "J", "getMaxSize", "()J", "setMaxSize", "(J)V", "journalFile", "journalFileTmp", "journalFileBackup", "journalWriter", "Lokio/m;", "Ljava/util/LinkedHashMap;", "lruEntries", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "redundantOpCount", "hasJournalErrors", "Z", "civilizedFileSystem", "initialized", "closed", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "mostRecentTrimFailed", "mostRecentRebuildFailed", "nextSequenceNumber", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "okhttp3/internal/cache/DiskLruCache$cleanupTask$1", "cleanupTask", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "<init>", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "Companion", "Editor", "Entry", "Snapshot", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokhttp3/internal/Util\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,1065:1\n1#2:1066\n608#3,4:1067\n37#4,2:1071\n37#4,2:1073\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache\n*L\n215#1:1067,4\n672#1:1071,2\n721#1:1073,2\n*E\n"})
/* loaded from: classes4.dex */
public final class DiskLruCache implements Closeable, Flushable {
    private final int appVersion;
    private boolean civilizedFileSystem;

    @l
    private final TaskQueue cleanupQueue;

    @l
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;

    @l
    private final File directory;

    @l
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;

    @l
    private final File journalFile;

    @l
    private final File journalFileBackup;

    @l
    private final File journalFileTmp;

    @m
    private okio.m journalWriter;

    @l
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    @e
    public static final String JOURNAL_FILE = "journal";

    @l
    @e
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";

    @l
    @e
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";

    @l
    @e
    public static final String MAGIC = "libcore.io.DiskLruCache";

    @l
    @e
    public static final String VERSION_1 = "1";

    @e
    public static final long ANY_SEQUENCE_NUMBER = -1;

    @l
    @e
    public static final r LEGAL_KEY_PATTERN = new r("[a-z0-9_-]{1,120}");

    @l
    @e
    public static final String CLEAN = "CLEAN";

    @l
    @e
    public static final String DIRTY = "DIRTY";

    @l
    @e
    public static final String REMOVE = "REMOVE";

    @l
    @e
    public static final String READ = "READ";

    @i0(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u00058\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Companion;", "", "", "ANY_SEQUENCE_NUMBER", "J", "", "CLEAN", "Ljava/lang/String;", "DIRTY", "JOURNAL_FILE", "JOURNAL_FILE_BACKUP", "JOURNAL_FILE_TEMP", "Lkotlin/text/r;", "LEGAL_KEY_PATTERN", "Lkotlin/text/r;", "MAGIC", "READ", "REMOVE", "VERSION_1", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    @i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0010\u001a\u00060\u000eR\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002R\u001e\u0010\u0010\u001a\u00060\u000eR\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "Lkotlin/r2;", "detach$okhttp", "()V", "detach", "", "index", "Lokio/n1;", "newSource", "Lokio/l1;", "newSink", "commit", "abort", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "entry", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "written", "[Z", "getWritten$okhttp", "()[Z", "", "done", "Z", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public final class Editor {
        private boolean done;

        @l
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;

        @m
        private final boolean[] written;

        public Editor(@l DiskLruCache diskLruCache, Entry entry) {
            boolean[] zArr;
            l0.p(entry, "entry");
            this.this$0 = diskLruCache;
            this.entry = entry;
            if (entry.getReadable$okhttp()) {
                zArr = null;
            } else {
                zArr = new boolean[diskLruCache.getValueCount$okhttp()];
            }
            this.written = zArr;
        }

        public final void abort() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!this.done) {
                    if (l0.g(this.entry.getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, false);
                    }
                    this.done = true;
                    r2 r2Var = r2.f19517a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void commit() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!this.done) {
                    if (l0.g(this.entry.getCurrentEditor$okhttp(), this)) {
                        diskLruCache.completeEdit$okhttp(this, true);
                    }
                    this.done = true;
                    r2 r2Var = r2.f19517a;
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            }
        }

        public final void detach$okhttp() {
            if (l0.g(this.entry.getCurrentEditor$okhttp(), this)) {
                if (this.this$0.civilizedFileSystem) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        @l
        public final Entry getEntry$okhttp() {
            return this.entry;
        }

        @m
        public final boolean[] getWritten$okhttp() {
            return this.written;
        }

        @l
        public final l1 newSink(int i5) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!this.done) {
                    if (!l0.g(this.entry.getCurrentEditor$okhttp(), this)) {
                        return y0.c();
                    }
                    if (!this.entry.getReadable$okhttp()) {
                        boolean[] zArr = this.written;
                        l0.m(zArr);
                        zArr[i5] = true;
                    }
                    try {
                        return new FaultHidingSink(diskLruCache.getFileSystem$okhttp().sink(this.entry.getDirtyFiles$okhttp().get(i5)), new DiskLruCache$Editor$newSink$1$1(diskLruCache, this));
                    } catch (FileNotFoundException unused) {
                        return y0.c();
                    }
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }

        @m
        public final n1 newSource(int i5) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (!this.done) {
                    n1 n1Var = null;
                    if (!this.entry.getReadable$okhttp() || !l0.g(this.entry.getCurrentEditor$okhttp(), this) || this.entry.getZombie$okhttp()) {
                        return null;
                    }
                    try {
                        n1Var = diskLruCache.getFileSystem$okhttp().source(this.entry.getCleanFiles$okhttp().get(i5));
                    } catch (FileNotFoundException unused) {
                    }
                    return n1Var;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
        }
    }

    @i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\t\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0003¢\u0006\u0004\bH\u0010IJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001d\u0010\u000e\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0018\u001a\b\u0018\u00010\u0014R\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\"\u0010+\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00101\u001a\u00020*8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R(\u00105\u001a\b\u0018\u000104R\u00020\u00158\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010;\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010B\u001a\u00020A8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006J"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "", "", "strings", "", "invalidLengths", "", "index", "Lokio/n1;", "newSource", "Lkotlin/r2;", "setLengths$okhttp", "(Ljava/util/List;)V", "setLengths", "Lokio/m;", "writer", "writeLengths$okhttp", "(Lokio/m;)V", "writeLengths", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", DatabaseFileArchive.COLUMN_KEY, "Ljava/lang/String;", "getKey$okhttp", "()Ljava/lang/String;", "", "lengths", "[J", "getLengths$okhttp", "()[J", "", "Ljava/io/File;", "cleanFiles", "Ljava/util/List;", "getCleanFiles$okhttp", "()Ljava/util/List;", "dirtyFiles", "getDirtyFiles$okhttp", "", "readable", "Z", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "zombie", "getZombie$okhttp", "setZombie$okhttp", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "lockingSourceCount", "I", "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "", "sequenceNumber", "J", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nDiskLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,1065:1\n608#2,4:1066\n*S KotlinDebug\n*F\n+ 1 DiskLruCache.kt\nokhttp3/internal/cache/DiskLruCache$Entry\n*L\n1001#1:1066,4\n*E\n"})
    /* loaded from: classes4.dex */
    public final class Entry {

        @l
        private final List<File> cleanFiles;

        @m
        private Editor currentEditor;

        @l
        private final List<File> dirtyFiles;

        @l
        private final String key;

        @l
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(@l DiskLruCache diskLruCache, String key) {
            l0.p(key, "key");
            this.this$0 = diskLruCache;
            this.key = key;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb = new StringBuilder(key);
            sb.append(d.f15957a);
            int length = sb.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i5 = 0; i5 < valueCount$okhttp; i5++) {
                sb.append(i5);
                this.cleanFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        private final Void invalidLengths(List<String> list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        private final n1 newSource(int i5) {
            final n1 source = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(i5));
            if (this.this$0.civilizedFileSystem) {
                return source;
            }
            this.lockingSourceCount++;
            final DiskLruCache diskLruCache = this.this$0;
            return new x(source) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;

                @Override // okio.x, okio.n1, java.io.Closeable, java.lang.AutoCloseable
                public void close() {
                    super.close();
                    if (!this.closed) {
                        this.closed = true;
                        DiskLruCache diskLruCache2 = diskLruCache;
                        DiskLruCache.Entry entry = this;
                        synchronized (diskLruCache2) {
                            entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount$okhttp() - 1);
                            if (entry.getLockingSourceCount$okhttp() == 0 && entry.getZombie$okhttp()) {
                                diskLruCache2.removeEntry$okhttp(entry);
                            }
                            r2 r2Var = r2.f19517a;
                        }
                    }
                }
            };
        }

        @l
        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        @m
        public final Editor getCurrentEditor$okhttp() {
            return this.currentEditor;
        }

        @l
        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        @l
        public final String getKey$okhttp() {
            return this.key;
        }

        @l
        public final long[] getLengths$okhttp() {
            return this.lengths;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.lockingSourceCount;
        }

        public final boolean getReadable$okhttp() {
            return this.readable;
        }

        public final long getSequenceNumber$okhttp() {
            return this.sequenceNumber;
        }

        public final boolean getZombie$okhttp() {
            return this.zombie;
        }

        public final void setCurrentEditor$okhttp(@m Editor editor) {
            this.currentEditor = editor;
        }

        public final void setLengths$okhttp(@l List<String> strings) throws IOException {
            l0.p(strings, "strings");
            if (strings.size() == this.this$0.getValueCount$okhttp()) {
                try {
                    int size = strings.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        this.lengths[i5] = Long.parseLong(strings.get(i5));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    invalidLengths(strings);
                    throw new y();
                }
            }
            invalidLengths(strings);
            throw new y();
        }

        public final void setLockingSourceCount$okhttp(int i5) {
            this.lockingSourceCount = i5;
        }

        public final void setReadable$okhttp(boolean z4) {
            this.readable = z4;
        }

        public final void setSequenceNumber$okhttp(long j5) {
            this.sequenceNumber = j5;
        }

        public final void setZombie$okhttp(boolean z4) {
            this.zombie = z4;
        }

        @m
        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (Util.assertionsEnabled && !Thread.holdsLock(diskLruCache)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + diskLruCache);
            }
            if (!this.readable) {
                return null;
            }
            if (!this.this$0.civilizedFileSystem && (this.currentEditor != null || this.zombie)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.lengths.clone();
            try {
                int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                for (int i5 = 0; i5 < valueCount$okhttp; i5++) {
                    arrayList.add(newSource(i5));
                }
                return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Util.closeQuietly((n1) it.next());
                }
                try {
                    this.this$0.removeEntry$okhttp(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void writeLengths$okhttp(@l okio.m writer) throws IOException {
            l0.p(writer, "writer");
            for (long j5 : this.lengths) {
                writer.writeByte(32).V(j5);
            }
        }
    }

    @i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u0003\u001a\u00020\u0002J\f\u0010\u0006\u001a\b\u0018\u00010\u0004R\u00020\u0005J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "", DatabaseFileArchive.COLUMN_KEY, "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "edit", "", "index", "Lokio/n1;", "getSource", "", "getLength", "Lkotlin/r2;", ILivePush.ClickType.CLOSE, "Ljava/lang/String;", "sequenceNumber", "J", "", "sources", "Ljava/util/List;", "", "lengths", "[J", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public final class Snapshot implements Closeable {

        @l
        private final String key;

        @l
        private final long[] lengths;
        private final long sequenceNumber;

        @l
        private final List<n1> sources;
        final /* synthetic */ DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(@l DiskLruCache diskLruCache, String key, @l long j5, @l List<? extends n1> sources, long[] lengths) {
            l0.p(key, "key");
            l0.p(sources, "sources");
            l0.p(lengths, "lengths");
            this.this$0 = diskLruCache;
            this.key = key;
            this.sequenceNumber = j5;
            this.sources = sources;
            this.lengths = lengths;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator<n1> it = this.sources.iterator();
            while (it.hasNext()) {
                Util.closeQuietly(it.next());
            }
        }

        @m
        public final Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final long getLength(int i5) {
            return this.lengths[i5];
        }

        @l
        public final n1 getSource(int i5) {
            return this.sources.get(i5);
        }

        @l
        public final String key() {
            return this.key;
        }
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(@l FileSystem fileSystem, @l File directory, int i5, int i6, long j5, @l TaskRunner taskRunner) {
        boolean z4;
        l0.p(fileSystem, "fileSystem");
        l0.p(directory, "directory");
        l0.p(taskRunner, "taskRunner");
        this.fileSystem = fileSystem;
        this.directory = directory;
        this.appVersion = i5;
        this.valueCount = i6;
        this.maxSize = j5;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        final String str = Util.okHttpName + " Cache";
        this.cleanupTask = new Task(str) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public long runOnce() {
                boolean z5;
                boolean journalRebuildRequired;
                DiskLruCache diskLruCache = DiskLruCache.this;
                synchronized (diskLruCache) {
                    z5 = diskLruCache.initialized;
                    if (!z5 || diskLruCache.getClosed$okhttp()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        diskLruCache.mostRecentTrimFailed = true;
                    }
                    try {
                        journalRebuildRequired = diskLruCache.journalRebuildRequired();
                        if (journalRebuildRequired) {
                            diskLruCache.rebuildJournal$okhttp();
                            diskLruCache.redundantOpCount = 0;
                        }
                    } catch (IOException unused2) {
                        diskLruCache.mostRecentRebuildFailed = true;
                        diskLruCache.journalWriter = y0.d(y0.c());
                    }
                    return -1L;
                }
            }
        };
        if (j5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i6 > 0) {
                this.journalFile = new File(directory, JOURNAL_FILE);
                this.journalFileTmp = new File(directory, JOURNAL_FILE_TEMP);
                this.journalFileBackup = new File(directory, JOURNAL_FILE_BACKUP);
                return;
            }
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        throw new IllegalArgumentException("maxSize <= 0".toString());
    }

    private final synchronized void checkNotClosed() {
        if (!(!this.closed)) {
            throw new IllegalStateException("cache is closed".toString());
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j5, int i5, Object obj) throws IOException {
        if ((i5 & 2) != 0) {
            j5 = ANY_SEQUENCE_NUMBER;
        }
        return diskLruCache.edit(str, j5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean journalRebuildRequired() {
        int i5 = this.redundantOpCount;
        if (i5 >= 2000 && i5 >= this.lruEntries.size()) {
            return true;
        }
        return false;
    }

    private final okio.m newJournalWriter() throws FileNotFoundException {
        return y0.d(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new DiskLruCache$newJournalWriter$faultHidingSink$1(this)));
    }

    private final void processJournal() throws IOException {
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            l0.o(next, "i.next()");
            Entry entry = next;
            int i5 = 0;
            if (entry.getCurrentEditor$okhttp() == null) {
                int i6 = this.valueCount;
                while (i5 < i6) {
                    this.size += entry.getLengths$okhttp()[i5];
                    i5++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i7 = this.valueCount;
                while (i5 < i7) {
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i5));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i5));
                    i5++;
                }
                it.remove();
            }
        }
    }

    private final void readJournal() throws IOException {
        boolean z4;
        BufferedSource e5 = y0.e(this.fileSystem.source(this.journalFile));
        try {
            String K = e5.K();
            String K2 = e5.K();
            String K3 = e5.K();
            String K4 = e5.K();
            String K5 = e5.K();
            if (l0.g(MAGIC, K) && l0.g(VERSION_1, K2) && l0.g(String.valueOf(this.appVersion), K3) && l0.g(String.valueOf(this.valueCount), K4)) {
                int i5 = 0;
                if (K5.length() > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    while (true) {
                        try {
                            readJournalLine(e5.K());
                            i5++;
                        } catch (EOFException unused) {
                            this.redundantOpCount = i5 - this.lruEntries.size();
                            if (!e5.e0()) {
                                rebuildJournal$okhttp();
                            } else {
                                this.journalWriter = newJournalWriter();
                            }
                            r2 r2Var = r2.f19517a;
                            c.a(e5, null);
                            return;
                        }
                    }
                }
            }
            throw new IOException("unexpected journal header: [" + K + ", " + K2 + ", " + K4 + ", " + K5 + ']');
        } finally {
        }
    }

    private final void readJournalLine(String str) throws IOException {
        int o32;
        int o33;
        String substring;
        boolean s22;
        boolean s23;
        boolean s24;
        List<String> Q4;
        boolean s25;
        o32 = f0.o3(str, ' ', 0, false, 6, null);
        if (o32 != -1) {
            int i5 = o32 + 1;
            o33 = f0.o3(str, ' ', i5, false, 4, null);
            if (o33 == -1) {
                substring = str.substring(i5);
                l0.o(substring, "this as java.lang.String).substring(startIndex)");
                String str2 = REMOVE;
                if (o32 == str2.length()) {
                    s25 = e0.s2(str, str2, false, 2, null);
                    if (s25) {
                        this.lruEntries.remove(substring);
                        return;
                    }
                }
            } else {
                substring = str.substring(i5, o33);
                l0.o(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            Entry entry = this.lruEntries.get(substring);
            if (entry == null) {
                entry = new Entry(this, substring);
                this.lruEntries.put(substring, entry);
            }
            if (o33 != -1) {
                String str3 = CLEAN;
                if (o32 == str3.length()) {
                    s24 = e0.s2(str, str3, false, 2, null);
                    if (s24) {
                        String substring2 = str.substring(o33 + 1);
                        l0.o(substring2, "this as java.lang.String).substring(startIndex)");
                        Q4 = f0.Q4(substring2, new char[]{' '}, false, 0, 6, null);
                        entry.setReadable$okhttp(true);
                        entry.setCurrentEditor$okhttp(null);
                        entry.setLengths$okhttp(Q4);
                        return;
                    }
                }
            }
            if (o33 == -1) {
                String str4 = DIRTY;
                if (o32 == str4.length()) {
                    s23 = e0.s2(str, str4, false, 2, null);
                    if (s23) {
                        entry.setCurrentEditor$okhttp(new Editor(this, entry));
                        return;
                    }
                }
            }
            if (o33 == -1) {
                String str5 = READ;
                if (o32 == str5.length()) {
                    s22 = e0.s2(str, str5, false, 2, null);
                    if (s22) {
                        return;
                    }
                }
            }
            throw new IOException("unexpected journal line: " + str);
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private final boolean removeOldestEntry() {
        for (Entry toEvict : this.lruEntries.values()) {
            if (!toEvict.getZombie$okhttp()) {
                l0.o(toEvict, "toEvict");
                removeEntry$okhttp(toEvict);
                return true;
            }
        }
        return false;
    }

    private final void validateKey(String str) {
        if (LEGAL_KEY_PATTERN.matches(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + k0.f19765b).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        Editor currentEditor$okhttp;
        if (this.initialized && !this.closed) {
            Collection<Entry> values = this.lruEntries.values();
            l0.o(values, "lruEntries.values");
            for (Entry entry : (Entry[]) values.toArray(new Entry[0])) {
                if (entry.getCurrentEditor$okhttp() != null && (currentEditor$okhttp = entry.getCurrentEditor$okhttp()) != null) {
                    currentEditor$okhttp.detach$okhttp();
                }
            }
            trimToSize();
            okio.m mVar = this.journalWriter;
            l0.m(mVar);
            mVar.close();
            this.journalWriter = null;
            this.closed = true;
            return;
        }
        this.closed = true;
    }

    public final synchronized void completeEdit$okhttp(@l Editor editor, boolean z4) throws IOException {
        l0.p(editor, "editor");
        Entry entry$okhttp = editor.getEntry$okhttp();
        if (l0.g(entry$okhttp.getCurrentEditor$okhttp(), editor)) {
            if (z4 && !entry$okhttp.getReadable$okhttp()) {
                int i5 = this.valueCount;
                for (int i6 = 0; i6 < i5; i6++) {
                    boolean[] written$okhttp = editor.getWritten$okhttp();
                    l0.m(written$okhttp);
                    if (written$okhttp[i6]) {
                        if (!this.fileSystem.exists(entry$okhttp.getDirtyFiles$okhttp().get(i6))) {
                            editor.abort();
                            return;
                        }
                    } else {
                        editor.abort();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i6);
                    }
                }
            }
            int i7 = this.valueCount;
            for (int i8 = 0; i8 < i7; i8++) {
                File file = entry$okhttp.getDirtyFiles$okhttp().get(i8);
                if (z4 && !entry$okhttp.getZombie$okhttp()) {
                    if (this.fileSystem.exists(file)) {
                        File file2 = entry$okhttp.getCleanFiles$okhttp().get(i8);
                        this.fileSystem.rename(file, file2);
                        long j5 = entry$okhttp.getLengths$okhttp()[i8];
                        long size = this.fileSystem.size(file2);
                        entry$okhttp.getLengths$okhttp()[i8] = size;
                        this.size = (this.size - j5) + size;
                    }
                } else {
                    this.fileSystem.delete(file);
                }
            }
            entry$okhttp.setCurrentEditor$okhttp(null);
            if (entry$okhttp.getZombie$okhttp()) {
                removeEntry$okhttp(entry$okhttp);
                return;
            }
            this.redundantOpCount++;
            okio.m mVar = this.journalWriter;
            l0.m(mVar);
            if (!entry$okhttp.getReadable$okhttp() && !z4) {
                this.lruEntries.remove(entry$okhttp.getKey$okhttp());
                mVar.C(REMOVE).writeByte(32);
                mVar.C(entry$okhttp.getKey$okhttp());
                mVar.writeByte(10);
                mVar.flush();
                if (this.size <= this.maxSize || journalRebuildRequired()) {
                    TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
                }
                return;
            }
            entry$okhttp.setReadable$okhttp(true);
            mVar.C(CLEAN).writeByte(32);
            mVar.C(entry$okhttp.getKey$okhttp());
            entry$okhttp.writeLengths$okhttp(mVar);
            mVar.writeByte(10);
            if (z4) {
                long j6 = this.nextSequenceNumber;
                this.nextSequenceNumber = 1 + j6;
                entry$okhttp.setSequenceNumber$okhttp(j6);
            }
            mVar.flush();
            if (this.size <= this.maxSize) {
            }
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void delete() throws IOException {
        close();
        this.fileSystem.deleteContents(this.directory);
    }

    @m
    @i
    public final Editor edit(@l String key) throws IOException {
        l0.p(key, "key");
        return edit$default(this, key, 0L, 2, null);
    }

    @m
    @i
    public final synchronized Editor edit(@l String key, long j5) throws IOException {
        Editor editor;
        l0.p(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (j5 != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber$okhttp() != j5)) {
            return null;
        }
        if (entry != null) {
            editor = entry.getCurrentEditor$okhttp();
        } else {
            editor = null;
        }
        if (editor != null) {
            return null;
        }
        if (entry != null && entry.getLockingSourceCount$okhttp() != 0) {
            return null;
        }
        if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
            okio.m mVar = this.journalWriter;
            l0.m(mVar);
            mVar.C(DIRTY).writeByte(32).C(key).writeByte(10);
            mVar.flush();
            if (this.hasJournalErrors) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, key);
                this.lruEntries.put(key, entry);
            }
            Editor editor2 = new Editor(this, entry);
            entry.setCurrentEditor$okhttp(editor2);
            return editor2;
        }
        TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        return null;
    }

    public final synchronized void evictAll() throws IOException {
        initialize();
        Collection<Entry> values = this.lruEntries.values();
        l0.o(values, "lruEntries.values");
        for (Entry entry : (Entry[]) values.toArray(new Entry[0])) {
            l0.o(entry, "entry");
            removeEntry$okhttp(entry);
        }
        this.mostRecentTrimFailed = false;
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (!this.initialized) {
            return;
        }
        checkNotClosed();
        trimToSize();
        okio.m mVar = this.journalWriter;
        l0.m(mVar);
        mVar.flush();
    }

    @m
    public final synchronized Snapshot get(@l String key) throws IOException {
        l0.p(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return null;
        }
        Snapshot snapshot$okhttp = entry.snapshot$okhttp();
        if (snapshot$okhttp == null) {
            return null;
        }
        this.redundantOpCount++;
        okio.m mVar = this.journalWriter;
        l0.m(mVar);
        mVar.C(READ).writeByte(32).C(key).writeByte(10);
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return snapshot$okhttp;
    }

    public final boolean getClosed$okhttp() {
        return this.closed;
    }

    @l
    public final File getDirectory() {
        return this.directory;
    }

    @l
    public final FileSystem getFileSystem$okhttp() {
        return this.fileSystem;
    }

    @l
    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        return this.lruEntries;
    }

    public final synchronized long getMaxSize() {
        return this.maxSize;
    }

    public final int getValueCount$okhttp() {
        return this.valueCount;
    }

    public final synchronized void initialize() throws IOException {
        if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.initialized) {
            return;
        }
        if (this.fileSystem.exists(this.journalFileBackup)) {
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.delete(this.journalFileBackup);
            } else {
                this.fileSystem.rename(this.journalFileBackup, this.journalFile);
            }
        }
        this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
        if (this.fileSystem.exists(this.journalFile)) {
            try {
                readJournal();
                processJournal();
                this.initialized = true;
                return;
            } catch (IOException e5) {
                Platform.Companion.get().log("DiskLruCache " + this.directory + " is corrupt: " + e5.getMessage() + ", removing", 5, e5);
                try {
                    delete();
                    this.closed = false;
                } catch (Throwable th) {
                    this.closed = false;
                    throw th;
                }
            }
        }
        rebuildJournal$okhttp();
        this.initialized = true;
    }

    public final synchronized boolean isClosed() {
        return this.closed;
    }

    public final synchronized void rebuildJournal$okhttp() throws IOException {
        okio.m mVar = this.journalWriter;
        if (mVar != null) {
            mVar.close();
        }
        okio.m d5 = y0.d(this.fileSystem.sink(this.journalFileTmp));
        try {
            okio.m mVar2 = d5;
            mVar2.C(MAGIC).writeByte(10);
            mVar2.C(VERSION_1).writeByte(10);
            mVar2.V(this.appVersion).writeByte(10);
            mVar2.V(this.valueCount).writeByte(10);
            mVar2.writeByte(10);
            for (Entry entry : this.lruEntries.values()) {
                if (entry.getCurrentEditor$okhttp() != null) {
                    mVar2.C(DIRTY).writeByte(32);
                    mVar2.C(entry.getKey$okhttp());
                    mVar2.writeByte(10);
                } else {
                    mVar2.C(CLEAN).writeByte(32);
                    mVar2.C(entry.getKey$okhttp());
                    entry.writeLengths$okhttp(mVar2);
                    mVar2.writeByte(10);
                }
            }
            r2 r2Var = r2.f19517a;
            c.a(d5, null);
            if (this.fileSystem.exists(this.journalFile)) {
                this.fileSystem.rename(this.journalFile, this.journalFileBackup);
            }
            this.fileSystem.rename(this.journalFileTmp, this.journalFile);
            this.fileSystem.delete(this.journalFileBackup);
            this.journalWriter = newJournalWriter();
            this.hasJournalErrors = false;
            this.mostRecentRebuildFailed = false;
        } finally {
        }
    }

    public final synchronized boolean remove(@l String key) throws IOException {
        l0.p(key, "key");
        initialize();
        checkNotClosed();
        validateKey(key);
        Entry entry = this.lruEntries.get(key);
        if (entry == null) {
            return false;
        }
        boolean removeEntry$okhttp = removeEntry$okhttp(entry);
        if (removeEntry$okhttp && this.size <= this.maxSize) {
            this.mostRecentTrimFailed = false;
        }
        return removeEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(@l Entry entry) throws IOException {
        okio.m mVar;
        l0.p(entry, "entry");
        if (!this.civilizedFileSystem) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (mVar = this.journalWriter) != null) {
                mVar.C(DIRTY);
                mVar.writeByte(32);
                mVar.C(entry.getKey$okhttp());
                mVar.writeByte(10);
                mVar.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        Editor currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        int i5 = this.valueCount;
        for (int i6 = 0; i6 < i5; i6++) {
            this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i6));
            this.size -= entry.getLengths$okhttp()[i6];
            entry.getLengths$okhttp()[i6] = 0;
        }
        this.redundantOpCount++;
        okio.m mVar2 = this.journalWriter;
        if (mVar2 != null) {
            mVar2.C(REMOVE);
            mVar2.writeByte(32);
            mVar2.C(entry.getKey$okhttp());
            mVar2.writeByte(10);
        }
        this.lruEntries.remove(entry.getKey$okhttp());
        if (journalRebuildRequired()) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z4) {
        this.closed = z4;
    }

    public final synchronized void setMaxSize(long j5) {
        this.maxSize = j5;
        if (this.initialized) {
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
        }
    }

    public final synchronized long size() throws IOException {
        initialize();
        return this.size;
    }

    @l
    public final synchronized Iterator<Snapshot> snapshots() throws IOException {
        initialize();
        return new DiskLruCache$snapshots$1(this);
    }

    public final void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            if (!removeOldestEntry()) {
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }
}
