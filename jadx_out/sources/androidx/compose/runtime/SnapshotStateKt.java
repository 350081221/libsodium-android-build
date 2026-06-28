package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import java.util.Collection;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import kotlin.i0;
import kotlin.r2;
import kotlin.reflect.o;
import kotlin.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.t0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"androidx/compose/runtime/SnapshotStateKt__DerivedStateKt", "androidx/compose/runtime/SnapshotStateKt__ProduceStateKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotMutationPolicyKt", "androidx/compose/runtime/SnapshotStateKt__SnapshotStateKt"}, k = 4, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotStateKt {
    @l
    @Composable
    public static final <T extends R, R> State<R> collectAsState(@l i<? extends T> iVar, R r5, @m g gVar, @m Composer composer, int i5, int i6) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(iVar, r5, gVar, composer, i5, i6);
    }

    @l
    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        return SnapshotStateKt__DerivedStateKt.derivedStateObservers();
    }

    @l
    @StateFactoryMarker
    public static final <T> State<T> derivedStateOf(@l SnapshotMutationPolicy<T> snapshotMutationPolicy, @l v3.a<? extends T> aVar) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(snapshotMutationPolicy, aVar);
    }

    public static final <T> T getValue(@l State<? extends T> state, @m Object obj, @l o<?> oVar) {
        return (T) SnapshotStateKt__SnapshotStateKt.getValue(state, obj, oVar);
    }

    @l
    @StateFactoryMarker
    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf();
    }

    @l
    @StateFactoryMarker
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf();
    }

    @l
    @StateFactoryMarker
    public static final <T> MutableState<T> mutableStateOf(T t5, @l SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf(t5, snapshotMutationPolicy);
    }

    @l
    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy();
    }

    public static final <R> void observeDerivedStateRecalculations(@l DerivedStateObserver derivedStateObserver, @l v3.a<? extends R> aVar) {
        SnapshotStateKt__DerivedStateKt.observeDerivedStateRecalculations(derivedStateObserver, aVar);
    }

    @l
    @Composable
    public static final <T> State<T> produceState(T t5, @m Object obj, @m Object obj2, @m Object obj3, @l p<? super ProduceStateScope<T>, ? super d<? super r2>, ? extends Object> pVar, @m Composer composer, int i5) {
        return SnapshotStateKt__ProduceStateKt.produceState(t5, obj, obj2, obj3, pVar, composer, i5);
    }

    @l
    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    @l
    @Composable
    public static final <T> State<T> rememberUpdatedState(T t5, @m Composer composer, int i5) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(t5, composer, i5);
    }

    public static final <T> void setValue(@l MutableState<T> mutableState, @m Object obj, @l o<?> oVar, T t5) {
        SnapshotStateKt__SnapshotStateKt.setValue(mutableState, obj, oVar, t5);
    }

    @l
    public static final <T> i<T> snapshotFlow(@l v3.a<? extends T> aVar) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(aVar);
    }

    @l
    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy();
    }

    @l
    public static final <T> SnapshotStateList<T> toMutableStateList(@l Collection<? extends T> collection) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateList(collection);
    }

    @l
    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(@l Iterable<? extends u0<? extends K, ? extends V>> iterable) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateMap(iterable);
    }

    @l
    @Composable
    public static final <T> State<T> collectAsState(@l t0<? extends T> t0Var, @m g gVar, @m Composer composer, int i5, int i6) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(t0Var, gVar, composer, i5, i6);
    }

    @l
    @StateFactoryMarker
    public static final <T> State<T> derivedStateOf(@l v3.a<? extends T> aVar) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(aVar);
    }

    @l
    @StateFactoryMarker
    public static final <T> SnapshotStateList<T> mutableStateListOf(@l T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf(tArr);
    }

    @l
    @StateFactoryMarker
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(@l u0<? extends K, ? extends V>... u0VarArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf(u0VarArr);
    }

    @l
    @Composable
    public static final <T> State<T> produceState(T t5, @m Object obj, @m Object obj2, @l p<? super ProduceStateScope<T>, ? super d<? super r2>, ? extends Object> pVar, @m Composer composer, int i5) {
        return SnapshotStateKt__ProduceStateKt.produceState(t5, obj, obj2, pVar, composer, i5);
    }

    @l
    @Composable
    public static final <T> State<T> produceState(T t5, @m Object obj, @l p<? super ProduceStateScope<T>, ? super d<? super r2>, ? extends Object> pVar, @m Composer composer, int i5) {
        return SnapshotStateKt__ProduceStateKt.produceState(t5, obj, pVar, composer, i5);
    }

    @l
    @Composable
    public static final <T> State<T> produceState(T t5, @l p<? super ProduceStateScope<T>, ? super d<? super r2>, ? extends Object> pVar, @m Composer composer, int i5) {
        return SnapshotStateKt__ProduceStateKt.produceState(t5, pVar, composer, i5);
    }

    @l
    @Composable
    public static final <T> State<T> produceState(T t5, @l Object[] objArr, @l p<? super ProduceStateScope<T>, ? super d<? super r2>, ? extends Object> pVar, @m Composer composer, int i5) {
        return SnapshotStateKt__ProduceStateKt.produceState((Object) t5, objArr, (p) pVar, composer, i5);
    }
}
