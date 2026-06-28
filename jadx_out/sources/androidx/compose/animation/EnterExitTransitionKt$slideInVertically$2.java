package androidx.compose.animation;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/IntOffset;", "it", "Landroidx/compose/ui/unit/IntSize;", "invoke-mHKZG7I", "(J)J"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EnterExitTransitionKt$slideInVertically$2 extends n0 implements l<IntSize, IntOffset> {
    final /* synthetic */ l<Integer, Integer> $initialOffsetY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EnterExitTransitionKt$slideInVertically$2(l<? super Integer, Integer> lVar) {
        super(1);
        this.$initialOffsetY = lVar;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
        return IntOffset.m6163boximpl(m78invokemHKZG7I(intSize.m6218unboximpl()));
    }

    /* renamed from: invoke-mHKZG7I, reason: not valid java name */
    public final long m78invokemHKZG7I(long j5) {
        return IntOffsetKt.IntOffset(0, this.$initialOffsetY.invoke(Integer.valueOf(IntSize.m6213getHeightimpl(j5))).intValue());
    }
}
