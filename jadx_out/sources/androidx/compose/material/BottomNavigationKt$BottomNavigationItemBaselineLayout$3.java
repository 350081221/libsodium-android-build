package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomNavigationKt$BottomNavigationItemBaselineLayout$3 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ p<Composer, Integer, r2> $icon;
    final /* synthetic */ float $iconPositionAnimationProgress;
    final /* synthetic */ p<Composer, Integer, r2> $label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomNavigationKt$BottomNavigationItemBaselineLayout$3(p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, float f5, int i5) {
        super(2);
        this.$icon = pVar;
        this.$label = pVar2;
        this.$iconPositionAnimationProgress = f5;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        BottomNavigationKt.BottomNavigationItemBaselineLayout(this.$icon, this.$label, this.$iconPositionAnimationProgress, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
