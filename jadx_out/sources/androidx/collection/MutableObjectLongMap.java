package androidx.collection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import kotlin.a1;
import kotlin.collections.o;
import kotlin.g2;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.sequences.m;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import t0.b;
import v3.p;

@i0(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b5\u00106J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0005H\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0019\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0082\bJ)\u0010\u0018\u001a\u00020\u00132\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0016H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001c\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001bJ%\u0010\u001c\u001a\u00020\u00132\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u0013¢\u0006\u0004\b\u001c\u0010\u001eJ\u0014\u0010 \u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010!\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\nJ\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\u00020$2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010%J&\u0010(\u001a\u00020\u00052\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020$0&H\u0086\bø\u0001\u0000J\u0018\u0010)\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b)\u0010#J \u0010)\u001a\u00020\u00052\u000e\u0010+\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000*H\u0086\n¢\u0006\u0004\b)\u0010,J\u0017\u0010)\u001a\u00020\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0086\nJ\u0017\u0010)\u001a\u00020\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000.H\u0086\nJ\u0017\u0010)\u001a\u00020\u00052\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0086\nJ\u0010\u00100\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0003H\u0001J\u0006\u00101\u001a\u00020\u0005J\u0006\u00102\u001a\u00020\u0003R\u0016\u00103\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00067"}, d2 = {"Landroidx/collection/MutableObjectLongMap;", "K", "Landroidx/collection/ObjectLongMap;", "", "initialCapacity", "Lkotlin/r2;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", DatabaseFileArchive.COLUMN_KEY, "findIndex", "(Ljava/lang/Object;)I", "hash1", "findFirstAvailableSlot", "adjustStorage", "newCapacity", "resizeStorage", "index", "", b.f22420d, "writeMetadata", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(Ljava/lang/Object;Lv3/a;)J", "set", "(Ljava/lang/Object;J)V", "put", "default", "(Ljava/lang/Object;JJ)J", TypedValues.TransitionType.S_FROM, "putAll", "plusAssign", "remove", "(Ljava/lang/Object;)V", "", "(Ljava/lang/Object;J)Z", "Lkotlin/Function2;", "predicate", "removeIf", "minusAssign", "", "keys", "([Ljava/lang/Object;)V", "", "Lkotlin/sequences/m;", "Landroidx/collection/ScatterSet;", "removeValueAt", "clear", "trim", "growthLimit", "I", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nObjectLongMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/MutableObjectLongMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ObjectLongMap.kt\nandroidx/collection/ObjectLongMap\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n1#1,1058:1\n1048#1,2:1139\n1052#1,5:1147\n1048#1,2:1178\n1052#1,5:1186\n1048#1,2:1203\n1052#1,5:1211\n1#2:1059\n1656#3,6:1060\n1810#3:1076\n1672#3:1080\n1810#3:1098\n1672#3:1102\n1810#3:1123\n1672#3:1127\n1656#3,6:1141\n1656#3,6:1152\n1589#3,3:1158\n1599#3:1161\n1603#3:1162\n1779#3,3:1163\n1793#3,3:1166\n1717#3:1169\n1705#3:1170\n1699#3:1171\n1712#3:1172\n1802#3:1173\n1666#3:1174\n1645#3:1175\n1664#3:1176\n1645#3:1177\n1656#3,6:1180\n1779#3,3:1191\n1810#3:1194\n1699#3:1195\n1669#3:1196\n1645#3:1197\n1589#3,3:1198\n1599#3:1201\n1603#3:1202\n1656#3,6:1205\n1656#3,6:1216\n1656#3,6:1222\n401#4,4:1066\n373#4,6:1070\n383#4,3:1077\n386#4,2:1081\n406#4,2:1083\n389#4,6:1085\n408#4:1091\n373#4,6:1092\n383#4,3:1099\n386#4,9:1103\n267#5,4:1112\n237#5,7:1116\n248#5,3:1124\n251#5,2:1128\n272#5,2:1130\n254#5,6:1132\n274#5:1138\n*S KotlinDebug\n*F\n+ 1 ObjectLongMap.kt\nandroidx/collection/MutableObjectLongMap\n*L\n900#1:1139,2\n900#1:1147,5\n960#1:1178,2\n960#1:1186,5\n1035#1:1203,2\n1035#1:1211,5\n728#1:1060,6\n804#1:1076\n804#1:1080\n843#1:1098\n843#1:1102\n889#1:1123\n889#1:1127\n900#1:1141,6\n911#1:1152,6\n925#1:1158,3\n926#1:1161\n927#1:1162\n934#1:1163,3\n935#1:1166,3\n936#1:1169\n937#1:1170\n937#1:1171\n941#1:1172\n944#1:1173\n953#1:1174\n953#1:1175\n959#1:1176\n959#1:1177\n960#1:1180,6\n975#1:1191,3\n976#1:1194\n978#1:1195\n1030#1:1196\n1030#1:1197\n1032#1:1198,3\n1033#1:1201\n1035#1:1202\n1035#1:1205,6\n1049#1:1216,6\n1055#1:1222,6\n804#1:1066,4\n804#1:1070,6\n804#1:1077,3\n804#1:1081,2\n804#1:1083,2\n804#1:1085,6\n804#1:1091\n843#1:1092,6\n843#1:1099,3\n843#1:1103,9\n889#1:1112,4\n889#1:1116,7\n889#1:1124,3\n889#1:1128,2\n889#1:1130,2\n889#1:1132,6\n889#1:1138\n*E\n"})
/* loaded from: classes.dex */
public final class MutableObjectLongMap<K> extends ObjectLongMap<K> {
    private int growthLimit;

