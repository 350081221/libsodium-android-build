package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aH\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aD\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u000e\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¨\u0006\u000f"}, d2 = {"checkWindowSizeStep", "", "size", "", "step", "windowedIterator", "", "", "T", "iterator", "partialWindows", "", "reuseBuffer", "windowedSequence", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class o1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    @kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a<T> extends kotlin.coroutines.jvm.internal.k implements v3.p<kotlin.sequences.o<? super List<? extends T>>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ Iterator<T> $iterator;
        final /* synthetic */ boolean $partialWindows;
        final /* synthetic */ boolean $reuseBuffer;
        final /* synthetic */ int $size;
        final /* synthetic */ int $step;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(int i5, int i6, Iterator<? extends T> it, boolean z4, boolean z5, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.$size = i5;
            this.$step = i6;
            this.$iterator = it;
            this.$reuseBuffer = z4;
            this.$partialWindows = z5;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, dVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l kotlin.sequences.o<? super List<? extends T>> oVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((a) create(oVar, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0134  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0084  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00dc A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x00b1  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x014b -> B:12:0x014e). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x011d -> B:30:0x0120). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00a6 -> B:50:0x0058). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@p4.l java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 365
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.o1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.i0(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 SlidingWindow.kt\nkotlin/collections/SlidingWindowKt\n*L\n1#1,680:1\n19#2:681\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class b<T> implements kotlin.sequences.m<List<? extends T>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ kotlin.sequences.m f19155a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f19156b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f19157c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f19158d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f19159e;

        public b(kotlin.sequences.m mVar, int i5, int i6, boolean z4, boolean z5) {
            this.f19155a = mVar;
            this.f19156b = i5;
            this.f19157c = i6;
            this.f19158d = z4;
            this.f19159e = z5;
        }

        @Override // kotlin.sequences.m
        @p4.l
        public Iterator<List<? extends T>> iterator() {
            return o1.b(this.f19155a.iterator(), this.f19156b, this.f19157c, this.f19158d, this.f19159e);
        }
    }

    public static final void a(int i5, int i6) {
        boolean z4;
        String str;
        if (i5 > 0 && i6 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            if (i5 != i6) {
                str = "Both size " + i5 + " and step " + i6 + " must be greater than zero.";
            } else {
                str = "size " + i5 + " must be greater than zero.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    @p4.l
    public static final <T> Iterator<List<T>> b(@p4.l Iterator<? extends T> iterator, int i5, int i6, boolean z4, boolean z5) {
        Iterator<List<T>> a5;
        kotlin.jvm.internal.l0.p(iterator, "iterator");
        if (!iterator.hasNext()) {
            return g0.f19124a;
        }
        a5 = kotlin.sequences.q.a(new a(i5, i6, iterator, z5, z4, null));
        return a5;
    }

    @p4.l
    public static final <T> kotlin.sequences.m<List<T>> c(@p4.l kotlin.sequences.m<? extends T> mVar, int i5, int i6, boolean z4, boolean z5) {
        kotlin.jvm.internal.l0.p(mVar, "<this>");
        a(i5, i6);
        return new b(mVar, i5, i6, z4, z5);
    }
}
