package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$5 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ int $strokeCap;
    final /* synthetic */ float $strokeWidth;
    final /* synthetic */ long $trackColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$5(Modifier modifier, long j5, float f5, long j6, int i5, int i6, int i7) {
        super(2);
        this.$modifier = modifier;
        this.$color = j5;
        this.$strokeWidth = f5;
        this.$trackColor = j6;
        this.$strokeCap = i5;
        this.$$changed = i6;
        this.$$default = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        ProgressIndicatorKt.m2071CircularProgressIndicatorLxG7B9w(this.$modifier, this.$color, this.$strokeWidth, this.$trackColor, this.$strokeCap, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
