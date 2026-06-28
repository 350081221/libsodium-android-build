package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SegmentedButtonKt$SingleChoiceSegmentedButtonRow$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ v3.q<SingleChoiceSegmentedButtonRowScope, Composer, Integer, r2> $content;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $space;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SegmentedButtonKt$SingleChoiceSegmentedButtonRow$2(Modifier modifier, float f5, v3.q<? super SingleChoiceSegmentedButtonRowScope, ? super Composer, ? super Integer, r2> qVar, int i5, int i6) {
        super(2);
        this.$modifier = modifier;
        this.$space = f5;
        this.$content = qVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        SegmentedButtonKt.m2153SingleChoiceSegmentedButtonRowuFdPcIQ(this.$modifier, this.$space, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
