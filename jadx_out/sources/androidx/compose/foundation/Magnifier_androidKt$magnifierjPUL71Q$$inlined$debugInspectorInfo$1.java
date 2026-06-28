package androidx.compose.foundation;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Magnifier.android.kt\nandroidx/compose/foundation/Magnifier_androidKt\n*L\n1#1,170:1\n157#2,9:171\n*E\n"})
/* renamed from: androidx.compose.foundation.Magnifier_androidKt$magnifier-jPUL71Q$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class Magnifier_androidKt$magnifierjPUL71Q$$inlined$debugInspectorInfo$1 extends n0 implements v3.l<InspectorInfo, r2> {
    final /* synthetic */ boolean $clippingEnabled$inlined;
    final /* synthetic */ float $cornerRadius$inlined;
    final /* synthetic */ float $elevation$inlined;
    final /* synthetic */ v3.l $magnifierCenter$inlined;
    final /* synthetic */ long $size$inlined;
    final /* synthetic */ v3.l $sourceCenter$inlined;
    final /* synthetic */ float $zoom$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Magnifier_androidKt$magnifierjPUL71Q$$inlined$debugInspectorInfo$1(v3.l lVar, v3.l lVar2, float f5, long j5, float f6, float f7, boolean z4) {
        super(1);
        this.$sourceCenter$inlined = lVar;
        this.$magnifierCenter$inlined = lVar2;
        this.$zoom$inlined = f5;
        this.$size$inlined = j5;
        this.$cornerRadius$inlined = f6;
        this.$elevation$inlined = f7;
        this.$clippingEnabled$inlined = z4;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("magnifier (not supported)");
        inspectorInfo.getProperties().set("sourceCenter", this.$sourceCenter$inlined);
        inspectorInfo.getProperties().set("magnifierCenter", this.$magnifierCenter$inlined);
        inspectorInfo.getProperties().set("zoom", Float.valueOf(this.$zoom$inlined));
        inspectorInfo.getProperties().set("size", DpSize.m6130boximpl(this.$size$inlined));
        inspectorInfo.getProperties().set("cornerRadius", Dp.m6042boximpl(this.$cornerRadius$inlined));
        inspectorInfo.getProperties().set("elevation", Dp.m6042boximpl(this.$elevation$inlined));
        inspectorInfo.getProperties().set("clippingEnabled", Boolean.valueOf(this.$clippingEnabled$inlined));
    }
}
