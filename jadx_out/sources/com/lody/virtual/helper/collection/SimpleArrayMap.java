package com.lody.virtual.helper.collection;

import java.util.Map;
import o0.a;

/* loaded from: classes3.dex */
public class SimpleArrayMap<K, V> {
    private static final int BASE_SIZE = 4;
    private static final int CACHE_SIZE = 10;
    private static final boolean DEBUG = false;
    private static final String TAG = "ArrayMap";
    static Object[] mBaseCache;
    static int mBaseCacheSize;
    static Object[] mTwiceBaseCache;
    static int mTwiceBaseCacheSize;
    Object[] mArray;
    int[] mHashes;
    int mSize;

    public SimpleArrayMap() {
        this.mHashes = ContainerHelpers.EMPTY_INTS;
        this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        this.mSize = 0;
    }

    private void allocArrays(int i5) {
        if (i5 == 8) {
            synchronized (ArrayMap.class) {
                Object[] objArr = mTwiceBaseCache;
                if (objArr != null) {
                    this.mArray = objArr;
                    mTwiceBaseCache = (Object[]) objArr[0];
                    this.mHashes = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    mTwiceBaseCacheSize--;
                    return;
                }
            }
        } else if (i5 == 4) {
            synchronized (ArrayMap.class) {
                Object[] objArr2 = mBaseCache;
                if (objArr2 != null) {
                    this.mArray = objArr2;
                    mBaseCache = (Object[]) objArr2[0];
                    this.mHashes = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    mBaseCacheSize--;
                    return;
                }
            }
        }
        this.mHashes = new int[i5];
        this.mArray = new Object[i5 << 1];
    }

