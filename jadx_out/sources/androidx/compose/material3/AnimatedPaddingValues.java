package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.r1;

@Stable
@kotlin.i0(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\rR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/material3/AnimatedPaddingValues;", "Landroidx/compose/foundation/layout/PaddingValues;", "animationProgress", "Landroidx/compose/runtime/State;", "", "topPadding", "Landroidx/compose/ui/unit/Dp;", "(Landroidx/compose/runtime/State;Landroidx/compose/runtime/State;)V", "getAnimationProgress", "()Landroidx/compose/runtime/State;", "getTopPadding", "calculateBottomPadding", "calculateBottomPadding-D9Ej5fM", "()F", "calculateLeftPadding", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "calculateLeftPadding-u2uoSUM", "(Landroidx/compose/ui/unit/LayoutDirection;)F", "calculateRightPadding", "calculateRightPadding-u2uoSUM", "calculateTopPadding", "calculateTopPadding-D9Ej5fM", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/AnimatedPaddingValues\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,741:1\n88#2:742\n88#2:743\n154#3:744\n154#3:745\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/AnimatedPaddingValues\n*L\n693#1:742\n694#1:743\n696#1:744\n697#1:745\n*E\n"})
/* loaded from: classes.dex */
final class AnimatedPaddingValues implements PaddingValues {

    @p4.l
    private final State<Float> animationProgress;

    @p4.l
    private final State<Dp> topPadding;

    public AnimatedPaddingValues(@p4.l State<Float> state, @p4.l State<Dp> state2) {
        this.animationProgress = state;
        this.topPadding = state2;
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateBottomPadding-D9Ej5fM */
    public float mo503calculateBottomPaddingD9Ej5fM() {
        return Dp.m6044constructorimpl(SearchBar_androidKt.getSearchBarVerticalPadding() * this.animationProgress.getValue().floatValue());
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateLeftPadding-u2uoSUM */
    public float mo504calculateLeftPaddingu2uoSUM(@p4.l LayoutDirection layoutDirection) {
        return Dp.m6044constructorimpl(0);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateRightPadding-u2uoSUM */
    public float mo505calculateRightPaddingu2uoSUM(@p4.l LayoutDirection layoutDirection) {
        return Dp.m6044constructorimpl(0);
    }

    @Override // androidx.compose.foundation.layout.PaddingValues
    /* renamed from: calculateTopPadding-D9Ej5fM */
    public float mo506calculateTopPaddingD9Ej5fM() {
        return Dp.m6044constructorimpl(this.topPadding.getValue().m6058unboximpl() * this.animationProgress.getValue().floatValue());
    }

    @p4.l
    public final State<Float> getAnimationProgress() {
        return this.animationProgress;
    }

    @p4.l
    public final State<Dp> getTopPadding() {
        return this.topPadding;
    }
}
