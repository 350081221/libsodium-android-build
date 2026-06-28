package kotlin.collections.builders;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import com.tendcloud.tenddata.cq;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.k;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 V*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\u00060\u0006j\u0002`\u0007:\u0002VWB\u0007\b\u0016¢\u0006\u0002\u0010\bB\u000f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bBM\b\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0002\u0010\u0014J\u0015\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\u001d\u0010\u001b\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 J\u001e\u0010!\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J\u0016\u0010!\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J&\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010&\u001a\u00020\nH\u0002J\u001d\u0010'\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010 J\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000)J\b\u0010*\u001a\u00020\u001eH\u0002J\b\u0010+\u001a\u00020\u001eH\u0016J\u0014\u0010,\u001a\u00020\u00112\n\u0010-\u001a\u0006\u0012\u0002\b\u00030)H\u0002J\u0010\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\nH\u0002J\u0010\u00100\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\nH\u0002J\u0013\u00101\u001a\u00020\u00112\b\u0010-\u001a\u0004\u0018\u000102H\u0096\u0002J\u0016\u00103\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\nH\u0096\u0002¢\u0006\u0002\u00104J\b\u00105\u001a\u00020\nH\u0016J\u0015\u00106\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00107J\u0018\u00108\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\nH\u0002J\b\u00109\u001a\u00020\u0011H\u0016J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000;H\u0096\u0002J\u0015\u0010<\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00107J\u000e\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000>H\u0016J\u0016\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000>2\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0015\u0010?\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001dJ\u0016\u0010@\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J\u0015\u0010A\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0002\u00104J\u0015\u0010B\u001a\u00028\u00002\u0006\u0010%\u001a\u00020\nH\u0002¢\u0006\u0002\u00104J\u0018\u0010C\u001a\u00020\u001e2\u0006\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020\nH\u0002J\u0016\u0010F\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016J.\u0010G\u001a\u00020\n2\u0006\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020\n2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010H\u001a\u00020\u0011H\u0002J\u001e\u0010I\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010JJ\u001e\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010L\u001a\u00020\n2\u0006\u0010M\u001a\u00020\nH\u0016J\u0015\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001020\rH\u0016¢\u0006\u0002\u0010OJ'\u0010N\u001a\b\u0012\u0004\u0012\u0002HP0\r\"\u0004\b\u0001\u0010P2\f\u0010Q\u001a\b\u0012\u0004\u0012\u0002HP0\rH\u0016¢\u0006\u0002\u0010RJ\b\u0010S\u001a\u00020TH\u0016J\b\u0010U\u001a\u000202H\u0002R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0015R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006X"}, d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/AbstractMutableList;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "initialCapacity", "", "(I)V", "array", "", TypedValues.CycleType.S_WAVE_OFFSET, cq.a.LENGTH, "isReadOnly", "", "backing", "root", "([Ljava/lang/Object;IIZLkotlin/collections/builders/ListBuilder;Lkotlin/collections/builders/ListBuilder;)V", "[Ljava/lang/Object;", "isEffectivelyReadOnly", "()Z", "size", "getSize", "()I", "add", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "addAllInternal", "i", "n", "addAtInternal", "build", "", "checkIsMutable", "clear", "contentEquals", "other", "ensureCapacity", "minCapacity", "ensureExtraCapacity", "equals", "", "get", "(I)Ljava/lang/Object;", TTDownloadField.TT_HASHCODE, "indexOf", "(Ljava/lang/Object;)I", "insertAtInternal", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "removeAtInternal", "removeRangeInternal", "rangeOffset", "rangeLength", "retainAll", "retainOrRemoveAllInternal", "retain", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "toArray", "()[Ljava/lang/Object;", "T", "destination", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "writeReplace", "Companion", "Itr", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
/* loaded from: classes3.dex */
public final class b<E> extends kotlin.collections.f<E> implements List<E>, RandomAccess, Serializable, w3.e {

    @l
    private static final a Companion = new a(null);

    @l
    private static final b Empty;

    @l
    private E[] array;

    @m
    private final b<E> backing;
    private boolean isReadOnly;
    private int length;
    private int offset;

    @m
    private final b<E> root;

    @i0(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Companion;", "", "()V", "Empty", "Lkotlin/collections/builders/ListBuilder;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(w wVar) {
            this();
        }
    }

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0010\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\r\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lkotlin/collections/builders/ListBuilder$Itr;", "E", "", "list", "Lkotlin/collections/builders/ListBuilder;", "index", "", "(Lkotlin/collections/builders/ListBuilder;I)V", "lastIndex", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @r1({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n1#2:433\n*E\n"})
    /* renamed from: kotlin.collections.builders.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static final class C0542b<E> implements ListIterator<E>, w3.f {

        /* renamed from: a, reason: collision with root package name */
        @l
        private final b<E> f19095a;

        /* renamed from: b, reason: collision with root package name */
        private int f19096b;

        /* renamed from: c, reason: collision with root package name */
        private int f19097c;

        public C0542b(@l b<E> list, int i5) {
            l0.p(list, "list");
            this.f19095a = list;
            this.f19096b = i5;
            this.f19097c = -1;
        }

        @Override // java.util.ListIterator
        public void add(E e5) {
            b<E> bVar = this.f19095a;
            int i5 = this.f19096b;
            this.f19096b = i5 + 1;
            bVar.add(i5, e5);
            this.f19097c = -1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f19096b < ((b) this.f19095a).length;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f19096b > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public E next() {
            if (this.f19096b < ((b) this.f19095a).length) {
                int i5 = this.f19096b;
                this.f19096b = i5 + 1;
                this.f19097c = i5;
                return (E) ((b) this.f19095a).array[((b) this.f19095a).offset + this.f19097c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f19096b;
        }

        @Override // java.util.ListIterator
        public E previous() {
            int i5 = this.f19096b;
            if (i5 > 0) {
                int i6 = i5 - 1;
                this.f19096b = i6;
                this.f19097c = i6;
                return (E) ((b) this.f19095a).array[((b) this.f19095a).offset + this.f19097c];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f19096b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            boolean z4;
            int i5 = this.f19097c;
            if (i5 != -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.f19095a.remove(i5);
                this.f19096b = this.f19097c;
                this.f19097c = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        @Override // java.util.ListIterator
        public void set(E e5) {
            boolean z4;
            int i5 = this.f19097c;
            if (i5 != -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                this.f19095a.set(i5, e5);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    static {
        b bVar = new b(0);
        bVar.isReadOnly = true;
        Empty = bVar;
    }

    private b(E[] eArr, int i5, int i6, boolean z4, b<E> bVar, b<E> bVar2) {
        this.array = eArr;
        this.offset = i5;
        this.length = i6;
        this.isReadOnly = z4;
        this.backing = bVar;
        this.root = bVar2;
    }

    private final void addAllInternal(int i5, Collection<? extends E> collection, int i6) {
        b<E> bVar = this.backing;
        if (bVar != null) {
            bVar.addAllInternal(i5, collection, i6);
            this.array = this.backing.array;
            this.length += i6;
        } else {
            insertAtInternal(i5, i6);
            Iterator<? extends E> it = collection.iterator();
            for (int i7 = 0; i7 < i6; i7++) {
                this.array[i5 + i7] = it.next();
            }
        }
    }

    private final void addAtInternal(int i5, E e5) {
        b<E> bVar = this.backing;
        if (bVar != null) {
            bVar.addAtInternal(i5, e5);
            this.array = this.backing.array;
            this.length++;
        } else {
            insertAtInternal(i5, 1);
            this.array[i5] = e5;
        }
    }

    private final void checkIsMutable() {
        if (isEffectivelyReadOnly()) {
            throw new UnsupportedOperationException();
        }
    }

    private final boolean contentEquals(List<?> list) {
        boolean h5;
        h5 = c.h(this.array, this.offset, this.length, list);
        return h5;
    }

    private final void ensureCapacity(int i5) {
        if (this.backing == null) {
            if (i5 >= 0) {
                E[] eArr = this.array;
                if (i5 > eArr.length) {
                    this.array = (E[]) c.e(this.array, k.f19140d.a(eArr.length, i5));
                    return;
                }
                return;
            }
            throw new OutOfMemoryError();
        }
        throw new IllegalStateException();
    }

    private final void ensureExtraCapacity(int i5) {
        ensureCapacity(this.length + i5);
    }

    private final void insertAtInternal(int i5, int i6) {
        ensureExtraCapacity(i6);
        E[] eArr = this.array;
        o.B0(eArr, eArr, i5 + i6, i5, this.offset + this.length);
        this.length += i6;
    }

    private final boolean isEffectivelyReadOnly() {
        b<E> bVar;
        return this.isReadOnly || ((bVar = this.root) != null && bVar.isReadOnly);
    }

    private final E removeAtInternal(int i5) {
        b<E> bVar = this.backing;
        if (bVar != null) {
            this.length--;
            return bVar.removeAtInternal(i5);
        }
        E[] eArr = this.array;
        E e5 = eArr[i5];
        o.B0(eArr, eArr, i5, i5 + 1, this.offset + this.length);
        c.f(this.array, (this.offset + this.length) - 1);
        this.length--;
        return e5;
    }

    private final void removeRangeInternal(int i5, int i6) {
        b<E> bVar = this.backing;
        if (bVar != null) {
            bVar.removeRangeInternal(i5, i6);
        } else {
            E[] eArr = this.array;
            o.B0(eArr, eArr, i5, i5 + i6, this.length);
            E[] eArr2 = this.array;
            int i7 = this.length;
            c.g(eArr2, i7 - i6, i7);
        }
        this.length -= i6;
    }

    private final int retainOrRemoveAllInternal(int i5, int i6, Collection<? extends E> collection, boolean z4) {
        b<E> bVar = this.backing;
        if (bVar != null) {
            int retainOrRemoveAllInternal = bVar.retainOrRemoveAllInternal(i5, i6, collection, z4);
            this.length -= retainOrRemoveAllInternal;
            return retainOrRemoveAllInternal;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < i6) {
            int i9 = i5 + i7;
            if (collection.contains(this.array[i9]) == z4) {
                E[] eArr = this.array;
                i7++;
                eArr[i8 + i5] = eArr[i9];
                i8++;
            } else {
                i7++;
            }
        }
        int i10 = i6 - i8;
        E[] eArr2 = this.array;
        o.B0(eArr2, eArr2, i5 + i8, i6 + i5, this.length);
        E[] eArr3 = this.array;
        int i11 = this.length;
        c.g(eArr3, i11 - i10, i11);
        this.length -= i10;
        return i10;
    }

    private final Object writeReplace() {
        if (isEffectivelyReadOnly()) {
            return new h(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E e5) {
        checkIsMutable();
        addAtInternal(this.offset + this.length, e5);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(@l Collection<? extends E> elements) {
        l0.p(elements, "elements");
        checkIsMutable();
        int size = elements.size();
        addAllInternal(this.offset + this.length, elements, size);
        return size > 0;
    }

    @l
    public final List<E> build() {
        if (this.backing == null) {
            checkIsMutable();
            this.isReadOnly = true;
            if (this.length > 0) {
                return this;
            }
            return Empty;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        checkIsMutable();
        removeRangeInternal(this.offset, this.length);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(@m Object obj) {
        return obj == this || ((obj instanceof List) && contentEquals((List) obj));
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i5) {
        kotlin.collections.c.Companion.b(i5, this.length);
        return this.array[this.offset + i5];
    }

    @Override // kotlin.collections.f
    public int getSize() {
        return this.length;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i5;
        i5 = c.i(this.array, this.offset, this.length);
        return i5;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        for (int i5 = 0; i5 < this.length; i5++) {
            if (l0.g(this.array[this.offset + i5], obj)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @l
    public Iterator<E> iterator() {
        return new C0542b(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        for (int i5 = this.length - 1; i5 >= 0; i5--) {
            if (l0.g(this.array[this.offset + i5], obj)) {
                return i5;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    @l
    public ListIterator<E> listIterator() {
        return new C0542b(this, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        checkIsMutable();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(@l Collection<? extends Object> elements) {
        l0.p(elements, "elements");
        checkIsMutable();
        if (retainOrRemoveAllInternal(this.offset, this.length, elements, false) <= 0) {
            return false;
        }
        return true;
    }

    @Override // kotlin.collections.f
    public E removeAt(int i5) {
        checkIsMutable();
        kotlin.collections.c.Companion.b(i5, this.length);
        return removeAtInternal(this.offset + i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(@l Collection<? extends Object> elements) {
        l0.p(elements, "elements");
        checkIsMutable();
        if (retainOrRemoveAllInternal(this.offset, this.length, elements, true) > 0) {
            return true;
        }
        return false;
    }

    @Override // kotlin.collections.f, java.util.AbstractList, java.util.List
    public E set(int i5, E e5) {
        checkIsMutable();
        kotlin.collections.c.Companion.b(i5, this.length);
        E[] eArr = this.array;
        int i6 = this.offset;
        E e6 = eArr[i6 + i5];
        eArr[i6 + i5] = e5;
        return e6;
    }

    @Override // java.util.AbstractList, java.util.List
    @l
    public List<E> subList(int i5, int i6) {
        b<E> bVar;
        kotlin.collections.c.Companion.d(i5, i6, this.length);
        E[] eArr = this.array;
        int i7 = this.offset + i5;
        int i8 = i6 - i5;
        boolean z4 = this.isReadOnly;
        b<E> bVar2 = this.root;
        if (bVar2 == null) {
            bVar = this;
        } else {
            bVar = bVar2;
        }
        return new b(eArr, i7, i8, z4, this, bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @l
    public <T> T[] toArray(@l T[] destination) {
        l0.p(destination, "destination");
        int length = destination.length;
        int i5 = this.length;
        if (length < i5) {
            E[] eArr = this.array;
            int i6 = this.offset;
            T[] tArr = (T[]) Arrays.copyOfRange(eArr, i6, i5 + i6, destination.getClass());
            l0.o(tArr, "copyOfRange(array, offse…h, destination.javaClass)");
            return tArr;
        }
        E[] eArr2 = this.array;
        int i7 = this.offset;
        o.B0(eArr2, destination, 0, i7, i5 + i7);
        int length2 = destination.length;
        int i8 = this.length;
        if (length2 > i8) {
            destination[i8] = null;
        }
        return destination;
    }

    @Override // java.util.AbstractCollection
    @l
    public String toString() {
        String j5;
        j5 = c.j(this.array, this.offset, this.length);
        return j5;
    }

    @Override // java.util.AbstractList, java.util.List
    @l
    public ListIterator<E> listIterator(int i5) {
        kotlin.collections.c.Companion.c(i5, this.length);
        return new C0542b(this, i5);
    }

    @Override // kotlin.collections.f, java.util.AbstractList, java.util.List
    public void add(int i5, E e5) {
        checkIsMutable();
        kotlin.collections.c.Companion.c(i5, this.length);
        addAtInternal(this.offset + i5, e5);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i5, @l Collection<? extends E> elements) {
        l0.p(elements, "elements");
        checkIsMutable();
        kotlin.collections.c.Companion.c(i5, this.length);
        int size = elements.size();
        addAllInternal(this.offset + i5, elements, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @l
    public Object[] toArray() {
        Object[] l12;
        E[] eArr = this.array;
        int i5 = this.offset;
        l12 = o.l1(eArr, i5, this.length + i5);
        return l12;
    }

    public b() {
        this(10);
    }

    public b(int i5) {
        this(c.d(i5), 0, 0, false, null, null);
    }
}
