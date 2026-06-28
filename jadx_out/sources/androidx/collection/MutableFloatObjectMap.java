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
import p4.m;
import t0.b;
import v3.p;

@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b3\u00104J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0005H\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0019\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0082\bJ)\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001a\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u001f\u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010 \u001a\u00020\u00052\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\nJ\u0017\u0010!\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b!\u0010\"J\u001d\u0010!\u001a\u00020#2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b!\u0010$J&\u0010'\u001a\u00020\u00052\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020#0%H\u0086\bø\u0001\u0000J\u0011\u0010(\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0086\nJ\u0011\u0010(\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)H\u0086\nJ\u0011\u0010(\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+H\u0086\nJ\u0011\u0010(\u001a\u00020\u00052\u0006\u0010*\u001a\u00020,H\u0086\nJ\u0019\u0010-\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0001¢\u0006\u0004\b-\u0010.J\u0006\u0010/\u001a\u00020\u0005J\u0006\u00100\u001a\u00020\u0003R\u0016\u00101\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00065"}, d2 = {"Landroidx/collection/MutableFloatObjectMap;", "V", "Landroidx/collection/FloatObjectMap;", "", "initialCapacity", "Lkotlin/r2;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "", DatabaseFileArchive.COLUMN_KEY, "findAbsoluteInsertIndex", "hash1", "findFirstAvailableSlot", "adjustStorage", "newCapacity", "resizeStorage", "index", "", b.f22420d, "writeMetadata", "Lkotlin/Function0;", "defaultValue", "getOrPut", "(FLv3/a;)Ljava/lang/Object;", "set", "(FLjava/lang/Object;)V", "put", "(FLjava/lang/Object;)Ljava/lang/Object;", TypedValues.TransitionType.S_FROM, "putAll", "plusAssign", "remove", "(F)Ljava/lang/Object;", "", "(FLjava/lang/Object;)Z", "Lkotlin/Function2;", "predicate", "removeIf", "minusAssign", "", "keys", "Landroidx/collection/FloatSet;", "Landroidx/collection/FloatList;", "removeValueAt", "(I)Ljava/lang/Object;", "clear", "trim", "growthLimit", "I", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nFloatObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/MutableFloatObjectMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 FloatObjectMap.kt\nandroidx/collection/FloatObjectMap\n+ 5 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 6 FloatSet.kt\nandroidx/collection/FloatSet\n+ 7 FloatList.kt\nandroidx/collection/FloatList\n*L\n1#1,1018:1\n820#1,2:1171\n820#1,2:1185\n1008#1,2:1188\n1012#1,5:1196\n1008#1,2:1227\n1012#1,5:1235\n1008#1,2:1252\n1012#1,5:1260\n1#2:1019\n1656#3,6:1020\n1810#3:1036\n1672#3:1040\n1603#3:1057\n1599#3:1060\n1779#3,3:1065\n1793#3,3:1069\n1717#3:1073\n1705#3:1075\n1699#3:1076\n1712#3:1081\n1802#3:1083\n1603#3:1097\n1599#3:1100\n1779#3,3:1105\n1793#3,3:1109\n1717#3:1113\n1705#3:1115\n1699#3:1116\n1712#3:1121\n1802#3:1123\n1810#3:1138\n1672#3:1142\n1810#3:1163\n1672#3:1167\n1656#3,6:1190\n1656#3,6:1201\n1599#3:1210\n1603#3:1211\n1779#3,3:1212\n1793#3,3:1215\n1717#3:1218\n1705#3:1219\n1699#3:1220\n1712#3:1221\n1802#3:1222\n1666#3:1223\n1645#3:1224\n1664#3:1225\n1645#3:1226\n1656#3,6:1229\n1779#3,3:1240\n1810#3:1243\n1699#3:1244\n1669#3:1245\n1645#3:1246\n1599#3:1250\n1603#3:1251\n1656#3,6:1254\n1656#3,6:1265\n1656#3,6:1271\n382#4,4:1026\n354#4,6:1030\n364#4,3:1037\n367#4,2:1041\n387#4,2:1043\n370#4,6:1045\n389#4:1051\n619#4:1052\n620#4:1056\n622#4,2:1058\n624#4,4:1061\n628#4:1068\n629#4:1072\n630#4:1074\n631#4,4:1077\n637#4:1082\n638#4,8:1084\n619#4:1092\n620#4:1096\n622#4,2:1098\n624#4,4:1101\n628#4:1108\n629#4:1112\n630#4:1114\n631#4,4:1117\n637#4:1122\n638#4,8:1124\n354#4,6:1132\n364#4,3:1139\n367#4,9:1143\n833#5,3:1053\n833#5,3:1093\n833#5,3:1207\n833#5,3:1247\n262#6,4:1152\n232#6,7:1156\n243#6,3:1164\n246#6,2:1168\n266#6:1170\n267#6:1173\n249#6,6:1174\n268#6:1180\n253#7,4:1181\n258#7:1187\n*S KotlinDebug\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/MutableFloatObjectMap\n*L\n837#1:1171,2\n846#1:1185,2\n856#1:1188,2\n856#1:1196,5\n920#1:1227,2\n920#1:1235,5\n995#1:1252,2\n995#1:1260,5\n713#1:1020,6\n766#1:1036\n766#1:1040\n782#1:1057\n782#1:1060\n782#1:1065,3\n782#1:1069,3\n782#1:1073\n782#1:1075\n782#1:1076\n782#1:1081\n782#1:1083\n794#1:1097\n794#1:1100\n794#1:1105,3\n794#1:1109,3\n794#1:1113\n794#1:1115\n794#1:1116\n794#1:1121\n794#1:1123\n808#1:1138\n808#1:1142\n836#1:1163\n836#1:1167\n856#1:1190,6\n871#1:1201,6\n886#1:1210\n887#1:1211\n894#1:1212,3\n895#1:1215,3\n896#1:1218\n897#1:1219\n897#1:1220\n901#1:1221\n904#1:1222\n913#1:1223\n913#1:1224\n919#1:1225\n919#1:1226\n920#1:1229,6\n935#1:1240,3\n936#1:1243\n938#1:1244\n990#1:1245\n990#1:1246\n993#1:1250\n995#1:1251\n995#1:1254,6\n1009#1:1265,6\n1015#1:1271,6\n766#1:1026,4\n766#1:1030,6\n766#1:1037,3\n766#1:1041,2\n766#1:1043,2\n766#1:1045,6\n766#1:1051\n782#1:1052\n782#1:1056\n782#1:1058,2\n782#1:1061,4\n782#1:1068\n782#1:1072\n782#1:1074\n782#1:1077,4\n782#1:1082\n782#1:1084,8\n794#1:1092\n794#1:1096\n794#1:1098,2\n794#1:1101,4\n794#1:1108\n794#1:1112\n794#1:1114\n794#1:1117,4\n794#1:1122\n794#1:1124,8\n808#1:1132,6\n808#1:1139,3\n808#1:1143,9\n782#1:1053,3\n794#1:1093,3\n885#1:1207,3\n992#1:1247,3\n836#1:1152,4\n836#1:1156,7\n836#1:1164,3\n836#1:1168,2\n836#1:1170\n836#1:1173\n836#1:1174,6\n836#1:1180\n845#1:1181,4\n845#1:1187\n*E\n"})
/* loaded from: classes.dex */
public final class MutableFloatObjectMap<V> extends FloatObjectMap<V> {
    private int growthLimit;

