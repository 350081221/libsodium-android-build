package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BottomNavigationKt$BottomNavigationTransition$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $activeColor;
    final /* synthetic */ q<Float, Composer, Integer, r2> $content;
    final /* synthetic */ long $inactiveColor;
    final /* synthetic */ boolean $selected;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BottomNavigationKt$BottomNavigationTransition$2(long j5, long j6, boolean z4, q<? super Float, ? super Composer, ? super Integer, r2> qVar, int i5) {
        super(2);
        this.$activeColor = j5;
        this.$inactiveColor = j6;
        this.$selected = z4;
        this.$content = qVar;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        BottomNavigationKt.m1223BottomNavigationTransitionKlgxPg(this.$activeColor, this.$inactiveColor, this.$selected, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
