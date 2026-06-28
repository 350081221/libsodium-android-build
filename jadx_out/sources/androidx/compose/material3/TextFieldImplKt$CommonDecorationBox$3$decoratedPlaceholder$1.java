package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,433:1\n68#2,6:434\n74#2:468\n78#2:473\n78#3,11:440\n91#3:472\n456#4,8:451\n464#4,3:465\n467#4,3:469\n3737#5,6:459\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1\n*L\n136#1:434,6\n136#1:468\n136#1:473\n136#1:440,11\n136#1:472\n136#1:451,8\n136#1:465,3\n136#1:469,3\n136#1:459,6\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1 extends kotlin.jvm.internal.n0 implements v3.q<Modifier, Composer, Integer, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $placeholder;
    final /* synthetic */ float $placeholderAlphaProgress;
    final /* synthetic */ long $placeholderColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1(float f5, long j5, v3.p<? super Composer, ? super Integer, r2> pVar) {
        super(3);
        this.$placeholderAlphaProgress = f5;
        this.$placeholderColor = j5;
        this.$placeholder = pVar;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(Modifier modifier, Composer composer, Integer num) {
        invoke(modifier, composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.l Modifier modifier, @p4.m Composer composer, int i5) {
        if ((i5 & 6) == 0) {
            i5 |= composer.changed(modifier) ? 4 : 2;
        }
        if ((i5 & 19) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-524658155, i5, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:135)");
        }
        Modifier alpha = AlphaKt.alpha(modifier, this.$placeholderAlphaProgress);
        long j5 = this.$placeholderColor;
        v3.p<Composer, Integer, r2> pVar = this.$placeholder;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(alpha);
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
        TextFieldImplKt.m2442DecorationKTwxG1Y(j5, MaterialTheme.INSTANCE.getTypography(composer, 6).getBodyLarge(), pVar, composer, 0, 0);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
