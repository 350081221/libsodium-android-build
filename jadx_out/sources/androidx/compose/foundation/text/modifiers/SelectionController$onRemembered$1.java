package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.i0;
import kotlin.jvm.internal.n0;
import p4.m;
import v3.a;

@i0(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/LayoutCoordinates;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SelectionController$onRemembered$1 extends n0 implements a<LayoutCoordinates> {
    final /* synthetic */ SelectionController this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionController$onRemembered$1(SelectionController selectionController) {
        super(0);
        this.this$0 = selectionController;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // v3.a
    @m
    public final LayoutCoordinates invoke() {
        StaticTextSelectionParams staticTextSelectionParams;
        staticTextSelectionParams = this.this$0.params;
        return staticTextSelectionParams.getLayoutCoordinates();
    }
}
