package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

@kotlin.i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001d\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0002\u0010\fJ\u0013\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0006J\u0016\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0096\u0002J\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0006J\u0015\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0014¢\u0006\u0002\u0010#J'\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00010\t\"\u0004\b\u0001\u0010\u00012\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00010\tH\u0014¢\u0006\u0002\u0010%J\u0015\u0010&\u001a\u00020\u0006*\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\u0082\bR\u0018\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Lkotlin/collections/RingBuffer;", "T", "Lkotlin/collections/AbstractList;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "capacity", "", "(I)V", "buffer", "", "", "filledSize", "([Ljava/lang/Object;I)V", "[Ljava/lang/Object;", "<set-?>", "size", "getSize", "()I", "startIndex", "add", "", "element", "(Ljava/lang/Object;)V", "expanded", "maxCapacity", "get", "index", "(I)Ljava/lang/Object;", "isFull", "", "iterator", "", "removeFirst", "n", "toArray", "()[Ljava/lang/Object;", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "forward", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n205#1:209\n205#1:210\n205#1:211\n1#2:208\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:209\n176#1:210\n189#1:211\n*E\n"})
/* loaded from: classes3.dex */
final class i1<T> extends c<T> implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    @p4.l
    private final Object[] f19131a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19132b;

    /* renamed from: c, reason: collision with root package name */
    private int f19133c;

    /* renamed from: d, reason: collision with root package name */
    private int f19134d;

    @kotlin.i0(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0005\u001a\u00020\u0006H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"kotlin/collections/RingBuffer$iterator$1", "Lkotlin/collections/AbstractIterator;", "count", "", "index", "computeNext", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.internal.r1({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,207:1\n205#2:208\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:208\n*E\n"})
    /* loaded from: classes3.dex */
    public static final class a extends b<T> {

        /* renamed from: c, reason: collision with root package name */
        private int f19135c;

        /* renamed from: d, reason: collision with root package name */
        private int f19136d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ i1<T> f19137e;

        a(i1<T> i1Var) {
            this.f19137e = i1Var;
            this.f19135c = i1Var.size();
            this.f19136d = ((i1) i1Var).f19133c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.collections.b
        protected void a() {
            if (this.f19135c == 0) {
                b();
                return;
            }
            c(((i1) this.f19137e).f19131a[this.f19136d]);
            this.f19136d = (this.f19136d + 1) % ((i1) this.f19137e).f19132b;
            this.f19135c--;
        }
    }

    public i1(@p4.l Object[] buffer, int i5) {
        kotlin.jvm.internal.l0.p(buffer, "buffer");
        this.f19131a = buffer;
        if (i5 >= 0) {
            if (i5 <= buffer.length) {
                this.f19132b = buffer.length;
                this.f19134d = i5;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i5 + " cannot be larger than the buffer size: " + buffer.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i5).toString());
    }

    private final int j(int i5, int i6) {
        return (i5 + i6) % this.f19132b;
    }

    public final void g(T t5) {
        if (!k()) {
            this.f19131a[(this.f19133c + size()) % this.f19132b] = t5;
            this.f19134d = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    @Override // kotlin.collections.c, java.util.List
    public T get(int i5) {
        c.Companion.b(i5, size());
        return (T) this.f19131a[(this.f19133c + i5) % this.f19132b];
    }

    @Override // kotlin.collections.c, kotlin.collections.a
    public int getSize() {
        return this.f19134d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @p4.l
    public final i1<T> i(int i5) {
        int B;
        Object[] array;
        int i6 = this.f19132b;
        B = kotlin.ranges.u.B(i6 + (i6 >> 1) + 1, i5);
        if (this.f19133c == 0) {
            array = Arrays.copyOf(this.f19131a, B);
            kotlin.jvm.internal.l0.o(array, "copyOf(this, newSize)");
        } else {
            array = toArray(new Object[B]);
        }
        return new i1<>(array, size());
    }

    @Override // kotlin.collections.c, kotlin.collections.a, java.util.Collection, java.lang.Iterable, java.util.List
    @p4.l
    public Iterator<T> iterator() {
        return new a(this);
    }

    public final boolean k() {
        return size() == this.f19132b;
    }

    public final void l(int i5) {
        boolean z4;
        boolean z5 = true;
        if (i5 >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (i5 > size()) {
                z5 = false;
            }
            if (z5) {
                if (i5 > 0) {
                    int i6 = this.f19133c;
                    int i7 = (i6 + i5) % this.f19132b;
                    if (i6 > i7) {
                        o.M1(this.f19131a, null, i6, this.f19132b);
                        o.M1(this.f19131a, null, 0, i7);
                    } else {
                        o.M1(this.f19131a, null, i6, i7);
                    }
                    this.f19133c = i7;
                    this.f19134d = size() - i5;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i5 + ", size = " + size()).toString());
        }
        throw new IllegalArgumentException(("n shouldn't be negative but it is " + i5).toString());
    }

    @Override // kotlin.collections.a, java.util.Collection
    @p4.l
    public <T> T[] toArray(@p4.l T[] array) {
        kotlin.jvm.internal.l0.p(array, "array");
        if (array.length < size()) {
            array = (T[]) Arrays.copyOf(array, size());
            kotlin.jvm.internal.l0.o(array, "copyOf(this, newSize)");
        }
        int size = size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = this.f19133c; i6 < size && i7 < this.f19132b; i7++) {
            array[i6] = this.f19131a[i7];
            i6++;
        }
        while (i6 < size) {
            array[i6] = this.f19131a[i5];
            i6++;
            i5++;
        }
        if (array.length > size()) {
            array[size()] = null;
        }
        return array;
    }

    public i1(int i5) {
        this(new Object[i5], 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.collections.a, java.util.Collection
    @p4.l
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
