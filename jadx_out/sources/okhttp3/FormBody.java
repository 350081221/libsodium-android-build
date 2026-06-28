package okhttp3;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import kotlin.k;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import okio.m;
import org.apache.http.client.utils.URLEncodedUtils;
import p4.l;
import t0.b;
import u3.h;
import u3.i;

@i0(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB%\b\u0000\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000f\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bJ\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\r0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u001f"}, d2 = {"Lokhttp3/FormBody;", "Lokhttp3/RequestBody;", "Lokio/m;", "sink", "", "countBytes", "", "writeOrCountBytes", "", "-deprecated_size", "()I", "size", "index", "", "encodedName", "name", "encodedValue", b.f22420d, "Lokhttp3/MediaType;", "contentType", "contentLength", "Lkotlin/r2;", "writeTo", "", "encodedNames", "Ljava/util/List;", "encodedValues", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class FormBody extends RequestBody {

    @l
    private final List<String> encodedNames;

    @l
    private final List<String> encodedValues;

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final MediaType CONTENT_TYPE = MediaType.Companion.get(URLEncodedUtils.CONTENT_TYPE);

    @i0(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/FormBody$Companion;", "", "()V", "CONTENT_TYPE", "Lokhttp3/MediaType;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }
    }

    public FormBody(@l List<String> encodedNames, @l List<String> encodedValues) {
        l0.p(encodedNames, "encodedNames");
        l0.p(encodedValues, "encodedValues");
        this.encodedNames = Util.toImmutableList(encodedNames);
        this.encodedValues = Util.toImmutableList(encodedValues);
    }

    private final long writeOrCountBytes(m mVar, boolean z4) {
        okio.l g5;
        if (z4) {
            g5 = new okio.l();
        } else {
            l0.m(mVar);
            g5 = mVar.g();
        }
        int size = this.encodedNames.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (i5 > 0) {
                g5.writeByte(38);
            }
            g5.C(this.encodedNames.get(i5));
            g5.writeByte(61);
            g5.C(this.encodedValues.get(i5));
        }
        if (z4) {
            long M0 = g5.M0();
            g5.c();
            return M0;
        }
        return 0L;
    }

    @h(name = "-deprecated_size")
    @k(level = kotlin.m.ERROR, message = "moved to val", replaceWith = @b1(expression = "size", imports = {}))
    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m6497deprecated_size() {
        return size();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return writeOrCountBytes(null, true);
    }

    @Override // okhttp3.RequestBody
    @l
    public MediaType contentType() {
        return CONTENT_TYPE;
    }

    @l
    public final String encodedName(int i5) {
        return this.encodedNames.get(i5);
    }

    @l
    public final String encodedValue(int i5) {
        return this.encodedValues.get(i5);
    }

    @l
    public final String name(int i5) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedName(i5), 0, 0, true, 3, null);
    }

    @h(name = "size")
    public final int size() {
        return this.encodedNames.size();
    }

    @l
    public final String value(int i5) {
        return HttpUrl.Companion.percentDecode$okhttp$default(HttpUrl.Companion, encodedValue(i5), 0, 0, true, 3, null);
    }

    @Override // okhttp3.RequestBody
    public void writeTo(@l m sink) throws IOException {
        l0.p(sink, "sink");
        writeOrCountBytes(sink, false);
    }

    @i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lokhttp3/FormBody$Builder;", "", "charset", "Ljava/nio/charset/Charset;", "(Ljava/nio/charset/Charset;)V", "names", "", "", "values", "add", "name", b.f22420d, "addEncoded", "build", "Lokhttp3/FormBody;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Builder {

        @p4.m
        private final Charset charset;

        @l
        private final List<String> names;

        @l
        private final List<String> values;

        /* JADX WARN: Multi-variable type inference failed */
        @i
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @i
        public Builder(@p4.m Charset charset) {
            this.charset = charset;
            this.names = new ArrayList();
            this.values = new ArrayList();
        }

        @l
        public final Builder add(@l String name, @l String value) {
            l0.p(name, "name");
            l0.p(value, "value");
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.FORM_ENCODE_SET, false, false, true, false, this.charset, 91, null));
            return this;
        }

        @l
        public final Builder addEncoded(@l String name, @l String value) {
            l0.p(name, "name");
            l0.p(value, "value");
            List<String> list = this.names;
            HttpUrl.Companion companion = HttpUrl.Companion;
            list.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, name, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            this.values.add(HttpUrl.Companion.canonicalize$okhttp$default(companion, value, 0, 0, HttpUrl.FORM_ENCODE_SET, true, false, true, false, this.charset, 83, null));
            return this;
        }

        @l
        public final FormBody build() {
            return new FormBody(this.names, this.values);
        }

        public /* synthetic */ Builder(Charset charset, int i5, w wVar) {
            this((i5 & 1) != 0 ? null : charset);
        }
    }
}
