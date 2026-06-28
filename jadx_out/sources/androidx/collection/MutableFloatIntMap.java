package androidx.collection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.a1;
import kotlin.collections.o;
import kotlin.g2;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import t0.b;
import v3.p;

@i0(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\b\u0010\u000e\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J\u0019\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0082\bJ\"\u0010\u0017\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0086\bø\u0001\u0000J\u0019\u0010\u0018\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0002H\u0086\u0002J\u0016\u0010\u0019\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0002J\u001e\u0010\u0019\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0001J\u0011\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0001H\u0086\nJ\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0002J&\u0010\"\u001a\u00020\u00042\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001f0 H\u0086\bø\u0001\u0000J\u0011\u0010#\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0086\nJ\u0011\u0010#\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0086\nJ\u0011\u0010#\u001a\u00020\u00042\u0006\u0010%\u001a\u00020&H\u0086\nJ\u0011\u0010#\u001a\u00020\u00042\u0006\u0010%\u001a\u00020'H\u0086\nJ\u0010\u0010(\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0001J\u0006\u0010)\u001a\u00020\u0004J\u0006\u0010*\u001a\u00020\u0002R\u0016\u0010+\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006/"}, d2 = {"Landroidx/collection/MutableFloatIntMap;", "Landroidx/collection/FloatIntMap;", "", "initialCapacity", "Lkotlin/r2;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "", DatabaseFileArchive.COLUMN_KEY, "findInsertIndex", "hash1", "findFirstAvailableSlot", "adjustStorage", "newCapacity", "resizeStorage", "index", "", b.f22420d, "writeMetadata", "Lkotlin/Function0;", "defaultValue", "getOrPut", "set", "put", "default", TypedValues.TransitionType.S_FROM, "putAll", "plusAssign", "remove", "", "Lkotlin/Function2;", "predicate", "removeIf", "minusAssign", "", "keys", "Landroidx/collection/FloatSet;", "Landroidx/collection/FloatList;", "removeValueAt", "clear", "trim", "growthLimit", "I", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFloatIntMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/MutableFloatIntMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 FloatIntMap.kt\nandroidx/collection/FloatIntMap\n+ 5 FloatSet.kt\nandroidx/collection/FloatSet\n+ 6 FloatList.kt\nandroidx/collection/FloatList\n+ 7 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,1031:1\n1021#1,2:1118\n1025#1,5:1126\n1021#1,2:1157\n1025#1,5:1165\n1021#1,2:1182\n1025#1,5:1190\n1#2:1032\n1656#3,6:1033\n1810#3:1049\n1672#3:1053\n1810#3:1071\n1672#3:1075\n1810#3:1096\n1672#3:1100\n1656#3,6:1120\n1656#3,6:1131\n1599#3:1140\n1603#3:1141\n1779#3,3:1142\n1793#3,3:1145\n1717#3:1148\n1705#3:1149\n1699#3:1150\n1712#3:1151\n1802#3:1152\n1666#3:1153\n1645#3:1154\n1664#3:1155\n1645#3:1156\n1656#3,6:1159\n1779#3,3:1170\n1810#3:1173\n1699#3:1174\n1669#3:1175\n1645#3:1176\n1599#3:1180\n1603#3:1181\n1656#3,6:1184\n1656#3,6:1195\n1656#3,6:1201\n385#4,4:1039\n357#4,6:1043\n367#4,3:1050\n370#4,2:1054\n389#4,2:1056\n373#4,6:1058\n391#4:1064\n357#4,6:1065\n367#4,3:1072\n370#4,9:1076\n262#5,4:1085\n232#5,7:1089\n243#5,3:1097\n246#5,2:1101\n266#5,2:1103\n249#5,6:1105\n268#5:1111\n253#6,6:1112\n833#7,3:1137\n833#7,3:1177\n*S KotlinDebug\n*F\n+ 1 FloatIntMap.kt\nandroidx/collection/MutableFloatIntMap\n*L\n875#1:1118,2\n875#1:1126,5\n933#1:1157,2\n933#1:1165,5\n1008#1:1182,2\n1008#1:1190,5\n711#1:1033,6\n789#1:1049\n789#1:1053\n828#1:1071\n828#1:1075\n855#1:1096\n855#1:1100\n875#1:1120,6\n885#1:1131,6\n899#1:1140\n900#1:1141\n907#1:1142,3\n908#1:1145,3\n909#1:1148\n910#1:1149\n910#1:1150\n914#1:1151\n917#1:1152\n926#1:1153\n926#1:1154\n932#1:1155\n932#1:1156\n933#1:1159,6\n948#1:1170,3\n949#1:1173\n951#1:1174\n1003#1:1175\n1003#1:1176\n1006#1:1180\n1008#1:1181\n1008#1:1184,6\n1022#1:1195,6\n1028#1:1201,6\n789#1:1039,4\n789#1:1043,6\n789#1:1050,3\n789#1:1054,2\n789#1:1056,2\n789#1:1058,6\n789#1:1064\n828#1:1065,6\n828#1:1072,3\n828#1:1076,9\n855#1:1085,4\n855#1:1089,7\n855#1:1097,3\n855#1:1101,2\n855#1:1103,2\n855#1:1105,6\n855#1:1111\n864#1:1112,6\n898#1:1137,3\n1005#1:1177,3\n*E\n"})
/* loaded from: classes.dex */
public final class MutableFloatIntMap extends FloatIntMap {
    private int growthLimit;

