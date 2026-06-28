package okio.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.b0;
import kotlin.collections.e0;
import kotlin.collections.x;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import okio.d1;
import okio.n;

@i0(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u0005\n\u0000\u001a\u0015\u0010\u0014\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0080\b\u001a\u0017\u0010\u0016\u001a\u00020\u0017*\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0018H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\r*\u00020\u000eH\u0080\b\u001a\r\u0010\u001a\u001a\u00020\u0017*\u00020\u000eH\u0080\b\u001a\r\u0010\u001b\u001a\u00020\u0017*\u00020\u000eH\u0080\b\u001a\r\u0010\u001c\u001a\u00020\u0017*\u00020\u000eH\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u000eH\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u0001*\u00020\u000eH\u0080\b\u001a\r\u0010 \u001a\u00020\u000e*\u00020\u000eH\u0080\b\u001a\u000f\u0010!\u001a\u0004\u0018\u00010\u000e*\u00020\u000eH\u0080\b\u001a\u0015\u0010\"\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0080\b\u001a\u001d\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\u0017H\u0080\b\u001a\u001d\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020&2\u0006\u0010%\u001a\u00020\u0017H\u0080\b\u001a\u001d\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0017H\u0080\b\u001a\u001c\u0010#\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u0017H\u0000\u001a\u000f\u0010'\u001a\u0004\u0018\u00010\u000e*\u00020\u000eH\u0080\b\u001a\u0013\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001e0)*\u00020\u000eH\u0080\b\u001a\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00010)*\u00020\u000eH\u0080\b\u001a\u0014\u0010+\u001a\u00020\u000e*\u00020\u001e2\u0006\u0010%\u001a\u00020\u0017H\u0000\u001a\r\u0010,\u001a\u00020\u001e*\u00020\u000eH\u0080\b\u001a\u0014\u0010-\u001a\u0004\u0018\u00010.*\u00020\u000eH\u0080\b¢\u0006\u0002\u0010/\u001a\f\u00100\u001a\u00020\u0017*\u00020\u000eH\u0002\u001a\f\u00101\u001a\u00020\r*\u00020\u000eH\u0002\u001a\u0014\u00102\u001a\u00020\u0017*\u00020&2\u0006\u0010\u0011\u001a\u00020\u0001H\u0002\u001a\u0014\u00103\u001a\u00020\u000e*\u00020&2\u0006\u0010%\u001a\u00020\u0017H\u0000\u001a\f\u00104\u001a\u00020\u0001*\u000205H\u0002\u001a\f\u00104\u001a\u00020\u0001*\u00020\u001eH\u0002\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0016\u0010\b\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003\"\u0016\u0010\n\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003\"\u0018\u0010\f\u001a\u00020\r*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u00066"}, d2 = {"ANY_SLASH", "Lokio/ByteString;", "getANY_SLASH$annotations", "()V", "BACKSLASH", "getBACKSLASH$annotations", "DOT", "getDOT$annotations", "DOT_DOT", "getDOT_DOT$annotations", "SLASH", "getSLASH$annotations", "indexOfLastSlash", "", "Lokio/Path;", "getIndexOfLastSlash", "(Lokio/Path;)I", "slash", "getSlash", "(Lokio/Path;)Lokio/ByteString;", "commonCompareTo", "other", "commonEquals", "", "", "commonHashCode", "commonIsAbsolute", "commonIsRelative", "commonIsRoot", "commonName", "", "commonNameBytes", "commonNormalized", "commonParent", "commonRelativeTo", "commonResolve", "child", "normalize", "Lokio/Buffer;", "commonRoot", "commonSegments", "", "commonSegmentsBytes", "commonToPath", "commonToString", "commonVolumeLetter", "", "(Lokio/Path;)Ljava/lang/Character;", "lastSegmentIsDotDot", "rootLength", "startsWithVolumeLetterAndColon", "toPath", "toSlash", "", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@u3.h(name = "-Path")
@r1({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nokio/internal/-Path\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,406:1\n59#1,22:407\n209#1:433\n209#1:434\n1549#2:429\n1620#2,3:430\n*S KotlinDebug\n*F\n+ 1 Path.kt\nokio/internal/-Path\n*L\n53#1:407,22\n199#1:433\n204#1:434\n53#1:429\n53#1:430,3\n*E\n"})
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a */
    @p4.l
    private static final n f20940a;

    /* renamed from: b */
    @p4.l
    private static final n f20941b;

    /* renamed from: c */
    @p4.l
    private static final n f20942c;

    /* renamed from: d */
    @p4.l
    private static final n f20943d;

    /* renamed from: e */
    @p4.l
    private static final n f20944e;

    static {
        n.a aVar = n.Companion;
        f20940a = aVar.l("/");
        f20941b = aVar.l("\\");
        f20942c = aVar.l("/\\");
        f20943d = aVar.l(".");
        f20944e = aVar.l("..");
    }

    @p4.l
    public static final List<n> A(@p4.l d1 d1Var) {
        l0.p(d1Var, "<this>");
        ArrayList arrayList = new ArrayList();
        int M = M(d1Var);
        if (M == -1) {
            M = 0;
        } else if (M < d1Var.l().size() && d1Var.l().getByte(M) == 92) {
            M++;
        }
        int size = d1Var.l().size();
        int i5 = M;
        while (M < size) {
            if (d1Var.l().getByte(M) == 47 || d1Var.l().getByte(M) == 92) {
                arrayList.add(d1Var.l().substring(i5, M));
                i5 = M + 1;
            }
            M++;
        }
        if (i5 < d1Var.l().size()) {
            arrayList.add(d1Var.l().substring(i5, d1Var.l().size()));
        }
        return arrayList;
    }

    @p4.l
    public static final d1 B(@p4.l String str, boolean z4) {
        l0.p(str, "<this>");
        return O(new okio.l().C(str), z4);
    }

    @p4.l
    public static final String C(@p4.l d1 d1Var) {
        l0.p(d1Var, "<this>");
        return d1Var.l().utf8();
    }

    @p4.m
    public static final Character D(@p4.l d1 d1Var) {
        boolean z4;
        l0.p(d1Var, "<this>");
        boolean z5 = false;
        if (n.indexOf$default(d1Var.l(), f20940a, 0, 2, (Object) null) != -1 || d1Var.l().size() < 2 || d1Var.l().getByte(1) != 58) {
            return null;
        }
        char c5 = (char) d1Var.l().getByte(0);
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

    private static /* synthetic */ void E() {
    }

    private static /* synthetic */ void F() {
    }

    private static /* synthetic */ void G() {
    }

    private static /* synthetic */ void H() {
    }

    public static final int I(d1 d1Var) {
        int lastIndexOf$default = n.lastIndexOf$default(d1Var.l(), f20940a, 0, 2, (Object) null);
        if (lastIndexOf$default != -1) {
            return lastIndexOf$default;
        }
        return n.lastIndexOf$default(d1Var.l(), f20941b, 0, 2, (Object) null);
    }

    private static /* synthetic */ void J() {
    }

    public static final n K(d1 d1Var) {
        n l5 = d1Var.l();
        n nVar = f20940a;
        if (n.indexOf$default(l5, nVar, 0, 2, (Object) null) == -1) {
            n l6 = d1Var.l();
            n nVar2 = f20941b;
            if (n.indexOf$default(l6, nVar2, 0, 2, (Object) null) == -1) {
                return null;
            }
            return nVar2;
        }
        return nVar;
    }

    public static final boolean L(d1 d1Var) {
        if (!d1Var.l().endsWith(f20944e) || (d1Var.l().size() != 2 && !d1Var.l().rangeEquals(d1Var.l().size() - 3, f20940a, 0, 1) && !d1Var.l().rangeEquals(d1Var.l().size() - 3, f20941b, 0, 1))) {
            return false;
        }
        return true;
    }

    public static final int M(d1 d1Var) {
        boolean z4;
        if (d1Var.l().size() == 0) {
            return -1;
        }
        boolean z5 = false;
        if (d1Var.l().getByte(0) == 47) {
            return 1;
        }
        if (d1Var.l().getByte(0) == 92) {
            if (d1Var.l().size() <= 2 || d1Var.l().getByte(1) != 92) {
                return 1;
            }
            int indexOf = d1Var.l().indexOf(f20941b, 2);
            if (indexOf == -1) {
                return d1Var.l().size();
            }
            return indexOf;
        }
        if (d1Var.l().size() <= 2 || d1Var.l().getByte(1) != 58 || d1Var.l().getByte(2) != 92) {
            return -1;
        }
        char c5 = (char) d1Var.l().getByte(0);
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
                return -1;
            }
            return 3;
        }
        return 3;
    }

    private static final boolean N(okio.l lVar, n nVar) {
        boolean z4;
        boolean z5;
        if (!l0.g(nVar, f20941b) || lVar.M0() < 2 || lVar.P(1L) != 58) {
            return false;
        }
        char P = (char) lVar.P(0L);
        if ('a' <= P && P < '{') {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            if ('A' <= P && P < '[') {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                return false;
            }
        }
        return true;
    }

    @p4.l
    public static final d1 O(@p4.l okio.l lVar, boolean z4) {
        n nVar;
        boolean z5;
        boolean z6;
        n Y;
        Object m32;
        l0.p(lVar, "<this>");
        okio.l lVar2 = new okio.l();
        n nVar2 = null;
        int i5 = 0;
        while (true) {
            if (!lVar.D(0L, f20940a)) {
                nVar = f20941b;
                if (!lVar.D(0L, nVar)) {
                    break;
                }
            }
            byte readByte = lVar.readByte();
            if (nVar2 == null) {
                nVar2 = P(readByte);
            }
            i5++;
        }
        if (i5 >= 2 && l0.g(nVar2, nVar)) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            l0.m(nVar2);
            lVar2.v0(nVar2);
            lVar2.v0(nVar2);
        } else if (i5 > 0) {
            l0.m(nVar2);
            lVar2.v0(nVar2);
        } else {
            long v4 = lVar.v(f20942c);
            if (nVar2 == null) {
                if (v4 == -1) {
                    nVar2 = Q(d1.f20880c);
                } else {
                    nVar2 = P(lVar.P(v4));
                }
            }
            if (N(lVar, nVar2)) {
                if (v4 == 2) {
                    lVar2.write(lVar, 3L);
                } else {
                    lVar2.write(lVar, 2L);
                }
            }
        }
        if (lVar2.M0() > 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        ArrayList arrayList = new ArrayList();
        while (!lVar.e0()) {
            long v5 = lVar.v(f20942c);
            if (v5 == -1) {
                Y = lVar.m0();
            } else {
                Y = lVar.Y(v5);
                lVar.readByte();
            }
            n nVar3 = f20944e;
            if (l0.g(Y, nVar3)) {
                if (!z6 || !arrayList.isEmpty()) {
                    if (z4) {
                        if (!z6) {
                            if (!arrayList.isEmpty()) {
                                m32 = e0.m3(arrayList);
                                if (l0.g(m32, nVar3)) {
                                }
                            }
                        }
                        if (!z5 || arrayList.size() != 1) {
                            b0.M0(arrayList);
                        }
                    }
                    arrayList.add(Y);
                }
            } else if (!l0.g(Y, f20943d) && !l0.g(Y, n.EMPTY)) {
                arrayList.add(Y);
            }
        }
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            if (i6 > 0) {
                lVar2.v0(nVar2);
            }
            lVar2.v0((n) arrayList.get(i6));
        }
        if (lVar2.M0() == 0) {
            lVar2.v0(f20943d);
        }
        return new d1(lVar2.m0());
    }

    private static final n P(byte b5) {
        if (b5 != 47) {
            if (b5 == 92) {
                return f20941b;
            }
            throw new IllegalArgumentException("not a directory separator: " + ((int) b5));
        }
        return f20940a;
    }

    public static final n Q(String str) {
        if (l0.g(str, "/")) {
            return f20940a;
        }
        if (l0.g(str, "\\")) {
            return f20941b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }

    public static final int j(@p4.l d1 d1Var, @p4.l d1 other) {
        l0.p(d1Var, "<this>");
        l0.p(other, "other");
        return d1Var.l().compareTo(other.l());
    }

    public static final boolean k(@p4.l d1 d1Var, @p4.m Object obj) {
        l0.p(d1Var, "<this>");
        if ((obj instanceof d1) && l0.g(((d1) obj).l(), d1Var.l())) {
            return true;
        }
        return false;
    }

    public static final int l(@p4.l d1 d1Var) {
        l0.p(d1Var, "<this>");
        return d1Var.l().hashCode();
    }

    public static final boolean m(@p4.l d1 d1Var) {
        l0.p(d1Var, "<this>");
        if (M(d1Var) != -1) {
            return true;
        }
        return false;
    }

    public static final boolean n(@p4.l d1 d1Var) {
        l0.p(d1Var, "<this>");
        if (M(d1Var) == -1) {
            return true;
        }
        return false;
    }

    public static final boolean o(@p4.l d1 d1Var) {
        l0.p(d1Var, "<this>");
        if (M(d1Var) == d1Var.l().size()) {
            return true;
        }
        return false;
    }

    @p4.l
    public static final String p(@p4.l d1 d1Var) {
        l0.p(d1Var, "<this>");
        return d1Var.t().utf8();
    }

    @p4.l
    public static final n q(@p4.l d1 d1Var) {
        l0.p(d1Var, "<this>");
        int I = I(d1Var);
        if (I != -1) {
            return n.substring$default(d1Var.l(), I + 1, 0, 2, null);
        }
        if (d1Var.I() != null && d1Var.l().size() == 2) {
            return n.EMPTY;
        }
        return d1Var.l();
    }

    @p4.l
    public static final d1 r(@p4.l d1 d1Var) {
        l0.p(d1Var, "<this>");
        return d1.f20879b.d(d1Var.toString(), true);
    }

    @p4.m
    public static final d1 s(@p4.l d1 d1Var) {
        l0.p(d1Var, "<this>");
        if (l0.g(d1Var.l(), f20943d) || l0.g(d1Var.l(), f20940a) || l0.g(d1Var.l(), f20941b) || L(d1Var)) {
            return null;
        }
        int I = I(d1Var);
        if (I == 2 && d1Var.I() != null) {
            if (d1Var.l().size() == 3) {
                return null;
            }
            return new d1(n.substring$default(d1Var.l(), 0, 3, 1, null));
        }
        if (I == 1 && d1Var.l().startsWith(f20941b)) {
            return null;
        }
        if (I == -1 && d1Var.I() != null) {
            if (d1Var.l().size() == 2) {
                return null;
            }
            return new d1(n.substring$default(d1Var.l(), 0, 2, 1, null));
        }
        if (I == -1) {
            return new d1(f20943d);
        }
        if (I == 0) {
            return new d1(n.substring$default(d1Var.l(), 0, 1, 1, null));
        }
        return new d1(n.substring$default(d1Var.l(), 0, I, 1, null));
    }

    @p4.l
    public static final d1 t(@p4.l d1 d1Var, @p4.l d1 other) {
        l0.p(d1Var, "<this>");
        l0.p(other, "other");
        if (l0.g(d1Var.m(), other.m())) {
            List<n> o5 = d1Var.o();
            List<n> o6 = other.o();
            int min = Math.min(o5.size(), o6.size());
            int i5 = 0;
            while (i5 < min && l0.g(o5.get(i5), o6.get(i5))) {
                i5++;
            }
            boolean z4 = true;
            if (i5 == min && d1Var.l().size() == other.l().size()) {
                return d1.a.h(d1.f20879b, ".", false, 1, null);
            }
            if (o6.subList(i5, o6.size()).indexOf(f20944e) != -1) {
                z4 = false;
            }
            if (z4) {
                okio.l lVar = new okio.l();
                n K = K(other);
                if (K == null && (K = K(d1Var)) == null) {
                    K = Q(d1.f20880c);
                }
                int size = o6.size();
                for (int i6 = i5; i6 < size; i6++) {
                    lVar.v0(f20944e);
                    lVar.v0(K);
                }
                int size2 = o5.size();
                while (i5 < size2) {
                    lVar.v0(o5.get(i5));
                    lVar.v0(K);
                    i5++;
                }
                return O(lVar, false);
            }
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + d1Var + " and " + other).toString());
        }
        throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + d1Var + " and " + other).toString());
    }

    @p4.l
    public static final d1 u(@p4.l d1 d1Var, @p4.l String child, boolean z4) {
        l0.p(d1Var, "<this>");
        l0.p(child, "child");
        return x(d1Var, O(new okio.l().C(child), false), z4);
    }

    @p4.l
    public static final d1 v(@p4.l d1 d1Var, @p4.l okio.l child, boolean z4) {
        l0.p(d1Var, "<this>");
        l0.p(child, "child");
        return x(d1Var, O(child, false), z4);
    }

    @p4.l
    public static final d1 w(@p4.l d1 d1Var, @p4.l n child, boolean z4) {
        l0.p(d1Var, "<this>");
        l0.p(child, "child");
        return x(d1Var, O(new okio.l().v0(child), false), z4);
    }

    @p4.l
    public static final d1 x(@p4.l d1 d1Var, @p4.l d1 child, boolean z4) {
        l0.p(d1Var, "<this>");
        l0.p(child, "child");
        if (!child.p() && child.I() == null) {
            n K = K(d1Var);
            if (K == null && (K = K(child)) == null) {
                K = Q(d1.f20880c);
            }
            okio.l lVar = new okio.l();
            lVar.v0(d1Var.l());
            if (lVar.M0() > 0) {
                lVar.v0(K);
            }
            lVar.v0(child.l());
            return O(lVar, z4);
        }
        return child;
    }

    @p4.m
    public static final d1 y(@p4.l d1 d1Var) {
        l0.p(d1Var, "<this>");
        int M = M(d1Var);
        if (M == -1) {
            return null;
        }
        return new d1(d1Var.l().substring(0, M));
    }

    @p4.l
    public static final List<String> z(@p4.l d1 d1Var) {
        int Y;
        l0.p(d1Var, "<this>");
        ArrayList arrayList = new ArrayList();
        int M = M(d1Var);
        if (M == -1) {
            M = 0;
        } else if (M < d1Var.l().size() && d1Var.l().getByte(M) == 92) {
            M++;
        }
        int size = d1Var.l().size();
        int i5 = M;
        while (M < size) {
            if (d1Var.l().getByte(M) == 47 || d1Var.l().getByte(M) == 92) {
                arrayList.add(d1Var.l().substring(i5, M));
                i5 = M + 1;
            }
            M++;
        }
        if (i5 < d1Var.l().size()) {
            arrayList.add(d1Var.l().substring(i5, d1Var.l().size()));
        }
        Y = x.Y(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(Y);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((n) it.next()).utf8());
        }
        return arrayList2;
    }
}
