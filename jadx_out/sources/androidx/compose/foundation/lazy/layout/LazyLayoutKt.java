package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import kotlin.b1;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlin.k;
import p4.l;
import p4.m;
import v3.a;
import v3.p;

@i0(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001aL\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aR\u0010\r\u001a\u00020\f2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\u000f2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0002\b\nH\u0007¢\u0006\u0004\b\r\u0010\u0010\"\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProvider", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "prefetchState", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/u;", "measurePolicy", "Lkotlin/r2;", "LazyLayout", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "Lkotlin/Function0;", "(Lv3/a;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lv3/p;Landroidx/compose/runtime/Composer;II)V", "", "MaxItemsToRetainForReuse", "I", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLazyLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,158:1\n1116#2,6:159\n*S KotlinDebug\n*F\n+ 1 LazyLayout.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutKt\n*L\n54#1:159,6\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutKt {
    private static final int MaxItemsToRetainForReuse = 7;

    @k(message = "Use an overload accepting a lambda prodicing an item provider instead", replaceWith = @b1(expression = "LazyLayout({ itemProvider }, modifier, prefetchState, measurePolicy)", imports = {}))
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_]]")
    @Composable
    @ExperimentalFoundationApi
    public static final void LazyLayout(@l LazyLayoutItemProvider lazyLayoutItemProvider, @m Modifier modifier, @m LazyLayoutPrefetchState lazyLayoutPrefetchState, @l p<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> pVar, @m Composer composer, int i5, int i6) {
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(852831187);
        if ((i6 & 1) != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i7 = (startRestartGroup.changed(lazyLayoutItemProvider) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i8 = i6 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i5 & 112) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i9 = i6 & 4;
        if (i9 != 0) {
            i7 |= 384;
        } else if ((i5 & 896) == 0) {
            i7 |= startRestartGroup.changed(lazyLayoutPrefetchState) ? 256 : 128;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar) ? 2048 : 1024;
        }
        if ((i7 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i8 != 0) {
                modifier = Modifier.Companion;
            }
            if (i9 != 0) {
                lazyLayoutPrefetchState = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(852831187, i7, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
            }
            startRestartGroup.startReplaceableGroup(-1428817084);
            boolean changed = startRestartGroup.changed(lazyLayoutItemProvider);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LazyLayoutKt$LazyLayout$1$1(lazyLayoutItemProvider);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceableGroup();
            LazyLayout((a<? extends LazyLayoutItemProvider>) rememberedValue, modifier, lazyLayoutPrefetchState, pVar, startRestartGroup, (i7 & 112) | (i7 & 896) | (i7 & 7168), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        LazyLayoutPrefetchState lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyLayoutKt$LazyLayout$2(lazyLayoutItemProvider, modifier2, lazyLayoutPrefetchState2, pVar, i5, i6));
        }
    }

    @Composable
    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable:[androidx.compose.ui.UiComposable]]]")
    public static final void LazyLayout(@l a<? extends LazyLayoutItemProvider> aVar, @m Modifier modifier, @m LazyLayoutPrefetchState lazyLayoutPrefetchState, @l p<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> pVar, @m Composer composer, int i5, int i6) {
        int i7;
        Composer startRestartGroup = composer.startRestartGroup(2002163445);
        if ((i6 & 1) != 0) {
            i7 = i5 | 6;
        } else if ((i5 & 14) == 0) {
            i7 = (startRestartGroup.changedInstance(aVar) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        int i8 = i6 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i5 & 112) == 0) {
            i7 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i9 = i6 & 4;
        if (i9 != 0) {
            i7 |= 384;
        } else if ((i5 & 896) == 0) {
            i7 |= startRestartGroup.changed(lazyLayoutPrefetchState) ? 256 : 128;
        }
        if ((i6 & 8) != 0) {
            i7 |= 3072;
        } else if ((i5 & 7168) == 0) {
            i7 |= startRestartGroup.changedInstance(pVar) ? 2048 : 1024;
        }
        if ((i7 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i8 != 0) {
                modifier = Modifier.Companion;
            }
            if (i9 != 0) {
                lazyLayoutPrefetchState = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2002163445, i7, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:77)");
            }
            LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.composableLambda(startRestartGroup, -1488997347, true, new LazyLayoutKt$LazyLayout$3(lazyLayoutPrefetchState, modifier, pVar, SnapshotStateKt.rememberUpdatedState(aVar, startRestartGroup, i7 & 14))), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        LazyLayoutPrefetchState lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyLayoutKt$LazyLayout$4(aVar, modifier2, lazyLayoutPrefetchState2, pVar, i5, i6));
        }
    }
}
