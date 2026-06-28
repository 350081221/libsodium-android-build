package kotlin.streams.jdk8;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import kotlin.collections.o;
import kotlin.g1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.sequences.m;
import p4.l;
import u3.h;

@i0(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0005H\u0007\u001a\u0012\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\b0\u0001\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\tH\u0007\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\t\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u0001H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f*\u00020\u0003H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\f*\u00020\u0005H\u0007\u001a\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f*\u00020\u0007H\u0007\u001a\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\b0\f\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\tH\u0007¨\u0006\r"}, d2 = {"asSequence", "Lkotlin/sequences/Sequence;", "", "Ljava/util/stream/DoubleStream;", "", "Ljava/util/stream/IntStream;", "", "Ljava/util/stream/LongStream;", "T", "Ljava/util/stream/Stream;", "asStream", "toList", "", "kotlin-stdlib-jdk8"}, k = 2, mv = {1, 9, 0}, pn = "kotlin.streams", xi = 48)
@h(name = "StreamsKt")
/* loaded from: classes4.dex */
public final class b {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @i0(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n31#2:681\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class a<T> implements m<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Stream f19698a;

        public a(Stream stream) {
            this.f19698a = stream;
        }

        @Override // kotlin.sequences.m
        @l
        public Iterator<T> iterator() {
            Iterator<T> it = this.f19698a.iterator();
            l0.o(it, "iterator()");
            return it;
        }
    }

    @i0(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n39#2:681\n*E\n"})
    /* renamed from: kotlin.streams.jdk8.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0562b implements m<Integer> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IntStream f19699a;

        public C0562b(IntStream intStream) {
            this.f19699a = intStream;
        }

        @Override // kotlin.sequences.m
        @l
        public Iterator<Integer> iterator() {
            Iterator<Integer> it = this.f19699a.iterator();
            l0.o(it, "iterator()");
            return it;
        }
    }

    @i0(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n47#2:681\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class c implements m<Long> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LongStream f19700a;

        public c(LongStream longStream) {
            this.f19700a = longStream;
        }

        @Override // kotlin.sequences.m
        @l
        public Iterator<Long> iterator() {
            Iterator<Long> it = this.f19700a.iterator();
            l0.o(it, "iterator()");
            return it;
        }
    }

    @i0(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004¸\u0006\u0000"}, d2 = {"kotlin/sequences/SequencesKt__SequencesKt$Sequence$1", "Lkotlin/sequences/Sequence;", "iterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 Streams.kt\nkotlin/streams/jdk8/StreamsKt\n*L\n1#1,680:1\n55#2:681\n*E\n"})
    /* loaded from: classes4.dex */
    public static final class d implements m<Double> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ DoubleStream f19701a;

        public d(DoubleStream doubleStream) {
            this.f19701a = doubleStream;
        }

        @Override // kotlin.sequences.m
        @l
        public Iterator<Double> iterator() {
            Iterator<Double> it = this.f19701a.iterator();
            l0.o(it, "iterator()");
            return it;
        }
    }

    @l
    @g1(version = "1.2")
    public static final m<Double> b(@l DoubleStream doubleStream) {
        l0.p(doubleStream, "<this>");
        return new d(doubleStream);
    }

    @l
    @g1(version = "1.2")
    public static final m<Integer> c(@l IntStream intStream) {
        l0.p(intStream, "<this>");
        return new C0562b(intStream);
    }

    @l
    @g1(version = "1.2")
    public static final m<Long> d(@l LongStream longStream) {
        l0.p(longStream, "<this>");
        return new c(longStream);
    }

    @l
    @g1(version = "1.2")
    public static final <T> m<T> e(@l Stream<T> stream) {
        l0.p(stream, "<this>");
        return new a(stream);
    }

    @l
    @g1(version = "1.2")
    public static final <T> Stream<T> f(@l final m<? extends T> mVar) {
        l0.p(mVar, "<this>");
        Stream<T> stream = StreamSupport.stream(new Supplier() { // from class: kotlin.streams.jdk8.a
            @Override // java.util.function.Supplier
            public final Object get() {
                Spliterator g5;
                g5 = b.g(m.this);
                return g5;
            }
        }, 16, false);
        l0.o(stream, "stream({ Spliterators.sp…literator.ORDERED, false)");
        return stream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Spliterator g(m this_asStream) {
        l0.p(this_asStream, "$this_asStream");
        return Spliterators.spliteratorUnknownSize(this_asStream.iterator(), 16);
    }

    @l
    @g1(version = "1.2")
    public static final List<Double> h(@l DoubleStream doubleStream) {
        List<Double> p5;
        l0.p(doubleStream, "<this>");
        double[] array = doubleStream.toArray();
        l0.o(array, "toArray()");
        p5 = o.p(array);
        return p5;
    }

    @l
    @g1(version = "1.2")
    public static final List<Integer> i(@l IntStream intStream) {
        List<Integer> r5;
        l0.p(intStream, "<this>");
        int[] array = intStream.toArray();
        l0.o(array, "toArray()");
        r5 = o.r(array);
        return r5;
    }

    @l
    @g1(version = "1.2")
    public static final List<Long> j(@l LongStream longStream) {
        List<Long> s5;
        l0.p(longStream, "<this>");
        long[] array = longStream.toArray();
        l0.o(array, "toArray()");
        s5 = o.s(array);
        return s5;
    }

    @l
    @g1(version = "1.2")
    public static final <T> List<T> k(@l Stream<T> stream) {
        l0.p(stream, "<this>");
        Object collect = stream.collect(Collectors.toList());
        l0.o(collect, "collect(Collectors.toList<T>())");
        return (List) collect;
    }
}
