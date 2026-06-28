package androidx.compose.material3;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabRowKt$ScrollableTabRowImp$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $divider;
    final /* synthetic */ float $edgePadding;
    final /* synthetic */ v3.q<List<TabPosition>, Composer, Integer, r2> $indicator;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ v3.p<Composer, Integer, r2> $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$ScrollableTabRowImp$2(int i5, v3.q<? super List<TabPosition>, ? super Composer, ? super Integer, r2> qVar, Modifier modifier, long j5, long j6, float f5, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, ScrollState scrollState, int i6, int i7) {
        super(2);
        this.$selectedTabIndex = i5;
        this.$indicator = qVar;
        this.$modifier = modifier;
        this.$containerColor = j5;
        this.$contentColor = j6;
        this.$edgePadding = f5;
        this.$divider = pVar;
        this.$tabs = pVar2;
        this.$scrollState = scrollState;
        this.$$changed = i6;
        this.$$default = i7;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        TabRowKt.m2356ScrollableTabRowImpqhFBPw4(this.$selectedTabIndex, this.$indicator, this.$modifier, this.$containerColor, this.$contentColor, this.$edgePadding, this.$divider, this.$tabs, this.$scrollState, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
