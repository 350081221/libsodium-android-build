package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.e0;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;
import w3.a;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b1\u00102J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0011\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0005H\u0086\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0010J\u0006\u0010\u0014\u001a\u00020\u000bJ(\u0010\u0017\u001a\u00020\u000b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0015H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J(\u0010\u0018\u001a\u00020\u000e2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0015H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0014\u0010\u001b\u001a\u00020\u000b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J\b\u0010\u001c\u001a\u00020\u000eH\u0016J\u0006\u0010\u001d\u001a\u00020\u000eJ\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u001e\u0010\u0010J\u001d\u0010 \u001a\u00020\u000b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000e0\u0015H\u0086\bJ\u0016\u0010\"\u001a\u00020\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0016J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0096\u0002J\b\u0010&\u001a\u00020%H\u0016R$\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00058\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R4\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010,2\u000e\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010,8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArraySet;", "", "T", "", b.f22420d, "", "find", "midIndex", "valueHash", "findExactIndex", "index", "Lkotlin/r2;", "checkIndexBounds", "element", "", "contains", "(Ljava/lang/Object;)Z", "get", "(I)Ljava/lang/Object;", "add", "clear", "Lkotlin/Function1;", "block", "fastForEach", "fastAny", "", "collection", "addAll", "isEmpty", "isNotEmpty", "remove", "predicate", "removeValueIf", "elements", "containsAll", "", "iterator", "", "toString", "<set-?>", "size", "I", "getSize", "()I", "", "values", "[Ljava/lang/Object;", "getValues", "()[Ljava/lang/Object;", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nIdentityArraySet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,402:1\n1726#2,3:403\n*S KotlinDebug\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n378#1:403,3\n*E\n"})
/* loaded from: classes.dex */
public final class IdentityArraySet<T> implements Set<T>, a {
    public static final int $stable = 8;
    private int size;

    @l
    private Object[] values = new Object[16];

    private final void checkIndexBounds(int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < size()) {
            z4 = true;
        }
        if (z4) {
            return;
        }
        throw new IndexOutOfBoundsException("Index " + i5 + ", size " + size());
    }

    private final int find(Object obj) {
        int size = size() - 1;
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        Object[] objArr = this.values;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) >>> 1;
            Object obj2 = objArr[i6];
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i5 = i6 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                size = i6 - 1;
            } else {
                if (obj2 == obj) {
                    return i6;
                }
                return findExactIndex(i6, obj, identityHashCode);
            }
        }
        return -(i5 + 1);
    }

    private final int findExactIndex(int i5, Object obj, int i6) {
        Object obj2;
        Object[] objArr = this.values;
        int size = size();
        for (int i7 = i5 - 1; -1 < i7; i7--) {
            Object obj3 = objArr[i7];
            if (obj3 == obj) {
                return i7;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj3) != i6) {
                break;
            }
        }
        do {
            i5++;
            if (i5 < size) {
                obj2 = objArr[i5];
                if (obj2 == obj) {
                    return i5;
                }
            } else {
                return -(size + 1);
            }
        } while (ActualJvm_jvmKt.identityHashCode(obj2) == i6);
        return -(i5 + 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(@l T t5) {
        int i5;
        int size = size();
        Object[] objArr = this.values;
        if (size > 0) {
            i5 = find(t5);
            if (i5 >= 0) {
                return false;
            }
        } else {
            i5 = -1;
        }
        int i6 = -(i5 + 1);
        if (size == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            o.B0(objArr, objArr2, i6 + 1, i6, size);
            o.K0(objArr, objArr2, 0, 0, i6, 6, null);
            this.values = objArr2;
        } else {
            o.B0(objArr, objArr, i6 + 1, i6, size);
        }
        this.values[i6] = t5;
        this.size = size() + 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final void addAll(@l Collection<? extends T> collection) {
        boolean z4;
        boolean z5;
        Object[] objArr;
        int i5;
        Object obj;
        boolean z6;
        int i6;
        if (collection.isEmpty()) {
            return;
        }
        if (!(collection instanceof IdentityArraySet)) {
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return;
        }
        Object[] objArr2 = this.values;
        IdentityArraySet identityArraySet = (IdentityArraySet) collection;
        Object[] objArr3 = identityArraySet.values;
        int size = size();
        int size2 = identityArraySet.size();
        int i7 = size + size2;
        if (this.values.length < i7) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (size != 0 && ActualJvm_jvmKt.identityHashCode(objArr2[size - 1]) >= ActualJvm_jvmKt.identityHashCode(objArr3[0])) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!z4 && z5) {
            o.B0(objArr3, objArr2, size, 0, size2);
            this.size = size() + size2;
            return;
        }
        if (z4) {
            if (size > size2) {
                i6 = size * 2;
            } else {
                i6 = size2 * 2;
            }
            objArr = new Object[i6];
        } else {
            objArr = objArr2;
        }
        int i8 = size - 1;
        int i9 = size2 - 1;
        int i10 = i7 - 1;
        while (true) {
            if (i8 < 0 && i9 < 0) {
                break;
            }
            if (i8 < 0) {
                i5 = i9 - 1;
                obj = objArr3[i9];
            } else if (i9 < 0) {
                i5 = i9;
                obj = objArr2[i8];
                i8--;
            } else {
                Object obj2 = objArr2[i8];
                Object obj3 = objArr3[i9];
                int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj2);
                int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj3);
                if (identityHashCode > identityHashCode2) {
                    i8--;
                } else {
                    if (identityHashCode >= identityHashCode2) {
                        if (obj2 == obj3) {
                            i8--;
                            i9--;
                        } else {
                            int i11 = i8 - 1;
                            while (i11 >= 0) {
                                int i12 = i11 - 1;
                                Object obj4 = objArr2[i11];
                                if (ActualJvm_jvmKt.identityHashCode(obj4) != identityHashCode2) {
                                    break;
                                }
                                if (obj3 == obj4) {
                                    z6 = true;
                                    break;
                                }
                                i11 = i12;
                            }
                            z6 = false;
                            if (z6) {
                                i9--;
                            }
                        }
                    }
                    i5 = i9 - 1;
                    obj = obj3;
                }
                i5 = i9;
                obj = obj2;
            }
            objArr[i10] = obj;
            i9 = i5;
            i10--;
        }
        if (i10 >= 0) {
            o.B0(objArr, objArr, 0, i10 + 1, i7);
        }
        int i13 = i7 - (i10 + 1);
        o.M1(objArr, null, i13, i7);
        this.values = objArr;
        this.size = i13;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        o.V1(this.values, null, 0, 0, 6, null);
        this.size = 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(@m Object obj) {
        return obj != null && find(obj) >= 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@l Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean fastAny(@l v3.l<? super T, Boolean> lVar) {
        int size = size();
        if (size == 0) {
            return false;
        }
        Object[] values = getValues();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = values[i5];
            l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (lVar.invoke(obj).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void fastForEach(@l v3.l<? super T, r2> lVar) {
        Object[] values = getValues();
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = values[i5];
            l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            lVar.invoke(obj);
        }
    }

    @l
    public final T get(int i5) {
        checkIndexBounds(i5);
        T t5 = (T) this.values[i5];
        l0.n(t5, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t5;
    }

    public int getSize() {
        return this.size;
    }

    @l
    public final Object[] getValues() {
        return this.values;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isNotEmpty() {
        return size() > 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @l
    public Iterator<T> iterator() {
        return new IdentityArraySet$iterator$1(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(@m T t5) {
        if (t5 == null) {
            return false;
        }
        int find = find(t5);
        Object[] objArr = this.values;
        int size = size();
        if (find < 0) {
            return false;
        }
        int i5 = size - 1;
        if (find < i5) {
            o.B0(objArr, objArr, find, find + 1, size);
        }
        objArr[i5] = null;
        this.size = size() - 1;
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void removeValueIf(@l v3.l<? super T, Boolean> lVar) {
        Object[] values = getValues();
        int size = size();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = values[i6];
            l0.n(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (!lVar.invoke(obj).booleanValue()) {
                if (i5 != i6) {
                    values[i5] = obj;
                }
                i5++;
            }
        }
        for (int i7 = i5; i7 < size; i7++) {
            values[i7] = null;
        }
        this.size = i5;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) v.b(this, tArr);
    }

    @l
    public String toString() {
        String j32;
        j32 = e0.j3(this, null, "[", "]", 0, null, IdentityArraySet$toString$1.INSTANCE, 25, null);
        return j32;
    }
}
