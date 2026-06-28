package androidx.compose.ui.text;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/Color;", "it", "", "invoke-ijrfgN4"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SaversKt$ColorSaver$2 extends n0 implements l<Object, Color> {
    public static final SaversKt$ColorSaver$2 INSTANCE = new SaversKt$ColorSaver$2();

    SaversKt$ColorSaver$2() {
        super(1);
    }

    @Override // v3.l
    @m
    /* renamed from: invoke-ijrfgN4, reason: not valid java name and merged with bridge method [inline-methods] */
    public final Color invoke(@p4.l Object obj) {
        long Color;
        if (l0.g(obj, Boolean.FALSE)) {
            Color = Color.Companion.m3770getUnspecified0d7_KjU();
        } else {
            l0.n(obj, "null cannot be cast to non-null type kotlin.Int");
            Color = ColorKt.Color(((Integer) obj).intValue());
        }
        return Color.m3724boximpl(Color);
    }
}
