package androidx.compose.ui.text;

import androidx.compose.ui.text.style.BaselineShift;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/style/BaselineShift;", "it", "", "invoke-jTk7eUs"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SaversKt$BaselineShiftSaver$2 extends n0 implements l<Object, BaselineShift> {
    public static final SaversKt$BaselineShiftSaver$2 INSTANCE = new SaversKt$BaselineShiftSaver$2();

    SaversKt$BaselineShiftSaver$2() {
        super(1);
    }

    @Override // v3.l
    @m
    /* renamed from: invoke-jTk7eUs, reason: not valid java name and merged with bridge method [inline-methods] */
    public final BaselineShift invoke(@p4.l Object obj) {
        l0.n(obj, "null cannot be cast to non-null type kotlin.Float");
        return BaselineShift.m5820boximpl(BaselineShift.m5821constructorimpl(((Float) obj).floatValue()));
    }
}
