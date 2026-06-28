package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt$OutlinedTextFieldLayout$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ v3.p<Composer, Integer, r2> $container;
    final /* synthetic */ v3.p<Composer, Integer, r2> $label;
    final /* synthetic */ v3.p<Composer, Integer, r2> $leading;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.l<Size, r2> $onLabelMeasured;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ v3.q<Modifier, Composer, Integer, r2> $placeholder;
    final /* synthetic */ v3.p<Composer, Integer, r2> $prefix;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ v3.p<Composer, Integer, r2> $suffix;
    final /* synthetic */ v3.p<Composer, Integer, r2> $supporting;
    final /* synthetic */ v3.p<Composer, Integer, r2> $textField;
    final /* synthetic */ v3.p<Composer, Integer, r2> $trailing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldKt$OutlinedTextFieldLayout$2(Modifier modifier, v3.p<? super Composer, ? super Integer, r2> pVar, v3.q<? super Modifier, ? super Composer, ? super Integer, r2> qVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, v3.p<? super Composer, ? super Integer, r2> pVar5, v3.p<? super Composer, ? super Integer, r2> pVar6, boolean z4, float f5, v3.l<? super Size, r2> lVar, v3.p<? super Composer, ? super Integer, r2> pVar7, v3.p<? super Composer, ? super Integer, r2> pVar8, PaddingValues paddingValues, int i5, int i6) {
        super(2);
        this.$modifier = modifier;
        this.$textField = pVar;
        this.$placeholder = qVar;
        this.$label = pVar2;
        this.$leading = pVar3;
        this.$trailing = pVar4;
        this.$prefix = pVar5;
        this.$suffix = pVar6;
        this.$singleLine = z4;
        this.$animationProgress = f5;
        this.$onLabelMeasured = lVar;
        this.$container = pVar7;
        this.$supporting = pVar8;
        this.$paddingValues = paddingValues;
        this.$$changed = i5;
        this.$$changed1 = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        OutlinedTextFieldKt.OutlinedTextFieldLayout(this.$modifier, this.$textField, this.$placeholder, this.$label, this.$leading, this.$trailing, this.$prefix, this.$suffix, this.$singleLine, this.$animationProgress, this.$onLabelMeasured, this.$container, this.$supporting, this.$paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1));
    }
}
