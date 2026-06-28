package androidx.compose.material;

import androidx.compose.foundation.layout.ColumnScope;
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
public final class NavigationRailKt$NavigationRail$2 extends n0 implements p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ q<ColumnScope, Composer, Integer, r2> $content;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ float $elevation;
    final /* synthetic */ q<ColumnScope, Composer, Integer, r2> $header;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavigationRailKt$NavigationRail$2(WindowInsets windowInsets, Modifier modifier, long j5, long j6, float f5, q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar, q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar2, int i5, int i6) {
        super(2);
        this.$windowInsets = windowInsets;
        this.$modifier = modifier;
        this.$backgroundColor = j5;
        this.$contentColor = j6;
        this.$elevation = f5;
        this.$header = qVar;
        this.$content = qVar2;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@m Composer composer, int i5) {
        NavigationRailKt.m1384NavigationRailafqeVBk(this.$windowInsets, this.$modifier, this.$backgroundColor, this.$contentColor, this.$elevation, this.$header, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
