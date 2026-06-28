package androidx.collection;

import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.u0;
import p4.l;

@i0(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0086\b\u001aQ\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\b"}, d2 = {"K", "V", "Landroidx/collection/ArrayMap;", "arrayMapOf", "", "Lkotlin/u0;", "pairs", "([Lkotlin/u0;)Landroidx/collection/ArrayMap;", "collection"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ArrayMapKt {
    @l
    public static final <K, V> ArrayMap<K, V> arrayMapOf() {
        return new ArrayMap<>();
    }

    @l
    public static final <K, V> ArrayMap<K, V> arrayMapOf(@l u0<? extends K, ? extends V>... pairs) {
        l0.p(pairs, "pairs");
        ArrayMap<K, V> arrayMap = new ArrayMap<>(pairs.length);
        for (u0<? extends K, ? extends V> u0Var : pairs) {
            arrayMap.put(u0Var.getFirst(), u0Var.getSecond());
        }
        return arrayMap;
    }
}
