package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import p4.l;
import p4.m;

@i0(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "subcomposeLayoutState", "Lkotlin/r2;", "LazyLayoutPrefetcher", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/runtime/Composer;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLazyLayoutPrefetcher.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,319:1\n74#2:320\n67#3,3:321\n66#3:324\n1116#4,6:325\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPrefetcher.android.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPrefetcher_androidKt\n*L\n41#1:320\n42#1:321,3\n42#1:324\n42#1:325,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutPrefetcher_androidKt {
    @Composable
    @ExperimentalFoundationApi
    public static final void LazyLayoutPrefetcher(@l LazyLayoutPrefetchState lazyLayoutPrefetchState, @l LazyLayoutItemContentFactory lazyLayoutItemContentFactory, @l SubcomposeLayoutState subcomposeLayoutState, @m Composer composer, int i5) {
        Composer startRestartGroup = composer.startRestartGroup(1113453182);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1113453182, i5, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher (LazyLayoutPrefetcher.android.kt:39)");
        }
        View view = (View) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalView());
        int i6 = SubcomposeLayoutState.$stable;
        startRestartGroup.startReplaceableGroup(1618982084);
        boolean changed = startRestartGroup.changed(subcomposeLayoutState) | startRestartGroup.changed(lazyLayoutPrefetchState) | startRestartGroup.changed(view);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            startRestartGroup.updateRememberedValue(new LazyLayoutPrefetcher(lazyLayoutPrefetchState, subcomposeLayoutState, lazyLayoutItemContentFactory, view));
        }
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2(lazyLayoutPrefetchState, lazyLayoutItemContentFactory, subcomposeLayoutState, i5));
        }
    }
}
