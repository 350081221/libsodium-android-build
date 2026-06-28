package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v;
import p4.l;
import w3.b;

/* JADX INFO: Add missing generic type declarations: [V] */
@i0(d1 = {"\u0000+\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0016\u0010\u000f\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0016\u0010\u0011\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$values$1", "", "", "isEmpty", "", "iterator", "Lkotlin/r2;", "clear", "", "elements", "addAll", "element", "add", "(Ljava/lang/Object;)Z", "retainAll", "removeAll", "remove", "containsAll", "contains", "", "getSize", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n363#2,6:1855\n373#2,3:1862\n376#2,9:1866\n363#2,6:1875\n373#2,3:1882\n376#2,9:1886\n1810#3:1841\n1672#3:1845\n1810#3:1861\n1672#3:1865\n1810#3:1881\n1672#3:1885\n1726#4,3:1895\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$values$1\n*L\n1530#1:1835,6\n1530#1:1842,3\n1530#1:1846,9\n1541#1:1855,6\n1541#1:1862,3\n1541#1:1866,9\n1551#1:1875,6\n1551#1:1882,3\n1551#1:1886,9\n1530#1:1841\n1530#1:1845\n1541#1:1861\n1541#1:1865\n1551#1:1881\n1551#1:1885\n1561#1:1895,3\n*E\n"})
/* loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$values$1<V> implements Collection<V>, b {
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MutableScatterMap$MutableMapWrapper$values$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
    }

    @Override // java.util.Collection
    public boolean add(V v4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(@l Collection<? extends V> elements) {
        l0.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public void clear() {
        this.this$0.clear();
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.this$0.containsValue(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection
    public boolean containsAll(@l Collection<? extends Object> elements) {
        l0.p(elements, "elements");
        Collection<? extends Object> collection = elements;
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!mutableScatterMap.containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.this$0._size;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    @l
    public Iterator<V> iterator() {
        return new MutableScatterMap$MutableMapWrapper$values$1$iterator$1(this.this$0);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        boolean z4;
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            int i8 = (i5 << 3) + i7;
                            if (l0.g(mutableScatterMap.values[i8], obj)) {
                                mutableScatterMap.removeValueAt(i8);
                                return true;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean removeAll(@l Collection<? extends Object> elements) {
        boolean z4;
        boolean z5;
        boolean T1;
        l0.p(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            boolean z6 = false;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            int i8 = (i5 << 3) + i7;
                            T1 = e0.T1(elements, mutableScatterMap.values[i8]);
                            if (T1) {
                                mutableScatterMap.removeValueAt(i8);
                                z6 = true;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        return z6;
                    }
                }
                if (i5 != length) {
                    i5++;
                } else {
                    z4 = z6;
                    break;
                }
            }
        } else {
            z4 = false;
        }
        return z4;
    }

    @Override // java.util.Collection
    public boolean retainAll(@l Collection<? extends Object> elements) {
        boolean z4;
        boolean z5;
        boolean T1;
        l0.p(elements, "elements");
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i5 = 0;
            boolean z6 = false;
            while (true) {
                long j5 = jArr[i5];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((255 & j5) < 128) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            int i8 = (i5 << 3) + i7;
                            T1 = e0.T1(elements, mutableScatterMap.values[i8]);
                            if (!T1) {
                                mutableScatterMap.removeValueAt(i8);
                                z6 = true;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        return z6;
                    }
                }
                if (i5 != length) {
                    i5++;
                } else {
                    z4 = z6;
                    break;
                }
            }
        } else {
            z4 = false;
        }
        return z4;
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] array) {
        l0.p(array, "array");
        return (T[]) v.b(this, array);
    }
}
