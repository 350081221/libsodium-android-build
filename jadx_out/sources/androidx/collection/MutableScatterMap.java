package androidx.collection;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.a1;
import kotlin.collections.o;
import kotlin.g2;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.u0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import v3.p;
import w3.g;

@i0(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001FB\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bD\u0010EJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J\u0019\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0082\bJ)\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00028\u00002\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018JU\u0010\u001d\u001a\u00028\u00012\u0006\u0010\u0014\u001a\u00028\u000028\u0010\u001c\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0014\u0012\u0015\u0012\u0013\u0018\u00018\u0001¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00028\u00010\u0019H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b!\u0010\"J)\u0010&\u001a\u00020\u00062\u001a\u0010%\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0#¢\u0006\u0004\b&\u0010'J \u0010&\u001a\u00020\u00062\u0018\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0(J \u0010&\u001a\u00020\u00062\u0018\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0)J\u001a\u0010&\u001a\u00020\u00062\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*J\u001a\u0010&\u001a\u00020\u00062\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003J\u001d\u0010-\u001a\u00020\u00062\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$H\u0086\nJ,\u0010-\u001a\u00020\u00062\u001a\u0010%\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0#H\u0086\n¢\u0006\u0004\b-\u0010'J#\u0010-\u001a\u00020\u00062\u0018\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0(H\u0086\nJ#\u0010-\u001a\u00020\u00062\u0018\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$0)H\u0086\nJ\u001d\u0010-\u001a\u00020\u00062\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010*H\u0086\nJ\u001d\u0010-\u001a\u00020\u00062\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003H\u0086\nJ\u0017\u0010.\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0014\u001a\u00028\u0000¢\u0006\u0004\b.\u0010/J\u001d\u0010.\u001a\u0002002\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b.\u00101J&\u00103\u001a\u00020\u00062\u0018\u00102\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u0002000\u0019H\u0086\bø\u0001\u0000J\u0018\u00104\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b4\u00105J \u00104\u001a\u00020\u00062\u000e\u00106\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000#H\u0086\n¢\u0006\u0004\b4\u00107J\u0017\u00104\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000(H\u0086\nJ\u0017\u00104\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0086\nJ\u0017\u00104\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000008H\u0086\nJ\u0017\u00104\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0086\nJ\u0019\u0010:\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0010\u001a\u00020\u0004H\u0001¢\u0006\u0004\b:\u0010;J\u0006\u0010<\u001a\u00020\u0006J\u0017\u0010=\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0001¢\u0006\u0004\b=\u0010>J\u0006\u0010?\u001a\u00020\u0004J\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010@R\u0016\u0010B\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010C\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006G"}, d2 = {"Landroidx/collection/MutableScatterMap;", "K", "V", "Landroidx/collection/ScatterMap;", "", "initialCapacity", "Lkotlin/r2;", "initializeStorage", "capacity", "initializeMetadata", "initializeGrowth", "hash1", "findFirstAvailableSlot", "adjustStorage", "newCapacity", "resizeStorage", "index", "", b.f22420d, "writeMetadata", DatabaseFileArchive.COLUMN_KEY, "Lkotlin/Function0;", "defaultValue", "getOrPut", "(Ljava/lang/Object;Lv3/a;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/v0;", "name", "computeBlock", "compute", "(Ljava/lang/Object;Lv3/p;)Ljava/lang/Object;", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/u0;", "pairs", "putAll", "([Lkotlin/u0;)V", "", "Lkotlin/sequences/m;", "", TypedValues.TransitionType.S_FROM, "pair", "plusAssign", "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "predicate", "removeIf", "minusAssign", "(Ljava/lang/Object;)V", "keys", "([Ljava/lang/Object;)V", "Landroidx/collection/ScatterSet;", "Landroidx/collection/ObjectList;", "removeValueAt", "(I)Ljava/lang/Object;", "clear", "findInsertIndex", "(Ljava/lang/Object;)I", "trim", "", "asMutableMap", "growthLimit", "I", "<init>", "(I)V", "MutableMapWrapper", "collection"}, k = 1, mv = {1, 8, 0})
@r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 6 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 7 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,1834:1\n1268#1,2:2003\n1272#1,5:2011\n1268#1,2:2042\n1272#1,5:2050\n1268#1,2:2067\n1272#1,5:2075\n1#2:1835\n1656#3,6:1836\n1810#3:1854\n1672#3:1858\n1589#3,3:1871\n1603#3:1875\n1599#3:1878\n1779#3,3:1883\n1793#3,3:1887\n1717#3:1891\n1705#3:1893\n1699#3:1894\n1712#3:1899\n1802#3:1901\n1589#3,3:1911\n1603#3:1915\n1599#3:1918\n1779#3,3:1923\n1793#3,3:1927\n1717#3:1931\n1705#3:1933\n1699#3:1934\n1712#3:1939\n1802#3:1941\n1810#3:1956\n1672#3:1960\n1810#3:1981\n1672#3:1985\n1656#3,6:2005\n1656#3,6:2016\n1589#3,3:2022\n1599#3:2025\n1603#3:2026\n1779#3,3:2027\n1793#3,3:2030\n1717#3:2033\n1705#3:2034\n1699#3:2035\n1712#3:2036\n1802#3:2037\n1666#3:2038\n1645#3:2039\n1664#3:2040\n1645#3:2041\n1656#3,6:2044\n1779#3,3:2055\n1810#3:2058\n1699#3:2059\n1669#3:2060\n1645#3:2061\n1589#3,3:2062\n1599#3:2065\n1603#3:2066\n1656#3,6:2069\n1656#3,6:2080\n1656#3,6:2086\n215#4,2:1842\n391#5,4:1844\n363#5,6:1848\n373#5,3:1855\n376#5,2:1859\n396#5,2:1861\n379#5,6:1863\n398#5:1869\n633#5:1870\n634#5:1874\n636#5,2:1876\n638#5,4:1879\n642#5:1886\n643#5:1890\n644#5:1892\n645#5,4:1895\n651#5:1900\n652#5,8:1902\n633#5:1910\n634#5:1914\n636#5,2:1916\n638#5,4:1919\n642#5:1926\n643#5:1930\n644#5:1932\n645#5,4:1935\n651#5:1940\n652#5,8:1942\n363#5,6:1950\n373#5,3:1957\n376#5,9:1961\n267#6,4:1970\n237#6,7:1974\n248#6,3:1982\n251#6,2:1986\n272#6,2:1988\n254#6,6:1990\n274#6:1996\n305#7,6:1997\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n*L\n1113#1:2003,2\n1113#1:2011,5\n1180#1:2042,2\n1180#1:2050,5\n1255#1:2067,2\n1255#1:2075,5\n848#1:1836,6\n972#1:1854\n972#1:1858\n1021#1:1871,3\n1021#1:1875\n1021#1:1878\n1021#1:1883,3\n1021#1:1887,3\n1021#1:1891\n1021#1:1893\n1021#1:1894\n1021#1:1899\n1021#1:1901\n1033#1:1911,3\n1033#1:1915\n1033#1:1918\n1033#1:1923,3\n1033#1:1927,3\n1033#1:1931\n1033#1:1933\n1033#1:1934\n1033#1:1939\n1033#1:1941\n1047#1:1956\n1047#1:1960\n1093#1:1981\n1093#1:1985\n1113#1:2005,6\n1129#1:2016,6\n1145#1:2022,3\n1146#1:2025\n1147#1:2026\n1154#1:2027,3\n1155#1:2030,3\n1156#1:2033\n1157#1:2034\n1157#1:2035\n1161#1:2036\n1164#1:2037\n1173#1:2038\n1173#1:2039\n1179#1:2040\n1179#1:2041\n1180#1:2044,6\n1195#1:2055,3\n1196#1:2058\n1198#1:2059\n1250#1:2060\n1250#1:2061\n1252#1:2062,3\n1253#1:2065\n1255#1:2066\n1255#1:2069,6\n1269#1:2080,6\n1275#1:2086,6\n963#1:1842,2\n972#1:1844,4\n972#1:1848,6\n972#1:1855,3\n972#1:1859,2\n972#1:1861,2\n972#1:1863,6\n972#1:1869\n1021#1:1870\n1021#1:1874\n1021#1:1876,2\n1021#1:1879,4\n1021#1:1886\n1021#1:1890\n1021#1:1892\n1021#1:1895,4\n1021#1:1900\n1021#1:1902,8\n1033#1:1910\n1033#1:1914\n1033#1:1916,2\n1033#1:1919,4\n1033#1:1926\n1033#1:1930\n1033#1:1932\n1033#1:1935,4\n1033#1:1940\n1033#1:1942,8\n1047#1:1950,6\n1047#1:1957,3\n1047#1:1961,9\n1093#1:1970,4\n1093#1:1974,7\n1093#1:1982,3\n1093#1:1986,2\n1093#1:1988,2\n1093#1:1990,6\n1093#1:1996\n1102#1:1997,6\n*E\n"})
/* loaded from: classes.dex */
public final class MutableScatterMap<K, V> extends ScatterMap<K, V> {
    private int growthLimit;

