package androidx.compose.runtime.collection;

import androidx.compose.runtime.ActualJvm_jvmKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.collections.o;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import t0.b;
import v3.p;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\u0012\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\"\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0011\u0010\t\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002J\u0016\u0010\n\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0001J#\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\rH\u0086\bJ#\u0010\u0011\u001a\u00020\u000b2\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\rH\u0086\bJ#\u0010\u0013\u001a\u00020\u000f2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\rH\u0086\bR$\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R4\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00192\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00198\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u001e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "", DatabaseFileArchive.COLUMN_KEY, "", "find", "midIndex", b.f22420d, "valueHash", "findExactIndex", "get", "add", "", "remove", "Lkotlin/Function2;", "predicate", "Lkotlin/r2;", "removeValueIf", "any", "block", "forEach", "<set-?>", "size", "I", "getSize", "()I", "", "keys", "[Ljava/lang/Object;", "getKeys", "()[Ljava/lang/Object;", "", "values", "[I", "getValues", "()[I", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class IdentityArrayIntMap {
    public static final int $stable = 8;
    private int size;

    @l
    private Object[] keys = new Object[4];

    @l
    private int[] values = new int[4];

    private final int find(Object obj) {
        int i5 = this.size - 1;
        int identityHashCode = ActualJvm_jvmKt.identityHashCode(obj);
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
                if (obj2 == obj) {
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

    public final int add(@l Object obj, int i5) {
        int i6;
        int i7;
        int[] iArr = this.values;
        if (this.size > 0) {
            i6 = find(obj);
            if (i6 >= 0) {
                int i8 = iArr[i6];
                iArr[i6] = i5;
                return i8;
            }
        } else {
            i6 = -1;
        }
        int i9 = -(i6 + 1);
        Object[] objArr = this.keys;
        int i10 = this.size;
        if (i10 == objArr.length) {
            Object[] objArr2 = new Object[objArr.length * 2];
            int[] iArr2 = new int[objArr.length * 2];
            int i11 = i9 + 1;
            o.B0(objArr, objArr2, i11, i9, i10);
            o.z0(iArr, iArr2, i11, i9, i10);
            i7 = i9;
            o.K0(objArr, objArr2, 0, 0, i7, 6, null);
            o.I0(iArr, iArr2, 0, 0, i9, 6, null);
            this.keys = objArr2;
            this.values = iArr2;
        } else {
            i7 = i9;
            int i12 = i7 + 1;
            o.B0(objArr, objArr, i12, i7, i10);
            o.z0(iArr, iArr, i12, i7, i10);
        }
        this.keys[i7] = obj;
        this.values[i7] = i5;
        this.size++;
        return -1;
    }

    public final boolean any(@l p<Object, ? super Integer, Boolean> pVar) {
        Object[] keys = getKeys();
        int[] values = getValues();
        int size = getSize();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = keys[i5];
            l0.n(obj, "null cannot be cast to non-null type kotlin.Any");
            if (pVar.invoke(obj, Integer.valueOf(values[i5])).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void forEach(@l p<Object, ? super Integer, r2> pVar) {
        Object[] keys = getKeys();
        int[] values = getValues();
        int size = getSize();
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = keys[i5];
            l0.n(obj, "null cannot be cast to non-null type kotlin.Any");
            pVar.invoke(obj, Integer.valueOf(values[i5]));
        }
    }

    public final int get(@l Object obj) {
        int find = find(obj);
        if (find >= 0) {
            return this.values[find];
        }
        throw new IllegalStateException("Key not found".toString());
    }

    @l
    public final Object[] getKeys() {
        return this.keys;
    }

    public final int getSize() {
        return this.size;
    }

    @l
    public final int[] getValues() {
        return this.values;
    }

    public final boolean remove(@l Object obj) {
        int find = find(obj);
        Object[] objArr = this.keys;
        int[] iArr = this.values;
        int i5 = this.size;
        if (find >= 0) {
            int i6 = i5 - 1;
            if (find < i6) {
                int i7 = find + 1;
                o.B0(objArr, objArr, find, i7, i5);
                o.z0(iArr, iArr, find, i7, i5);
            }
            objArr[i6] = null;
            this.size = i6;
            return true;
        }
        return false;
    }

    public final void removeValueIf(@l p<Object, ? super Integer, Boolean> pVar) {
        Object[] keys = getKeys();
        int[] values = getValues();
        int size = getSize();
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Object obj = keys[i6];
            l0.n(obj, "null cannot be cast to non-null type kotlin.Any");
            int i7 = values[i6];
            if (!pVar.invoke(obj, Integer.valueOf(i7)).booleanValue()) {
                if (i5 != i6) {
                    keys[i5] = obj;
                    values[i5] = i7;
                }
                i5++;
            }
        }
        for (int i8 = i5; i8 < size; i8++) {
            keys[i8] = null;
        }
        this.size = i5;
    }
}
