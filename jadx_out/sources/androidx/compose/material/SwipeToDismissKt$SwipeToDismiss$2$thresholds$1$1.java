package androidx.compose.material;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import v3.l;
import v3.p;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/material/ThresholdConfig;", TypedValues.TransitionType.S_FROM, "Landroidx/compose/material/DismissValue;", TypedValues.TransitionType.S_TO, "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1 extends n0 implements p<DismissValue, DismissValue, ThresholdConfig> {
    final /* synthetic */ l<DismissDirection, ThresholdConfig> $dismissThresholds;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeToDismissKt$SwipeToDismiss$2$thresholds$1$1(l<? super DismissDirection, ? extends ThresholdConfig> lVar) {
        super(2);
        this.$dismissThresholds = lVar;
    }

    @Override // v3.p
    @p4.l
    public final ThresholdConfig invoke(@p4.l DismissValue dismissValue, @p4.l DismissValue dismissValue2) {
        DismissDirection dismissDirection;
        l<DismissDirection, ThresholdConfig> lVar = this.$dismissThresholds;
        dismissDirection = SwipeToDismissKt.getDismissDirection(dismissValue, dismissValue2);
        l0.m(dismissDirection);
        return lVar.invoke(dismissDirection);
    }
}
