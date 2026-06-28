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
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nBasicTooltip.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/BasicTooltip_androidKt$TooltipPopup$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,225:1\n1116#2,6:226\n68#3,6:232\n74#3:266\n78#3:271\n78#4,11:238\n91#4:270\n456#5,8:249\n464#5,3:263\n467#5,3:267\n3737#6,6:257\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.android.kt\nandroidx/compose/material3/BasicTooltip_androidKt$TooltipPopup$2\n*L\n142#1:226,6\n141#1:232,6\n141#1:266\n141#1:271\n141#1:238,11\n141#1:270\n141#1:249,8\n141#1:263,3\n141#1:267,3\n141#1:257,6\n*E\n"})
/* loaded from: classes.dex */
public final class BasicTooltip_androidKt$TooltipPopup$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $content;
    final /* synthetic */ String $tooltipDescription;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BasicTooltip_androidKt$TooltipPopup$2(String str, v3.p<? super Composer, ? super Integer, r2> pVar) {
        super(2);
        this.$tooltipDescription = str;
        this.$content = pVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(282408040, i5, -1, "androidx.compose.material3.TooltipPopup.<anonymous> (BasicTooltip.android.kt:140)");
        }
        Modifier.Companion companion = Modifier.Companion;
        composer.startReplaceableGroup(1706937961);
        boolean changed = composer.changed(this.$tooltipDescription);
        String str = this.$tooltipDescription;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new BasicTooltip_androidKt$TooltipPopup$2$1$1(str);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (v3.l) rememberedValue, 1, null);
        v3.p<Composer, Integer, r2> pVar = this.$content;
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.Companion.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion2.getConstructor();
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
        Updater.m3271setimpl(m3264constructorimpl, rememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        pVar.invoke(composer, 0);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
