package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class FocusableKt$focusableInNonTouchMode$1 extends n0 implements v3.l<InspectorInfo, r2> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableInteractionSource $interactionSource;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusableKt$focusableInNonTouchMode$1(boolean z4, MutableInteractionSource mutableInteractionSource) {
        super(1);
        this.$enabled = z4;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("focusableInNonTouchMode");
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.$enabled));
        inspectorInfo.getProperties().set("interactionSource", this.$interactionSource);
    }
}
