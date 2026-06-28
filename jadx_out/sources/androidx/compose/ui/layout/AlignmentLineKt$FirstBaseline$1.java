package androidx.compose.ui.layout;

import kotlin.i0;
import kotlin.jvm.internal.h0;
import kotlin.math.b;
import p4.l;
import v3.p;

@i0(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
/* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends h0 implements p<Integer, Integer, Integer> {
    public static final AlignmentLineKt$FirstBaseline$1 INSTANCE = new AlignmentLineKt$FirstBaseline$1();

    AlignmentLineKt$FirstBaseline$1() {
        super(2, b.class, "min", "min(II)I", 1);
    }

    @l
    public final Integer invoke(int i5, int i6) {
        return Integer.valueOf(Math.min(i5, i6));
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ Integer invoke(Integer num, Integer num2) {
        return invoke(num.intValue(), num2.intValue());
    }
}
