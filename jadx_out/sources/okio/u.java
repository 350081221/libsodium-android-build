package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.util.List;
import okio.d1;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 42\u00020\u0001:\u00014B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\bJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0006J\u001a\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\bH&J\u0018\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H&J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006J\u001a\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH&J\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0006J\u001a\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0016J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a2\u0006\u0010\u0011\u001a\u00020\u0006H&J\u0018\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a2\u0006\u0010\u0011\u001a\u00020\u0006H&J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\u0006\u0010\u0011\u001a\u00020\u0006J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d2\u0006\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\bH\u0016J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\u0006J\u0012\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u000e\u001a\u00020\u0006H&J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u0006J$\u0010$\u001a\u00020#2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\bH&J:\u0010%\u001a\u0002H&\"\u0004\b\u0000\u0010&2\u0006\u0010\u0005\u001a\u00020\u00062\u0017\u0010'\u001a\u0013\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u0002H&0(¢\u0006\u0002\b*H\u0087\bø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000e\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001a\u0010-\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020.2\u0006\u0010\u0005\u001a\u00020\u0006H&JD\u0010/\u001a\u0002H&\"\u0004\b\u0000\u0010&2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\b2\u0017\u00100\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u0002H&0(¢\u0006\u0002\b*H\u0087\bø\u0001\u0000¢\u0006\u0004\b2\u00103\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00065"}, d2 = {"Lokio/FileSystem;", "", "()V", "appendingSink", "Lokio/Sink;", "file", "Lokio/Path;", "mustExist", "", "atomicMove", "", "source", TypedValues.AttributesType.S_TARGET, "canonicalize", ClientCookie.PATH_ATTR, "copy", "createDirectories", "dir", "mustCreate", "createDirectory", "createSymlink", "delete", "deleteRecursively", "fileOrDirectory", "exists", "list", "", "listOrNull", "listRecursively", "Lkotlin/sequences/Sequence;", "followSymlinks", "metadata", "Lokio/FileMetadata;", "metadataOrNull", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "read", "T", "readerAction", "Lkotlin/Function1;", "Lokio/BufferedSource;", "Lkotlin/ExtensionFunctionType;", "-read", "(Lokio/Path;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "sink", "Lokio/Source;", "write", "writerAction", "Lokio/BufferedSink;", "-write", "(Lokio/Path;ZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,165:1\n52#2,21:166\n52#2,21:187\n*S KotlinDebug\n*F\n+ 1 FileSystem.kt\nokio/FileSystem\n*L\n67#1:166,21\n81#1:187,21\n*E\n"})
/* loaded from: classes4.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    public static final a f21053a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final u f21054b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final d1 f21055c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final u f21056d;

    @kotlin.i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\b\u001a\u00020\u0004*\u00020\tH\u0007¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lokio/FileSystem$Companion;", "", "()V", "RESOURCES", "Lokio/FileSystem;", "SYSTEM", "SYSTEM_TEMPORARY_DIRECTORY", "Lokio/Path;", "asOkioFileSystem", "Ljava/nio/file/FileSystem;", "get", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        @u3.h(name = "get")
        @u3.m
        public final u a(@p4.l FileSystem fileSystem) {
            kotlin.jvm.internal.l0.p(fileSystem, "<this>");
            return new p0(fileSystem);
        }
    }

    static {
        u g0Var;
        try {
            Class.forName("java.nio.file.Files");
            g0Var = new x0();
        } catch (ClassNotFoundException unused) {
            g0Var = new g0();
        }
        f21054b = g0Var;
        d1.a aVar = d1.f20879b;
        String property = System.getProperty("java.io.tmpdir");
        kotlin.jvm.internal.l0.o(property, "getProperty(...)");
        f21055c = d1.a.h(aVar, property, false, 1, null);
        ClassLoader classLoader = okio.internal.j.class.getClassLoader();
        kotlin.jvm.internal.l0.o(classLoader, "getClassLoader(...)");
        f21056d = new okio.internal.j(classLoader, false, null, 4, null);
    }

    public static /* synthetic */ kotlin.sequences.m C(u uVar, d1 d1Var, boolean z4, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: listRecursively");
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return uVar.B(d1Var, z4);
    }

    public static /* synthetic */ s I(u uVar, d1 d1Var, boolean z4, boolean z5, int i5, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openReadWrite");
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            z5 = false;
        }
        return uVar.H(d1Var, z4, z5);
    }

    public static /* synthetic */ l1 L(u uVar, d1 d1Var, boolean z4, int i5, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return uVar.K(d1Var, z4);
    }

    public static /* synthetic */ Object c(u uVar, d1 file, boolean z4, v3.l writerAction, int i5, Object obj) throws IOException {
        Object obj2;
        if (obj == null) {
            if ((i5 & 2) != 0) {
                z4 = false;
            }
            kotlin.jvm.internal.l0.p(file, "file");
            kotlin.jvm.internal.l0.p(writerAction, "writerAction");
            m d5 = y0.d(uVar.K(file, z4));
            Throwable th = null;
            try {
                obj2 = writerAction.invoke(d5);
                kotlin.jvm.internal.i0.d(1);
                if (d5 != null) {
                    try {
                        d5.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                kotlin.jvm.internal.i0.c(1);
            } catch (Throwable th3) {
                kotlin.jvm.internal.i0.d(1);
                if (d5 != null) {
                    try {
                        d5.close();
                    } catch (Throwable th4) {
                        kotlin.p.a(th3, th4);
                    }
                }
                kotlin.jvm.internal.i0.c(1);
                obj2 = null;
                th = th3;
            }
            if (th == null) {
                kotlin.jvm.internal.l0.m(obj2);
                return obj2;
            }
            throw th;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: write");
    }

    public static /* synthetic */ l1 f(u uVar, d1 d1Var, boolean z4, int i5, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: appendingSink");
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return uVar.e(d1Var, z4);
    }

    public static /* synthetic */ void l(u uVar, d1 d1Var, boolean z4, int i5, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectories");
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        uVar.k(d1Var, z4);
    }

    public static /* synthetic */ void o(u uVar, d1 d1Var, boolean z4, int i5, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createDirectory");
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        uVar.n(d1Var, z4);
    }

    public static /* synthetic */ void s(u uVar, d1 d1Var, boolean z4, int i5, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        uVar.r(d1Var, z4);
    }

    public static /* synthetic */ void v(u uVar, d1 d1Var, boolean z4, int i5, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteRecursively");
        }
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        uVar.u(d1Var, z4);
    }

    @p4.l
    @u3.h(name = "get")
    @u3.m
    public static final u x(@p4.l FileSystem fileSystem) {
        return f21053a.a(fileSystem);
    }

    @p4.l
    public final kotlin.sequences.m<d1> A(@p4.l d1 dir) {
        kotlin.jvm.internal.l0.p(dir, "dir");
        return B(dir, false);
    }

    @p4.l
    public kotlin.sequences.m<d1> B(@p4.l d1 dir, boolean z4) {
        kotlin.jvm.internal.l0.p(dir, "dir");
        return okio.internal.c.f(this, dir, z4);
    }

    @p4.l
    public final t D(@p4.l d1 path) throws IOException {
        kotlin.jvm.internal.l0.p(path, "path");
        return okio.internal.c.g(this, path);
    }

    @p4.m
    public abstract t E(@p4.l d1 d1Var) throws IOException;

    @p4.l
    public abstract s F(@p4.l d1 d1Var) throws IOException;

    @p4.l
    public final s G(@p4.l d1 file) throws IOException {
        kotlin.jvm.internal.l0.p(file, "file");
        return H(file, false, false);
    }

    @p4.l
    public abstract s H(@p4.l d1 d1Var, boolean z4, boolean z5) throws IOException;

    @p4.l
    public final l1 J(@p4.l d1 file) throws IOException {
        kotlin.jvm.internal.l0.p(file, "file");
        return K(file, false);
    }

    @p4.l
    public abstract l1 K(@p4.l d1 d1Var, boolean z4) throws IOException;

    @p4.l
    public abstract n1 M(@p4.l d1 d1Var) throws IOException;

    @u3.h(name = "-read")
    public final <T> T a(@p4.l d1 file, @p4.l v3.l<? super BufferedSource, ? extends T> readerAction) throws IOException {
        T t5;
        kotlin.jvm.internal.l0.p(file, "file");
        kotlin.jvm.internal.l0.p(readerAction, "readerAction");
        BufferedSource e5 = y0.e(M(file));
        Throwable th = null;
        try {
            t5 = readerAction.invoke(e5);
            kotlin.jvm.internal.i0.d(1);
            if (e5 != null) {
                try {
                    e5.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.i0.c(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.i0.d(1);
            if (e5 != null) {
                try {
                    e5.close();
                } catch (Throwable th4) {
                    kotlin.p.a(th3, th4);
                }
            }
            kotlin.jvm.internal.i0.c(1);
            th = th3;
            t5 = null;
        }
        if (th == null) {
            kotlin.jvm.internal.l0.m(t5);
            return t5;
        }
        throw th;
    }

    @u3.h(name = "-write")
    public final <T> T b(@p4.l d1 file, boolean z4, @p4.l v3.l<? super m, ? extends T> writerAction) throws IOException {
        T t5;
        kotlin.jvm.internal.l0.p(file, "file");
        kotlin.jvm.internal.l0.p(writerAction, "writerAction");
        m d5 = y0.d(K(file, z4));
        Throwable th = null;
        try {
            t5 = writerAction.invoke(d5);
            kotlin.jvm.internal.i0.d(1);
            if (d5 != null) {
                try {
                    d5.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            kotlin.jvm.internal.i0.c(1);
        } catch (Throwable th3) {
            kotlin.jvm.internal.i0.d(1);
            if (d5 != null) {
                try {
                    d5.close();
                } catch (Throwable th4) {
                    kotlin.p.a(th3, th4);
                }
            }
            kotlin.jvm.internal.i0.c(1);
            th = th3;
            t5 = null;
        }
        if (th == null) {
            kotlin.jvm.internal.l0.m(t5);
            return t5;
        }
        throw th;
    }

    @p4.l
    public final l1 d(@p4.l d1 file) throws IOException {
        kotlin.jvm.internal.l0.p(file, "file");
        return e(file, false);
    }

    @p4.l
    public abstract l1 e(@p4.l d1 d1Var, boolean z4) throws IOException;

    public abstract void g(@p4.l d1 d1Var, @p4.l d1 d1Var2) throws IOException;

    @p4.l
    public abstract d1 h(@p4.l d1 d1Var) throws IOException;

    public void i(@p4.l d1 source, @p4.l d1 target) throws IOException {
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(target, "target");
        okio.internal.c.b(this, source, target);
    }

    public final void j(@p4.l d1 dir) throws IOException {
        kotlin.jvm.internal.l0.p(dir, "dir");
        k(dir, false);
    }

    public final void k(@p4.l d1 dir, boolean z4) throws IOException {
        kotlin.jvm.internal.l0.p(dir, "dir");
        okio.internal.c.c(this, dir, z4);
    }

    public final void m(@p4.l d1 dir) throws IOException {
        kotlin.jvm.internal.l0.p(dir, "dir");
        n(dir, false);
    }

    public abstract void n(@p4.l d1 d1Var, boolean z4) throws IOException;

    public abstract void p(@p4.l d1 d1Var, @p4.l d1 d1Var2) throws IOException;

    public final void q(@p4.l d1 path) throws IOException {
        kotlin.jvm.internal.l0.p(path, "path");
        r(path, false);
    }

    public abstract void r(@p4.l d1 d1Var, boolean z4) throws IOException;

    public final void t(@p4.l d1 fileOrDirectory) throws IOException {
        kotlin.jvm.internal.l0.p(fileOrDirectory, "fileOrDirectory");
        u(fileOrDirectory, false);
    }

    public void u(@p4.l d1 fileOrDirectory, boolean z4) throws IOException {
        kotlin.jvm.internal.l0.p(fileOrDirectory, "fileOrDirectory");
        okio.internal.c.d(this, fileOrDirectory, z4);
    }

    public final boolean w(@p4.l d1 path) throws IOException {
        kotlin.jvm.internal.l0.p(path, "path");
        return okio.internal.c.e(this, path);
    }

    @p4.l
    public abstract List<d1> y(@p4.l d1 d1Var) throws IOException;

    @p4.m
    public abstract List<d1> z(@p4.l d1 d1Var);
}
