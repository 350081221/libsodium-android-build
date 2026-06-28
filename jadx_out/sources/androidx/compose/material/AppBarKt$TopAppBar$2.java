package androidx.compose.material;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import p4.m;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt$TopAppBar$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ q<RowScope, Composer, Integer, r2> $actions;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ float $elevation;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ p<Composer, Integer, r2> $navigationIcon;
    final /* synthetic */ p<Composer, Integer, r2> $title;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AppBarKt$TopAppBar$2(p<? super Composer, ? super Integer, r2> pVar, WindowInsets windowInsets, Modifier modifier, p<? super Composer, ? super Integer, r2> pVar2, q<? super RowScope, ? super Composer, ? super Integer, r2> qVar, long j5, long j6, float f5, int i5, int i6) {
        super(2);
        this.$title = pVar;
        this.$windowInsets = windowInsets;
        this.$modifier = modifier;
        this.$navigationIcon = pVar2;
        this.$actions = qVar;
        this.$backgroundColor = j5;
        this.$contentColor = j6;
        this.$elevation = f5;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        AppBarKt.m1203TopAppBarRx1qByU(this.$title, this.$windowInsets, this.$modifier, this.$navigationIcon, this.$actions, this.$backgroundColor, this.$contentColor, this.$elevation, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
