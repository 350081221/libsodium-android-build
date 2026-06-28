package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.jvm.internal.r1;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBar$3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,741:1\n154#2:742\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt$SearchBar$3$1\n*L\n234#1:742\n*E\n"})
/* loaded from: classes.dex */
public final class SearchBar_androidKt$SearchBar$3$1 extends kotlin.jvm.internal.n0 implements v3.q<MeasureScope, Measurable, Constraints, MeasureResult> {
    final /* synthetic */ State<Float> $animationProgress;
    final /* synthetic */ State<Dp> $topPadding;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.SearchBar_androidKt$SearchBar$3$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
        final /* synthetic */ int $animatedTopPadding;
        final /* synthetic */ Placeable $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Placeable placeable, int i5) {
            super(1);
            this.$placeable = placeable;
            this.$animatedTopPadding = i5;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.placeRelative$default(placementScope, this.$placeable, 0, this.$animatedTopPadding, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBar_androidKt$SearchBar$3$1(State<Dp> state, State<Float> state2) {
        super(3);
        this.$topPadding = state;
        this.$animationProgress = state2;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        return m2127invoke3p2s80s(measureScope, measurable, constraints.m6006unboximpl());
    }

    @p4.l
    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final MeasureResult m2127invoke3p2s80s(@p4.l MeasureScope measureScope, @p4.l Measurable measurable, long j5) {
        float f5;
        int B;
        int B2;
        int mo298roundToPx0680j_4 = measureScope.mo298roundToPx0680j_4(DpKt.m6087lerpMdfbLM(this.$topPadding.getValue().m6058unboximpl(), Dp.m6044constructorimpl(0), this.$animationProgress.getValue().floatValue()));
        int max = Math.max(Constraints.m6002getMinWidthimpl(j5), measureScope.mo298roundToPx0680j_4(SearchBar_androidKt.getSearchBarMinWidth()));
        int m6000getMaxWidthimpl = Constraints.m6000getMaxWidthimpl(j5);
        f5 = SearchBar_androidKt.SearchBarMaxWidth;
        B = kotlin.ranges.u.B(max, Math.min(m6000getMaxWidthimpl, measureScope.mo298roundToPx0680j_4(f5)));
        B2 = kotlin.ranges.u.B(Math.max(Constraints.m6001getMinHeightimpl(j5), measureScope.mo298roundToPx0680j_4(SearchBarDefaults.INSTANCE.m2120getInputFieldHeightD9Ej5fM())), Constraints.m5999getMaxHeightimpl(j5));
        int m6000getMaxWidthimpl2 = Constraints.m6000getMaxWidthimpl(j5);
        int m5999getMaxHeightimpl = Constraints.m5999getMaxHeightimpl(j5);
        int lerp = MathHelpersKt.lerp(B, m6000getMaxWidthimpl2, this.$animationProgress.getValue().floatValue());
        int lerp2 = MathHelpersKt.lerp(B2, m5999getMaxHeightimpl, this.$animationProgress.getValue().floatValue()) + mo298roundToPx0680j_4;
        return MeasureScope.layout$default(measureScope, lerp, lerp2, null, new AnonymousClass1(measurable.mo4998measureBRTryo0(ConstraintsKt.m6017offsetNN6EwU$default(Constraints.Companion.m6008fixedJhjzzOo(lerp, lerp2), 0, -mo298roundToPx0680j_4, 1, null)), mo298roundToPx0680j_4), 4, null);
    }
}
