package androidx.compose.foundation;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import kotlin.ranges.u;

@i0(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,595:1\n92#2:596\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1\n*L\n569#1:596\n*E\n"})
/* loaded from: classes.dex */
final class AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1 extends n0 implements v3.q<MeasureScope, Measurable, Constraints, MeasureResult> {
    public static final AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1 INSTANCE = new AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1();

    /* JADX INFO: Access modifiers changed from: package-private */
    @i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.foundation.AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends n0 implements v3.l<Placeable.PlacementScope, r2> {
        final /* synthetic */ int $extraSizePx;
        final /* synthetic */ Placeable $placeable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Placeable placeable, int i5) {
            super(1);
            this.$placeable = placeable;
            this.$extraSizePx = i5;
        }

        @Override // v3.l
        public /* bridge */ /* synthetic */ r2 invoke(Placeable.PlacementScope placementScope) {
            invoke2(placementScope);
            return r2.f19517a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@p4.l Placeable.PlacementScope placementScope) {
            Placeable placeable = this.$placeable;
            Placeable.PlacementScope.placeWithLayer$default(placementScope, placeable, ((-this.$extraSizePx) / 2) - ((placeable.getWidth() - this.$placeable.getMeasuredWidth()) / 2), ((-this.$extraSizePx) / 2) - ((this.$placeable.getHeight() - this.$placeable.getMeasuredHeight()) / 2), 0.0f, null, 12, null);
        }
    }

    AndroidOverscroll_androidKt$StretchOverscrollNonClippingLayer$1() {
        super(3);
    }

    @Override // v3.q
    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        return m198invoke3p2s80s(measureScope, measurable, constraints.m6006unboximpl());
    }

    @p4.l
    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final MeasureResult m198invoke3p2s80s(@p4.l MeasureScope measureScope, @p4.l Measurable measurable, long j5) {
        int u4;
        int u5;
        Placeable mo4998measureBRTryo0 = measurable.mo4998measureBRTryo0(j5);
        int mo298roundToPx0680j_4 = measureScope.mo298roundToPx0680j_4(Dp.m6044constructorimpl(ClipScrollableContainerKt.getMaxSupportedElevation() * 2));
        u4 = u.u(mo4998measureBRTryo0.getMeasuredWidth() - mo298roundToPx0680j_4, 0);
        u5 = u.u(mo4998measureBRTryo0.getMeasuredHeight() - mo298roundToPx0680j_4, 0);
        return MeasureScope.layout$default(measureScope, u4, u5, null, new AnonymousClass1(mo4998measureBRTryo0, mo298roundToPx0680j_4), 4, null);
    }
}
