package androidx.compose.runtime.internal;

import androidx.compose.runtime.CompositionLocal;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.State;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import kotlin.collections.a1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.u0;
import p4.l;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a[\u0010\u0001\u001a\u00020\b2J\u0010\u0007\u001a&\u0012\"\b\u0001\u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00060\u00030\u0002\"\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00060\u0003H\u0000¢\u0006\u0004\b\u0001\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/internal/PersistentCompositionLocalHashMap;", "persistentCompositionLocalHashMapOf", "", "Lkotlin/u0;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/State;", "pairs", "Landroidx/compose/runtime/PersistentCompositionLocalMap;", "([Lkotlin/u0;)Landroidx/compose/runtime/PersistentCompositionLocalMap;", "runtime_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nPersistentCompositionLocalMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PersistentCompositionLocalMap.kt\nandroidx/compose/runtime/internal/PersistentCompositionLocalMapKt\n+ 2 CompositionLocalMap.kt\nandroidx/compose/runtime/CompositionLocalMapKt\n*L\n1#1,85:1\n75#2:86\n*S KotlinDebug\n*F\n+ 1 PersistentCompositionLocalMap.kt\nandroidx/compose/runtime/internal/PersistentCompositionLocalMapKt\n*L\n84#1:86\n*E\n"})
/* loaded from: classes.dex */
public final class PersistentCompositionLocalMapKt {
    @l
    public static final PersistentCompositionLocalHashMap persistentCompositionLocalHashMapOf() {
        return PersistentCompositionLocalHashMap.Companion.getEmpty();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.runtime.PersistentCompositionLocalMap] */
    @l
    public static final PersistentCompositionLocalMap persistentCompositionLocalHashMapOf(@l u0<? extends CompositionLocal<Object>, ? extends State<? extends Object>>... u0VarArr) {
        PersistentMap.Builder<CompositionLocal<Object>, State<? extends Object>> builder2 = PersistentCompositionLocalHashMap.Companion.getEmpty().builder2();
        a1.y0(builder2, u0VarArr);
        return builder2.build2();
    }
}
