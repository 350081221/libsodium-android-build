package androidx.compose.foundation;

import kotlin.i0;
import kotlin.jvm.internal.n0;

@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/ScrollState;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollKt$rememberScrollState$1$1 extends n0 implements v3.a<ScrollState> {
    final /* synthetic */ int $initial;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollKt$rememberScrollState$1$1(int i5) {
        super(0);
        this.$initial = i5;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final ScrollState invoke() {
        return new ScrollState(this.$initial);
    }
}