    private static void freeArrays(int[] iArr, Object[] objArr, int i5) {
        if (iArr.length == 8) {
            synchronized (ArrayMap.class) {
                if (mTwiceBaseCacheSize < 10) {
                    objArr[0] = mTwiceBaseCache;
                    objArr[1] = iArr;
                    for (int i6 = (i5 << 1) - 1; i6 >= 2; i6--) {
                        objArr[i6] = null;
                    }
                    mTwiceBaseCache = objArr;
                    mTwiceBaseCacheSize++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (ArrayMap.class) {
                if (mBaseCacheSize < 10) {
                    objArr[0] = mBaseCache;
                    objArr[1] = iArr;
                    for (int i7 = (i5 << 1) - 1; i7 >= 2; i7--) {
                        objArr[i7] = null;
                    }
                    mBaseCache = objArr;
                    mBaseCacheSize++;
                }
            }
        }
    }

    public void clear() {
        int i5 = this.mSize;
        if (i5 != 0) {
            freeArrays(this.mHashes, this.mArray, i5);
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
            this.mSize = 0;
        }
    }

    public boolean containsKey(Object obj) {
        return indexOfKey(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return indexOfValue(obj) >= 0;
    }

    public void ensureCapacity(int i5) {
        int[] iArr = this.mHashes;
        if (iArr.length < i5) {
            Object[] objArr = this.mArray;
            allocArrays(i5);
            int i6 = this.mSize;
            if (i6 > 0) {
                System.arraycopy(iArr, 0, this.mHashes, 0, i6);
                System.arraycopy(objArr, 0, this.mArray, 0, this.mSize << 1);
            }
            freeArrays(iArr, objArr, this.mSize);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.mSize; i5++) {
                try {
                    K keyAt = keyAt(i5);
                    V valueAt = valueAt(i5);
                    Object obj2 = map.get(keyAt);
                    if (valueAt == null) {
                        if (obj2 != null || !map.containsKey(keyAt)) {
                            return false;
                        }
                    } else if (!valueAt.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            return (V) this.mArray[(indexOfKey << 1) + 1];
        }
        return null;
    }

    public int hashCode() {
        int hashCode;
        int[] iArr = this.mHashes;
        Object[] objArr = this.mArray;
        int i5 = this.mSize;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i7 < i5) {
            Object obj = objArr[i6];
            int i9 = iArr[i7];
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            i8 += hashCode ^ i9;
            i7++;
            i6 += 2;
        }
        return i8;
    }

    int indexOf(Object obj, int i5) {
        int i6 = this.mSize;
        if (i6 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpers.binarySearch(this.mHashes, i6, i5);
        if (binarySearch < 0) {
            return binarySearch;
        }
        if (obj.equals(this.mArray[binarySearch << 1])) {
            return binarySearch;
        }
        int i7 = binarySearch + 1;
        while (i7 < i6 && this.mHashes[i7] == i5) {
            if (obj.equals(this.mArray[i7 << 1])) {
                return i7;
            }
            i7++;
        }
        for (int i8 = binarySearch - 1; i8 >= 0 && this.mHashes[i8] == i5; i8--) {
            if (obj.equals(this.mArray[i8 << 1])) {
                return i8;
            }
        }
        return ~i7;
    }

    public int indexOfKey(Object obj) {
        return obj == null ? indexOfNull() : indexOf(obj, obj.hashCode());
    }

    int indexOfNull() {
        int i5 = this.mSize;
        if (i5 == 0) {
            return -1;
        }
        int binarySearch = ContainerHelpers.binarySearch(this.mHashes, i5, 0);
        if (binarySearch < 0) {
            return binarySearch;
        }
        if (this.mArray[binarySearch << 1] == null) {
            return binarySearch;
        }
        int i6 = binarySearch + 1;
        while (i6 < i5 && this.mHashes[i6] == 0) {
            if (this.mArray[i6 << 1] == null) {
                return i6;
            }
            i6++;
        }
        for (int i7 = binarySearch - 1; i7 >= 0 && this.mHashes[i7] == 0; i7--) {
            if (this.mArray[i7 << 1] == null) {
                return i7;
            }
        }
        return ~i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int indexOfValue(Object obj) {
        int i5 = this.mSize * 2;
        Object[] objArr = this.mArray;
        if (obj == null) {
            for (int i6 = 1; i6 < i5; i6 += 2) {
                if (objArr[i6] == null) {
                    return i6 >> 1;
                }
            }
            return -1;
        }
        for (int i7 = 1; i7 < i5; i7 += 2) {
            if (obj.equals(objArr[i7])) {
                return i7 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.mSize <= 0;
    }

    public K keyAt(int i5) {
        return (K) this.mArray[i5 << 1];
    }

    public V put(K k5, V v4) {
        int i5;
        int indexOf;
        if (k5 == null) {
            indexOf = indexOfNull();
            i5 = 0;
        } else {
            int hashCode = k5.hashCode();
            i5 = hashCode;
            indexOf = indexOf(k5, hashCode);
        }
        if (indexOf >= 0) {
            int i6 = (indexOf << 1) + 1;
            Object[] objArr = this.mArray;
            V v5 = (V) objArr[i6];
            objArr[i6] = v4;
            return v5;
        }
        int i7 = ~indexOf;
        int i8 = this.mSize;
        int[] iArr = this.mHashes;
        if (i8 >= iArr.length) {
            int i9 = 8;
            if (i8 >= 8) {
                i9 = (i8 >> 1) + i8;
            } else if (i8 < 4) {
                i9 = 4;
            }
            Object[] objArr2 = this.mArray;
            allocArrays(i9);
            int[] iArr2 = this.mHashes;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.mArray, 0, objArr2.length);
            }
            freeArrays(iArr, objArr2, this.mSize);
        }
        int i10 = this.mSize;
        if (i7 < i10) {
            int[] iArr3 = this.mHashes;
            int i11 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i11, i10 - i7);
            Object[] objArr3 = this.mArray;
            System.arraycopy(objArr3, i7 << 1, objArr3, i11 << 1, (this.mSize - i7) << 1);
        }
        this.mHashes[i7] = i5;
        Object[] objArr4 = this.mArray;
        int i12 = i7 << 1;
        objArr4[i12] = k5;
        objArr4[i12 + 1] = v4;
        this.mSize++;
        return null;
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        int i5 = simpleArrayMap.mSize;
        ensureCapacity(this.mSize + i5);
        if (this.mSize == 0) {
            if (i5 > 0) {
                System.arraycopy(simpleArrayMap.mHashes, 0, this.mHashes, 0, i5);
                System.arraycopy(simpleArrayMap.mArray, 0, this.mArray, 0, i5 << 1);
                this.mSize = i5;
                return;
            }
            return;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            put(simpleArrayMap.keyAt(i6), simpleArrayMap.valueAt(i6));
        }
    }

    public V remove(Object obj) {
        int indexOfKey = indexOfKey(obj);
        if (indexOfKey >= 0) {
            return removeAt(indexOfKey);
        }
        return null;
    }

    public V removeAt(int i5) {
        Object[] objArr = this.mArray;
        int i6 = i5 << 1;
        V v4 = (V) objArr[i6 + 1];
        int i7 = this.mSize;
        if (i7 <= 1) {
            freeArrays(this.mHashes, objArr, i7);
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
            this.mSize = 0;
        } else {
            int[] iArr = this.mHashes;
            int i8 = 8;
            if (iArr.length > 8 && i7 < iArr.length / 3) {
                if (i7 > 8) {
                    i8 = i7 + (i7 >> 1);
                }
                allocArrays(i8);
                this.mSize--;
                if (i5 > 0) {
                    System.arraycopy(iArr, 0, this.mHashes, 0, i5);
                    System.arraycopy(objArr, 0, this.mArray, 0, i6);
                }
                int i9 = this.mSize;
                if (i5 < i9) {
                    int i10 = i5 + 1;
                    System.arraycopy(iArr, i10, this.mHashes, i5, i9 - i5);
                    System.arraycopy(objArr, i10 << 1, this.mArray, i6, (this.mSize - i5) << 1);
                }
            } else {
                int i11 = i7 - 1;
                this.mSize = i11;
                if (i5 < i11) {
                    int i12 = i5 + 1;
                    System.arraycopy(iArr, i12, iArr, i5, i11 - i5);
                    Object[] objArr2 = this.mArray;
                    System.arraycopy(objArr2, i12 << 1, objArr2, i6, (this.mSize - i5) << 1);
                }
                Object[] objArr3 = this.mArray;
                int i13 = this.mSize;
                objArr3[i13 << 1] = null;
                objArr3[(i13 << 1) + 1] = null;
            }
        }
        return v4;
    }

    public V setValueAt(int i5, V v4) {
        int i6 = (i5 << 1) + 1;
        Object[] objArr = this.mArray;
        V v5 = (V) objArr[i6];
        objArr[i6] = v4;
        return v5;
    }

    public int size() {
        return this.mSize;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.mSize * 28);
        sb.append('{');
        for (int i5 = 0; i5 < this.mSize; i5++) {
            if (i5 > 0) {
                sb.append(", ");
            }
            K keyAt = keyAt(i5);
            if (keyAt != this) {
                sb.append(keyAt);
            } else {
                sb.append("(this Map)");
            }
            sb.append(a.f20835h);
            V valueAt = valueAt(i5);
            if (valueAt != this) {
                sb.append(valueAt);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public V valueAt(int i5) {
        return (V) this.mArray[(i5 << 1) + 1];
    }

    public SimpleArrayMap(int i5) {
        if (i5 == 0) {
            this.mHashes = ContainerHelpers.EMPTY_INTS;
            this.mArray = ContainerHelpers.EMPTY_OBJECTS;
        } else {
            allocArrays(i5);
        }
        this.mSize = 0;
    }

    public SimpleArrayMap(SimpleArrayMap simpleArrayMap) {
        this();
        if (simpleArrayMap != null) {
            putAll(simpleArrayMap);
        }
    }
}
