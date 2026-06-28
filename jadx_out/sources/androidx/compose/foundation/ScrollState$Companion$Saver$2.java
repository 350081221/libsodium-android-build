package androidx.compose.foundation;

import kotlin.i0;
import kotlin.jvm.internal.n0;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/ScrollState;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ScrollState$Companion$Saver$2 extends n0 implements v3.l<Integer, ScrollState> {
    public static final ScrollState$Companion$Saver$2 INSTANCE = new ScrollState$Companion$Saver$2();

    ScrollState$Companion$Saver$2() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ ScrollState invoke(Integer num) {
        return invoke(num.intValue());
    }

    @p4.m
    public final ScrollState invoke(int i5) {
        return new ScrollState(i5);
    }
}