    @i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00120\u0001R\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0019\u0010\u0007\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\u00042\u0014\u0010\n\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016J!\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eR&\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroidx/collection/MutableScatterMap$MutableMapWrapper;", "Landroidx/collection/ScatterMap$MapWrapper;", "Landroidx/collection/ScatterMap;", "", "Lkotlin/r2;", "clear", DatabaseFileArchive.COLUMN_KEY, "remove", "(Ljava/lang/Object;)Ljava/lang/Object;", "", TypedValues.TransitionType.S_FROM, "putAll", b.f22420d, "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "getEntries", "()Ljava/util/Set;", "entries", "getKeys", "keys", "", "getValues", "()Ljava/util/Collection;", "values", "<init>", "(Landroidx/collection/MutableScatterMap;)V", "collection"}, k = 1, mv = {1, 8, 0})
    @r1({"SMAP\nScatterMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1834:1\n215#2,2:1835\n*S KotlinDebug\n*F\n+ 1 ScatterMap.kt\nandroidx/collection/MutableScatterMap$MutableMapWrapper\n*L\n1574#1:1835,2\n*E\n"})
    /* loaded from: classes.dex */
    private final class MutableMapWrapper extends ScatterMap<K, V>.MapWrapper implements Map<K, V>, g {
        public MutableMapWrapper() {
            super();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void clear() {
            MutableScatterMap.this.clear();
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        @l
        public Set<Map.Entry<K, V>> getEntries() {
            return new MutableScatterMap$MutableMapWrapper$entries$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        @l
        public Set<K> getKeys() {
            return new MutableScatterMap$MutableMapWrapper$keys$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper
        @l
        public Collection<V> getValues() {
            return new MutableScatterMap$MutableMapWrapper$values$1(MutableScatterMap.this);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        @m
        public V put(K k5, V v4) {
            return MutableScatterMap.this.put(k5, v4);
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        public void putAll(@l Map<? extends K, ? extends V> from) {
            l0.p(from, "from");
            for (Map.Entry<? extends K, ? extends V> entry : from.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // androidx.collection.ScatterMap.MapWrapper, java.util.Map
        @m
        public V remove(Object obj) {
            return MutableScatterMap.this.remove(obj);
        }
    }

    public MutableScatterMap() {
        this(0, 1, null);
    }

    public /* synthetic */ MutableScatterMap(int i5, int i6, w wVar) {
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
        this.values = new Object[i6];
    }

    private final void resizeStorage(int i5) {
        boolean z4;
        int i6;
        int i7;
        long[] jArr = this.metadata;
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        int i8 = this._capacity;
        initializeStorage(i5);
        Object[] objArr3 = this.keys;
        Object[] objArr4 = this.values;
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
                jArr2[i16] = (jArr2[i16] & (~(255 << i17))) | (j5 << i17);
                objArr3[findFirstAvailableSlot] = obj;
                objArr4[findFirstAvailableSlot] = objArr2[i6];
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

    @l
    public final Map<K, V> asMutableMap() {
        return new MutableMapWrapper();
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
        o.M1(this.keys, null, 0, this._capacity);
        initializeGrowth();
    }

    public final V compute(K k5, @l p<? super K, ? super V, ? extends V> computeBlock) {
        boolean z4;
        Object obj;
        l0.p(computeBlock, "computeBlock");
        int findInsertIndex = findInsertIndex(k5);
        if (findInsertIndex < 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            obj = null;
        } else {
            obj = this.values[findInsertIndex];
        }
        V invoke = computeBlock.invoke(k5, obj);
        if (z4) {
            int i5 = ~findInsertIndex;
            this.keys[i5] = k5;
            this.values[i5] = invoke;
        } else {
            this.values[findInsertIndex] = invoke;
        }
        return invoke;
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
    @kotlin.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int findInsertIndex(K r21) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.findInsertIndex(java.lang.Object):int");
    }

    public final V getOrPut(K k5, @l v3.a<? extends V> defaultValue) {
        l0.p(defaultValue, "defaultValue");
        V v4 = get(k5);
        if (v4 == null) {
            V invoke = defaultValue.invoke();
            set(k5, invoke);
            return invoke;
        }
        return v4;
    }

    public final void minusAssign(K k5) {
        remove(k5);
    }

    public final void plusAssign(@l u0<? extends K, ? extends V> pair) {
        l0.p(pair, "pair");
        set(pair.getFirst(), pair.getSecond());
    }

    @m
    public final V put(K k5, V v4) {
        int findInsertIndex = findInsertIndex(k5);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        Object[] objArr = this.values;
        V v5 = (V) objArr[findInsertIndex];
        this.keys[findInsertIndex] = k5;
        objArr[findInsertIndex] = v4;
        return v5;
    }

    public final void putAll(@l u0<? extends K, ? extends V>[] pairs) {
        l0.p(pairs, "pairs");
        for (u0<? extends K, ? extends V> u0Var : pairs) {
            set(u0Var.component1(), u0Var.component2());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0073, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        r11 = -1;
     */
    @p4.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V remove(K r18) {
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
            java.lang.Object[] r15 = r0.keys
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
            if (r11 < 0) goto L7d
            java.lang.Object r1 = r0.removeValueAt(r11)
            return r1
        L7d:
            r1 = 0
            return r1
        L7f:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.remove(java.lang.Object):java.lang.Object");
    }

    public final void removeIf(@l p<? super K, ? super V, Boolean> predicate) {
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
                            if (predicate.invoke(this.keys[i8], this.values[i8]).booleanValue()) {
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
        this.keys[i5] = null;
        Object[] objArr = this.values;
        V v4 = (V) objArr[i5];
        objArr[i5] = null;
        return v4;
    }

    public final void set(K k5, V v4) {
        int findInsertIndex = findInsertIndex(k5);
        if (findInsertIndex < 0) {
            findInsertIndex = ~findInsertIndex;
        }
        this.keys[findInsertIndex] = k5;
        this.values[findInsertIndex] = v4;
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

    public MutableScatterMap(int i5) {
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

    public final void plusAssign(@l u0<? extends K, ? extends V>[] pairs) {
        l0.p(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(@l Iterable<? extends u0<? extends K, ? extends V>> pairs) {
        l0.p(pairs, "pairs");
        putAll(pairs);
    }

    public final void putAll(@l Iterable<? extends u0<? extends K, ? extends V>> pairs) {
        l0.p(pairs, "pairs");
        for (u0<? extends K, ? extends V> u0Var : pairs) {
            set(u0Var.component1(), u0Var.component2());
        }
    }

    public final void minusAssign(@l Iterable<? extends K> keys) {
        l0.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@l kotlin.sequences.m<? extends u0<? extends K, ? extends V>> pairs) {
        l0.p(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(@l Map<K, ? extends V> from) {
        l0.p(from, "from");
        putAll(from);
    }

    public final void putAll(@l kotlin.sequences.m<? extends u0<? extends K, ? extends V>> pairs) {
        l0.p(pairs, "pairs");
        for (u0<? extends K, ? extends V> u0Var : pairs) {
            set(u0Var.component1(), u0Var.component2());
        }
    }

    public final void minusAssign(@l kotlin.sequences.m<? extends K> keys) {
        l0.p(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@l ScatterMap<K, V> from) {
        l0.p(from, "from");
        putAll(from);
    }

    public final void putAll(@l Map<K, ? extends V> from) {
        l0.p(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            set(entry.getKey(), entry.getValue());
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

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean remove(K r18, V r19) {
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
            java.lang.Object[] r15 = r0.keys
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
            if (r7 == 0) goto L89
            r11 = -1
        L76:
            if (r11 < 0) goto L88
            java.lang.Object[] r1 = r0.values
            r1 = r1[r11]
            r7 = r19
            boolean r1 = kotlin.jvm.internal.l0.g(r1, r7)
            if (r1 == 0) goto L88
            r0.removeValueAt(r11)
            return r12
        L88:
            return r2
        L89:
            r7 = r19
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap.remove(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@l ScatterMap<K, V> from) {
        l0.p(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
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
                        int i8 = (i5 << 3) + i7;
                        set(objArr[i8], objArr2[i8]);
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
    public final void minusAssign(@l ObjectList<K> keys) {
        l0.p(keys, "keys");
        Object[] objArr = keys.content;
        int i5 = keys._size;
        for (int i6 = 0; i6 < i5; i6++) {
            remove(objArr[i6]);
        }
    }
}
