package androidx.compose.material3;

import androidx.compose.material3.tokens.BottomAppBarTokens;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import kotlin.r2;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppBarKt$BottomAppBar$5$1 extends kotlin.jvm.internal.n0 implements v3.q<MeasureScope, Measurable, Constraints, MeasureResult> {
    final /* synthetic */ BottomAppBarScrollBehavior $scrollBehavior;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.AppBarKt$BottomAppBar$5$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.n0 implements v3.l<Placeable.PlacementScope, r2> {
        final /* synthetic */ Placeable $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Placeable placeable) {
            super(1);
            this.$placeable = placeable;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope.place$default(placementScope, this.$placeable, 0, 0, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarKt$BottomAppBar$5$1(BottomAppBarScrollBehavior bottomAppBarScrollBehavior) {
        super(3);
        this.$scrollBehavior = bottomAppBarScrollBehavior;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        return m1563invoke3p2s80s(measureScope, measurable, constraints.m6006unboximpl());
    }

    @p4.l
    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final MeasureResult m1563invoke3p2s80s(@p4.l MeasureScope measureScope, @p4.l Measurable measurable, long j5) {
        BottomAppBarState bottomAppBarState;
        float f5;
        int L0;
        BottomAppBarState state;
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior = this.$scrollBehavior;
        if (bottomAppBarScrollBehavior != null) {
            bottomAppBarState = bottomAppBarScrollBehavior.getState();
        } else {
            bottomAppBarState = null;
        }
        if (bottomAppBarState != null) {
            bottomAppBarState.setHeightOffsetLimit(-measureScope.mo304toPx0680j_4(BottomAppBarTokens.INSTANCE.m2641getContainerHeightD9Ej5fM()));
        }
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
        float height = mo4998measureBRTryo0.getHeight();
        BottomAppBarScrollBehavior bottomAppBarScrollBehavior2 = this.$scrollBehavior;
        if (bottomAppBarScrollBehavior2 != null && (state = bottomAppBarScrollBehavior2.getState()) != null) {
            f5 = state.getHeightOffset();
        } else {
            f5 = 0.0f;
        }
        int width = mo4998measureBRTryo0.getWidth();
        L0 = kotlin.math.d.L0(height + f5);
        return MeasureScope.layout$default(measureScope, width, L0, null, new AnonymousClass1(mo4998measureBRTryo0), 4, null);
    }
}
