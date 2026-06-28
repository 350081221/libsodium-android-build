package androidx.compose.material;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Size;", "it", "Lkotlin/r2;", "invoke-uvyYCjk", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class TextFieldImplKt$CommonDecorationBox$3$1$1 extends n0 implements l<Size, r2> {
    final /* synthetic */ float $labelProgress;
    final /* synthetic */ MutableState<Size> $labelSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$1$1(float f5, MutableState<Size> mutableState) {
        super(1);
        this.$labelProgress = f5;
        this.$labelSize = mutableState;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Size size) {
        m1506invokeuvyYCjk(size.m3567unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-uvyYCjk, reason: not valid java name */
    public final void m1506invokeuvyYCjk(long j5) {
        boolean z4;
        float m3562getWidthimpl = Size.m3562getWidthimpl(j5) * this.$labelProgress;
        float m3559getHeightimpl = Size.m3559getHeightimpl(j5) * this.$labelProgress;
        boolean z5 = true;
        if (Size.m3562getWidthimpl(this.$labelSize.getValue().m3567unboximpl()) == m3562getWidthimpl) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (Size.m3559getHeightimpl(this.$labelSize.getValue().m3567unboximpl()) != m3559getHeightimpl) {
                z5 = false;
            }
            if (z5) {
                return;
            }
        }
        this.$labelSize.setValue(Size.m3550boximpl(SizeKt.Size(m3562getWidthimpl, m3559getHeightimpl)));
    }
}
