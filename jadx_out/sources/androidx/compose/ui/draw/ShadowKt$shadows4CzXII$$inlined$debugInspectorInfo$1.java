package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Shadow.kt\nandroidx/compose/ui/draw/ShadowKt\n*L\n1#1,170:1\n104#2,7:171\n*E\n"})
/* renamed from: androidx.compose.ui.draw.ShadowKt$shadow-s4CzXII$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ShadowKt$shadows4CzXII$$inlined$debugInspectorInfo$1 extends n0 implements l<InspectorInfo, r2> {
    final /* synthetic */ long $ambientColor$inlined;
    final /* synthetic */ boolean $clip$inlined;
    final /* synthetic */ float $elevation$inlined;
    final /* synthetic */ Shape $shape$inlined;
    final /* synthetic */ long $spotColor$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowKt$shadows4CzXII$$inlined$debugInspectorInfo$1(float f5, Shape shape, boolean z4, long j5, long j6) {
        super(1);
        this.$elevation$inlined = f5;
        this.$shape$inlined = shape;
        this.$clip$inlined = z4;
        this.$ambientColor$inlined = j5;
        this.$spotColor$inlined = j6;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("shadow");
        inspectorInfo.getProperties().set("elevation", Dp.m6042boximpl(this.$elevation$inlined));
        inspectorInfo.getProperties().set("shape", this.$shape$inlined);
        inspectorInfo.getProperties().set("clip", Boolean.valueOf(this.$clip$inlined));
        inspectorInfo.getProperties().set("ambientColor", Color.m3724boximpl(this.$ambientColor$inlined));
        inspectorInfo.getProperties().set("spotColor", Color.m3724boximpl(this.$spotColor$inlined));
    }
}
