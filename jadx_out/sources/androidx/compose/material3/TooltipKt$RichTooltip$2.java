package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TooltipKt$RichTooltip$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ v3.p<Composer, Integer, r2> $action;
    final /* synthetic */ RichTooltipColors $colors;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ v3.p<Composer, Integer, r2> $text;
    final /* synthetic */ v3.p<Composer, Integer, r2> $title;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TooltipKt$RichTooltip$2(Modifier modifier, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, Shape shape, RichTooltipColors richTooltipColors, float f5, float f6, v3.p<? super Composer, ? super Integer, r2> pVar3, int i5, int i6) {
        super(2);
        this.$modifier = modifier;
        this.$title = pVar;
        this.$action = pVar2;
        this.$shape = shape;
        this.$colors = richTooltipColors;
        this.$tonalElevation = f5;
        this.$shadowElevation = f6;
        this.$text = pVar3;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        TooltipKt.m2595RichTooltip1tP8Re8(this.$modifier, this.$title, this.$action, this.$shape, this.$colors, this.$tonalElevation, this.$shadowElevation, this.$text, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
