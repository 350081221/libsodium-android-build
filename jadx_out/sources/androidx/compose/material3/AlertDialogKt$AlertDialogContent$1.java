package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.DialogTokens;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nAlertDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,224:1\n74#2,6:225\n80#2:259\n84#2:304\n78#3,11:231\n78#3,11:266\n91#3:298\n91#3:303\n456#4,8:242\n464#4,3:256\n456#4,8:277\n464#4,3:291\n467#4,3:295\n467#4,3:300\n3737#5,6:250\n3737#5,6:285\n68#6,6:260\n74#6:294\n78#6:299\n*S KotlinDebug\n*F\n+ 1 AlertDialog.kt\nandroidx/compose/material3/AlertDialogKt$AlertDialogContent$1\n*L\n60#1:225,6\n60#1:259\n60#1:304\n60#1:231,11\n109#1:266,11\n109#1:298\n60#1:303\n60#1:242,8\n60#1:256,3\n109#1:277,8\n109#1:291,3\n109#1:295,3\n60#1:300,3\n60#1:250,6\n109#1:285,6\n109#1:260,6\n109#1:294\n109#1:299\n*E\n"})
/* loaded from: classes.dex */
public final class AlertDialogKt$AlertDialogContent$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ long $buttonContentColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $buttons;
    final /* synthetic */ v3.p<Composer, Integer, r2> $icon;
    final /* synthetic */ long $iconContentColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $text;
    final /* synthetic */ long $textContentColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $title;
    final /* synthetic */ long $titleContentColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AlertDialogKt$AlertDialogContent$1(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, long j5, long j6, long j7, long j8, v3.p<? super Composer, ? super Integer, r2> pVar4) {
        super(2);
        this.$icon = pVar;
        this.$title = pVar2;
        this.$text = pVar3;
        this.$iconContentColor = j5;
        this.$titleContentColor = j6;
        this.$textContentColor = j7;
        this.$buttonContentColor = j8;
        this.$buttons = pVar4;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        PaddingValues paddingValues;
        v3.p<Composer, Integer, r2> pVar;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2126308228, i5, -1, "androidx.compose.material3.AlertDialogContent.<anonymous> (AlertDialog.kt:59)");
        }
        Modifier.Companion companion = Modifier.Companion;
        paddingValues = AlertDialogKt.DialogPadding;
        Modifier padding = PaddingKt.padding(companion, paddingValues);
        v3.p<Composer, Integer, r2> pVar2 = this.$icon;
        v3.p<Composer, Integer, r2> pVar3 = this.$title;
        v3.p<Composer, Integer, r2> pVar4 = this.$text;
        long j5 = this.$iconContentColor;
        long j6 = this.$titleContentColor;
        long j7 = this.$textContentColor;
        long j8 = this.$buttonContentColor;
        v3.p<Composer, Integer, r2> pVar5 = this.$buttons;
        composer.startReplaceableGroup(-483455358);
        Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
        Alignment.Companion companion2 = Alignment.Companion;
        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion3.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(padding);
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
        composer.startReplaceableGroup(76440827);
        if (pVar2 != null) {
            CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m3724boximpl(j5)), ComposableLambdaKt.composableLambda(composer, 934657765, true, new AlertDialogKt$AlertDialogContent$1$1$1$1(columnScopeInstance, pVar2)), composer, ProvidedValue.$stable | 0 | 48);
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(76441222);
        if (pVar3 == null) {
            pVar = pVar5;
        } else {
            pVar = pVar5;
            ProvideContentColorTextStyleKt.m2091ProvideContentColorTextStyle3JVO9M(j6, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), DialogTokens.INSTANCE.getHeadlineFont()), ComposableLambdaKt.composableLambda(composer, 434448772, true, new AlertDialogKt$AlertDialogContent$1$1$2$1(columnScopeInstance, pVar2, pVar3)), composer, 384);
        }
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(76442054);
        if (pVar4 != null) {
            ProvideContentColorTextStyleKt.m2091ProvideContentColorTextStyle3JVO9M(j7, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), DialogTokens.INSTANCE.getSupportingTextFont()), ComposableLambdaKt.composableLambda(composer, -796843771, true, new AlertDialogKt$AlertDialogContent$1$1$3$1(columnScopeInstance, pVar4)), composer, 384);
        }
        composer.endReplaceableGroup();
        Modifier align = columnScopeInstance.align(companion, companion2.getEnd());
        composer.startReplaceableGroup(733328855);
        MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer, 0);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        v3.a<ComposeUiNode> constructor2 = companion3.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(align);
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
        ProvideContentColorTextStyleKt.m2091ProvideContentColorTextStyle3JVO9M(j8, TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), DialogTokens.INSTANCE.getActionLabelTextFont()), pVar, composer, 0);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
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