    public MutableObjectLongMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableObjectLongMap(int i5, int i6, w wVar) {
        this((i6 & 1) != 0 ? 6 : i5);
    }

    private final void adjustStorage() {
        int compare;
        if (this._capacity > 8) {
            compare = Long.compare(g2.l(g2.l(this._size) * 32) ^ Long.MIN_VALUE, g2.l(g2.l(this._capacity) * 25) ^ Long.MIN_VALUE);
            if (compare <= 0) {
                resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
                return;
            }
        }
        resizeStorage(ScatterMapKt.nextCapacity(this._capacity));
    }

    private final int findFirstAvailableSlot(int i5) {
        int i6 = this._capacity;
        int i7 = i5 & i6;
        int i8 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i9 = i7 >> 3;
            int i10 = (i7 & 7) << 3;
            long j5 = ((jArr[i9 + 1] << (64 - i10)) & ((-i10) >> 63)) | (jArr[i9] >>> i10);
            long j6 = j5 & ((~j5) << 7) & (-9187201950435737472L);
            if (j6 != 0) {
                return (i7 + (Long.numberOfTrailingZeros(j6) >> 3)) & i6;
            }
            i8 += 8;
            i7 = (i7 + i8) & i6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        r1 = findFirstAvailableSlot(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0086, code lost:
    
        if (r20.growthLimit != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (((r20.metadata[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009b, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if (r2 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        adjustStorage();
        r1 = findFirstAvailableSlot(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009d, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a7, code lost:
    
        r20._size++;
        r2 = r20.growthLimit;
        r3 = r20.metadata;
        r4 = r1 >> 3;
        r7 = r3[r4];
        r9 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bf, code lost:
    
        if (((r7 >> r9) & 255) != 128) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c1, code lost:
    
        r19 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c6, code lost:
    
        r20.growthLimit = r2 - r19;
        r3[r4] = (r7 & (~(255 << r9))) | (r10 << r9);
        r2 = r20._capacity;
        r4 = ((r1 - 7) & r2) + (r2 & 7);
        r2 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r3[r2] = ((~(255 << r4)) & r3[r2]) | (r10 << r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ed, code lost:
    
        return ~r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c4, code lost:
    
        r19 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int findIndex(K r21) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableObjectLongMap.findIndex(java.lang.Object):int");
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size;
    }

    private final void initializeMetadata(int i5) {
        long[] jArr;
        if (i5 == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            jArr = new long[((((i5 + 1) + 7) + 7) & (-8)) >> 3];
            o.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
        }
        this.metadata = jArr;
        int i6 = i5 >> 3;
        long j5 = 255 << ((i5 & 7) << 3);
        jArr[i6] = (jArr[i6] & (~j5)) | j5;
        initializeGrowth();
    }

    private final void initializeStorage(int i5) {
        int i6;
        if (i5 > 0) {
            i6 = Math.max(7, ScatterMapKt.normalizeCapacity(i5));
        } else {
            i6 = 0;
        }
        this._capacity = i6;
        initializeMetadata(i6);
        this.keys = new Object[i6];
        this.values = new long[i6];
    }

    private final void resizeStorage(int i5) {
        boolean z4;
        int i6;
        int i7;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        long[] jArr2 = this.values;
        int i8 = this._capacity;
        initializeStorage(i5);
        Object[] objArr2 = this.keys;
        long[] jArr3 = this.values;
        int i9 = 0;
        while (i9 < i8) {
            if (((jArr[i9 >> 3] >> ((i9 & 7) << 3)) & 255) < 128) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                Object obj = objArr[i9];
                if (obj != null) {
                    i7 = obj.hashCode();
                } else {
                    i7 = 0;
                }
                int i10 = i7 * ScatterMapKt.MurmurHashC1;
                int i11 = i10 ^ (i10 << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i11 >>> 7);
                long j5 = i11 & 127;
                long[] jArr4 = this.metadata;
                int i12 = findFirstAvailableSlot >> 3;
                int i13 = (findFirstAvailableSlot & 7) << 3;
                i6 = i9;
                jArr4[i12] = (jArr4[i12] & (~(255 << i13))) | (j5 << i13);
                int i14 = this._capacity;
                int i15 = ((findFirstAvailableSlot - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr4[i16] = (jArr4[i16] & (~(255 << i17))) | (j5 << i17);
                objArr2[findFirstAvailableSlot] = obj;
                jArr3[findFirstAvailableSlot] = jArr2[i6];
            } else {
                i6 = i9;
            }
            i9 = i6 + 1;
        }
    }

    private final void writeMetadata(int i5, long j5) {
        long[] jArr = this.metadata;
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (j5 << i7);
        int i8 = this._capacity;
        int i9 = ((i5 - 7) & i8) + (i8 & 7);
        int i10 = i9 >> 3;
        int i11 = (i9 & 7) << 3;
        jArr[i10] = (j5 << i11) | (jArr[i10] & (~(255 << i11)));
    }

    public final void clear() {
        this._size = 0;
        long[] jArr = this.metadata;
        if (jArr != ScatterMapKt.EmptyGroup) {
            o.U1(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.metadata;
            int i5 = this._capacity;
            int i6 = i5 >> 3;
            long j5 = 255 << ((i5 & 7) << 3);
            jArr2[i6] = (jArr2[i6] & (~j5)) | j5;
        }
        o.M1(this.keys, null, 0, this._capacity);
        initializeGrowth();
    }

    public final long getOrPut(K k5, @l v3.a<Long> defaultValue) {
        l0.p(defaultValue, "defaultValue");
        int findKeyIndex = findKeyIndex(k5);
        if (findKeyIndex >= 0) {
            return this.values[findKeyIndex];
        }
        long longValue = defaultValue.invoke().longValue();
        set(k5, longValue);
        return longValue;
    }

    public final void minusAssign(K k5) {
        remove(k5);
    }

    public final void plusAssign(@l ObjectLongMap<K> from) {
        l0.p(from, "from");
        putAll(from);
    }

    public final void put(K k5, long j5) {
        set(k5, j5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@l ObjectLongMap<K> from) {
        boolean z4;
        l0.p(from, "from");
        Object[] objArr = from.keys;
        long[] jArr = from.values;
        long[] jArr2 = from.metadata;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j5 = jArr2[i5];
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
                            set(objArr[i8], jArr[i8]);
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
    }

    public final void remove(K k5) {
        int findKeyIndex = findKeyIndex(k5);
        if (findKeyIndex >= 0) {
            removeValueAt(findKeyIndex);
        }
    }

    public final void removeIf(@l p<? super K, ? super Long, Boolean> predicate) {
        boolean z4;
        l0.p(predicate, "predicate");
        long[] jArr = this.metadata;
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
                            if (predicate.invoke(this.keys[i8], Long.valueOf(this.values[i8])).booleanValue()) {
                                removeValueAt(i8);
                            }
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
    }

    @a1
    public final void removeValueAt(int i5) {
        this._size--;
        long[] jArr = this.metadata;
        int i6 = i5 >> 3;
        int i7 = (i5 & 7) << 3;
        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (254 << i7);
        int i8 = this._capacity;
        int i9 = ((i5 - 7) & i8) + (i8 & 7);
        int i10 = i9 >> 3;
        int i11 = (i9 & 7) << 3;
        jArr[i10] = (jArr[i10] & (~(255 << i11))) | (254 << i11);
        this.keys[i5] = null;
    }

    public final void set(K k5, long j5) {
        int findIndex = findIndex(k5);
        if (findIndex < 0) {
            findIndex = ~findIndex;
        }
        this.keys[findIndex] = k5;
        this.values[findIndex] = j5;
    }

    public final int trim() {
        int i5 = this._capacity;
        int normalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (normalizeCapacity < i5) {
            resizeStorage(normalizeCapacity);
            return i5 - this._capacity;
        }
        return 0;
    }

    public MutableObjectLongMap(int i5) {
        super(null);
        if (i5 >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i5));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void minusAssign(@l K[] keys) {
        l0.p(keys, "keys");
        for (K k5 : keys) {
            remove(k5);
        }
    }

    public final long put(K k5, long j5, long j6) {
        int findIndex = findIndex(k5);
        if (findIndex < 0) {
            findIndex = ~findIndex;
        } else {
            j6 = this.values[findIndex];
        }
        this.keys[findIndex] = k5;
        this.values[findIndex] = j5;
        return j6;
    }

    public final boolean remove(K k5, long j5) {
        int findKeyIndex = findKeyIndex(k5);
        if (findKeyIndex < 0 || this.values[findKeyIndex] != j5) {
            return false;
        }
        removeValueAt(findKeyIndex);
        return true;
    }

    public final void minusAssign(@l Iterable<? extends K> keys) {
        l0.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void minusAssign(@l m<? extends K> keys) {
        l0.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@l ScatterSet<K> keys) {
        l0.p(keys, "keys");
        Object[] objArr = keys.elements;
        long[] jArr = keys.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        remove(objArr[(i5 << 3) + i7]);
                    }
                    j5 >>= 8;
                }
                if (i6 != 8) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }
}
