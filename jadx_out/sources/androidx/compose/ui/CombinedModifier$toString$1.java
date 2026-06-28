package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.p;

@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "acc", "element", "Landroidx/compose/ui/Modifier$Element;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class CombinedModifier$toString$1 extends n0 implements p<String, Modifier.Element, String> {
    public static final CombinedModifier$toString$1 INSTANCE = new CombinedModifier$toString$1();

    CombinedModifier$toString$1() {
        super(2);
    }

    @Override // v3.p
    @l
    public final String invoke(@l String str, @l Modifier.Element element) {
        if (str.length() == 0) {
            return element.toString();
        }
        return str + ", " + element;
    }
}
