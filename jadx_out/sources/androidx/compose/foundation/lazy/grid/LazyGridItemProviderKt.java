package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.i0;
import kotlin.jvm.internal.e1;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.reflect.p;
import p4.l;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/r2;", "Lkotlin/u;", "content", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "rememberLazyGridItemProviderLambda", "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Lv3/l;Landroidx/compose/runtime/Composer;I)Lv3/a;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLazyGridItemProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,101:1\n36#2:102\n1116#3,6:103\n*S KotlinDebug\n*F\n+ 1 LazyGridItemProvider.kt\nandroidx/compose/foundation/lazy/grid/LazyGridItemProviderKt\n*L\n43#1:102\n43#1:103,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyGridItemProviderKt {
    @l
    @Composable
    @ExperimentalFoundationApi
    public static final a<LazyGridItemProvider> rememberLazyGridItemProviderLambda(@l LazyGridState lazyGridState, @l v3.l<? super LazyGridScope, r2> lVar, @m Composer composer, int i5) {
        composer.startReplaceableGroup(-1898306282);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1898306282, i5, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
        }
        State rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(lVar, composer, (i5 >> 3) & 14);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(lazyGridState);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            final State derivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$itemProviderState$1(SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$intervalContentState$1(rememberUpdatedState)), lazyGridState));
            rememberedValue = new e1(derivedStateOf) { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemProviderKt$rememberLazyGridItemProviderLambda$1$1
                @Override // kotlin.jvm.internal.e1, kotlin.reflect.p
                @m
                public Object get() {
                    return ((State) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        p pVar = (p) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pVar;
    }
}
