package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class BadgeKt$Badge$1$1 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ q<RowScope, Composer, Integer, r2> $content;
    final /* synthetic */ RowScope $this_Row;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material.BadgeKt$Badge$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements p<Composer, Integer, r2> {
        final /* synthetic */ q<RowScope, Composer, Integer, r2> $content;
        final /* synthetic */ RowScope $this_Row;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, RowScope rowScope) {
            super(2);
            this.$content = qVar;
            this.$this_Row = rowScope;
        }

        @Override // v3.p
        public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return r2.f19517a;
        }

        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
        @Composable
        public final void invoke(@m Composer composer, int i5) {
            if ((i5 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(915155142, i5, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous>.<anonymous> (Badge.kt:161)");
            }
            this.$content.invoke(this.$this_Row, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BadgeKt$Badge$1$1(q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, RowScope rowScope) {
        super(2);
        this.$content = qVar;
        this.$this_Row = rowScope;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(@m Composer composer, int i5) {
        long j5;
        TextStyle m5571copyp1EtxEg;
        if ((i5 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1784526485, i5, -1, "androidx.compose.material.Badge.<anonymous>.<anonymous> (Badge.kt:158)");
        }
        TextStyle button = MaterialTheme.INSTANCE.getTypography(composer, 6).getButton();
        j5 = BadgeKt.BadgeContentFontSize;
        m5571copyp1EtxEg = button.m5571copyp1EtxEg((r48 & 1) != 0 ? button.spanStyle.m5504getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? button.spanStyle.m5505getFontSizeXSAIIZE() : j5, (r48 & 4) != 0 ? button.spanStyle.getFontWeight() : null, (r48 & 8) != 0 ? button.spanStyle.m5506getFontStyle4Lr2A7w() : null, (r48 & 16) != 0 ? button.spanStyle.m5507getFontSynthesisZQGJjVo() : null, (r48 & 32) != 0 ? button.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? button.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? button.spanStyle.m5508getLetterSpacingXSAIIZE() : 0L, (r48 & 256) != 0 ? button.spanStyle.m5503getBaselineShift5SSeXJ0() : null, (r48 & 512) != 0 ? button.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? button.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? button.spanStyle.m5502getBackground0d7_KjU() : 0L, (r48 & 4096) != 0 ? button.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? button.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? button.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? button.paragraphStyle.m5460getTextAligne0LSkKk() : 0, (r48 & 65536) != 0 ? button.paragraphStyle.m5462getTextDirections_7Xco() : 0, (r48 & 131072) != 0 ? button.paragraphStyle.m5458getLineHeightXSAIIZE() : 0L, (r48 & 262144) != 0 ? button.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? button.platformStyle : null, (r48 & 1048576) != 0 ? button.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? button.paragraphStyle.m5457getLineBreakrAG3T2k() : 0, (r48 & 4194304) != 0 ? button.paragraphStyle.m5455getHyphensvmbZdU8() : 0, (r48 & 8388608) != 0 ? button.paragraphStyle.getTextMotion() : null);
        TextKt.ProvideTextStyle(m5571copyp1EtxEg, ComposableLambdaKt.composableLambda(composer, 915155142, true, new AnonymousClass1(this.$content, this.$this_Row)), composer, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
