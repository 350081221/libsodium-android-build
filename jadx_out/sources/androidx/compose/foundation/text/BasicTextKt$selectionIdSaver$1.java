package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.l;
import p4.m;
import v3.p;

@i0(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "Landroidx/compose/runtime/saveable/SaverScope;", "it", "invoke", "(Landroidx/compose/runtime/saveable/SaverScope;J)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BasicTextKt$selectionIdSaver$1 extends n0 implements p<SaverScope, Long, Long> {
    final /* synthetic */ SelectionRegistrar $selectionRegistrar;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTextKt$selectionIdSaver$1(SelectionRegistrar selectionRegistrar) {
        super(2);
        this.$selectionRegistrar = selectionRegistrar;
    }

    @Override // v3.p
    public /* bridge */ /* synthetic */ Long invoke(SaverScope saverScope, Long l5) {
        return invoke(saverScope, l5.longValue());
    }

    @m
    public final Long invoke(@l SaverScope saverScope, long j5) {
        if (SelectionRegistrarKt.hasSelection(this.$selectionRegistrar, j5)) {
            return Long.valueOf(j5);
        }
        return null;
    }
}
