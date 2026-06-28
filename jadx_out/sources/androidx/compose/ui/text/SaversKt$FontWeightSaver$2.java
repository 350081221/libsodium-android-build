package androidx.compose.ui.text;

import androidx.compose.ui.text.font.FontWeight;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/font/FontWeight;", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SaversKt$FontWeightSaver$2 extends n0 implements l<Object, FontWeight> {
    public static final SaversKt$FontWeightSaver$2 INSTANCE = new SaversKt$FontWeightSaver$2();

    SaversKt$FontWeightSaver$2() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.l
    @m
    public final FontWeight invoke(@p4.l Object obj) {
        l0.n(obj, "null cannot be cast to non-null type kotlin.Int");
        return new FontWeight(((Integer) obj).intValue());
    }
}
