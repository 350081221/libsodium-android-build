package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Tooltip_androidKt$PlainTooltip$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ CaretProperties $caretProperties;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $shadowElevation;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ CaretScope $this_PlainTooltip;
    final /* synthetic */ float $tonalElevation;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Tooltip_androidKt$PlainTooltip$2(CaretScope caretScope, Modifier modifier, CaretProperties caretProperties, Shape shape, long j5, long j6, float f5, float f6, v3.p<? super Composer, ? super Integer, r2> pVar, int i5, int i6) {
        super(2);
        this.$this_PlainTooltip = caretScope;
        this.$modifier = modifier;
        this.$caretProperties = caretProperties;
        this.$shape = shape;
        this.$contentColor = j5;
        this.$containerColor = j6;
        this.$tonalElevation = f5;
        this.$shadowElevation = f6;
        this.$content = pVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        Tooltip_androidKt.m2596PlainTooltipFg7CxbU(this.$this_PlainTooltip, this.$modifier, this.$caretProperties, this.$shape, this.$contentColor, this.$containerColor, this.$tonalElevation, this.$shadowElevation, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
