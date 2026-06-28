package androidx.compose.material;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabRowKt$TabRow$3 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ p<Composer, Integer, r2> $divider;
    final /* synthetic */ q<List<TabPosition>, Composer, Integer, r2> $indicator;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ p<Composer, Integer, r2> $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$TabRow$3(int i5, Modifier modifier, long j5, long j6, q<? super List<TabPosition>, ? super Composer, ? super Integer, r2> qVar, p<? super Composer, ? super Integer, r2> pVar, p<? super Composer, ? super Integer, r2> pVar2, int i6, int i7) {
        super(2);
        this.$selectedTabIndex = i5;
        this.$modifier = modifier;
        this.$backgroundColor = j5;
        this.$contentColor = j6;
        this.$indicator = qVar;
        this.$divider = pVar;
        this.$tabs = pVar2;
        this.$$changed = i6;
        this.$$default = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        TabRowKt.m1484TabRowpAZo6Ak(this.$selectedTabIndex, this.$modifier, this.$backgroundColor, this.$contentColor, this.$indicator, this.$divider, this.$tabs, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
