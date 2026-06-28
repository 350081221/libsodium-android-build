package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u000f\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0001B\u0011\u0012\b\b\u0002\u0010-\u001a\u00020\u0005¢\u0006\u0004\b.\u0010/J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\t\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0010J\u0006\u0010\u0016\u001a\u00020\u0012JA\u0010\u001b\u001a\u00020\u001226\u0010\u001a\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\u0017H\u0086\bJ,\u0010\u001d\u001a\u00020\u00122!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\n0\u001cH\u0086\bJA\u0010\u001e\u001a\u00020\u001226\u0010\u001a\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00120\u0017H\u0086\bJ\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fR4\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010!2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R4\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010!2\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010!8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R$\u0010)\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArrayMap;", "", "Key", "Value", DatabaseFileArchive.COLUMN_KEY, "", "find", "midIndex", "keyHash", "findExactIndex", "", "isEmpty", "isNotEmpty", "contains", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", b.f22420d, "Lkotlin/r2;", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "remove", "clear", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "block", "removeIf", "Lkotlin/Function1;", "removeValueIf", "forEach", "", "asMap", "", "<set-?>", "keys", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "values", "getValues", "size", "I", "getSize", "()I", "capacity", "<init>", "(I)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nIdentityArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n1#1,298:1\n125#1,22:299\n*S KotlinDebug\n*F\n+ 1 IdentityArrayMap.kt\nandroidx/compose/runtime/collection/IdentityArrayMap\n*L\n149#1:299,22\n*E\n"})
/* loaded from: classes.dex */
public final class IdentityArrayMap<Key, Value> {
    public static final int $stable = 8;

    @l
    private Object[] keys;
    private int size;

    @l
    private Object[] values;

    public IdentityArrayMap() {
        this(0, 1, null);
    }

    public IdentityArrayMap(int i5) {
        this.keys = new Object[i5];
        this.values = new Object[i5];
    }

    private final int find(Object obj) {
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
        int i5 = this.size - 1;
        Object[] objArr = this.keys;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            Object obj2 = objArr[i7];
            int identityHashCode2 = ActualJvm_jvmKt.identityHashCode(obj2);
            if (identityHashCode2 < identityHashCode) {
                i6 = i7 + 1;
            } else if (identityHashCode2 > identityHashCode) {
                i5 = i7 - 1;
            } else {
                if (obj == obj2) {
                    return i7;
                }
                return findExactIndex(i7, obj, identityHashCode);
            }
        }
        return -(i6 + 1);
    }

    private final int findExactIndex(int i5, Object obj, int i6) {
        Object obj2;
        Object[] objArr = this.keys;
        int i7 = this.size;
        for (int i8 = i5 - 1; -1 < i8; i8--) {
            Object obj3 = objArr[i8];
            if (obj3 == obj) {
                return i8;
            }
            if (ActualJvm_jvmKt.identityHashCode(obj3) != i6) {
                break;
            }
        }
        do {
            i5++;
            if (i5 < i7) {
                obj2 = objArr[i5];
                if (obj2 == obj) {
                    return i5;
                }
            } else {
                return -(i7 + 1);
            }
        } while (ActualJvm_jvmKt.identityHashCode(obj2) == i6);
        return -(i5 + 1);
    }

    @l
    public final Map<Key, Value> asMap() {
        return new IdentityArrayMap$asMap$1(this);
    }

    public final void clear() {
        this.size = 0;
        o.V1(this.keys, null, 0, 0, 6, null);
        o.V1(this.values, null, 0, 0, 6, null);
    }

    public final boolean contains(@l Key key) {
        return find(key) >= 0;
    }

    public final void forEach(@l p<? super Key, ? super Value, r2> pVar) {
        int size = getSize();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = getKeys()[i5];
            l0.n(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            pVar.invoke(obj, getValues()[i5]);
        }
    }

    @m
    public final Value get(@l Key key) {
        int find = find(key);
        if (find >= 0) {
            return (Value) this.values[find];
        }
        return null;
    }

    @l
    public final Object[] getKeys() {
        return this.keys;
    }

    public final int getSize() {
        return this.size;
    }

    @l
    public final Object[] getValues() {
        return this.values;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean isNotEmpty() {
        return this.size > 0;
    }

    @m
    public final Value remove(@l Key key) {
        int find = find(key);
        if (find < 0) {
            return null;
        }
        Object[] objArr = this.values;
        Value value = (Value) objArr[find];
        int i5 = this.size;
        Object[] objArr2 = this.keys;
        int i6 = find + 1;
        o.B0(objArr2, objArr2, find, i6, i5);
        o.B0(objArr, objArr, find, i6, i5);
        int i7 = i5 - 1;
        objArr2[i7] = null;
        objArr[i7] = null;
        this.size = i7;
        return value;
    }

    public final void removeIf(@l p<? super Key, ? super Value, Boolean> pVar) {
        int size = getSize();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = getKeys()[i6];
            l0.n(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!pVar.invoke(obj, getValues()[i6]).booleanValue()) {
                if (i5 != i6) {
                    getKeys()[i5] = obj;
                    getValues()[i5] = getValues()[i6];
                }
                i5++;
            }
        }
        if (getSize() > i5) {
            int size2 = getSize();
            for (int i7 = i5; i7 < size2; i7++) {
                getKeys()[i7] = null;
                getValues()[i7] = null;
            }
            this.size = i5;
        }
    }

    public final void removeValueIf(@l v3.l<? super Value, Boolean> lVar) {
        int size = getSize();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = getKeys()[i6];
            l0.n(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap");
            if (!lVar.invoke(getValues()[i6]).booleanValue()) {
                if (i5 != i6) {
                    getKeys()[i5] = obj;
                    getValues()[i5] = getValues()[i6];
                }
                i5++;
            }
        }
        if (getSize() > i5) {
            int size2 = getSize();
            for (int i7 = i5; i7 < size2; i7++) {
                getKeys()[i7] = null;
                getValues()[i7] = null;
            }
            this.size = i5;
        }
    }

    public final void set(@l Key key, Value value) {
        boolean z4;
        Object[] objArr;
        Object[] objArr2;
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
        int i5 = this.size;
        int find = find(key);
        if (find >= 0) {
            objArr4[find] = value;
            return;
        }
        int i6 = -(find + 1);
        if (i5 == objArr3.length) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            objArr = new Object[i5 * 2];
        } else {
            objArr = objArr3;
        }
        int i7 = i6 + 1;
        o.B0(objArr3, objArr, i7, i6, i5);
        if (z4) {
            o.K0(objArr3, objArr, 0, 0, i6, 6, null);
        }
        objArr[i6] = key;
        this.keys = objArr;
        if (z4) {
            objArr2 = new Object[i5 * 2];
        } else {
            objArr2 = objArr4;
        }
        o.B0(objArr4, objArr2, i7, i6, i5);
        if (z4) {
            o.K0(objArr4, objArr2, 0, 0, i6, 6, null);
        }
        objArr2[i6] = value;
        this.values = objArr2;
        this.size++;
    }

    public /* synthetic */ IdentityArrayMap(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 16 : i5);
    }
}
