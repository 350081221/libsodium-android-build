package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import u3.h;
import u3.i;

@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0007\u0012\b\b\u0002\u0010=\u001a\u00020\u0005¢\u0006\u0004\b>\u0010?B#\b\u0016\u0012\u0018\u0010&\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\b>\u0010@J\u001f\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\u0005H\u0002J.\u0010\f\u001a\u00028\u0002\"\n\b\u0002\u0010\n*\u0004\u0018\u00018\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00028\u0002H\u0082\b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00028\u0001H\u0001¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u001a\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001d\u001a\u00028\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u0017\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b!\u0010 J\u001f\u0010\"\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\"\u0010#J\b\u0010$\u001a\u00020\u0012H\u0016J!\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0004\b%\u0010\rJ \u0010'\u001a\u00020\u000e2\u0016\u0010&\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016J!\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0004\b(\u0010\rJ\u0019\u0010)\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010\u001cJ\u001f\u0010)\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010 J!\u0010,\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0001H\u0016¢\u0006\u0004\b,\u0010\rJ'\u0010,\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010-\u001a\u00028\u00012\u0006\u0010.\u001a\u00028\u0001H\u0016¢\u0006\u0004\b,\u0010/J\b\u00100\u001a\u00020\u0005H\u0016J\u0013\u00102\u001a\u00020\u00122\b\u00101\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u00103\u001a\u00020\u0005H\u0016J\b\u00105\u001a\u000204H\u0016R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u001e\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u00100\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010<¨\u0006A"}, d2 = {"Landroidx/collection/SimpleArrayMap;", "K", "V", "", DatabaseFileArchive.COLUMN_KEY, "", "hash", "indexOf", "(Ljava/lang/Object;I)I", "indexOfNull", "T", "defaultValue", "getOrDefaultInternal", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/r2;", "clear", "minimumCapacity", "ensureCapacity", "", "containsKey", "(Ljava/lang/Object;)Z", "indexOfKey", "(Ljava/lang/Object;)I", b.f22420d, "__restricted$indexOfValue", "indexOfValue", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrDefault", "index", "keyAt", "(I)Ljava/lang/Object;", "valueAt", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", "isEmpty", "put", "map", "putAll", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "size", "other", "equals", TTDownloadField.TT_HASHCODE, "", "toString", "", "hashes", "[I", "", "array", "[Ljava/lang/Object;", "I", "capacity", "<init>", "(I)V", "(Landroidx/collection/SimpleArrayMap;)V", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nSimpleArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,769:1\n297#1,5:770\n297#1,5:775\n1#2:780\n*S KotlinDebug\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n*L\n276#1:770,5\n291#1:775,5\n*E\n"})
/* loaded from: classes.dex */
public class SimpleArrayMap<K, V> {

    @l
    private Object[] array;

    @l
    private int[] hashes;
    private int size;

    @i
    public SimpleArrayMap() {
        this(0, 1, null);
    }

