package okio.internal;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.multidex.ClassPathElement;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.x;
import kotlin.d0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.q1;
import kotlin.text.e0;
import kotlin.text.f0;
import kotlin.u0;
import okio.d1;
import okio.l1;
import okio.n1;
import okio.s;
import okio.t;
import okio.u;
import okio.y0;
import org.apache.http.cookie.ClientCookie;

@i0(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u0000 /2\u00020\u0001:\u0001/B!\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u0018\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016J\u0018\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u000bH\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u0019\u001a\u00020\u000bH\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J \u0010&\u001a\u00020%2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0016J\u0018\u0010'\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u001e\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\n0\t*\u00020\u0003H\u0002J\u001a\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n*\u00020+H\u0002J\u001a\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n*\u00020+H\u0002J\f\u0010-\u001a\u00020.*\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R-\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000b0\n0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lokio/internal/ResourceFileSystem;", "Lokio/FileSystem;", "classLoader", "Ljava/lang/ClassLoader;", "indexEagerly", "", "systemFileSystem", "(Ljava/lang/ClassLoader;ZLokio/FileSystem;)V", "roots", "", "Lkotlin/Pair;", "Lokio/Path;", "getRoots", "()Ljava/util/List;", "roots$delegate", "Lkotlin/Lazy;", "appendingSink", "Lokio/Sink;", "file", "mustExist", "atomicMove", "", "source", TypedValues.AttributesType.S_TARGET, "canonicalize", ClientCookie.PATH_ATTR, "canonicalizeInternal", "createDirectory", "dir", "mustCreate", "createSymlink", "delete", "list", "listOrNull", "metadataOrNull", "Lokio/FileMetadata;", "openReadOnly", "Lokio/FileHandle;", "openReadWrite", "sink", "Lokio/Source;", "toClasspathRoots", "toFileRoot", "Ljava/net/URL;", "toJarRoot", "toRelativePath", "", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nResourceFileSystem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n766#2:211\n857#2,2:212\n1549#2:214\n1620#2,3:215\n766#2:218\n857#2,2:219\n1549#2:221\n1620#2,3:222\n1603#2,9:225\n1855#2:234\n1856#2:236\n1612#2:237\n1603#2,9:238\n1855#2:247\n1856#2:249\n1612#2:250\n1#3:235\n1#3:248\n*S KotlinDebug\n*F\n+ 1 ResourceFileSystem.kt\nokio/internal/ResourceFileSystem\n*L\n74#1:211\n74#1:212,2\n75#1:214\n75#1:215,3\n90#1:218\n90#1:219,2\n91#1:221\n91#1:222,3\n173#1:225,9\n173#1:234\n173#1:236\n173#1:237\n174#1:238,9\n174#1:247\n174#1:249\n174#1:250\n173#1:235\n174#1:248\n*E\n"})
/* loaded from: classes4.dex */
public final class j extends u {

    /* renamed from: h, reason: collision with root package name */
    @p4.l
    private static final a f20951h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    @p4.l
    private static final d1 f20952i = d1.a.h(d1.f20879b, "/", false, 1, null);

    /* renamed from: e, reason: collision with root package name */
    @p4.l
    private final ClassLoader f20953e;

    /* renamed from: f, reason: collision with root package name */
    @p4.l
    private final u f20954f;

    /* renamed from: g, reason: collision with root package name */
    @p4.l
    private final d0 f20955g;

    /* JADX INFO: Access modifiers changed from: private */
    @i0(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lokio/internal/ResourceFileSystem$Companion;", "", "()V", org.slf4j.a.f22214f0, "Lokio/Path;", "getROOT", "()Lokio/Path;", "keepPath", "", ClientCookie.PATH_ATTR, "removeBase", "base", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(d1 d1Var) {
            boolean I1;
            I1 = e0.I1(d1Var.s(), ".class", true);
            return !I1;
        }

        @p4.l
        public final d1 b() {
            return j.f20952i;
        }

        @p4.l
        public final d1 d(@p4.l d1 d1Var, @p4.l d1 base) {
            String a42;
            String h22;
            l0.p(d1Var, "<this>");
            l0.p(base, "base");
            String d1Var2 = base.toString();
            d1 b5 = b();
            a42 = f0.a4(d1Var.toString(), d1Var2);
            h22 = e0.h2(a42, '\\', ClassPathElement.SEPARATOR_CHAR, false, 4, null);
            return b5.x(h22);
        }
    }

    @i0(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lkotlin/Pair;", "Lokio/FileSystem;", "Lokio/Path;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class b extends n0 implements v3.a<List<? extends u0<? extends u, ? extends d1>>> {
        b() {
            super(0);
        }

        @Override // v3.a
        @p4.l
        public final List<? extends u0<? extends u, ? extends d1>> invoke() {
            j jVar = j.this;
            return jVar.T(jVar.f20953e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "entry", "Lokio/internal/ZipEntry;", "invoke", "(Lokio/internal/ZipEntry;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class c extends n0 implements v3.l<k, Boolean> {
        public static final c INSTANCE = new c();

        c() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final Boolean invoke(@p4.l k entry) {
            l0.p(entry, "entry");
            return Boolean.valueOf(j.f20951h.c(entry.a()));
        }
    }

    public /* synthetic */ j(ClassLoader classLoader, boolean z4, u uVar, int i5, w wVar) {
        this(classLoader, z4, (i5 & 4) != 0 ? u.f21054b : uVar);
    }

    private final d1 R(d1 d1Var) {
        return f20952i.C(d1Var, true);
    }

    private final List<u0<u, d1>> S() {
        return (List) this.f20955g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<u0<u, d1>> T(ClassLoader classLoader) {
        List<u0<u, d1>> A4;
        Enumeration<URL> resources = classLoader.getResources("");
        l0.o(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        l0.o(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            l0.m(url);
            u0<u, d1> U = U(url);
            if (U != null) {
                arrayList.add(U);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        l0.o(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        l0.o(list2, "list(this)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            l0.m(url2);
            u0<u, d1> V = V(url2);
            if (V != null) {
                arrayList2.add(V);
            }
        }
        A4 = kotlin.collections.e0.A4(arrayList, arrayList2);
        return A4;
    }

    private final u0<u, d1> U(URL url) {
        if (!l0.g(url.getProtocol(), "file")) {
            return null;
        }
        return q1.a(this.f20954f, d1.a.g(d1.f20879b, new File(url.toURI()), false, 1, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r0 = kotlin.text.f0.D3(r9, "!", 0, false, 6, null);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final kotlin.u0<okio.u, okio.d1> V(java.net.URL r9) {
        /*
            r8 = this;
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.l0.o(r9, r0)
            java.lang.String r0 = "jar:file:"
            r6 = 0
            r1 = 2
            r7 = 0
            boolean r0 = kotlin.text.v.s2(r9, r0, r6, r1, r7)
            if (r0 != 0) goto L15
            return r7
        L15:
            java.lang.String r1 = "!"
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r9
            int r0 = kotlin.text.v.D3(r0, r1, r2, r3, r4, r5)
            r1 = -1
            if (r0 != r1) goto L24
            return r7
        L24:
            okio.d1$a r1 = okio.d1.f20879b
            java.io.File r2 = new java.io.File
            r3 = 4
            java.lang.String r9 = r9.substring(r3, r0)
            java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.l0.o(r9, r0)
            java.net.URI r9 = java.net.URI.create(r9)
            r2.<init>(r9)
            r9 = 1
            okio.d1 r9 = okio.d1.a.g(r1, r2, r6, r9, r7)
            okio.u r0 = r8.f20954f
            okio.internal.j$c r1 = okio.internal.j.c.INSTANCE
            okio.r1 r9 = okio.internal.l.d(r9, r0, r1)
            okio.d1 r0 = okio.internal.j.f20952i
            kotlin.u0 r9 = kotlin.q1.a(r9, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.internal.j.V(java.net.URL):kotlin.u0");
    }

    private final String W(d1 d1Var) {
        return R(d1Var).w(f20952i).toString();
    }

    @Override // okio.u
    @p4.m
    public t E(@p4.l d1 path) {
        l0.p(path, "path");
        if (!f20951h.c(path)) {
            return null;
        }
        String W = W(path);
        for (u0<u, d1> u0Var : S()) {
            t E = u0Var.component1().E(u0Var.component2().x(W));
            if (E != null) {
                return E;
            }
        }
        return null;
    }

    @Override // okio.u
    @p4.l
    public s F(@p4.l d1 file) {
        l0.p(file, "file");
        if (f20951h.c(file)) {
            String W = W(file);
            for (u0<u, d1> u0Var : S()) {
                try {
                    return u0Var.component1().F(u0Var.component2().x(W));
                } catch (FileNotFoundException unused) {
                }
            }
            throw new FileNotFoundException("file not found: " + file);
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // okio.u
    @p4.l
    public s H(@p4.l d1 file, boolean z4, boolean z5) {
        l0.p(file, "file");
        throw new IOException("resources are not writable");
    }

    @Override // okio.u
    @p4.l
    public l1 K(@p4.l d1 file, boolean z4) {
        l0.p(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.u
    @p4.l
    public n1 M(@p4.l d1 file) {
        n1 u4;
        l0.p(file, "file");
        if (f20951h.c(file)) {
            d1 d1Var = f20952i;
            InputStream resourceAsStream = this.f20953e.getResourceAsStream(d1.F(d1Var, file, false, 2, null).w(d1Var).toString());
            if (resourceAsStream != null && (u4 = y0.u(resourceAsStream)) != null) {
                return u4;
            }
            throw new FileNotFoundException("file not found: " + file);
        }
        throw new FileNotFoundException("file not found: " + file);
    }

    @Override // okio.u
    @p4.l
    public l1 e(@p4.l d1 file, boolean z4) {
        l0.p(file, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.u
    public void g(@p4.l d1 source, @p4.l d1 target) {
        l0.p(source, "source");
        l0.p(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.u
    @p4.l
    public d1 h(@p4.l d1 path) {
        l0.p(path, "path");
        return R(path);
    }

    @Override // okio.u
    public void n(@p4.l d1 dir, boolean z4) {
        l0.p(dir, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.u
    public void p(@p4.l d1 source, @p4.l d1 target) {
        l0.p(source, "source");
        l0.p(target, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.u
    public void r(@p4.l d1 path, boolean z4) {
        l0.p(path, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // okio.u
    @p4.l
    public List<d1> y(@p4.l d1 dir) {
        List<d1> S5;
        int Y;
        l0.p(dir, "dir");
        String W = W(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z4 = false;
        for (u0<u, d1> u0Var : S()) {
            u component1 = u0Var.component1();
            d1 component2 = u0Var.component2();
            try {
                List<d1> y4 = component1.y(component2.x(W));
                ArrayList arrayList = new ArrayList();
                for (Object obj : y4) {
                    if (f20951h.c((d1) obj)) {
                        arrayList.add(obj);
                    }
                }
                Y = x.Y(arrayList, 10);
                ArrayList arrayList2 = new ArrayList(Y);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f20951h.d((d1) it.next(), component2));
                }
                b0.n0(linkedHashSet, arrayList2);
                z4 = true;
            } catch (IOException unused) {
            }
        }
        if (z4) {
            S5 = kotlin.collections.e0.S5(linkedHashSet);
            return S5;
        }
        throw new FileNotFoundException("file not found: " + dir);
    }

    @Override // okio.u
    @p4.m
    public List<d1> z(@p4.l d1 dir) {
        List<d1> S5;
        int Y;
        l0.p(dir, "dir");
        String W = W(dir);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<u0<u, d1>> it = S().iterator();
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = null;
            if (!it.hasNext()) {
                break;
            }
            u0<u, d1> next = it.next();
            u component1 = next.component1();
            d1 component2 = next.component2();
            List<d1> z5 = component1.z(component2.x(W));
            if (z5 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : z5) {
                    if (f20951h.c((d1) obj)) {
                        arrayList2.add(obj);
                    }
                }
                Y = x.Y(arrayList2, 10);
                ArrayList arrayList3 = new ArrayList(Y);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(f20951h.d((d1) it2.next(), component2));
                }
                arrayList = arrayList3;
            }
            if (arrayList != null) {
                b0.n0(linkedHashSet, arrayList);
                z4 = true;
            }
        }
        if (!z4) {
            return null;
        }
        S5 = kotlin.collections.e0.S5(linkedHashSet);
        return S5;
    }

    public j(@p4.l ClassLoader classLoader, boolean z4, @p4.l u systemFileSystem) {
        d0 c5;
        l0.p(classLoader, "classLoader");
        l0.p(systemFileSystem, "systemFileSystem");
        this.f20953e = classLoader;
        this.f20954f = systemFileSystem;
        c5 = kotlin.f0.c(new b());
        this.f20955g = c5;
        if (z4) {
            S().size();
        }
    }
}
