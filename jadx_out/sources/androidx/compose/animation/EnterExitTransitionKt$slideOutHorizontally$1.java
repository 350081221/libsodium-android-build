package androidx.compose.animation;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class EnterExitTransitionKt$slideOutHorizontally$1 extends n0 implements l<Integer, Integer> {
    public static final EnterExitTransitionKt$slideOutHorizontally$1 INSTANCE = new EnterExitTransitionKt$slideOutHorizontally$1();

    EnterExitTransitionKt$slideOutHorizontally$1() {
        super(1);
    }

    @p4.l
    public final Integer invoke(int i5) {
        return Integer.valueOf((-i5) / 2);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }
}
