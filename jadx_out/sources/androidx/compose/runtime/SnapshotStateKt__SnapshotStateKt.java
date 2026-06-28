package androidx.compose.runtime;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import com.umeng.analytics.pro.bi;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.collections.a1;
import kotlin.collections.p;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.reflect.o;
import kotlin.u0;
import p4.l;
import p4.m;
import t0.b;

@i0(d1 = {"\u0000X\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0005\u001a3\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a6\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00072\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0086\n¢\u0006\u0004\b\f\u0010\r\u001a>\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0001\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0000H\u0007\u001a/\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0013\"\u00028\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0015\u001a\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0016\u001a \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u0019H\u0007\u001aS\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u00192*\u0010\u001d\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c0\u0013\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001cH\u0007¢\u0006\u0004\b\u001b\u0010\u001e\u001a4\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001a\"\u0004\b\u0000\u0010\u0018\"\u0004\b\u0001\u0010\u0019*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001c0\u001f\u001a#\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010!\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"T", b.f22420d, "Landroidx/compose/runtime/SnapshotMutationPolicy;", bi.bt, "Landroidx/compose/runtime/MutableState;", "mutableStateOf", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/State;", "", "thisObj", "Lkotlin/reflect/o;", "property", "getValue", "(Landroidx/compose/runtime/State;Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;", "Lkotlin/r2;", "setValue", "(Landroidx/compose/runtime/MutableState;Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "mutableStateListOf", "", "elements", "([Ljava/lang/Object;)Landroidx/compose/runtime/snapshots/SnapshotStateList;", "", "toMutableStateList", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "mutableStateMapOf", "Lkotlin/u0;", "pairs", "([Lkotlin/u0;)Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "", "toMutableStateMap", "newValue", "rememberUpdatedState", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "runtime_release"}, k = 5, mv = {1, 8, 0}, xs = "androidx/compose/runtime/SnapshotStateKt")
@r1({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,307:1\n1#2:308\n25#3:309\n1116#4,6:310\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n304#1:309\n304#1:310,6\n*E\n"})
/* loaded from: classes.dex */
public final /* synthetic */ class SnapshotStateKt__SnapshotStateKt {
    public static final <T> T getValue(@l State<? extends T> state, @m Object obj, @l o<?> oVar) {
        return state.getValue();
    }

    @l
    @StateFactoryMarker
    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return new SnapshotStateList<>();
    }

    @l
    @StateFactoryMarker
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return new SnapshotStateMap<>();
    }

    @l
    @StateFactoryMarker
    public static final <T> MutableState<T> mutableStateOf(T t5, @l SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return ActualAndroid_androidKt.createSnapshotMutableState(t5, snapshotMutationPolicy);
    }

    public static /* synthetic */ MutableState mutableStateOf$default(Object obj, SnapshotMutationPolicy snapshotMutationPolicy, int i5, Object obj2) {
        if ((i5 & 2) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return SnapshotStateKt.mutableStateOf(obj, snapshotMutationPolicy);
    }

    @l
    @Composable
    public static final <T> State<T> rememberUpdatedState(T t5, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1058319986);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1058319986, i5, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:303)");
        }
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = mutableStateOf$default(t5, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        MutableState mutableState = (MutableState) rememberedValue;
        mutableState.setValue(t5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return mutableState;
    }

    public static final <T> void setValue(@l MutableState<T> mutableState, @m Object obj, @l o<?> oVar, T t5) {
        mutableState.setValue(t5);
    }

    @l
    public static final <T> SnapshotStateList<T> toMutableStateList(@l Collection<? extends T> collection) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }

    @l
    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(@l Iterable<? extends u0<? extends K, ? extends V>> iterable) {
        Map<? extends K, ? extends V> B0;
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        B0 = a1.B0(iterable);
        snapshotStateMap.putAll(B0);
        return snapshotStateMap;
    }

    @l
    @StateFactoryMarker
    public static final <T> SnapshotStateList<T> mutableStateListOf(@l T... tArr) {
        List Jy;
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        Jy = p.Jy(tArr);
        snapshotStateList.addAll(Jy);
        return snapshotStateList;
    }

    @l
    @StateFactoryMarker
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(@l u0<? extends K, ? extends V>... u0VarArr) {
        Map<? extends K, ? extends V> H0;
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        H0 = a1.H0(u0VarArr);
        snapshotStateMap.putAll(H0);
        return snapshotStateMap;
    }
}
