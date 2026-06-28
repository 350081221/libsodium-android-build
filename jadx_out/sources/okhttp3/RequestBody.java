package okhttp3;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.b1;
import kotlin.i0;
import kotlin.io.c;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.f;
import okhttp3.internal.Util;
import okio.n;
import okio.n1;
import okio.y0;
import p4.l;
import u3.h;
import u3.i;
import u3.m;

@i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\r\u0010\u000eJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016¨\u0006\u0010"}, d2 = {"Lokhttp3/RequestBody;", "", "Lokhttp3/MediaType;", "contentType", "", "contentLength", "Lokio/m;", "sink", "Lkotlin/r2;", "writeTo", "", "isDuplex", "isOneShot", "<init>", "()V", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public abstract class RequestBody {

    @l
    public static final Companion Companion = new Companion(null);

    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\b\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u0005*\u00020\t2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\nJ3\u0010\b\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0006\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u0005*\u00020\u00102\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0011J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0007J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\tH\u0007J.\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007J\u001a\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0010H\u0007¨\u0006\u0017"}, d2 = {"Lokhttp3/RequestBody$Companion;", "", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/RequestBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "toRequestBody", "Lokio/n;", "(Lokio/n;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "", "", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "([BLokhttp3/MediaType;II)Lokhttp3/RequestBody;", "Ljava/io/File;", "(Ljava/io/File;Lokhttp3/MediaType;)Lokhttp3/RequestBody;", "asRequestBody", "content", "file", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, String str, MediaType mediaType, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        @l
        @h(name = "create")
        @m
        public final RequestBody create(@l String str, @p4.m MediaType mediaType) {
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
            byte[] bytes = str.getBytes(charset);
            l0.o(bytes, "this as java.lang.String).getBytes(charset)");
            return create(bytes, mediaType, 0, bytes.length);
        }

        @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @m
        @l
        @i
        public final RequestBody create(@p4.m MediaType mediaType, @l byte[] content) {
            l0.p(content, "content");
            return create$default(this, mediaType, content, 0, 0, 12, (Object) null);
        }

        @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @m
        @l
        @i
        public final RequestBody create(@p4.m MediaType mediaType, @l byte[] content, int i5) {
            l0.p(content, "content");
            return create$default(this, mediaType, content, i5, 0, 8, (Object) null);
        }

        @h(name = "create")
        @m
        @l
        @i
        public final RequestBody create(@l byte[] bArr) {
            l0.p(bArr, "<this>");
            return create$default(this, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        }

        @h(name = "create")
        @m
        @l
        @i
        public final RequestBody create(@l byte[] bArr, @p4.m MediaType mediaType) {
            l0.p(bArr, "<this>");
            return create$default(this, bArr, mediaType, 0, 0, 6, (Object) null);
        }

        @h(name = "create")
        @m
        @l
        @i
        public final RequestBody create(@l byte[] bArr, @p4.m MediaType mediaType, int i5) {
            l0.p(bArr, "<this>");
            return create$default(this, bArr, mediaType, i5, 0, 4, (Object) null);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, n nVar, MediaType mediaType, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(nVar, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i5, int i6, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                mediaType = null;
            }
            if ((i7 & 2) != 0) {
                i5 = 0;
            }
            if ((i7 & 4) != 0) {
                i6 = bArr.length;
            }
            return companion.create(bArr, mediaType, i5, i6);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, File file, MediaType mediaType, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                mediaType = null;
            }
            return companion.create(file, mediaType);
        }

        public static /* synthetic */ RequestBody create$default(Companion companion, MediaType mediaType, byte[] bArr, int i5, int i6, int i7, Object obj) {
            if ((i7 & 4) != 0) {
                i5 = 0;
            }
            if ((i7 & 8) != 0) {
                i6 = bArr.length;
            }
            return companion.create(mediaType, bArr, i5, i6);
        }

        @l
        @h(name = "create")
        @m
        public final RequestBody create(@l final n nVar, @p4.m final MediaType mediaType) {
            l0.p(nVar, "<this>");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return nVar.size();
                }

                @Override // okhttp3.RequestBody
                @p4.m
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(@l okio.m sink) {
                    l0.p(sink, "sink");
                    sink.v0(nVar);
                }
            };
        }

        @h(name = "create")
        @m
        @l
        @i
        public final RequestBody create(@l final byte[] bArr, @p4.m final MediaType mediaType, final int i5, final int i6) {
            l0.p(bArr, "<this>");
            Util.checkOffsetAndCount(bArr.length, i5, i6);
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$toRequestBody$2
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return i6;
                }

                @Override // okhttp3.RequestBody
                @p4.m
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(@l okio.m sink) {
                    l0.p(sink, "sink");
                    sink.write(bArr, i5, i6);
                }
            };
        }

        @l
        @h(name = "create")
        @m
        public final RequestBody create(@l final File file, @p4.m final MediaType mediaType) {
            l0.p(file, "<this>");
            return new RequestBody() { // from class: okhttp3.RequestBody$Companion$asRequestBody$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return file.length();
                }

                @Override // okhttp3.RequestBody
                @p4.m
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.RequestBody
                public void writeTo(@l okio.m sink) {
                    l0.p(sink, "sink");
                    n1 t5 = y0.t(file);
                    try {
                        sink.G(t5);
                        c.a(t5, null);
                    } finally {
                    }
                }
            };
        }

        @l
        @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @m
        public final RequestBody create(@p4.m MediaType mediaType, @l String content) {
            l0.p(content, "content");
            return create(content, mediaType);
        }

        @l
        @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @m
        public final RequestBody create(@p4.m MediaType mediaType, @l n content) {
            l0.p(content, "content");
            return create(content, mediaType);
        }

        @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @m
        @l
        @i
        public final RequestBody create(@p4.m MediaType mediaType, @l byte[] content, int i5, int i6) {
            l0.p(content, "content");
            return create(content, mediaType, i5, i6);
        }

        @l
        @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @b1(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        @m
        public final RequestBody create(@p4.m MediaType mediaType, @l File file) {
            l0.p(file, "file");
            return create(file, mediaType);
        }
    }

    @l
    @h(name = "create")
    @m
    public static final RequestBody create(@l File file, @p4.m MediaType mediaType) {
        return Companion.create(file, mediaType);
    }

    @l
    @h(name = "create")
    @m
    public static final RequestBody create(@l String str, @p4.m MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    @l
    @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @b1(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @m
    public static final RequestBody create(@p4.m MediaType mediaType, @l File file) {
        return Companion.create(mediaType, file);
    }

    @l
    @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @m
    public static final RequestBody create(@p4.m MediaType mediaType, @l String str) {
        return Companion.create(mediaType, str);
    }

    @l
    @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @m
    public static final RequestBody create(@p4.m MediaType mediaType, @l n nVar) {
        return Companion.create(mediaType, nVar);
    }

    @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @m
    @l
    @i
    public static final RequestBody create(@p4.m MediaType mediaType, @l byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @m
    @l
    @i
    public static final RequestBody create(@p4.m MediaType mediaType, @l byte[] bArr, int i5) {
        return Companion.create(mediaType, bArr, i5);
    }

    @k(level = kotlin.m.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @b1(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @m
    @l
    @i
    public static final RequestBody create(@p4.m MediaType mediaType, @l byte[] bArr, int i5, int i6) {
        return Companion.create(mediaType, bArr, i5, i6);
    }

    @l
    @h(name = "create")
    @m
    public static final RequestBody create(@l n nVar, @p4.m MediaType mediaType) {
        return Companion.create(nVar, mediaType);
    }

    @h(name = "create")
    @m
    @l
    @i
    public static final RequestBody create(@l byte[] bArr) {
        return Companion.create(bArr);
    }

    @h(name = "create")
    @m
    @l
    @i
    public static final RequestBody create(@l byte[] bArr, @p4.m MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }

    @h(name = "create")
    @m
    @l
    @i
    public static final RequestBody create(@l byte[] bArr, @p4.m MediaType mediaType, int i5) {
        return Companion.create(bArr, mediaType, i5);
    }

    @h(name = "create")
    @m
    @l
    @i
    public static final RequestBody create(@l byte[] bArr, @p4.m MediaType mediaType, int i5, int i6) {
        return Companion.create(bArr, mediaType, i5, i6);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @p4.m
    public abstract MediaType contentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@l okio.m mVar) throws IOException;
}
