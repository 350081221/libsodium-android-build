package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/Modifier$Element;", "invoke", "(Landroidx/compose/ui/Modifier$Element;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposedModifierKt$materialize$1 extends n0 implements l<Modifier.Element, Boolean> {
    public static final ComposedModifierKt$materialize$1 INSTANCE = new ComposedModifierKt$materialize$1();

    ComposedModifierKt$materialize$1() {
        super(1);
    }

    @Override // v3.l
    @p4.l
    public final Boolean invoke(@p4.l Modifier.Element element) {
        return Boolean.valueOf(!(element instanceof ComposedModifier));
    }
}
