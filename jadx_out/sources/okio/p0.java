package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.io.path.s2;
import okio.d1;
import org.apache.http.cookie.ClientCookie;

@kotlin.i0(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J \u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0002J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010!\u001a\u00020\"H\u0016J\f\u0010#\u001a\u00020$*\u00020\bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lokio/NioFileSystemWrappingFileSystem;", "Lokio/NioSystemFileSystem;", "nioFileSystem", "Ljava/nio/file/FileSystem;", "(Ljava/nio/file/FileSystem;)V", "appendingSink", "Lokio/Sink;", "file", "Lokio/Path;", "mustExist", "", "atomicMove", "", "source", TypedValues.AttributesType.S_TARGET, "canonicalize", ClientCookie.PATH_ATTR, "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "", "throwOnFailure", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toString", "", "resolve", "Ljava/nio/file/Path;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nNioFileSystemWrappingFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,192:1\n1620#2,3:193\n1#3:196\n37#4,2:197\n37#4,2:199\n37#4,2:201\n*S KotlinDebug\n*F\n+ 1 NioFileSystemWrappingFileSystem.kt\nokio/NioFileSystemWrappingFileSystem\n*L\n77#1:193,3\n104#1:197,2\n125#1:199,2\n138#1:201,2\n*E\n"})
/* loaded from: classes4.dex */
public final class p0 extends x0 {

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final FileSystem f21017e;

    public p0(@p4.l FileSystem nioFileSystem) {
        kotlin.jvm.internal.l0.p(nioFileSystem, "nioFileSystem");
        this.f21017e = nioFileSystem;
    }

