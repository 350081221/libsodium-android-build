package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/DrawScope;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Track$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1195:1\n1477#2:1196\n1502#2,3:1197\n1505#2,3:1207\n361#3,7:1200\n215#4:1210\n216#4:1222\n151#5,3:1211\n33#5,4:1214\n154#5,2:1218\n38#5:1220\n156#5:1221\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Track$1\n*L\n779#1:1196\n779#1:1197,3\n779#1:1207,3\n779#1:1200,7\n780#1:1210\n780#1:1222\n782#1:1211,3\n782#1:1214,4\n782#1:1218,2\n782#1:1220\n782#1:1221\n*E\n"})
/* loaded from: classes.dex */
public final class SliderKt$Track$1 extends n0 implements l<DrawScope, r2> {
    final /* synthetic */ State<Color> $activeTickColor;
    final /* synthetic */ State<Color> $activeTrackColor;
    final /* synthetic */ State<Color> $inactiveTickColor;
    final /* synthetic */ State<Color> $inactiveTrackColor;
    final /* synthetic */ float $positionFractionEnd;
    final /* synthetic */ float $positionFractionStart;
    final /* synthetic */ float $thumbPx;
    final /* synthetic */ List<Float> $tickFractions;
    final /* synthetic */ float $trackStrokeWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$Track$1(float f5, State<Color> state, float f6, float f7, float f8, State<Color> state2, List<Float> list, State<Color> state3, State<Color> state4) {
        super(1);
        this.$thumbPx = f5;
        this.$inactiveTrackColor = state;
        this.$trackStrokeWidth = f6;
        this.$positionFractionEnd = f7;
        this.$positionFractionStart = f8;
        this.$activeTrackColor = state2;
        this.$tickFractions = list;
        this.$inactiveTickColor = state3;
        this.$activeTickColor = state4;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l DrawScope drawScope) {
        boolean z4 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
        long Offset = OffsetKt.Offset(this.$thumbPx, Offset.m3494getYimpl(drawScope.mo4276getCenterF1C5BW0()));
        long Offset2 = OffsetKt.Offset(Size.m3562getWidthimpl(drawScope.mo4277getSizeNHjbRc()) - this.$thumbPx, Offset.m3494getYimpl(drawScope.mo4276getCenterF1C5BW0()));
        long j5 = z4 ? Offset2 : Offset;
        if (!z4) {
            Offset = Offset2;
        }
        long m3744unboximpl = this.$inactiveTrackColor.getValue().m3744unboximpl();
        float f5 = this.$trackStrokeWidth;
        StrokeCap.Companion companion = StrokeCap.Companion;
        long j6 = j5;
        DrawScope.m4264drawLineNGM6Ib0$default(drawScope, m3744unboximpl, j5, Offset, f5, companion.m4086getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        DrawScope.m4264drawLineNGM6Ib0$default(drawScope, this.$activeTrackColor.getValue().m3744unboximpl(), OffsetKt.Offset(Offset.m3493getXimpl(j6) + ((Offset.m3493getXimpl(Offset) - Offset.m3493getXimpl(j6)) * this.$positionFractionStart), Offset.m3494getYimpl(drawScope.mo4276getCenterF1C5BW0())), OffsetKt.Offset(Offset.m3493getXimpl(j6) + ((Offset.m3493getXimpl(Offset) - Offset.m3493getXimpl(j6)) * this.$positionFractionEnd), Offset.m3494getYimpl(drawScope.mo4276getCenterF1C5BW0())), this.$trackStrokeWidth, companion.m4086getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        List<Float> list = this.$tickFractions;
        float f6 = this.$positionFractionEnd;
        float f7 = this.$positionFractionStart;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            float floatValue = ((Number) obj).floatValue();
            Boolean valueOf = Boolean.valueOf(floatValue > f6 || floatValue < f7);
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(obj);
        }
        State<Color> state = this.$inactiveTickColor;
        State<Color> state2 = this.$activeTickColor;
        float f8 = this.$trackStrokeWidth;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
            List list2 = (List) entry.getValue();
            ArrayList arrayList = new ArrayList(list2.size());
            int size = list2.size();
            for (int i5 = 0; i5 < size; i5++) {
                arrayList.add(Offset.m3482boximpl(OffsetKt.Offset(Offset.m3493getXimpl(OffsetKt.m3516lerpWko1d7g(j6, Offset, ((Number) list2.get(i5)).floatValue())), Offset.m3494getYimpl(drawScope.mo4276getCenterF1C5BW0()))));
            }
            DrawScope.m4269drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.Companion.m4038getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m3744unboximpl(), f8, StrokeCap.Companion.m4086getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        }
    }
}
