package androidx.compose.material3;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
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
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$LeadingIconTab$2\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,452:1\n91#2,2:453\n93#2:483\n97#2:488\n78#3,11:455\n91#3:487\n456#4,8:466\n464#4,3:480\n467#4,3:484\n3737#5,6:474\n*S KotlinDebug\n*F\n+ 1 Tab.kt\nandroidx/compose/material3/TabKt$LeadingIconTab$2\n*L\n175#1:453,2\n175#1:483\n175#1:488\n175#1:455,11\n175#1:487\n175#1:466,8\n175#1:480,3\n175#1:484,3\n175#1:474,6\n*E\n"})
/* loaded from: classes.dex */
public final class TabKt$LeadingIconTab$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ v3.p<Composer, Integer, r2> $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.a<r2> $onClick;
    final /* synthetic */ Indication $ripple;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ v3.p<Composer, Integer, r2> $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabKt$LeadingIconTab$2(Modifier modifier, boolean z4, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z5, v3.a<r2> aVar, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2) {
        super(2);
        this.$modifier = modifier;
        this.$selected = z4;
        this.$interactionSource = mutableInteractionSource;
        this.$ripple = indication;
        this.$enabled = z5;
        this.$onClick = aVar;
        this.$icon = pVar;
        this.$text = pVar2;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        float f5;
        float f6;
        TextStyle m5571copyp1EtxEg;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-429037564, i5, -1, "androidx.compose.material3.LeadingIconTab.<anonymous> (Tab.kt:174)");
        }
        Modifier modifier = this.$modifier;
        f5 = TabKt.SmallTabHeight;
        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m555paddingVpY3zN4$default(SelectableKt.m794selectableO2vRcR0(SizeKt.m588height3ABfNKs(modifier, f5), this.$selected, this.$interactionSource, this.$ripple, this.$enabled, Role.m5366boximpl(Role.Companion.m5379getTabo7Vup1c()), this.$onClick), TabKt.getHorizontalTextPadding(), 0.0f, 2, null), 0.0f, 1, null);
        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
        Alignment.Vertical centerVertically = Alignment.Companion.getCenterVertically();
        v3.p<Composer, Integer, r2> pVar = this.$icon;
        v3.p<Composer, Integer, r2> pVar2 = this.$text;
        composer.startReplaceableGroup(693286680);
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, composer, 54);
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        v3.a<ComposeUiNode> constructor = companion.getConstructor();
        v3.q<SkippableUpdater<ComposeUiNode>, Composer, Integer, r2> modifierMaterializerOf = LayoutKt.modifierMaterializerOf(fillMaxWidth$default);
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
        Updater.m3271setimpl(m3264constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m3271setimpl(m3264constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        v3.p<ComposeUiNode, Integer, r2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m3264constructorimpl.getInserting() || !kotlin.jvm.internal.l0.g(m3264constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m3264constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m3264constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m3255boximpl(SkippableUpdater.m3256constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        pVar.invoke(composer, 0);
        Modifier.Companion companion2 = Modifier.Companion;
        f6 = TabKt.TextDistanceFromLeadingIcon;
        SpacerKt.Spacer(SizeKt.m599requiredWidth3ABfNKs(companion2, f6), composer, 6);
        m5571copyp1EtxEg = r7.m5571copyp1EtxEg((r48 & 1) != 0 ? r7.spanStyle.m5504getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r7.spanStyle.m5505getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r7.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r7.spanStyle.m5506getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r7.spanStyle.m5507getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r7.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r7.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r7.spanStyle.m5508getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r7.spanStyle.m5503getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r7.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r7.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r7.spanStyle.m5502getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r7.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r7.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r7.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r7.paragraphStyle.m5460getTextAligne0LSkKk() : TextAlign.Companion.m5936getCentere0LSkKk(), (r48 & 65536) != 0 ? r7.paragraphStyle.m5462getTextDirections_7Xco() : 0, (r48 & 131072) != 0 ? r7.paragraphStyle.m5458getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r7.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r7.platformStyle : null, (r48 & 1048576) != 0 ? r7.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r7.paragraphStyle.m5457getLineBreakrAG3T2k() : 0, (r48 & 4194304) != 0 ? r7.paragraphStyle.m5455getHyphensvmbZdU8() : 0, (r48 & 8388608) != 0 ? TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont()).paragraphStyle.getTextMotion() : null);
        TextKt.ProvideTextStyle(m5571copyp1EtxEg, pVar2, composer, 0);
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
