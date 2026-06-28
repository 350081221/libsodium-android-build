package androidx.compose.material3;

import androidx.compose.runtime.MutableIntState;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$exposedDropdownSize$1 extends kotlin.jvm.internal.n0 implements v3.q<MeasureScope, Measurable, Constraints, MeasureResult> {
    final /* synthetic */ MutableIntState $anchorWidth$delegate;
    final /* synthetic */ boolean $matchTextFieldWidth;
    final /* synthetic */ MutableIntState $menuMaxHeight$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$exposedDropdownSize$1$1, reason: invalid class name */
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
    public ExposedDropdownMenu_androidKt$ExposedDropdownMenuBox$scope$1$1$exposedDropdownSize$1(boolean z4, MutableIntState mutableIntState, MutableIntState mutableIntState2) {
        super(3);
        this.$matchTextFieldWidth = z4;
        this.$anchorWidth$delegate = mutableIntState;
        this.$menuMaxHeight$delegate = mutableIntState2;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        return m1875invoke3p2s80s(measureScope, measurable, constraints.m6006unboximpl());
    }

    @p4.l
    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final MeasureResult m1875invoke3p2s80s(@p4.l MeasureScope measureScope, @p4.l Measurable measurable, long j5) {
        int intValue;
        int intValue2;
        int m6002getMinWidthimpl;
        intValue = this.$anchorWidth$delegate.getIntValue();
        int m6014constrainWidthK40F9xA = ConstraintsKt.m6014constrainWidthK40F9xA(j5, intValue);
        intValue2 = this.$menuMaxHeight$delegate.getIntValue();
        int m6013constrainHeightK40F9xA = ConstraintsKt.m6013constrainHeightK40F9xA(j5, intValue2);
        if (this.$matchTextFieldWidth) {
            m6002getMinWidthimpl = m6014constrainWidthK40F9xA;
        } else {
            m6002getMinWidthimpl = Constraints.m6002getMinWidthimpl(j5);
        }
        if (!this.$matchTextFieldWidth) {
            m6014constrainWidthK40F9xA = Constraints.m6000getMaxWidthimpl(j5);
        }
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(Constraints.m5991copyZbe2FdA$default(j5, m6002getMinWidthimpl, m6014constrainWidthK40F9xA, 0, m6013constrainHeightK40F9xA, 4, null));
        return MeasureScope.layout$default(measureScope, mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight(), null, new AnonymousClass1(mo4998measureBRTryo0), 4, null);
    }
}
