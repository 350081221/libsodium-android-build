package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.e0;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v;
import p4.l;
import w3.h;

/* JADX INFO: Add missing generic type declarations: [K] */
@i0(d1 = {"\u0000+\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0016\u0010\n\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0016\u0010\u000f\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0016\u0010\u0011\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\rR\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$keys$1", "", "", "isEmpty", "", "iterator", "Lkotlin/r2;", "clear", "", "elements", "addAll", "element", "add", "(Ljava/lang/Object;)Z", "retainAll", "removeAll", "remove", "containsAll", "contains", "", "getSize", "()I", "size", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1834:1\n363#2,6:1835\n373#2,3:1842\n376#2,9:1846\n363#2,6:1855\n373#2,3:1862\n376#2,9:1866\n633#2:1875\n634#2:1879\n636#2,2:1881\n638#2,4:1884\n642#2:1891\n643#2:1895\n644#2:1897\n645#2,4:1900\n651#2:1905\n652#2,8:1907\n1810#3:1841\n1672#3:1845\n1810#3:1861\n1672#3:1865\n1589#3,3:1876\n1603#3:1880\n1599#3:1883\n1779#3,3:1888\n1793#3,3:1892\n1717#3:1896\n1705#3:1898\n1699#3:1899\n1712#3:1904\n1802#3:1906\n1726#4,3:1915\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper$keys$1\n*L\n1450#1:1835,6\n1450#1:1842,3\n1450#1:1846,9\n1461#1:1855,6\n1461#1:1862,3\n1461#1:1866,9\n1471#1:1875\n1471#1:1879\n1471#1:1881,2\n1471#1:1884,4\n1471#1:1891\n1471#1:1895\n1471#1:1897\n1471#1:1900,4\n1471#1:1905\n1471#1:1907,8\n1450#1:1841\n1450#1:1845\n1461#1:1861\n1461#1:1865\n1471#1:1876,3\n1471#1:1880\n1471#1:1883\n1471#1:1888,3\n1471#1:1892,3\n1471#1:1896\n1471#1:1898\n1471#1:1899\n1471#1:1904\n1471#1:1906\n1480#1:1915,3\n*E\n"})
/* loaded from: classes.dex */
public final class MutableScatterMap$MutableMapWrapper$keys$1<K> implements Set<K>, h {
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public MutableScatterMap$MutableMapWrapper$keys$1(MutableScatterMap<K, V> mutableScatterMap) {
        this.this$0 = mutableScatterMap;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(K k5) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(@l Collection<? extends K> elements) {
        l0.p(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.this$0.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.this$0.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(@l Collection<? extends Object> elements) {
        l0.p(elements, "elements");
        Collection<? extends Object> collection = elements;
        MutableScatterMap<K, V> mutableScatterMap = this.this$0;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!mutableScatterMap.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int getSize() {
        return this.this$0._size;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.this$0.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    @l
    public Iterator<K> iterator() {
        return new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1(this.this$0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        r12 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            androidx.collection.MutableScatterMap<K, V> r2 = r0.this$0
            if (r1 == 0) goto Ld
            int r4 = r19.hashCode()
            goto Le
        Ld:
            r4 = 0
        Le:
            r5 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r4 = r4 * r5
            int r5 = r4 << 16
            r4 = r4 ^ r5
            r5 = r4 & 127(0x7f, float:1.78E-43)
            int r6 = r2._capacity
            int r4 = r4 >>> 7
            r4 = r4 & r6
            r7 = 0
        L1d:
            long[] r8 = r2.metadata
            int r9 = r4 >> 3
            r10 = r4 & 7
            int r10 = r10 << 3
            r11 = r8[r9]
            long r11 = r11 >>> r10
            r13 = 1
            int r9 = r9 + r13
            r14 = r8[r9]
            int r8 = 64 - r10
            long r8 = r14 << r8
            long r14 = (long) r10
            long r14 = -r14
            r10 = 63
            long r14 = r14 >> r10
            long r8 = r8 & r14
            long r8 = r8 | r11
            long r10 = (long) r5
            r14 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r14
            long r10 = r10 ^ r8
            long r14 = r10 - r14
            long r10 = ~r10
            long r10 = r10 & r14
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r14
        L49:
            r16 = 0
            int r12 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r12 == 0) goto L51
            r12 = r13
            goto L52
        L51:
            r12 = 0
        L52:
            if (r12 == 0) goto L6e
            int r12 = java.lang.Long.numberOfTrailingZeros(r10)
            int r12 = r12 >> 3
            int r12 = r12 + r4
            r12 = r12 & r6
            java.lang.Object[] r3 = r2.keys
            r3 = r3[r12]
            boolean r3 = kotlin.jvm.internal.l0.g(r3, r1)
            if (r3 == 0) goto L67
            goto L78
        L67:
            r16 = 1
            long r16 = r10 - r16
            long r10 = r10 & r16
            goto L49
        L6e:
            long r10 = ~r8
            r3 = 6
            long r10 = r10 << r3
            long r8 = r8 & r10
            long r8 = r8 & r14
            int r3 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r3 == 0) goto L82
            r12 = -1
        L78:
            if (r12 < 0) goto L80
            androidx.collection.MutableScatterMap<K, V> r1 = r0.this$0
            r1.removeValueAt(r12)
            return r13
        L80:
            r3 = 0
            return r3
        L82:
            r3 = 0
            int r7 = r7 + 8
            int r4 = r4 + r7
            r4 = r4 & r6
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1.remove(java.lang.Object):boolean");
    }

    @Override // java.util.Set, java.util.Collection
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
                            T1 = e0.T1(elements, mutableScatterMap.keys[i8]);
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

    @Override // java.util.Set, java.util.Collection
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
                            T1 = e0.T1(elements, mutableScatterMap.keys[i8]);
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

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return v.a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] array) {
        l0.p(array, "array");
        return (T[]) v.b(this, array);
    }
}
