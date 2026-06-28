package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u001e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u00032!\u0010\b\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u0002H\u00010\t\u001aX\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\f\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\f2!\u0010\b\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u0002H\u00010\tH\u0007¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"getOrImplicitDefault", "V", "K", "", DatabaseFileArchive.COLUMN_KEY, "getOrImplicitDefaultNullable", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "withDefault", "defaultValue", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "", "withDefaultMutable", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/MapsKt")
@kotlin.jvm.internal.r1({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n341#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:105,6\n*E\n"})
/* loaded from: classes3.dex */
public class y0 {
    @u3.h(name = "getOrImplicitDefaultNullable")
    @kotlin.a1
    public static final <K, V> V a(@p4.l Map<K, ? extends V> map, K k5) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        if (map instanceof v0) {
            return (V) ((v0) map).h(k5);
        }
        V v4 = map.get(k5);
        if (v4 == null && !map.containsKey(k5)) {
            throw new NoSuchElementException("Key " + k5 + " is missing in the map.");
        }
        return v4;
    }

    @p4.l
    public static final <K, V> Map<K, V> b(@p4.l Map<K, ? extends V> map, @p4.l v3.l<? super K, ? extends V> defaultValue) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        if (map instanceof v0) {
            return b(((v0) map).f(), defaultValue);
        }
        return new w0(map, defaultValue);
    }

    @p4.l
    @u3.h(name = "withDefaultMutable")
    public static final <K, V> Map<K, V> c(@p4.l Map<K, V> map, @p4.l v3.l<? super K, ? extends V> defaultValue) {
        kotlin.jvm.internal.l0.p(map, "<this>");
        kotlin.jvm.internal.l0.p(defaultValue, "defaultValue");
        if (map instanceof e1) {
            return c(((e1) map).f(), defaultValue);
        }
        return new f1(map, defaultValue);
    }
}
