package androidx.compose.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.i0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.u1;
import p4.l;
import v3.p;
import v3.q;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "acc", "element", "Landroidx/compose/ui/Modifier$Element;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ComposedModifierKt$materialize$result$1 extends n0 implements p<Modifier, Modifier.Element, Modifier> {
    final /* synthetic */ Composer $this_materialize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposedModifierKt$materialize$result$1(Composer composer) {
        super(2);
        this.$this_materialize = composer;
    }

    @Override // v3.p
    @l
    public final Modifier invoke(@l Modifier modifier, @l Modifier.Element element) {
        boolean z4 = element instanceof ComposedModifier;
        Modifier modifier2 = element;
        if (z4) {
            q<Modifier, Composer, Integer, Modifier> factory = ((ComposedModifier) element).getFactory();
            l0.n(factory, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
            modifier2 = ComposedModifierKt.materializeModifier(this.$this_materialize, (Modifier) ((q) u1.q(factory, 3)).invoke(Modifier.Companion, this.$this_materialize, 0));
        }
        return modifier.then(modifier2);
    }
}
