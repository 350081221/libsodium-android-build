package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.Role;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.r1;
import kotlin.r2;
import v3.a;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "androidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@r1({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 Selectable.kt\nandroidx/compose/foundation/selection/SelectableKt\n*L\n1#1,170:1\n115#2,8:171\n*E\n"})
/* renamed from: androidx.compose.foundation.selection.SelectableKt$selectable-O2vRcR0$$inlined$debugInspectorInfo$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class SelectableKt$selectableO2vRcR0$$inlined$debugInspectorInfo$1 extends n0 implements l<InspectorInfo, r2> {
    final /* synthetic */ boolean $enabled$inlined;
    final /* synthetic */ Indication $indication$inlined;
    final /* synthetic */ MutableInteractionSource $interactionSource$inlined;
    final /* synthetic */ a $onClick$inlined;
    final /* synthetic */ Role $role$inlined;
    final /* synthetic */ boolean $selected$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableKt$selectableO2vRcR0$$inlined$debugInspectorInfo$1(boolean z4, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z5, Role role, a aVar) {
        super(1);
        this.$selected$inlined = z4;
        this.$interactionSource$inlined = mutableInteractionSource;
        this.$indication$inlined = indication;
        this.$enabled$inlined = z5;
        this.$role$inlined = role;
        this.$onClick$inlined = aVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("selectable");
        inspectorInfo.getProperties().set("selected", Boolean.valueOf(this.$selected$inlined));
        inspectorInfo.getProperties().set("interactionSource", this.$interactionSource$inlined);
        inspectorInfo.getProperties().set("indication", this.$indication$inlined);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled$inlined));
        inspectorInfo.getProperties().set("role", this.$role$inlined);
        inspectorInfo.getProperties().set("onClick", this.$onClick$inlined);
    }
}
