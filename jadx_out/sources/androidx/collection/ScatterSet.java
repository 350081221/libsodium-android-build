package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.ContainerHelpersKt;
import com.bytedance.sdk.openadsdk.downloadnew.core.TTDownloadField;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.a1;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.w;
import kotlin.r2;
import kotlin.sequences.q;
import p4.l;
import p4.m;
import u3.e;
import u3.i;

@i0(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001?B\t\b\u0004¢\u0006\u0004\b>\u00101J\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\u0006\u001a\u00020\u0003J\u0006\u0010\u0007\u001a\u00020\u0003J\u0010\u0010\b\u001a\u00028\u0000H\u0086\b¢\u0006\u0004\b\b\u0010\tJA\u0010\b\u001a\u00028\u00002!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\b\u0010\u000fJC\u0010\u0010\u001a\u0004\u0018\u00018\u00002!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u0010\u0010\u000fJ:\u0010\u0015\u001a\u00020\u00132!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\nH\u0081\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010\u0016\u001a\u00020\u00132!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00130\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010\u0017\u001a\u00020\u00032!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010\u0004\u001a\u00020\u00032!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\nH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010\u0018\u001a\u00020\u0011H\u0007J:\u0010\u0018\u001a\u00020\u00112!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00030\nH\u0087\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJR\u0010#\u001a\u00020\"2\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001b2\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010 \u001a\u00020\u001b2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b\u0018\u00010\nH\u0007J\b\u0010$\u001a\u00020\u0011H\u0016J\u0013\u0010&\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010'\u001a\u00020\"H\u0016J\u0018\u0010*\u001a\u00020\u00112\u0006\u0010\r\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b(\u0010)J\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+R\u001c\u0010.\u001a\u00020-8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b.\u0010/\u0012\u0004\b0\u00101R$\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002028\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b3\u00104\u0012\u0004\b5\u00101R\u0016\u00106\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u0011\u0010;\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010=\u001a\u00020\u00118G¢\u0006\u0006\u001a\u0004\b<\u0010:\u0082\u0001\u0001@\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006A"}, d2 = {"Landroidx/collection/ScatterSet;", "E", "", "", "any", "none", "isEmpty", "isNotEmpty", "first", "()Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/v0;", "name", "element", "predicate", "(Lv3/l;)Ljava/lang/Object;", "firstOrNull", "", "index", "Lkotlin/r2;", "block", "forEachIndex", "forEach", "all", "count", "contains", "(Ljava/lang/Object;)Z", "", "separator", "prefix", "postfix", "limit", "truncated", "transform", "", "joinToString", TTDownloadField.TT_HASHCODE, "other", "equals", "toString", "findElementIndex$collection", "(Ljava/lang/Object;)I", "findElementIndex", "", "asSet", "", "metadata", "[J", "getMetadata$annotations", "()V", "", "elements", "[Ljava/lang/Object;", "getElements$annotations", "_capacity", "I", "_size", "getCapacity", "()I", "capacity", "getSize", "size", "<init>", "SetWrapper", "Landroidx/collection/MutableScatterSet;", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1084:1\n267#1,4:1085\n237#1,7:1089\n248#1,3:1097\n251#1,2:1101\n272#1,2:1103\n254#1,6:1105\n274#1:1111\n267#1,4:1112\n237#1,7:1116\n248#1,3:1124\n251#1,2:1128\n272#1,2:1130\n254#1,6:1132\n274#1:1138\n267#1,4:1139\n237#1,7:1143\n248#1,3:1151\n251#1,2:1155\n272#1,2:1157\n254#1,6:1159\n274#1:1165\n237#1,7:1168\n248#1,3:1176\n251#1,9:1180\n267#1,4:1189\n237#1,7:1193\n248#1,3:1201\n251#1,2:1205\n272#1,2:1207\n254#1,6:1209\n274#1:1215\n267#1,4:1216\n237#1,7:1220\n248#1,3:1228\n251#1,2:1232\n272#1,2:1234\n254#1,6:1236\n274#1:1242\n267#1,4:1243\n237#1,7:1247\n248#1,3:1255\n251#1,2:1259\n272#1,2:1261\n254#1,6:1263\n274#1:1269\n433#1:1270\n434#1:1274\n436#1,2:1276\n438#1,3:1279\n441#1:1285\n442#1:1289\n443#1:1291\n444#1,4:1294\n450#1:1299\n451#1,8:1301\n267#1,4:1309\n237#1,7:1313\n248#1,3:1321\n251#1,2:1325\n272#1,2:1327\n254#1,6:1329\n274#1:1335\n267#1,4:1336\n237#1,7:1340\n248#1,3:1348\n251#1,2:1352\n272#1,2:1354\n254#1,6:1356\n274#1:1362\n267#1,4:1363\n237#1,7:1367\n248#1,3:1375\n251#1,2:1379\n272#1,2:1381\n254#1,6:1383\n274#1:1389\n1810#2:1096\n1672#2:1100\n1810#2:1123\n1672#2:1127\n1810#2:1150\n1672#2:1154\n1810#2:1166\n1672#2:1167\n1810#2:1175\n1672#2:1179\n1810#2:1200\n1672#2:1204\n1810#2:1227\n1672#2:1231\n1810#2:1254\n1672#2:1258\n1589#2,3:1271\n1603#2:1275\n1599#2:1278\n1779#2,3:1282\n1793#2,3:1286\n1717#2:1290\n1705#2:1292\n1699#2:1293\n1712#2:1298\n1802#2:1300\n1810#2:1320\n1672#2:1324\n1810#2:1347\n1672#2:1351\n1810#2:1374\n1672#2:1378\n1589#2,3:1390\n1603#2:1393\n1599#2:1394\n1779#2,3:1395\n1793#2,3:1398\n1717#2:1401\n1705#2:1402\n1699#2:1403\n1712#2:1404\n1802#2:1405\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet\n*L\n201#1:1085,4\n201#1:1089,7\n201#1:1097,3\n201#1:1101,2\n201#1:1103,2\n201#1:1105,6\n201#1:1111\n214#1:1112,4\n214#1:1116,7\n214#1:1124,3\n214#1:1128,2\n214#1:1130,2\n214#1:1132,6\n214#1:1138\n227#1:1139,4\n227#1:1143,7\n227#1:1151,3\n227#1:1155,2\n227#1:1157,2\n227#1:1159,6\n227#1:1165\n270#1:1168,7\n270#1:1176,3\n270#1:1180,9\n284#1:1189,4\n284#1:1193,7\n284#1:1201,3\n284#1:1205,2\n284#1:1207,2\n284#1:1209,6\n284#1:1215\n297#1:1216,4\n297#1:1220,7\n297#1:1228,3\n297#1:1232,2\n297#1:1234,2\n297#1:1236,6\n297#1:1242\n318#1:1243,4\n318#1:1247,7\n318#1:1255,3\n318#1:1259,2\n318#1:1261,2\n318#1:1263,6\n318#1:1269\n329#1:1270\n329#1:1274\n329#1:1276,2\n329#1:1279,3\n329#1:1285\n329#1:1289\n329#1:1291\n329#1:1294,4\n329#1:1299\n329#1:1301,8\n352#1:1309,4\n352#1:1313,7\n352#1:1321,3\n352#1:1325,2\n352#1:1327,2\n352#1:1329,6\n352#1:1335\n378#1:1336,4\n378#1:1340,7\n378#1:1348,3\n378#1:1352,2\n378#1:1354,2\n378#1:1356,6\n378#1:1362\n407#1:1363,4\n407#1:1367,7\n407#1:1375,3\n407#1:1379,2\n407#1:1381,2\n407#1:1383,6\n407#1:1389\n201#1:1096\n201#1:1100\n214#1:1123\n214#1:1127\n227#1:1150\n227#1:1154\n243#1:1166\n250#1:1167\n270#1:1175\n270#1:1179\n284#1:1200\n284#1:1204\n297#1:1227\n297#1:1231\n318#1:1254\n318#1:1258\n329#1:1271,3\n329#1:1275\n329#1:1278\n329#1:1282,3\n329#1:1286,3\n329#1:1290\n329#1:1292\n329#1:1293\n329#1:1298\n329#1:1300\n352#1:1320\n352#1:1324\n378#1:1347\n378#1:1351\n407#1:1374\n407#1:1378\n433#1:1390,3\n434#1:1393\n437#1:1394\n440#1:1395,3\n441#1:1398,3\n442#1:1401\n443#1:1402\n443#1:1403\n447#1:1404\n450#1:1405\n*E\n"})
/* loaded from: classes.dex */
public abstract class ScatterSet<E> {

    @e
    public int _capacity;

    @e
    public int _size;

    @l
    @e
    public Object[] elements;

    @l
    @e
    public long[] metadata;

    @i0(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0090\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/collection/ScatterSet$SetWrapper;", "", "(Landroidx/collection/ScatterSet;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "isEmpty", "iterator", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @r1({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1084:1\n1855#2,2:1085\n*S KotlinDebug\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSet$SetWrapper\n*L\n478#1:1085,2\n*E\n"})
    /* loaded from: classes.dex */
    public class SetWrapper implements Set<E>, w3.a {
        public SetWrapper() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(E e5) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return ScatterSet.this.contains(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(@l Collection<? extends Object> elements) {
            l0.p(elements, "elements");
            ScatterSet<E> scatterSet = ScatterSet.this;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!scatterSet.contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        public int getSize() {
            return ScatterSet.this._size;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return ScatterSet.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @l
        public Iterator<E> iterator() {
            Iterator<E> a5;
            a5 = q.a(new ScatterSet$SetWrapper$iterator$1(ScatterSet.this, null));
            return a5;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Set, java.util.Collection
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return v.a(this);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] array) {
            l0.p(array, "array");
            return (T[]) v.b(this, array);
        }
    }

    private ScatterSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = ContainerHelpersKt.EMPTY_OBJECTS;
    }

    public /* synthetic */ ScatterSet(w wVar) {
        this();
    }

    @a1
    public static /* synthetic */ void getElements$annotations() {
    }

    @a1
    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ String joinToString$default(ScatterSet scatterSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i5, CharSequence charSequence4, v3.l lVar, int i6, Object obj) {
        CharSequence charSequence5;
        if (obj == null) {
            if ((i6 & 1) != 0) {
                charSequence = ", ";
            }
            CharSequence charSequence6 = "";
            if ((i6 & 2) != 0) {
                charSequence5 = "";
            } else {
                charSequence5 = charSequence2;
            }
            if ((i6 & 4) == 0) {
                charSequence6 = charSequence3;
            }
            if ((i6 & 8) != 0) {
                i5 = -1;
            }
            int i7 = i5;
            if ((i6 & 16) != 0) {
                charSequence4 = "...";
            }
            CharSequence charSequence7 = charSequence4;
            if ((i6 & 32) != 0) {
                lVar = null;
            }
            return scatterSet.joinToString(charSequence, charSequence5, charSequence6, i7, charSequence7, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final boolean all(@l v3.l<? super E, Boolean> predicate) {
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
                        if (z4 && !predicate.invoke(objArr[(i5 << 3) + i7]).booleanValue()) {
                            return false;
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        }
        return true;
    }

    public final boolean any() {
        return this._size != 0;
    }

    @l
    public final Set<E> asSet() {
        return new SetWrapper();
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
    public final boolean contains(E r18) {
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
            if (r7 == 0) goto L7a
            r11 = -1
        L76:
            if (r11 < 0) goto L79
            r2 = r12
        L79:
            return r2
        L7a:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.contains(java.lang.Object):boolean");
    }

    @IntRange(from = 0)
    public final int count() {
        return getSize();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(@m Object obj) {
        boolean z4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScatterSet)) {
            return false;
        }
        ScatterSet scatterSet = (ScatterSet) obj;
        if (scatterSet.getSize() != getSize()) {
            return false;
        }
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
                        if (z4 && !scatterSet.contains(objArr[(i5 << 3) + i7])) {
                            return false;
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int findElementIndex$collection(E r18) {
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
            return r11
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
            if (r7 == 0) goto L77
            r1 = -1
            return r1
        L77:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.findElementIndex$collection(java.lang.Object):int");
    }

    public final E first() {
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
                            return (E) objArr[(i5 << 3) + i7];
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        }
        throw new NoSuchElementException("The ScatterSet is empty");
    }

    /* JADX WARN: Type inference failed for: r10v7, types: [E, java.lang.Object] */
    @m
    public final E firstOrNull(@l v3.l<? super E, Boolean> predicate) {
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
                            ?? r10 = (Object) objArr[(i5 << 3) + i7];
                            if (predicate.invoke(r10).booleanValue()) {
                                return r10;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        return null;
                    }
                }
                if (i5 != length) {
                    i5++;
                } else {
                    return null;
                }
            }
        } else {
            return null;
        }
    }

    public final void forEach(@l v3.l<? super E, r2> block) {
        boolean z4;
        l0.p(block, "block");
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
                            block.invoke(objArr[(i5 << 3) + i7]);
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
    public final void forEachIndex(@l v3.l<? super Integer, r2> block) {
        boolean z4;
        l0.p(block, "block");
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
                            block.invoke(Integer.valueOf((i5 << 3) + i7));
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
    public final int getCapacity() {
        return this._capacity;
    }

    @IntRange(from = 0)
    public final int getSize() {
        return this._size;
    }

    public int hashCode() {
        boolean z4;
        int i5;
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i6 = 0;
        if (length >= 0) {
            int i7 = 0;
            int i8 = 0;
            while (true) {
                long j5 = jArr[i7];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j5) < 128) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            Object obj = objArr[(i7 << 3) + i10];
                            if (obj != null) {
                                i5 = obj.hashCode();
                            } else {
                                i5 = 0;
                            }
                            i8 += i5;
                        }
                        j5 >>= 8;
                    }
                    if (i9 != 8) {
                        return i8;
                    }
                }
                if (i7 != length) {
                    i7++;
                } else {
                    i6 = i8;
                    break;
                }
            }
        }
        return i6;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @l
    @i
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, null, 63, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator) {
        l0.p(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, null, 62, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, null, 60, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, null, 56, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix, int i5) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i5, null, null, 48, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix, int i5, @l CharSequence truncated) {
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        l0.p(truncated, "truncated");
        return joinToString$default(this, separator, prefix, postfix, i5, truncated, null, 32, null);
    }

    @l
    @i
    public final String joinToString(@l CharSequence separator, @l CharSequence prefix, @l CharSequence postfix, int i5, @l CharSequence truncated, @m v3.l<? super E, ? extends CharSequence> lVar) {
        boolean z4;
        l0.p(separator, "separator");
        l0.p(prefix, "prefix");
        l0.p(postfix, "postfix");
        l0.p(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            loop0: while (true) {
                long j5 = jArr[i6];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8;
                    int i9 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((j5 & 255) < 128) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            Object obj = objArr[(i6 << 3) + i10];
                            if (i7 == i5) {
                                sb.append(truncated);
                                break loop0;
                            }
                            if (i7 != 0) {
                                sb.append(separator);
                            }
                            if (lVar == null) {
                                sb.append(obj);
                            } else {
                                sb.append(lVar.invoke(obj));
                            }
                            i7++;
                            i8 = 8;
                        }
                        j5 >>= i8;
                    }
                    if (i9 != i8) {
                        break;
                    }
                }
                if (i6 == length) {
                    break;
                }
                i6++;
            }
            String sb2 = sb.toString();
            l0.o(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
        sb.append(postfix);
        String sb22 = sb.toString();
        l0.o(sb22, "StringBuilder().apply(builderAction).toString()");
        return sb22;
    }

    public final boolean none() {
        return this._size == 0;
    }

    @l
    public String toString() {
        return joinToString$default(this, null, "[", "]", 0, null, new ScatterSet$toString$1(this), 25, null);
    }

    public final boolean any(@l v3.l<? super E, Boolean> predicate) {
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
                        if (((255 & j5) < 128) && predicate.invoke(objArr[(i5 << 3) + i7]).booleanValue()) {
                            return true;
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        }
        return false;
    }

    @IntRange(from = 0)
    public final int count(@l v3.l<? super E, Boolean> predicate) {
        l0.p(predicate, "predicate");
        Object[] objArr = this.elements;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i5 = 0;
        if (length >= 0) {
            int i6 = 0;
            int i7 = 0;
            while (true) {
                long j5 = jArr[i6];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if (((255 & j5) < 128) && predicate.invoke(objArr[(i6 << 3) + i9]).booleanValue()) {
                            i7++;
                        }
                        j5 >>= 8;
                    }
                    if (i8 != 8) {
                        return i7;
                    }
                }
                if (i6 == length) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
        }
        return i5;
    }

    /* JADX WARN: Type inference failed for: r10v7, types: [E, java.lang.Object] */
    public final E first(@l v3.l<? super E, Boolean> predicate) {
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
                            ?? r10 = (Object) objArr[(i5 << 3) + i7];
                            if (predicate.invoke(r10).booleanValue()) {
                                return r10;
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                }
                if (i5 == length) {
                    break;
                }
                i5++;
            }
        }
        throw new NoSuchElementException("Could not find a match");
    }
}
