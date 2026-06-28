package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import p4.m;
import v3.q;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Color;", "it", "Landroidx/compose/material/InputPhase;", "invoke-XeAY9LY", "(Landroidx/compose/material/InputPhase;Landroidx/compose/runtime/Composer;I)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldImplKt$CommonDecorationBox$labelColor$1 extends n0 implements q<InputPhase, Composer, Integer, Color> {
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
        return Color.m3724boximpl(m1507invokeXeAY9LY(inputPhase, composer, num.intValue()));
    }

    @Composable
    /* renamed from: invoke-XeAY9LY, reason: not valid java name */
    public final long m1507invokeXeAY9LY(@l InputPhase inputPhase, @m Composer composer, int i5) {
        boolean z4;
        composer.startReplaceableGroup(697243846);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(697243846, i5, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:91)");
        }
        TextFieldColors textFieldColors = this.$colors;
        boolean z5 = this.$enabled;
        if (inputPhase == InputPhase.UnfocusedEmpty) {
            z4 = false;
        } else {
            z4 = this.$isError;
        }
        long m3744unboximpl = textFieldColors.labelColor(z5, z4, this.$interactionSource, composer, 0).getValue().m3744unboximpl();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m3744unboximpl;
    }
}
