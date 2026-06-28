package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.b0;
import kotlin.coroutines.d;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.t0;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;
import p4.m;
import t0.b;
import v3.q;

@i0(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\u001aT\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002<\u0010\n\u001a8\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0001¢\u0006\u0002\b\tH\u0086@¢\u0006\u0004\b\u000b\u0010\f\u001aA\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0016\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u000e*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00100\u000f2\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\"\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"R", "Lkotlin/Function3;", "Lkotlinx/coroutines/s0;", "Landroidx/compose/runtime/Recomposer;", "Lkotlin/v0;", "name", "recomposer", "Lkotlin/coroutines/d;", "", "Lkotlin/u;", "block", "withRunningRecomposer", "(Lv3/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "K", "V", "", "", DatabaseFileArchive.COLUMN_KEY, b.f22420d, "", "addMultiValue", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "removeLastMultiValue", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "", "RecomposerCompoundHashKey", "I", "ProduceAnotherFrame", "Ljava/lang/Object;", "FramePending", "runtime_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1564:1\n361#2,7:1565\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n*L\n1555#1:1565,7\n*E\n"})
/* loaded from: classes.dex */
public final class RecomposerKt {
    private static final int RecomposerCompoundHashKey = 1000;

    @l
    private static final Object ProduceAnotherFrame = new Object();

    @l
    private static final Object FramePending = new Object();

    public static final <K, V> boolean addMultiValue(@l Map<K, List<V>> map, K k5, V v4) {
        List<V> list = map.get(k5);
        if (list == null) {
            list = new ArrayList<>();
            map.put(k5, list);
        }
        return list.add(v4);
    }

    @m
    public static final <K, V> V removeLastMultiValue(@l Map<K, List<V>> map, K k5) {
        Object J0;
        List<V> list = map.get(k5);
        if (list != null) {
            J0 = b0.J0(list);
            V v4 = (V) J0;
            if (list.isEmpty()) {
                map.remove(k5);
                return v4;
            }
            return v4;
        }
        return null;
    }

    @m
    public static final <R> Object withRunningRecomposer(@l q<? super s0, ? super Recomposer, ? super d<? super R>, ? extends Object> qVar, @l d<? super R> dVar) {
        return t0.g(new RecomposerKt$withRunningRecomposer$2(qVar, null), dVar);
    }
}
