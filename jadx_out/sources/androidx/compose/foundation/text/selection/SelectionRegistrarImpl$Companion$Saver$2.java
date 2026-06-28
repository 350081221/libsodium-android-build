package androidx.compose.foundation.text.selection;

import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SelectionRegistrarImpl$Companion$Saver$2 extends n0 implements l<Long, SelectionRegistrarImpl> {
    public static final SelectionRegistrarImpl$Companion$Saver$2 INSTANCE = new SelectionRegistrarImpl$Companion$Saver$2();

    SelectionRegistrarImpl$Companion$Saver$2() {
        super(1);
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ SelectionRegistrarImpl invoke(Long l5) {
        return invoke(l5.longValue());
    }

    @m
    public final SelectionRegistrarImpl invoke(long j5) {
        return new SelectionRegistrarImpl(j5, null);
    }
}