    @i
    public SimpleArrayMap(int i5) {
        int[] iArr;
        Object[] objArr;
        if (i5 == 0) {
            iArr = ContainerHelpersKt.EMPTY_INTS;
        } else {
            iArr = new int[i5];
        }
        this.hashes = iArr;
        if (i5 == 0) {
            objArr = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            objArr = new Object[i5 << 1];
        }
        this.array = objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends V> T getOrDefaultInternal(Object obj, T t5) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            return (T) this.array[(indexOfKey << 1) + 1];
        }
        return t5;
    }

    private final int indexOf(K k5, int i5) {
        int i6 = this.size;
        if (i6 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.hashes, i6, i5);
        if (binarySearch < 0) {
            return binarySearch;
        }
        if (l0.g(k5, this.array[binarySearch << 1])) {
            return binarySearch;
        }
        int i7 = binarySearch + 1;
        while (i7 < i6 && this.hashes[i7] == i5) {
            if (l0.g(k5, this.array[i7 << 1])) {
                return i7;
            }
            i7++;
        }
        for (int i8 = binarySearch - 1; i8 >= 0 && this.hashes[i8] == i5; i8--) {
            if (l0.g(k5, this.array[i8 << 1])) {
                return i8;
            }
        }
        return ~i7;
    }

    private final int indexOfNull() {
        int i5 = this.size;
        if (i5 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpersKt.binarySearch(this.hashes, i5, 0);
        if (binarySearch < 0) {
            return binarySearch;
        }
        if (this.array[binarySearch << 1] == null) {
            return binarySearch;
        }
        int i6 = binarySearch + 1;
        while (i6 < i5 && this.hashes[i6] == 0) {
            if (this.array[i6 << 1] == null) {
                return i6;
            }
            i6++;
        }
        for (int i7 = binarySearch - 1; i7 >= 0 && this.hashes[i7] == 0; i7--) {
            if (this.array[i7 << 1] == null) {
                return i7;
            }
        }
        return ~i6;
    }

    @h(name = "__restricted$indexOfValue")
    public final int __restricted$indexOfValue(V v4) {
        int i5 = this.size * 2;
        Object[] objArr = this.array;
        if (v4 == null) {
            for (int i6 = 1; i6 < i5; i6 += 2) {
                if (objArr[i6] == null) {
                    return i6 >> 1;
                }
            }
            return -1;
        }
        for (int i7 = 1; i7 < i5; i7 += 2) {
            if (l0.g(v4, objArr[i7])) {
                return i7 >> 1;
            }
        }
        return -1;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.array = ContainerHelpersKt.EMPTY_OBJECTS;
            this.size = 0;
        }
        if (this.size <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K k5) {
        return indexOfKey(k5) >= 0;
    }

    public boolean containsValue(V v4) {
        return __restricted$indexOfValue(v4) >= 0;
    }

    public void ensureCapacity(int i5) {
        int i6 = this.size;
        int[] iArr = this.hashes;
        if (iArr.length < i5) {
            int[] copyOf = Arrays.copyOf(iArr, i5);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, i5 * 2);
            l0.o(copyOf2, "copyOf(this, newSize)");
            this.array = copyOf2;
        }
        if (this.size == i6) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof SimpleArrayMap) {
                if (size() != ((SimpleArrayMap) obj).size()) {
                    return false;
                }
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i5 = this.size;
                for (int i6 = 0; i6 < i5; i6++) {
                    K keyAt = keyAt(i6);
                    V valueAt = valueAt(i6);
                    Object obj2 = simpleArrayMap.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 != null || !simpleArrayMap.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!l0.g(valueAt, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || size() != ((Map) obj).size()) {
                return false;
            }
            int i7 = this.size;
            for (int i8 = 0; i8 < i7; i8++) {
                K keyAt2 = keyAt(i8);
                V valueAt2 = valueAt(i8);
                Object obj3 = ((Map) obj).get(keyAt2);
                if (valueAt2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(keyAt2)) {
                        return false;
                    }
                } else if (!l0.g(valueAt2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    @m
    public V get(K k5) {
        int indexOfKey = indexOfKey(k5);
        if (indexOfKey >= 0) {
            return (V) this.array[(indexOfKey << 1) + 1];
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public V getOrDefault(@m Object obj, V v4) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            return (V) this.array[(indexOfKey << 1) + 1];
        }
        return v4;
    }

    public int hashCode() {
        int i5;
        int[] iArr = this.hashes;
        Object[] objArr = this.array;
        int i6 = this.size;
        int i7 = 1;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i6) {
            Object obj = objArr[i7];
            int i10 = iArr[i8];
            if (obj != null) {
                i5 = obj.hashCode();
            } else {
                i5 = 0;
            }
            i9 += i5 ^ i10;
            i8++;
            i7 += 2;
        }
        return i9;
    }

    public int indexOfKey(K k5) {
        if (k5 == null) {
            return indexOfNull();
        }
        return indexOf(k5, k5.hashCode());
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public K keyAt(int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < this.size) {
            z4 = true;
        }
        if (z4) {
            return (K) this.array[i5 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i5).toString());
    }

    @m
    public V put(K k5, V v4) {
        int i5;
        int indexOfNull;
        int i6 = this.size;
        if (k5 != null) {
            i5 = k5.hashCode();
        } else {
            i5 = 0;
        }
        if (k5 != null) {
            indexOfNull = indexOf(k5, i5);
        } else {
            indexOfNull = indexOfNull();
        }
        if (indexOfNull >= 0) {
            int i7 = (indexOfNull << 1) + 1;
            Object[] objArr = this.array;
            V v5 = (V) objArr[i7];
            objArr[i7] = v4;
            return v5;
        }
        int i8 = ~indexOfNull;
        int[] iArr = this.hashes;
        if (i6 >= iArr.length) {
            int i9 = 8;
            if (i6 >= 8) {
                i9 = (i6 >> 1) + i6;
            } else if (i6 < 4) {
                i9 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i9);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, i9 << 1);
            l0.o(copyOf2, "copyOf(this, newSize)");
            this.array = copyOf2;
            if (i6 != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i8 < i6) {
            int[] iArr2 = this.hashes;
            int i10 = i8 + 1;
            o.z0(iArr2, iArr2, i10, i8, i6);
            Object[] objArr2 = this.array;
            o.B0(objArr2, objArr2, i10 << 1, i8 << 1, this.size << 1);
        }
        int i11 = this.size;
        if (i6 == i11) {
            int[] iArr3 = this.hashes;
            if (i8 < iArr3.length) {
                iArr3[i8] = i5;
                Object[] objArr3 = this.array;
                int i12 = i8 << 1;
                objArr3[i12] = k5;
                objArr3[i12 + 1] = v4;
                this.size = i11 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public void putAll(@l SimpleArrayMap<? extends K, ? extends V> map) {
        l0.p(map, "map");
        int i5 = map.size;
        ensureCapacity(this.size + i5);
        if (this.size == 0) {
            if (i5 > 0) {
                o.z0(map.hashes, this.hashes, 0, 0, i5);
                o.B0(map.array, this.array, 0, 0, i5 << 1);
                this.size = i5;
                return;
            }
            return;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            put(map.keyAt(i6), map.valueAt(i6));
        }
    }

    @m
    public V putIfAbsent(K k5, V v4) {
        V v5 = get(k5);
        if (v5 == null) {
            return put(k5, v4);
        }
        return v5;
    }

    @m
    public V remove(K k5) {
        int indexOfKey = indexOfKey(k5);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    public V removeAt(int i5) {
        boolean z4;
        if (i5 >= 0 && i5 < this.size) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            Object[] objArr = this.array;
            int i6 = i5 << 1;
            V v4 = (V) objArr[i6 + 1];
            int i7 = this.size;
            if (i7 <= 1) {
                clear();
            } else {
                int i8 = i7 - 1;
                int[] iArr = this.hashes;
                int i9 = 8;
                if (iArr.length > 8 && i7 < iArr.length / 3) {
                    if (i7 > 8) {
                        i9 = i7 + (i7 >> 1);
                    }
                    int[] copyOf = Arrays.copyOf(iArr, i9);
                    l0.o(copyOf, "copyOf(this, newSize)");
                    this.hashes = copyOf;
                    Object[] copyOf2 = Arrays.copyOf(this.array, i9 << 1);
                    l0.o(copyOf2, "copyOf(this, newSize)");
                    this.array = copyOf2;
                    if (i7 == this.size) {
                        if (i5 > 0) {
                            o.z0(iArr, this.hashes, 0, 0, i5);
                            o.B0(objArr, this.array, 0, 0, i6);
                        }
                        if (i5 < i8) {
                            int i10 = i5 + 1;
                            int i11 = i8 + 1;
                            o.z0(iArr, this.hashes, i5, i10, i11);
                            o.B0(objArr, this.array, i6, i10 << 1, i11 << 1);
                        }
                    } else {
                        throw new ConcurrentModificationException();
                    }
                } else {
                    if (i5 < i8) {
                        int i12 = i5 + 1;
                        int i13 = i8 + 1;
                        o.z0(iArr, iArr, i5, i12, i13);
                        Object[] objArr2 = this.array;
                        o.B0(objArr2, objArr2, i6, i12 << 1, i13 << 1);
                    }
                    Object[] objArr3 = this.array;
                    int i14 = i8 << 1;
                    objArr3[i14] = null;
                    objArr3[i14 + 1] = null;
                }
                if (i7 == this.size) {
                    this.size = i8;
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            return v4;
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i5).toString());
    }

    @m
    public V replace(K k5, V v4) {
        int indexOfKey = indexOfKey(k5);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, v4);
        }
        return null;
    }

    public V setValueAt(int i5, V v4) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < this.size) {
            z4 = true;
        }
        if (z4) {
            int i6 = (i5 << 1) + 1;
            Object[] objArr = this.array;
            V v5 = (V) objArr[i6];
            objArr[i6] = v4;
            return v5;
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i5).toString());
    }

    public int size() {
        return this.size;
    }

    @l
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i5 = this.size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            K keyAt = keyAt(i6);
            if (keyAt != sb) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append(o0.a.f20835h);
            V valueAt = valueAt(i6);
            if (valueAt != sb) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        l0.o(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public V valueAt(int i5) {
        boolean z4 = false;
        if (i5 >= 0 && i5 < this.size) {
            z4 = true;
        }
        if (z4) {
            return (V) this.array[(i5 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i5).toString());
    }

    public boolean remove(K k5, V v4) {
        int indexOfKey = indexOfKey(k5);
        if (indexOfKey < 0 || !l0.g(v4, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public boolean replace(K k5, V v4, V v5) {
        int indexOfKey = indexOfKey(k5);
        if (indexOfKey < 0 || !l0.g(v4, valueAt(indexOfKey))) {
            return false;
        }
        setValueAt(indexOfKey, v5);
        return true;
    }

    public /* synthetic */ SimpleArrayMap(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 0 : i5);
    }

    public SimpleArrayMap(@m SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }
}
