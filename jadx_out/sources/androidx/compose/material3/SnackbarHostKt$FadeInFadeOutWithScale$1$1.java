package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.List;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/r2;", "Landroidx/compose/runtime/Composable;", "children", "invoke", "(Lv3/p;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,464:1\n1116#2,6:465\n1116#2,6:471\n68#3,6:477\n74#3:511\n78#3:516\n78#4,11:483\n91#4:515\n456#5,8:494\n464#5,3:508\n467#5,3:512\n3737#6,6:502\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n*L\n373#1:465,6\n396#1:471,6\n389#1:477,6\n389#1:511\n389#1:516\n389#1:483,11\n389#1:515\n389#1:494,8\n389#1:508,3\n389#1:512,3\n389#1:502,6\n*E\n"})
/* loaded from: classes.dex */
public final class SnackbarHostKt$FadeInFadeOutWithScale$1$1 extends kotlin.jvm.internal.n0 implements v3.q<v3.p<? super Composer, ? super Integer, ? extends r2>, Composer, Integer, r2> {
    final /* synthetic */ SnackbarData $current;
    final /* synthetic */ SnackbarData $key;
    final /* synthetic */ List<SnackbarData> $keys;
    final /* synthetic */ FadeInFadeOutState<SnackbarData> $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1(SnackbarData snackbarData, SnackbarData snackbarData2, List<SnackbarData> list, FadeInFadeOutState<SnackbarData> fadeInFadeOutState) {
        super(3);
        this.$key = snackbarData;
        this.$current = snackbarData2;
        this.$keys = list;
        this.$state = fadeInFadeOutState;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(v3.p<? super Composer, ? super Integer, ? extends r2> pVar, Composer composer, Integer num) {
        invoke((v3.p<? super Composer, ? super Integer, r2>) pVar, composer, num.intValue());
        return r2.f19517a;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public final void invoke(@p4.l v3.p<? super Composer, ? super Integer, r2> pVar, @p4.m Composer composer, int i5) {
        int i6;
        State animatedOpacity;
        State animatedScale;
        if ((i5 & 6) == 0) {
            i6 = i5 | (composer.changedInstance(pVar) ? 4 : 2);
        } else {
            i6 = i5;
        }
        if ((i6 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1654683077, i6, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:357)");
        }
        boolean g5 = kotlin.jvm.internal.l0.g(this.$key, this.$current);
        int i7 = g5 ? 150 : 75;
        int i8 = (!g5 || ListUtilsKt.fastFilterNotNull(this.$keys).size() == 1) ? 0 : 75;
        TweenSpec tween = AnimationSpecKt.tween(i7, i8, EasingKt.getLinearEasing());
        composer.startReplaceableGroup(870026295);
        boolean changed = composer.changed(this.$key) | composer.changedInstance(this.$state);
        SnackbarData snackbarData = this.$key;
        FadeInFadeOutState<SnackbarData> fadeInFadeOutState = this.$state;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1$1(snackbarData, fadeInFadeOutState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        animatedOpacity = SnackbarHostKt.animatedOpacity(tween, g5, (v3.a) rememberedValue, composer, 0, 0);
        animatedScale = SnackbarHostKt.animatedScale(AnimationSpecKt.tween(i7, i8, EasingKt.getFastOutSlowInEasing()), g5, composer, 0);
        Modifier m3894graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3894graphicsLayerAp8cVGQ$default(Modifier.Companion, ((Number) animatedScale.getValue()).floatValue(), ((Number) animatedScale.getValue()).floatValue(), ((Number) animatedOpacity.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
        composer.startReplaceableGroup(870027225);
        boolean changed2 = composer.changed(this.$key);
        SnackbarData snackbarData2 = this.$key;
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new SnackbarHostKt$FadeInFadeOutWithScale$1$1$1$1(snackbarData2);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(m3894graphicsLayerAp8cVGQ$default, false, (v3.l) rememberedValue2, 1, null);
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(semantics$default);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m3264constructorimpl = Updater.m3264constructorimpl(composer);
        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        pVar.invoke(composer, Integer.valueOf(i6 & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
