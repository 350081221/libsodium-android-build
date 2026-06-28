package androidx.compose.material;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt$OutlinedTextFieldLayout$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ float $animationProgress;
    final /* synthetic */ p<Composer, Integer, r2> $border;
    final /* synthetic */ p<Composer, Integer, r2> $label;
    final /* synthetic */ p<Composer, Integer, r2> $leading;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ l<Size, r2> $onLabelMeasured;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ q<Modifier, Composer, Integer, r2> $placeholder;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ p<Composer, Integer, r2> $textField;
    final /* synthetic */ p<Composer, Integer, r2> $trailing;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldKt$OutlinedTextFieldLayout$2(Modifier modifier, p<? super Composer, ? super Integer, r2> pVar, q<? super Modifier, ? super Composer, ? super Integer, r2> qVar, p<? super Composer, ? super Integer, r2> pVar2, p<? super Composer, ? super Integer, r2> pVar3, p<? super Composer, ? super Integer, r2> pVar4, boolean z4, float f5, l<? super Size, r2> lVar, p<? super Composer, ? super Integer, r2> pVar5, PaddingValues paddingValues, int i5, int i6) {
        super(2);
        this.$modifier = modifier;
        this.$textField = pVar;
        this.$placeholder = qVar;
        this.$label = pVar2;
        this.$leading = pVar3;
        this.$trailing = pVar4;
        this.$singleLine = z4;
        this.$animationProgress = f5;
        this.$onLabelMeasured = lVar;
        this.$border = pVar5;
        this.$paddingValues = paddingValues;
        this.$$changed = i5;
        this.$$changed1 = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        OutlinedTextFieldKt.OutlinedTextFieldLayout(this.$modifier, this.$textField, this.$placeholder, this.$label, this.$leading, this.$trailing, this.$singleLine, this.$animationProgress, this.$onLabelMeasured, this.$border, this.$paddingValues, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), RecomposeScopeImplKt.updateChangedFlags(this.$$changed1));
    }
}
