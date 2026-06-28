package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "S", "it", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AnimatedContentTransitionScopeImpl$slideIntoContainer$3 extends n0 implements l<Integer, Integer> {
    final /* synthetic */ l<Integer, Integer> $initialOffset;
    final /* synthetic */ AnimatedContentTransitionScopeImpl<S> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedContentTransitionScopeImpl$slideIntoContainer$3(l<? super Integer, Integer> lVar, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
        super(1);
        this.$initialOffset = lVar;
        this.this$0 = animatedContentTransitionScopeImpl;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }

    @p4.l
    public final Integer invoke(int i5) {
        long m51getCurrentSizeYbymL2g;
        long m51getCurrentSizeYbymL2g2;
        long m50calculateOffsetemnUabE;
        l<Integer, Integer> lVar = this.$initialOffset;
        m51getCurrentSizeYbymL2g = this.this$0.m51getCurrentSizeYbymL2g();
        int m6213getHeightimpl = IntSize.m6213getHeightimpl(m51getCurrentSizeYbymL2g);
        AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.this$0;
        long IntSize = IntSizeKt.IntSize(i5, i5);
        m51getCurrentSizeYbymL2g2 = this.this$0.m51getCurrentSizeYbymL2g();
        m50calculateOffsetemnUabE = animatedContentTransitionScopeImpl.m50calculateOffsetemnUabE(IntSize, m51getCurrentSizeYbymL2g2);
        return lVar.invoke(Integer.valueOf(m6213getHeightimpl - IntOffset.m6173getYimpl(m50calculateOffsetemnUabE)));
    }
}
