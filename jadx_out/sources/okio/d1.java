package okio;

import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@kotlin.i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001.B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0000H\u0096\u0002J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\rH\u0087\u0002¢\u0006\u0002\b\"J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0002\b\"J\u0016\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0002\b\"J\u0013\u0010#\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020\u001eH\u0016J\u0006\u0010&\u001a\u00020\u0000J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0000J\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\r2\b\b\u0002\u0010(\u001a\u00020\bJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00032\b\b\u0002\u0010(\u001a\u00020\bJ\u0018\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u00002\b\b\u0002\u0010(\u001a\u00020\bJ\u0006\u0010)\u001a\u00020*J\u0006\u0010+\u001a\u00020,J\b\u0010-\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0006R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00008G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001c¨\u0006/"}, d2 = {"Lokio/Path;", "", "bytes", "Lokio/ByteString;", "(Lokio/ByteString;)V", "getBytes$okio", "()Lokio/ByteString;", "isAbsolute", "", "()Z", "isRelative", "isRoot", "name", "", "()Ljava/lang/String;", "nameBytes", "parent", "()Lokio/Path;", "root", "getRoot", "segments", "", "getSegments", "()Ljava/util/List;", "segmentsBytes", "getSegmentsBytes", "volumeLetter", "", "()Ljava/lang/Character;", "compareTo", "", "other", "div", "child", "resolve", "equals", "", TTDownloadField.TT_HASHCODE, "normalized", "relativeTo", "normalize", "toFile", "Ljava/io/File;", "toNioPath", "Ljava/nio/file/Path;", "toString", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/Path\n+ 2 Path.kt\nokio/internal/-Path\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,132:1\n45#2,3:133\n53#2,28:136\n59#2,22:168\n112#2:190\n117#2:191\n122#2,6:192\n139#2,5:198\n149#2:203\n154#2,25:204\n194#2:229\n199#2,11:230\n204#2,6:241\n199#2,11:247\n204#2,6:258\n228#2,36:264\n268#2:300\n282#2:301\n287#2:302\n292#2:303\n297#2:304\n1549#3:164\n1620#3,3:165\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/Path\n*L\n44#1:133,3\n47#1:136,28\n50#1:168,22\n53#1:190\n56#1:191\n60#1:192,6\n64#1:198,5\n68#1:203\n72#1:204,25\n75#1:229\n78#1:230,11\n81#1:241,6\n87#1:247,11\n90#1:258,6\n95#1:264,36\n97#1:300\n104#1:301\n106#1:302\n108#1:303\n110#1:304\n47#1:164\n47#1:165,3\n*E\n"})
/* loaded from: classes4.dex */
public final class d1 implements Comparable<d1> {

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    public static final a f20879b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    @u3.e
    public static final String f20880c;

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final n f20881a;

    @kotlin.i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\u0005\u001a\u00020\u0006*\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nJ\u001b\u0010\f\u001a\u00020\u0006*\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\b\nR\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lokio/Path$Companion;", "", "()V", "DIRECTORY_SEPARATOR", "", "toOkioPath", "Lokio/Path;", "Ljava/io/File;", "normalize", "", "get", "Ljava/nio/file/Path;", "toPath", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.w wVar) {
            this();
        }

        public static /* synthetic */ d1 g(a aVar, File file, boolean z4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                z4 = false;
            }
            return aVar.b(file, z4);
        }

        public static /* synthetic */ d1 h(a aVar, String str, boolean z4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                z4 = false;
            }
            return aVar.d(str, z4);
        }

        public static /* synthetic */ d1 i(a aVar, Path path, boolean z4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                z4 = false;
            }
            return aVar.f(path, z4);
        }

        @u3.h(name = "get")
        @u3.m
        @p4.l
        @u3.i
        public final d1 a(@p4.l File file) {
            kotlin.jvm.internal.l0.p(file, "<this>");
            return g(this, file, false, 1, null);
        }

        @u3.h(name = "get")
        @u3.m
        @p4.l
        @u3.i
        public final d1 b(@p4.l File file, boolean z4) {
            kotlin.jvm.internal.l0.p(file, "<this>");
            String file2 = file.toString();
            kotlin.jvm.internal.l0.o(file2, "toString(...)");
            return d(file2, z4);
        }

        @u3.h(name = "get")
        @u3.m
        @p4.l
        @u3.i
        public final d1 c(@p4.l String str) {
            kotlin.jvm.internal.l0.p(str, "<this>");
            return h(this, str, false, 1, null);
        }

        @u3.h(name = "get")
        @u3.m
        @p4.l
        @u3.i
        public final d1 d(@p4.l String str, boolean z4) {
            kotlin.jvm.internal.l0.p(str, "<this>");
            return okio.internal.d.B(str, z4);
        }

        @u3.h(name = "get")
        @u3.m
        @p4.l
        @u3.i
        public final d1 e(@p4.l Path path) {
            kotlin.jvm.internal.l0.p(path, "<this>");
            return i(this, path, false, 1, null);
        }

        @u3.h(name = "get")
        @u3.m
        @p4.l
        @u3.i
        public final d1 f(@p4.l Path path, boolean z4) {
            kotlin.jvm.internal.l0.p(path, "<this>");
            return d(path.toString(), z4);
        }
    }

    static {
        String separator = File.separator;
        kotlin.jvm.internal.l0.o(separator, "separator");
        f20880c = separator;
    }

    public d1(@p4.l n bytes) {
        kotlin.jvm.internal.l0.p(bytes, "bytes");
        this.f20881a = bytes;
    }

    public static /* synthetic */ d1 D(d1 d1Var, String str, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return d1Var.y(str, z4);
    }

    public static /* synthetic */ d1 E(d1 d1Var, n nVar, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return d1Var.A(nVar, z4);
    }

    public static /* synthetic */ d1 F(d1 d1Var, d1 d1Var2, boolean z4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z4 = false;
        }
        return d1Var.C(d1Var2, z4);
    }

    @u3.h(name = "get")
    @u3.m
    @p4.l
    @u3.i
    public static final d1 e(@p4.l File file) {
        return f20879b.a(file);
    }

    @u3.h(name = "get")
    @u3.m
    @p4.l
    @u3.i
    public static final d1 f(@p4.l File file, boolean z4) {
        return f20879b.b(file, z4);
    }

    @u3.h(name = "get")
    @u3.m
    @p4.l
    @u3.i
    public static final d1 h(@p4.l String str) {
        return f20879b.c(str);
    }

    @u3.h(name = "get")
    @u3.m
    @p4.l
    @u3.i
    public static final d1 i(@p4.l String str, boolean z4) {
        return f20879b.d(str, z4);
    }

    @u3.h(name = "get")
    @u3.m
    @p4.l
    @u3.i
    public static final d1 j(@p4.l Path path) {
        return f20879b.e(path);
    }

    @u3.h(name = "get")
    @u3.m
    @p4.l
    @u3.i
    public static final d1 k(@p4.l Path path, boolean z4) {
        return f20879b.f(path, z4);
    }

    @p4.l
    public final d1 A(@p4.l n child, boolean z4) {
        kotlin.jvm.internal.l0.p(child, "child");
        return okio.internal.d.x(this, okio.internal.d.O(new l().v0(child), false), z4);
    }

    @p4.l
    @u3.h(name = "resolve")
    public final d1 B(@p4.l d1 child) {
        kotlin.jvm.internal.l0.p(child, "child");
        return okio.internal.d.x(this, child, false);
    }

    @p4.l
    public final d1 C(@p4.l d1 child, boolean z4) {
        kotlin.jvm.internal.l0.p(child, "child");
        return okio.internal.d.x(this, child, z4);
    }

    @p4.l
    public final File G() {
        return new File(toString());
    }

    @p4.l
    public final Path H() {
        Path path;
        path = Paths.get(toString(), new String[0]);
        kotlin.jvm.internal.l0.o(path, "get(...)");
        return path;
    }

    @u3.h(name = "volumeLetter")
    @p4.m
    public final Character I() {
        boolean z4;
        boolean z5 = false;
        if (n.indexOf$default(l(), okio.internal.d.e(), 0, 2, (Object) null) != -1 || l().size() < 2 || l().getByte(1) != 58) {
            return null;
        }
        char c5 = (char) l().getByte(0);
        if ('a' <= c5 && c5 < '{') {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            if ('A' <= c5 && c5 < '[') {
                z5 = true;
            }
            if (!z5) {
                return null;
            }
        }
        return Character.valueOf(c5);
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(@p4.l d1 other) {
        kotlin.jvm.internal.l0.p(other, "other");
        return l().compareTo(other.l());
    }

    public boolean equals(@p4.m Object obj) {
        return (obj instanceof d1) && kotlin.jvm.internal.l0.g(((d1) obj).l(), l());
    }

    public int hashCode() {
        return l().hashCode();
    }

    @p4.l
    public final n l() {
        return this.f20881a;
    }

    @p4.m
    public final d1 m() {
        int h5 = okio.internal.d.h(this);
        if (h5 == -1) {
            return null;
        }
        return new d1(l().substring(0, h5));
    }

    @p4.l
    public final List<String> n() {
        int Y;
        ArrayList arrayList = new ArrayList();
        int h5 = okio.internal.d.h(this);
        if (h5 == -1) {
            h5 = 0;
        } else if (h5 < l().size() && l().getByte(h5) == 92) {
            h5++;
        }
        int size = l().size();
        int i5 = h5;
        while (h5 < size) {
            if (l().getByte(h5) == 47 || l().getByte(h5) == 92) {
                arrayList.add(l().substring(i5, h5));
                i5 = h5 + 1;
            }
            h5++;
        }
        if (i5 < l().size()) {
            arrayList.add(l().substring(i5, l().size()));
        }
        Y = kotlin.collections.x.Y(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(Y);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((n) it.next()).utf8());
        }
        return arrayList2;
    }

    @p4.l
    public final List<n> o() {
        ArrayList arrayList = new ArrayList();
        int h5 = okio.internal.d.h(this);
        if (h5 == -1) {
            h5 = 0;
        } else if (h5 < l().size() && l().getByte(h5) == 92) {
            h5++;
        }
        int size = l().size();
        int i5 = h5;
        while (h5 < size) {
            if (l().getByte(h5) == 47 || l().getByte(h5) == 92) {
                arrayList.add(l().substring(i5, h5));
                i5 = h5 + 1;
            }
            h5++;
        }
        if (i5 < l().size()) {
            arrayList.add(l().substring(i5, l().size()));
        }
        return arrayList;
    }

    public final boolean p() {
        return okio.internal.d.h(this) != -1;
    }

    public final boolean q() {
        return okio.internal.d.h(this) == -1;
    }

    public final boolean r() {
        return okio.internal.d.h(this) == l().size();
    }

    @p4.l
    @u3.h(name = "name")
    public final String s() {
        return t().utf8();
    }

    @p4.l
    @u3.h(name = "nameBytes")
    public final n t() {
        int d5 = okio.internal.d.d(this);
        if (d5 != -1) {
            return n.substring$default(l(), d5 + 1, 0, 2, null);
        }
        if (I() != null && l().size() == 2) {
            return n.EMPTY;
        }
        return l();
    }

    @p4.l
    public String toString() {
        return l().utf8();
    }

    @p4.l
    public final d1 u() {
        return f20879b.d(toString(), true);
    }

    @u3.h(name = "parent")
    @p4.m
    public final d1 v() {
        d1 d1Var;
        if (kotlin.jvm.internal.l0.g(l(), okio.internal.d.b()) || kotlin.jvm.internal.l0.g(l(), okio.internal.d.e()) || kotlin.jvm.internal.l0.g(l(), okio.internal.d.a()) || okio.internal.d.g(this)) {
            return null;
        }
        int d5 = okio.internal.d.d(this);
        if (d5 == 2 && I() != null) {
            if (l().size() == 3) {
                return null;
            }
            d1Var = new d1(n.substring$default(l(), 0, 3, 1, null));
        } else {
            if (d5 == 1 && l().startsWith(okio.internal.d.a())) {
                return null;
            }
            if (d5 == -1 && I() != null) {
                if (l().size() == 2) {
                    return null;
                }
                d1Var = new d1(n.substring$default(l(), 0, 2, 1, null));
            } else {
                if (d5 == -1) {
                    return new d1(okio.internal.d.b());
                }
                if (d5 == 0) {
                    d1Var = new d1(n.substring$default(l(), 0, 1, 1, null));
                } else {
                    return new d1(n.substring$default(l(), 0, d5, 1, null));
                }
            }
        }
        return d1Var;
    }

    @p4.l
    public final d1 w(@p4.l d1 other) {
        kotlin.jvm.internal.l0.p(other, "other");
        if (kotlin.jvm.internal.l0.g(m(), other.m())) {
            List<n> o5 = o();
            List<n> o6 = other.o();
            int min = Math.min(o5.size(), o6.size());
            int i5 = 0;
            while (i5 < min && kotlin.jvm.internal.l0.g(o5.get(i5), o6.get(i5))) {
                i5++;
            }
            boolean z4 = true;
            if (i5 == min && l().size() == other.l().size()) {
                return a.h(f20879b, ".", false, 1, null);
            }
            if (o6.subList(i5, o6.size()).indexOf(okio.internal.d.c()) != -1) {
                z4 = false;
            }
            if (z4) {
                l lVar = new l();
                n f5 = okio.internal.d.f(other);
                if (f5 == null && (f5 = okio.internal.d.f(this)) == null) {
                    f5 = okio.internal.d.i(f20880c);
                }
                int size = o6.size();
                for (int i6 = i5; i6 < size; i6++) {
                    lVar.v0(okio.internal.d.c());
                    lVar.v0(f5);
                }
                int size2 = o5.size();
                while (i5 < size2) {
                    lVar.v0(o5.get(i5));
                    lVar.v0(f5);
                    i5++;
                }
                return okio.internal.d.O(lVar, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + other).toString());
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + other).toString());
    }

    @p4.l
    @u3.h(name = "resolve")
    public final d1 x(@p4.l String child) {
        kotlin.jvm.internal.l0.p(child, "child");
        return okio.internal.d.x(this, okio.internal.d.O(new l().C(child), false), false);
    }

    @p4.l
    public final d1 y(@p4.l String child, boolean z4) {
        kotlin.jvm.internal.l0.p(child, "child");
        return okio.internal.d.x(this, okio.internal.d.O(new l().C(child), false), z4);
    }

    @p4.l
    @u3.h(name = "resolve")
    public final d1 z(@p4.l n child) {
        kotlin.jvm.internal.l0.p(child, "child");
        return okio.internal.d.x(this, okio.internal.d.O(new l().v0(child), false), false);
    }
}
