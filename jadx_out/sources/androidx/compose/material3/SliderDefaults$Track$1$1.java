package androidx.compose.material3;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults$Track$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2151:1\n10843#2:2152\n11093#2,3:2153\n11096#2,3:2163\n361#3,7:2156\n215#4:2166\n216#4:2178\n151#5,3:2167\n33#5,4:2170\n154#5,2:2174\n38#5:2176\n156#5:2177\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults$Track$1$1\n*L\n1089#1:2152\n1089#1:2153,3\n1089#1:2163,3\n1089#1:2156,7\n1092#1:2166\n1092#1:2178\n1094#1:2167,3\n1094#1:2170,4\n1094#1:2174,2\n1094#1:2176\n1094#1:2177\n*E\n"})
/* loaded from: classes.dex */
final class SliderDefaults$Track$1$1 extends kotlin.jvm.internal.n0 implements v3.l<DrawScope, r2> {
    final /* synthetic */ long $activeTickColor;
    final /* synthetic */ long $activeTrackColor;
    final /* synthetic */ long $inactiveTickColor;
    final /* synthetic */ long $inactiveTrackColor;
    final /* synthetic */ SliderPositions $sliderPositions;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderDefaults$Track$1$1(long j5, SliderPositions sliderPositions, long j6, long j7, long j8) {
        super(1);
        this.$inactiveTrackColor = j5;
        this.$sliderPositions = sliderPositions;
        this.$activeTrackColor = j6;
        this.$inactiveTickColor = j7;
        this.$activeTickColor = j8;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l DrawScope drawScope) {
        float f5;
        boolean z4 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
        long Offset = OffsetKt.Offset(0.0f, Offset.m3494getYimpl(drawScope.mo4276getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc()), Offset.m3494getYimpl(drawScope.mo4276getCenterF1C5BW0()));
        long j5 = z4 ? Offset2 : Offset;
        long j6 = z4 ? Offset : Offset2;
        f5 = SliderKt.TickSize;
        float mo304toPx0680j_4 = drawScope.mo304toPx0680j_4(f5);
        float mo304toPx0680j_42 = drawScope.mo304toPx0680j_4(SliderKt.getTrackHeight());
        long j7 = this.$inactiveTrackColor;
        StrokeCap.Companion companion = StrokeCap.Companion;
        long j8 = j6;
        long j9 = j5;
        DrawScope.m4264drawLineNGM6Ib0$default(drawScope, j7, j5, j6, mo304toPx0680j_42, companion.m4086getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        DrawScope.m4264drawLineNGM6Ib0$default(drawScope, this.$activeTrackColor, OffsetKt.Offset(Offset.m3493getXimpl(j9) + ((Offset.m3493getXimpl(j8) - Offset.m3493getXimpl(j9)) * this.$sliderPositions.getActiveRange().getStart().floatValue()), Offset.m3494getYimpl(drawScope.mo4276getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3493getXimpl(j9) + ((Offset.m3493getXimpl(j8) - Offset.m3493getXimpl(j9)) * this.$sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m3494getYimpl(drawScope.mo4276getCenterF1C5BW0())), mo304toPx0680j_42, companion.m4086getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        float[] tickFractions = this.$sliderPositions.getTickFractions();
        SliderPositions sliderPositions = this.$sliderPositions;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = tickFractions.length;
        for (int i5 = 0; i5 < length; i5++) {
            float f6 = tickFractions[i5];
            Boolean valueOf = Boolean.valueOf(f6 > sliderPositions.getActiveRange().getEndInclusive().floatValue() || f6 < sliderPositions.getActiveRange().getStart().floatValue());
            Object obj = linkedHashMap.get(valueOf);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(valueOf, obj);
            }
            ((List) obj).add(Float.valueOf(f6));
        }
        long j10 = this.$inactiveTickColor;
        long j11 = this.$activeTickColor;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            List list = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                arrayList.add(Offset.m3482boximpl(OffsetKt.Offset(Offset.m3493getXimpl(OffsetKt.m3516lerpWko1d7g(j9, j8, ((Number) list.get(i6)).floatValue())), Offset.m3494getYimpl(drawScope.mo4276getCenterF1C5BW0()))));
            }
            long j12 = j9;
            long j13 = j8;
            DrawScope.m4269drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.Companion.m4038getPointsr_lszbg(), booleanValue ? j10 : j11, mo304toPx0680j_4, StrokeCap.Companion.m4086getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            j11 = j11;
            j8 = j13;
            j9 = j12;
        }
    }
}
