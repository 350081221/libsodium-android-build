package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "Landroidx/compose/animation/EnterExitState;", "invoke-YEO4UFw", "(Landroidx/compose/animation/EnterExitState;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode$measure$animSize$1 extends n0 implements l<EnterExitState, IntSize> {
    final /* synthetic */ long $target;
    final /* synthetic */ EnterExitTransitionModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$measure$animSize$1(EnterExitTransitionModifierNode enterExitTransitionModifierNode, long j5) {
        super(1);
        this.this$0 = enterExitTransitionModifierNode;
        this.$target = j5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ IntSize invoke(EnterExitState enterExitState) {
        return IntSize.m6206boximpl(m86invokeYEO4UFw(enterExitState));
    }

    /* renamed from: invoke-YEO4UFw, reason: not valid java name */
    public final long m86invokeYEO4UFw(@p4.l EnterExitState enterExitState) {
        return this.this$0.m83sizeByStateUzc_VyU(enterExitState, this.$target);
    }
}
