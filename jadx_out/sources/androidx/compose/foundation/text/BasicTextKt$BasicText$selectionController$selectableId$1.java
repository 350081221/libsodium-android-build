package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import v3.a;

@i0(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BasicTextKt$BasicText$selectionController$selectableId$1 extends n0 implements a<Long> {
    final /* synthetic */ SelectionRegistrar $selectionRegistrar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$BasicText$selectionController$selectableId$1(SelectionRegistrar selectionRegistrar) {
        super(0);
        this.$selectionRegistrar = selectionRegistrar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @l
    public final Long invoke() {
        return Long.valueOf(this.$selectionRegistrar.nextSelectableId());
    }
}
