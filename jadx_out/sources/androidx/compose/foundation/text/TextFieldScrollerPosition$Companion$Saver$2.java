package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.l;

@i0(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "restored", "", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldScrollerPosition$Companion$Saver$2 extends n0 implements l<List<? extends Object>, TextFieldScrollerPosition> {
    public static final TextFieldScrollerPosition$Companion$Saver$2 INSTANCE = new TextFieldScrollerPosition$Companion$Saver$2();

    TextFieldScrollerPosition$Companion$Saver$2() {
        super(1);
    }

    @Override // v3.l
    @m
    public final TextFieldScrollerPosition invoke(@p4.l List<? extends Object> list) {
        Object obj = list.get(1);
        l0.n(obj, "null cannot be cast to non-null type kotlin.Boolean");
        Orientation orientation = ((Boolean) obj).booleanValue() ? Orientation.Vertical : Orientation.Horizontal;
        Object obj2 = list.get(0);
        l0.n(obj2, "null cannot be cast to non-null type kotlin.Float");
        return new TextFieldScrollerPosition(orientation, ((Float) obj2).floatValue());
    }
}
