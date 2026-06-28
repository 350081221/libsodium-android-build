package androidx.collection;

import androidx.annotation.IntRange;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.a1;
import kotlin.collections.o;
import kotlin.g2;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.sequences.m;
import p4.l;
import t0.b;
import w3.h;

@i0(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u00012B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b0\u00101J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\u0017\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0005H\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H\u0002J\u0019\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0082\bJ\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\u00162\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u001d\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fJ\u0014\u0010\u001d\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000 J\u0014\u0010\u001d\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010\u001d\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000!J \u0010\u0019\u001a\u00020\u00052\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001bH\u0086\u0002¢\u0006\u0004\b\u0019\u0010\"J\u0017\u0010\u0019\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\u0002J\u0017\u0010\u0019\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0086\u0002J\u0017\u0010\u0019\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010\u0019\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0086\u0002J\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b#\u0010\u0018J\u0018\u0010$\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b$\u0010\u001aJ\u001d\u0010%\u001a\u00020\u00162\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001b¢\u0006\u0004\b%\u0010\u001eJ\u0014\u0010%\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000 J\u0014\u0010%\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fJ\u0014\u0010%\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010%\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000!J \u0010$\u001a\u00020\u00052\u000e\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001bH\u0086\u0002¢\u0006\u0004\b$\u0010\"J\u0017\u0010$\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0086\u0002J\u0017\u0010$\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001fH\u0086\u0002J\u0017\u0010$\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0086\u0002J\u0017\u0010$\u001a\u00020\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0086\u0002J \u0010(\u001a\u00020\u00052\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00160&H\u0086\bø\u0001\u0000J\u0010\u0010)\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0003H\u0001J\u0006\u0010*\u001a\u00020\u0005J\b\u0010+\u001a\u00020\u0003H\u0007J\f\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000,R\u0016\u0010.\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u00063"}, d2 = {"Landroidx/collection/MutableScatterSet;", "E", "Landroidx/collection/ScatterSet;", "", "initialCapacity", "Lkotlin/r2;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "element", "findAbsoluteInsertIndex", "(Ljava/lang/Object;)I", "hash1", "findFirstAvailableSlot", "adjustStorage", "newCapacity", "resizeStorage", "index", "", b.f22420d, "writeMetadata", "", "add", "(Ljava/lang/Object;)Z", "plusAssign", "(Ljava/lang/Object;)V", "", "elements", "addAll", "([Ljava/lang/Object;)Z", "", "Lkotlin/sequences/m;", "Landroidx/collection/ObjectList;", "([Ljava/lang/Object;)V", "remove", "minusAssign", "removeAll", "Lkotlin/Function1;", "predicate", "removeIf", "removeElementAt", "clear", "trim", "", "asMutableSet", "growthLimit", "I", "<init>", "(I)V", "MutableSetWrapper", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1084:1\n1002#1,2:1269\n1006#1,5:1277\n1002#1,2:1308\n1006#1,5:1316\n1002#1,2:1333\n1006#1,5:1341\n1#2:1085\n1656#3,6:1086\n1810#3:1109\n1672#3:1113\n1589#3,3:1132\n1603#3:1136\n1599#3:1139\n1779#3,3:1143\n1793#3,3:1147\n1717#3:1151\n1705#3:1153\n1699#3:1154\n1712#3:1159\n1802#3:1161\n1589#3,3:1171\n1603#3:1175\n1599#3:1178\n1779#3,3:1182\n1793#3,3:1186\n1717#3:1190\n1705#3:1192\n1699#3:1193\n1712#3:1198\n1802#3:1200\n1810#3:1226\n1672#3:1230\n1810#3:1255\n1672#3:1259\n1656#3,6:1271\n1656#3,6:1282\n1589#3,3:1288\n1599#3:1291\n1603#3:1292\n1779#3,3:1293\n1793#3,3:1296\n1717#3:1299\n1705#3:1300\n1699#3:1301\n1712#3:1302\n1802#3:1303\n1666#3:1304\n1645#3:1305\n1664#3:1306\n1645#3:1307\n1656#3,6:1310\n1779#3,3:1321\n1810#3:1324\n1699#3:1325\n1669#3:1326\n1645#3:1327\n1589#3,3:1328\n1599#3:1331\n1603#3:1332\n1656#3,6:1335\n1656#3,6:1346\n1656#3,6:1352\n13579#4,2:1092\n13579#4,2:1209\n1855#5,2:1094\n1855#5,2:1213\n1295#6,2:1096\n1295#6,2:1211\n267#7,4:1098\n237#7,7:1102\n248#7,3:1110\n251#7,2:1114\n272#7,2:1116\n254#7,6:1118\n274#7:1124\n433#7:1131\n434#7:1135\n436#7,2:1137\n438#7,3:1140\n441#7:1146\n442#7:1150\n443#7:1152\n444#7,4:1155\n450#7:1160\n451#7,8:1162\n433#7:1170\n434#7:1174\n436#7,2:1176\n438#7,3:1179\n441#7:1185\n442#7:1189\n443#7:1191\n444#7,4:1194\n450#7:1199\n451#7,8:1201\n267#7,4:1215\n237#7,7:1219\n248#7,3:1227\n251#7,2:1231\n272#7,2:1233\n254#7,6:1235\n274#7:1241\n237#7,7:1248\n248#7,3:1256\n251#7,9:1260\n305#8,6:1125\n305#8,6:1242\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n*L\n857#1:1269,2\n857#1:1277,5\n917#1:1308,2\n917#1:1316,5\n990#1:1333,2\n990#1:1341,5\n567#1:1086,6\n692#1:1109\n692#1:1113\n714#1:1132,3\n714#1:1136\n714#1:1139\n714#1:1143,3\n714#1:1147,3\n714#1:1151\n714#1:1153\n714#1:1154\n714#1:1159\n714#1:1161\n727#1:1171,3\n727#1:1175\n727#1:1178\n727#1:1182,3\n727#1:1186,3\n727#1:1190\n727#1:1192\n727#1:1193\n727#1:1198\n727#1:1200\n823#1:1226\n823#1:1230\n843#1:1255\n843#1:1259\n857#1:1271,6\n868#1:1282,6\n882#1:1288,3\n883#1:1291\n884#1:1292\n891#1:1293,3\n892#1:1296,3\n893#1:1299\n894#1:1300\n894#1:1301\n898#1:1302\n901#1:1303\n910#1:1304\n910#1:1305\n916#1:1306\n916#1:1307\n917#1:1310,6\n931#1:1321,3\n932#1:1324\n934#1:1325\n985#1:1326\n985#1:1327\n987#1:1328,3\n988#1:1331\n990#1:1332\n990#1:1335,6\n1003#1:1346,6\n1009#1:1352,6\n662#1:1092,2\n793#1:1209,2\n672#1:1094,2\n813#1:1213,2\n682#1:1096,2\n803#1:1211,2\n692#1:1098,4\n692#1:1102,7\n692#1:1110,3\n692#1:1114,2\n692#1:1116,2\n692#1:1118,6\n692#1:1124\n714#1:1131\n714#1:1135\n714#1:1137,2\n714#1:1140,3\n714#1:1146\n714#1:1150\n714#1:1152\n714#1:1155,4\n714#1:1160\n714#1:1162,8\n727#1:1170\n727#1:1174\n727#1:1176,2\n727#1:1179,3\n727#1:1185\n727#1:1189\n727#1:1191\n727#1:1194,4\n727#1:1199\n727#1:1201,8\n823#1:1215,4\n823#1:1219,7\n823#1:1227,3\n823#1:1231,2\n823#1:1233,2\n823#1:1235,6\n823#1:1241\n843#1:1248,7\n843#1:1256,3\n843#1:1260,9\n702#1:1125,6\n833#1:1242,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableScatterSet<E> extends ScatterSet<E> {
    private int growthLimit;

    @i0(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0096\u0002J\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0016\u0010\u0011\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¨\u0006\u0014"}, d2 = {"Landroidx/collection/MutableScatterSet$MutableSetWrapper;", "Landroidx/collection/ScatterSet$SetWrapper;", "Landroidx/collection/ScatterSet;", "", "element", "", "add", "(Ljava/lang/Object;)Z", "", "elements", "addAll", "Lkotlin/r2;", "clear", "", "iterator", "remove", "retainAll", "removeAll", "<init>", "(Landroidx/collection/MutableScatterSet;)V", "collection"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1084:1\n237#2,7:1085\n248#2,3:1093\n251#2,9:1097\n1810#3:1092\n1672#3:1096\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/MutableScatterSet$MutableSetWrapper\n*L\n1064#1:1085,7\n1064#1:1093,3\n1064#1:1097,9\n1064#1:1092\n1064#1:1096\n*E\n"})
    /* loaded from: classes.dex */
    private final class MutableSetWrapper extends ScatterSet<E>.SetWrapper implements Set<E>, h {
        public MutableSetWrapper() {
            super();
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean add(E e5) {
            return MutableScatterSet.this.add(e5);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean addAll(@l Collection<? extends E> elements) {
            l0.p(elements, "elements");
            return MutableScatterSet.this.addAll(elements);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public void clear() {
            MutableScatterSet.this.clear();
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection, java.lang.Iterable
        @l
        public Iterator<E> iterator() {
            return new MutableScatterSet$MutableSetWrapper$iterator$1(MutableScatterSet.this);
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            return MutableScatterSet.this.remove(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean removeAll(@l Collection<? extends Object> elements) {
            l0.p(elements, "elements");
            int size = MutableScatterSet.this.getSize();
            Iterator<? extends Object> it = elements.iterator();
            while (it.hasNext()) {
                MutableScatterSet.this.minusAssign((MutableScatterSet<E>) it.next());
            }
            if (size != MutableScatterSet.this.getSize()) {
                return true;
            }
            return false;
        }

        @Override // androidx.collection.ScatterSet.SetWrapper, java.util.Set, java.util.Collection
        public boolean retainAll(@l Collection<? extends Object> elements) {
            boolean z4;
            l0.p(elements, "elements");
            MutableScatterSet<E> mutableScatterSet = MutableScatterSet.this;
            long[] jArr = mutableScatterSet.metadata;
            int length = jArr.length - 2;
            boolean z5 = false;
            if (length >= 0) {
                int i5 = 0;
                boolean z6 = false;
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
                                if (!elements.contains(mutableScatterSet.elements[i8])) {
                                    mutableScatterSet.removeElementAt(i8);
                                    z6 = true;
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i6 != 8) {
                            return z6;
                        }
                    }
                    if (i5 != length) {
                        i5++;
                    } else {
                        z5 = z6;
                        break;
                    }
                }
            }
            return z5;
        }
    }

    public MutableScatterSet() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableScatterSet(int i5, int i6, w wVar) {
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
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ec, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c4, code lost:
    
        r19 = 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int findAbsoluteInsertIndex(E r21) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.findAbsoluteInsertIndex(java.lang.Object):int");
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
        this.elements = new Object[i6];
    }

    private final void resizeStorage(int i5) {
        boolean z4;
        int i6;
        int i7;
        long[] jArr = this.metadata;
        Object[] objArr = this.elements;
        int i8 = this._capacity;
        initializeStorage(i5);
        Object[] objArr2 = this.elements;
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
                long[] jArr2 = this.metadata;
                int i12 = findFirstAvailableSlot >> 3;
                int i13 = (findFirstAvailableSlot & 7) << 3;
                i6 = i9;
                jArr2[i12] = (jArr2[i12] & (~(255 << i13))) | (j5 << i13);
                int i14 = this._capacity;
                int i15 = ((findFirstAvailableSlot - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr2[i16] = ((~(255 << i17)) & jArr2[i16]) | (j5 << i17);
                objArr2[findFirstAvailableSlot] = obj;
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

    public final boolean add(E e5) {
        int size = getSize();
        this.elements[findAbsoluteInsertIndex(e5)] = e5;
        if (getSize() != size) {
            return true;
        }
        return false;
    }

    public final boolean addAll(@l E[] elements) {
        l0.p(elements, "elements");
        int size = getSize();
        plusAssign((Object[]) elements);
        return size != getSize();
    }

    @l
    public final Set<E> asMutableSet() {
        return new MutableSetWrapper();
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
        o.M1(this.elements, null, 0, this._capacity);
        initializeGrowth();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void minusAssign(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.metadata
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L50
            r11 = r12
            goto L51
        L50:
            r11 = r2
        L51:
            if (r11 == 0) goto L6c
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.elements
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.l0.g(r15, r1)
            if (r15 == 0) goto L66
            goto L76
        L66:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L6c:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7c
            r11 = -1
        L76:
            if (r11 < 0) goto L7b
            r0.removeElementAt(r11)
        L7b:
            return
        L7c:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.minusAssign(java.lang.Object):void");
    }

    public final void plusAssign(E e5) {
        this.elements[findAbsoluteInsertIndex(e5)] = e5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0073, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(E r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            if (r1 == 0) goto Lc
            int r3 = r18.hashCode()
            goto Ld
        Lc:
            r3 = r2
        Ld:
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0._capacity
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = r2
        L1c:
            long[] r7 = r0.metadata
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            r12 = 1
            int r8 = r8 + r12
            r13 = r7[r8]
            int r7 = 64 - r9
            long r7 = r13 << r7
            long r13 = (long) r9
            long r13 = -r13
            r9 = 63
            long r13 = r13 >> r9
            long r7 = r7 & r13
            long r7 = r7 | r10
            long r9 = (long) r4
            r13 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r13
            long r9 = r9 ^ r7
            long r13 = r9 - r13
            long r9 = ~r9
            long r9 = r9 & r13
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r13
        L48:
            r15 = 0
            int r11 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r11 == 0) goto L50
            r11 = r12
            goto L51
        L50:
            r11 = r2
        L51:
            if (r11 == 0) goto L6c
            int r11 = java.lang.Long.numberOfTrailingZeros(r9)
            int r11 = r11 >> 3
            int r11 = r11 + r3
            r11 = r11 & r5
            java.lang.Object[] r15 = r0.elements
            r15 = r15[r11]
            boolean r15 = kotlin.jvm.internal.l0.g(r15, r1)
            if (r15 == 0) goto L66
            goto L76
        L66:
            r15 = 1
            long r15 = r9 - r15
            long r9 = r9 & r15
            goto L48
        L6c:
            long r9 = ~r7
            r11 = 6
            long r9 = r9 << r11
            long r7 = r7 & r9
            long r7 = r7 & r13
            int r7 = (r7 > r15 ? 1 : (r7 == r15 ? 0 : -1))
            if (r7 == 0) goto L7f
            r11 = -1
        L76:
            if (r11 < 0) goto L79
            r2 = r12
        L79:
            if (r2 == 0) goto L7e
            r0.removeElementAt(r11)
        L7e:
            return r2
        L7f:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet.remove(java.lang.Object):boolean");
    }

    public final boolean removeAll(@l E[] elements) {
        l0.p(elements, "elements");
        int size = getSize();
        minusAssign((Object[]) elements);
        return size != getSize();
    }

    @a1
    public final void removeElementAt(int i5) {
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
        this.elements[i5] = null;
    }

    public final void removeIf(@l v3.l<? super E, Boolean> predicate) {
        boolean z4;
        l0.p(predicate, "predicate");
        Object[] objArr = this.elements;
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
                            if (predicate.invoke(objArr[i8]).booleanValue()) {
                                removeElementAt(i8);
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

    public MutableScatterSet(int i5) {
        super(null);
        if (i5 >= 0) {
            initializeStorage(ScatterMapKt.unloadedCapacity(i5));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.".toString());
    }

    public final void plusAssign(@l E[] elements) {
        l0.p(elements, "elements");
        for (E e5 : elements) {
            plusAssign((MutableScatterSet<E>) e5);
        }
    }

    public final boolean addAll(@l Iterable<? extends E> elements) {
        l0.p(elements, "elements");
        int size = getSize();
        plusAssign((Iterable) elements);
        return size != getSize();
    }

    public final boolean removeAll(@l m<? extends E> elements) {
        l0.p(elements, "elements");
        int size = getSize();
        minusAssign((m) elements);
        return size != getSize();
    }

    public final void plusAssign(@l Iterable<? extends E> elements) {
        l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            plusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public final boolean addAll(@l m<? extends E> elements) {
        l0.p(elements, "elements");
        int size = getSize();
        plusAssign((m) elements);
        return size != getSize();
    }

    public final void plusAssign(@l m<? extends E> elements) {
        l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            plusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public final boolean removeAll(@l Iterable<? extends E> elements) {
        l0.p(elements, "elements");
        int size = getSize();
        minusAssign((Iterable) elements);
        return size != getSize();
    }

    public final void minusAssign(@l E[] elements) {
        l0.p(elements, "elements");
        for (E e5 : elements) {
            minusAssign((MutableScatterSet<E>) e5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@l ScatterSet<E> elements) {
        l0.p(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        plusAssign((MutableScatterSet<E>) objArr[(i5 << 3) + i7]);
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

    public final boolean addAll(@l ScatterSet<E> elements) {
        l0.p(elements, "elements");
        int size = getSize();
        plusAssign((ScatterSet) elements);
        return size != getSize();
    }

    public final void minusAssign(@l m<? extends E> elements) {
        l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            minusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public final boolean removeAll(@l ScatterSet<E> elements) {
        l0.p(elements, "elements");
        int size = getSize();
        minusAssign((ScatterSet) elements);
        return size != getSize();
    }

    public final void minusAssign(@l Iterable<? extends E> elements) {
        l0.p(elements, "elements");
        Iterator<? extends E> it = elements.iterator();
        while (it.hasNext()) {
            minusAssign((MutableScatterSet<E>) it.next());
        }
    }

    public final boolean addAll(@l ObjectList<E> elements) {
        l0.p(elements, "elements");
        int size = getSize();
        plusAssign((ObjectList) elements);
        return size != getSize();
    }

    public final boolean removeAll(@l ObjectList<E> elements) {
        l0.p(elements, "elements");
        int size = getSize();
        minusAssign((ObjectList) elements);
        return size != getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@l ScatterSet<E> elements) {
        l0.p(elements, "elements");
        Object[] objArr = elements.elements;
        long[] jArr = elements.metadata;
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
                        minusAssign((MutableScatterSet<E>) objArr[(i5 << 3) + i7]);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void plusAssign(@l ObjectList<E> elements) {
        l0.p(elements, "elements");
        Object[] objArr = elements.content;
        int i5 = elements._size;
        for (int i6 = 0; i6 < i5; i6++) {
            plusAssign((MutableScatterSet<E>) objArr[i6]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@l ObjectList<E> elements) {
        l0.p(elements, "elements");
        Object[] objArr = elements.content;
        int i5 = elements._size;
        for (int i6 = 0; i6 < i5; i6++) {
            minusAssign((MutableScatterSet<E>) objArr[i6]);
        }
    }
}
