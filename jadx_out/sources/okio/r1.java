package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import okio.d1;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 '2\u00020\u0001:\u0001'B5\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0018\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0018\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J \u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\u0018\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001d2\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\u0012\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0010\u0010\"\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u0003H\u0016J \u0010$\u001a\u00020#2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000fH\u0016J\u0010\u0010\u0012\u001a\u00020&2\u0006\u0010\r\u001a\u00020\u0003H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lokio/ZipFileSystem;", "Lokio/FileSystem;", "zipPath", "Lokio/Path;", "fileSystem", "entries", "", "Lokio/internal/ZipEntry;", ClientCookie.COMMENT_ATTR, "", "(Lokio/Path;Lokio/FileSystem;Ljava/util/Map;Ljava/lang/String;)V", "appendingSink", "Lokio/Sink;", "file", "mustExist", "", "atomicMove", "", "source", TypedValues.AttributesType.S_TARGET, "canonicalize", ClientCookie.PATH_ATTR, "canonicalizeInternal", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "", "throwOnFailure", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nZipFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n+ 2 Okio.kt\nokio/Okio__OkioKt\n*L\n1#1,175:1\n52#2,5:176\n52#2,21:181\n60#2,10:202\n57#2,2:212\n71#2,2:214\n52#2,21:216\n*S KotlinDebug\n*F\n+ 1 ZipFileSystem.kt\nokio/ZipFileSystem\n*L\n102#1:176,5\n103#1:181,21\n102#1:202,10\n102#1:212,2\n102#1:214,2\n132#1:216,21\n*E\n"})
/* loaded from: classes4.dex */
public final class r1 extends u {

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private static final a f21029i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @p4.l
    private static final d1 f21030j = d1.a.h(d1.f20879b, "/", false, 1, null);

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final d1 f21031e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private final u f21032f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private final Map<d1, okio.internal.k> f21033g;

    /* renamed from: h, reason: collision with root package name */
    @p4.m
    private final String f21034h;

    @kotlin.i0(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokio/ZipFileSystem$Companion;", "", "()V", org.slf4j.a.f22214f0, "Lokio/Path;", "getROOT", "()Lokio/Path;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        @p4.l
        public final d1 a() {
            return r1.f21030j;
        }
    }

    public r1(@p4.l d1 zipPath, @p4.l u fileSystem, @p4.l Map<d1, okio.internal.k> entries, @p4.m String str) {
        kotlin.jvm.internal.l0.p(zipPath, "zipPath");
        kotlin.jvm.internal.l0.p(fileSystem, "fileSystem");
        kotlin.jvm.internal.l0.p(entries, "entries");
        this.f21031e = zipPath;
        this.f21032f = fileSystem;
        this.f21033g = entries;
        this.f21034h = str;
    }

    private final d1 O(d1 d1Var) {
        return f21030j.C(d1Var, true);
    }

    private final List<d1> P(d1 d1Var, boolean z4) {
        List<d1> S5;
        okio.internal.k kVar = this.f21033g.get(O(d1Var));
        if (kVar == null) {
            if (!z4) {
                return null;
            }
            throw new IOException("not a directory: " + d1Var);
        }
        S5 = kotlin.collections.e0.S5(kVar.b());
        return S5;
    }

