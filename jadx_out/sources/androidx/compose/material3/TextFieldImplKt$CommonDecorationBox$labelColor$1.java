package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Color;", "it", "Landroidx/compose/material3/InputPhase;", "invoke-XeAY9LY", "(Landroidx/compose/material3/InputPhase;Landroidx/compose/runtime/Composer;I)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldImplKt$CommonDecorationBox$labelColor$1 extends kotlin.jvm.internal.n0 implements v3.q<InputPhase, Composer, Integer, Color> {
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$labelColor$1(TextFieldColors textFieldColors, boolean z4, boolean z5, InteractionSource interactionSource) {
        super(3);
        this.$colors = textFieldColors;
        this.$enabled = z4;
        this.$isError = z5;
        this.$interactionSource = interactionSource;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ Color invoke(InputPhase inputPhase, Composer composer, Integer num) {
        return Color.m3724boximpl(m2445invokeXeAY9LY(inputPhase, composer, num.intValue()));
    }

    @Composable
    /* renamed from: invoke-XeAY9LY, reason: not valid java name */
    public final long m2445invokeXeAY9LY(@p4.l InputPhase inputPhase, @p4.m Composer composer, int i5) {
        composer.startReplaceableGroup(-502832279);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-502832279, i5, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:92)");
        }
        long m3744unboximpl = this.$colors.labelColor$material3_release(this.$enabled, this.$isError, this.$interactionSource, composer, 0).getValue().m3744unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m3744unboximpl;
    }
}