    public MutableFloatObjectMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableFloatObjectMap(int i5, int i6, w wVar) {
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
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e4, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
    
        r18 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int findAbsoluteInsertIndex(float r20) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatObjectMap.findAbsoluteInsertIndex(float):int");
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
        this.values = new Object[i6];
    }

    private final void resizeStorage(int i5) {
        boolean z4;
        int i6;
        long[] jArr = this.metadata;
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        int i7 = this._capacity;
        initializeStorage(i5);
        float[] fArr2 = this.keys;
        Object[] objArr2 = this.values;
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
                objArr2[findFirstAvailableSlot] = objArr[i6];
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
        o.M1(this.values, null, 0, this._capacity);
        initializeGrowth();
    }

    public final V getOrPut(float f5, @l v3.a<? extends V> defaultValue) {
        l0.p(defaultValue, "defaultValue");
        V v4 = get(f5);
        if (v4 == null) {
            V invoke = defaultValue.invoke();
            set(f5, invoke);
            return invoke;
        }
        return v4;
    }

    public final void minusAssign(float f5) {
        remove(f5);
    }

    public final void plusAssign(@l FloatObjectMap<V> from) {
        l0.p(from, "from");
        putAll(from);
    }

    @m
    public final V put(float f5, V v4) {
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(f5);
        Object[] objArr = this.values;
        V v5 = (V) objArr[findAbsoluteInsertIndex];
        this.keys[findAbsoluteInsertIndex] = f5;
        objArr[findAbsoluteInsertIndex] = v4;
        return v5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@l FloatObjectMap<V> from) {
        boolean z4;
        l0.p(from, "from");
        float[] fArr = from.keys;
        Object[] objArr = from.values;
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
                            set(fArr[i8], objArr[i8]);
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        r10 = -1;
     */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(float r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = java.lang.Float.hashCode(r17)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0._capacity
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.metadata
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L4a
            r10 = r11
            goto L4b
        L4a:
            r10 = r4
        L4b:
            if (r10 == 0) goto L69
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            float[] r14 = r0.keys
            r14 = r14[r10]
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L5f
            r14 = r11
            goto L60
        L5f:
            r14 = r4
        L60:
            if (r14 == 0) goto L63
            goto L73
        L63:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L69:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L7c
            r10 = -1
        L73:
            if (r10 < 0) goto L7a
            java.lang.Object r1 = r0.removeValueAt(r10)
            return r1
        L7a:
            r1 = 0
            return r1
        L7c:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatObjectMap.remove(float):java.lang.Object");
    }

    public final void removeIf(@l p<? super Float, ? super V, Boolean> predicate) {
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
                            if (predicate.invoke(Float.valueOf(this.keys[i8]), this.values[i8]).booleanValue()) {
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
    @m
    public final V removeValueAt(int i5) {
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
        Object[] objArr = this.values;
        V v4 = (V) objArr[i5];
        objArr[i5] = null;
        return v4;
    }

    public final void set(float f5, V v4) {
        int findAbsoluteInsertIndex = findAbsoluteInsertIndex(f5);
        this.keys[findAbsoluteInsertIndex] = f5;
        this.values[findAbsoluteInsertIndex] = v4;
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

    public MutableFloatObjectMap(int i5) {
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

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0072, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(float r17, V r18) {
        /*
            r16 = this;
            r0 = r16
            int r1 = java.lang.Float.hashCode(r17)
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r0._capacity
            int r1 = r1 >>> 7
            r1 = r1 & r3
            r4 = 0
            r5 = r4
        L16:
            long[] r6 = r0.metadata
            int r7 = r1 >> 3
            r8 = r1 & 7
            int r8 = r8 << 3
            r9 = r6[r7]
            long r9 = r9 >>> r8
            r11 = 1
            int r7 = r7 + r11
            r12 = r6[r7]
            int r6 = 64 - r8
            long r6 = r12 << r6
            long r12 = (long) r8
            long r12 = -r12
            r8 = 63
            long r12 = r12 >> r8
            long r6 = r6 & r12
            long r6 = r6 | r9
            long r8 = (long) r2
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r8 = r8 * r12
            long r8 = r8 ^ r6
            long r12 = r8 - r12
            long r8 = ~r8
            long r8 = r8 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r12
        L42:
            r14 = 0
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 == 0) goto L4a
            r10 = r11
            goto L4b
        L4a:
            r10 = r4
        L4b:
            if (r10 == 0) goto L69
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            float[] r14 = r0.keys
            r14 = r14[r10]
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L5f
            r14 = r11
            goto L60
        L5f:
            r14 = r4
        L60:
            if (r14 == 0) goto L63
            goto L73
        L63:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L69:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L86
            r10 = -1
        L73:
            if (r10 < 0) goto L85
            java.lang.Object[] r1 = r0.values
            r1 = r1[r10]
            r6 = r18
            boolean r1 = kotlin.jvm.internal.l0.g(r1, r6)
            if (r1 == 0) goto L85
            r0.removeValueAt(r10)
            return r11
        L85:
            return r4
        L86:
            r6 = r18
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableFloatObjectMap.remove(float, java.lang.Object):boolean");
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
