package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationDrawerKt$DismissibleDrawerSheet$1 extends kotlin.jvm.internal.n0 implements v3.p<Composer, Integer, r2> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ v3.q<ColumnScope, Composer, Integer, r2> $content;
    final /* synthetic */ long $drawerContainerColor;
    final /* synthetic */ long $drawerContentColor;
    final /* synthetic */ Shape $drawerShape;
    final /* synthetic */ float $drawerTonalElevation;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ WindowInsets $windowInsets;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavigationDrawerKt$DismissibleDrawerSheet$1(Modifier modifier, Shape shape, long j5, long j6, float f5, WindowInsets windowInsets, v3.q<? super ColumnScope, ? super Composer, ? super Integer, r2> qVar, int i5, int i6) {
        super(2);
        this.$modifier = modifier;
        this.$drawerShape = shape;
        this.$drawerContainerColor = j5;
        this.$drawerContentColor = j6;
        this.$drawerTonalElevation = f5;
        this.$windowInsets = windowInsets;
        this.$content = qVar;
        this.$$changed = i5;
        this.$$default = i6;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ r2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return r2.f19517a;
    }

    public final void invoke(@p4.m Composer composer, int i5) {
        NavigationDrawerKt.m2025DismissibleDrawerSheetafqeVBk(this.$modifier, this.$drawerShape, this.$drawerContainerColor, this.$drawerContentColor, this.$drawerTonalElevation, this.$windowInsets, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
