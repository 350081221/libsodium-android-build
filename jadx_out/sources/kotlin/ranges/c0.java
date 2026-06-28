package kotlin.ranges;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.NoSuchElementException;
import kotlin.c2;
import kotlin.g1;
import kotlin.g2;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.m2;
import kotlin.ranges.v;
import kotlin.ranges.y;
import kotlin.v2;
import kotlin.y1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\n\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u0000\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001e\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0007\u001a\u001e\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\n\u001a\u001e\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\r\u001a&\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a&\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a$\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a&\u0010\u0014\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a$\u0010\u0014\u001a\u00020\b*\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a&\u0010\u0014\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0087\nø\u0001\u0000¢\u0006\u0002\b*\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0005H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\b\u0010)\u001a\u0004\u0018\u00010\bH\u0087\nø\u0001\u0000¢\u0006\u0002\b4\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a\u001f\u00107\u001a\u000208*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\u001f\u00107\u001a\u000208*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u001f\u00107\u001a\u00020>*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\u001f\u00107\u001a\u000208*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001a\u0014\u0010C\u001a\u00020\u0005*\u000208H\u0007ø\u0001\u0000¢\u0006\u0002\u0010D\u001a\u0014\u0010C\u001a\u00020\b*\u00020>H\u0007ø\u0001\u0000¢\u0006\u0002\u0010E\u001a\u0011\u0010F\u001a\u0004\u0018\u00010\u0005*\u000208H\u0007ø\u0001\u0000\u001a\u0011\u0010F\u001a\u0004\u0018\u00010\b*\u00020>H\u0007ø\u0001\u0000\u001a\u0014\u0010G\u001a\u00020\u0005*\u000208H\u0007ø\u0001\u0000¢\u0006\u0002\u0010D\u001a\u0014\u0010G\u001a\u00020\b*\u00020>H\u0007ø\u0001\u0000¢\u0006\u0002\u0010E\u001a\u0011\u0010H\u001a\u0004\u0018\u00010\u0005*\u000208H\u0007ø\u0001\u0000\u001a\u0011\u0010H\u001a\u0004\u0018\u00010\b*\u00020>H\u0007ø\u0001\u0000\u001a\u0015\u0010I\u001a\u00020\u0005*\u00020%H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010J\u001a\u001c\u0010I\u001a\u00020\u0005*\u00020%2\u0006\u0010I\u001a\u00020KH\u0007ø\u0001\u0000¢\u0006\u0002\u0010L\u001a\u0015\u0010I\u001a\u00020\b*\u00020/H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010M\u001a\u001c\u0010I\u001a\u00020\b*\u00020/2\u0006\u0010I\u001a\u00020KH\u0007ø\u0001\u0000¢\u0006\u0002\u0010N\u001a\u0012\u0010O\u001a\u0004\u0018\u00010\u0005*\u00020%H\u0087\bø\u0001\u0000\u001a\u0019\u0010O\u001a\u0004\u0018\u00010\u0005*\u00020%2\u0006\u0010I\u001a\u00020KH\u0007ø\u0001\u0000\u001a\u0012\u0010O\u001a\u0004\u0018\u00010\b*\u00020/H\u0087\bø\u0001\u0000\u001a\u0019\u0010O\u001a\u0004\u0018\u00010\b*\u00020/2\u0006\u0010I\u001a\u00020KH\u0007ø\u0001\u0000\u001a\f\u0010P\u001a\u000208*\u000208H\u0007\u001a\f\u0010P\u001a\u00020>*\u00020>H\u0007\u001a\u0015\u0010Q\u001a\u000208*\u0002082\u0006\u0010Q\u001a\u00020RH\u0087\u0004\u001a\u0015\u0010Q\u001a\u00020>*\u00020>2\u0006\u0010Q\u001a\u00020SH\u0087\u0004\u001a\u001f\u0010T\u001a\u00020%*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a\u001f\u0010T\u001a\u00020%*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a\u001f\u0010T\u001a\u00020/*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bY\u0010Z\u001a\u001f\u0010T\u001a\u00020%*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b[\u0010\\\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"coerceAtLeast", "Lkotlin/UByte;", "minimumValue", "coerceAtLeast-Kr8caGY", "(BB)B", "Lkotlin/UInt;", "coerceAtLeast-J1ME1BU", "(II)I", "Lkotlin/ULong;", "coerceAtLeast-eb3DHEI", "(JJ)J", "Lkotlin/UShort;", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost", "maximumValue", "coerceAtMost-Kr8caGY", "coerceAtMost-J1ME1BU", "coerceAtMost-eb3DHEI", "coerceAtMost-5PvTz6A", "coerceIn", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-WZ9TVnA", "(III)I", "range", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J", "coerceIn-VKSA0NQ", "(SSS)S", "contains", "", "Lkotlin/ranges/UIntRange;", t0.b.f22420d, "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "element", "contains-biwQdVI", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "Lkotlin/ranges/ULongRange;", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-GYNo2lE", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo", "Lkotlin/ranges/UIntProgression;", TypedValues.TransitionType.S_TO, "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ULongProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "first", "(Lkotlin/ranges/UIntProgression;)I", "(Lkotlin/ranges/ULongProgression;)J", "firstOrNull", "last", "lastOrNull", "random", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;)J", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "reversed", "step", "", "", "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ranges/URangesKt")
/* loaded from: classes4.dex */
public class c0 {
    @g1(version = "1.7")
    public static final int A(@p4.l v vVar) {
        l0.p(vVar, "<this>");
        if (!vVar.isEmpty()) {
            return vVar.e();
        }
        throw new NoSuchElementException("Progression " + vVar + " is empty.");
    }

