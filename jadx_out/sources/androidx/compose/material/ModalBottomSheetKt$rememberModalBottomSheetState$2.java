package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.ui.unit.Density;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.a;
import v3.l;

@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/material/ModalBottomSheetState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ModalBottomSheetKt$rememberModalBottomSheetState$2 extends n0 implements a<ModalBottomSheetState> {
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ l<ModalBottomSheetValue, Boolean> $confirmValueChange;
    final /* synthetic */ Density $density;
    final /* synthetic */ ModalBottomSheetValue $initialValue;
    final /* synthetic */ boolean $skipHalfExpanded;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetKt$rememberModalBottomSheetState$2(ModalBottomSheetValue modalBottomSheetValue, Density density, AnimationSpec<Float> animationSpec, l<? super ModalBottomSheetValue, Boolean> lVar, boolean z4) {
        super(0);
        this.$initialValue = modalBottomSheetValue;
        this.$density = density;
        this.$animationSpec = animationSpec;
        this.$confirmValueChange = lVar;
        this.$skipHalfExpanded = z4;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final ModalBottomSheetState invoke() {
        return ModalBottomSheetKt.ModalBottomSheetState(this.$initialValue, this.$density, this.$animationSpec, this.$confirmValueChange, this.$skipHalfExpanded);
    }
}
