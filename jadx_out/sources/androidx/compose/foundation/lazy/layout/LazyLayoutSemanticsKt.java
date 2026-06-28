package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.coroutines.i;
import kotlin.i0;
import kotlin.jvm.internal.r1;
import kotlinx.coroutines.s0;
import p4.l;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001aA\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "itemProviderLambda", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "userScrollEnabled", "reverseScrolling", "lazyLayoutSemantics", "(Landroidx/compose/ui/Modifier;Lv3/a;Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;Landroidx/compose/foundation/gestures/Orientation;ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@r1({"SMAP\nLazyLayoutSemantics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,170:1\n487#2,4:171\n491#2,2:179\n495#2:185\n25#3:175\n83#3,3:186\n1116#4,3:176\n1119#4,3:182\n1116#4,6:189\n487#5:181\n*S KotlinDebug\n*F\n+ 1 LazyLayoutSemantics.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsKt\n*L\n48#1:171,4\n48#1:179,2\n48#1:185\n48#1:175\n50#1:186,3\n48#1:176,3\n48#1:182,3\n50#1:189,6\n48#1:181\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutSemanticsKt {
    @l
    @Composable
    public static final Modifier lazyLayoutSemantics(@l Modifier modifier, @l a<? extends LazyLayoutItemProvider> aVar, @l LazyLayoutSemanticState lazyLayoutSemanticState, @l Orientation orientation, boolean z4, boolean z5, @m Composer composer, int i5) {
        boolean z6;
        LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1 lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1;
        LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1 lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1;
        composer.startReplaceableGroup(1070136913);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1070136913, i5, -1, "androidx.compose.foundation.lazy.layout.lazyLayoutSemantics (LazyLayoutSemantics.kt:46)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(i.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            rememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        s0 coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        Object[] objArr = {aVar, lazyLayoutSemanticState, orientation, Boolean.valueOf(z4)};
        composer.startReplaceableGroup(-568225417);
        boolean z7 = false;
        for (int i6 = 0; i6 < 4; i6++) {
            z7 |= composer.changed(objArr[i6]);
        }
        Object rememberedValue2 = composer.rememberedValue();
        if (z7 || rememberedValue2 == Composer.Companion.getEmpty()) {
            if (orientation == Orientation.Vertical) {
                z6 = true;
            } else {
                z6 = false;
            }
            LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1 lazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1 = new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1(aVar);
            ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$1(lazyLayoutSemanticState), new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$accessibilityScrollState$2(lazyLayoutSemanticState), z5);
            if (z4) {
                lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1 = new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1(z6, coroutineScope, lazyLayoutSemanticState);
            } else {
                lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1 = null;
            }
            if (z4) {
                lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1 = new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1(aVar, coroutineScope, lazyLayoutSemanticState);
            } else {
                lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1 = null;
            }
            rememberedValue2 = SemanticsModifierKt.semantics$default(Modifier.Companion, false, new LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1(lazyLayoutSemanticsKt$lazyLayoutSemantics$1$indexForKeyMapping$1, z6, scrollAxisRange, lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollByAction$1, lazyLayoutSemanticsKt$lazyLayoutSemantics$1$scrollToIndexAction$1, lazyLayoutSemanticState.collectionInfo()), 1, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier then = modifier.then((Modifier) rememberedValue2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return then;
    }
}
