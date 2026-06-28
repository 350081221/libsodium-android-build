package androidx.compose.ui.text.caches;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.w;
import o0.a;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import u3.h;
import u3.i;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0010\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0013\b\u0017\u0012\b\b\u0002\u0010A\u001a\u00020\u0005¢\u0006\u0004\bB\u0010=B\u001f\b\u0016\u0012\u0014\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0004\bB\u0010DJ\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0004J\b\u0010\b\u001a\u00020\u0005H\u0004J\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005J\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u001a\u0010\u0016\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001dJ\u001d\u0010\u001f\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u001f\u0010 J\u0006\u0010!\u001a\u00020\rJ\u001f\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u001e\u0010$\u001a\u00020\t2\u0016\u0010#\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000J\u001f\u0010%\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b%\u0010\u001aJ\u0017\u0010&\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b&\u0010\u0017J\u001d\u0010&\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b(\u0010\u001dJ\u001f\u0010)\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b)\u0010\u001aJ%\u0010)\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010*\u001a\u00028\u00012\u0006\u0010+\u001a\u00028\u0001¢\u0006\u0004\b)\u0010,J\u0013\u0010.\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010/\u001a\u00020\u0005H\u0016J\b\u00101\u001a\u000200H\u0016R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0003058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u00108\u001a\u00020\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0017\u0010>\u001a\u00020\u00058G¢\u0006\f\u0012\u0004\b?\u0010@\u001a\u0004\b>\u0010;¨\u0006E"}, d2 = {"Landroidx/compose/ui/text/caches/SimpleArrayMap;", "K", "V", "", DatabaseFileArchive.COLUMN_KEY, "", "hash", "indexOf", "indexOfNull", "Lkotlin/r2;", "clear", "minimumCapacity", "ensureCapacity", "", "containsKey", "(Ljava/lang/Object;)Z", "indexOfKey", b.f22420d, "indexOfValue$ui_text_release", "(Ljava/lang/Object;)I", "indexOfValue", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "defaultValue", "getOrDefault", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "index", "keyAt", "(I)Ljava/lang/Object;", "valueAt", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", "isEmpty", "put", "array", "putAll", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "other", "equals", TTDownloadField.TT_HASHCODE, "", "toString", "", "hashes", "[I", "", "keyValues", "[Ljava/lang/Object;", "_size", "I", "get_size", "()I", "set_size", "(I)V", "size", "size$annotations", "()V", "capacity", "<init>", "map", "(Landroidx/compose/ui/text/caches/SimpleArrayMap;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class SimpleArrayMap<K, V> {
    public static final int $stable = 8;
    private int _size;

    @l
    private int[] hashes;

    @l
    private Object[] keyValues;

    @i
    public SimpleArrayMap() {
        this(0, 1, null);
    }

    @i
    public SimpleArrayMap(int i5) {
        if (i5 == 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.keyValues = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            this.hashes = new int[i5];
            this.keyValues = new Object[i5 << 1];
        }
        this._size = 0;
    }

    public static /* synthetic */ void size$annotations() {
    }

    public final void clear() {
        if (this._size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.keyValues = ContainerHelpersKt.EMPTY_OBJECTS;
            this._size = 0;
        }
        if (this._size <= 0) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(K k5) {
        return indexOfKey(k5) >= 0;
    }

    public final boolean containsValue(V v4) {
        return indexOfValue$ui_text_release(v4) >= 0;
    }

    public final void ensureCapacity(int i5) {
        int i6 = this._size;
        int[] iArr = this.hashes;
        if (iArr.length < i5) {
            int[] copyOf = Arrays.copyOf(iArr, i5);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.keyValues, i5 << 1);
            l0.o(copyOf2, "copyOf(this, newSize)");
            this.keyValues = copyOf2;
        }
        if (this._size == i6) {
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
                SimpleArrayMap simpleArrayMap = (SimpleArrayMap) obj;
                int i5 = this._size;
                if (i5 != simpleArrayMap._size) {
                    return false;
                }
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
            if (!(obj instanceof Map) || this._size != ((Map) obj).size()) {
                return false;
            }
            int i7 = this._size;
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
    public final V get(K k5) {
        int indexOfKey = indexOfKey(k5);
        if (indexOfKey >= 0) {
            return (V) this.keyValues[(indexOfKey << 1) + 1];
        }
        return null;
    }

    public final V getOrDefault(K k5, V v4) {
        int indexOfKey = indexOfKey(k5);
        if (indexOfKey >= 0) {
            return (V) this.keyValues[(indexOfKey << 1) + 1];
        }
        return v4;
    }

    protected final int get_size() {
        return this._size;
    }

    public int hashCode() {
        int i5;
        int[] iArr = this.hashes;
        Object[] objArr = this.keyValues;
        int i6 = this._size;
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

    protected final int indexOf(@l Object obj, int i5) {
        int i6 = this._size;
        if (i6 == 0) {
            return -1;
        }
        int binarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.hashes, i6, i5);
        if (binarySearchInternal < 0) {
            return binarySearchInternal;
        }
        if (l0.g(obj, this.keyValues[binarySearchInternal << 1])) {
            return binarySearchInternal;
        }
        int i7 = binarySearchInternal + 1;
        while (i7 < i6 && this.hashes[i7] == i5) {
            if (l0.g(obj, this.keyValues[i7 << 1])) {
                return i7;
            }
            i7++;
        }
        for (int i8 = binarySearchInternal - 1; i8 >= 0 && this.hashes[i8] == i5; i8--) {
            if (l0.g(obj, this.keyValues[i8 << 1])) {
                return i8;
            }
        }
        return ~i7;
    }

    public final int indexOfKey(@m Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj, obj.hashCode());
    }

    protected final int indexOfNull() {
        int i5 = this._size;
        if (i5 == 0) {
            return -1;
        }
        int binarySearchInternal = ContainerHelpersKt.binarySearchInternal(this.hashes, i5, 0);
        if (binarySearchInternal < 0) {
            return binarySearchInternal;
        }
        if (this.keyValues[binarySearchInternal << 1] == null) {
            return binarySearchInternal;
        }
        int i6 = binarySearchInternal + 1;
        while (i6 < i5 && this.hashes[i6] == 0) {
            if (this.keyValues[i6 << 1] == null) {
                return i6;
            }
            i6++;
        }
        for (int i7 = binarySearchInternal - 1; i7 >= 0 && this.hashes[i7] == 0; i7--) {
            if (this.keyValues[i7 << 1] == null) {
                return i7;
            }
        }
        return ~i6;
    }

    public final int indexOfValue$ui_text_release(V v4) {
        int i5 = this._size << 1;
        Object[] objArr = this.keyValues;
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

    public final boolean isEmpty() {
        return this._size <= 0;
    }

    public final K keyAt(int i5) {
        return (K) this.keyValues[i5 << 1];
    }

    @m
    public final V put(K k5, V v4) {
        int hashCode;
        int indexOf;
        int i5 = this._size;
        if (k5 == null) {
            indexOf = indexOfNull();
            hashCode = 0;
        } else {
            hashCode = k5.hashCode();
            indexOf = indexOf(k5, hashCode);
        }
        if (indexOf >= 0) {
            int i6 = (indexOf << 1) + 1;
            Object[] objArr = this.keyValues;
            V v5 = (V) objArr[i6];
            objArr[i6] = v4;
            return v5;
        }
        int i7 = ~indexOf;
        int[] iArr = this.hashes;
        if (i5 >= iArr.length) {
            int i8 = 8;
            if (i5 >= 8) {
                i8 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i8 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i8);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.keyValues, i8 << 1);
            l0.o(copyOf2, "copyOf(this, newSize)");
            this.keyValues = copyOf2;
            if (i5 != this._size) {
                throw new ConcurrentModificationException();
            }
        }
        if (i7 < i5) {
            int[] iArr2 = this.hashes;
            int i9 = i7 + 1;
            o.z0(iArr2, iArr2, i9, i7, i5);
            Object[] objArr2 = this.keyValues;
            o.B0(objArr2, objArr2, i9 << 1, i7 << 1, this._size << 1);
        }
        int i10 = this._size;
        if (i5 == i10) {
            int[] iArr3 = this.hashes;
            if (i7 < iArr3.length) {
                iArr3[i7] = hashCode;
                Object[] objArr3 = this.keyValues;
                int i11 = i7 << 1;
                objArr3[i11] = k5;
                objArr3[i11 + 1] = v4;
                this._size = i10 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final void putAll(@l SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        int i5 = simpleArrayMap._size;
        ensureCapacity(this._size + i5);
        if (this._size == 0) {
            if (i5 > 0) {
                o.z0(simpleArrayMap.hashes, this.hashes, 0, 0, i5);
                o.B0(simpleArrayMap.keyValues, this.keyValues, 0, 0, i5 << 1);
                this._size = i5;
                return;
            }
            return;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            put(simpleArrayMap.keyAt(i6), simpleArrayMap.valueAt(i6));
        }
    }

    @m
    public final V putIfAbsent(K k5, V v4) {
        V v5 = get(k5);
        if (v5 == null) {
            return put(k5, v4);
        }
        return v5;
    }

    @m
    public final V remove(K k5) {
        int indexOfKey = indexOfKey(k5);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    @m
    public final V removeAt(int i5) {
        Object[] objArr = this.keyValues;
        int i6 = i5 << 1;
        V v4 = (V) objArr[i6 + 1];
        int i7 = this._size;
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
                int[] iArr2 = new int[i9];
                this.hashes = iArr2;
                this.keyValues = new Object[i9 << 1];
                if (i5 > 0) {
                    o.z0(iArr, iArr2, 0, 0, i5);
                    o.B0(objArr, this.keyValues, 0, 0, i6);
                }
                if (i5 < i8) {
                    int i10 = i5 + 1;
                    int i11 = i8 + 1;
                    o.z0(iArr, this.hashes, i5, i10, i11);
                    o.B0(objArr, this.keyValues, i6, i10 << 1, i11 << 1);
                }
            } else {
                if (i5 < i8) {
                    int i12 = i5 + 1;
                    int i13 = i8 + 1;
                    o.z0(iArr, iArr, i5, i12, i13);
                    Object[] objArr2 = this.keyValues;
                    o.B0(objArr2, objArr2, i6, i12 << 1, i13 << 1);
                }
                Object[] objArr3 = this.keyValues;
                int i14 = i8 << 1;
                objArr3[i14] = null;
                objArr3[i14 + 1] = null;
            }
            if (i7 == this._size) {
                this._size = i8;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v4;
    }

    @m
    public final V replace(K k5, V v4) {
        int indexOfKey = indexOfKey(k5);
        if (indexOfKey >= 0) {
            return setValueAt(indexOfKey, v4);
        }
        return null;
    }

    public final V setValueAt(int i5, V v4) {
        int i6 = (i5 << 1) + 1;
        Object[] objArr = this.keyValues;
        V v5 = (V) objArr[i6];
        objArr[i6] = v4;
        return v5;
    }

    protected final void set_size(int i5) {
        this._size = i5;
    }

    @h(name = "size")
    public final int size() {
        return this._size;
    }

    @l
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this._size * 28);
        sb.append('{');
        int i5 = this._size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            K keyAt = keyAt(i6);
            if (keyAt != this) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append(a.f20835h);
            V valueAt = valueAt(i6);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public final V valueAt(int i5) {
        return (V) this.keyValues[(i5 << 1) + 1];
    }

    public final boolean remove(K k5, V v4) {
        int indexOfKey = indexOfKey(k5);
        if (indexOfKey < 0 || !l0.g(v4, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public final boolean replace(K k5, V v4, V v5) {
        int indexOfKey = indexOfKey(k5);
        if (indexOfKey < 0 || valueAt(indexOfKey) != v4) {
            return false;
        }
        setValueAt(indexOfKey, v5);
        return true;
    }

    public /* synthetic */ SimpleArrayMap(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 0 : i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleArrayMap(@m SimpleArrayMap<K, V> simpleArrayMap) {
        this(0, 1, null);
        if (simpleArrayMap != 0) {
            putAll(simpleArrayMap);
        }
    }
}
