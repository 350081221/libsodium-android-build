package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import java.util.Map;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;
import v3.p;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Swipeable.kt\nandroidx/compose/material/SwipeableKt\n*L\n1#1,170:1\n584#2,11:171\n*E\n"})
/* renamed from: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class SwipeableKt$swipeablepPrIpRY$$inlined$debugInspectorInfo$1 extends n0 implements l<InspectorInfo, r2> {
    final /* synthetic */ Map $anchors$inlined;
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ MutableInteractionSource $interactionSource$inlined;
    final /* synthetic */ Orientation $orientation$inlined;
    final /* synthetic */ ResistanceConfig $resistance$inlined;
    final /* synthetic */ boolean $reverseDirection$inlined;
    final /* synthetic */ SwipeableState $state$inlined;
    final /* synthetic */ p $thresholds$inlined;
    final /* synthetic */ float $velocityThreshold$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeableKt$swipeablepPrIpRY$$inlined$debugInspectorInfo$1(SwipeableState swipeableState, Map map, Orientation orientation, boolean z4, boolean z5, MutableInteractionSource mutableInteractionSource, p pVar, ResistanceConfig resistanceConfig, float f5) {
        super(1);
        this.$state$inlined = swipeableState;
        this.$anchors$inlined = map;
        this.$orientation$inlined = orientation;
        this.$enabled$inlined = z4;
        this.$reverseDirection$inlined = z5;
        this.$interactionSource$inlined = mutableInteractionSource;
        this.$thresholds$inlined = pVar;
        this.$resistance$inlined = resistanceConfig;
        this.$velocityThreshold$inlined = f5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("swipeable");
        inspectorInfo.getProperties().set("state", this.$state$inlined);
        inspectorInfo.getProperties().set("anchors", this.$anchors$inlined);
        inspectorInfo.getProperties().set("orientation", this.$orientation$inlined);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
        inspectorInfo.getProperties().set("reverseDirection", Boolean.valueOf(this.$reverseDirection$inlined));
        inspectorInfo.getProperties().set("interactionSource", this.$interactionSource$inlined);
        inspectorInfo.getProperties().set("thresholds", this.$thresholds$inlined);
        inspectorInfo.getProperties().set("resistance", this.$resistance$inlined);
        inspectorInfo.getProperties().set("velocityThreshold", Dp.m6042boximpl(this.$velocityThreshold$inlined));
    }
}
