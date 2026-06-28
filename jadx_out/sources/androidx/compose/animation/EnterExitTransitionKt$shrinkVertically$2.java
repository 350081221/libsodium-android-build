package androidx.compose.animation;

import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntSize;", "it", "invoke-mzRDjE0", "(J)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class EnterExitTransitionKt$shrinkVertically$2 extends n0 implements l<IntSize, IntSize> {
    final /* synthetic */ l<Integer, Integer> $targetHeight;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EnterExitTransitionKt$shrinkVertically$2(l<? super Integer, Integer> lVar) {
        super(1);
        this.$targetHeight = lVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
        return IntSize.m6206boximpl(m76invokemzRDjE0(intSize.m6218unboximpl()));
    }

    /* renamed from: invoke-mzRDjE0, reason: not valid java name */
    public final long m76invokemzRDjE0(long j5) {
        return IntSizeKt.IntSize(IntSize.m6214getWidthimpl(j5), this.$targetHeight.invoke(Integer.valueOf(IntSize.m6213getHeightimpl(j5))).intValue());
    }
}
