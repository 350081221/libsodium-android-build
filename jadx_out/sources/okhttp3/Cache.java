package okhttp3;

import com.bytedance.android.live.base.api.push.ILivePush;
import com.bytedance.sdk.openadsdk.api.plugin.PluginConstants;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import kotlin.b1;
import kotlin.i0;
import kotlin.io.c;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.t1;
import kotlin.k;
import kotlin.r2;
import kotlin.text.e0;
import kotlin.text.f0;
import kotlin.text.k0;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.BufferedSource;
import okio.l1;
import okio.n;
import okio.n1;
import okio.w;
import okio.x;
import okio.y0;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.protocol.HTTP;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import org.slf4j.d;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0004LKMNB!\b\u0000\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IB\u0019\b\u0016\u0012\u0006\u0010,\u001a\u00020)\u0012\u0006\u0010&\u001a\u00020$¢\u0006\u0004\bH\u0010JJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0018\u00010\u0003R\u00020\u0004H\u0002J\u0019\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0006\u0010\u001b\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0006J\u0006\u0010\u001d\u001a\u00020\u0006J\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eJ\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020!J\u0006\u0010%\u001a\u00020$J\u0006\u0010&\u001a\u00020$J\b\u0010'\u001a\u00020\u0006H\u0016J\b\u0010(\u001a\u00020\u0006H\u0016J\u000f\u0010,\u001a\u00020)H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u00101\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b/\u00100J\u000f\u00104\u001a\u00020\u0006H\u0000¢\u0006\u0004\b2\u00103J\u0006\u00105\u001a\u00020!J\u0006\u00106\u001a\u00020!J\u0006\u00107\u001a\u00020!R\u001a\u00108\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\"\u0010#\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b#\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\"\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010<\u001a\u0004\bA\u0010>\"\u0004\bB\u0010@R\u0016\u00105\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010<R\u0016\u00106\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010<R\u0016\u00107\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010<R\u0011\u0010D\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0011\u0010,\u001a\u00020)8G¢\u0006\u0006\u001a\u0004\b,\u0010+¨\u0006O"}, d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "Lkotlin/r2;", "abortQuietly", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "get$okhttp", "(Lokhttp3/Request;)Lokhttp3/Response;", "get", "response", "Lokhttp3/internal/cache/CacheRequest;", "put$okhttp", "(Lokhttp3/Response;)Lokhttp3/internal/cache/CacheRequest;", "put", "remove$okhttp", "(Lokhttp3/Request;)V", "remove", "cached", "network", "update$okhttp", "(Lokhttp3/Response;Lokhttp3/Response;)V", "update", "initialize", "delete", "evictAll", "", "", "urls", "", "writeAbortCount", "writeSuccessCount", "", "size", "maxSize", "flush", ILivePush.ClickType.CLOSE, "Ljava/io/File;", "-deprecated_directory", "()Ljava/io/File;", "directory", "Lokhttp3/internal/cache/CacheStrategy;", "cacheStrategy", "trackResponse$okhttp", "(Lokhttp3/internal/cache/CacheStrategy;)V", "trackResponse", "trackConditionalCacheHit$okhttp", "()V", "trackConditionalCacheHit", "networkCount", "hitCount", "requestCount", "cache", "Lokhttp3/internal/cache/DiskLruCache;", "getCache$okhttp", "()Lokhttp3/internal/cache/DiskLruCache;", "I", "getWriteSuccessCount$okhttp", "()I", "setWriteSuccessCount$okhttp", "(I)V", "getWriteAbortCount$okhttp", "setWriteAbortCount$okhttp", "", "isClosed", "()Z", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "<init>", "(Ljava/io/File;JLokhttp3/internal/io/FileSystem;)V", "(Ljava/io/File;J)V", "Companion", "CacheResponseBody", "Entry", "RealCacheRequest", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Cache implements Closeable, Flushable {

    @l
    public static final Companion Companion = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;

    @l
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\b\u0010\u0007\u001a\u00020\rH\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lokhttp3/Cache$CacheResponseBody;", "Lokhttp3/ResponseBody;", "snapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "contentType", "", "contentLength", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V", "bodySource", "Lokio/BufferedSource;", "getSnapshot", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "", "Lokhttp3/MediaType;", "source", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class CacheResponseBody extends ResponseBody {

        @l
        private final BufferedSource bodySource;

        @m
        private final String contentLength;

        @m
        private final String contentType;

        @l
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(@l DiskLruCache.Snapshot snapshot, @m String str, @m String str2) {
            l0.p(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = y0.e(new x(snapshot.getSource(1)) { // from class: okhttp3.Cache.CacheResponseBody.1
                @Override // okio.x, okio.n1, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    this.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.contentLength;
            if (str != null) {
                return Util.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.ResponseBody
        @m
        public MediaType contentType() {
            String str = this.contentType;
            if (str != null) {
                return MediaType.Companion.parse(str);
            }
            return null;
        }

        @l
        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        @l
        public BufferedSource source() {
            return this.bodySource;
        }
    }

    @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\b\u001a\u00060\u0006R\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\b\u001a\u00060\u0006R\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lokhttp3/Cache$RealCacheRequest;", "Lokhttp3/internal/cache/CacheRequest;", "Lkotlin/r2;", "abort", "Lokio/l1;", "body", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "cacheOut", "Lokio/l1;", "", "done", "Z", "getDone", "()Z", "setDone", "(Z)V", "<init>", "(Lokhttp3/Cache;Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    private final class RealCacheRequest implements CacheRequest {

        @l
        private final l1 body;

        @l
        private final l1 cacheOut;
        private boolean done;

        @l
        private final DiskLruCache.Editor editor;
        final /* synthetic */ Cache this$0;

        public RealCacheRequest(@l final Cache cache, DiskLruCache.Editor editor) {
            l0.p(editor, "editor");
            this.this$0 = cache;
            this.editor = editor;
            l1 newSink = editor.newSink(1);
            this.cacheOut = newSink;
            this.body = new w(newSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // okio.w, okio.l1, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    Cache cache2 = Cache.this;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache2) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache2.setWriteSuccessCount$okhttp(cache2.getWriteSuccessCount$okhttp() + 1);
                        super.close();
                        this.editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            Cache cache = this.this$0;
            synchronized (cache) {
                if (this.done) {
                    return;
                }
                this.done = true;
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        @l
        public l1 body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z4) {
            this.done = z4;
        }
    }

    public Cache(@l File directory, long j5, @l FileSystem fileSystem) {
        l0.p(directory, "directory");
        l0.p(fileSystem, "fileSystem");
        this.cache = new DiskLruCache(fileSystem, directory, VERSION, 2, j5, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    @l
    @u3.m
    public static final String key(@l HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    @l
    @h(name = "-deprecated_directory")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "directory", imports = {}))
    /* renamed from: -deprecated_directory, reason: not valid java name */
    public final File m6468deprecated_directory() {
        return this.cache.getDirectory();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public final void delete() throws IOException {
        this.cache.delete();
    }

    @l
    @h(name = "directory")
    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() throws IOException {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    @m
    public final Response get$okhttp(@l Request request) {
        l0.p(request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (!entry.matches(request, response)) {
                    ResponseBody body = response.body();
                    if (body != null) {
                        Util.closeQuietly(body);
                    }
                    return null;
                }
                return response;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    @l
    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() throws IOException {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    @m
    public final CacheRequest put$okhttp(@l Response response) {
        DiskLruCache.Editor editor;
        l0.p(response, "response");
        String method = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!l0.g(method, HttpGet.METHOD_NAME)) {
            return null;
        }
        Companion companion = Companion;
        if (companion.hasVaryAll(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editor = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editor == null) {
                return null;
            }
            try {
                entry.writeTo(editor);
                return new RealCacheRequest(this, editor);
            } catch (IOException unused2) {
                abortQuietly(editor);
                return null;
            }
        } catch (IOException unused3) {
            editor = null;
        }
    }

    public final void remove$okhttp(@l Request request) throws IOException {
        l0.p(request, "request");
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i5) {
        this.writeAbortCount = i5;
    }

    public final void setWriteSuccessCount$okhttp(int i5) {
        this.writeSuccessCount = i5;
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(@l CacheStrategy cacheStrategy) {
        l0.p(cacheStrategy, "cacheStrategy");
        this.requestCount++;
        if (cacheStrategy.getNetworkRequest() != null) {
            this.networkCount++;
        } else if (cacheStrategy.getCacheResponse() != null) {
            this.hitCount++;
        }
    }

    public final void update$okhttp(@l Response cached, @l Response network) {
        DiskLruCache.Editor editor;
        l0.p(cached, "cached");
        l0.p(network, "network");
        Entry entry = new Entry(network);
        ResponseBody body = cached.body();
        l0.n(body, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        try {
            editor = ((CacheResponseBody) body).getSnapshot().edit();
            if (editor == null) {
                return;
            }
            try {
                entry.writeTo(editor);
                editor.commit();
            } catch (IOException unused) {
                abortQuietly(editor);
            }
        } catch (IOException unused2) {
            editor = null;
        }
    }

    @l
    public final Iterator<String> urls() throws IOException {
        return new Cache$urls$1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    @i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u000fJ\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002J\u001e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aJ\n\u0010\u001b\u001a\u00020\u0015*\u00020\u0017J\u0012\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u001d*\u00020\u0011H\u0002J\n\u0010\u0010\u001a\u00020\u0011*\u00020\u0017R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lokhttp3/Cache$Companion;", "", "()V", "ENTRY_BODY", "", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", DatabaseFileArchive.COLUMN_KEY, "", "url", "Lokhttp3/HttpUrl;", "readInt", "source", "Lokio/BufferedSource;", "readInt$okhttp", "varyHeaders", "Lokhttp3/Headers;", "requestHeaders", "responseHeaders", "varyMatches", "", "cachedResponse", "Lokhttp3/Response;", "cachedRequest", "newRequest", "Lokhttp3/Request;", "hasVaryAll", "varyFields", "", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,788:1\n2624#2,3:789\n*S KotlinDebug\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n*L\n729#1:789,3\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            Set<String> k5;
            boolean K1;
            List Q4;
            CharSequence C5;
            Comparator Q1;
            int size = headers.size();
            TreeSet treeSet = null;
            for (int i5 = 0; i5 < size; i5++) {
                K1 = e0.K1("Vary", headers.name(i5), true);
                if (K1) {
                    String value = headers.value(i5);
                    if (treeSet == null) {
                        Q1 = e0.Q1(t1.f19457a);
                        treeSet = new TreeSet(Q1);
                    }
                    Q4 = f0.Q4(value, new char[]{','}, false, 0, 6, null);
                    Iterator it = Q4.iterator();
                    while (it.hasNext()) {
                        C5 = f0.C5((String) it.next());
                        treeSet.add(C5.toString());
                    }
                }
            }
            if (treeSet == null) {
                k5 = kotlin.collections.l1.k();
                return k5;
            }
            return treeSet;
        }

        public final boolean hasVaryAll(@l Response response) {
            l0.p(response, "<this>");
            return varyFields(response.headers()).contains(d.ANY_MARKER);
        }

        @l
        @u3.m
        public final String key(@l HttpUrl url) {
            l0.p(url, "url");
            return n.Companion.l(url.toString()).md5().hex();
        }

        public final int readInt$okhttp(@l BufferedSource source) throws IOException {
            boolean z4;
            l0.p(source, "source");
            try {
                long g02 = source.g0();
                String K = source.K();
                if (g02 >= 0 && g02 <= 2147483647L) {
                    if (K.length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z4) {
                        return (int) g02;
                    }
                }
                throw new IOException("expected an int but was \"" + g02 + K + k0.f19765b);
            } catch (NumberFormatException e5) {
                throw new IOException(e5.getMessage());
            }
        }

        @l
        public final Headers varyHeaders(@l Response response) {
            l0.p(response, "<this>");
            Response networkResponse = response.networkResponse();
            l0.m(networkResponse);
            return varyHeaders(networkResponse.request().headers(), response.headers());
        }

        public final boolean varyMatches(@l Response cachedResponse, @l Headers cachedRequest, @l Request newRequest) {
            l0.p(cachedResponse, "cachedResponse");
            l0.p(cachedRequest, "cachedRequest");
            l0.p(newRequest, "newRequest");
            Set<String> varyFields = varyFields(cachedResponse.headers());
            if ((varyFields instanceof Collection) && varyFields.isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if (!l0.g(cachedRequest.values(str), newRequest.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> varyFields = varyFields(headers2);
            if (varyFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            for (int i5 = 0; i5 < size; i5++) {
                String name = headers.name(i5);
                if (varyFields.contains(name)) {
                    builder.add(name, headers.value(i5));
                }
            }
            return builder.build();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Cache(@l File directory, long j5) {
        this(directory, j5, FileSystem.SYSTEM);
        l0.p(directory, "directory");
    }

    @Instrumented
    @i0(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 72\u00020\u0001:\u00017B\u0011\b\u0016\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b4\u00106J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0012\u0010\u000f\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fR\u00020\rJ\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0013\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0016R\u00020\rR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010 R\u0014\u0010(\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001dR\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00068"}, d2 = {"Lokhttp3/Cache$Entry;", "", "Lokio/BufferedSource;", "source", "", "Ljava/security/cert/Certificate;", "readCertificateList", "Lokio/m;", "sink", "certificates", "Lkotlin/r2;", "writeCertList", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "writeTo", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "response", "", "matches", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "Lokhttp3/HttpUrl;", "url", "Lokhttp3/HttpUrl;", "Lokhttp3/Headers;", "varyHeaders", "Lokhttp3/Headers;", "", "requestMethod", "Ljava/lang/String;", "Lokhttp3/Protocol;", "protocol", "Lokhttp3/Protocol;", "", PluginConstants.KEY_ERROR_CODE, "I", CrashHianalyticsData.MESSAGE, "responseHeaders", "Lokhttp3/Handshake;", "handshake", "Lokhttp3/Handshake;", "", "sentRequestMillis", "J", "receivedResponseMillis", "isHttps", "()Z", "Lokio/n1;", "rawSource", "<init>", "(Lokio/n1;)V", "(Lokhttp3/Response;)V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    private static final class Entry {

        @l
        public static final Companion Companion = new Companion(null);

        @l
        private static final String RECEIVED_MILLIS;

        @l
        private static final String SENT_MILLIS;
        private final int code;

        @m
        private final Handshake handshake;

        @l
        private final String message;

        @l
        private final Protocol protocol;
        private final long receivedResponseMillis;

        @l
        private final String requestMethod;

        @l
        private final Headers responseHeaders;
        private final long sentRequestMillis;

        @l
        private final HttpUrl url;

        @l
        private final Headers varyHeaders;

        @i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lokhttp3/Cache$Entry$Companion;", "", "()V", "RECEIVED_MILLIS", "", "SENT_MILLIS", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.w wVar) {
                this();
            }
        }

        static {
            StringBuilder sb = new StringBuilder();
            Platform.Companion companion = Platform.Companion;
            sb.append(companion.get().getPrefix());
            sb.append("-Sent-Millis");
            SENT_MILLIS = sb.toString();
            RECEIVED_MILLIS = companion.get().getPrefix() + "-Received-Millis";
        }

        public Entry(@l n1 rawSource) throws IOException {
            TlsVersion tlsVersion;
            l0.p(rawSource, "rawSource");
            try {
                BufferedSource e5 = y0.e(rawSource);
                String K = e5.K();
                HttpUrl parse = HttpUrl.Companion.parse(K);
                if (parse != null) {
                    this.url = parse;
                    this.requestMethod = e5.K();
                    Headers.Builder builder = new Headers.Builder();
                    int readInt$okhttp = Cache.Companion.readInt$okhttp(e5);
                    for (int i5 = 0; i5 < readInt$okhttp; i5++) {
                        builder.addLenient$okhttp(e5.K());
                    }
                    this.varyHeaders = builder.build();
                    StatusLine parse2 = StatusLine.Companion.parse(e5.K());
                    this.protocol = parse2.protocol;
                    this.code = parse2.code;
                    this.message = parse2.message;
                    Headers.Builder builder2 = new Headers.Builder();
                    int readInt$okhttp2 = Cache.Companion.readInt$okhttp(e5);
                    for (int i6 = 0; i6 < readInt$okhttp2; i6++) {
                        builder2.addLenient$okhttp(e5.K());
                    }
                    String str = SENT_MILLIS;
                    String str2 = builder2.get(str);
                    String str3 = RECEIVED_MILLIS;
                    String str4 = builder2.get(str3);
                    builder2.removeAll(str);
                    builder2.removeAll(str3);
                    this.sentRequestMillis = str2 != null ? Long.parseLong(str2) : 0L;
                    this.receivedResponseMillis = str4 != null ? Long.parseLong(str4) : 0L;
                    this.responseHeaders = builder2.build();
                    if (isHttps()) {
                        String K2 = e5.K();
                        if (!(K2.length() > 0)) {
                            CipherSuite forJavaName = CipherSuite.Companion.forJavaName(e5.K());
                            List<Certificate> readCertificateList = readCertificateList(e5);
                            List<Certificate> readCertificateList2 = readCertificateList(e5);
                            if (!e5.e0()) {
                                tlsVersion = TlsVersion.Companion.forJavaName(e5.K());
                            } else {
                                tlsVersion = TlsVersion.SSL_3_0;
                            }
                            this.handshake = Handshake.Companion.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                        } else {
                            throw new IOException("expected \"\" but was \"" + K2 + k0.f19765b);
                        }
                    } else {
                        this.handshake = null;
                    }
                    r2 r2Var = r2.f19517a;
                    c.a(rawSource, null);
                    return;
                }
                IOException iOException = new IOException("Cache corruption for " + K);
                Platform.Companion.get().log("cache corruption", 5, iOException);
                throw iOException;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    c.a(rawSource, th);
                    throw th2;
                }
            }
        }

        private final boolean isHttps() {
            return l0.g(this.url.scheme(), "https");
        }

        private final List<Certificate> readCertificateList(BufferedSource bufferedSource) throws IOException {
            List<Certificate> E;
            int readInt$okhttp = Cache.Companion.readInt$okhttp(bufferedSource);
            if (readInt$okhttp == -1) {
                E = kotlin.collections.w.E();
                return E;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                for (int i5 = 0; i5 < readInt$okhttp; i5++) {
                    String K = bufferedSource.K();
                    okio.l lVar = new okio.l();
                    n h5 = n.Companion.h(K);
                    if (h5 != null) {
                        lVar.v0(h5);
                        arrayList.add(certificateFactory.generateCertificate(lVar.z0()));
                    } else {
                        throw new IOException("Corrupt certificate in cache entry");
                    }
                }
                return arrayList;
            } catch (CertificateException e5) {
                throw new IOException(e5.getMessage());
            }
        }

        private final void writeCertList(okio.m mVar, List<? extends Certificate> list) throws IOException {
            try {
                mVar.V(list.size()).writeByte(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    byte[] bytes = it.next().getEncoded();
                    n.a aVar = n.Companion;
                    l0.o(bytes, "bytes");
                    mVar.C(n.a.p(aVar, bytes, 0, 0, 3, null).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e5) {
                throw new IOException(e5.getMessage());
            }
        }

        public final boolean matches(@l Request request, @l Response response) {
            l0.p(request, "request");
            l0.p(response, "response");
            if (l0.g(this.url, request.url()) && l0.g(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request)) {
                return true;
            }
            return false;
        }

        @l
        public final Response response(@l DiskLruCache.Snapshot snapshot) {
            Request build;
            Response.Builder body;
            l0.p(snapshot, "snapshot");
            String str = this.responseHeaders.get(HTTP.CONTENT_TYPE);
            String str2 = this.responseHeaders.get(HTTP.CONTENT_LEN);
            Request.Builder headers = new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders);
            if (!(headers instanceof Request.Builder)) {
                build = headers.build();
            } else {
                build = OkHttp3Instrumentation.build(headers);
            }
            Response.Builder headers2 = new Response.Builder().request(build).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders);
            CacheResponseBody cacheResponseBody = new CacheResponseBody(snapshot, str, str2);
            if (!(headers2 instanceof Response.Builder)) {
                body = headers2.body(cacheResponseBody);
            } else {
                body = OkHttp3Instrumentation.body(headers2, cacheResponseBody);
            }
            return body.handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(@l DiskLruCache.Editor editor) throws IOException {
            l0.p(editor, "editor");
            okio.m d5 = y0.d(editor.newSink(0));
            try {
                okio.m mVar = d5;
                mVar.C(this.url.toString()).writeByte(10);
                mVar.C(this.requestMethod).writeByte(10);
                mVar.V(this.varyHeaders.size()).writeByte(10);
                int size = this.varyHeaders.size();
                for (int i5 = 0; i5 < size; i5++) {
                    mVar.C(this.varyHeaders.name(i5)).C(": ").C(this.varyHeaders.value(i5)).writeByte(10);
                }
                mVar.C(new StatusLine(this.protocol, this.code, this.message).toString()).writeByte(10);
                mVar.V(this.responseHeaders.size() + 2).writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    mVar.C(this.responseHeaders.name(i6)).C(": ").C(this.responseHeaders.value(i6)).writeByte(10);
                }
                mVar.C(SENT_MILLIS).C(": ").V(this.sentRequestMillis).writeByte(10);
                mVar.C(RECEIVED_MILLIS).C(": ").V(this.receivedResponseMillis).writeByte(10);
                if (isHttps()) {
                    mVar.writeByte(10);
                    Handshake handshake = this.handshake;
                    l0.m(handshake);
                    mVar.C(handshake.cipherSuite().javaName()).writeByte(10);
                    writeCertList(mVar, this.handshake.peerCertificates());
                    writeCertList(mVar, this.handshake.localCertificates());
                    mVar.C(this.handshake.tlsVersion().javaName()).writeByte(10);
                }
                r2 r2Var = r2.f19517a;
                c.a(d5, null);
            } finally {
            }
        }

        public Entry(@l Response response) {
            l0.p(response, "response");
            this.url = response.request().url();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
