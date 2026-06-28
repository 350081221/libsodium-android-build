package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationRailKt$NavigationRailItemLayout$3 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ boolean $alwaysShowLabel;
    final /* synthetic */ v3.a<Float> $animationProgress;
    final /* synthetic */ v3.p<Composer, Integer, r2> $icon;
    final /* synthetic */ v3.p<Composer, Integer, r2> $indicator;
    final /* synthetic */ v3.p<Composer, Integer, r2> $indicatorRipple;
    final /* synthetic */ v3.p<Composer, Integer, r2> $label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavigationRailKt$NavigationRailItemLayout$3(v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, v3.p<? super Composer, ? super Integer, r2> pVar3, v3.p<? super Composer, ? super Integer, r2> pVar4, boolean z4, v3.a<Float> aVar, int i5) {
        super(2);
        this.$indicatorRipple = pVar;
        this.$indicator = pVar2;
        this.$icon = pVar3;
        this.$label = pVar4;
        this.$alwaysShowLabel = z4;
        this.$animationProgress = aVar;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        NavigationRailKt.NavigationRailItemLayout(this.$indicatorRipple, this.$indicator, this.$icon, this.$label, this.$alwaysShowLabel, this.$animationProgress, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
