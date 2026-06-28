package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldDefaults$indicatorLine$2 extends kotlin.jvm.internal.n0 implements v3.q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ float $focusedIndicatorLineThickness;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ float $unfocusedIndicatorLineThickness;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDefaults$indicatorLine$2(boolean z4, boolean z5, InteractionSource interactionSource, TextFieldColors textFieldColors, float f5, float f6) {
        super(3);
        this.$enabled = z4;
        this.$isError = z5;
        this.$interactionSource = interactionSource;
        this.$colors = textFieldColors;
        this.$focusedIndicatorLineThickness = f5;
        this.$unfocusedIndicatorLineThickness = f6;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @p4.l
    @Composable
    public final Modifier invoke(@p4.l Modifier modifier, @p4.m Composer composer, int i5) {
        State m2441animateBorderStrokeAsStateNuRrP5Q;
        composer.startReplaceableGroup(-891038934);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-891038934, i5, -1, "androidx.compose.material3.TextFieldDefaults.indicatorLine.<anonymous> (TextFieldDefaults.kt:141)");
        }
        m2441animateBorderStrokeAsStateNuRrP5Q = TextFieldDefaultsKt.m2441animateBorderStrokeAsStateNuRrP5Q(this.$enabled, this.$isError, this.$interactionSource, this.$colors, this.$focusedIndicatorLineThickness, this.$unfocusedIndicatorLineThickness, composer, 0);
        Modifier drawIndicatorLine = TextFieldKt.drawIndicatorLine(Modifier.Companion, (BorderStroke) m2441animateBorderStrokeAsStateNuRrP5Q.getValue());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return drawIndicatorLine;
    }
}
