package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/animation/EnterExitState;", "invoke-Bjo55l4", "(Landroidx/compose/animation/EnterExitState;)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class EnterExitTransitionModifierNode$measure$offsetDelta$2 extends n0 implements l<EnterExitState, IntOffset> {
    final /* synthetic */ long $target;
    final /* synthetic */ EnterExitTransitionModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnterExitTransitionModifierNode$measure$offsetDelta$2(EnterExitTransitionModifierNode enterExitTransitionModifierNode, long j5) {
        super(1);
        this.this$0 = enterExitTransitionModifierNode;
        this.$target = j5;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ IntOffset invoke(EnterExitState enterExitState) {
        return IntOffset.m6163boximpl(m87invokeBjo55l4(enterExitState));
    }

    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
    public final long m87invokeBjo55l4(@p4.l EnterExitState enterExitState) {
        return this.this$0.m85targetOffsetByStateoFUgxo0(enterExitState, this.$target);
    }
}
