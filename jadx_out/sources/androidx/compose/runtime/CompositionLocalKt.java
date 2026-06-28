package androidx.compose.runtime;

import com.umeng.analytics.pro.bi;
import com.umeng.analytics.pro.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import t0.b;
import v3.p;

@i0(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u001a \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u001a>\u0010\u000e\u001a\u00020\u000b2\u001a\u0010\n\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\b\"\u0006\u0012\u0002\b\u00030\t2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a.\u0010\u000e\u001a\u00020\u000b2\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\t2\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u000e\u0010\u0011\u001a*\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0011\u0010\r\u001a\r\u0012\u0004\u0012\u00020\u000b0\u0003¢\u0006\u0002\b\fH\u0007¢\u0006\u0004\b\u000e\u0010\u0014¨\u0006\u0015"}, d2 = {"T", "Landroidx/compose/runtime/SnapshotMutationPolicy;", bi.bt, "Lkotlin/Function0;", "defaultFactory", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "compositionLocalOf", "staticCompositionLocalOf", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "content", "CompositionLocalProvider", "([Landroidx/compose/runtime/ProvidedValue;Lv3/p;Landroidx/compose/runtime/Composer;I)V", b.f22420d, "(Landroidx/compose/runtime/ProvidedValue;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/CompositionLocalContext;", d.X, "(Landroidx/compose/runtime/CompositionLocalContext;Lv3/p;Landroidx/compose/runtime/Composer;I)V", "runtime_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,273:1\n125#2:274\n152#2,3:275\n37#3,2:278\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n*L\n268#1:274\n268#1:275,3\n269#1:278,2\n*E\n"})
/* loaded from: classes.dex */
public final class CompositionLocalKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(@l ProvidedValue<?>[] providedValueArr, @l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(-1390796515);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1390796515, i5, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:225)");
        }
        startRestartGroup.startProviders(providedValueArr);
        pVar.invoke(startRestartGroup, Integer.valueOf((i5 >> 3) & 14));
        startRestartGroup.endProviders();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CompositionLocalKt$CompositionLocalProvider$1(providedValueArr, pVar, i5));
        }
    }

    @l
    public static final <T> ProvidableCompositionLocal<T> compositionLocalOf(@l SnapshotMutationPolicy<T> snapshotMutationPolicy, @l v3.a<? extends T> aVar) {
        return new DynamicProvidableCompositionLocal(snapshotMutationPolicy, aVar);
    }

    public static /* synthetic */ ProvidableCompositionLocal compositionLocalOf$default(SnapshotMutationPolicy snapshotMutationPolicy, v3.a aVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return compositionLocalOf(snapshotMutationPolicy, aVar);
    }

    @l
    public static final <T> ProvidableCompositionLocal<T> staticCompositionLocalOf(@l v3.a<? extends T> aVar) {
        return new StaticProvidableCompositionLocal(aVar);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(@l ProvidedValue<?> providedValue, @l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(-1350970552);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1350970552, i5, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:245)");
        }
        startRestartGroup.startProvider(providedValue);
        pVar.invoke(startRestartGroup, Integer.valueOf((i5 >> 3) & 14));
        startRestartGroup.endProvider();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CompositionLocalKt$CompositionLocalProvider$2(providedValue, pVar, i5));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(@l CompositionLocalContext compositionLocalContext, @l p<? super Composer, ? super Integer, r2> pVar, @m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(1853897736);
        int i6 = (i5 & 14) == 0 ? (startRestartGroup.changed(compositionLocalContext) ? 4 : 2) | i5 : i5;
        if ((i5 & 112) == 0) {
            i6 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i6 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1853897736, i6, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:264)");
            }
            PersistentCompositionLocalMap compositionLocals$runtime_release = compositionLocalContext.getCompositionLocals$runtime_release();
            ArrayList arrayList = new ArrayList(compositionLocals$runtime_release.size());
            for (Map.Entry<CompositionLocal<Object>, State<? extends Object>> entry : compositionLocals$runtime_release.entrySet()) {
                CompositionLocal<Object> key = entry.getKey();
                l0.n(key, "null cannot be cast to non-null type androidx.compose.runtime.ProvidableCompositionLocal<kotlin.Any?>");
                arrayList.add(((ProvidableCompositionLocal) key).provides(entry.getValue().getValue()));
            }
            ProvidedValue[] providedValueArr = (ProvidedValue[]) arrayList.toArray(new ProvidedValue[0]);
            CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArr, providedValueArr.length), pVar, startRestartGroup, (i6 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new CompositionLocalKt$CompositionLocalProvider$4(compositionLocalContext, pVar, i5));
        }
    }
}
