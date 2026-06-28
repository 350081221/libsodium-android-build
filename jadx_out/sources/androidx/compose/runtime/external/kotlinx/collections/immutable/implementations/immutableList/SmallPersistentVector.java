package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.o;
import kotlin.collections.p;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 (*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001(B\u0015\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0010J#\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J\u001d\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\u0016\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\nH\u0096\u0002¢\u0006\u0002\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u0011\u001a\u00020\nH\u0016J\"\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020%0$H\u0016J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\nH\u0016J#\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0012R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0014\u0010\t\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006)"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "buffer", "", "", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "size", "", "getSize", "()I", "add", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "element", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "index", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "addAll", "c", "", "elements", "bufferOfSize", "(I)[Ljava/lang/Object;", "builder", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList$Builder;", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "listIterator", "", "removeAll", "predicate", "Lkotlin/Function1;", "", "removeAt", "set", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSmallPersistentVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,161:1\n41#2:162\n41#2:163\n26#3:164\n*S KotlinDebug\n*F\n+ 1 SmallPersistentVector.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector\n*L\n48#1:162\n91#1:163\n159#1:164\n*E\n"})
/* loaded from: classes.dex */
public final class SmallPersistentVector<E> extends AbstractPersistentList<E> implements ImmutableList<E> {

    @l
    private final Object[] buffer;

    @l
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @l
    private static final SmallPersistentVector EMPTY = new SmallPersistentVector(new Object[0]);

    @i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "", "getEMPTY", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/SmallPersistentVector;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final SmallPersistentVector getEMPTY() {
            return SmallPersistentVector.EMPTY;
        }
    }

    public SmallPersistentVector(@l Object[] objArr) {
        boolean z4;
        this.buffer = objArr;
        if (objArr.length <= 32) {
            z4 = true;
        } else {
            z4 = false;
        }
        CommonFunctionsKt.m3350assert(z4);
    }

    private final Object[] bufferOfSize(int i5) {
        return new Object[i5];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    public /* bridge */ /* synthetic */ PersistentCollection add(Object obj) {
        return add((SmallPersistentVector<E>) obj);
    }

    @Override // kotlin.collections.c, java.util.List
    public E get(int i5) {
        ListImplementation.checkElementIndex$runtime_release(i5, size());
        return (E) this.buffer[i5];
    }

    @Override // kotlin.collections.c, kotlin.collections.a
    public int getSize() {
        return this.buffer.length;
    }

    @Override // kotlin.collections.c, java.util.List
    public int indexOf(Object obj) {
        int If;
        If = p.If(this.buffer, obj);
        return If;
    }

    @Override // kotlin.collections.c, java.util.List
    public int lastIndexOf(Object obj) {
        int Mh;
        Mh = p.Mh(this.buffer, obj);
        return Mh;
    }

    @Override // kotlin.collections.c, java.util.List
    @l
    public ListIterator<E> listIterator(int i5) {
        ListImplementation.checkPositionIndex$runtime_release(i5, size());
        return new BufferIterator(this.buffer, i5, size());
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList<E> removeAt(int i5) {
        ListImplementation.checkElementIndex$runtime_release(i5, size());
        if (size() == 1) {
            return EMPTY;
        }
        Object[] copyOf = Arrays.copyOf(this.buffer, size() - 1);
        l0.o(copyOf, "copyOf(this, newSize)");
        o.B0(this.buffer, copyOf, i5, i5 + 1, size());
        return new SmallPersistentVector(copyOf);
    }

    @Override // kotlin.collections.c, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList<E> set(int i5, E e5) {
        ListImplementation.checkElementIndex$runtime_release(i5, size());
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        copyOf[i5] = e5;
        return new SmallPersistentVector(copyOf);
    }

    @Override // java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentList<E> add(E e5) {
        if (size() < 32) {
            Object[] copyOf = Arrays.copyOf(this.buffer, size() + 1);
            l0.o(copyOf, "copyOf(this, newSize)");
            copyOf[size()] = e5;
            return new SmallPersistentVector(copyOf);
        }
        return new PersistentVector(this.buffer, UtilsKt.presizedBufferWith(e5), size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.Collection, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentList<E> addAll(@l Collection<? extends E> collection) {
        if (size() + collection.size() <= 32) {
            Object[] copyOf = Arrays.copyOf(this.buffer, size() + collection.size());
            l0.o(copyOf, "copyOf(this, newSize)");
            int size = size();
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                copyOf[size] = it.next();
                size++;
            }
            return new SmallPersistentVector(copyOf);
        }
        PersistentList.Builder<E> builder = builder();
        builder.addAll(collection);
        return builder.build();
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentList.Builder<E> builder() {
        return new PersistentVectorBuilder(this, null, this.buffer, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection
    @l
    public PersistentList<E> removeAll(@l v3.l<? super E, Boolean> lVar) {
        Object[] l12;
        Object[] objArr = this.buffer;
        int size = size();
        int size2 = size();
        boolean z4 = false;
        for (int i5 = 0; i5 < size2; i5++) {
            Object obj = this.buffer[i5];
            if (lVar.invoke(obj).booleanValue()) {
                if (!z4) {
                    Object[] objArr2 = this.buffer;
                    objArr = Arrays.copyOf(objArr2, objArr2.length);
                    l0.o(objArr, "copyOf(this, size)");
                    z4 = true;
                    size = i5;
                }
            } else if (z4) {
                objArr[size] = obj;
                size++;
            }
        }
        if (size == size()) {
            return this;
        }
        if (size == 0) {
            return EMPTY;
        }
        l12 = o.l1(objArr, 0, size);
        return new SmallPersistentVector(l12);
    }

    @Override // java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList<E> add(int i5, E e5) {
        ListImplementation.checkPositionIndex$runtime_release(i5, size());
        if (i5 == size()) {
            return add((SmallPersistentVector<E>) e5);
        }
        if (size() < 32) {
            Object[] bufferOfSize = bufferOfSize(size() + 1);
            o.K0(this.buffer, bufferOfSize, 0, 0, i5, 6, null);
            o.B0(this.buffer, bufferOfSize, i5 + 1, i5, size());
            bufferOfSize[i5] = e5;
            return new SmallPersistentVector(bufferOfSize);
        }
        Object[] objArr = this.buffer;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        l0.o(copyOf, "copyOf(this, size)");
        o.B0(this.buffer, copyOf, i5 + 1, i5, size() - 1);
        copyOf[i5] = e5;
        return new PersistentVector(copyOf, UtilsKt.presizedBufferWith(this.buffer[31]), size() + 1, 0);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList, java.util.List, androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList
    @l
    public PersistentList<E> addAll(int i5, @l Collection<? extends E> collection) {
        ListImplementation.checkPositionIndex$runtime_release(i5, size());
        if (size() + collection.size() <= 32) {
            Object[] bufferOfSize = bufferOfSize(size() + collection.size());
            o.K0(this.buffer, bufferOfSize, 0, 0, i5, 6, null);
            o.B0(this.buffer, bufferOfSize, collection.size() + i5, i5, size());
            Iterator<? extends E> it = collection.iterator();
            while (it.hasNext()) {
                bufferOfSize[i5] = it.next();
                i5++;
            }
            return new SmallPersistentVector(bufferOfSize);
        }
        PersistentList.Builder<E> builder = builder();
        builder.addAll(i5, collection);
        return builder.build();
    }
}
