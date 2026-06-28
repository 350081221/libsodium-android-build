package androidx.constraintlayout.compose;

import androidx.compose.ui.platform.InspectorInfo;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\n¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1 extends n0 implements l<InspectorInfo, r2> {
    final /* synthetic */ l $constrainBlock$inlined;
    final /* synthetic */ ConstrainedLayoutReference $ref$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutScope$ConstrainAsModifier$special$$inlined$debugInspectorInfo$1(ConstrainedLayoutReference constrainedLayoutReference, l lVar) {
        super(1);
        this.$ref$inlined = constrainedLayoutReference;
        this.$constrainBlock$inlined = lVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l InspectorInfo inspectorInfo) {
        l0.p(inspectorInfo, "$this$null");
        inspectorInfo.setName("constrainAs");
        inspectorInfo.getProperties().set("ref", this.$ref$inlined);
        inspectorInfo.getProperties().set("constrainBlock", this.$constrainBlock$inlined);
    }
}
