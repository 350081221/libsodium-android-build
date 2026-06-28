package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import okio.d1;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J \u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\bH\u0002J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\f\u0010!\u001a\u00020\n*\u00020\u0006H\u0002J\f\u0010\"\u001a\u00020\n*\u00020\u0006H\u0002¨\u0006#"}, d2 = {"Lokio/JvmSystemFileSystem;", "Lokio/FileSystem;", "()V", "appendingSink", "Lokio/Sink;", "file", "Lokio/Path;", "mustExist", "", "atomicMove", "", "source", TypedValues.AttributesType.S_TARGET, "canonicalize", ClientCookie.PATH_ATTR, "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "", "throwOnFailure", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toString", "", "requireCreate", "requireExist", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nJvmSystemFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,158:1\n11400#2,3:159\n*S KotlinDebug\n*F\n+ 1 JvmSystemFileSystem.kt\nokio/JvmSystemFileSystem\n*L\n77#1:159,3\n*E\n"})
/* loaded from: classes4.dex */
public class g0 extends u {
    private final List<d1> N(d1 d1Var, boolean z4) {
        File G = d1Var.G();
        String[] list = G.list();
        if (list == null) {
            if (z4) {
                if (!G.exists()) {
                    throw new FileNotFoundException("no such file: " + d1Var);
                }
                throw new IOException("failed to list " + d1Var);
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            kotlin.jvm.internal.l0.m(str);
            arrayList.add(d1Var.x(str));
        }
        kotlin.collections.a0.j0(arrayList);
        return arrayList;
    }

    private final void O(d1 d1Var) {
        if (w(d1Var)) {
            throw new IOException(d1Var + " already exists.");
        }
    }

    private final void P(d1 d1Var) {
        if (w(d1Var)) {
            return;
        }
        throw new IOException(d1Var + " doesn't exist.");
    }

    @Override // okio.u
    @p4.m
    public t E(@p4.l d1 path) {
        kotlin.jvm.internal.l0.p(path, "path");
        File G = path.G();
        boolean isFile = G.isFile();
        boolean isDirectory = G.isDirectory();
        long lastModified = G.lastModified();
        long length = G.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !G.exists()) {
            return null;
        }
        return new t(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null, null, 128, null);
    }

    @Override // okio.u
    @p4.l
    public s F(@p4.l d1 file) {
        kotlin.jvm.internal.l0.p(file, "file");
        return new f0(false, new RandomAccessFile(file.G(), "r"));
    }

    @Override // okio.u
    @p4.l
    public s H(@p4.l d1 file, boolean z4, boolean z5) {
        boolean z6;
        kotlin.jvm.internal.l0.p(file, "file");
        if (z4 && z5) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6) {
            if (z4) {
                O(file);
            }
            if (z5) {
                P(file);
            }
            return new f0(true, new RandomAccessFile(file.G(), "rw"));
        }
        throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
    }

    @Override // okio.u
    @p4.l
    public l1 K(@p4.l d1 file, boolean z4) {
        l1 q5;
        kotlin.jvm.internal.l0.p(file, "file");
        if (z4) {
            O(file);
        }
        q5 = z0.q(file.G(), false, 1, null);
        return q5;
    }

    @Override // okio.u
    @p4.l
    public n1 M(@p4.l d1 file) {
        kotlin.jvm.internal.l0.p(file, "file");
        return y0.t(file.G());
    }

    @Override // okio.u
    @p4.l
    public l1 e(@p4.l d1 file, boolean z4) {
        kotlin.jvm.internal.l0.p(file, "file");
        if (z4) {
            P(file);
        }
        return y0.o(file.G(), true);
    }

    @Override // okio.u
    public void g(@p4.l d1 source, @p4.l d1 target) {
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(target, "target");
        if (source.G().renameTo(target.G())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    @Override // okio.u
    @p4.l
    public d1 h(@p4.l d1 path) {
        kotlin.jvm.internal.l0.p(path, "path");
        File canonicalFile = path.G().getCanonicalFile();
        if (canonicalFile.exists()) {
            d1.a aVar = d1.f20879b;
            kotlin.jvm.internal.l0.m(canonicalFile);
            return d1.a.g(aVar, canonicalFile, false, 1, null);
        }
        throw new FileNotFoundException("no such file");
    }

    @Override // okio.u
    public void n(@p4.l d1 dir, boolean z4) {
        kotlin.jvm.internal.l0.p(dir, "dir");
        if (!dir.G().mkdir()) {
            t E = E(dir);
            boolean z5 = false;
            if (E != null && E.j()) {
                z5 = true;
            }
            if (z5) {
                if (!z4) {
                    return;
                }
                throw new IOException(dir + " already exists.");
            }
            throw new IOException("failed to create directory: " + dir);
        }
    }

    @Override // okio.u
    public void p(@p4.l d1 source, @p4.l d1 target) {
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(target, "target");
        throw new IOException("unsupported");
    }

    @Override // okio.u
    public void r(@p4.l d1 path, boolean z4) {
        kotlin.jvm.internal.l0.p(path, "path");
        if (!Thread.interrupted()) {
            File G = path.G();
            if (!G.delete()) {
                if (!G.exists()) {
                    if (z4) {
                        throw new FileNotFoundException("no such file: " + path);
                    }
                    return;
                }
                throw new IOException("failed to delete " + path);
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    @p4.l
    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // okio.u
    @p4.l
    public List<d1> y(@p4.l d1 dir) {
        kotlin.jvm.internal.l0.p(dir, "dir");
        List<d1> N = N(dir, true);
        kotlin.jvm.internal.l0.m(N);
        return N;
    }

    @Override // okio.u
    @p4.m
    public List<d1> z(@p4.l d1 dir) {
        kotlin.jvm.internal.l0.p(dir, "dir");
        return N(dir, false);
    }
}
