package okhttp3;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.android.live.base.api.push.ILivePush;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.b1;
import kotlin.i0;
import kotlin.io.c;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.r2;
import kotlin.text.f;
import kotlinx.coroutines.w0;
import okhttp3.internal.Util;
import okio.BufferedSource;
import okio.n;
import p4.l;
import p4.m;
import u3.h;

@i0(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0007¢\u0006\u0004\b \u0010!JB\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0004H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\b\u0010\u0010\u001a\u00020\u000fH&J\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0005H&J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u001aJ\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "", "T", "Lkotlin/Function1;", "Lokio/BufferedSource;", "consumer", "", "sizeMapper", "consumeSource", "(Lv3/l;Lv3/l;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Ljava/io/InputStream;", "byteStream", "source", "", "bytes", "Lokio/n;", "byteString", "Ljava/io/Reader;", "charStream", "", TypedValues.Custom.S_STRING, "Lkotlin/r2;", ILivePush.ClickType.CLOSE, "reader", "Ljava/io/Reader;", "<init>", "()V", "Companion", "BomAwareReader", "okhttp"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n1#1,321:1\n140#1,11:322\n140#1,11:333\n*S KotlinDebug\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n124#1:322,11\n134#1:333,11\n*E\n"})
/* loaded from: classes4.dex */
public abstract class ResponseBody implements Closeable {

    @l
    public static final Companion Companion = new Companion(null);

    @m
    private Reader reader;

    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "", "cbuf", "", w0.f20676e, "len", "read", "Lkotlin/r2;", ILivePush.ClickType.CLOSE, "Lokio/BufferedSource;", "source", "Lokio/BufferedSource;", "Ljava/nio/charset/Charset;", "charset", "Ljava/nio/charset/Charset;", "", "closed", "Z", "delegate", "Ljava/io/Reader;", "<init>", "(Lokio/BufferedSource;Ljava/nio/charset/Charset;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody$BomAwareReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class BomAwareReader extends Reader {

        @l
        private final Charset charset;
        private boolean closed;

        @m
        private Reader delegate;

        @l
        private final BufferedSource source;

        public BomAwareReader(@l BufferedSource source, @l Charset charset) {
            l0.p(source, "source");
            l0.p(charset, "charset");
            this.source = source;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            r2 r2Var;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
                r2Var = r2.f19517a;
            } else {
                r2Var = null;
            }
            if (r2Var == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(@l char[] cbuf, int i5, int i6) throws IOException {
            l0.p(cbuf, "cbuf");
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    reader = new InputStreamReader(this.source.z0(), Util.readBomAsCharset(this.source, this.charset));
                    this.delegate = reader;
                }
                return reader.read(cbuf, i5, i6);
            }
            throw new IOException("Stream closed");
        }
    }

    @i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\b\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u0005*\u00020\t2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\b\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\fJ)\u0010\u0011\u001a\u00020\u0005*\u00020\r2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0006\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0007J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\tH\u0007J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001a\u00020\u000bH\u0007J\"\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\rH\u0007¨\u0006\u0015"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "toResponseBody", "", "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lokio/n;", "(Lokio/n;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lokio/BufferedSource;", "", "contentLength", "(Lokio/BufferedSource;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "asResponseBody", "content", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @l
        @h(name = "create")
        @u3.m
        public final ResponseBody create(@l String str, @m MediaType mediaType) {
            l0.p(str, "<this>");
            Charset charset = f.f19703b;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            okio.l n02 = new okio.l().n0(str, charset);
            return create(n02, mediaType, n02.M0());
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, n nVar, MediaType mediaType, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(nVar, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, BufferedSource bufferedSource, MediaType mediaType, long j5, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                mediaType = null;
            }
            if ((i5 & 2) != 0) {
                j5 = -1;
            }
            return companion.create(bufferedSource, mediaType, j5);
        }

        @l
        @h(name = "create")
        @u3.m
        public final ResponseBody create(@l byte[] bArr, @m MediaType mediaType) {
            l0.p(bArr, "<this>");
            return create(new okio.l().write(bArr), mediaType, bArr.length);
        }

        @l
        @h(name = "create")
        @u3.m
        public final ResponseBody create(@l n nVar, @m MediaType mediaType) {
            l0.p(nVar, "<this>");
            return create(new okio.l().v0(nVar), mediaType, nVar.size());
        }

        @l
        @h(name = "create")
        @u3.m
        public final ResponseBody create(@l final BufferedSource bufferedSource, @m final MediaType mediaType, final long j5) {
            l0.p(bufferedSource, "<this>");
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j5;
                }

                @Override // okhttp3.ResponseBody
                @m
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                @l
                public BufferedSource source() {
                    return bufferedSource;
                }
            };
        }

        @l
        @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @u3.m
        public final ResponseBody create(@m MediaType mediaType, @l String content) {
            l0.p(content, "content");
            return create(content, mediaType);
        }

        @l
        @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @u3.m
        public final ResponseBody create(@m MediaType mediaType, @l byte[] content) {
            l0.p(content, "content");
            return create(content, mediaType);
        }

        @l
        @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @u3.m
        public final ResponseBody create(@m MediaType mediaType, @l n content) {
            l0.p(content, "content");
            return create(content, mediaType);
        }

        @l
        @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @u3.m
        public final ResponseBody create(@m MediaType mediaType, long j5, @l BufferedSource content) {
            l0.p(content, "content");
            return create(content, mediaType, j5);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType contentType = contentType();
        return (contentType == null || (charset = contentType.charset(f.f19703b)) == null) ? f.f19703b : charset;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(v3.l<? super BufferedSource, ? extends T> lVar, v3.l<? super T, Integer> lVar2) {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            BufferedSource source = source();
            try {
                T invoke = lVar.invoke(source);
                kotlin.jvm.internal.i0.d(1);
                c.a(source, null);
                kotlin.jvm.internal.i0.c(1);
                int intValue = lVar2.invoke(invoke).intValue();
                if (contentLength != -1 && contentLength != intValue) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + intValue + ") disagree");
                }
                return invoke;
            } finally {
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
    }

    @l
    @h(name = "create")
    @u3.m
    public static final ResponseBody create(@l String str, @m MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    @l
    @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @u3.m
    public static final ResponseBody create(@m MediaType mediaType, long j5, @l BufferedSource bufferedSource) {
        return Companion.create(mediaType, j5, bufferedSource);
    }

    @l
    @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @u3.m
    public static final ResponseBody create(@m MediaType mediaType, @l String str) {
        return Companion.create(mediaType, str);
    }

    @l
    @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @u3.m
    public static final ResponseBody create(@m MediaType mediaType, @l n nVar) {
        return Companion.create(mediaType, nVar);
    }

    @l
    @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @u3.m
    public static final ResponseBody create(@m MediaType mediaType, @l byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    @l
    @h(name = "create")
    @u3.m
    public static final ResponseBody create(@l BufferedSource bufferedSource, @m MediaType mediaType, long j5) {
        return Companion.create(bufferedSource, mediaType, j5);
    }

    @l
    @h(name = "create")
    @u3.m
    public static final ResponseBody create(@l n nVar, @m MediaType mediaType) {
        return Companion.create(nVar, mediaType);
    }

    @l
    @h(name = "create")
    @u3.m
    public static final ResponseBody create(@l byte[] bArr, @m MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    @l
    public final InputStream byteStream() {
        return source().z0();
    }

    @l
    public final n byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            BufferedSource source = source();
            try {
                n m02 = source.m0();
                c.a(source, null);
                int size = m02.size();
                if (contentLength != -1 && contentLength != size) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + size + ") disagree");
                }
                return m02;
            } finally {
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
    }

    @l
    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            BufferedSource source = source();
            try {
                byte[] c02 = source.c0();
                c.a(source, null);
                int length = c02.length;
                if (contentLength != -1 && contentLength != length) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
                }
                return c02;
            } finally {
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + contentLength);
        }
    }

    @l
    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader == null) {
            BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
            this.reader = bomAwareReader;
            return bomAwareReader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    @m
    public abstract MediaType contentType();

    @l
    public abstract BufferedSource source();

    @l
    public final String string() throws IOException {
        BufferedSource source = source();
        try {
            String j02 = source.j0(Util.readBomAsCharset(source, charset()));
            c.a(source, null);
            return j02;
        } finally {
        }
    }
}
