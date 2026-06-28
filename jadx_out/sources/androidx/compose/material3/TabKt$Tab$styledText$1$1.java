package androidx.compose.material3;

import androidx.compose.material3.tokens.PrimaryNavigationTabTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TabKt$Tab$styledText$1$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ v3.p<Composer, Integer, r2> $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabKt$Tab$styledText$1$1(v3.p<? super Composer, ? super Integer, r2> pVar) {
        super(2);
        this.$text = pVar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@p4.m Composer composer, int i5) {
        TextStyle m5571copyp1EtxEg;
        if ((i5 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(708874428, i5, -1, "androidx.compose.material3.Tab.<anonymous>.<anonymous> (Tab.kt:104)");
        }
        m5571copyp1EtxEg = r3.m5571copyp1EtxEg((r48 & 1) != 0 ? r3.spanStyle.m5504getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r3.spanStyle.m5505getFontSizeXSAIIZE() : 0L, (r48 & 4) != 0 ? r3.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? r3.spanStyle.m5506getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? r3.spanStyle.m5507getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? r3.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r3.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r3.spanStyle.m5508getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? r3.spanStyle.m5503getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? r3.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r3.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r3.spanStyle.m5502getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? r3.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r3.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r3.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r3.paragraphStyle.m5460getTextAligne0LSkKk() : TextAlign.Companion.m5936getCentere0LSkKk(), (r48 & 65536) != 0 ? r3.paragraphStyle.m5462getTextDirections_7Xco() : 0, (r48 & 131072) != 0 ? r3.paragraphStyle.m5458getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? r3.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r3.platformStyle : null, (r48 & 1048576) != 0 ? r3.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r3.paragraphStyle.m5457getLineBreakrAG3T2k() : 0, (r48 & 4194304) != 0 ? r3.paragraphStyle.m5455getHyphensvmbZdU8() : 0, (r48 & 8388608) != 0 ? TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composer, 6), PrimaryNavigationTabTokens.INSTANCE.getLabelTextFont()).paragraphStyle.getTextMotion() : null);
        TextKt.ProvideTextStyle(m5571copyp1EtxEg, this.$text, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
