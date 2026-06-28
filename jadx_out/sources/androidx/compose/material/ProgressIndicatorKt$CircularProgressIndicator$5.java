package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ProgressIndicatorKt$CircularProgressIndicator$5 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $color;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ float $progress;
    final /* synthetic */ float $strokeWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressIndicatorKt$CircularProgressIndicator$5(float f5, Modifier modifier, long j5, float f6, int i5, int i6) {
        super(2);
        this.$progress = f5;
        this.$modifier = modifier;
        this.$color = j5;
        this.$strokeWidth = f6;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        ProgressIndicatorKt.m1400CircularProgressIndicatorMBs18nI(this.$progress, this.$modifier, this.$color, this.$strokeWidth, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
