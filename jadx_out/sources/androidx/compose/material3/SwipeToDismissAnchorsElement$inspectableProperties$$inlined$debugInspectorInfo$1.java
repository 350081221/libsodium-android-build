package androidx.compose.material3;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import kotlin.jvm.internal.r1;
import kotlin.r2;

@kotlin.i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 SwipeToDismissBox.kt\nandroidx/compose/material3/SwipeToDismissAnchorsElement\n*L\n1#1,170:1\n428#2,4:171\n*E\n"})
/* loaded from: classes.dex */
public final class SwipeToDismissAnchorsElement$inspectableProperties$$inlined$debugInspectorInfo$1 extends kotlin.jvm.internal.n0 implements v3.l<InspectorInfo, r2> {
    final /* synthetic */ SwipeToDismissAnchorsElement this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwipeToDismissAnchorsElement$inspectableProperties$$inlined$debugInspectorInfo$1(SwipeToDismissAnchorsElement swipeToDismissAnchorsElement) {
        super(1);
        this.this$0 = swipeToDismissAnchorsElement;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l InspectorInfo inspectorInfo) {
        SwipeToDismissBoxState swipeToDismissBoxState;
        boolean z4;
        boolean z5;
        ValueElementSequence properties = inspectorInfo.getProperties();
        swipeToDismissBoxState = this.this$0.state;
        properties.set("state", swipeToDismissBoxState);
        ValueElementSequence properties2 = inspectorInfo.getProperties();
        z4 = this.this$0.enableDismissFromStartToEnd;
        properties2.set("enableDismissFromStartToEnd", Boolean.valueOf(z4));
        ValueElementSequence properties3 = inspectorInfo.getProperties();
        z5 = this.this$0.enableDismissFromEndToStart;
        properties3.set("enableDismissFromEndToStart", Boolean.valueOf(z5));
    }
}