    @Override // okio.u
    @p4.m
    public t E(@p4.l d1 path) {
        Long valueOf;
        t tVar;
        Throwable th;
        kotlin.jvm.internal.l0.p(path, "path");
        okio.internal.k kVar = this.f21033g.get(O(path));
        Throwable th2 = null;
        if (kVar == null) {
            return null;
        }
        boolean z4 = !kVar.j();
        boolean j5 = kVar.j();
        if (kVar.j()) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(kVar.i());
        }
        t tVar2 = new t(z4, j5, null, valueOf, null, kVar.g(), null, null, 128, null);
        if (kVar.h() == -1) {
            return tVar2;
        }
        s F = this.f21032f.F(this.f21031e);
        try {
            BufferedSource e5 = y0.e(F.A0(kVar.h()));
            try {
                tVar = okio.internal.l.i(e5, tVar2);
                if (e5 != null) {
                    try {
                        e5.close();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = null;
            } catch (Throwable th4) {
                if (e5 != null) {
                    try {
                        e5.close();
                    } catch (Throwable th5) {
                        kotlin.p.a(th4, th5);
                    }
                }
                th = th4;
                tVar = null;
            }
        } catch (Throwable th6) {
            if (F != null) {
                try {
                    F.close();
                } catch (Throwable th7) {
                    kotlin.p.a(th6, th7);
                }
            }
            tVar = null;
            th2 = th6;
        }
        if (th == null) {
            kotlin.jvm.internal.l0.m(tVar);
            if (F != null) {
                try {
                    F.close();
                } catch (Throwable th8) {
                    th2 = th8;
                }
            }
            if (th2 == null) {
                kotlin.jvm.internal.l0.m(tVar);
                return tVar;
            }
            throw th2;
        }
        throw th;
    }

    @Override // okio.u
    @p4.l
    public s F(@p4.l d1 file) {
        kotlin.jvm.internal.l0.p(file, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // okio.u
    @p4.l
    public s H(@p4.l d1 file, boolean z4, boolean z5) {
        kotlin.jvm.internal.l0.p(file, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // okio.u
    @p4.l
    public l1 K(@p4.l d1 file, boolean z4) {
        kotlin.jvm.internal.l0.p(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.u
    @p4.l
    public n1 M(@p4.l d1 file) throws IOException {
        BufferedSource bufferedSource;
        kotlin.jvm.internal.l0.p(file, "file");
        okio.internal.k kVar = this.f21033g.get(O(file));
        if (kVar != null) {
            s F = this.f21032f.F(this.f21031e);
            Throwable th = null;
            try {
                bufferedSource = y0.e(F.A0(kVar.h()));
                if (F != null) {
                    try {
                        F.close();
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                if (F != null) {
                    try {
                        F.close();
                    } catch (Throwable th4) {
                        kotlin.p.a(th3, th4);
                    }
                }
                bufferedSource = null;
                th = th3;
            }
            if (th == null) {
                kotlin.jvm.internal.l0.m(bufferedSource);
                okio.internal.l.l(bufferedSource);
                if (kVar.e() == 0) {
                    return new okio.internal.i(bufferedSource, kVar.i(), true);
                }
                return new okio.internal.i(new d0(new okio.internal.i(bufferedSource, kVar.d(), true), new Inflater(true)), kVar.i(), false);
            }
            throw th;
        }
        throw new FileNotFoundException("no such file: " + file);
    }

    @Override // okio.u
    @p4.l
    public l1 e(@p4.l d1 file, boolean z4) {
        kotlin.jvm.internal.l0.p(file, "file");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.u
    public void g(@p4.l d1 source, @p4.l d1 target) {
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.u
    @p4.l
    public d1 h(@p4.l d1 path) {
        kotlin.jvm.internal.l0.p(path, "path");
        d1 O = O(path);
        if (this.f21033g.containsKey(O)) {
            return O;
        }
        throw new FileNotFoundException(String.valueOf(path));
    }

    @Override // okio.u
    public void n(@p4.l d1 dir, boolean z4) {
        kotlin.jvm.internal.l0.p(dir, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.u
    public void p(@p4.l d1 source, @p4.l d1 target) {
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(target, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.u
    public void r(@p4.l d1 path, boolean z4) {
        kotlin.jvm.internal.l0.p(path, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // okio.u
    @p4.l
    public List<d1> y(@p4.l d1 dir) {
        kotlin.jvm.internal.l0.p(dir, "dir");
        List<d1> P = P(dir, true);
        kotlin.jvm.internal.l0.m(P);
        return P;
    }

    @Override // okio.u
    @p4.m
    public List<d1> z(@p4.l d1 dir) {
        kotlin.jvm.internal.l0.p(dir, "dir");
        return P(dir, false);
    }
}
