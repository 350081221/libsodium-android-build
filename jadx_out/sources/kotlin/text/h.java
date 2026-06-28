package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.u0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0096\u0002RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h implements kotlin.sequences.m<kotlin.ranges.l> {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final CharSequence f19714a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19715b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19716c;

    /* renamed from: d, reason: collision with root package name */
    @p4.l
    private final v3.p<CharSequence, Integer, u0<Integer, Integer>> f19717d;

    @kotlin.i0(d1 = {"\u0000%\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\t\u0010\u0019\u001a\u00020\u001aH\u0096\u0002J\t\u0010\u001b\u001a\u00020\u0002H\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\bR\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\b¨\u0006\u001c"}, d2 = {"kotlin/text/DelimitedRangesSequence$iterator$1", "", "Lkotlin/ranges/IntRange;", "counter", "", "getCounter", "()I", "setCounter", "(I)V", "currentStartIndex", "getCurrentStartIndex", "setCurrentStartIndex", "nextItem", "getNextItem", "()Lkotlin/ranges/IntRange;", "setNextItem", "(Lkotlin/ranges/IntRange;)V", "nextSearchIndex", "getNextSearchIndex", "setNextSearchIndex", "nextState", "getNextState", "setNextState", "calcNext", "", "hasNext", "", "next", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class a implements Iterator<kotlin.ranges.l>, w3.a {

        /* renamed from: a, reason: collision with root package name */
        private int f19718a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f19719b;

        /* renamed from: c, reason: collision with root package name */
        private int f19720c;

        /* renamed from: d, reason: collision with root package name */
        @p4.m
        private kotlin.ranges.l f19721d;

        /* renamed from: e, reason: collision with root package name */
        private int f19722e;

        a() {
            int I;
            I = kotlin.ranges.u.I(h.this.f19715b, 0, h.this.f19714a.length());
            this.f19719b = I;
            this.f19720c = I;
        }

        /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
        
            if (r0 < r6.f19723f.f19716c) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final void a() {
            /*
                r6 = this;
                int r0 = r6.f19720c
                r1 = 0
                if (r0 >= 0) goto Lc
                r6.f19718a = r1
                r0 = 0
                r6.f19721d = r0
                goto L9e
            Lc:
                kotlin.text.h r0 = kotlin.text.h.this
                int r0 = kotlin.text.h.e(r0)
                r2 = -1
                r3 = 1
                if (r0 <= 0) goto L23
                int r0 = r6.f19722e
                int r0 = r0 + r3
                r6.f19722e = r0
                kotlin.text.h r4 = kotlin.text.h.this
                int r4 = kotlin.text.h.e(r4)
                if (r0 >= r4) goto L31
            L23:
                int r0 = r6.f19720c
                kotlin.text.h r4 = kotlin.text.h.this
                java.lang.CharSequence r4 = kotlin.text.h.d(r4)
                int r4 = r4.length()
                if (r0 <= r4) goto L47
            L31:
                kotlin.ranges.l r0 = new kotlin.ranges.l
                int r1 = r6.f19719b
                kotlin.text.h r4 = kotlin.text.h.this
                java.lang.CharSequence r4 = kotlin.text.h.d(r4)
                int r4 = kotlin.text.v.g3(r4)
                r0.<init>(r1, r4)
                r6.f19721d = r0
                r6.f19720c = r2
                goto L9c
            L47:
                kotlin.text.h r0 = kotlin.text.h.this
                v3.p r0 = kotlin.text.h.c(r0)
                kotlin.text.h r4 = kotlin.text.h.this
                java.lang.CharSequence r4 = kotlin.text.h.d(r4)
                int r5 = r6.f19720c
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                java.lang.Object r0 = r0.invoke(r4, r5)
                kotlin.u0 r0 = (kotlin.u0) r0
                if (r0 != 0) goto L77
                kotlin.ranges.l r0 = new kotlin.ranges.l
                int r1 = r6.f19719b
                kotlin.text.h r4 = kotlin.text.h.this
                java.lang.CharSequence r4 = kotlin.text.h.d(r4)
                int r4 = kotlin.text.v.g3(r4)
                r0.<init>(r1, r4)
                r6.f19721d = r0
                r6.f19720c = r2
                goto L9c
            L77:
                java.lang.Object r2 = r0.component1()
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                java.lang.Object r0 = r0.component2()
                java.lang.Number r0 = (java.lang.Number) r0
                int r0 = r0.intValue()
                int r4 = r6.f19719b
                kotlin.ranges.l r4 = kotlin.ranges.s.W1(r4, r2)
                r6.f19721d = r4
                int r2 = r2 + r0
                r6.f19719b = r2
                if (r0 != 0) goto L99
                r1 = r3
            L99:
                int r2 = r2 + r1
                r6.f19720c = r2
            L9c:
                r6.f19718a = r3
            L9e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.h.a.a():void");
        }

        public final int b() {
            return this.f19722e;
        }

        public final int c() {
            return this.f19719b;
        }

        @p4.m
        public final kotlin.ranges.l d() {
            return this.f19721d;
        }

        public final int e() {
            return this.f19720c;
        }

        public final int g() {
            return this.f19718a;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f19718a == -1) {
                a();
            }
            if (this.f19718a == 1) {
                return true;
            }
            return false;
        }

        @Override // java.util.Iterator
        @p4.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public kotlin.ranges.l next() {
            if (this.f19718a == -1) {
                a();
            }
            if (this.f19718a != 0) {
                kotlin.ranges.l lVar = this.f19721d;
                kotlin.jvm.internal.l0.n(lVar, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                this.f19721d = null;
                this.f19718a = -1;
                return lVar;
            }
            throw new NoSuchElementException();
        }

        public final void j(int i5) {
            this.f19722e = i5;
        }

        public final void k(int i5) {
            this.f19719b = i5;
        }

        public final void l(@p4.m kotlin.ranges.l lVar) {
            this.f19721d = lVar;
        }

        public final void m(int i5) {
            this.f19720c = i5;
        }

        public final void n(int i5) {
            this.f19718a = i5;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(@p4.l CharSequence input, int i5, int i6, @p4.l v3.p<? super CharSequence, ? super Integer, u0<Integer, Integer>> getNextMatch) {
        kotlin.jvm.internal.l0.p(input, "input");
        kotlin.jvm.internal.l0.p(getNextMatch, "getNextMatch");
        this.f19714a = input;
        this.f19715b = i5;
        this.f19716c = i6;
        this.f19717d = getNextMatch;
    }

    @Override // kotlin.sequences.m
    @p4.l
    public Iterator<kotlin.ranges.l> iterator() {
        return new a();
    }
}
