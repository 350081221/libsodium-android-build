package kotlin.io.path;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u00060\u0007j\u0002`\bJ\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\fJ\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\fR\u001b\u0010\u0005\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001b"}, d2 = {"Lkotlin/io/path/ExceptionsCollector;", "", "limit", "", "(I)V", "collectedExceptions", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "getCollectedExceptions", "()Ljava/util/List;", ClientCookie.PATH_ATTR, "Ljava/nio/file/Path;", "getPath", "()Ljava/nio/file/Path;", "setPath", "(Ljava/nio/file/Path;)V", "<set-?>", "totalExceptions", "getTotalExceptions", "()I", "collect", "", "exception", "enterEntry", "name", "exitEntry", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class n {

    /* renamed from: a, reason: collision with root package name */
    private final int f19339a;

    /* renamed from: b, reason: collision with root package name */
    private int f19340b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final List<Exception> f19341c;

    /* renamed from: d, reason: collision with root package name */
    @p4.m
    private Path f19342d;

    public n() {
        this(0, 1, null);
    }

    public n(int i5) {
        this.f19339a = i5;
        this.f19341c = new ArrayList();
    }

    public final void a(@p4.l Exception exception) {
        Throwable initCause;
        kotlin.jvm.internal.l0.p(exception, "exception");
        boolean z4 = true;
        this.f19340b++;
        if (this.f19341c.size() >= this.f19339a) {
            z4 = false;
        }
        if (z4) {
            if (this.f19342d != null) {
                initCause = new FileSystemException(String.valueOf(this.f19342d)).initCause(exception);
                kotlin.jvm.internal.l0.n(initCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exception = (FileSystemException) initCause;
            }
            this.f19341c.add(exception);
        }
    }

    public final void b(@p4.l Path name) {
        Path path;
        kotlin.jvm.internal.l0.p(name, "name");
        Path path2 = this.f19342d;
        if (path2 != null) {
            path = path2.resolve(name);
        } else {
            path = null;
        }
        this.f19342d = path;
    }

    public final void c(@p4.l Path name) {
        Path path;
        kotlin.jvm.internal.l0.p(name, "name");
        Path path2 = this.f19342d;
        Path path3 = null;
        if (path2 != null) {
            path = path2.getFileName();
        } else {
            path = null;
        }
        if (kotlin.jvm.internal.l0.g(name, path)) {
            Path path4 = this.f19342d;
            if (path4 != null) {
                path3 = path4.getParent();
            }
            this.f19342d = path3;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @p4.l
    public final List<Exception> d() {
        return this.f19341c;
    }

    @p4.m
    public final Path e() {
        return this.f19342d;
    }

    public final int f() {
        return this.f19340b;
    }

    public final void g(@p4.m Path path) {
        this.f19342d = path;
    }

    public /* synthetic */ n(int i5, int i6, kotlin.jvm.internal.w wVar) {
        this((i6 & 1) != 0 ? 64 : i5);
    }
}
