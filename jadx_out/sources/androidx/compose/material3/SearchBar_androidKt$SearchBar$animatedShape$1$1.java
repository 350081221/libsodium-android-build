package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "Landroidx/compose/ui/geometry/Size;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "<anonymous parameter 1>", "Lkotlin/r2;", "invoke-12SF9DM", "(Landroidx/compose/ui/graphics/Path;JLandroidx/compose/ui/unit/LayoutDirection;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBar$animatedShape$1$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,741:1\n88#2:742\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBar$animatedShape$1$1\n*L\n198#1:742\n*E\n"})
/* loaded from: classes.dex */
public final class SearchBar_androidKt$SearchBar$animatedShape$1$1 extends kotlin.jvm.internal.n0 implements v3.q<Path, Size, LayoutDirection, r2> {
    final /* synthetic */ State<Float> $animationProgress;
    final /* synthetic */ Density $density;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBar$animatedShape$1$1(Density density, State<Float> state) {
        super(3);
        this.$density = density;
        this.$animationProgress = state;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ r2 invoke(Path path, Size size, LayoutDirection layoutDirection) {
        m2128invoke12SF9DM(path, size.m3567unboximpl(), layoutDirection);
        return r2.f19517a;
    }

    /* renamed from: invoke-12SF9DM, reason: not valid java name */
    public final void m2128invoke12SF9DM(@p4.l Path path, long j5, @p4.l LayoutDirection layoutDirection) {
        float f5;
        Density density = this.$density;
        State<Float> state = this.$animationProgress;
        f5 = SearchBar_androidKt.SearchBarCornerRadius;
        path.addRoundRect(RoundRectKt.m3548RoundRectsniSvfs(SizeKt.m3583toRectuvyYCjk(j5), CornerRadiusKt.CornerRadius$default(density.mo304toPx0680j_4(Dp.m6044constructorimpl(f5 * (1 - state.getValue().floatValue()))), 0.0f, 2, null)));
    }
}