    @g1(version = "1.7")
    public static final long B(@p4.l y yVar) {
        l0.p(yVar, "<this>");
        if (!yVar.isEmpty()) {
            return yVar.e();
        }
        throw new NoSuchElementException("Progression " + yVar + " is empty.");
    }

    @g1(version = "1.7")
    @p4.m
    public static final c2 C(@p4.l v vVar) {
        l0.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return c2.e(vVar.e());
    }

    @g1(version = "1.7")
    @p4.m
    public static final g2 D(@p4.l y yVar) {
        l0.p(yVar, "<this>");
        if (yVar.isEmpty()) {
            return null;
        }
        return g2.e(yVar.e());
    }

    @g1(version = "1.7")
    public static final int E(@p4.l v vVar) {
        l0.p(vVar, "<this>");
        if (!vVar.isEmpty()) {
            return vVar.g();
        }
        throw new NoSuchElementException("Progression " + vVar + " is empty.");
    }

    @g1(version = "1.7")
    public static final long F(@p4.l y yVar) {
        l0.p(yVar, "<this>");
        if (!yVar.isEmpty()) {
            return yVar.g();
        }
        throw new NoSuchElementException("Progression " + yVar + " is empty.");
    }

    @g1(version = "1.7")
    @p4.m
    public static final c2 G(@p4.l v vVar) {
        l0.p(vVar, "<this>");
        if (vVar.isEmpty()) {
            return null;
        }
        return c2.e(vVar.g());
    }

