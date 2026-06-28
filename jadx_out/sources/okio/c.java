package okio;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J)\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0019H\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J)\u0010\f\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\"\u00020\u0016H\u0007¢\u0006\u0002\u0010\u001a¨\u0006\u001b"}, d2 = {"Lokio/-DeprecatedOkio;", "", "()V", "appendingSink", "Lokio/Sink;", "file", "Ljava/io/File;", "blackhole", "buffer", "Lokio/BufferedSink;", "sink", "Lokio/BufferedSource;", "source", "Lokio/Source;", "outputStream", "Ljava/io/OutputStream;", "socket", "Ljava/net/Socket;", ClientCookie.PATH_ATTR, "Ljava/nio/file/Path;", "options", "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Sink;", "inputStream", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lokio/Source;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.k(message = "changed in Okio 2.x")
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final c f20867a = new c();

    private c() {
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    public final l1 a(@p4.l File file) {
        kotlin.jvm.internal.l0.p(file, "file");
        return y0.a(file);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    public final l1 b() {
        return y0.c();
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "sink.buffer()", imports = {"okio.buffer"}))
    public final m c(@p4.l l1 sink) {
        kotlin.jvm.internal.l0.p(sink, "sink");
        return y0.d(sink);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "source.buffer()", imports = {"okio.buffer"}))
    public final BufferedSource d(@p4.l n1 source) {
        kotlin.jvm.internal.l0.p(source, "source");
        return y0.e(source);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "file.sink()", imports = {"okio.sink"}))
    public final l1 e(@p4.l File file) {
        l1 q5;
        kotlin.jvm.internal.l0.p(file, "file");
        q5 = z0.q(file, false, 1, null);
        return q5;
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "outputStream.sink()", imports = {"okio.sink"}))
    public final l1 f(@p4.l OutputStream outputStream) {
        kotlin.jvm.internal.l0.p(outputStream, "outputStream");
        return y0.p(outputStream);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "socket.sink()", imports = {"okio.sink"}))
    public final l1 g(@p4.l Socket socket2) {
        kotlin.jvm.internal.l0.p(socket2, "socket");
        return y0.q(socket2);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "path.sink(*options)", imports = {"okio.sink"}))
    public final l1 h(@p4.l Path path, @p4.l OpenOption... options) {
        kotlin.jvm.internal.l0.p(path, "path");
        kotlin.jvm.internal.l0.p(options, "options");
        return y0.r(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "file.source()", imports = {"okio.source"}))
    public final n1 i(@p4.l File file) {
        kotlin.jvm.internal.l0.p(file, "file");
        return y0.t(file);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "inputStream.source()", imports = {"okio.source"}))
    public final n1 j(@p4.l InputStream inputStream) {
        kotlin.jvm.internal.l0.p(inputStream, "inputStream");
        return y0.u(inputStream);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "socket.source()", imports = {"okio.source"}))
    public final n1 k(@p4.l Socket socket2) {
        kotlin.jvm.internal.l0.p(socket2, "socket");
        return y0.v(socket2);
    }

    @p4.l
    @kotlin.k(level = kotlin.m.ERROR, message = "moved to extension function", replaceWith = @kotlin.b1(expression = "path.source(*options)", imports = {"okio.source"}))
    public final n1 l(@p4.l Path path, @p4.l OpenOption... options) {
        kotlin.jvm.internal.l0.p(path, "path");
        kotlin.jvm.internal.l0.p(options, "options");
        return y0.w(path, (OpenOption[]) Arrays.copyOf(options, options.length));
    }
}
