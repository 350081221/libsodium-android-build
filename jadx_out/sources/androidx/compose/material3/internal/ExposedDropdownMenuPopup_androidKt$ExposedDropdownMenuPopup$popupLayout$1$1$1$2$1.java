package androidx.compose.material3.internal;

import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "it", "Lkotlin/r2;", "invoke-ozmzZPI", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1$2$1 extends n0 implements l<IntSize, r2> {
    final /* synthetic */ PopupLayout $this_apply;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuPopup_androidKt$ExposedDropdownMenuPopup$popupLayout$1$1$1$2$1(PopupLayout popupLayout) {
        super(1);
        this.$this_apply = popupLayout;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(IntSize intSize) {
        m2613invokeozmzZPI(intSize.m6218unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-ozmzZPI, reason: not valid java name */
    public final void m2613invokeozmzZPI(long j5) {
        this.$this_apply.m2615setPopupContentSizefhxjrPA(IntSize.m6206boximpl(j5));
        this.$this_apply.updatePosition();
    }
}
