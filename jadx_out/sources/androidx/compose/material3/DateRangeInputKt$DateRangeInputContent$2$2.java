package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/r2;", "invoke", "(Landroidx/compose/runtime/Composer;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,121:1\n1116#2,6:122\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$2$2\n*L\n79#1:122,6\n*E\n"})
/* loaded from: classes.dex */
final class DateRangeInputKt$DateRangeInputContent$2$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ String $pattern;
    final /* synthetic */ String $startRangeText;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DateRangeInputKt$DateRangeInputContent$2$2(String str, String str2) {
        super(2);
        this.$startRangeText = str;
        this.$pattern = str2;
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
            ComposerKt.traceEventStart(801434508, i5, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:77)");
        }
        String str = this.$startRangeText;
        Modifier.Companion companion = Modifier.Companion;
        composer.startReplaceableGroup(-2126787323);
        boolean changed = composer.changed(this.$startRangeText) | composer.changed(this.$pattern);
        String str2 = this.$startRangeText;
        String str3 = this.$pattern;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DateRangeInputKt$DateRangeInputContent$2$2$1$1(str2, str3);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TextKt.m2452Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion, false, (v3.l) rememberedValue, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (v3.l<? super TextLayoutResult, r2>) null, (TextStyle) null, composer, 0, 0, 131068);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
