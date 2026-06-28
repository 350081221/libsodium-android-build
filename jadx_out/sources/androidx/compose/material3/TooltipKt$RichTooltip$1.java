package androidx.compose.material3;

import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextStyle;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$RichTooltip$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,719:1\n74#2,6:720\n80#2:754\n84#2:879\n78#3,11:726\n78#3,11:761\n91#3:793\n78#3,11:801\n91#3:833\n78#3,11:841\n91#3:873\n91#3:878\n456#4,8:737\n464#4,3:751\n456#4,8:772\n464#4,3:786\n467#4,3:790\n456#4,8:812\n464#4,3:826\n467#4,3:830\n456#4,8:852\n464#4,3:866\n467#4,3:870\n467#4,3:875\n3737#5,6:745\n3737#5,6:780\n3737#5,6:820\n3737#5,6:860\n68#6,6:755\n74#6:789\n78#6:794\n68#6,6:795\n74#6:829\n78#6:834\n68#6,6:835\n74#6:869\n78#6:874\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$RichTooltip$1\n*L\n256#1:720,6\n256#1:754\n256#1:879\n256#1:726,11\n260#1:761,11\n260#1:793\n270#1:801,11\n270#1:833\n280#1:841,11\n280#1:873\n256#1:878\n256#1:737,8\n256#1:751,3\n260#1:772,8\n260#1:786,3\n260#1:790,3\n270#1:812,8\n270#1:826,3\n270#1:830,3\n280#1:852,8\n280#1:866,3\n280#1:870,3\n256#1:875,3\n256#1:745,6\n260#1:780,6\n270#1:820,6\n280#1:860,6\n260#1:755,6\n260#1:789\n260#1:794\n270#1:795,6\n270#1:829\n270#1:834\n280#1:835,6\n280#1:869\n280#1:874\n*E\n"})
/* loaded from: classes.dex */
public final class TooltipKt$RichTooltip$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $action;
    final /* synthetic */ RichTooltipColors $colors;
    final /* synthetic */ v3.p<Composer, Integer, r2> $text;
    final /* synthetic */ v3.p<Composer, Integer, r2> $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TooltipKt$RichTooltip$1(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, RichTooltipColors richTooltipColors, v3.p<? super Composer, ? super Integer, r2> pVar3) {
        super(2);
        this.$title = pVar;
        this.$action = pVar2;
        this.$colors = richTooltipColors;
        this.$text = pVar3;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        Modifier textVerticalPadding;
        float f5;
        float f6;
        float f7;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(4342931, i5, -1, "androidx.compose.material3.RichTooltip.<anonymous> (Tooltip.kt:248)");
        }
        MaterialTheme materialTheme = MaterialTheme.INSTANCE;
        Typography typography = materialTheme.getTypography(composer, 6);
        RichTooltipTokens richTooltipTokens = RichTooltipTokens.INSTANCE;
        TextStyle fromToken = TypographyKt.fromToken(typography, richTooltipTokens.getActionLabelTextFont());
        TextStyle fromToken2 = TypographyKt.fromToken(materialTheme.getTypography(composer, 6), richTooltipTokens.getSubheadFont());
        TextStyle fromToken3 = TypographyKt.fromToken(materialTheme.getTypography(composer, 6), richTooltipTokens.getSupportingTextFont());
        Modifier.Companion companion = Modifier.Companion;
        Modifier m555paddingVpY3zN4$default = PaddingKt.m555paddingVpY3zN4$default(companion, TooltipKt.getRichTooltipHorizontalPadding(), 0.0f, 2, null);
        v3.p<Composer, Integer, r2> pVar = this.$title;
        v3.p<Composer, Integer, r2> pVar2 = this.$action;
        RichTooltipColors richTooltipColors = this.$colors;
        v3.p<Composer, Integer, r2> pVar3 = this.$text;
        composer.startReplaceableGroup(-483455358);
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion3.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(m555paddingVpY3zN4$default);
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
        Updater.m3271setimpl(m3264constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        composer.startReplaceableGroup(-1216116120);
        if (pVar != null) {
            f7 = TooltipKt.HeightToSubheadFirstLine;
            Modifier m437paddingFromBaselineVpY3zN4$default = AlignmentLineKt.m437paddingFromBaselineVpY3zN4$default(companion, f7, 0.0f, 2, null);
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(m437paddingFromBaselineVpY3zN4$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m3264constructorimpl2 = Updater.m3264constructorimpl(composer);
            Updater.m3271setimpl(m3264constructorimpl2, rememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl2.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3264constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3264constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            modifierMaterializerOf2.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(richTooltipColors.m2105getTitleContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(fromToken2)}, pVar, composer, 0);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            r2 r2Var = r2.f19517a;
        }
        composer.endReplaceableGroup();
        textVerticalPadding = TooltipKt.textVerticalPadding(companion, pVar != null, pVar2 != null);
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        v3.a<ComposeUiNode> constructor3 = companion3.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(textVerticalPadding);
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor3);
        } else {
            composer.useNode();
        }
        Composer m3264constructorimpl3 = Updater.m3264constructorimpl(composer);
        Updater.m3271setimpl(m3264constructorimpl3, rememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (m3264constructorimpl3.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            m3264constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            m3264constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        modifierMaterializerOf3.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(richTooltipColors.m2104getContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(fromToken3)}, pVar3, composer, 0);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-8196376);
        if (pVar2 != null) {
            f5 = TooltipKt.ActionLabelMinHeight;
            Modifier m593requiredHeightInVpY3zN4$default = SizeKt.m593requiredHeightInVpY3zN4$default(companion, f5, 0.0f, 2, null);
            f6 = TooltipKt.ActionLabelBottomPadding;
            Modifier m557paddingqDBjuR0$default = PaddingKt.m557paddingqDBjuR0$default(m593requiredHeightInVpY3zN4$default, 0.0f, 0.0f, 0.0f, f6, 7, null);
            composer.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
            composer.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            v3.a<ComposeUiNode> constructor4 = companion3.getConstructor();
            v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(m557paddingqDBjuR0$default);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer m3264constructorimpl4 = Updater.m3264constructorimpl(composer);
            Updater.m3271setimpl(m3264constructorimpl4, rememberBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m3271setimpl(m3264constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (m3264constructorimpl4.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m3264constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m3264constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            modifierMaterializerOf4.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
            composer.startReplaceableGroup(2058660585);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(richTooltipColors.m2102getActionContentColor0d7_KjU())), TextKt.getLocalTextStyle().provides(fromToken)}, pVar2, composer, 0);
            composer.endReplaceableGroup();
            composer.endNode();
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            r2 r2Var2 = r2.f19517a;
        }
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
