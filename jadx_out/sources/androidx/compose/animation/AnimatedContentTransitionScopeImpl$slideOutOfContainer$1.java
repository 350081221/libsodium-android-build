package androidx.compose.animation;

import androidx.compose.runtime.State;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "S", "it", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$slideOutOfContainer$1 extends n0 implements l<Integer, Integer> {
    final /* synthetic */ l<Integer, Integer> $targetOffset;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedContentTransitionScopeImpl$slideOutOfContainer$1(AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, l<? super Integer, Integer> lVar) {
        super(1);
        this.this$0 = animatedContentTransitionScopeImpl;
        this.$targetOffset = lVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }

    @p4.l
    public final Integer invoke(int i5) {
        long m50calculateOffsetemnUabE;
        State state = (State) this.this$0.getTargetSizeMap$animation_release().get(this.this$0.getTransition$animation_release().getTargetState());
        long m6218unboximpl = state != null ? ((IntSize) state.getValue()).m6218unboximpl() : IntSize.Companion.m6219getZeroYbymL2g();
        l<Integer, Integer> lVar = this.$targetOffset;
        m50calculateOffsetemnUabE = this.this$0.m50calculateOffsetemnUabE(IntSizeKt.IntSize(i5, i5), m6218unboximpl);
        return lVar.invoke(Integer.valueOf((-IntOffset.m6172getXimpl(m50calculateOffsetemnUabE)) - i5));
    }
}
