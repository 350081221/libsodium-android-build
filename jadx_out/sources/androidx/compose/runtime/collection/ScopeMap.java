package androidx.compose.runtime.collection;

import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;

@StabilityInferred(parameters = 0)
@i0(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0001H\u0086\u0002J4\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00012!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u000bH\u0086\bJ\u0006\u0010\u0010\u001a\u00020\u0005J\u001d\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012J.\u0010\u0014\u001a\u00020\u00052#\b\u0004\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\t0\u000bH\u0086\bJ\u0015\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Landroidx/compose/runtime/collection/ScopeMap;", "", "T", DatabaseFileArchive.COLUMN_KEY, "scope", "Lkotlin/r2;", "add", "(Ljava/lang/Object;Ljava/lang/Object;)V", "element", "", "contains", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "block", "forEachScopeOf", "clear", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "predicate", "removeScopeIf", "removeScope", "(Ljava/lang/Object;)V", "Landroidx/collection/MutableScatterMap;", "map", "Landroidx/collection/MutableScatterMap;", "getMap", "()Landroidx/collection/MutableScatterMap;", "", "getSize", "()I", "size", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nScopeMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n1#1,148:1\n124#1:246\n125#1,5:262\n130#1,5:296\n138#1:311\n874#2,18:149\n1047#2:194\n1049#2:208\n1050#2,3:236\n1053#2:245\n1047#2:247\n1049#2:261\n1050#2,3:301\n1053#2:310\n267#3,4:167\n237#3,7:171\n248#3,3:179\n251#3,2:183\n272#3,2:185\n254#3,6:187\n274#3:193\n237#3,7:211\n248#3,3:219\n251#3,2:223\n254#3,6:229\n237#3,16:269\n254#3,6:289\n1810#4:178\n1672#4:182\n1810#4:201\n1672#4:205\n1810#4:218\n1672#4:222\n1810#4:254\n1672#4:258\n363#5,6:195\n373#5,3:202\n376#5,2:206\n379#5,6:239\n363#5,6:248\n373#5,3:255\n376#5,2:259\n379#5,6:304\n842#6,2:209\n845#6,4:225\n849#6:235\n842#6,2:267\n845#6,4:285\n849#6:295\n*S KotlinDebug\n*F\n+ 1 ScopeMap.kt\nandroidx/compose/runtime/collection/ScopeMap\n*L\n145#1:246\n145#1:262,5\n145#1:296,5\n145#1:311\n37#1:149,18\n124#1:194\n124#1:208\n124#1:236,3\n124#1:245\n145#1:247\n145#1:261\n145#1:301,3\n145#1:310\n74#1:167,4\n74#1:171,7\n74#1:179,3\n74#1:183,2\n74#1:185,2\n74#1:187,6\n74#1:193\n129#1:211,7\n129#1:219,3\n129#1:223,2\n129#1:229,6\n145#1:269,16\n145#1:289,6\n74#1:178\n74#1:182\n124#1:201\n124#1:205\n129#1:218\n129#1:222\n145#1:254\n145#1:258\n124#1:195,6\n124#1:202,3\n124#1:206,2\n124#1:239,6\n145#1:248,6\n145#1:255,3\n145#1:259,2\n145#1:304,6\n129#1:209,2\n129#1:225,4\n129#1:235\n145#1:267,2\n145#1:285,4\n145#1:295\n*E\n"})
/* loaded from: classes.dex */
public final class ScopeMap<T> {
    public static final int $stable = 8;

    @l
    private final MutableScatterMap<Object, Object> map = ScatterMapKt.mutableScatterMapOf();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.collection.MutableScatterSet] */
    public final void add(@l Object obj, @l T t5) {
        boolean z4;
        T t6;
        MutableScatterMap<Object, Object> mutableScatterMap = this.map;
        int findInsertIndex = mutableScatterMap.findInsertIndex(obj);
        if (findInsertIndex < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            t6 = null;
        } else {
            t6 = mutableScatterMap.values[findInsertIndex];
        }
        if (t6 != null) {
            if (t6 instanceof MutableScatterSet) {
                l0.n(t6, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((MutableScatterSet) t6).add(t5);
            } else if (t6 != t5) {
                ?? mutableScatterSet = new MutableScatterSet(0, 1, null);
                l0.n(t6, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                mutableScatterSet.add(t6);
                mutableScatterSet.add(t5);
                t5 = mutableScatterSet;
            }
            t5 = t6;
        }
        if (z4) {
            int i5 = ~findInsertIndex;
            mutableScatterMap.keys[i5] = obj;
            mutableScatterMap.values[i5] = t5;
            return;
        }
        mutableScatterMap.values[findInsertIndex] = t5;
    }

    public final void clear() {
        this.map.clear();
    }

    public final boolean contains(@l Object obj) {
        return this.map.containsKey(obj);
    }

    public final void forEachScopeOf(@l Object obj, @l v3.l<? super T, r2> lVar) {
        boolean z4;
        Object obj2 = getMap().get(obj);
        if (obj2 != null) {
            if (obj2 instanceof MutableScatterSet) {
                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
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
                                    lVar.invoke(objArr[(i5 << 3) + i7]);
                                }
                                j5 >>= 8;
                            }
                            if (i6 != 8) {
                                return;
                            }
                        }
                        if (i5 != length) {
                            i5++;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                lVar.invoke(obj2);
            }
        }
    }

    @l
    public final MutableScatterMap<Object, Object> getMap() {
        return this.map;
    }

    public final int getSize() {
        return this.map.getSize();
    }

    public final boolean remove(@l Object obj, @l T t5) {
        Object obj2 = this.map.get(obj);
        if (obj2 == null) {
            return false;
        }
        if (obj2 instanceof MutableScatterSet) {
            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
            boolean remove = mutableScatterSet.remove(t5);
            if (remove && mutableScatterSet.isEmpty()) {
                this.map.remove(obj);
            }
            return remove;
        }
        if (!l0.g(obj2, t5)) {
            return false;
        }
        this.map.remove(obj);
        return true;
    }

    public final void removeScope(@l T t5) {
        long[] jArr;
        int i5;
        boolean z4;
        long[] jArr2;
        int i6;
        int i7;
        int i8;
        long j5;
        int i9;
        boolean z5;
        int i10;
        boolean z6;
        MutableScatterMap<Object, Object> map = getMap();
        long[] jArr3 = map.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j6 = jArr3[i11];
                char c5 = 7;
                long j7 = -9187201950435737472L;
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        boolean z7 = true;
                        if ((j6 & 255) < 128) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            int i15 = (i11 << 3) + i14;
                            Object obj = map.keys[i15];
                            Object obj2 = map.values[i15];
                            if (obj2 instanceof MutableScatterSet) {
                                l0.n(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr4 = mutableScatterSet.metadata;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                i6 = length;
                                if (length2 >= 0) {
                                    int i16 = 0;
                                    while (true) {
                                        long j8 = jArr4[i16];
                                        i8 = i13;
                                        long[] jArr5 = jArr4;
                                        j5 = -9187201950435737472L;
                                        if ((((~j8) << c5) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                            int i18 = 0;
                                            while (i18 < i17) {
                                                if ((j8 & 255) < 128) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (z5) {
                                                    int i19 = (i16 << 3) + i18;
                                                    i10 = i11;
                                                    if (objArr[i19] == t5) {
                                                        z6 = true;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    if (z6) {
                                                        mutableScatterSet.removeElementAt(i19);
                                                    }
                                                } else {
                                                    i10 = i11;
                                                }
                                                j8 >>= 8;
                                                i18++;
                                                i11 = i10;
                                            }
                                            i7 = i11;
                                            if (i17 != 8) {
                                                break;
                                            }
                                        } else {
                                            i7 = i11;
                                        }
                                        if (i16 == length2) {
                                            break;
                                        }
                                        i16++;
                                        i13 = i8;
                                        jArr4 = jArr5;
                                        i11 = i7;
                                        c5 = 7;
                                    }
                                } else {
                                    i7 = i11;
                                    i8 = i13;
                                    j5 = -9187201950435737472L;
                                }
                                z7 = mutableScatterSet.isEmpty();
                            } else {
                                jArr2 = jArr3;
                                i6 = length;
                                i7 = i11;
                                i8 = i13;
                                j5 = j7;
                                l0.n(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                if (obj2 != t5) {
                                    z7 = false;
                                }
                            }
                            if (z7) {
                                map.removeValueAt(i15);
                            }
                            i9 = 8;
                        } else {
                            jArr2 = jArr3;
                            i6 = length;
                            i7 = i11;
                            i8 = i13;
                            j5 = j7;
                            i9 = i12;
                        }
                        j6 >>= i9;
                        i14++;
                        i12 = i9;
                        j7 = j5;
                        jArr3 = jArr2;
                        length = i6;
                        i13 = i8;
                        i11 = i7;
                        c5 = 7;
                    }
                    jArr = jArr3;
                    int i20 = length;
                    int i21 = i11;
                    if (i13 == i12) {
                        length = i20;
                        i5 = i21;
                    } else {
                        return;
                    }
                } else {
                    jArr = jArr3;
                    i5 = i11;
                }
                if (i5 != length) {
                    i11 = i5 + 1;
                    jArr3 = jArr;
                } else {
                    return;
                }
            }
        }
    }

    public final void removeScopeIf(@l v3.l<? super T, Boolean> lVar) {
        long[] jArr;
        int i5;
        boolean z4;
        long[] jArr2;
        int i6;
        int i7;
        int i8;
        long j5;
        int i9;
        boolean booleanValue;
        boolean z5;
        int i10;
        MutableScatterMap<Object, Object> map = getMap();
        long[] jArr3 = map.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j6 = jArr3[i11];
                char c5 = 7;
                long j7 = -9187201950435737472L;
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8;
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j6 & 255) < 128) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            int i15 = (i11 << 3) + i14;
                            Object obj = map.keys[i15];
                            Object obj2 = map.values[i15];
                            if (obj2 instanceof MutableScatterSet) {
                                l0.n(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr4 = mutableScatterSet.metadata;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                i6 = length;
                                if (length2 >= 0) {
                                    int i16 = 0;
                                    while (true) {
                                        long j8 = jArr4[i16];
                                        i8 = i13;
                                        long[] jArr5 = jArr4;
                                        j5 = -9187201950435737472L;
                                        if ((((~j8) << c5) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                            int i18 = 0;
                                            while (i18 < i17) {
                                                if ((j8 & 255) < 128) {
                                                    z5 = true;
                                                } else {
                                                    z5 = false;
                                                }
                                                if (z5) {
                                                    int i19 = (i16 << 3) + i18;
                                                    i10 = i11;
                                                    if (lVar.invoke(objArr[i19]).booleanValue()) {
                                                        mutableScatterSet.removeElementAt(i19);
                                                    }
                                                } else {
                                                    i10 = i11;
                                                }
                                                j8 >>= 8;
                                                i18++;
                                                i11 = i10;
                                            }
                                            i7 = i11;
                                            if (i17 != 8) {
                                                break;
                                            }
                                        } else {
                                            i7 = i11;
                                        }
                                        if (i16 == length2) {
                                            break;
                                        }
                                        i16++;
                                        i13 = i8;
                                        jArr4 = jArr5;
                                        i11 = i7;
                                        c5 = 7;
                                    }
                                } else {
                                    i7 = i11;
                                    i8 = i13;
                                    j5 = -9187201950435737472L;
                                }
                                booleanValue = mutableScatterSet.isEmpty();
                            } else {
                                jArr2 = jArr3;
                                i6 = length;
                                i7 = i11;
                                i8 = i13;
                                j5 = j7;
                                l0.n(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                booleanValue = lVar.invoke(obj2).booleanValue();
                            }
                            if (booleanValue) {
                                map.removeValueAt(i15);
                            }
                            i9 = 8;
                        } else {
                            jArr2 = jArr3;
                            i6 = length;
                            i7 = i11;
                            i8 = i13;
                            j5 = j7;
                            i9 = i12;
                        }
                        j6 >>= i9;
                        i14++;
                        i12 = i9;
                        j7 = j5;
                        jArr3 = jArr2;
                        length = i6;
                        i13 = i8;
                        i11 = i7;
                        c5 = 7;
                    }
                    jArr = jArr3;
                    int i20 = length;
                    int i21 = i11;
                    if (i13 == i12) {
                        length = i20;
                        i5 = i21;
                    } else {
                        return;
                    }
                } else {
                    jArr = jArr3;
                    i5 = i11;
                }
                if (i5 != length) {
                    i11 = i5 + 1;
                    jArr3 = jArr;
                } else {
                    return;
                }
            }
        }
    }
}
