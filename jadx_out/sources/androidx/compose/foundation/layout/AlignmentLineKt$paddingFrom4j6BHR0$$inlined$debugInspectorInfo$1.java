package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 AlignmentLine.kt\nandroidx/compose/foundation/layout/AlignmentLineKt\n*L\n1#1,170:1\n76#2,5:171\n*E\n"})
/* renamed from: androidx.compose.foundation.layout.AlignmentLineKt$paddingFrom-4j6BHR0$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1 extends n0 implements l<InspectorInfo, r2> {
    final /* synthetic */ float $after$inlined;
    final /* synthetic */ AlignmentLine $alignmentLine$inlined;
    final /* synthetic */ float $before$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlignmentLineKt$paddingFrom4j6BHR0$$inlined$debugInspectorInfo$1(AlignmentLine alignmentLine, float f5, float f6) {
        super(1);
        this.$alignmentLine$inlined = alignmentLine;
        this.$before$inlined = f5;
        this.$after$inlined = f6;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("paddingFrom");
        inspectorInfo.getProperties().set("alignmentLine", this.$alignmentLine$inlined);
        inspectorInfo.getProperties().set("before", Dp.m6042boximpl(this.$before$inlined));
        inspectorInfo.getProperties().set("after", Dp.m6042boximpl(this.$after$inlined));
    }
}
