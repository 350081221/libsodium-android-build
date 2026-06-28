package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.text.p;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues_", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "matchResult", "Ljava/util/regex/MatchResult;", "getMatchResult", "()Ljava/util/regex/MatchResult;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", t0.b.f22420d, "getValue", "()Ljava/lang/String;", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final Matcher f19793a;

    /* renamed from: b, reason: collision with root package name */
    @p4.l
    private final CharSequence f19794b;

    /* renamed from: c, reason: collision with root package name */
    @p4.l
    private final n f19795c;

    /* renamed from: d, reason: collision with root package name */
    @p4.m
    private List<String> f19796d;

    @kotlin.i0(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004H\u0096\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"kotlin/text/MatcherMatchResult$groupValues$1", "Lkotlin/collections/AbstractList;", "", "size", "", "getSize", "()I", "get", "index", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.collections.c<String> {
        a() {
        }

        @Override // kotlin.collections.c, java.util.List
        @p4.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get(int i5) {
            String group = q.this.f().group(i5);
            return group == null ? "" : group;
        }

        public /* bridge */ int c(String str) {
            return super.indexOf(str);
        }

        @Override // kotlin.collections.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return contains((String) obj);
            }
            return false;
        }

        public /* bridge */ int e(String str) {
            return super.lastIndexOf(str);
        }

        @Override // kotlin.collections.c, kotlin.collections.a
        public int getSize() {
            return q.this.f().groupCount() + 1;
        }

        @Override // kotlin.collections.c, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return c((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.c, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return e((String) obj);
            }
            return -1;
        }

        public /* bridge */ boolean contains(String str) {
            return super.contains((a) str);
        }
    }

    public q(@p4.l Matcher matcher, @p4.l CharSequence input) {
        kotlin.jvm.internal.l0.p(matcher, "matcher");
        kotlin.jvm.internal.l0.p(input, "input");
        this.f19793a = matcher;
        this.f19794b = input;
        this.f19795c = new b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult f() {
        return this.f19793a;
    }

    @Override // kotlin.text.p
    @p4.l
    public p.b a() {
        return p.a.a(this);
    }

    @Override // kotlin.text.p
    @p4.l
    public List<String> b() {
        if (this.f19796d == null) {
            this.f19796d = new a();
        }
        List<String> list = this.f19796d;
        kotlin.jvm.internal.l0.m(list);
        return list;
    }

    @Override // kotlin.text.p
    @p4.l
    public kotlin.ranges.l c() {
        return s.c(f());
    }

    @Override // kotlin.text.p
    @p4.l
    public n d() {
        return this.f19795c;
    }

    @Override // kotlin.text.p
    @p4.l
    public String getValue() {
        String group = f().group();
        kotlin.jvm.internal.l0.o(group, "matchResult.group()");
        return group;
    }

    @Override // kotlin.text.p
    @p4.m
    public p next() {
        int i5;
        int end = f().end();
        if (f().end() == f().start()) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        int i6 = end + i5;
        if (i6 <= this.f19794b.length()) {
            Matcher matcher = this.f19793a.pattern().matcher(this.f19794b);
            kotlin.jvm.internal.l0.o(matcher, "matcher.pattern().matcher(input)");
            return s.a(matcher, i6, this.f19794b);
        }
        return null;
    }

    @kotlin.i0(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0096\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0096\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", "size", "", "getSize", "()I", "get", "index", "name", "", "isEmpty", "", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.collections.a<m> implements o {

        @kotlin.i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlin/text/MatchGroup;", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* loaded from: classes4.dex */
        static final class a extends kotlin.jvm.internal.n0 implements v3.l<Integer, m> {
            a() {
                super(1);
            }

            @Override // v3.l
            public /* bridge */ /* synthetic */ m invoke(Integer num) {
                return invoke(num.intValue());
            }

            @p4.m
            public final m invoke(int i5) {
                return b.this.get(i5);
            }
        }

        b() {
        }

        public /* bridge */ boolean a(m mVar) {
            return super.contains(mVar);
        }

        @Override // kotlin.collections.a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof m) {
                return a((m) obj);
            }
            return false;
        }

        @Override // kotlin.text.n
        @p4.m
        public m get(int i5) {
            kotlin.ranges.l d5 = s.d(q.this.f(), i5);
            if (d5.getStart().intValue() < 0) {
                return null;
            }
            String group = q.this.f().group(i5);
            kotlin.jvm.internal.l0.o(group, "matchResult.group(index)");
            return new m(group, d5);
        }

        @Override // kotlin.collections.a
        public int getSize() {
            return q.this.f().groupCount() + 1;
        }

        @Override // kotlin.collections.a, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
        @p4.l
        public Iterator<m> iterator() {
            kotlin.ranges.l F;
            kotlin.sequences.m x12;
            kotlin.sequences.m k12;
            F = kotlin.collections.w.F(this);
            x12 = kotlin.collections.e0.x1(F);
            k12 = kotlin.sequences.u.k1(x12, new a());
            return k12.iterator();
        }

        @Override // kotlin.text.o
        @p4.m
        public m get(@p4.l String name) {
            kotlin.jvm.internal.l0.p(name, "name");
            return kotlin.internal.m.f19264a.c(q.this.f(), name);
        }
    }
}
