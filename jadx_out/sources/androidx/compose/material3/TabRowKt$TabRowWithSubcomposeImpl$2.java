package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import java.util.List;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TabRowKt$TabRowWithSubcomposeImpl$2 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ long $containerColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ v3.p<Composer, Integer, r2> $divider;
    final /* synthetic */ v3.q<List<TabPosition>, Composer, Integer, r2> $indicator;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ v3.p<Composer, Integer, r2> $tabs;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TabRowKt$TabRowWithSubcomposeImpl$2(Modifier modifier, long j5, long j6, v3.q<? super List<TabPosition>, ? super Composer, ? super Integer, r2> qVar, v3.p<? super Composer, ? super Integer, r2> pVar, v3.p<? super Composer, ? super Integer, r2> pVar2, int i5) {
        super(2);
        this.$modifier = modifier;
        this.$containerColor = j5;
        this.$contentColor = j6;
        this.$indicator = qVar;
        this.$divider = pVar;
        this.$tabs = pVar2;
        this.$$changed = i5;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        TabRowKt.m2361TabRowWithSubcomposeImplDTcfvLk(this.$modifier, this.$containerColor, this.$contentColor, this.$indicator, this.$divider, this.$tabs, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
