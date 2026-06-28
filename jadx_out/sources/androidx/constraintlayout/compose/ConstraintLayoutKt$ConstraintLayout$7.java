package androidx.constraintlayout.compose;

import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ConstraintLayoutKt$ConstraintLayout$7 extends n0 implements l<SemanticsPropertyReceiver, r2> {
    final /* synthetic */ Measurer $measurer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintLayoutKt$ConstraintLayout$7(Measurer measurer) {
        super(1);
        this.$measurer = measurer;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        invoke2(semanticsPropertyReceiver);
        return r2.f19517a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@p4.l SemanticsPropertyReceiver semantics) {
        l0.p(semantics, "$this$semantics");
        ToolingUtilsKt.setDesignInfoProvider(semantics, this.$measurer);
    }
}
