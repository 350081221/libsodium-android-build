package kotlin.io;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.multidex.ClassPathElement;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.text.e0;
import kotlin.text.f0;

@i0(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a*\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a*\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0007\u001a8\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\u001a\b\u0002\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013\u001a&\u0010\u0016\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018\u001a\n\u0010\u0019\u001a\u00020\u000f*\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010\u001a\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\n\u0010\u001c\u001a\u00020\u0002*\u00020\u0002\u001a\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d*\b\u0012\u0004\u0012\u00020\u00020\u001dH\u0002¢\u0006\u0002\b\u001e\u001a\u0011\u0010\u001c\u001a\u00020\u001f*\u00020\u001fH\u0002¢\u0006\u0002\b\u001e\u001a\u0012\u0010 \u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0014\u0010\"\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010#\u001a\u00020\u0002*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010$\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0002\u001a\u0012\u0010&\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0001\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002\u001a\u0012\u0010'\u001a\u00020\u000f*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0001\u001a\u0012\u0010(\u001a\u00020\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002\u001a\u001b\u0010)\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H\u0002¢\u0006\u0002\b*\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\"\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006+"}, d2 = {"extension", "", "Ljava/io/File;", "getExtension", "(Ljava/io/File;)Ljava/lang/String;", "invariantSeparatorsPath", "getInvariantSeparatorsPath", "nameWithoutExtension", "getNameWithoutExtension", "createTempDir", "prefix", "suffix", "directory", "createTempFile", "copyRecursively", "", TypedValues.AttributesType.S_TARGET, "overwrite", "onError", "Lkotlin/Function2;", "Ljava/io/IOException;", "Lkotlin/io/OnErrorAction;", "copyTo", "bufferSize", "", "deleteRecursively", "endsWith", "other", "normalize", "", "normalize$FilesKt__UtilsKt", "Lkotlin/io/FilePathComponents;", "relativeTo", "base", "relativeToOrNull", "relativeToOrSelf", "resolve", "relative", "resolveSibling", "startsWith", "toRelativeString", "toRelativeStringOrNull", "toRelativeStringOrNull$FilesKt__UtilsKt", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/io/FilesKt")
@r1({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,473:1\n1#2:474\n1284#3,3:475\n*S KotlinDebug\n*F\n+ 1 Utils.kt\nkotlin/io/FilesKt__UtilsKt\n*L\n347#1:475,3\n*E\n"})
/* loaded from: classes2.dex */
public class q extends p {

    @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Ljava/io/File;", "exception", "Ljava/io/IOException;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    static final class a extends n0 implements v3.p {
        public static final a INSTANCE = new a();

        a() {
            super(2);
        }

        @Override // v3.p
        @p4.l
        public final Void invoke(@p4.l File file, @p4.l IOException exception) {
            l0.p(file, "<anonymous parameter 0>");
            l0.p(exception, "exception");
            throw exception;
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "f", "Ljava/io/File;", "e", "Ljava/io/IOException;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends n0 implements v3.p<File, IOException, r2> {
        final /* synthetic */ v3.p<File, IOException, u> $onError;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(v3.p<? super File, ? super IOException, ? extends u> pVar) {
            super(2);
            this.$onError = pVar;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(File file, IOException iOException) {
            invoke2(file, iOException);
            return r2.f19517a;
        }

        /* renamed from: invoke */
        public final void invoke2(@p4.l File f5, @p4.l IOException e5) {
            l0.p(f5, "f");
            l0.p(e5, "e");
            if (this.$onError.invoke(f5, e5) == u.TERMINATE) {
                throw new x(f5);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean N(@p4.l java.io.File r11, @p4.l java.io.File r12, boolean r13, @p4.l v3.p<? super java.io.File, ? super java.io.IOException, ? extends kotlin.io.u> r14) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l0.p(r11, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.l0.p(r12, r0)
            java.lang.String r0 = "onError"
            kotlin.jvm.internal.l0.p(r14, r0)
            boolean r0 = r11.exists()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L2e
            kotlin.io.t r12 = new kotlin.io.t
            r5 = 0
            java.lang.String r6 = "The source file doesn't exist."
            r7 = 2
            r8 = 0
            r3 = r12
            r4 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = r14.invoke(r11, r12)
            kotlin.io.u r12 = kotlin.io.u.TERMINATE
            if (r11 == r12) goto L2c
            goto L2d
        L2c:
            r1 = r2
        L2d:
            return r1
        L2e:
            kotlin.io.k r0 = kotlin.io.p.M(r11)     // Catch: kotlin.io.x -> Ldc
            kotlin.io.q$b r3 = new kotlin.io.q$b     // Catch: kotlin.io.x -> Ldc
            r3.<init>(r14)     // Catch: kotlin.io.x -> Ldc
            kotlin.io.k r0 = r0.k(r3)     // Catch: kotlin.io.x -> Ldc
            java.util.Iterator r0 = r0.iterator()     // Catch: kotlin.io.x -> Ldc
        L3f:
            boolean r3 = r0.hasNext()     // Catch: kotlin.io.x -> Ldc
            if (r3 == 0) goto Ldb
            java.lang.Object r3 = r0.next()     // Catch: kotlin.io.x -> Ldc
            java.io.File r3 = (java.io.File) r3     // Catch: kotlin.io.x -> Ldc
            boolean r4 = r3.exists()     // Catch: kotlin.io.x -> Ldc
            if (r4 != 0) goto L66
            kotlin.io.t r10 = new kotlin.io.t     // Catch: kotlin.io.x -> Ldc
            r6 = 0
            java.lang.String r7 = "The source file doesn't exist."
            r8 = 2
            r9 = 0
            r4 = r10
            r5 = r3
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: kotlin.io.x -> Ldc
            java.lang.Object r3 = r14.invoke(r3, r10)     // Catch: kotlin.io.x -> Ldc
            kotlin.io.u r4 = kotlin.io.u.TERMINATE     // Catch: kotlin.io.x -> Ldc
            if (r3 != r4) goto L3f
            return r2
        L66:
            java.lang.String r4 = n0(r3, r11)     // Catch: kotlin.io.x -> Ldc
            java.io.File r5 = new java.io.File     // Catch: kotlin.io.x -> Ldc
            r5.<init>(r12, r4)     // Catch: kotlin.io.x -> Ldc
            boolean r4 = r5.exists()     // Catch: kotlin.io.x -> Ldc
            if (r4 == 0) goto Lac
            boolean r4 = r3.isDirectory()     // Catch: kotlin.io.x -> Ldc
            if (r4 == 0) goto L81
            boolean r4 = r5.isDirectory()     // Catch: kotlin.io.x -> Ldc
            if (r4 != 0) goto Lac
        L81:
            if (r13 != 0) goto L85
        L83:
            r4 = r1
            goto L9a
        L85:
            boolean r4 = r5.isDirectory()     // Catch: kotlin.io.x -> Ldc
            if (r4 == 0) goto L92
            boolean r4 = V(r5)     // Catch: kotlin.io.x -> Ldc
            if (r4 != 0) goto L99
            goto L83
        L92:
            boolean r4 = r5.delete()     // Catch: kotlin.io.x -> Ldc
            if (r4 != 0) goto L99
            goto L83
        L99:
            r4 = r2
        L9a:
            if (r4 == 0) goto Lac
            kotlin.io.h r4 = new kotlin.io.h     // Catch: kotlin.io.x -> Ldc
            java.lang.String r6 = "The destination file already exists."
            r4.<init>(r3, r5, r6)     // Catch: kotlin.io.x -> Ldc
            java.lang.Object r3 = r14.invoke(r5, r4)     // Catch: kotlin.io.x -> Ldc
            kotlin.io.u r4 = kotlin.io.u.TERMINATE     // Catch: kotlin.io.x -> Ldc
            if (r3 != r4) goto L3f
            return r2
        Lac:
            boolean r4 = r3.isDirectory()     // Catch: kotlin.io.x -> Ldc
            if (r4 == 0) goto Lb6
            r5.mkdirs()     // Catch: kotlin.io.x -> Ldc
            goto L3f
        Lb6:
            r7 = 0
            r8 = 4
            r9 = 0
            r4 = r3
            r6 = r13
            java.io.File r4 = kotlin.io.m.Q(r4, r5, r6, r7, r8, r9)     // Catch: kotlin.io.x -> Ldc
            long r4 = r4.length()     // Catch: kotlin.io.x -> Ldc
            long r6 = r3.length()     // Catch: kotlin.io.x -> Ldc
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L3f
            java.io.IOException r4 = new java.io.IOException     // Catch: kotlin.io.x -> Ldc
            java.lang.String r5 = "Source file wasn't copied completely, length of destination file differs."
            r4.<init>(r5)     // Catch: kotlin.io.x -> Ldc
            java.lang.Object r3 = r14.invoke(r3, r4)     // Catch: kotlin.io.x -> Ldc
            kotlin.io.u r4 = kotlin.io.u.TERMINATE     // Catch: kotlin.io.x -> Ldc
            if (r3 != r4) goto L3f
            return r2
        Ldb:
            return r1
        Ldc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.io.q.N(java.io.File, java.io.File, boolean, v3.p):boolean");
    }

    public static /* synthetic */ boolean O(File file, File file2, boolean z4, v3.p pVar, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        if ((i5 & 4) != 0) {
            pVar = a.INSTANCE;
        }
        return N(file, file2, z4, pVar);
    }

    @p4.l
    public static final File P(@p4.l File file, @p4.l File target, boolean z4, int i5) {
        l0.p(file, "<this>");
        l0.p(target, "target");
        if (file.exists()) {
            if (target.exists()) {
                if (z4) {
                    if (!target.delete()) {
                        throw new h(file, target, "Tried to overwrite the destination, but failed to delete it.");
                    }
                } else {
                    throw new h(file, target, "The destination file already exists.");
                }
            }
            if (file.isDirectory()) {
                if (!target.mkdirs()) {
                    throw new j(file, target, "Failed to create target directory.");
                }
            } else {
                File parentFile = target.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(target);
                    try {
                        kotlin.io.b.k(fileInputStream, fileOutputStream, i5);
                        c.a(fileOutputStream, null);
                        c.a(fileInputStream, null);
                    } finally {
                    }
                } finally {
                }
            }
            return target;
        }
        throw new t(file, null, "The source file doesn't exist.", 2, null);
    }

    public static /* synthetic */ File Q(File file, File file2, boolean z4, int i5, int i6, Object obj) {
        if ((i6 & 2) != 0) {
            z4 = false;
        }
        if ((i6 & 4) != 0) {
            i5 = 8192;
        }
        return P(file, file2, z4, i5);
    }

    @p4.l
    @kotlin.k(message = "Avoid creating temporary directories in the default temp location with this function due to too wide permissions on the newly created directory. Use kotlin.io.path.createTempDirectory instead.")
    public static final File R(@p4.l String prefix, @p4.m String str, @p4.m File file) {
        l0.p(prefix, "prefix");
        File dir = File.createTempFile(prefix, str, file);
        dir.delete();
        if (dir.mkdir()) {
            l0.o(dir, "dir");
            return dir;
        }
        throw new IOException("Unable to create temporary directory " + dir + external.org.apache.commons.lang3.d.f15957a);
    }

    public static /* synthetic */ File S(String str, String str2, File file, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = "tmp";
        }
        if ((i5 & 2) != 0) {
            str2 = null;
        }
        if ((i5 & 4) != 0) {
            file = null;
        }
        return R(str, str2, file);
    }

    @p4.l
    @kotlin.k(message = "Avoid creating temporary files in the default temp location with this function due to too wide permissions on the newly created file. Use kotlin.io.path.createTempFile instead or resort to java.io.File.createTempFile.")
    public static final File T(@p4.l String prefix, @p4.m String str, @p4.m File file) {
        l0.p(prefix, "prefix");
        File createTempFile = File.createTempFile(prefix, str, file);
        l0.o(createTempFile, "createTempFile(prefix, suffix, directory)");
        return createTempFile;
    }

    public static /* synthetic */ File U(String str, String str2, File file, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            str = "tmp";
        }
        if ((i5 & 2) != 0) {
            str2 = null;
        }
        if ((i5 & 4) != 0) {
            file = null;
        }
        return T(str, str2, file);
    }

    public static final boolean V(@p4.l File file) {
        l0.p(file, "<this>");
        while (true) {
            boolean z4 = true;
            for (File file2 : p.L(file)) {
                if (file2.delete() || !file2.exists()) {
                    if (z4) {
                        break;
                    }
                }
                z4 = false;
            }
            return z4;
        }
    }

    public static final boolean W(@p4.l File file, @p4.l File other) {
        l0.p(file, "<this>");
        l0.p(other, "other");
        i f5 = n.f(file);
        i f6 = n.f(other);
        if (f6.i()) {
            return l0.g(file, other);
        }
        int h5 = f5.h() - f6.h();
        if (h5 < 0) {
            return false;
        }
        return f5.g().subList(h5, f5.h()).equals(f6.g());
    }

    public static final boolean X(@p4.l File file, @p4.l String other) {
        l0.p(file, "<this>");
        l0.p(other, "other");
        return W(file, new File(other));
    }

    @p4.l
    public static final String Y(@p4.l File file) {
        String o5;
        l0.p(file, "<this>");
        String name = file.getName();
        l0.o(name, "name");
        o5 = f0.o5(name, external.org.apache.commons.lang3.d.f15957a, "");
        return o5;
    }

    @p4.l
    public static final String Z(@p4.l File file) {
        String h22;
        l0.p(file, "<this>");
        if (File.separatorChar != '/') {
            String path = file.getPath();
            l0.o(path, "path");
            h22 = e0.h2(path, File.separatorChar, ClassPathElement.SEPARATOR_CHAR, false, 4, null);
            return h22;
        }
        String path2 = file.getPath();
        l0.o(path2, "path");
        return path2;
    }

    @p4.l
    public static final String a0(@p4.l File file) {
        String z5;
        l0.p(file, "<this>");
        String name = file.getName();
        l0.o(name, "name");
        z5 = f0.z5(name, ".", null, 2, null);
        return z5;
    }

    @p4.l
    public static final File b0(@p4.l File file) {
        String j32;
        l0.p(file, "<this>");
        i f5 = n.f(file);
        File e5 = f5.e();
        List<File> c02 = c0(f5.g());
        String separator = File.separator;
        l0.o(separator, "separator");
        j32 = kotlin.collections.e0.j3(c02, separator, null, null, 0, null, null, 62, null);
        return i0(e5, j32);
    }

    private static final List<File> c0(List<? extends File> list) {
        Object m32;
        ArrayList arrayList = new ArrayList(list.size());
        for (File file : list) {
            String name = file.getName();
            if (!l0.g(name, ".")) {
                if (l0.g(name, "..")) {
                    if (!arrayList.isEmpty()) {
                        m32 = kotlin.collections.e0.m3(arrayList);
                        if (!l0.g(((File) m32).getName(), "..")) {
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                    arrayList.add(file);
                } else {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    private static final i d0(i iVar) {
        return new i(iVar.e(), c0(iVar.g()));
    }

    @p4.l
    public static final File e0(@p4.l File file, @p4.l File base) {
        l0.p(file, "<this>");
        l0.p(base, "base");
        return new File(n0(file, base));
    }

    @p4.m
    public static final File f0(@p4.l File file, @p4.l File base) {
        l0.p(file, "<this>");
        l0.p(base, "base");
        String o02 = o0(file, base);
        if (o02 != null) {
            return new File(o02);
        }
        return null;
    }

    @p4.l
    public static final File g0(@p4.l File file, @p4.l File base) {
        l0.p(file, "<this>");
        l0.p(base, "base");
        String o02 = o0(file, base);
        if (o02 != null) {
            return new File(o02);
        }
        return file;
    }

    @p4.l
    public static final File h0(@p4.l File file, @p4.l File relative) {
        boolean z4;
        boolean Y2;
        l0.p(file, "<this>");
        l0.p(relative, "relative");
        if (n.d(relative)) {
            return relative;
        }
        String file2 = file.toString();
        l0.o(file2, "this.toString()");
        if (file2.length() == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            Y2 = f0.Y2(file2, File.separatorChar, false, 2, null);
            if (!Y2) {
                return new File(file2 + File.separatorChar + relative);
            }
        }
        return new File(file2 + relative);
    }

    @p4.l
    public static final File i0(@p4.l File file, @p4.l String relative) {
        l0.p(file, "<this>");
        l0.p(relative, "relative");
        return h0(file, new File(relative));
    }

    @p4.l
    public static final File j0(@p4.l File file, @p4.l File relative) {
        File j5;
        l0.p(file, "<this>");
        l0.p(relative, "relative");
        i f5 = n.f(file);
        if (f5.h() == 0) {
            j5 = new File("..");
        } else {
            j5 = f5.j(0, f5.h() - 1);
        }
        return h0(h0(f5.e(), j5), relative);
    }

    @p4.l
    public static final File k0(@p4.l File file, @p4.l String relative) {
        l0.p(file, "<this>");
        l0.p(relative, "relative");
        return j0(file, new File(relative));
    }

    public static final boolean l0(@p4.l File file, @p4.l File other) {
        l0.p(file, "<this>");
        l0.p(other, "other");
        i f5 = n.f(file);
        i f6 = n.f(other);
        if (!l0.g(f5.e(), f6.e()) || f5.h() < f6.h()) {
            return false;
        }
        return f5.g().subList(0, f6.h()).equals(f6.g());
    }

    public static final boolean m0(@p4.l File file, @p4.l String other) {
        l0.p(file, "<this>");
        l0.p(other, "other");
        return l0(file, new File(other));
    }

    @p4.l
    public static final String n0(@p4.l File file, @p4.l File base) {
        l0.p(file, "<this>");
        l0.p(base, "base");
        String o02 = o0(file, base);
        if (o02 != null) {
            return o02;
        }
        throw new IllegalArgumentException("this and base files have different roots: " + file + " and " + base + external.org.apache.commons.lang3.d.f15957a);
    }

    private static final String o0(File file, File file2) {
        List Z1;
        i d02 = d0(n.f(file));
        i d03 = d0(n.f(file2));
        if (!l0.g(d02.e(), d03.e())) {
            return null;
        }
        int h5 = d03.h();
        int h6 = d02.h();
        int min = Math.min(h6, h5);
        int i5 = 0;
        while (i5 < min && l0.g(d02.g().get(i5), d03.g().get(i5))) {
            i5++;
        }
        StringBuilder sb = new StringBuilder();
        int i6 = h5 - 1;
        if (i5 <= i6) {
            while (!l0.g(d03.g().get(i6).getName(), "..")) {
                sb.append("..");
                if (i6 != i5) {
                    sb.append(File.separatorChar);
                }
                if (i6 != i5) {
                    i6--;
                }
            }
            return null;
        }
        if (i5 < h6) {
            if (i5 < h5) {
                sb.append(File.separatorChar);
            }
            Z1 = kotlin.collections.e0.Z1(d02.g(), i5);
            String separator = File.separator;
            l0.o(separator, "separator");
            kotlin.collections.e0.h3(Z1, sb, separator, null, null, 0, null, null, 124, null);
        }
        return sb.toString();
    }
}
