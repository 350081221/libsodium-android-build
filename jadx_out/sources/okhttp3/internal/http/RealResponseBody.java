package okhttp3.internal.http;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0004\u001a\u00020\u0005H\u0016J\n\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", "contentTypeString", "", "contentLength", "", "source", "Lokio/BufferedSource;", "(Ljava/lang/String;JLokio/BufferedSource;)V", "contentType", "Lokhttp3/MediaType;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;

    @m
    private final String contentTypeString;

    @l
    private final BufferedSource source;

    public RealResponseBody(@m String str, long j5, @l BufferedSource source) {
        l0.p(source, "source");
        this.contentTypeString = str;
        this.contentLength = j5;
        this.source = source;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    @m
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str != null) {
            return MediaType.Companion.parse(str);
        }
        return null;
    }

    @Override // okhttp3.ResponseBody
    @l
    public BufferedSource source() {
        return this.source;
    }
}
