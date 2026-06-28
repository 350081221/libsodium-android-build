package com.zzhoujay.markdown.parser;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import android.util.SparseArray;
import com.zzhoujay.markdown.parser.c;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public class j implements i {
    private static final Matcher A;
    private static final Matcher B;
    private static final Matcher C;
    private static final Matcher D;
    private static final Matcher E;
    private static final Matcher F;
    private static final Matcher G;
    private static final Matcher H;
    private static final Matcher I;
    private static final SparseArray<Matcher> J;

    /* renamed from: e, reason: collision with root package name */
    private static final Matcher f15432e;

    /* renamed from: f, reason: collision with root package name */
    private static final Matcher f15433f;

    /* renamed from: g, reason: collision with root package name */
    private static final Matcher f15434g;

    /* renamed from: h, reason: collision with root package name */
    private static final Matcher f15435h;

    /* renamed from: i, reason: collision with root package name */
    private static final Matcher f15436i;

    /* renamed from: j, reason: collision with root package name */
    private static final Matcher f15437j;

    /* renamed from: k, reason: collision with root package name */
    private static final Matcher f15438k;

    /* renamed from: l, reason: collision with root package name */
    private static final Matcher f15439l;

    /* renamed from: m, reason: collision with root package name */
    private static final Matcher f15440m;

    /* renamed from: n, reason: collision with root package name */
    private static final Matcher f15441n;

    /* renamed from: o, reason: collision with root package name */
    private static final Matcher f15442o;

    /* renamed from: p, reason: collision with root package name */
    private static final Matcher f15443p;

    /* renamed from: q, reason: collision with root package name */
    private static final Matcher f15444q;

    /* renamed from: r, reason: collision with root package name */
    private static final Matcher f15445r;

    /* renamed from: s, reason: collision with root package name */
    private static final Matcher f15446s;

    /* renamed from: t, reason: collision with root package name */
    private static final Matcher f15447t;

    /* renamed from: u, reason: collision with root package name */
    private static final Matcher f15448u;

    /* renamed from: v, reason: collision with root package name */
    private static final Matcher f15449v;

    /* renamed from: w, reason: collision with root package name */
    private static final Matcher f15450w;

    /* renamed from: x, reason: collision with root package name */
    private static final Matcher f15451x;

    /* renamed from: y, reason: collision with root package name */
    private static final Matcher f15452y;

    /* renamed from: z, reason: collision with root package name */
    private static final Matcher f15453z;

    /* renamed from: a, reason: collision with root package name */
    private d f15454a;

    /* renamed from: b, reason: collision with root package name */
    private c.a f15455b;

    /* renamed from: d, reason: collision with root package name */
    private HashMap<String, Pair<String, String>> f15457d = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private HashMap<String, Pair<String, String>> f15456c = new HashMap<>();

    static {
        Matcher matcher = Pattern.compile("^\\s*=+\\s*$").matcher("");
        f15432e = matcher;
        Matcher matcher2 = Pattern.compile("^\\s*-+\\s*$").matcher("");
        f15433f = matcher2;
        Matcher matcher3 = Pattern.compile("^\\s*#{1,6}\\s*([^#]*)(\\s*#)?").matcher("");
        f15434g = matcher3;
        Matcher matcher4 = Pattern.compile("^\\s*#\\s*([^#]*)(\\s*#)?").matcher("");
        f15435h = matcher4;
        Matcher matcher5 = Pattern.compile("^\\s*#{2}\\s*([^#]*)(\\s*#)?").matcher("");
        f15436i = matcher5;
        Matcher matcher6 = Pattern.compile("^\\s*#{3}\\s*([^#]*)(\\s*#)?").matcher("");
        f15437j = matcher6;
        Matcher matcher7 = Pattern.compile("^\\s*#{4}\\s*([^#]*)(\\s*#)?").matcher("");
        f15438k = matcher7;
        Matcher matcher8 = Pattern.compile("^\\s*#{5}\\s*([^#]*)(\\s*#)?").matcher("");
        f15439l = matcher8;
        Matcher matcher9 = Pattern.compile("^\\s*#{6}\\s*([^#]*)(\\s*#)?").matcher("");
        f15440m = matcher9;
        Matcher matcher10 = Pattern.compile("^\\s{0,3}>\\s(.*)").matcher("");
        f15441n = matcher10;
        Matcher matcher11 = Pattern.compile("^\\s*[*+-]\\s+(.*)").matcher("");
        f15442o = matcher11;
        Matcher matcher12 = Pattern.compile("^\\s*\\d+\\.\\s+(.*)").matcher("");
        f15443p = matcher12;
        Matcher matcher13 = Pattern.compile("[^*_]*(([*_])([^*_].*?)\\2)").matcher("");
        f15444q = matcher13;
        Matcher matcher14 = Pattern.compile("[^*_]*(([*_])\\2([^*_].*?)\\2\\2)").matcher("");
        f15445r = matcher14;
        Matcher matcher15 = Pattern.compile("[^*_]*(([*_])\\2\\2([^*_].*?)\\2\\2\\2)").matcher("");
        f15446s = matcher15;
        Matcher matcher16 = Pattern.compile("[^~]*((~{2,4})([^~].*?)\\2)").matcher("");
        f15447t = matcher16;
        Matcher matcher17 = Pattern.compile("[^`]*((`+)([^`].*?)\\2)").matcher("");
        f15448u = matcher17;
        Matcher matcher18 = Pattern.compile(".*?(\\[\\s*(.*?)\\s*]\\(\\s*(\\S*?)(\\s+(['\"])(.*?)\\5)?\\s*?\\))").matcher("");
        f15449v = matcher18;
        Matcher matcher19 = Pattern.compile(".*?(!\\[\\s*(.*?)\\s*]\\(\\s*(\\S*?)(\\s+(['\"])(.*?)\\5)?\\s*?\\))").matcher("");
        f15450w = matcher19;
        Matcher matcher20 = Pattern.compile(".*?(\\[\\s*(.*?)\\s*]\\s*\\[\\s*(.*?)\\s*])").matcher("");
        f15451x = matcher20;
        Matcher matcher21 = Pattern.compile("^\\s*\\[\\s*(.*?)\\s*]:\\s*(\\S+?)(\\s+(['\"])(.*?)\\4)?\\s*$").matcher("");
        f15452y = matcher21;
        Matcher matcher22 = Pattern.compile(".*?(!\\[\\s*(.*?)\\s*]\\s*\\[\\s*(.*?)\\s*])").matcher("");
        f15453z = matcher22;
        Matcher matcher23 = Pattern.compile("^\\s*!\\[\\s*(.*?)\\s*]:\\s*(\\S+?)(\\s+(['\"])(.*?)\\4)?\\s*$").matcher("");
        A = matcher23;
        Matcher matcher24 = Pattern.compile(".*?(<(\\S+@\\S+\\.\\S+)>).*?").matcher("");
        B = matcher24;
        Matcher matcher25 = Pattern.compile("((https|http|ftp|rtsp|mms)?://)[^\\s]+").matcher("");
        C = matcher25;
        Matcher matcher26 = Pattern.compile("(.*?) {2} *$").matcher("");
        D = matcher26;
        E = Pattern.compile("\\S*(\\s+)\\S+").matcher("");
        Matcher matcher27 = Pattern.compile("^( {4}|\\t)(.*)").matcher("");
        F = matcher27;
        Matcher matcher28 = Pattern.compile("^\\s*```").matcher("");
        G = matcher28;
        Matcher matcher29 = Pattern.compile("^\\s*$").matcher("");
        H = matcher29;
        Matcher matcher30 = Pattern.compile("^\\s*([-*]\\s*){3,}$").matcher("");
        I = matcher30;
        SparseArray<Matcher> sparseArray = new SparseArray<>();
        J = sparseArray;
        sparseArray.put(1, matcher27);
        sparseArray.put(2, matcher28);
        sparseArray.put(3, matcher4);
        sparseArray.put(4, matcher5);
        sparseArray.put(24, matcher6);
        sparseArray.put(5, matcher7);
        sparseArray.put(6, matcher8);
        sparseArray.put(7, matcher9);
        sparseArray.put(23, matcher3);
        sparseArray.put(8, matcher10);
        sparseArray.put(9, matcher11);
        sparseArray.put(10, matcher12);
        sparseArray.put(11, matcher14);
        sparseArray.put(12, matcher13);
        sparseArray.put(13, matcher15);
        sparseArray.put(14, matcher24);
        sparseArray.put(15, matcher25);
        sparseArray.put(16, matcher16);
        sparseArray.put(17, matcher18);
        sparseArray.put(18, matcher20);
        sparseArray.put(19, matcher21);
        sparseArray.put(20, matcher19);
        sparseArray.put(21, matcher22);
        sparseArray.put(22, matcher23);
        sparseArray.put(25, matcher29);
        sparseArray.put(26, matcher26);
        sparseArray.put(27, matcher30);
        sparseArray.put(28, matcher);
        sparseArray.put(29, matcher2);
        sparseArray.put(30, matcher17);
    }

    public j(d dVar) {
        this.f15454a = dVar;
    }

    private boolean I(SpannableStringBuilder spannableStringBuilder, int i5, int i6) {
        for (c3.b bVar : (c3.b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c3.b.class)) {
            int spanStart = spannableStringBuilder.getSpanStart(bVar);
            int spanEnd = spannableStringBuilder.getSpanEnd(bVar);
            if (spanStart < i6 && spanEnd > i5) {
                return true;
            }
        }
        return false;
    }

    private Matcher J(int i5, CharSequence charSequence) {
        Matcher matcher = J.get(i5, null);
        if (matcher != null) {
            matcher.reset(charSequence);
        }
        return matcher;
    }

    private boolean K(a aVar, int i5) {
        CharSequence r5;
        SpannableStringBuilder spannableStringBuilder;
        Matcher J2 = J(10, aVar.r());
        boolean z4 = false;
        if (!J2.find()) {
            return false;
        }
        aVar.H(3);
        a aVar2 = new a(J2.group(1));
        aVar.B(0);
        a v4 = aVar.v();
        b queue = this.f15455b.getQueue();
        a w4 = aVar.w();
        if (queue.d().t() == 1) {
            z4 = true;
        }
        if (z4) {
            aVar.E(1);
            aVar.D(3);
        }
        if (w4 != null && (w4.t() == 3 || w4.t() == 2)) {
            if (i5 > 0) {
                aVar.B(i5);
            } else {
                String replaceAll = aVar.r().substring(J2.start(), J2.start(1) - 2).replaceAll("\\t", "    ");
                if (replaceAll.length() > (w4.n() * 2) + 1) {
                    aVar.B(w4.n() + 1);
                } else {
                    aVar.B(replaceAll.length() / 2);
                }
            }
        }
        if (w4 != null && w4.t() == 3 && w4.n() == aVar.n()) {
            aVar.C(w4.o() + 1);
        } else {
            aVar.C(1);
        }
        if (z4) {
            aVar.G(" ");
        } else {
            aVar.G(this.f15454a.o(" ", aVar.n(), aVar.o()));
        }
        if (B(9, aVar2)) {
            int n5 = aVar.n() + 1;
            aVar2.I();
            if (v4 != null) {
                a i6 = v4.i();
                i6.b(aVar2);
                queue.h();
                N(aVar2, n5);
                if (z4) {
                    while (i6.v() != null) {
                        i6 = i6.v();
                    }
                    i6.G(this.f15454a.p(aVar2.s(), c(8, i6, 1) - 1, aVar2.n()));
                } else {
                    while (i6 != null && i6.t() == 1) {
                        i6.G(this.f15454a.h(aVar2.s()));
                        i6 = i6.v();
                    }
                }
            } else {
                aVar.c(aVar2);
                queue.h();
                N(queue.d(), n5);
            }
            return true;
        }
        if (B(10, aVar2)) {
            int n6 = aVar.n() + 1;
            aVar2.I();
            if (v4 != null) {
                a i7 = v4.i();
                i7.b(aVar2);
                queue.h();
                K(aVar2, n6);
                if (z4) {
                    while (i7.v() != null) {
                        i7 = i7.v();
                    }
                    i7.G(this.f15454a.j(aVar2.s(), c(8, i7, 1) - 1, aVar2.n(), aVar2.o()));
                } else {
                    while (i7 != null && i7.t() == 1) {
                        i7.G(this.f15454a.h(aVar2.s()));
                        i7 = i7.v();
                    }
                }
            } else {
                aVar.c(aVar2);
                queue.h();
                K(queue.d(), n6);
            }
            return true;
        }
        if (G(aVar2)) {
            r5 = aVar2.s();
        } else {
            r5 = aVar2.r();
        }
        if (r5 instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) r5;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(r5);
        }
        aVar.G(spannableStringBuilder);
        g(aVar);
        if (!z4) {
            aVar.G(this.f15454a.o(aVar.s(), aVar.n(), aVar.o()));
        }
        return true;
    }

    private void L(b bVar) {
        while (bVar.i() != null && B(25, bVar.i())) {
            bVar.m();
        }
    }

    private void M(b bVar) {
        while (bVar.k() != null && B(25, bVar.k())) {
            bVar.n();
        }
    }

    private boolean N(a aVar, int i5) {
        CharSequence r5;
        SpannableStringBuilder spannableStringBuilder;
        Matcher J2 = J(9, aVar.r());
        boolean z4 = false;
        if (!J2.find()) {
            return false;
        }
        aVar.H(2);
        a k5 = aVar.k(J2.group(1));
        aVar.B(0);
        a v4 = aVar.v();
        b queue = this.f15455b.getQueue();
        a w4 = aVar.w();
        if (queue.d().t() == 1) {
            z4 = true;
        }
        if (z4) {
            aVar.E(1);
            aVar.D(2);
        }
        if (w4 != null && (w4.t() == 3 || w4.t() == 2)) {
            if (i5 > 0) {
                aVar.B(i5);
            } else {
                String replaceAll = aVar.r().substring(J2.start(), J2.start(1) - 2).replaceAll("\\t", "    ");
                if (replaceAll.length() > (w4.n() * 2) + 1) {
                    aVar.B(w4.n() + 1);
                } else {
                    aVar.B(replaceAll.length() / 2);
                }
            }
        }
        if (z4) {
            aVar.G(" ");
        } else {
            aVar.G(this.f15454a.k(" ", aVar.n()));
        }
        if (B(9, k5)) {
            int n5 = aVar.n() + 1;
            k5.I();
            if (v4 != null) {
                a i6 = v4.i();
                i6.b(k5);
                queue.h();
                N(k5, n5);
                if (z4) {
                    while (i6.v() != null) {
                        i6 = i6.v();
                    }
                    i6.G(this.f15454a.p(k5.s(), c(8, i6, 1) - 1, k5.n()));
                } else {
                    while (i6 != null && i6.t() == 1) {
                        i6.G(this.f15454a.h(k5.s()));
                        i6 = i6.v();
                    }
                }
            } else {
                aVar.c(k5);
                queue.h();
                N(queue.d(), n5);
            }
            return true;
        }
        if (B(10, k5)) {
            int n6 = aVar.n() + 1;
            k5.I();
            if (v4 != null) {
                a i7 = v4.i();
                i7.b(k5);
                queue.h();
                K(k5, n6);
                if (z4) {
                    while (i7.v() != null) {
                        i7 = i7.v();
                    }
                    i7.G(this.f15454a.j(k5.s(), c(8, i7, 1) - 1, k5.n(), k5.o()));
                } else {
                    while (i7 != null && i7.t() == 1) {
                        i7.G(this.f15454a.h(k5.s()));
                        i7 = i7.v();
                    }
                }
            } else {
                aVar.c(k5);
                queue.h();
                K(queue.d(), n6);
            }
            return true;
        }
        if (G(k5)) {
            r5 = k5.s();
        } else {
            r5 = k5.r();
        }
        if (r5 instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) r5;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(r5);
        }
        aVar.G(spannableStringBuilder);
        g(aVar);
        if (!z4) {
            aVar.G(this.f15454a.k(aVar.s(), aVar.n()));
        }
        return true;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean A(a aVar) {
        a m5 = aVar.m();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) m5.s();
        Matcher J2 = J(13, spannableStringBuilder);
        while (J2.find()) {
            if (!I(spannableStringBuilder, J2.start(1), J2.end(1))) {
                SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) spannableStringBuilder.subSequence(J2.start(3), J2.end(3));
                spannableStringBuilder.delete(J2.start(1), J2.end(1));
                spannableStringBuilder.insert(J2.start(1), this.f15454a.l(spannableStringBuilder2));
                A(m5);
                return true;
            }
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.g
    public boolean B(int i5, a aVar) {
        return aVar != null && e(i5, aVar.r());
    }

    @Override // com.zzhoujay.markdown.parser.g
    public int C(int i5, String str, int i6) {
        Matcher J2;
        if (str == null || (J2 = J(i5, str)) == null || !J2.find()) {
            return 0;
        }
        return C(i5, J2.group(i6), i6) + 1;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean D(String str) {
        Matcher J2 = J(22, str);
        if (J2.find()) {
            this.f15457d.put(J2.group(1), new Pair<>(J2.group(2), J2.group(5)));
            return true;
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean E(String str) {
        Matcher J2 = J(19, str);
        if (J2.find()) {
            this.f15456c.put(J2.group(1), new Pair<>(J2.group(2), J2.group(5)));
            return true;
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean F(a aVar) {
        a m5 = aVar.m();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) m5.s();
        Matcher J2 = J(21, spannableStringBuilder);
        if (!J2.find()) {
            return false;
        }
        String group = J2.group(2);
        Pair<String, String> pair = this.f15457d.get(J2.group(3));
        if (pair == null) {
            return false;
        }
        spannableStringBuilder.delete(J2.start(1), J2.end(1));
        spannableStringBuilder.insert(J2.start(1), (CharSequence) this.f15454a.f(group, (String) pair.first, (String) pair.second));
        F(m5);
        return true;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean G(a aVar) {
        return d(aVar) || f(aVar) || i(aVar) || m(aVar) || p(aVar) || s(aVar);
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean H(a aVar) {
        boolean z4;
        if (B(2, aVar)) {
            b queue = this.f15455b.getQueue();
            b b5 = queue.b();
            while (true) {
                if (b5.i() != null) {
                    if (B(2, b5.i())) {
                        b5.h();
                        M(b5);
                        L(queue);
                        z4 = true;
                        break;
                    }
                    b5.h();
                } else {
                    z4 = false;
                    break;
                }
            }
            if (z4) {
                StringBuilder sb = new StringBuilder();
                queue.h();
                queue.n();
                while (queue.d() != b5.d()) {
                    sb.append(queue.d().r());
                    sb.append('\n');
                    queue.h();
                    queue.n();
                }
                L(b5);
                b5.d().H(10);
                b5.d().G(this.f15454a.c(sb.toString()));
                return true;
            }
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean a(a aVar) {
        Matcher J2 = J(1, aVar.r());
        if (!J2.find()) {
            return false;
        }
        String group = J2.group(2);
        b queue = this.f15455b.getQueue();
        StringBuilder sb = new StringBuilder(group);
        StringBuilder sb2 = new StringBuilder();
        for (a i5 = queue.i(); i5 != null; i5 = queue.i()) {
            CharSequence w4 = w(1, i5, 2);
            if (w4 == null) {
                if (!B(25, i5)) {
                    break;
                }
                sb2.append(' ');
                sb2.append('\n');
            } else if (sb2.length() != 0) {
                sb.append((CharSequence) sb2);
                sb.append(w4);
                sb2.delete(0, sb.length());
            } else {
                sb.append('\n');
                sb.append(w4);
            }
            queue.m();
        }
        aVar.H(11);
        aVar.G(this.f15454a.c(sb.toString()));
        return true;
    }

    @Override // com.zzhoujay.markdown.parser.h
    public CharSequence b(int i5, CharSequence charSequence, int i6) {
        Matcher J2 = J(i5, charSequence);
        if (J2.find()) {
            return J2.group(i6);
        }
        return null;
    }

    @Override // com.zzhoujay.markdown.parser.g
    public int c(int i5, a aVar, int i6) {
        if (aVar == null) {
            return 0;
        }
        return C(i5, aVar.r(), i6);
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean d(a aVar) {
        Matcher J2 = J(7, aVar.r());
        if (J2.find()) {
            aVar.H(9);
            aVar.G(SpannableStringBuilder.valueOf(J2.group(1)));
            g(aVar);
            aVar.G(this.f15454a.u(aVar.s()));
            return true;
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.g
    public boolean e(int i5, String str) {
        Matcher J2;
        if (str == null || (J2 = J(i5, str)) == null || !J2.find()) {
            return false;
        }
        return true;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean f(a aVar) {
        Matcher J2 = J(6, aVar.r());
        if (J2.find()) {
            aVar.H(8);
            aVar.G(SpannableStringBuilder.valueOf(J2.group(1)));
            g(aVar);
            aVar.G(this.f15454a.v(aVar.s()));
            return true;
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean g(a aVar) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean r5 = r(aVar);
        if (!A(aVar) && !r5) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!o(aVar) && !z4) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!y(aVar) && !z5) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (!j(aVar) && !z6) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (!l(aVar) && !z7) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (!z(aVar) && !z8) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!F(aVar) && !z9) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!q(aVar) && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!x(aVar) && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!v(aVar) && !z12) {
            return false;
        }
        return true;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean h(a aVar) {
        return K(aVar, 0);
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean i(a aVar) {
        Matcher J2 = J(5, aVar.r());
        if (J2.find()) {
            aVar.H(7);
            aVar.G(SpannableStringBuilder.valueOf(J2.group(1)));
            g(aVar);
            aVar.G(this.f15454a.s(aVar.s()));
            return true;
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean j(a aVar) {
        a m5 = aVar.m();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) m5.s();
        Matcher J2 = J(16, spannableStringBuilder);
        while (J2.find()) {
            if (!I(spannableStringBuilder, J2.start(1), J2.end(1))) {
                SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) spannableStringBuilder.subSequence(J2.start(3), J2.end(3));
                spannableStringBuilder.delete(J2.start(1), J2.end(1));
                spannableStringBuilder.insert(J2.start(1), this.f15454a.q(spannableStringBuilder2));
                j(m5);
                return true;
            }
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean k(a aVar) {
        b queue = this.f15455b.getQueue();
        a m5 = aVar.m();
        Matcher J2 = J(8, m5.r());
        if (J2.find()) {
            m5.H(1);
            a k5 = m5.k(J2.group(1));
            m5.e();
            m5.f();
            a k6 = queue.k();
            if (m5.v() == null && k6 != null && k6.t() == 1) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                this.f15454a.h(spannableStringBuilder);
                while (k6.h() != null && k6.h().t() == 1) {
                    k6 = k6.h();
                    this.f15454a.h(spannableStringBuilder);
                }
                k6.i();
                queue.k().G(spannableStringBuilder);
            }
            if (!k(k5) && !n(k5) && !h(k5) && !G(k5)) {
                k5.G(SpannableStringBuilder.valueOf(k5.r()));
                g(k5);
            } else if (k5.q() == 1) {
                if (m5.v() == null) {
                    if (k5.p() == 2) {
                        m5.G(this.f15454a.p(k5.s(), c(8, m5, 1) - 1, k5.n()));
                    } else {
                        m5.G(this.f15454a.j(k5.s(), c(8, m5, 1) - 1, k5.n(), k5.o()));
                    }
                } else {
                    m5.D(k5.p());
                    m5.G(k5.s());
                    m5.B(k5.n());
                    m5.C(k5.o());
                    m5.E(1);
                }
                return true;
            }
            m5.G(this.f15454a.h(k5.s()));
            return true;
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean l(a aVar) {
        a m5 = aVar.m();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) m5.s();
        Matcher J2 = J(14, spannableStringBuilder);
        if (J2.find()) {
            SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) spannableStringBuilder.subSequence(J2.start(2), J2.end(2));
            spannableStringBuilder.delete(J2.start(1), J2.end(1));
            spannableStringBuilder.insert(J2.start(1), (CharSequence) this.f15454a.m(spannableStringBuilder2));
            l(m5);
            return true;
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean m(a aVar) {
        Matcher J2 = J(24, aVar.r());
        if (J2.find()) {
            aVar.H(6);
            aVar.G(SpannableStringBuilder.valueOf(J2.group(1)));
            g(aVar);
            aVar.G(this.f15454a.t(aVar.s()));
            return true;
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean n(a aVar) {
        return N(aVar, 0);
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean o(a aVar) {
        a m5 = aVar.m();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) m5.s();
        Matcher J2 = J(11, spannableStringBuilder);
        while (J2.find()) {
            if (!I(spannableStringBuilder, J2.start(1), J2.end(1))) {
                SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) spannableStringBuilder.subSequence(J2.start(3), J2.end(3));
                spannableStringBuilder.delete(J2.start(1), J2.end(1));
                spannableStringBuilder.insert(J2.start(1), this.f15454a.a(spannableStringBuilder2));
                o(m5);
                return true;
            }
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean p(a aVar) {
        Matcher J2 = J(4, aVar.r());
        if (J2.find()) {
            aVar.H(5);
            aVar.G(SpannableStringBuilder.valueOf(J2.group(1)));
            g(aVar);
            aVar.G(this.f15454a.b(aVar.s()));
            return true;
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean q(a aVar) {
        a m5 = aVar.m();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) m5.s();
        Matcher J2 = J(17, spannableStringBuilder);
        if (J2.find()) {
            String group = J2.group(2);
            String group2 = J2.group(3);
            String group3 = J2.group(6);
            spannableStringBuilder.delete(J2.start(1), J2.end(1));
            spannableStringBuilder.insert(J2.start(1), (CharSequence) this.f15454a.i(group, group2, group3));
            q(m5);
            return true;
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean r(a aVar) {
        a m5 = aVar.m();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) m5.s();
        Matcher J2 = J(30, spannableStringBuilder);
        if (J2.find()) {
            String group = J2.group(3);
            spannableStringBuilder.delete(J2.start(1), J2.end(1));
            spannableStringBuilder.insert(J2.start(1), (CharSequence) this.f15454a.n(group));
            r(m5);
            return true;
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean s(a aVar) {
        Matcher J2 = J(3, aVar.r());
        if (J2 != null && J2.find()) {
            aVar.H(4);
            aVar.G(SpannableStringBuilder.valueOf(J2.group(1)));
            g(aVar);
            aVar.G(this.f15454a.g(aVar.s()));
            return true;
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.c
    public void t(c.a aVar) {
        this.f15455b = aVar;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean u(a aVar) {
        a m5 = aVar.m();
        if (J(27, m5.r()).matches()) {
            m5.H(12);
            m5.G(this.f15454a.d());
            return true;
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean v(a aVar) {
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.m().s();
        Matcher J2 = J(15, spannableStringBuilder);
        boolean z4 = false;
        while (J2.find()) {
            String group = J2.group();
            spannableStringBuilder.delete(J2.start(), J2.end());
            spannableStringBuilder.insert(J2.start(), (CharSequence) this.f15454a.i(group, group, ""));
            z4 = true;
        }
        return z4;
    }

    @Override // com.zzhoujay.markdown.parser.h
    public CharSequence w(int i5, a aVar, int i6) {
        return b(i5, aVar.r(), i6);
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean x(a aVar) {
        a m5 = aVar.m();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) m5.s();
        Matcher J2 = J(18, spannableStringBuilder);
        if (!J2.find()) {
            return false;
        }
        String group = J2.group(2);
        Pair<String, String> pair = this.f15456c.get(J2.group(3));
        if (pair == null) {
            return false;
        }
        spannableStringBuilder.delete(J2.start(1), J2.end(1));
        spannableStringBuilder.insert(J2.start(1), (CharSequence) this.f15454a.i(group, (String) pair.first, (String) pair.second));
        x(m5);
        return true;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean y(a aVar) {
        a m5 = aVar.m();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) m5.s();
        Matcher J2 = J(12, spannableStringBuilder);
        while (J2.find()) {
            if (!I(spannableStringBuilder, J2.start(1), J2.end(1))) {
                SpannableStringBuilder spannableStringBuilder2 = (SpannableStringBuilder) spannableStringBuilder.subSequence(J2.start(3), J2.end(3));
                spannableStringBuilder.delete(J2.start(1), J2.end(1));
                spannableStringBuilder.insert(J2.start(1), this.f15454a.e(spannableStringBuilder2));
                y(m5);
                return true;
            }
        }
        return false;
    }

    @Override // com.zzhoujay.markdown.parser.i
    public boolean z(a aVar) {
        a m5 = aVar.m();
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) m5.s();
        Matcher J2 = J(20, spannableStringBuilder);
        if (J2.find()) {
            String group = J2.group(2);
            String group2 = J2.group(3);
            String group3 = J2.group(6);
            spannableStringBuilder.delete(J2.start(1), J2.end(1));
            spannableStringBuilder.insert(J2.start(1), (CharSequence) this.f15454a.f(group, group2, group3));
            z(m5);
            return true;
        }
        return false;
    }
}
