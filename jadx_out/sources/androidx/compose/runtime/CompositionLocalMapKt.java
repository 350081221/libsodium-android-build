package androidx.compose.runtime;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.PersistentCompositionLocalMapKt;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.r2;
import org.osmdroid.tileprovider.modules.DatabaseFileArchive;
import p4.l;

@i0(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a=\u0010\b\u001a\u00020\u0000*\u00020\u00002.\u0010\u0007\u001a*\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00050\u0002\u0012\u0004\u0012\u00020\u00060\u0001H\u0080\b\u001a \u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\t*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000\u001a'\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t*\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a5\u0010\u0015\u001a\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00110\u00102\u0006\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/runtime/PersistentCompositionLocalMap;", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/State;", "Lkotlin/r2;", "mutator", "mutate", "T", DatabaseFileArchive.COLUMN_KEY, "", "contains", "getValueOf", "(Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "read", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "parentScope", "previous", "updateCompositionMap", "([Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/PersistentCompositionLocalMap;Landroidx/compose/runtime/PersistentCompositionLocalMap;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "runtime_release"}, k = 2, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CompositionLocalMapKt {
    public static final <T> boolean contains(@l PersistentCompositionLocalMap persistentCompositionLocalMap, @l CompositionLocal<T> compositionLocal) {
        l0.n(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        return persistentCompositionLocalMap.containsKey(compositionLocal);
    }

    public static final <T> T getValueOf(@l PersistentCompositionLocalMap persistentCompositionLocalMap, @l CompositionLocal<T> compositionLocal) {
        l0.n(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        State<? extends Object> state = persistentCompositionLocalMap.get((Object) compositionLocal);
        if (state != null) {
            return (T) state.getValue();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    @l
    public static final PersistentCompositionLocalMap mutate(@l PersistentCompositionLocalMap persistentCompositionLocalMap, @l v3.l<? super Map<CompositionLocal<Object>, State<Object>>, r2> lVar) {
        PersistentMap.Builder<CompositionLocal<Object>, State<? extends Object>> builder2 = persistentCompositionLocalMap.builder2();
        lVar.invoke(builder2);
        return builder2.build2();
    }

    public static final <T> T read(@l PersistentCompositionLocalMap persistentCompositionLocalMap, @l CompositionLocal<T> compositionLocal) {
        if (contains(persistentCompositionLocalMap, compositionLocal)) {
            return (T) getValueOf(persistentCompositionLocalMap, compositionLocal);
        }
        return compositionLocal.getDefaultValueHolder$runtime_release().getValue();
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    @l
    public static final PersistentCompositionLocalMap updateCompositionMap(@l ProvidedValue<?>[] providedValueArr, @l PersistentCompositionLocalMap persistentCompositionLocalMap, @l PersistentCompositionLocalMap persistentCompositionLocalMap2) {
        PersistentMap.Builder<CompositionLocal<Object>, State<? extends Object>> builder2 = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf().builder2();
        for (ProvidedValue<?> providedValue : providedValueArr) {
            CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
            l0.n(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
            ProvidableCompositionLocal providableCompositionLocal = (ProvidableCompositionLocal) compositionLocal;
            if (providedValue.getCanOverride() || !contains(persistentCompositionLocalMap, providableCompositionLocal)) {
                builder2.put(providableCompositionLocal, providableCompositionLocal.updatedStateOf$runtime_release(providedValue.getValue(), (State) persistentCompositionLocalMap2.get((Object) providableCompositionLocal)));
            }
        }
        return builder2.build2();
    }

    public static /* synthetic */ PersistentCompositionLocalMap updateCompositionMap$default(ProvidedValue[] providedValueArr, PersistentCompositionLocalMap persistentCompositionLocalMap, PersistentCompositionLocalMap persistentCompositionLocalMap2, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            persistentCompositionLocalMap2 = PersistentCompositionLocalMapKt.persistentCompositionLocalHashMapOf();
        }
        return updateCompositionMap(providedValueArr, persistentCompositionLocalMap, persistentCompositionLocalMap2);
    }
}
