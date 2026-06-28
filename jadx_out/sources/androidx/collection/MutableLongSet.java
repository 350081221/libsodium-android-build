package androidx.collection;

import androidx.annotation.IntRange;
import kotlin.collections.o;
import kotlin.g2;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import p4.l;
import t0.b;

@i0(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0002H\u0002J\u0019\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u000bH\u0082\bJ\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bJ\u0011\u0010\u0017\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018J\u0011\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\u0002J\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0001J\u0011\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0001H\u0086\u0002J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bJ\u0011\u0010\u001c\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0086\u0002J\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0018J\u0011\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0086\u0002J\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0001J\u0011\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0001H\u0086\u0002J\u0006\u0010\u001e\u001a\u00020\u0004J\b\u0010\u001f\u001a\u00020\u0002H\u0007R\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Landroidx/collection/MutableLongSet;", "Landroidx/collection/LongSet;", "", "initialCapacity", "Lkotlin/r2;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "index", "removeElementAt", "", "element", "findAbsoluteInsertIndex", "hash1", "findFirstAvailableSlot", "adjustStorage", "newCapacity", "resizeStorage", b.f22420d, "writeMetadata", "", "add", "plusAssign", "", "elements", "addAll", "remove", "minusAssign", "removeAll", "clear", "trim", "growthLimit", "I", "<init>", "(I)V", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/MutableLongSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 LongSet.kt\nandroidx/collection/LongSet\n+ 6 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,837:1\n816#1,2:981\n820#1,5:989\n816#1,2:1020\n820#1,5:1028\n816#1,2:1045\n820#1,5:1053\n1#2:838\n1656#3,6:839\n1810#3:858\n1672#3:862\n1603#3:879\n1599#3:882\n1779#3,3:886\n1793#3,3:890\n1717#3:894\n1705#3:896\n1699#3:897\n1712#3:902\n1802#3:904\n1603#3:918\n1599#3:921\n1779#3,3:925\n1793#3,3:929\n1717#3:933\n1705#3:935\n1699#3:936\n1712#3:941\n1802#3:943\n1810#3:965\n1672#3:969\n1656#3,6:983\n1656#3,6:994\n1599#3:1003\n1603#3:1004\n1779#3,3:1005\n1793#3,3:1008\n1717#3:1011\n1705#3:1012\n1699#3:1013\n1712#3:1014\n1802#3:1015\n1666#3:1016\n1645#3:1017\n1664#3:1018\n1645#3:1019\n1656#3,6:1022\n1779#3,3:1033\n1810#3:1036\n1699#3:1037\n1669#3:1038\n1645#3:1039\n1599#3:1043\n1603#3:1044\n1656#3,6:1047\n1656#3,6:1058\n1656#3,6:1064\n13607#4,2:845\n13607#4,2:952\n262#5,4:847\n232#5,7:851\n243#5,3:859\n246#5,2:863\n266#5,2:865\n249#5,6:867\n268#5:873\n442#5:874\n443#5:878\n445#5,2:880\n447#5,3:883\n450#5:889\n451#5:893\n452#5:895\n453#5,4:898\n459#5:903\n460#5,8:905\n442#5:913\n443#5:917\n445#5,2:919\n447#5,3:922\n450#5:928\n451#5:932\n452#5:934\n453#5,4:937\n459#5:942\n460#5,8:944\n262#5,4:954\n232#5,7:958\n243#5,3:966\n246#5,2:970\n266#5,2:972\n249#5,6:974\n268#5:980\n833#6,3:875\n833#6,3:914\n833#6,3:1000\n833#6,3:1040\n*S KotlinDebug\n*F\n+ 1 LongSet.kt\nandroidx/collection/MutableLongSet\n*L\n673#1:981,2\n673#1:989,5\n731#1:1020,2\n731#1:1028,5\n804#1:1045,2\n804#1:1053,5\n526#1:839,6\n595#1:858\n595#1:862\n607#1:879\n607#1:882\n607#1:886,3\n607#1:890,3\n607#1:894\n607#1:896\n607#1:897\n607#1:902\n607#1:904\n620#1:918\n620#1:921\n620#1:925,3\n620#1:929,3\n620#1:933\n620#1:935\n620#1:936\n620#1:941\n620#1:943\n663#1:965\n663#1:969\n673#1:983,6\n683#1:994,6\n697#1:1003\n698#1:1004\n705#1:1005,3\n706#1:1008,3\n707#1:1011\n708#1:1012\n708#1:1013\n712#1:1014\n715#1:1015\n724#1:1016\n724#1:1017\n730#1:1018\n730#1:1019\n731#1:1022,6\n745#1:1033,3\n746#1:1036\n748#1:1037\n799#1:1038\n799#1:1039\n802#1:1043\n804#1:1044\n804#1:1047,6\n817#1:1058,6\n823#1:1064,6\n573#1:845,2\n642#1:952,2\n595#1:847,4\n595#1:851,7\n595#1:859,3\n595#1:863,2\n595#1:865,2\n595#1:867,6\n595#1:873\n607#1:874\n607#1:878\n607#1:880,2\n607#1:883,3\n607#1:889\n607#1:893\n607#1:895\n607#1:898,4\n607#1:903\n607#1:905,8\n620#1:913\n620#1:917\n620#1:919,2\n620#1:922,3\n620#1:928\n620#1:932\n620#1:934\n620#1:937,4\n620#1:942\n620#1:944,8\n663#1:954,4\n663#1:958,7\n663#1:966,3\n663#1:970,2\n663#1:972,2\n663#1:974,6\n663#1:980\n607#1:875,3\n620#1:914,3\n696#1:1000,3\n801#1:1040,3\n*E\n"})
/* loaded from: classes.dex */
public final class MutableLongSet extends LongSet {
    private int growthLimit;

    public MutableLongSet() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableLongSet(int i5, int i6, w wVar) {
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

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        if (((((~r7) << 6) & r7) & (-9187201950435737472L)) == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        r1 = findFirstAvailableSlot(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        if (r21.growthLimit != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        if (((r21.metadata[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008f, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        if (r3 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        adjustStorage();
        r1 = findFirstAvailableSlot(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009b, code lost:
    
        r21._size++;
        r2 = r21.growthLimit;
        r3 = r21.metadata;
        r6 = r1 >> 3;
        r7 = r3[r6];
        r11 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
    
        if (((r7 >> r11) & 255) != 128) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
    
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ba, code lost:
    
        r21.growthLimit = r2 - r18;
        r3[r6] = (r7 & (~(255 << r11))) | (r9 << r11);
        r2 = r21._capacity;
        r6 = ((r1 - 7) & r2) + (r2 & 7);
        r2 = r6 >> 3;
        r6 = (r6 & 7) << 3;
        r3[r2] = ((~(255 << r6)) & r3[r2]) | (r9 << r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00df, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
    
        r18 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int findAbsoluteInsertIndex(long r22) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongSet.findAbsoluteInsertIndex(long):int");
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
        this.elements = new long[i6];
    }

    private final void removeElementAt(int i5) {
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

    private final void resizeStorage(int i5) {
        boolean z4;
        int i6;
        long[] jArr = this.metadata;
        long[] jArr2 = this.elements;
        int i7 = this._capacity;
        initializeStorage(i5);
        long[] jArr3 = this.elements;
        int i8 = 0;
        while (i8 < i7) {
            if (((jArr[i8 >> 3] >> ((i8 & 7) << 3)) & 255) < 128) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                long j5 = jArr2[i8];
                int hashCode = Long.hashCode(j5) * ScatterMapKt.MurmurHashC1;
                int i9 = hashCode ^ (hashCode << 16);
                int findFirstAvailableSlot = findFirstAvailableSlot(i9 >>> 7);
                long j6 = i9 & 127;
                long[] jArr4 = this.metadata;
                int i10 = findFirstAvailableSlot >> 3;
                int i11 = (findFirstAvailableSlot & 7) << 3;
                i6 = i8;
                jArr4[i10] = (jArr4[i10] & (~(255 << i11))) | (j6 << i11);
                int i12 = this._capacity;
                int i13 = ((findFirstAvailableSlot - 7) & i12) + (i12 & 7);
                int i14 = i13 >> 3;
                int i15 = (i13 & 7) << 3;
                jArr4[i14] = ((~(255 << i15)) & jArr4[i14]) | (j6 << i15);
                jArr3[findFirstAvailableSlot] = j5;
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

    public final boolean add(long j5) {
        int i5 = this._size;
        this.elements[findAbsoluteInsertIndex(j5)] = j5;
        if (this._size != i5) {
            return true;
        }
        return false;
    }

    public final boolean addAll(@l long[] elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        plusAssign(elements);
        return i5 != this._size;
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

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void minusAssign(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
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
            if (r10 == 0) goto L64
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.elements
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L5e
            goto L6e
        L5e:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L64:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L74
            r10 = -1
        L6e:
            if (r10 < 0) goto L73
            r0.removeElementAt(r10)
        L73:
            return
        L74:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongSet.minusAssign(long):void");
    }

    public final void plusAssign(long j5) {
        this.elements[findAbsoluteInsertIndex(j5)] = j5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(long r18) {
        /*
            r17 = this;
            r0 = r17
            int r1 = java.lang.Long.hashCode(r18)
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
            if (r10 == 0) goto L64
            int r10 = java.lang.Long.numberOfTrailingZeros(r8)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            long[] r14 = r0.elements
            r15 = r14[r10]
            int r14 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r14 != 0) goto L5e
            goto L6e
        L5e:
            r14 = 1
            long r14 = r8 - r14
            long r8 = r8 & r14
            goto L42
        L64:
            long r8 = ~r6
            r10 = 6
            long r8 = r8 << r10
            long r6 = r6 & r8
            long r6 = r6 & r12
            int r6 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r6 == 0) goto L77
            r10 = -1
        L6e:
            if (r10 < 0) goto L71
            r4 = r11
        L71:
            if (r4 == 0) goto L76
            r0.removeElementAt(r10)
        L76:
            return r4
        L77:
            int r5 = r5 + 8
            int r1 = r1 + r5
            r1 = r1 & r3
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableLongSet.remove(long):boolean");
    }

    public final boolean removeAll(@l long[] elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        minusAssign(elements);
        return i5 != this._size;
    }

    @IntRange(from = 0)
    public final int trim() {
        int i5 = this._capacity;
        int normalizeCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size));
        if (normalizeCapacity < i5) {
            resizeStorage(normalizeCapacity);
            return i5 - this._capacity;
        }
        return 0;
    }

    public MutableLongSet(int i5) {
        super(null);
        if (i5 >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i5));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void plusAssign(@l long[] elements) {
        l0.p(elements, "elements");
        for (long j5 : elements) {
            plusAssign(j5);
        }
    }

    public final boolean addAll(@l LongSet elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        plusAssign(elements);
        return i5 != this._size;
    }

    public final boolean removeAll(@l LongSet elements) {
        l0.p(elements, "elements");
        int i5 = this._size;
        minusAssign(elements);
        return i5 != this._size;
    }

    public final void plusAssign(@l LongSet elements) {
        l0.p(elements, "elements");
        long[] jArr = elements.elements;
        long[] jArr2 = elements.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr2[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        plusAssign(jArr[(i5 << 3) + i7]);
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

    public final void minusAssign(@l long[] elements) {
        l0.p(elements, "elements");
        for (long j5 : elements) {
            minusAssign(j5);
        }
    }

    public final void minusAssign(@l LongSet elements) {
        l0.p(elements, "elements");
        long[] jArr = elements.elements;
        long[] jArr2 = elements.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr2[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8 - ((~(i5 - length)) >>> 31);
                for (int i7 = 0; i7 < i6; i7++) {
                    if ((255 & j5) < 128) {
                        minusAssign(jArr[(i5 << 3) + i7]);
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
