package kotlin.sequences;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.e1;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.q1;
import kotlin.r2;
import kotlin.u0;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u001c\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\u0087\bø\u0001\u0000\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001ab\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\t\"\u0004\b\u0002\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\t0\f2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\t\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00050\u000eH\u0000\u001a&\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00102\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a<\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00102\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000e\u001a=\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u0001H\u00022\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000eH\u0007¢\u0006\u0002\u0010\u0014\u001a+\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0017\"\u0002H\u0002¢\u0006\u0002\u0010\u0018\u001a\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001aC\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00050\u000eH\u0002¢\u0006\u0002\b\u001c\u001a)\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001d0\u0001H\u0007¢\u0006\u0002\b\u001e\u001a\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a2\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0004H\u0007\u001a!\u0010!\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\u0087\b\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0007\u001a&\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010#\u001a\u00020$H\u0007\u001a@\u0010%\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0'0&\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\b0&0\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "emptySequence", "flatMapIndexed", "R", "C", "source", "transform", "Lkotlin/Function2;", "", "Lkotlin/Function1;", "generateSequence", "", "nextFunction", "seedFunction", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "asSequence", "constrainOnce", "flatten", "flatten$SequencesKt__SequencesKt", "", "flattenSequenceOfIterable", "ifEmpty", "defaultValue", "orEmpty", "shuffled", "random", "Lkotlin/random/Random;", "unzip", "Lkotlin/Pair;", "", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/sequences/SequencesKt")
/* loaded from: classes4.dex */
public class s extends r {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @i0(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 176)
    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n*L\n1#1,680:1\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ v3.a<Iterator<T>> f19656a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(v3.a<? extends Iterator<? extends T>> aVar) {
            this.f19656a = aVar;
        }

        @Override // kotlin.sequences.m
        @p4.l
        public Iterator<T> iterator() {
            return this.f19656a.invoke();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @i0(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt\n*L\n1#1,680:1\n30#2:681\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class b<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f19657a;

        public b(Iterator it) {
            this.f19657a = it;
        }

        @Override // kotlin.sequences.m
        @p4.l
        public Iterator<T> iterator() {
            return this.f19657a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt__SequencesKt$flatMapIndexed$1", f = "Sequences.kt", i = {0, 0}, l = {332}, m = "invokeSuspend", n = {"$this$sequence", "index"}, s = {"L$0", "I$0"})
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "C", "R", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class c<R> extends kotlin.coroutines.jvm.internal.k implements v3.p<o<? super R>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.l<C, Iterator<R>> $iterator;
        final /* synthetic */ m<T> $source;
        final /* synthetic */ v3.p<Integer, T, C> $transform;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(m<? extends T> mVar, v3.p<? super Integer, ? super T, ? extends C> pVar, v3.l<? super C, ? extends Iterator<? extends R>> lVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.$source = mVar;
            this.$transform = pVar;
            this.$iterator = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            c cVar = new c(this.$source, this.$transform, this.$iterator, dVar);
            cVar.L$0 = obj;
            return cVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l o<? super R> oVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((c) create(oVar, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            o oVar;
            int i5;
            Iterator it;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i6 = this.label;
            if (i6 != 0) {
                if (i6 == 1) {
                    int i7 = this.I$0;
                    it = (Iterator) this.L$1;
                    oVar = (o) this.L$0;
                    e1.n(obj);
                    i5 = i7;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                oVar = (o) this.L$0;
                i5 = 0;
                it = this.$source.iterator();
            }
            while (it.hasNext()) {
                Object next = it.next();
                v3.p<Integer, T, C> pVar = this.$transform;
                int i8 = i5 + 1;
                if (i5 < 0) {
                    kotlin.collections.w.W();
                }
                Iterator<R> invoke = this.$iterator.invoke(pVar.invoke(kotlin.coroutines.jvm.internal.b.f(i5), next));
                this.L$0 = oVar;
                this.L$1 = it;
                this.I$0 = i8;
                this.label = 1;
                if (oVar.j(invoke, this) == l5) {
                    return l5;
                }
                i5 = i8;
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlin/sequences/Sequence;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class d<T> extends n0 implements v3.l<m<? extends T>, Iterator<? extends T>> {
        public static final d INSTANCE = new d();

        d() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final Iterator<T> invoke(@p4.l m<? extends T> it) {
            l0.p(it, "it");
            return it.iterator();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class e<T> extends n0 implements v3.l<Iterable<? extends T>, Iterator<? extends T>> {
        public static final e INSTANCE = new e();

        e() {
            super(1);
        }

        @Override // v3.l
        @p4.l
        public final Iterator<T> invoke(@p4.l Iterable<? extends T> it) {
            l0.p(it, "it");
            return it.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @i0(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "R", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class f<T> extends n0 implements v3.l<T, T> {
        public static final f INSTANCE = new f();

        f() {
            super(1);
        }

        @Override // v3.l
        public final T invoke(T t5) {
            return t5;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class g<T> extends n0 implements v3.l<T, T> {
        final /* synthetic */ v3.a<T> $nextFunction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(v3.a<? extends T> aVar) {
            super(1);
            this.$nextFunction = aVar;
        }

        @Override // v3.l
        @p4.m
        public final T invoke(@p4.l T it) {
            l0.p(it, "it");
            return this.$nextFunction.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @i0(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class h<T> extends n0 implements v3.a<T> {
        final /* synthetic */ T $seed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(T t5) {
            super(0);
            this.$seed = t5;
        }

        @Override // v3.a
        @p4.m
        public final T invoke() {
            return this.$seed;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt__SequencesKt$ifEmpty$1", f = "Sequences.kt", i = {}, l = {69, 71}, m = "invokeSuspend", n = {}, s = {})
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    static final class i<T> extends kotlin.coroutines.jvm.internal.k implements v3.p<o<? super T>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ v3.a<m<T>> $defaultValue;
        final /* synthetic */ m<T> $this_ifEmpty;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(m<? extends T> mVar, v3.a<? extends m<? extends T>> aVar, kotlin.coroutines.d<? super i> dVar) {
            super(2, dVar);
            this.$this_ifEmpty = mVar;
            this.$defaultValue = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            i iVar = new i(this.$this_ifEmpty, this.$defaultValue, dVar);
            iVar.L$0 = obj;
            return iVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l o<? super T> oVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((i) create(oVar, dVar)).invokeSuspend(r2.f19517a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 != 1 && i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e1.n(obj);
            } else {
                e1.n(obj);
                o oVar = (o) this.L$0;
                Iterator<? extends T> it = this.$this_ifEmpty.iterator();
                if (it.hasNext()) {
                    this.label = 1;
                    if (oVar.j(it, this) == l5) {
                        return l5;
                    }
                } else {
                    m<T> invoke = this.$defaultValue.invoke();
                    this.label = 2;
                    if (oVar.l(invoke, this) == l5) {
                        return l5;
                    }
                }
            }
            return r2.f19517a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "kotlin.sequences.SequencesKt__SequencesKt$shuffled$1", f = "Sequences.kt", i = {0, 0}, l = {145}, m = "invokeSuspend", n = {"$this$sequence", "buffer"}, s = {"L$0", "L$1"})
    @i0(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class j<T> extends kotlin.coroutines.jvm.internal.k implements v3.p<o<? super T>, kotlin.coroutines.d<? super r2>, Object> {
        final /* synthetic */ kotlin.random.f $random;
        final /* synthetic */ m<T> $this_shuffled;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(m<? extends T> mVar, kotlin.random.f fVar, kotlin.coroutines.d<? super j> dVar) {
            super(2, dVar);
            this.$this_shuffled = mVar;
            this.$random = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @p4.l
        public final kotlin.coroutines.d<r2> create(@p4.m Object obj, @p4.l kotlin.coroutines.d<?> dVar) {
            j jVar = new j(this.$this_shuffled, this.$random, dVar);
            jVar.L$0 = obj;
            return jVar;
        }

        @Override // v3.p
        @p4.m
        public final Object invoke(@p4.l o<? super T> oVar, @p4.m kotlin.coroutines.d<? super r2> dVar) {
            return ((j) create(oVar, dVar)).invokeSuspend(r2.f19517a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.a
        @p4.m
        public final Object invokeSuspend(@p4.l Object obj) {
            Object l5;
            List d32;
            o oVar;
            Object L0;
            l5 = kotlin.coroutines.intrinsics.d.l();
            int i5 = this.label;
            if (i5 != 0) {
                if (i5 == 1) {
                    d32 = (List) this.L$1;
                    o oVar2 = (o) this.L$0;
                    e1.n(obj);
                    oVar = oVar2;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                e1.n(obj);
                o oVar3 = (o) this.L$0;
                d32 = u.d3(this.$this_shuffled);
                oVar = oVar3;
            }
            while (!d32.isEmpty()) {
                int nextInt = this.$random.nextInt(d32.size());
                L0 = kotlin.collections.b0.L0(d32);
                if (nextInt < d32.size()) {
                    L0 = d32.set(nextInt, L0);
                }
                this.L$0 = oVar;
                this.L$1 = d32;
                this.label = 1;
                if (oVar.b(L0, this) == l5) {
                    return l5;
                }
            }
            return r2.f19517a;
        }
    }

    @kotlin.internal.f
    private static final <T> m<T> d(v3.a<? extends Iterator<? extends T>> iterator) {
        l0.p(iterator, "iterator");
        return new a(iterator);
    }

    @p4.l
    public static <T> m<T> e(@p4.l Iterator<? extends T> it) {
        m<T> f5;
        l0.p(it, "<this>");
        f5 = f(new b(it));
        return f5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public static <T> m<T> f(@p4.l m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        if (!(mVar instanceof kotlin.sequences.a)) {
            return new kotlin.sequences.a(mVar);
        }
        return mVar;
    }

    @p4.l
    public static <T> m<T> g() {
        return kotlin.sequences.g.f19617a;
    }

    @p4.l
    public static final <T, C, R> m<R> h(@p4.l m<? extends T> source, @p4.l v3.p<? super Integer, ? super T, ? extends C> transform, @p4.l v3.l<? super C, ? extends Iterator<? extends R>> iterator) {
        m<R> b5;
        l0.p(source, "source");
        l0.p(transform, "transform");
        l0.p(iterator, "iterator");
        b5 = q.b(new c(source, transform, iterator, null));
        return b5;
    }

    @p4.l
    public static final <T> m<T> i(@p4.l m<? extends m<? extends T>> mVar) {
        l0.p(mVar, "<this>");
        return j(mVar, d.INSTANCE);
    }

    private static final <T, R> m<R> j(m<? extends T> mVar, v3.l<? super T, ? extends Iterator<? extends R>> lVar) {
        if (mVar instanceof z) {
            return ((z) mVar).e(lVar);
        }
        return new kotlin.sequences.i(mVar, f.INSTANCE, lVar);
    }

    @p4.l
    @u3.h(name = "flattenSequenceOfIterable")
    public static final <T> m<T> k(@p4.l m<? extends Iterable<? extends T>> mVar) {
        l0.p(mVar, "<this>");
        return j(mVar, e.INSTANCE);
    }

    @p4.l
    @kotlin.internal.h
    public static <T> m<T> l(@p4.m T t5, @p4.l v3.l<? super T, ? extends T> nextFunction) {
        l0.p(nextFunction, "nextFunction");
        if (t5 == null) {
            return kotlin.sequences.g.f19617a;
        }
        return new kotlin.sequences.j(new h(t5), nextFunction);
    }

    @p4.l
    public static <T> m<T> m(@p4.l v3.a<? extends T> nextFunction) {
        m<T> f5;
        l0.p(nextFunction, "nextFunction");
        f5 = f(new kotlin.sequences.j(nextFunction, new g(nextFunction)));
        return f5;
    }

    @p4.l
    public static <T> m<T> n(@p4.l v3.a<? extends T> seedFunction, @p4.l v3.l<? super T, ? extends T> nextFunction) {
        l0.p(seedFunction, "seedFunction");
        l0.p(nextFunction, "nextFunction");
        return new kotlin.sequences.j(seedFunction, nextFunction);
    }

    @p4.l
    @g1(version = "1.3")
    public static final <T> m<T> o(@p4.l m<? extends T> mVar, @p4.l v3.a<? extends m<? extends T>> defaultValue) {
        m<T> b5;
        l0.p(mVar, "<this>");
        l0.p(defaultValue, "defaultValue");
        b5 = q.b(new i(mVar, defaultValue, null));
        return b5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @g1(version = "1.3")
    @kotlin.internal.f
    private static final <T> m<T> p(m<? extends T> mVar) {
        m<T> g5;
        if (mVar != 0) {
            return mVar;
        }
        g5 = g();
        return g5;
    }

    @p4.l
    public static <T> m<T> q(@p4.l T... elements) {
        boolean z4;
        m<T> K5;
        m<T> g5;
        l0.p(elements, "elements");
        if (elements.length == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            g5 = g();
            return g5;
        }
        K5 = kotlin.collections.p.K5(elements);
        return K5;
    }

    @p4.l
    @g1(version = "1.4")
    public static final <T> m<T> r(@p4.l m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        return s(mVar, kotlin.random.f.Default);
    }

    @p4.l
    @g1(version = "1.4")
    public static final <T> m<T> s(@p4.l m<? extends T> mVar, @p4.l kotlin.random.f random) {
        m<T> b5;
        l0.p(mVar, "<this>");
        l0.p(random, "random");
        b5 = q.b(new j(mVar, random, null));
        return b5;
    }

    @p4.l
    public static final <T, R> u0<List<T>, List<R>> t(@p4.l m<? extends u0<? extends T, ? extends R>> mVar) {
        l0.p(mVar, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (u0<? extends T, ? extends R> u0Var : mVar) {
            arrayList.add(u0Var.getFirst());
            arrayList2.add(u0Var.getSecond());
        }
        return q1.a(arrayList, arrayList2);
    }
}
