package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.unit.Constraints;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import p4.l;
import p4.m;
import v3.a;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/saveable/SaveableStateHolder;", "saveableStateHolder", "Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/saveable/SaveableStateHolder;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nLazyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,158:1\n25#2:159\n25#2:166\n50#2:173\n49#2:174\n1116#3,6:160\n1116#3,6:167\n1116#3,6:175\n*S KotlinDebug\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt$LazyLayout$3\n*L\n82#1:159\n85#1:166\n99#1:173\n99#1:174\n82#1:160,6\n85#1:167,6\n99#1:175,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutKt$LazyLayout$3 extends n0 implements q<SaveableStateHolder, Composer, Integer, r2> {
    final /* synthetic */ State<a<LazyLayoutItemProvider>> $currentItemProvider;
    final /* synthetic */ p<LazyLayoutMeasureScope, Constraints, MeasureResult> $measurePolicy;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ LazyLayoutPrefetchState $prefetchState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyLayoutKt$LazyLayout$3(LazyLayoutPrefetchState lazyLayoutPrefetchState, Modifier modifier, p<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> pVar, State<? extends a<? extends LazyLayoutItemProvider>> state) {
        super(3);
        this.$prefetchState = lazyLayoutPrefetchState;
        this.$modifier = modifier;
        this.$measurePolicy = pVar;
        this.$currentItemProvider = state;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(SaveableStateHolder saveableStateHolder, Composer composer, Integer num) {
        invoke(saveableStateHolder, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@l SaveableStateHolder saveableStateHolder, @m Composer composer, int i5) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1488997347, i5, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:81)");
        }
        State<a<LazyLayoutItemProvider>> state = this.$currentItemProvider;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            rememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1(state));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) rememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) rememberedValue2;
        LazyLayoutPrefetchState lazyLayoutPrefetchState = this.$prefetchState;
        composer.startReplaceableGroup(-1523807258);
        if (lazyLayoutPrefetchState != null) {
            LazyLayoutPrefetcher_androidKt.LazyLayoutPrefetcher(this.$prefetchState, lazyLayoutItemContentFactory, subcomposeLayoutState, composer, (SubcomposeLayoutState.$stable << 6) | 64);
            r2 r2Var = r2.f19517a;
        }
        composer.endReplaceableGroup();
        Modifier modifier = this.$modifier;
        p<LazyLayoutMeasureScope, Constraints, MeasureResult> pVar = this.$measurePolicy;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(lazyLayoutItemContentFactory) | composer.changed(pVar);
        Object rememberedValue3 = composer.rememberedValue();
        if (changed || rememberedValue3 == companion.getEmpty()) {
            rememberedValue3 = new LazyLayoutKt$LazyLayout$3$2$1(lazyLayoutItemContentFactory, pVar);
            composer.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceableGroup();
        SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifier, (p) rememberedValue3, composer, SubcomposeLayoutState.$stable, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
