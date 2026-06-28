package androidx.compose.material;

import androidx.compose.ui.text.TextStyle;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.a;

@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/TextStyle;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextKt$LocalTextStyle$1 extends n0 implements a<TextStyle> {
    public static final TextKt$LocalTextStyle$1 INSTANCE = new TextKt$LocalTextStyle$1();

    TextKt$LocalTextStyle$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final TextStyle invoke() {
        return TypographyKt.getDefaultTextStyle();
    }
}
