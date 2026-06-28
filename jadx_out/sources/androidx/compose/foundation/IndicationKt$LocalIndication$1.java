package androidx.compose.foundation;

import kotlin.i0;
import kotlin.jvm.internal.n0;

@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/Indication;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class IndicationKt$LocalIndication$1 extends n0 implements v3.a<Indication> {
    public static final IndicationKt$LocalIndication$1 INSTANCE = new IndicationKt$LocalIndication$1();

    IndicationKt$LocalIndication$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @p4.l
    public final Indication invoke() {
        return DefaultDebugIndication.INSTANCE;
    }
}
