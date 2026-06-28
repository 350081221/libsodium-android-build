package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "T", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAnimatedVisibility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,919:1\n56#2:920\n59#2:921\n*S KotlinDebug\n*F\n+ 1 AnimatedVisibility.kt\nandroidx/compose/animation/AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1\n*L\n747#1:920\n746#1:921\n*E\n"})
/* loaded from: classes.dex */
public final class AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1 extends n0 implements q<MeasureScope, Measurable, Constraints, MeasureResult> {
    final /* synthetic */ Transition<T> $transition;
    final /* synthetic */ l<T, Boolean> $visible;

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements l<Placeable.PlacementScope, r2> {
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
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedVisibilityKt$AnimatedVisibilityImpl$1$1(l<? super T, Boolean> lVar, Transition<T> transition) {
        super(3);
        this.$visible = lVar;
        this.$transition = transition;
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        return m59invoke3p2s80s(measureScope, measurable, constraints.m6006unboximpl());
    }

    @p4.l
    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final MeasureResult m59invoke3p2s80s(@p4.l MeasureScope measureScope, @p4.l Measurable measurable, long j5) {
        long IntSize;
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
        if (measureScope.isLookingAhead() && !this.$visible.invoke(this.$transition.getTargetState()).booleanValue()) {
            IntSize = IntSize.Companion.m6219getZeroYbymL2g();
        } else {
            IntSize = IntSizeKt.IntSize(mo4998measureBRTryo0.getWidth(), mo4998measureBRTryo0.getHeight());
        }
        return MeasureScope.layout$default(measureScope, IntSize.m6214getWidthimpl(IntSize), IntSize.m6213getHeightimpl(IntSize), null, new AnonymousClass1(mo4998measureBRTryo0), 4, null);
    }
}
