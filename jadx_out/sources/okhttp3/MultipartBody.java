package okhttp3;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.umeng.analytics.pro.cx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import kotlin.text.k0;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;
import okio.n;
import org.apache.http.protocol.HTTP;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import u3.e;
import u3.h;
import u3.i;

@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 '2\u00020\u0001:\u0003(')B'\b\u0000\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0018¢\u0006\u0004\b%\u0010&J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u0010\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0017\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u0018H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u001c\u001a\u00020\u0006H\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0017\u0010\u0010\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0007¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\"R\u0016\u0010\u001c\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010$R\u0011\u0010\u0014\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0017\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016¨\u0006*"}, d2 = {"Lokhttp3/MultipartBody;", "Lokhttp3/RequestBody;", "Lokio/m;", "sink", "", "countBytes", "", "writeOrCountBytes", "", "index", "Lokhttp3/MultipartBody$Part;", "part", "Lokhttp3/MediaType;", "contentType", "-deprecated_type", "()Lokhttp3/MediaType;", "type", "", "-deprecated_boundary", "()Ljava/lang/String;", "boundary", "-deprecated_size", "()I", "size", "", "-deprecated_parts", "()Ljava/util/List;", "parts", "contentLength", "Lkotlin/r2;", "writeTo", "Lokio/n;", "boundaryByteString", "Lokio/n;", "Lokhttp3/MediaType;", "Ljava/util/List;", "J", "<init>", "(Lokio/n;Lokhttp3/MediaType;Ljava/util/List;)V", "Companion", "Builder", "Part", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class MultipartBody extends RequestBody {

    @l
    @e
    public static final MediaType ALTERNATIVE;

    @l
    private static final byte[] COLONSPACE;

    @l
    private static final byte[] CRLF;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final byte[] DASHDASH;

    @l
    @e
    public static final MediaType DIGEST;

    @l
    @e
    public static final MediaType FORM;

    @l
    @e
    public static final MediaType MIXED;

    @l
    @e
    public static final MediaType PARALLEL;

    @l
    private final n boundaryByteString;
    private long contentLength;

    @l
    private final MediaType contentType;

    @l
    private final List<Part> parts;

    @l
    private final MediaType type;

    @i0(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\u0007\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ \u0010\r\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lokhttp3/MultipartBody$Builder;", "", "Lokhttp3/MediaType;", "type", "setType", "Lokhttp3/RequestBody;", "body", "addPart", "Lokhttp3/Headers;", TTDownloadField.TT_HEADERS, "", "name", b.f22420d, "addFormDataPart", "filename", "Lokhttp3/MultipartBody$Part;", "part", "Lokhttp3/MultipartBody;", "build", "Lokio/n;", "boundary", "Lokio/n;", "Lokhttp3/MediaType;", "", "parts", "Ljava/util/List;", "<init>", "(Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class Builder {

        @l
        private final n boundary;

        @l
        private final List<Part> parts;

        @l
        private MediaType type;

        /* JADX WARN: Multi-variable type inference failed */
        @i
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @i
        public Builder(@l String boundary) {
            l0.p(boundary, "boundary");
            this.boundary = n.Companion.l(boundary);
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        @l
        public final Builder addFormDataPart(@l String name, @l String value) {
            l0.p(name, "name");
            l0.p(value, "value");
            addPart(Part.Companion.createFormData(name, value));
            return this;
        }

        @l
        public final Builder addPart(@l RequestBody body) {
            l0.p(body, "body");
            addPart(Part.Companion.create(body));
            return this;
        }

        @l
        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        @l
        public final Builder setType(@l MediaType type) {
            l0.p(type, "type");
            if (l0.g(type.type(), "multipart")) {
                this.type = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }

        @l
        public final Builder addFormDataPart(@l String name, @m String str, @l RequestBody body) {
            l0.p(name, "name");
            l0.p(body, "body");
            addPart(Part.Companion.createFormData(name, str, body));
            return this;
        }

        @l
        public final Builder addPart(@m Headers headers, @l RequestBody body) {
            l0.p(body, "body");
            addPart(Part.Companion.create(headers, body));
            return this;
        }

        @l
        public final Builder addPart(@l Part part) {
            l0.p(part, "part");
            this.parts.add(part);
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Builder(java.lang.String r1, int r2, kotlin.jvm.internal.w r3) {
            /*
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L11
                java.util.UUID r1 = java.util.UUID.randomUUID()
                java.lang.String r1 = r1.toString()
                java.lang.String r2 = "randomUUID().toString()"
                kotlin.jvm.internal.l0.o(r1, r2)
            L11:
                r0.<init>(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.MultipartBody.Builder.<init>(java.lang.String, int, kotlin.jvm.internal.w):void");
        }
    }

    @i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\t\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u0014\u0010\u0013\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u0014\u0010\u0014\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u0014\u0010\u0015\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\f¨\u0006\u0018"}, d2 = {"Lokhttp3/MultipartBody$Companion;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/r2;", "appendQuotedString$okhttp", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "appendQuotedString", "Lokhttp3/MediaType;", "ALTERNATIVE", "Lokhttp3/MediaType;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 8, 0})
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        public final void appendQuotedString$okhttp(@l StringBuilder sb, @l String key) {
            l0.p(sb, "<this>");
            l0.p(key, "key");
            sb.append(k0.f19765b);
            int length = key.length();
            for (int i5 = 0; i5 < length; i5++) {
                char charAt = key.charAt(i5);
                if (charAt == '\n') {
                    sb.append("%0A");
                } else if (charAt == '\r') {
                    sb.append("%0D");
                } else if (charAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(charAt);
                }
            }
            sb.append(k0.f19765b);
        }
    }

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0019\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\r\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\b\tJ\u000f\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0002\b\nR\u0013\u0010\u0004\u001a\u00020\u00058\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\b¨\u0006\f"}, d2 = {"Lokhttp3/MultipartBody$Part;", "", TTDownloadField.TT_HEADERS, "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "(Lokhttp3/Headers;Lokhttp3/RequestBody;)V", "()Lokhttp3/RequestBody;", "()Lokhttp3/Headers;", "-deprecated_body", "-deprecated_headers", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Part {

        @l
        public static final Companion Companion = new Companion(null);

        @l
        private final RequestBody body;

        @m
        private final Headers headers;

        @i0(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0007J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\u000e"}, d2 = {"Lokhttp3/MultipartBody$Part$Companion;", "", "()V", "create", "Lokhttp3/MultipartBody$Part;", TTDownloadField.TT_HEADERS, "Lokhttp3/Headers;", "body", "Lokhttp3/RequestBody;", "createFormData", "name", "", b.f22420d, "filename", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @r1({"SMAP\nMultipartBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartBody.kt\nokhttp3/MultipartBody$Part$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,345:1\n1#2:346\n*E\n"})
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(w wVar) {
                this();
            }

            @l
            @u3.m
            public final Part create(@l RequestBody body) {
                l0.p(body, "body");
                return create(null, body);
            }

            @l
            @u3.m
            public final Part createFormData(@l String name, @l String value) {
                l0.p(name, "name");
                l0.p(value, "value");
                return createFormData(name, null, RequestBody.Companion.create$default(RequestBody.Companion, value, (MediaType) null, 1, (Object) null));
            }

            @l
            @u3.m
            public final Part create(@m Headers headers, @l RequestBody body) {
                l0.p(body, "body");
                w wVar = null;
                if (!((headers != null ? headers.get(HTTP.CONTENT_TYPE) : null) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((headers != null ? headers.get(HTTP.CONTENT_LEN) : null) == null) {
                    return new Part(headers, body, wVar);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            @l
            @u3.m
            public final Part createFormData(@l String name, @m String str, @l RequestBody body) {
                l0.p(name, "name");
                l0.p(body, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(sb, name);
                if (str != null) {
                    sb.append("; filename=");
                    companion.appendQuotedString$okhttp(sb, str);
                }
                String sb2 = sb.toString();
                l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", sb2).build(), body);
            }
        }

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, w wVar) {
            this(headers, requestBody);
        }

        @l
        @u3.m
        public static final Part create(@m Headers headers, @l RequestBody requestBody) {
            return Companion.create(headers, requestBody);
        }

        @l
        @u3.m
        public static final Part create(@l RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        @l
        @u3.m
        public static final Part createFormData(@l String str, @l String str2) {
            return Companion.createFormData(str, str2);
        }

        @l
        @u3.m
        public static final Part createFormData(@l String str, @m String str2, @l RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }

        @l
        @h(name = "-deprecated_body")
        @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "body", imports = {}))
        /* renamed from: -deprecated_body, reason: not valid java name */
        public final RequestBody m6539deprecated_body() {
            return this.body;
        }

        @h(name = "-deprecated_headers")
        @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = TTDownloadField.TT_HEADERS, imports = {}))
        @m
        /* renamed from: -deprecated_headers, reason: not valid java name */
        public final Headers m6540deprecated_headers() {
            return this.headers;
        }

        @l
        @h(name = "body")
        public final RequestBody body() {
            return this.body;
        }

        @h(name = TTDownloadField.TT_HEADERS)
        @m
        public final Headers headers() {
            return this.headers;
        }
    }

    static {
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        COLONSPACE = new byte[]{58, 32};
        CRLF = new byte[]{cx.f12475k, 10};
        DASHDASH = new byte[]{45, 45};
    }

    public MultipartBody(@l n boundaryByteString, @l MediaType type, @l List<Part> parts) {
        l0.p(boundaryByteString, "boundaryByteString");
        l0.p(type, "type");
        l0.p(parts, "parts");
        this.boundaryByteString = boundaryByteString;
        this.type = type;
        this.parts = parts;
        this.contentType = MediaType.Companion.get(type + "; boundary=" + boundary());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long writeOrCountBytes(okio.m mVar, boolean z4) throws IOException {
        okio.l lVar;
        if (z4) {
            mVar = new okio.l();
            lVar = mVar;
        } else {
            lVar = 0;
        }
        int size = this.parts.size();
        long j5 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Part part = this.parts.get(i5);
            Headers headers = part.headers();
            RequestBody body = part.body();
            l0.m(mVar);
            mVar.write(DASHDASH);
            mVar.v0(this.boundaryByteString);
            mVar.write(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    mVar.C(headers.name(i6)).write(COLONSPACE).C(headers.value(i6)).write(CRLF);
                }
            }
            MediaType contentType = body.contentType();
            if (contentType != null) {
                mVar.C("Content-Type: ").C(contentType.toString()).write(CRLF);
            }
            long contentLength = body.contentLength();
            if (contentLength != -1) {
                mVar.C("Content-Length: ").V(contentLength).write(CRLF);
            } else if (z4) {
                l0.m(lVar);
                lVar.c();
                return -1L;
            }
            byte[] bArr = CRLF;
            mVar.write(bArr);
            if (z4) {
                j5 += contentLength;
            } else {
                body.writeTo(mVar);
            }
            mVar.write(bArr);
        }
        l0.m(mVar);
        byte[] bArr2 = DASHDASH;
        mVar.write(bArr2);
        mVar.v0(this.boundaryByteString);
        mVar.write(bArr2);
        mVar.write(CRLF);
        if (z4) {
            l0.m(lVar);
            long M0 = j5 + lVar.M0();
            lVar.c();
            return M0;
        }
        return j5;
    }

    @l
    @h(name = "-deprecated_boundary")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "boundary", imports = {}))
    /* renamed from: -deprecated_boundary, reason: not valid java name */
    public final String m6535deprecated_boundary() {
        return boundary();
    }

    @l
    @h(name = "-deprecated_parts")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "parts", imports = {}))
    /* renamed from: -deprecated_parts, reason: not valid java name */
    public final List<Part> m6536deprecated_parts() {
        return this.parts;
    }

    @h(name = "-deprecated_size")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "size", imports = {}))
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m6537deprecated_size() {
        return size();
    }

    @l
    @h(name = "-deprecated_type")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "type", imports = {}))
    /* renamed from: -deprecated_type, reason: not valid java name */
    public final MediaType m6538deprecated_type() {
        return this.type;
    }

    @l
    @h(name = "boundary")
    public final String boundary() {
        return this.boundaryByteString.utf8();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j5 = this.contentLength;
        if (j5 == -1) {
            long writeOrCountBytes = writeOrCountBytes(null, true);
            this.contentLength = writeOrCountBytes;
            return writeOrCountBytes;
        }
        return j5;
    }

    @Override // okhttp3.RequestBody
    @l
    public MediaType contentType() {
        return this.contentType;
    }

    @l
    public final Part part(int i5) {
        return this.parts.get(i5);
    }

    @l
    @h(name = "parts")
    public final List<Part> parts() {
        return this.parts;
    }

    @h(name = "size")
    public final int size() {
        return this.parts.size();
    }

    @l
    @h(name = "type")
    public final MediaType type() {
        return this.type;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@l okio.m sink) throws IOException {
        l0.p(sink, "sink");
        writeOrCountBytes(sink, false);
    }
}