    private final List<d1> N(d1 d1Var, boolean z4) {
        boolean exists;
        List i12;
        Path S = S(d1Var);
        try {
            i12 = s2.i1(S, null, 1, null);
            ArrayList arrayList = new ArrayList();
            Iterator it = i12.iterator();
            while (it.hasNext()) {
                arrayList.add(d1.a.i(d1.f20879b, (Path) it.next(), false, 1, null));
            }
            kotlin.collections.a0.j0(arrayList);
            return arrayList;
        } catch (Exception unused) {
            if (!z4) {
                return null;
            }
            exists = Files.exists(S, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
            if (!exists) {
                throw new FileNotFoundException("no such file: " + d1Var);
            }
            throw new IOException("failed to list " + d1Var);
        }
    }

    private final Path S(d1 d1Var) {
        Path path;
        path = this.f21017e.getPath(d1Var.toString(), new String[0]);
        kotlin.jvm.internal.l0.o(path, "getPath(...)");
        return path;
    }

    @Override // okio.x0, okio.g0, okio.u
    @p4.m
    public t E(@p4.l d1 path) {
        kotlin.jvm.internal.l0.p(path, "path");
        return Q(S(path));
    }

    @Override // okio.g0, okio.u
    @p4.l
    public s F(@p4.l d1 file) {
        StandardOpenOption standardOpenOption;
        FileChannel open;
        kotlin.jvm.internal.l0.p(file, "file");
        try {
            Path S = S(file);
            standardOpenOption = StandardOpenOption.READ;
            open = FileChannel.open(S, standardOpenOption);
            kotlin.jvm.internal.l0.m(open);
            return new h0(false, open);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.g0, okio.u
    @p4.l
    public s H(@p4.l d1 file, boolean z4, boolean z5) {
        boolean z6;
        List i5;
        StandardOpenOption standardOpenOption;
        StandardOpenOption standardOpenOption2;
        StandardOpenOption standardOpenOption3;
        List a5;
        FileChannel open;
        StandardOpenOption standardOpenOption4;
        kotlin.jvm.internal.l0.p(file, "file");
        if (z4 && z5) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z6) {
            i5 = kotlin.collections.v.i();
            standardOpenOption = StandardOpenOption.READ;
            i5.add(standardOpenOption);
            standardOpenOption2 = StandardOpenOption.WRITE;
            i5.add(standardOpenOption2);
            if (z4) {
                standardOpenOption4 = StandardOpenOption.CREATE_NEW;
                i5.add(standardOpenOption4);
            } else if (!z5) {
                standardOpenOption3 = StandardOpenOption.CREATE;
                i5.add(standardOpenOption3);
            }
            a5 = kotlin.collections.v.a(i5);
            try {
                Path S = S(file);
                StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) a5.toArray(new StandardOpenOption[0]);
                open = FileChannel.open(S, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
                kotlin.jvm.internal.l0.m(open);
                return new h0(true, open);
            } catch (NoSuchFileException unused) {
                throw new FileNotFoundException("no such file: " + file);
            }
        }
        throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.".toString());
    }

    @Override // okio.g0, okio.u
    @p4.l
    public l1 K(@p4.l d1 file, boolean z4) {
        List i5;
        List a5;
        OutputStream newOutputStream;
        StandardOpenOption standardOpenOption;
        kotlin.jvm.internal.l0.p(file, "file");
        i5 = kotlin.collections.v.i();
        if (z4) {
            standardOpenOption = StandardOpenOption.CREATE_NEW;
            i5.add(standardOpenOption);
        }
        a5 = kotlin.collections.v.a(i5);
        try {
            Path S = S(file);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) a5.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            newOutputStream = Files.newOutputStream(S, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            kotlin.jvm.internal.l0.o(newOutputStream, "newOutputStream(this, *options)");
            return y0.p(newOutputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.g0, okio.u
    @p4.l
    public n1 M(@p4.l d1 file) {
        InputStream newInputStream;
        kotlin.jvm.internal.l0.p(file, "file");
        try {
            newInputStream = Files.newInputStream(S(file), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            kotlin.jvm.internal.l0.o(newInputStream, "newInputStream(this, *options)");
            return y0.u(newInputStream);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + file);
        }
    }

    @Override // okio.g0, okio.u
    @p4.l
    public l1 e(@p4.l d1 file, boolean z4) {
        List i5;
        StandardOpenOption standardOpenOption;
        List a5;
        OutputStream newOutputStream;
        StandardOpenOption standardOpenOption2;
        kotlin.jvm.internal.l0.p(file, "file");
        i5 = kotlin.collections.v.i();
        standardOpenOption = StandardOpenOption.APPEND;
        i5.add(standardOpenOption);
        if (!z4) {
            standardOpenOption2 = StandardOpenOption.CREATE;
            i5.add(standardOpenOption2);
        }
        a5 = kotlin.collections.v.a(i5);
        Path S = S(file);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) a5.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        newOutputStream = Files.newOutputStream(S, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.l0.o(newOutputStream, "newOutputStream(this, *options)");
        return y0.p(newOutputStream);
    }

    @Override // okio.x0, okio.g0, okio.u
    public void g(@p4.l d1 source, @p4.l d1 target) {
        String message;
        StandardCopyOption standardCopyOption;
        StandardCopyOption standardCopyOption2;
        Path move;
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(target, "target");
        try {
            Path S = S(source);
            Path S2 = S(target);
            standardCopyOption = StandardCopyOption.ATOMIC_MOVE;
            standardCopyOption2 = StandardCopyOption.REPLACE_EXISTING;
            move = Files.move(S, S2, (CopyOption[]) Arrays.copyOf(new CopyOption[]{standardCopyOption, standardCopyOption2}, 2));
            kotlin.jvm.internal.l0.o(move, "move(this, target, *options)");
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e5) {
            message = e5.getMessage();
            throw new FileNotFoundException(message);
        }
    }

    @Override // okio.g0, okio.u
    @p4.l
    public d1 h(@p4.l d1 path) {
        Path realPath;
        kotlin.jvm.internal.l0.p(path, "path");
        try {
            d1.a aVar = d1.f20879b;
            realPath = S(path).toRealPath(new LinkOption[0]);
            kotlin.jvm.internal.l0.o(realPath, "toRealPath(...)");
            return d1.a.i(aVar, realPath, false, 1, null);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0011, code lost:
    
        if (r0.j() == true) goto L8;
     */
    @Override // okio.g0, okio.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n(@p4.l okio.d1 r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.l0.p(r4, r0)
            okio.t r0 = r3.E(r4)
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r0.j()
            r2 = 1
            if (r0 != r2) goto L14
            goto L15
        L14:
            r2 = r1
        L15:
            if (r2 == 0) goto L31
            if (r5 != 0) goto L1a
            goto L31
        L1a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " already exists."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L31:
            java.nio.file.Path r5 = r3.S(r4)     // Catch: java.io.IOException -> L47
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.io.IOException -> L47
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.io.IOException -> L47
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0     // Catch: java.io.IOException -> L47
            java.nio.file.Path r5 = kotlin.io.path.k2.a(r5, r0)     // Catch: java.io.IOException -> L47
            java.lang.String r0 = "createDirectory(this, *attributes)"
            kotlin.jvm.internal.l0.o(r5, r0)     // Catch: java.io.IOException -> L47
            return
        L47:
            r5 = move-exception
            if (r2 == 0) goto L4b
            return
        L4b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "failed to create directory: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.p0.n(okio.d1, boolean):void");
    }

    @Override // okio.x0, okio.g0, okio.u
    public void p(@p4.l d1 source, @p4.l d1 target) {
        Path createSymbolicLink;
        kotlin.jvm.internal.l0.p(source, "source");
        kotlin.jvm.internal.l0.p(target, "target");
        createSymbolicLink = Files.createSymbolicLink(S(source), S(target), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0));
        kotlin.jvm.internal.l0.o(createSymbolicLink, "createSymbolicLink(this, target, *attributes)");
    }

    @Override // okio.g0, okio.u
    public void r(@p4.l d1 path, boolean z4) {
        boolean exists;
        kotlin.jvm.internal.l0.p(path, "path");
        if (!Thread.interrupted()) {
            Path S = S(path);
            try {
                Files.delete(S);
                return;
            } catch (NoSuchFileException unused) {
                if (!z4) {
                    return;
                }
                throw new FileNotFoundException("no such file: " + path);
            } catch (IOException unused2) {
                exists = Files.exists(S, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
                if (exists) {
                    throw new IOException("failed to delete " + path);
                }
                return;
            }
        }
        throw new InterruptedIOException("interrupted");
    }

    @Override // okio.x0, okio.g0
    @p4.l
    public String toString() {
        String t5 = kotlin.jvm.internal.l1.d(this.f21017e.getClass()).t();
        kotlin.jvm.internal.l0.m(t5);
        return t5;
    }

    @Override // okio.g0, okio.u
    @p4.l
    public List<d1> y(@p4.l d1 dir) {
        kotlin.jvm.internal.l0.p(dir, "dir");
        List<d1> N = N(dir, true);
        kotlin.jvm.internal.l0.m(N);
        return N;
    }

    @Override // okio.g0, okio.u
    @p4.m
    public List<d1> z(@p4.l d1 dir) {
        kotlin.jvm.internal.l0.p(dir, "dir");
        return N(dir, false);
    }
}