    @g1(version = "1.7")
    @p4.m
    public static final g2 H(@p4.l y yVar) {
        l0.p(yVar, "<this>");
        if (yVar.isEmpty()) {
            return null;
        }
        return g2.e(yVar.g());
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.t.class})
    private static final int I(x xVar) {
        l0.p(xVar, "<this>");
        return J(xVar, kotlin.random.f.Default);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final int J(@p4.l x xVar, @p4.l kotlin.random.f random) {
        l0.p(xVar, "<this>");
        l0.p(random, "random");
        try {
            return kotlin.random.h.h(random, xVar);
        } catch (IllegalArgumentException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.t.class})
    private static final long K(a0 a0Var) {
        l0.p(a0Var, "<this>");
        return L(a0Var, kotlin.random.f.Default);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final long L(@p4.l a0 a0Var, @p4.l kotlin.random.f random) {
        l0.p(a0Var, "<this>");
        l0.p(random, "random");
        try {
            return kotlin.random.h.l(random, a0Var);
        } catch (IllegalArgumentException e5) {
            throw new NoSuchElementException(e5.getMessage());
        }
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class, kotlin.t.class})
    private static final c2 M(x xVar) {
        l0.p(xVar, "<this>");
        return N(xVar, kotlin.random.f.Default);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.r.class, kotlin.t.class})
    @p4.m
    public static final c2 N(@p4.l x xVar, @p4.l kotlin.random.f random) {
        l0.p(xVar, "<this>");
        l0.p(random, "random");
        if (xVar.isEmpty()) {
            return null;
        }
        return c2.e(kotlin.random.h.h(random, xVar));
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.r.class, kotlin.t.class})
    private static final g2 O(a0 a0Var) {
        l0.p(a0Var, "<this>");
        return P(a0Var, kotlin.random.f.Default);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.r.class, kotlin.t.class})
    @p4.m
    public static final g2 P(@p4.l a0 a0Var, @p4.l kotlin.random.f random) {
        l0.p(a0Var, "<this>");
        l0.p(random, "random");
        if (a0Var.isEmpty()) {
            return null;
        }
        return g2.e(kotlin.random.h.l(random, a0Var));
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final v Q(@p4.l v vVar) {
        l0.p(vVar, "<this>");
        return v.f19568d.a(vVar.g(), vVar.e(), -vVar.i());
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final y R(@p4.l y yVar) {
        l0.p(yVar, "<this>");
        return y.f19578d.a(yVar.g(), yVar.e(), -yVar.i());
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final v S(@p4.l v vVar, int i5) {
        boolean z4;
        l0.p(vVar, "<this>");
        if (i5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        t.a(z4, Integer.valueOf(i5));
        v.a aVar = v.f19568d;
        int e5 = vVar.e();
        int g5 = vVar.g();
        if (vVar.i() <= 0) {
            i5 = -i5;
        }
        return aVar.a(e5, g5, i5);
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final y T(@p4.l y yVar, long j5) {
        boolean z4;
        l0.p(yVar, "<this>");
        if (j5 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        t.a(z4, Long.valueOf(j5));
        y.a aVar = y.f19578d;
        long e5 = yVar.e();
        long g5 = yVar.g();
        if (yVar.i() <= 0) {
            j5 = -j5;
        }
        return aVar.a(e5, g5, j5);
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final x U(short s5, short s6) {
        if (l0.t(s6 & m2.f19496d, 0) <= 0) {
            return x.f19576e.a();
        }
        return new x(c2.l(s5 & m2.f19496d), c2.l(c2.l(r3) - 1), null);
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static x V(int i5, int i6) {
        int compare;
        compare = Integer.compare(i6 ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            return x.f19576e.a();
        }
        return new x(i5, c2.l(i6 - 1), null);
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final x W(byte b5, byte b6) {
        if (l0.t(b6 & y1.f19838d, 0) <= 0) {
            return x.f19576e.a();
        }
        return new x(c2.l(b5 & y1.f19838d), c2.l(c2.l(r3) - 1), null);
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static a0 X(long j5, long j6) {
        int compare;
        compare = Long.compare(j6 ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            return a0.f19528e.a();
        }
        return new a0(j5, g2.l(j6 - g2.l(1 & 4294967295L)), null);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final short a(short s5, short s6) {
        return l0.t(s5 & m2.f19496d, 65535 & s6) < 0 ? s6 : s5;
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final int b(int i5, int i6) {
        int compare;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
        return compare < 0 ? i6 : i5;
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final byte c(byte b5, byte b6) {
        return l0.t(b5 & y1.f19838d, b6 & y1.f19838d) < 0 ? b6 : b5;
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final long d(long j5, long j6) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
        return compare < 0 ? j6 : j5;
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final short e(short s5, short s6) {
        return l0.t(s5 & m2.f19496d, 65535 & s6) > 0 ? s6 : s5;
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final int f(int i5, int i6) {
        int compare;
        compare = Integer.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
        return compare > 0 ? i6 : i5;
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final byte g(byte b5, byte b6) {
        return l0.t(b5 & y1.f19838d, b6 & y1.f19838d) > 0 ? b6 : b5;
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final long h(long j5, long j6) {
        int compare;
        compare = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
        return compare > 0 ? j6 : j5;
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final long i(long j5, @p4.l g<g2> range) {
        int compare;
        int compare2;
        Comparable N;
        l0.p(range, "range");
        if (range instanceof f) {
            N = u.N(g2.e(j5), (f) range);
            return ((g2) N).l0();
        }
        if (!range.isEmpty()) {
            compare = Long.compare(j5 ^ Long.MIN_VALUE, range.getStart().l0() ^ Long.MIN_VALUE);
            if (compare < 0) {
                return range.getStart().l0();
            }
            compare2 = Long.compare(j5 ^ Long.MIN_VALUE, range.getEndInclusive().l0() ^ Long.MIN_VALUE);
            if (compare2 > 0) {
                return range.getEndInclusive().l0();
            }
            return j5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + external.org.apache.commons.lang3.d.f15957a);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final short j(short s5, short s6, short s7) {
        int i5 = s6 & m2.f19496d;
        int i6 = s7 & m2.f19496d;
        if (l0.t(i5, i6) <= 0) {
            int i7 = 65535 & s5;
            if (l0.t(i7, i5) < 0) {
                return s6;
            }
            if (l0.t(i7, i6) > 0) {
                return s7;
            }
            return s5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) m2.e0(s7)) + " is less than minimum " + ((Object) m2.e0(s6)) + external.org.apache.commons.lang3.d.f15957a);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final int k(int i5, int i6, int i7) {
        int compare;
        int compare2;
        int compare3;
        compare = Integer.compare(i6 ^ Integer.MIN_VALUE, i7 ^ Integer.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Integer.compare(i5 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE);
            if (compare2 < 0) {
                return i6;
            }
            compare3 = Integer.compare(i5 ^ Integer.MIN_VALUE, i7 ^ Integer.MIN_VALUE);
            if (compare3 > 0) {
                return i7;
            }
            return i5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) c2.g0(i7)) + " is less than minimum " + ((Object) c2.g0(i6)) + external.org.apache.commons.lang3.d.f15957a);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final byte l(byte b5, byte b6, byte b7) {
        int i5 = b6 & y1.f19838d;
        int i6 = b7 & y1.f19838d;
        if (l0.t(i5, i6) <= 0) {
            int i7 = b5 & y1.f19838d;
            if (l0.t(i7, i5) < 0) {
                return b6;
            }
            if (l0.t(i7, i6) > 0) {
                return b7;
            }
            return b5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) y1.e0(b7)) + " is less than minimum " + ((Object) y1.e0(b6)) + external.org.apache.commons.lang3.d.f15957a);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final long m(long j5, long j6, long j7) {
        int compare;
        int compare2;
        int compare3;
        compare = Long.compare(j6 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE);
        if (compare <= 0) {
            compare2 = Long.compare(j5 ^ Long.MIN_VALUE, j6 ^ Long.MIN_VALUE);
            if (compare2 < 0) {
                return j6;
            }
            compare3 = Long.compare(j5 ^ Long.MIN_VALUE, j7 ^ Long.MIN_VALUE);
            if (compare3 > 0) {
                return j7;
            }
            return j5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((Object) g2.g0(j7)) + " is less than minimum " + ((Object) g2.g0(j6)) + external.org.apache.commons.lang3.d.f15957a);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final int n(int i5, @p4.l g<c2> range) {
        int compare;
        int compare2;
        Comparable N;
        l0.p(range, "range");
        if (range instanceof f) {
            N = u.N(c2.e(i5), (f) range);
            return ((c2) N).l0();
        }
        if (!range.isEmpty()) {
            compare = Integer.compare(i5 ^ Integer.MIN_VALUE, range.getStart().l0() ^ Integer.MIN_VALUE);
            if (compare < 0) {
                return range.getStart().l0();
            }
            compare2 = Integer.compare(i5 ^ Integer.MIN_VALUE, range.getEndInclusive().l0() ^ Integer.MIN_VALUE);
            if (compare2 > 0) {
                return range.getEndInclusive().l0();
            }
            return i5;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + external.org.apache.commons.lang3.d.f15957a);
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final boolean o(@p4.l x contains, byte b5) {
        l0.p(contains, "$this$contains");
        return contains.k(c2.l(b5 & y1.f19838d));
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.t.class})
    private static final boolean p(a0 contains, g2 g2Var) {
        l0.p(contains, "$this$contains");
        if (g2Var != null && contains.k(g2Var.l0())) {
            return true;
        }
        return false;
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final boolean q(@p4.l a0 contains, int i5) {
        l0.p(contains, "$this$contains");
        return contains.k(g2.l(i5 & 4294967295L));
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final boolean r(@p4.l a0 contains, byte b5) {
        l0.p(contains, "$this$contains");
        return contains.k(g2.l(b5 & 255));
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final boolean s(@p4.l x contains, short s5) {
        l0.p(contains, "$this$contains");
        return contains.k(c2.l(s5 & m2.f19496d));
    }

    @g1(version = "1.5")
    @kotlin.internal.f
    @v2(markerClass = {kotlin.t.class})
    private static final boolean t(x contains, c2 c2Var) {
        l0.p(contains, "$this$contains");
        if (c2Var != null && contains.k(c2Var.l0())) {
            return true;
        }
        return false;
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final boolean u(@p4.l x contains, long j5) {
        l0.p(contains, "$this$contains");
        if (g2.l(j5 >>> 32) == 0 && contains.k(c2.l((int) j5))) {
            return true;
        }
        return false;
    }

    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final boolean v(@p4.l a0 contains, short s5) {
        l0.p(contains, "$this$contains");
        return contains.k(g2.l(s5 & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final v w(short s5, short s6) {
        return v.f19568d.a(c2.l(s5 & m2.f19496d), c2.l(s6 & m2.f19496d), -1);
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final v x(int i5, int i6) {
        return v.f19568d.a(i5, i6, -1);
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final v y(byte b5, byte b6) {
        return v.f19568d.a(c2.l(b5 & y1.f19838d), c2.l(b6 & y1.f19838d), -1);
    }

    @p4.l
    @g1(version = "1.5")
    @v2(markerClass = {kotlin.t.class})
    public static final y z(long j5, long j6) {
        return y.f19578d.a(j5, j6, -1L);
    }
}
