package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Dp;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/InspectorInfo;", "Lkotlin/r2;", "invoke", "(Landroidx/compose/ui/platform/InspectorInfo;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class PaddingKt$absolutePadding$1 extends n0 implements l<InspectorInfo, r2> {
    final /* synthetic */ float $bottom;
    final /* synthetic */ float $left;
    final /* synthetic */ float $right;
    final /* synthetic */ float $top;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingKt$absolutePadding$1(float f5, float f6, float f7, float f8) {
        super(1);
        this.$left = f5;
        this.$top = f6;
        this.$right = f7;
        this.$bottom = f8;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(InspectorInfo inspectorInfo) {
        invoke2(inspectorInfo);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l InspectorInfo inspectorInfo) {
        inspectorInfo.setName("absolutePadding");
        inspectorInfo.getProperties().set("left", Dp.m6042boximpl(this.$left));
        inspectorInfo.getProperties().set("top", Dp.m6042boximpl(this.$top));
        inspectorInfo.getProperties().set("right", Dp.m6042boximpl(this.$right));
        inspectorInfo.getProperties().set("bottom", Dp.m6042boximpl(this.$bottom));
    }
}
