package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.b1;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import u3.e;
import u3.i;

@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u00107\u001a\u00020\u0010¢\u0006\u0004\b8\u00109J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u001a\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\tJ\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u0010\u0010\f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001f\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\f\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J!\u0010\u0013\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\tJ'\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\n2\u000e\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016J!\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\tJ\b\u0010\u001c\u001a\u00020\u0010H\u0016J\b\u0010\u001d\u001a\u00020\u000eH\u0016J\u0010\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0017\u0010\u001f\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010$\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0017\u0010'\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b'\u0010(J\b\u0010)\u001a\u00020\nH\u0016J\u001f\u0010*\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010\u0018J\b\u0010,\u001a\u00020+H\u0016R\u0016\u0010-\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u001e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u000103028\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u001c\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u001c\u00106¨\u0006:"}, d2 = {"Landroidx/collection/LongSparseArray;", "E", "", "clone", "", DatabaseFileArchive.COLUMN_KEY, "get", "(J)Ljava/lang/Object;", "defaultValue", "(JLjava/lang/Object;)Ljava/lang/Object;", "Lkotlin/r2;", "delete", "remove", b.f22420d, "", "(JLjava/lang/Object;)Z", "", "index", "removeAt", "replace", "oldValue", "newValue", "(JLjava/lang/Object;Ljava/lang/Object;)Z", "put", "(JLjava/lang/Object;)V", "other", "putAll", "putIfAbsent", "size", "isEmpty", "keyAt", "valueAt", "(I)Ljava/lang/Object;", "setValueAt", "(ILjava/lang/Object;)V", "indexOfKey", "indexOfValue", "(Ljava/lang/Object;)I", "containsKey", "containsValue", "(Ljava/lang/Object;)Z", "clear", "append", "", "toString", "garbage", "Z", "", "keys", "[J", "", "", "values", "[Ljava/lang/Object;", "I", "initialCapacity", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLongSparseArray.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n+ 2 LongSparseArray.kt\nandroidx/collection/LongSparseArrayKt\n*L\n1#1,255:1\n243#2:256\n256#2,6:257\n248#2,14:263\n267#2,8:277\n267#2,8:285\n278#2,9:293\n291#2,5:302\n299#2,8:307\n315#2,9:315\n349#2,12:324\n328#2,18:336\n363#2,26:354\n392#2,5:380\n400#2,5:385\n409#2,2:390\n328#2,18:392\n412#2:410\n416#2:411\n420#2,6:412\n328#2,18:418\n427#2:436\n432#2,6:437\n328#2,18:443\n441#2:461\n446#2,6:462\n328#2,18:468\n453#2,2:486\n458#2,2:488\n328#2,18:490\n461#2:508\n466#2,2:509\n328#2,18:511\n469#2,6:529\n479#2:535\n484#2:536\n489#2,8:537\n500#2,6:545\n328#2,18:551\n507#2,10:569\n520#2,21:579\n*S KotlinDebug\n*F\n+ 1 LongSparseArray.jvm.kt\nandroidx/collection/LongSparseArray\n*L\n93#1:256\n93#1:257,6\n100#1:263,14\n106#1:277,8\n111#1:285,8\n120#1:293,9\n125#1:302,5\n134#1:307,8\n145#1:315,9\n151#1:324,12\n151#1:336,18\n151#1:354,26\n157#1:380,5\n168#1:385,5\n173#1:390,2\n173#1:392,18\n173#1:410\n180#1:411\n192#1:412,6\n192#1:418,18\n192#1:436\n204#1:437,6\n204#1:443,18\n204#1:461\n212#1:462,6\n212#1:468,18\n212#1:486,2\n219#1:488,2\n219#1:490,18\n219#1:508\n228#1:509,2\n228#1:511,18\n228#1:529,6\n231#1:535\n234#1:536\n239#1:537,8\n245#1:545,6\n245#1:551,18\n245#1:569,10\n253#1:579,21\n*E\n"})
/* loaded from: classes.dex */
public class LongSparseArray<E> implements Cloneable {

    @e
    public /* synthetic */ boolean garbage;

    @e
    public /* synthetic */ long[] keys;

    @e
    public /* synthetic */ int size;

    @e
    public /* synthetic */ Object[] values;

    @i
    public LongSparseArray() {
        this(0, 1, null);
    }