    public MutableFloatIntMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableFloatIntMap(int i5, int i6, w wVar) {
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

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        r1 = findFirstAvailableSlot(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0080, code lost:
    
        if (r19.growthLimit != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        if (((r19.metadata[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0094, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0097, code lost:
    
        if (r3 != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        adjustStorage();
        r1 = findFirstAvailableSlot(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a0, code lost:
    
        r19._size++;
        r2 = r19.growthLimit;
        r3 = r19.metadata;
        r6 = r1 >> 3;
        r7 = r3[r6];
        r11 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b8, code lost:
    
        if (((r7 >> r11) & 255) != 128) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ba, code lost:
    
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bf, code lost:
    
        r19.growthLimit = r2 - r18;
        r3[r6] = (r7 & (~(255 << r11))) | (r9 << r11);
        r2 = r19._capacity;
        r6 = ((r1 - 7) & r2) + (r2 & 7);
        r2 = r6 >> 3;
        r6 = (r6 & 7) << 3;
        r3[r2] = ((~(255 << r6)) & r3[r2]) | (r9 << r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e5, code lost:
    
        return ~r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
    
        r18 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int findInsertIndex(float r20) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatIntMap.findInsertIndex(float):int");
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
        this.keys = new float[i6];
        this.values = new int[i6];
    }

    private final void resizeStorage(int i5) {
        boolean z4;
        int i6;
        long[] jArr = this.metadata;
        float[] fArr = this.keys;
        int[] iArr = this.values;
        int i7 = this._capacity;
        initializeStorage(i5);
        float[] fArr2 = this.keys;
        int[] iArr2 = this.values;
        int i8 = 0;
        while (i8 < i7) {
            if (((jArr[i8 >> 3] >> ((i8 & 7) << 3)) & 255) < 128) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                float f5 = fArr[i8];
                int hashCode = Float.hashCode(f5) * ScatterMapKt.MurmurHashC1;
                int i9 = hashCode ^ (hashCode << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i9 >>> 7);
                long j5 = i9 & 127;
                long[] jArr2 = this.metadata;
                int i10 = findFirstAvailableSlot >> 3;
                int i11 = (findFirstAvailableSlot & 7) << 3;
                i6 = i8;
                jArr2[i10] = (jArr2[i10] & (~(255 << i11))) | (j5 << i11);
                int i12 = this._capacity;
                int i13 = ((findFirstAvailableSlot - 7) & i12) + (i12 & 7);
                int i14 = i13 >> 3;
                int i15 = (i13 & 7) << 3;
                jArr2[i14] = (jArr2[i14] & (~(255 << i15))) | (j5 << i15);
                fArr2[findFirstAvailableSlot] = f5;
                iArr2[findFirstAvailableSlot] = iArr[i6];
            } else {
                i6 = i8;
            }
            i8 = i6 + 1;
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
        initializeGrowth();
    }

    public final int getOrPut(float f5, @l v3.a<Integer> defaultValue) {
        l0.p(defaultValue, "defaultValue");
        int findKeyIndex = findKeyIndex(f5);
        if (findKeyIndex < 0) {
            int intValue = defaultValue.invoke().intValue();
            put(f5, intValue);
            return intValue;
        }
        return this.values[findKeyIndex];
    }

    public final void minusAssign(float f5) {
        remove(f5);
    }

    public final void plusAssign(@l FloatIntMap from) {
        l0.p(from, "from");
        putAll(from);
    }

    public final void put(float f5, int i5) {
        set(f5, i5);
    }

    public final void putAll(@l FloatIntMap from) {
        boolean z4;
        l0.p(from, "from");
        float[] fArr = from.keys;
        int[] iArr = from.values;
        long[] jArr = from.metadata;
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
                            set(fArr[i8], iArr[i8]);
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

    public final void remove(float f5) {
        int findKeyIndex = findKeyIndex(f5);
        if (findKeyIndex >= 0) {
            removeValueAt(findKeyIndex);
        }
    }

    public final void removeIf(@l p<? super Float, ? super Integer, Boolean> predicate) {
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
                            if (predicate.invoke(Float.valueOf(this.keys[i8]), Integer.valueOf(this.values[i8])).booleanValue()) {
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
    }

    public final void set(float f5, int i5) {
        int findInsertIndex = findInsertIndex(f5);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        this.keys[findInsertIndex] = f5;
        this.values[findInsertIndex] = i5;
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

    public MutableFloatIntMap(int i5) {
        super(null);
        if (i5 >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i5));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void minusAssign(@l float[] keys) {
        l0.p(keys, "keys");
        for (float f5 : keys) {
            remove(f5);
        }
    }

    public final int put(float f5, int i5, int i6) {
        int findInsertIndex = findInsertIndex(f5);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        } else {
            i6 = this.values[findInsertIndex];
        }
        this.keys[findInsertIndex] = f5;
        this.values[findInsertIndex] = i5;
        return i6;
    }

    public final boolean remove(float f5, int i5) {
        int findKeyIndex = findKeyIndex(f5);
        if (findKeyIndex < 0 || this.values[findKeyIndex] != i5) {
            return false;
        }
        removeValueAt(findKeyIndex);
        return true;
    }

    public final void minusAssign(@l FloatSet keys) {
        l0.p(keys, "keys");
        float[] fArr = keys.elements;
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
                        remove(fArr[(i5 << 3) + i7]);
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

    public final void minusAssign(@l FloatList keys) {
        l0.p(keys, "keys");
        float[] fArr = keys.content;
        int i5 = keys._size;
        for (int i6 = 0; i6 < i5; i6++) {
            remove(fArr[i6]);
        }
    }
}
