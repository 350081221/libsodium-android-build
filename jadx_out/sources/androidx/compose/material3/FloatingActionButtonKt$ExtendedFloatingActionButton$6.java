package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FloatingActionButtonKt$ExtendedFloatingActionButton$6 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ FloatingActionButtonElevation $elevation;
    final /* synthetic */ boolean $expanded;
    final /* synthetic */ v3.p<Composer, Integer, r2> $icon;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.a<r2> $onClick;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ v3.p<Composer, Integer, r2> $text;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FloatingActionButtonKt$ExtendedFloatingActionButton$6(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.a<r2> aVar, Modifier modifier, boolean z4, Shape shape, long j5, long j6, FloatingActionButtonElevation floatingActionButtonElevation, MutableInteractionSource mutableInteractionSource, int i5, int i6) {
        super(2);
        this.$text = pVar;
        this.$icon = pVar2;
        this.$onClick = aVar;
        this.$modifier = modifier;
        this.$expanded = z4;
        this.$shape = shape;
        this.$containerColor = j5;
        this.$contentColor = j6;
        this.$elevation = floatingActionButtonElevation;
        this.$interactionSource = mutableInteractionSource;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        FloatingActionButtonKt.m1902ExtendedFloatingActionButtonElI57k(this.$text, this.$icon, this.$onClick, this.$modifier, this.$expanded, this.$shape, this.$containerColor, this.$contentColor, this.$elevation, this.$interactionSource, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