    @i
    public LongSparseArray(int i5) {
        if (i5 == 0) {
            this.keys = ContainerHelpersKt.EMPTY_LONGS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i5);
            this.keys = new long[idealLongArraySize];
            this.values = new Object[idealLongArraySize];
        }
    }

    public void append(long j5, E e5) {
        int i5 = this.size;
        if (i5 != 0 && j5 <= this.keys[i5 - 1]) {
            put(j5, e5);
            return;
        }
        if (this.garbage) {
            long[] jArr = this.keys;
            if (i5 >= jArr.length) {
                Object[] objArr = this.values;
                int i6 = 0;
                for (int i7 = 0; i7 < i5; i7++) {
                    Object obj = objArr[i7];
                    if (obj != LongSparseArrayKt.DELETED) {
                        if (i7 != i6) {
                            jArr[i6] = jArr[i7];
                            objArr[i6] = obj;
                            objArr[i7] = null;
                        }
                        i6++;
                    }
                }
                this.garbage = false;
                this.size = i6;
            }
        }
        int i8 = this.size;
        if (i8 >= this.keys.length) {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i8 + 1);
            long[] copyOf = Arrays.copyOf(this.keys, idealLongArraySize);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, idealLongArraySize);
            l0.o(copyOf2, "copyOf(this, newSize)");
            this.values = copyOf2;
        }
        this.keys[i8] = j5;
        this.values[i8] = e5;
        this.size = i8 + 1;
    }

    public void clear() {
        int i5 = this.size;
        Object[] objArr = this.values;
        for (int i6 = 0; i6 < i5; i6++) {
            objArr[i6] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public boolean containsKey(long j5) {
        return indexOfKey(j5) >= 0;
    }

    public boolean containsValue(E e5) {
        return indexOfValue(e5) >= 0;
    }

    @k(message = "Alias for `remove(key)`.", replaceWith = @b1(expression = "remove(key)", imports = {}))
    public void delete(long j5) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j5);
        if (binarySearch >= 0 && this.values[binarySearch] != LongSparseArrayKt.DELETED) {
            this.values[binarySearch] = LongSparseArrayKt.DELETED;
            this.garbage = true;
        }
    }

    @m
    public E get(long j5) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j5);
        if (binarySearch < 0 || this.values[binarySearch] == LongSparseArrayKt.DELETED) {
            return null;
        }
        return (E) this.values[binarySearch];
    }

    public int indexOfKey(long j5) {
        if (this.garbage) {
            int i5 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.garbage = false;
            this.size = i6;
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, j5);
    }

    public int indexOfValue(E e5) {
        if (this.garbage) {
            int i5 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.garbage = false;
            this.size = i6;
        }
        int i8 = this.size;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.values[i9] == e5) {
                return i9;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int i5) {
        boolean z4;
        if (i5 >= 0 && i5 < this.size) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this.garbage) {
                int i6 = this.size;
                long[] jArr = this.keys;
                Object[] objArr = this.values;
                int i7 = 0;
                for (int i8 = 0; i8 < i6; i8++) {
                    Object obj = objArr[i8];
                    if (obj != LongSparseArrayKt.DELETED) {
                        if (i8 != i7) {
                            jArr[i7] = jArr[i8];
                            objArr[i7] = obj;
                            objArr[i8] = null;
                        }
                        i7++;
                    }
                }
                this.garbage = false;
                this.size = i7;
            }
            return this.keys[i5];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i5).toString());
    }

    public void put(long j5, E e5) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j5);
        if (binarySearch >= 0) {
            this.values[binarySearch] = e5;
            return;
        }
        int i5 = ~binarySearch;
        if (i5 < this.size && this.values[i5] == LongSparseArrayKt.DELETED) {
            this.keys[i5] = j5;
            this.values[i5] = e5;
            return;
        }
        if (this.garbage) {
            int i6 = this.size;
            long[] jArr = this.keys;
            if (i6 >= jArr.length) {
                Object[] objArr = this.values;
                int i7 = 0;
                for (int i8 = 0; i8 < i6; i8++) {
                    Object obj = objArr[i8];
                    if (obj != LongSparseArrayKt.DELETED) {
                        if (i8 != i7) {
                            jArr[i7] = jArr[i8];
                            objArr[i7] = obj;
                            objArr[i8] = null;
                        }
                        i7++;
                    }
                }
                this.garbage = false;
                this.size = i7;
                i5 = ~ContainerHelpersKt.binarySearch(this.keys, i7, j5);
            }
        }
        int i9 = this.size;
        if (i9 >= this.keys.length) {
            int idealLongArraySize = ContainerHelpersKt.idealLongArraySize(i9 + 1);
            long[] copyOf = Arrays.copyOf(this.keys, idealLongArraySize);
            l0.o(copyOf, "copyOf(this, newSize)");
            this.keys = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.values, idealLongArraySize);
            l0.o(copyOf2, "copyOf(this, newSize)");
            this.values = copyOf2;
        }
        int i10 = this.size;
        if (i10 - i5 != 0) {
            long[] jArr2 = this.keys;
            int i11 = i5 + 1;
            o.A0(jArr2, jArr2, i11, i5, i10);
            Object[] objArr2 = this.values;
            o.B0(objArr2, objArr2, i11, i5, this.size);
        }
        this.keys[i5] = j5;
        this.values[i5] = e5;
        this.size++;
    }

    public void putAll(@l LongSparseArray<? extends E> other) {
        l0.p(other, "other");
        int size = other.size();
        for (int i5 = 0; i5 < size; i5++) {
            put(other.keyAt(i5), other.valueAt(i5));
        }
    }

    @m
    public E putIfAbsent(long j5, E e5) {
        E e6 = get(j5);
        if (e6 == null) {
            put(j5, e5);
        }
        return e6;
    }

    public void remove(long j5) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j5);
        if (binarySearch < 0 || this.values[binarySearch] == LongSparseArrayKt.DELETED) {
            return;
        }
        this.values[binarySearch] = LongSparseArrayKt.DELETED;
        this.garbage = true;
    }

    public void removeAt(int i5) {
        if (this.values[i5] != LongSparseArrayKt.DELETED) {
            this.values[i5] = LongSparseArrayKt.DELETED;
            this.garbage = true;
        }
    }

    @m
    public E replace(long j5, E e5) {
        int indexOfKey = indexOfKey(j5);
        if (indexOfKey < 0) {
            return null;
        }
        Object[] objArr = this.values;
        E e6 = (E) objArr[indexOfKey];
        objArr[indexOfKey] = e5;
        return e6;
    }

    public void setValueAt(int i5, E e5) {
        boolean z4;
        if (i5 >= 0 && i5 < this.size) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this.garbage) {
                int i6 = this.size;
                long[] jArr = this.keys;
                Object[] objArr = this.values;
                int i7 = 0;
                for (int i8 = 0; i8 < i6; i8++) {
                    Object obj = objArr[i8];
                    if (obj != LongSparseArrayKt.DELETED) {
                        if (i8 != i7) {
                            jArr[i7] = jArr[i8];
                            objArr[i7] = obj;
                            objArr[i8] = null;
                        }
                        i7++;
                    }
                }
                this.garbage = false;
                this.size = i7;
            }
            this.values[i5] = e5;
            return;
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i5).toString());
    }

    public int size() {
        if (this.garbage) {
            int i5 = this.size;
            long[] jArr = this.keys;
            Object[] objArr = this.values;
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                Object obj = objArr[i7];
                if (obj != LongSparseArrayKt.DELETED) {
                    if (i7 != i6) {
                        jArr[i6] = jArr[i7];
                        objArr[i6] = obj;
                        objArr[i7] = null;
                    }
                    i6++;
                }
            }
            this.garbage = false;
            this.size = i6;
        }
        return this.size;
    }

    @l
    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        sb.append('{');
        int i5 = this.size;
        for (int i6 = 0; i6 < i5; i6++) {
            if (i6 > 0) {
                sb.append(", ");
            }
            sb.append(keyAt(i6));
            sb.append(o0.a.f20835h);
            E valueAt = valueAt(i6);
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

    public E valueAt(int i5) {
        boolean z4;
        if (i5 >= 0 && i5 < this.size) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this.garbage) {
                int i6 = this.size;
                long[] jArr = this.keys;
                Object[] objArr = this.values;
                int i7 = 0;
                for (int i8 = 0; i8 < i6; i8++) {
                    Object obj = objArr[i8];
                    if (obj != LongSparseArrayKt.DELETED) {
                        if (i8 != i7) {
                            jArr[i7] = jArr[i8];
                            objArr[i7] = obj;
                            objArr[i8] = null;
                        }
                        i7++;
                    }
                }
                this.garbage = false;
                this.size = i7;
            }
            return (E) this.values[i5];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i5).toString());
    }

    @l
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public LongSparseArray<E> m25clone() {
        Object clone = super.clone();
        l0.n(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        LongSparseArray<E> longSparseArray = (LongSparseArray) clone;
        longSparseArray.keys = (long[]) this.keys.clone();
        longSparseArray.values = (Object[]) this.values.clone();
        return longSparseArray;
    }

    public E get(long j5, E e5) {
        int binarySearch = ContainerHelpersKt.binarySearch(this.keys, this.size, j5);
        return (binarySearch < 0 || this.values[binarySearch] == LongSparseArrayKt.DELETED) ? e5 : (E) this.values[binarySearch];
    }

    public boolean replace(long j5, E e5, E e6) {
        int indexOfKey = indexOfKey(j5);
        if (indexOfKey < 0 || !l0.g(this.values[indexOfKey], e5)) {
            return false;
        }
        this.values[indexOfKey] = e6;
        return true;
    }

    public boolean remove(long j5, E e5) {
        int indexOfKey = indexOfKey(j5);
        if (indexOfKey < 0 || !l0.g(e5, valueAt(indexOfKey))) {
            return false;
        }
        removeAt(indexOfKey);
        return true;
    }

    public /* synthetic */ LongSparseArray(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 10 : i5);
    }
}
