package androidx.compose.foundation.text2.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.i0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.n0;
import kotlin.r2;
import v3.l;

/* JADX INFO: Access modifiers changed from: package-private */
@i0(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/geometry/Offset;", "it", "Lkotlin/r2;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class TextFieldSelectionState$detectCursorHandleDragGestures$2 extends n0 implements l<Offset, r2> {
    final /* synthetic */ k1.g $cursorDragDelta;
    final /* synthetic */ k1.g $cursorDragStart;
    final /* synthetic */ TextFieldSelectionState this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionState$detectCursorHandleDragGestures$2(k1.g gVar, TextFieldSelectionState textFieldSelectionState, k1.g gVar2) {
        super(1);
        this.$cursorDragStart = gVar;
        this.this$0 = textFieldSelectionState;
        this.$cursorDragDelta = gVar2;
    }

    @Override // v3.l
    public /* bridge */ /* synthetic */ r2 invoke(Offset offset) {
        m1181invokek4lQ0M(offset.m3503unboximpl());
        return r2.f19517a;
    }

    /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
    public final void m1181invokek4lQ0M(long j5) {
        this.$cursorDragStart.element = SelectionHandlesKt.m994getAdjustedCoordinatesk4lQ0M(this.this$0.getCursorRect().m3520getBottomCenterF1C5BW0());
        this.$cursorDragDelta.element = Offset.Companion.m3509getZeroF1C5BW0();
        this.this$0.setInTouchMode(true);
        this.this$0.markStartContentVisibleOffset();
        this.this$0.m1176updateHandleDraggingUv8p0NA(Handle.Cursor, this.$cursorDragStart.element);
    }
}
